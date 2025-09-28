package PrestamoVirtual;

public class NoHayStockException extends RuntimeException {
    public NoHayStockException(String message) {
        super(message);
    }
}
