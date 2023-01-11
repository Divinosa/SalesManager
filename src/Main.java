public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{5,8,9,12,55,32};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());

    }
}