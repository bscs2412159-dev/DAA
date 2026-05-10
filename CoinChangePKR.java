public class CoinChangePKR {
    public static void main(String[] args) {
        int amount = 1988;
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Amount: Rs. " + amount);
        for (int coin : denominations) {
            int count = amount / coin;
            if (count > 0) {
                System.out.println(coin + " x " + count);
                amount %= coin;
            }
        }
    }
}
