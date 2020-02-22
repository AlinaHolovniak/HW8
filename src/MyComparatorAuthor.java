import java.util.Comparator;

public class MyComparatorAuthor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String author1 = ((Book)o1).getAuthor();
        String author2 = ((Book)o2).getAuthor();
        if (author1 == null) {
            return 1;
        }
        if (author2 == null) {
            return -1;
        }
        return author1.compareTo(author2);
    }
}