public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 15, 12, 17, 24, 10, 17};
        printArr(arr);

        DayOfWeek day = DayOfWeek.TUE;
        printDay(day);

    }

    private static void printDay(DayOfWeek day) {
        //проверка дня недели

        if (day==null){
            return;
        }

        System.out.print("День "+day+" в группе: ");

        switch (day){
            case MON, TUE, WED, THU -> System.out.println("Трудовыебудни");
            case FRI                -> System.out.println("Скоровыходные");
            case SAT, SUN           -> System.out.println("Выходные");
        }

    }

    private static void printArr(int[] arr) {
        //вывод чётных элементов массива

        if (arr==null){
            return;
        }

        System.out.print("Чётные элементы массива: ");

        boolean fl = false;
        for (int a:arr) {
            if( a%2 == 0){
                System.out.print(a + " ");
                fl = true;
            }
        }

        if (!fl) System.out.println("отсутствуют");

        System.out.print("\n");

    }
}