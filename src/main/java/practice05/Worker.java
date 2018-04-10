package practice05;

public class Worker extends Person{
  private String name;
  private int age;

  public Worker() {
  }

  public Worker(String name, int age) {
    super(name,age);
    this.name=name;
    this.age=age;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getAge() {
    return age;
  }

  @Override
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Worker. I have a job.";
  }
}
