package problem1;

public abstract class Artist implements IArtist{

  private static final double LOAD_FACTOR = 1.00;
  public Name name;
  public Integer age;
  public String[] genres;
  public String[] awards;
  public Integer numAwards;

  private final Integer MIN_AGE = 0;
  private final Integer MAX_AGE = 128;
  public Artist(Name name, Integer age, Integer numAwards)
      throws IllegalAgeException {
    this.name = name;
    this.validateAge(age);
    this.genres = new String[5];
    this.awards = new String[10];
    this.numAwards = numAwards;
  }

  private void validateAge(Integer age) throws IllegalAgeException{
    if(age < this.MIN_AGE || age > this.MAX_AGE) {
      throw new IllegalAgeException("Not valid age");
    }else{
      this.age = age;
    }
  }
  public boolean calculateLoadFactor(){
    Double m = Double.valueOf(this.numAwards);
    Double n = Double.valueOf(this.awards.length);
    if(m/n >= this.LOAD_FACTOR){
      return true;
    }else{
      return false;
    }
  }
  protected String[] updateAwards(String award){
    String[] newAwardsArray;
    if(this.numAwards.equals(0)){
      newAwardsArray = new String[5];
      newAwardsArray[0] = award;
      this.numAwards++;
      return newAwardsArray;
    }else if(this.calculateLoadFactor()){
      newAwardsArray = new String[this.awards.length + 10];
    }else{
      newAwardsArray = new String[this.awards.length];
    }

    int i;
    for(i = 0;i<this.numAwards;i++){
      newAwardsArray[i] = this.awards[i];
    }
    newAwardsArray[i] = award;
    this.numAwards++;
    return newAwardsArray;
  }

  protected void updateAwardMuntable(String award){
    String[] newAwardsArray;
    if(this.numAwards.equals(0)){
      newAwardsArray = new String[5];
      newAwardsArray[0] = award;
      this.numAwards++;
      return;
    }

    if(this.calculateLoadFactor()){
      newAwardsArray = new String[this.awards.length + 10];
      int i;
      for(i = 0;i<this.numAwards;i++){
        newAwardsArray[i] = this.awards[i];
      }
      newAwardsArray[i] = award;
      this.numAwards++;
      this.awards = newAwardsArray;

    }

    this.awards[this.numAwards] = award;
    this.numAwards++;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String[] getGenres() {
    return genres;
  }

  public void setGenres(String[] genres) {
    this.genres = genres;
  }

  public String[] getAwards() {
    return awards;
  }

  public void setAwards(String[] awards) {
    this.awards = awards;
  }

  public Integer getNumAwards() {
    return numAwards;
  }

  public void setNumAwards(Integer numAwards) {
    this.numAwards = numAwards;
  }


  @Override
  public IArtist receiveAward(String award) throws IllegalAgeException {
    return null;
  }
}
