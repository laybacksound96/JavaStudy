package bookClone.chap08_inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    /**
     * @param id 손님 id
     * @param name 손님 이름
     * @param agentID 상담사 id
     */
    public VIPCustomer(int id, String name, int agentID) {
        super(id, name);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer () 호출됨");
    }

    public String showVIPInfo() {
        return super.showCustomerInfo()+", 담당 상담원 아이디는 "+agentID+"입니다.";
    }

    public int getAgentID() {
        return agentID;
    }
    
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        
        return price - (int) (price * saleRatio);
    }
}
