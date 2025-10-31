//class Connection {
//    private static Connection connection;
//
//    private Connection() {
//    }
//
//    public static Connection getConnection() {
//        if (connection == null) {
//            connection = new Connection();
//        }
//        return connection;
//    }
//}
//
//public class Dummy {
//    public static void main(String[] args) {
//        Connection c1 = Connection.getConnection();
//        Connection c2 = Connection.getConnection();
//        Connection c3 = Connection.getConnection();
//        Connection c4 = Connection.getConnection();
//
//        System.out.println("c1: " + c1);  // Connection@100
//        System.out.println("c2: " + c2);  // Connection@100
//        System.out.println("c3: " + c3);  // Connection@100
//        System.out.println("c4: " + c4);  // Connection@100
//    }
//}


class Database {
    private static Database data;

    private Database() {
    }


    public static Database getData() {
        if (data == null) {
            data = new Database();
        }
        return data;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Dummy {
    public static void main(String[] args) {
        Database d1 = Database.getData();
        Database d2 = Database.getData();
        System.out.println("D1 : " + d1);
        System.out.println("D2 : " + d2);
    }
}







