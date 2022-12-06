package module_spain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Ferrari Vincensi
 */
public class SpainDAO {

    private static SpainDAO INSTANCE = new SpainDAO();

    private List<Player> players = new ArrayList<>();
    private List<PressOfficer> pressOfficers = new ArrayList<>();
    private List<TechnicalCommittee> technicalCommittees = new ArrayList<>();

    private SpainDAO() {
        players.add(new Player("Unai Simón", 1, "Simón", 190.0 , 88.0,
                LocalDate.of(1997, 11, 6), "Goalkeeper", "Athletic Bilbao"));

        players.add(new Player("Dani Carvajal", 20, "Carvajal", 173.0 , 74.0,
                LocalDate.of(1992, 1, 11), "Right side", "Real Madrid"));

        players.add(new Player("Aymeric Laporte", 24, "Aymeric", 190.0 , 86.0,
                LocalDate.of(1994, 5, 27), "Defender", "Athletic Bilbao"));

        players.add(new Player("Pau Torres", 4, "Pau Torres", 191.0 , 80.0,
                LocalDate.of(1997, 11, 6), "Defender", "Villarreal Club"));

        players.add(new Player("Jordi Alba", 18, "Jordi Alba", 170.0 , 68.0,
                LocalDate.of(1997, 11, 6), "Left Side", "Athletic Bilbao"));

        players.add(new Player("Sergio Busquets", 5, "Simón", 190.0 , 88.0,
                LocalDate.of(1989, 3, 21), "Volant", "Barcelona"));

        players.add(new Player("Rodrigo", 19, "Rodrigo", 180.0 , 74.0,
                LocalDate.of(1991, 3, 6), "Volant", "Leeds United"));

        players.add(new Player("Pedro González", 26, "Pedri", 174.0 , 60.0,
                LocalDate.of(2002, 11, 25), "Midfield", "Barcelona"));

        players.add(new Player("Alvaro Morata", 19, "Alvaro", 190.0 , 84.0,
                LocalDate.of(1992, 10, 23), "Attacker", "Athletic de Madrid"));

        players.add(new Player("Marco Asensio", 11, "Asensio", 182.0 , 76.0,
                LocalDate.of(1996, 1, 21), "right wing", "Athletic Bilbao"));

        players.add(new Player("Ansu Fati", 25, "Ansu Fati", 178.0 , 66.0,
                LocalDate.of(2002, 10, 31), "Left wing", "Barcelona"));

        technicalCommittees.add(new TechnicalCommittee("Luis Enrique", "Luis Enrique", "Técnico", 45));
        technicalCommittees.add(new TechnicalCommittee("Rafael Pol", "Rafael Pol", "Treinador Adjunto", 33));
        technicalCommittees.add(new TechnicalCommittee("Juanjo González", "Juanjo", "Treinador de Goleiros", 36));

        pressOfficers.add(new PressOfficer("Luis Rubiales", "23233434", "43435656", "luisrubiales@gmail.com"));
        pressOfficers.add(new PressOfficer("Javier Tebas", "12123434", "98785634", "javiertebas@gmail.com"));
    }

    public static SpainDAO getInstance() {
        return INSTANCE;
    }


    public int getPeopleSize() {
        return getPlayers().size() + getPressOfficers().size() + getTechnicalCommittees().size();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<PressOfficer> getPressOfficers() {
        return pressOfficers;
    }

    public List<TechnicalCommittee> getTechnicalCommittees() {
        return technicalCommittees;
    }

}
