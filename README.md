
# Анализ статистики продаж.

### Класc SalesManager 
На входе получает массив типа int.
```
   public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }
```    
#### Метод max
Возвращает наибольшее значение.

```
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```

