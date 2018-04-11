package practice10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends Person{
  private int id;
  private String name;
  private int age;
  private Set<Klass> classes;

  public Teacher() {
    classes=new HashSet<>();
  }

  public Teacher(int id, String name, int age) {
    super(id,name,age);
    this.name = name;
    this.age = age;
    classes=new HashSet<>();
  }

  public Teacher(int id,String name, int age, Set<Klass> classes) {
    super(id,name,age);
    this.id=id;
    this.name=name;
    this.age=age;
    this.classes=classes;
    classes=new HashSet<>();
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Set<Klass> getClasses() {
    return classes;
  }

  public void setClasses(Set<Klass> classes) {
    this.classes = classes;
  }

  @Override
  public String introduce() {
    if(classes.size()==0){
      return super.introduce()+" I am a Teacher. I teach No Class.";
    }
    else {
      String klassNums="";
      List<Integer> klassNumList=new ArrayList<>();
      for(Klass klass:classes)
        klassNumList.add(klass.getNumber());
      Collections.sort(klassNumList);
      for(int num:klassNumList)
        klassNums= klassNums+num+", ";
      klassNums=klassNums.substring(0,klassNums.length()-2);
      return super.introduce()+" I am a Teacher. I teach Class "+klassNums+".";
    }
  }

  public String introduceWith(Student student){
    return super.introduce()+" I am a Teacher. I "+(isTeaching(student)?"":"don't ")+"teach "+student.getName()+".";
  }

  public boolean isTeaching(Student student){
    for(Klass klass:classes){
      if (klass==student.getKlass())
        return true;
    }
    return false;
  }
}

