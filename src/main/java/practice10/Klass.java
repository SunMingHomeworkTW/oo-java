package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
  private int number;
  private Student leader;
  private List<Student> members;

  public Klass(int number) {
    this.number = number;
    members =new ArrayList<>();
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Student getLeader() {
    return leader;
  }

  public String getDisplayName(){
    return "Class "+number;
  }

  public void assignLeader(Student student){
    if (members.contains(student)){
      leader = student;
    }
    else {
      System.out.print("It is not one of us.\n");
    }
  }

  public void appendMember(Student student) {
    members.add(student);
  }

  public List<Student> getMembers() {
    return members;
  }
}
