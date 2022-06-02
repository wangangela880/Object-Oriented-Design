package problem1;

public class Baseballplayer extends Athlete {

  private String team_name;
  private  Double ave_batting;
  private  Integer home_run;
  public Baseballplayer(Name athletesName, Double height, Double weight, String league,String team,Double batting,Integer run){
    super(athletesName, height, weight, league);
    this.team_name = team;
    this.ave_batting = batting;
    this.home_run = run;
  }

  public String getTeam_name() {
    return team_name;
  }

  public Double getAve_batting() {
    return ave_batting;
  }

  public Integer getHome_run() {
    return home_run;
  }

}
