// 1672. Richest Customer Wealth

public class RichestCus {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        RichestCus rc = new RichestCus();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("The Richest Custoer Wealth is : " + rc.maximumWealth(accounts));
    }
}
