//Использовать ключевое слово super c целью
// предотвратить сокрытие имен
public class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: "  + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UserSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}

