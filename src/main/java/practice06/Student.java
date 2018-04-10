package practice06;

public class Student extends Person{
  private String name;
  private int age;
  private int klass;

  public Student() {
  }

  public Student(String name, int age, int klass) {
    super(name,age);
    this.name=name;
    this.age=age;
    this.klass = klass;
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

  public int getKlass() {
    return klass;
  }

  public void setKlass(int klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Student. I am at Class "+klass+".";
  }
}
