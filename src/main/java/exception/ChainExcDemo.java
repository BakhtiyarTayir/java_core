package exception;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("Причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }  catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина " + e.getCause());
        }
    }
}
