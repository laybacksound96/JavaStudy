package example.polymorphism;
class Example {
     void print(String message) {
        System.out.println(message);
    }

     void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
public class signiture {
    public static void main(String[] args) {
        Example example = new Example();
        example.print("Hello, world!");
        example.print("Hello, Java!", 3);
        
    }
    
}
