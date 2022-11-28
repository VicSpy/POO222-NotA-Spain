package module_spain;

import fifa.NationalTeamStats;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Richard Hass
 */
public class SpainStats implements NationalTeamStats {

    private Map<Integer, Integer> callsToPlayers = new HashMap<>();

    private Integer methodsCalls = 0;

    @Override
    public int getHowManyQuestions() {
        return methodsCalls;
    }

    @Override
    public String getHowManyCallsToPlayer(int number) {
        Integer calls = callsToPlayers.get(number);
        return calls == null ? "" : calls.toString();
    }

    public void addMethodCall() {
        this.methodsCalls++;
    }

    public void addCallPlayer(int playerNumber) {
        int calls = 0;

        if (callsToPlayers.containsKey(playerNumber)) {
            calls = callsToPlayers.get(playerNumber);
        }

        callsToPlayers.put(playerNumber, ++calls);
        addMethodCall();
    }

}
