package Thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнениея: " + t);

        t.setName("My Thread");
        System.out.println("После изменения имени потока: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}
