package problem1;

import java.util.Objects;

public class CourseCatalogImplementation implements CourseCatalog{
  private Course course[];
  private int currentIndex;
  private int maxLength;


  /**
   * @param course
   * @param current
   * @param maxLength
   */
  public CourseCatalogImplementation(Course[] course, int current,int maxLength) {
    this.course = course;
    this.currentIndex = current;
    this.maxLength = maxLength;
  }

  /**
   * @return
   */
  public Course[] getCourse() {
    return this.course;
  }

  /**
   * @return
   */
  public int getCurrentIndex() {
    return this.currentIndex;
  }

  /**
   * @param c
   */
  public void append(Course c){
    if(this.currentIndex == this.maxLength-1){
      Course newCourse[] = new Course[this.maxLength * 2];
      for(int i = 0;i < this.maxLength;i++){
        newCourse[i] = this.course[i];
      }
      this.maxLength = this.maxLength * 2;
      this.course = newCourse;
    }else{
      this.course[this.currentIndex++] = c;
    }
  }

  /**
   * @param c
   * @throws CourseNotFoundException
   */
  public void remove(Course c) throws CourseNotFoundException{
    for(int i = 0;i<this.maxLength;i++){
      if(this.course[i] == null){
        continue;
      }
      if(this.course[i].equals(c)){
        for(int j = i;j<this.currentIndex;j++){
          this.course[j] = this.course[j+1];
        }
        this.currentIndex--;
        return;
      }
    }

    throw new CourseNotFoundException();

  }

  /**
   * @param c
   * @return
   */
  public boolean contains(Course c){
    for(int i = 0;i<this.maxLength;i++){
      if(this.course[i] == null){
        continue;
      }
      if(this.course[i].equals(c)){
        return true;
      }
    }
    return false;
  }

  /**
   * @param c
   * @return
   */
  public int indexOf(Course c){
    for(int i = 0;i<this.maxLength;i++){
      if(this.course[i] == null){
        continue;
      }
      if(this.course[i].equals(c)){
        return i;
      }
    }
    return -1;
  }

  /**
   * @return
   */
  public int count(){
    int cnt = 0;
    for(int i = 0;i<this.maxLength;i++){
      if(this.course[i] != null){
        cnt += 1;
      }
    }
    return cnt;
  }

  /**
   * @param c
   * @return
   * @throws InvalidIndexException
   */
  public Course get(int c) throws InvalidIndexException{
    if(c > this.currentIndex || c < 0){
      throw new InvalidIndexException();
    }
    return this.course[c];
  }

  /**
   * @return
   */
  public boolean isEmpty(){
    if(this.currentIndex == 0){
      return true;
    }
    return false;

  }

  @Override
  public String toString(){
    String result = "";
    for(int i = 0;i<=this.currentIndex;i++){
      if (this.course[i] == null){
        continue;
      }
      result += this.course[i].toString() + "\n";
    }
    return result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseCatalogImplementation catalogObject = (CourseCatalogImplementation) o;
    if(this.currentIndex == catalogObject.currentIndex) {
      for(int i = 0; i <= this.currentIndex; i++) {
        if(this.course[i] == null && catalogObject.course[i] == null){
          continue;
        }
        if(!this.course[i].equals(catalogObject.course[i])) {
          return false;
        }
      }
      return true;
    }

    return false;

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.course, this.currentIndex);
  }

}
