package bookClone.chap08_inheritance;

public class index {
    public static void main(String[] args) {
        int price = 10000;
        Customer Lee = new Customer(11,"이순신");
        // Lee.setCustomerID(10110);
        // Lee.setCustomerName("이순신");
        Lee.bonusPoint = 1000;
        System.out.println(Lee.showCustomerInfo()+"님이 지불해야 하는 금액은"+Lee.calcPrice(price)+"입니다.");

        VIPCustomer Kim = new VIPCustomer(12,"김유신",11);
        // Kim.setCustomerID(10020);
        // Kim.setCustomerName("김유신");
        Kim.bonusPoint = 10000;
        System.out.println(Kim.showVIPInfo()+"님이 지불해야 하는 금액은"+Kim.calcPrice(price)+"입니다.");

        Customer Park = new VIPCustomer(13, "박지원", 133);
        Park.bonusPoint = 10000;
        System.out.println(Park.showCustomerInfo()+","+Park.calcPrice(price));
    }
}
