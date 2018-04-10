package practice07;

public class Student extends Person{
  private String name;
  private int age;
  private Klass klass;

  public Student() {
  }

  public Student(String name, int age, Klass klass) {
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

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
  }
}

