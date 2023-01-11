public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long medium() {
        long medium = 0;
        for (long sale : sales) {
            medium = medium + sale;
        }
        medium = (medium - (this.max() + this.min())) / (this.sales.length - 2);
        return medium;
    }
}
