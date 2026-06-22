public class Main {

    // Hàm lấy chữ cái đầu của mỗi từ trong chuỗi
    public static String getFirstLetters(String str) {
        // Kiểm tra nếu chuỗi rỗng hoặc null
        if (str == null || str.trim().isEmpty()) {
            return "";
        }

        // Cắt chuỗi thành mảng các từ, tự động loại bỏ khoảng trắng thừa
        String[] words = str.trim().split("\\s+");

        // Dùng StringBuilder để nối các chữ cái lại với nhau cho tối ưu hiệu năng
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Lấy ký tự đầu tiên của từ và chuyển thành chữ hoa
            char firstChar = Character.toUpperCase(words[i].charAt(0));
            result.append(firstChar);

            // Nếu không phải là từ cuối cùng thì thêm một khoảng trắng ở giữa
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test thử với các ví dụ trong đề bài:
        String input1 = "Xin chào các bạn";
        String input2 = "Hello World";
        String input3 = "  lập   trình  java "; // Test thêm trường hợp chữ thường và khoảng trắng lộn xộn

        System.out.println("Kết quả ví dụ 1: \"" + getFirstLetters(input1) + "\""); // Output: "X C C B"
        System.out.println("Kết quả ví dụ 2: \"" + getFirstLetters(input2) + "\""); // Output: "H W"
        System.out.println("Kết quả ví dụ 3: \"" + getFirstLetters(input3) + "\""); // Output: "L T J"
    }
}