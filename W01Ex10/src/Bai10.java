public class Bai10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            boolean laSochan = (i % 2 == 0);
            if (laSochan) {
                sum += i;
            }
        }
        System.out.println("Tổng các số là số chẵn từ 1 đến 10 là: " + sum);
    }
}

