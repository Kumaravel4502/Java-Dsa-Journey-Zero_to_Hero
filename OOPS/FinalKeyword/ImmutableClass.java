package OOPS.FinalKeyword;

final class Immutable {
    private final int ID;
    private final String NAME;

    Immutable(int id, String name) {
        this.ID = id;
        this.NAME = name;
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

}


public class ImmutableClass {
    public static void main(String[] args) {
        Immutable obj=new Immutable(101,"Kumar");
        System.out.println("ID : "+obj.getID());
        System.out.println("NAME : "+obj.getNAME());
    }
}
