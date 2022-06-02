package problem1;

import java.util.Arrays;

public class Painters extends Artist{
  private String[] exhibits;
  public Painters(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.exhibits = new String[5];
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Painters newPainters = new Painters(this.name,this.age,this.numAwards);
    newPainters.setAwards(newAwardArray);
    return newPainters;
  }

  @Override
  public String toString(){
    return "Painter{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_three","Puppy_three");
    IArtist gizmo_three;
    gizmo_three = new Painters(gizmoName,2,0);
    System.out.println(gizmo_three.calculateLoadFactor());
    System.out.println(gizmo_three.toString());
    gizmo_three = gizmo_three.receiveAward("1");
    System.out.println(gizmo_three.toString());
    System.out.println(gizmo_three.calculateLoadFactor());
    gizmo_three = gizmo_three.receiveAward("2");
    System.out.println(gizmo_three.toString());
    gizmo_three = gizmo_three.receiveAward("3");
    System.out.println(gizmo_three.toString());
    gizmo_three = gizmo_three.receiveAward("4");
    System.out.println(gizmo_three.calculateLoadFactor());
    System.out.println(gizmo_three.toString());
    gizmo_three = gizmo_three.receiveAward("5");
    System.out.println(gizmo_three.toString());
    gizmo_three = gizmo_three.receiveAward("6");
    System.out.println(gizmo_three.toString());
    System.out.println(gizmo_three.calculateLoadFactor());
  }
}
