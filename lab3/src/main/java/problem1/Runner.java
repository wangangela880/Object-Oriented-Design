package problem1;

public class Runner extends Athlete {


  private Double best_5k_time;
  private Double best_half_time;
  private String running;

  public Runner(Name athletesName, Double height, Double weight, String league,Double best_5k, Double best_half,String run){
    super(athletesName, height, weight, league);
    this.best_5k_time = best_5k;
    this.best_half_time = best_half;
    this.running = run;
  }

  public Double getBest_5k_time() {
    return best_5k_time;
  }

  public Double getBest_half_time() {
    return best_half_time;
  }

  public String getRunning() {
    return running;
  }
}
