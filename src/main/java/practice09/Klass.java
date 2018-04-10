package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
  private int number;
  private Student leader;
  private List<Student> studentList;

  public Klass(int number) {
    this.number = number;
    studentList=new ArrayList<>();
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
    if (studentList.contains(student)){
      leader = student;
    }
    else {
      System.out.print("It is not one of us.\n");
    }
  }

  public void appendMember(Student student) {
    studentList.add(student);
  }
}
