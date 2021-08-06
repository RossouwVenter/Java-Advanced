package Lesson13IOFundimental;

public class StockException extends Exception {
    private static final long serialVersionUID = 103L;
    public StockException (String reason) {
        super (reason);
    }
}
