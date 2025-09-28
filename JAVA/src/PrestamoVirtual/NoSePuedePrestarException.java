package PrestamoVirtual;

public class NoSePuedePrestarException extends RuntimeException {
    public NoSePuedePrestarException(String message) {
        super(message);
    }
}
