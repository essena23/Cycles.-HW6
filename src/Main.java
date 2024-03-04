public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // task 2
        System.out.println("task 2");
        for (int u = 10; u > 0; u--){
            System.out.println(u);
        }
        // task 3
        System.out.println("task 3");
        for (int o = 0; o <= 17; o = o + 2){
            System.out.println(o);
        }
        // task 4
        System.out.println("task 4");
        for (int p = 10; p >= -10; p--){
            System.out.println(p);
        }
        // task 5
        System.out.println("task 5");
        for (int year = 1904;year <= 2096; year = year + 4){
            System.out.println(year + " - високосный год");
        }
        // task 6
        System.out.println("task 6");
        for (int n = 7; n < 100; n = n + 7) {
            System.out.println(n);
        }
        // task 7
        System.out.println("task 7");
        for (int k = 1; k <= 512; k = k * 2){
            System.out.println(k);
        }
        //task 8
        System.out.println("task 8");
        int deposit = 29000;
        int total = 0;
        for (int l = 1; l <= 12; l++){
            total = total + deposit;
            System.out.println("Mecяц " + l + " сумма накоплений равна " + total);
        }
        // task 9
        System.out.println("task 9");
        deposit = 29000;
        total = 0;
        for (int p = 1; p <= 12; p = p + 1) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Mecяц " + p + " сумма накоплений равна " + total);
        }
        // task 10
        System.out.println("task 10");
        for (int t = 2, j = 1; t <= 20 && j <= 10; t = t + 2, j = j + 1){
            System.out.println("2x" + j + "=" + t);
        }
    }
}