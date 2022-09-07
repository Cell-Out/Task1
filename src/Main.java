public class Main {

    public static void main(String[] args) {

        long[] sales = {1000, 998, 2750, 100};

        SalesManager manager = new SalesManager(sales);
        System.out.println("mean:" + manager.avgTrimmed());
    }
}
