package problem1;

import java.util.Arrays;

public class Poet extends Artist{
  private String publish_company;
  private String last_collection;
  public Poet(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    super(name, age, numAwards);
    this.publish_company = "";
    this.last_collection = "";
  }

  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException{
    String[] newAwardArray = this.updateAwards(award);
    Poet newPoet = new Poet(this.name,this.age,this.numAwards);
    newPoet.setAwards(newAwardArray);
    return newPoet;
  }

  @Override
  public String toString(){
    return "Poet{" +
        "name=" + name +
        ", age=" + age +
        ". genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        ", numAwards=" + numAwards +
        "}";
  }

  public static void main(String[] args) throws IllegalAgeException{
    Name gizmoName = new Name("Gizmo_three","Puppy_three");
    IArtist gizmo_six;
    gizmo_six = new Poet(gizmoName,2,0);
    System.out.println(gizmo_six.calculateLoadFactor());
    System.out.println(gizmo_six.toString());
    gizmo_six = gizmo_six.receiveAward("1");
    System.out.println(gizmo_six.toString());
    System.out.println(gizmo_six.calculateLoadFactor());
    gizmo_six = gizmo_six.receiveAward("2");
    System.out.println(gizmo_six.toString());
    gizmo_six = gizmo_six.receiveAward("3");
    System.out.println(gizmo_six.toString());
    gizmo_six = gizmo_six.receiveAward("4");
    System.out.println(gizmo_six.calculateLoadFactor());
    System.out.println(gizmo_six.toString());
    gizmo_six = gizmo_six.receiveAward("5");
    System.out.println(gizmo_six.toString());
    gizmo_six = gizmo_six.receiveAward("6");
    System.out.println(gizmo_six.toString());
    System.out.println(gizmo_six.calculateLoadFactor());
  }

}
