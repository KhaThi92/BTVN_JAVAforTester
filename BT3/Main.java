public class Main {

    // Hàm tính tổng các số chẵn từ 0 đến n
    public static int sumOfEvenNumbers(int n) {
        int sum = 0;

        // Dùng vòng lặp chạy từ 0 đến n, mỗi bước tăng lên 2 đơn vị (i += 2)
        // Cách này tối ưu hơn vì vòng lặp chỉ đi qua các số chẵn, không cần kiểm tra if (i % 2 == 0)
        for (int i = 0; i <= n; i += 2) {
            sum += i; // Cộng dồn vào biến sum
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test thử với các ví dụ trong đề bài:
        int input1 = 10;
        int input2 = 5;

        System.out.println("Kết quả ví dụ 1 (Input: 10): " + sumOfEvenNumbers(input1)); // Output: 30
        System.out.println("Kết quả ví dụ 2 (Input: 5): " + sumOfEvenNumbers(input2));  // Output: 6
    }
}