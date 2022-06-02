package problem1;

import java.util.Arrays;

public class Musician extends Artist{
  private String record_company;
  private String last_album;
  public Musician(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.record_company = "";
    this.last_album = "";
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Musician newMusician = new Musician(this.name,this.age,this.numAwards);
    newMusician.setAwards(newAwardArray);
    return newMusician;
  }

  @Override
  public String toString(){
    return "Musician{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_three","Puppy_three");
    IArtist gizmo_five;
    gizmo_five = new Musician(gizmoName,2,0);
    System.out.println(gizmo_five.calculateLoadFactor());
    System.out.println(gizmo_five.toString());
    gizmo_five = gizmo_five.receiveAward("1");
    System.out.println(gizmo_five.toString());
    System.out.println(gizmo_five.calculateLoadFactor());
    gizmo_five = gizmo_five.receiveAward("2");
    System.out.println(gizmo_five.toString());
    gizmo_five = gizmo_five.receiveAward("3");
    System.out.println(gizmo_five.toString());
    gizmo_five = gizmo_five.receiveAward("4");
    System.out.println(gizmo_five.calculateLoadFactor());
    System.out.println(gizmo_five.toString());
    gizmo_five = gizmo_five.receiveAward("5");
    System.out.println(gizmo_five.toString());
    gizmo_five = gizmo_five.receiveAward("6");
    System.out.println(gizmo_five.toString());
    System.out.println(gizmo_five.calculateLoadFactor());
  }
}
