public class PlayerRecord {

    private String name;
    private String position;
    private String teamName;
    private int gamePlayed;
    private int goalScored;
    private int assist;
    private int penaltyMin;
    private int shotGoals;
    private int gameWinGoal;

    public PlayerRecord(String name, String position, String teamName, int gamePlayed, int goalScored, int assist, int penaltyMin, int shotGoals, int gameWinGoal) {
        this.name = name;
        this.position = position;
        this.teamName = teamName;
        this.gamePlayed = gamePlayed;
        this.goalScored = goalScored;
        this.assist = assist;
        this.penaltyMin = penaltyMin;
        this.shotGoals = shotGoals;
        this.gameWinGoal = gameWinGoal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(int gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getPenaltyMin() {
        return penaltyMin;
    }

    public void setPenaltyMin(int penaltyMin) {
        this.penaltyMin = penaltyMin;
    }

    public int getShotGoals() {
        return shotGoals;
    }

    public void setShotGoals(int shotGoals) {
        this.shotGoals = shotGoals;
    }

    public int getGameWinGoal() {
        return gameWinGoal;
    }

    public void setGameWinGoal(int gameWinGoal) {
        this.gameWinGoal = gameWinGoal;
    }

    public int getPoints(){
        return assist+goalScored;
    }

    @Override
    public String toString() {
        return "PlayerRecord{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", teamName='" + teamName + '\'' +
                ", gamePlayed=" + gamePlayed +
                ", goalScored=" + goalScored +
                ", assist=" + assist +
                ", penaltyMin=" + penaltyMin +
                ", shotGoals=" + shotGoals +
                ", gameWinGoal=" + gameWinGoal +
                '}';
    }
}
