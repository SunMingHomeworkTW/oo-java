package practice11;

import java.util.ArrayList;
import java.util.List;
import sun.reflect.Reflection;

public class Klass {
  private int number;
  private Student leader;
  private List<Student> members;
  private Teacher teacher;

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

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public String getDisplayName(){
    return "Class "+number;
  }

  public void assignLeader(Student student){
    if (members.contains(student)){
      leader = student;
      if (teacher!=null)
        System.out.print("I am "+ teacher.getName()+". I know "+student.getName()+" become Leader of "+getDisplayName()+".\n");
    }
    else {
      System.out.print("It is not one of us.\n");
    }
  }

  public void appendMember(Student student) {
    members.add(student);
    if(teacher!=null)
      System.out.print("I am "+ teacher.getName()+". I know "+student.getName()+" has joined "+getDisplayName()+".\n");
  }

  public List<Student> getMembers() {
    return members;
  }

  public boolean isIn(Student student){
    return members.contains(student);
  }
}
