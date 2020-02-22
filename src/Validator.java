
public class Validator {

    public static void validateShelfSize(int shelfSize) throws InvalidSizeException {
        if (shelfSize < 0) throw new InvalidSizeException("Shelf size can't be negative number");
    }

    public static void validateAuthor(String searchAuthor) throws InvalidAuthorException {
        if (searchAuthor.length() == 0)
            throw new InvalidAuthorException("Invalid name of Author");
    }

    public static void validatePercent(double percentage) throws InvalidPercentException {
        if (percentage < -100.00)
            throw new InvalidPercentException("Invalid percent");
    }
}
