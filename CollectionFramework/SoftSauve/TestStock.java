package CollectionFramework.SoftSauve;

class StockOutOfBoundsException extends Exception {
    public StockOutOfBoundsException(String msg) {
        super(msg);
    }
}

public class TestStock {
    public static void main(String[] args) throws StockOutOfBoundsException {
        int stock = 0;
        if (stock == 0) {
            throw new StockOutOfBoundsException("Product Out of Stock!");
        }
        System.out.println("Delivered Successfully");
    }
}
