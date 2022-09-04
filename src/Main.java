public class Main {
    public static void main(String[] args) {
        int[] sales = {1000, 998, 2750};

        SalesManager manager = new SalesManager(sales);
        System.out.println("max:" + manager.max());
    }
}
