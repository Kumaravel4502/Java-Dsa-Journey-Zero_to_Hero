package OOPS.FinalKeyword;

// Final method cannot be overridden
public class FinalVariable {
    final static int PHONE = 1234;
    final static String NAME;

    static {
        NAME = "Sheela";
    }

    public static void main(String[] args) {
        // NAME = "Kumar"; // CTE - cannot assign a value to final variable
        // PHONE = 55555;  // CTE - cannot assign a value to final variable

        final int ID = 101;
        final int AGE;
        AGE = 25;
        // ID = 200; // CTE - cannot reassign final variable
        // AGE = 20; // CTE - cannot reassign final variable
    }
}


//final static variables can be initialized either at declaration or inside a static block (only once).
//final local variables (like ID and AGE) must be initialized before use, and cannot be reassigned.

