package selfCoding.page190;

public class Student {
    private static int static__cardNumber = 100;
    int cardNumber;
    String name;

    private Student() {
    
    }
    public Student(String name) {
        this.cardNumber = static__cardNumber++;
        this.name = name;
    }

}
