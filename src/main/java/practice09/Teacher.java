package practice09;

public class Teacher extends Person{
  private int id;
  private String name;
  private int age;
  private Klass klass;

  public Teacher() {
  }

  public Teacher(int id, String name, int age) {
    super(id,name,age);
    this.name = name;
    this.age = age;
  }

  public Teacher(int id,String name, int age, Klass klass) {
    super(id,name,age);
    this.id=id;
    this.name=name;
    this.age=age;
    this.klass = klass;
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

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Teacher. I teach "+(klass!=null?klass.getDisplayName():"No Class")+".";
  }

  public String introduceWith(Student student){
    return super.introduce()+" I am a Teacher. I "+(klass.getNumber()==student.getKlass().getNumber()?"":"don't ")+"teach "+student.getName()+".";
  }
}
