package module_spain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @author Bruno Ferrari Vincensi
 */
public class Spain implements NationalTeamInfos {

    private SpainStats spainStats = new SpainStats();

    private SpainDAO spainDAO;

    public SpainDAO getSpainDAO() {
        if (spainDAO == null) {
            spainDAO = SpainDAO.getInstance();
        }
        return spainDAO;
    }

    private int getAgeByBirthDate(LocalDate birthDate) {
        spainStats.addMethodCall();
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    @Override
    public int getHowManyMembers() {
        spainStats.addMethodCall();
        return getSpainDAO().getPeopleSize();
    }

    @Override
    public int getOldestPlayer() {
        spainStats.addMethodCall();
        Optional<Player> player = getSpainDAO().getPlayers().stream().sorted((o1, o2) -> Integer.compare(getAgeByBirthDate(o2.getBirthDate()), getAgeByBirthDate(o1.getBirthDate()))).findFirst();
        return player.map(Player::getNumber).orElse(0);
    }

    @Override
    public int getYoungestPlayer() {
        spainStats.addMethodCall();
        Optional<Player> player = getSpainDAO().getPlayers().stream().sorted(Comparator.comparingInt(p -> getAgeByBirthDate(p.getBirthDate()))).findFirst();
        return player.map(Player::getNumber).orElse(0);
    }

    @Override
    public double getAverageAge() {
        spainStats.addMethodCall();

        Locale.setDefault(Locale.US);

        DecimalFormat fmt = new DecimalFormat("0.00");
        double averageAge = getSpainDAO().getPlayers().stream().mapToInt(p -> getAgeByBirthDate(p.getBirthDate())).average().orElse(0);
        return Double.parseDouble(fmt.format(averageAge));
    }

    @Override
    public String getPlayer(int number) {
        Optional<Player> playerOptional = getSpainDAO().getPlayers().stream().filter(p -> p.getNumber() == number).findFirst();

        if (playerOptional.isPresent()) {
            Player player = playerOptional.get();

            spainStats.addCallPlayer(number);

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
            Gson gson = gsonBuilder.setPrettyPrinting().create();
            return gson.toJson(player);
        }
        throw new RuntimeException("Player " + number + " doesn't exists");
    }

    @Override
    public String getPressOfficerContacts() {
        spainStats.addMethodCall();
        return new Gson().toJson(getSpainDAO().getPressOfficers());
    }

    @Override
    public String getCountryName() {
        spainStats.addMethodCall();
        return "Spain";
    }

    @Override
    public Image getFlagImage() {
        spainStats.addMethodCall();
        try {
            URL url = getClass().getResource("/images/spain_flag.png");
            return ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Path getTechnicalCommittee() {
        spainStats.addMethodCall();

        File file = new File("technical_committees.json");

        try{
            JsonWriter jsonWriter = new Gson().newJsonWriter(new BufferedWriter(new FileWriter(file)));
            jsonWriter.jsonValue(new Gson().toJson(getSpainDAO().getTechnicalCommittees()));
            jsonWriter.close();

            return Path.of(file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public NationalTeamStats getStatsResponsible() {
        return spainStats;
    }

}
