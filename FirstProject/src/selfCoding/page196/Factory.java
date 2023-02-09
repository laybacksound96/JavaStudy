package selfCoding.page196;

public class Factory {

  private static Factory factory = new Factory();

  private Factory() {}

  public static Factory getFactory() {
    if (factory == null) {
      factory = new Factory();
    }
    return factory;
  }

  public Car createCar() {
    return new Car();
  }
}
