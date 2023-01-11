public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{5,8,9,12,55,32};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.medium());

    }
}