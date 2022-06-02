package problem1;

public interface IArtist {
  IArtist receiveAward(String award) throws IllegalAgeException;

  boolean calculateLoadFactor();
}
