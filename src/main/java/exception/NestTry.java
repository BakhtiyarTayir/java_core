package exception;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            /* Если не указаны агрументы командной строки,
               в следующем операторе будет сгенерировано
               исключение в связи с делением на нуль. */
            int b = 42 / a;
            System.out.println("a = " + a);

            try {
                /* Если указан один аргумент командной строки,
                   то исключение в связы с делением на нуль
                   будет сгенерировано в следующем коде. */
                if ( a==1 ) a = a/(a-a);
                /* Если указаны два аргумента командной строки,
                   то генерируется исключение в связы с выходом за пределы массива. */
                if (a==1) {
                    int c[] = { 1 };
                    c[42] = 99; // здесь генерируется исключение в связы с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
