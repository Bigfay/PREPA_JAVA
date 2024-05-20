package APROC;

public class MyKindOfException extends Exception {
    public MyKindOfException() {
        super();
    }

    public MyKindOfException(String message) {
        super(message);
    }

    public static class ZeroException extends Exception {
        public ZeroException() {
            super();
        }

        public ZeroException(String message) {

            super(message);
        }
    }
}
