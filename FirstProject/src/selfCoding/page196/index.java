package selfCoding.page196;

public class index {

  public static void main(String[] args) {
    Factory factory = Factory.getFactory();
    Car sonata = factory.createCar();
    Car grandeur = factory.createCar();
    System.out.println(sonata.getSerielNumber());
    System.out.println(grandeur.getSerielNumber());
  }
}
