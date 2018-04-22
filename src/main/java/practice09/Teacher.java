package practice09;

public class Teacher extends Person{
  private Klass klass;

  public Teacher() {
  }

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public Teacher(int id, String name, int age, Klass klass) {
    super(id,name,age);
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
