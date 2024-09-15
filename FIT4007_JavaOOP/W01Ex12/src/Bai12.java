public class Bai12 {
    public static void Bai12(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) { 
            boolean laBoiSoCua7 = (i % 7 == 0);
            if (laBoiSoCua7) {
                sum += i;
            }
        }
        System.out.println("Tổng các số là bội số của 7 từ 1 đến 100 là: " + sum);
    }
}
