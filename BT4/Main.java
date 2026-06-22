public class Main {

    // Hàm đếm số từ trong một chuỗi
    public static int countWords(String str) {
        // Trường hợp chuỗi bị null hoặc rỗng rải rác khoảng trắng
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Dùng trim() để xóa khoảng trắng thừa ở đầu và cuối chuỗi
        // Dùng split("\\s+") để cắt chuỗi dựa trên một hoặc nhiều khoảng trắng liên tiếp
        String[] words = str.trim().split("\\s+");

        // Số lượng phần tử trong mảng chính là số từ
        return words.length;
    }

    public static void main(String[] args) {
        // Test thử với các ví dụ trong đề bài:
        String input1 = "Xin chào các bạn";
        String input2 = "Hello World";
        String input3 = "   Cắt  khoảng   trắng   thừa  "; // Test trường hợp đặc biệt nhiều khoảng trắng

        System.out.println("Kết quả ví dụ 1: " + countWords(input1)); // Output: 4
        System.out.println("Kết quả ví dụ 2: " + countWords(input2)); // Output: 2
        System.out.println("Kết quả ví dụ 3: " + countWords(input3)); // Output: 4
    }
}