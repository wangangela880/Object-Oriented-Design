package problem1;

import java.util.Arrays;

public class Photographers extends Artist{
  private String[] exhibits;
  public Photographers(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.exhibits = new String[5];
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Photographers newPhotographers = new Photographers(this.name,this.age,this.numAwards);
    newPhotographers.setAwards(newAwardArray);
    return newPhotographers;
  }

  @Override
  public String toString(){
    return "Photographer{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_four","Puppy_four");
    IArtist gizmo_four;
    gizmo_four = new Photographers(gizmoName,2,0);
    System.out.println(gizmo_four.calculateLoadFactor());
    System.out.println(gizmo_four.toString());
    gizmo_four = gizmo_four.receiveAward("1");
    System.out.println(gizmo_four.toString());
    System.out.println(gizmo_four.calculateLoadFactor());
    gizmo_four = gizmo_four.receiveAward("2");
    System.out.println(gizmo_four.toString());
    gizmo_four = gizmo_four.receiveAward("3");
    System.out.println(gizmo_four.toString());
    gizmo_four = gizmo_four.receiveAward("4");
    System.out.println(gizmo_four.calculateLoadFactor());
    System.out.println(gizmo_four.toString());
    gizmo_four = gizmo_four.receiveAward("5");
    System.out.println(gizmo_four.toString());
    gizmo_four = gizmo_four.receiveAward("6");
    System.out.println(gizmo_four.toString());
    System.out.println(gizmo_four.calculateLoadFactor());
  }
}
