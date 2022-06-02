package problem1;

import java.util.Arrays;

public class Filmmakers extends Artist{
  private String[] movies;
  private String[] series;
  private String[] multimedia;

  public Filmmakers(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.movies = new String[5];
    this.series = new String[5];
    this.multimedia = new String[5];
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Filmmakers newFilmmakers = new Filmmakers(this.name,this.age,this.numAwards);
    newFilmmakers.setAwards(newAwardArray);
    return newFilmmakers;
  }

  @Override
  public String toString(){
    return "Filmmaker{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_two","Puppy_two");
    IArtist gizmo_two;
    gizmo_two = new Filmmakers(gizmoName,2,0);
    System.out.println(gizmo_two.calculateLoadFactor());
    System.out.println(gizmo_two.toString());
    gizmo_two = gizmo_two.receiveAward("1");
    System.out.println(gizmo_two.toString());
    System.out.println(gizmo_two.calculateLoadFactor());
    gizmo_two = gizmo_two.receiveAward("2");
    System.out.println(gizmo_two.toString());
    gizmo_two = gizmo_two.receiveAward("3");
    System.out.println(gizmo_two.toString());
    gizmo_two = gizmo_two.receiveAward("4");
    System.out.println(gizmo_two.calculateLoadFactor());
    System.out.println(gizmo_two.toString());
    gizmo_two = gizmo_two.receiveAward("5");
    System.out.println(gizmo_two.toString());
    gizmo_two = gizmo_two.receiveAward("6");
    System.out.println(gizmo_two.toString());
    System.out.println(gizmo_two.calculateLoadFactor());
  }

}
