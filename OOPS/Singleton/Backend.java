package OOPS.Singleton;

class Database {
    private String database = "Oracle";
    private static Database ref;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public static Database CreateDatabase() {
        if (ref == null) {
            Database d = new Database();
            ref = d;
        }
        return ref;
    }
}


public class Backend {

    public static void main(String[] args) {
        Database b1 = Database.CreateDatabase();
        Database b2 = Database.CreateDatabase();

        Database b3 = Database.CreateDatabase();
        Database b4 = Database.CreateDatabase();

        System.out.println("c1: " + b1);  // Connection@100
        System.out.println("c2: " + b2);  // Connection@100
        System.out.println("c3: " + b3);  // Connection@100
        System.out.println("c4: " + b4);  // Connection@100

    }

}
