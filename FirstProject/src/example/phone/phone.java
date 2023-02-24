package example.phone;
class defaultPhone {
    void MakeACall() {
        System.out.println("전화 걸기");
    }

    void AnswerPhone() {
        System.out.println("전화 받기");
    }
}

class CellPhone extends defaultPhone {
    void SendMessage() {
        System.out.println("문자 보내기");
    }

    void RecordVideo() {
        System.out.println("동영상 촬영하기");
    }
}

class SmartPhone extends CellPhone {
    void kakaoTalk() {
        System.out.println("카톡 보내기");
    }

    void connectInternet() {
        System.out.println("인터넷들어가기");
    }

    void PhoneTest() {
        MakeACall();
        AnswerPhone();
        SendMessage();
        RecordVideo();
        kakaoTalk();
        connectInternet();
    }
}
public class phone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.PhoneTest();
    }
}
