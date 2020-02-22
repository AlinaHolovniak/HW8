import java.util.Comparator;

public class MyComparatorPrice implements Comparator {
    @Override
    public int compare (Object o1, Object o2) {
        double price1 = ((Book)o1).getPrice();
        double price2 = ((Book)o2).getPrice();
        if (price2 > price1) {
            return 1;
        } else {
            return -1;
        }
    }
}