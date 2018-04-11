package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

  private int number;
  private Student leader;
  private List<Student> members;
  private List<Teacher> observers = new ArrayList<>();

  public Klass(int number) {
    this.number = number;
    members = new ArrayList<>();
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

  public String getDisplayName() {
    return "Class " + number;
  }

  public void assignLeader(Student student) {
    if (members.contains(student)) {
      leader = student;
      notifyAll(student.getName() + " become Leader of " + getDisplayName());
    } else {
      System.out.print("It is not one of us.\n");
    }
  }

  public void appendMember(Student student) {
    members.add(student);
    notifyAll(student.getName() + " has joined " + getDisplayName());
  }

  public List<Student> getMembers() {
    return members;
  }

  public boolean isIn(Student student) {
    return members.contains(student);
  }

  public void addAttach(Teacher observer) {
    observers.add(observer);
  }

  private void notifyAll(String msg) {
    for (Teacher observer : observers) {
      observer.update(msg);
    }
  }
}
