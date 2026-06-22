import java.util.Scanner;

public class Main {

    public static int findSecondLargest(int[] arr) {
        // Kiểm tra điều kiện: Nếu mảng có ít hơn 2 phần tử
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        // Khởi tạo giá trị lớn nhất và lớn thứ hai ban đầu
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Duyệt qua từng phần tử trong mảng
        for (int num : arr) {
            // Nếu tìm thấy số lớn hơn cả firstMax hiện tại
            if (num > firstMax) {
                secondMax = firstMax; // Số lớn nhất cũ trở thành số lớn thứ hai
                firstMax = num;       // Cập nhật số lớn nhất mới
            }
            // Nếu số đó nhỏ hơn firstMax nhưng lại lớn hơn secondMax
            else if (num > secondMax && num != firstMax) {
                secondMax = num;      // Cập nhật số lớn thứ hai
            }
        }

        // Nếu sau khi duyệt xong, secondMax vẫn không thay đổi (ví dụ mảng [10, 10, 10])
        if (secondMax == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        // Test thử với các ví dụ trong đề bài:
        int[] case1 = {1, 3, 4, 5, 0, 2};
        int[] case2 = {10, 5, 10};
        int[] case3 = {3};

        System.out.println("Kết quả ví dụ 1: " + findSecondLargest(case1)); // Output: 4
        System.out.println("Kết quả ví dụ 2: " + findSecondLargest(case2)); // Output: 5
        System.out.println("Kết quả ví dụ 3: " + findSecondLargest(case3)); // Output: -2147483648 (Integer.MIN_VALUE)
    }
}