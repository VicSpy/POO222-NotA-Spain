package modules_espanha;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Ferrari Vincensi
 */
public class Spain implements NationalTeamInfos {

    List<? extends Person> people = new ArrayList<>();

    @Override
    public int getHowManyMembers() {
        return 0;
    }

    @Override
    public int getOldestPlayer() {
        return 0;
    }

    @Override
    public int getYoungestPlayer() {
        return 0;
    }

    @Override
    public double getAverageAge() {
        return 0;
    }

    @Override
    public String getPlayer(int number) {
        return null;
    }

    @Override
    public String getPressOfficerContacts() {
        return null;
    }

    @Override
    public String getCountryName() {
        return null;
    }

    @Override
    public Image getFlagImage() {
        return null;
    }

    @Override
    public Path getTechnicalCommittee() {
        return null;
    }

    @Override
    public NationalTeamStats getStatsResponsible() {
        return null;
    }
}
