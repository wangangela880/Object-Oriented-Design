package problem1;

import java.util.Arrays;

public class Dancer extends Artist{
  private String[] movies;
  private String[] series;
  private String[] multimedia;

  public Dancer(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.movies = new String[5];
    this.series = new String[5];
    this.multimedia = new String[5];
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Dancer newDancer = new Dancer(this.name,this.age,this.numAwards);
    newDancer.setAwards(newAwardArray);
    return newDancer;
  }

  @Override
  public String toString(){
    return "Dancer{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_one","Puppy_one");
    IArtist gizmo_one;
    gizmo_one = new Dancer(gizmoName,2,0);
    System.out.println(gizmo_one.calculateLoadFactor());
    System.out.println(gizmo_one.toString());
    gizmo_one = gizmo_one.receiveAward("1");
    System.out.println(gizmo_one.toString());
    System.out.println(gizmo_one.calculateLoadFactor());
    gizmo_one = gizmo_one.receiveAward("2");
    System.out.println(gizmo_one.toString());
    gizmo_one = gizmo_one.receiveAward("3");
    System.out.println(gizmo_one.toString());
    gizmo_one = gizmo_one.receiveAward("4");
    System.out.println(gizmo_one.calculateLoadFactor());
    System.out.println(gizmo_one.toString());
    gizmo_one = gizmo_one.receiveAward("5");
    System.out.println(gizmo_one.toString());
    gizmo_one = gizmo_one.receiveAward("6");
    System.out.println(gizmo_one.toString());
    System.out.println(gizmo_one.calculateLoadFactor());
  }
}
