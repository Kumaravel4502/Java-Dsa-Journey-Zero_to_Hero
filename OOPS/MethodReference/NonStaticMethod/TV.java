package OOPS.MethodReference.NonStaticMethod;

// Syntax : Reference Name :: Method Name

interface Remote {
    void powerButton();
}

public class TV {
    public void BtnOn() {
        System.out.println("TV Turned ON");
    }

    public void BtnOFF() {
        System.out.println("TV turned OFF");
    }

    public static void main(String[] args) {
        TV ref = new TV();//For non-static method we have to create a reference
        Remote r1 = ref::BtnOn;
        r1.powerButton();
        Remote r2 = ref::BtnOFF;
        r2.powerButton();
    }
}
