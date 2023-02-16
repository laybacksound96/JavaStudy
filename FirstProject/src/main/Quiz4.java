package main;

class Car{
	int carNumber;
	
	Car(){
	}
	Car(int number){
		this.carNumber=number;
	}
	void run() {
		System.out.println("이 자동차는 달리고 있습니다.");
	}
	void stop() {
		System.out.println("이 자동차는 멈춰있습니다.");
	}
}

public class Quiz4 {
	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		
		
		int a = 1;
		System.out.println(System.identityHashCode(a));
		
	}
}


