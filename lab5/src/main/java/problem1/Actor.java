package problem1;

import java.util.Arrays;

public class Actor extends Artist{
  private String[] movies;
  private String[] series;
  private String[] multimedia;

  public Actor(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.movies = new String[5];
    this.series = new String[5];
    this.multimedia = new String[5];
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Actor newActor = new Actor(this.name,this.age,this.numAwards);
    newActor.setAwards(newAwardArray);
    return newActor;
  }

  @Override
  public String toString(){
    return "Actor{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo","Puppy");
    IArtist gizmo;
    gizmo = new Actor(gizmoName,2,0);
    System.out.println(gizmo.calculateLoadFactor());
    System.out.println(gizmo.toString());
    gizmo = gizmo.receiveAward("1");
    System.out.println(gizmo.toString());
    System.out.println(gizmo.calculateLoadFactor());
    gizmo = gizmo.receiveAward("2");
    System.out.println(gizmo.toString());
    gizmo = gizmo.receiveAward("3");
    System.out.println(gizmo.toString());
    gizmo = gizmo.receiveAward("4");
    System.out.println(gizmo.calculateLoadFactor());
    System.out.println(gizmo.toString());
    gizmo = gizmo.receiveAward("5");
    System.out.println(gizmo.toString());
    gizmo = gizmo.receiveAward("6");
    System.out.println(gizmo.toString());
    System.out.println(gizmo.calculateLoadFactor());
  }
}
