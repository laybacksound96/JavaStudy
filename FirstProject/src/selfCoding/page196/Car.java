package selfCoding.page196;

public class Car {

  private static int Static__SerielNumber = 10001;
  private int SerielNumber;

  public Car() {
    this.SerielNumber = ++Static__SerielNumber;
  }

  public int getSerielNumber() {
    return SerielNumber;
  }
}
