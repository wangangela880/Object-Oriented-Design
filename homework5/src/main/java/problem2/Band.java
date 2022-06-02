package problem2;

public class Band {
  private String bandName;
  private RecordingArtist[] members;

  /**
   * @param bandName
   * @param members
   */
  public Band(String bandName, RecordingArtist[] members) {
    this.bandName = bandName;
    this.members = members;
  }
}
