// We cannot override private methods, static methods and final methods

package OOPS.Polymorphism.RunTime;


class Allen {
    public void party() {
        System.out.println("home party");
    }
}

class smith extends Allen {
    public void party() {
        System.out.println("Beach party");
    }
}


public class Note {
    public static void main(String[] args) {
        Allen obj = new Allen();
        obj.party();// home party
        obj = new smith();
        obj.party();//Beach party
    }
}
