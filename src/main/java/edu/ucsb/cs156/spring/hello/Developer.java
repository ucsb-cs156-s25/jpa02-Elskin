package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Xinyan Z";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "Elskin";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-02");
        team.addMember("Mujia C");
        team.addMember("Ayala W");
        team.addMember("Xinyan Z");
        team.addMember("Evania C");
        team.addMember("Roy R");
        team.addMember("Shiyuan W");
        return team;
    }
}
