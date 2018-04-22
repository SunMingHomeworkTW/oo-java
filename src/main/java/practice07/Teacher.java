package practice07;

public class Teacher extends Person{
  private Klass klass;

  public Teacher() {
  }

  public Teacher(String name, int age) {
    super(name, age);
  }

  public Teacher(String name, int age, Klass klass) {
    super(name, age);
    this.klass = klass;
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

