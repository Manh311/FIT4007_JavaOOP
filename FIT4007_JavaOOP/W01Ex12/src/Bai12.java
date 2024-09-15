public class Bai12 {
    public static void Bai12(String[] args) {
        // Khởi tạo biến tổng
        int sum = 0;

        // Lặp qua các số từ 1 đến 100
        for (int i = 1; i <= 100; i++) {
            // Kiểm tra nếu số hiện tại là bội số của 7 bằng cách sử dụng biến boolean
            boolean laBoiSoCua7 = (i % 7 == 0);

            // Nếu số là bội số của 7, cộng vào tổng
            if (laBoiSoCua7) {
                sum += i;
            }
        }

        // In ra tổng
        System.out.println("Tổng các số là bội số của 7 từ 1 đến 100 là: " + sum);
    }
}
