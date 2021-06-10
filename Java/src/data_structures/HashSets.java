package data_structures;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        System.out.println("Creating and inserting values into a HashSet");
        HashSet<String> nbaTeams = new HashSet<>();
        nbaTeams.add("Celtics");
        nbaTeams.add("Lakers");
        nbaTeams.add("Bulls");
        nbaTeams.add("Knicks");
        System.out.println("nbaTeams: " + nbaTeams);

        System.out.println();

        System.out.println("Check whether or not the set contians a value");
        System.out.println("nbaTeams.contains(\"Celtics\"): " + nbaTeams.contains("Celtics"));
        System.out.println("nbaTeams.contains(\"Warriors\"): " + nbaTeams.contains("Warriors"));

        System.out.println();

        System.out.println("Removing items from a set");
        nbaTeams.remove("Lakers");
        System.out.println("nbaTeams: " + nbaTeams);
    }
}
