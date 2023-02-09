package selfCoding.page190;

public class Student {

  private static int static__cardNumber = 1000;
  public int cardNumber;
  public String name;

  @SuppressWarnings("unused")
  private Student() {}

  public Student(String name) {
    this.cardNumber = ++static__cardNumber;
    this.name = name;
  }
}
