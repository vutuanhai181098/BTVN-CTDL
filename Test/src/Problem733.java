public class Problem733 {
//  https://leetcode.com/problems/flood-fill/submissions/1025742216/

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        // kiểm tra xem màu lúc đầu có giống màu mới không?
        if(originalColor == color) return image;
        // gọi hàm fill bắt đầu đổ màu tại vị trí image[sr][sc];
        fill(image, sr, sc, color, originalColor);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int newColor, int originalColor) {
        // Kiểm tra, nếu vị trí image[sr][sc] đã nằm ngoài image thì dừng lại.
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        // Kiểm tra xem màu tại vị trí image[sr][sc] có giống với màu lúc đầu không?
        if(image[sr][sc] != originalColor) return;
        // Đổ màu cho vị trí đó.
        image[sr][sc] = newColor;
        // gọi đệ quy để đổ màu các vị trí bên cạnh.
        // Trên
        fill(image, sr-1, sc, newColor, originalColor);
        // Dưới
        fill(image, sr+1, sc, newColor, originalColor);
        // Trái
        fill(image, sr, sc-1, newColor, originalColor);
        // Phải
        fill(image, sr, sc+1, newColor, originalColor);
    }
    // Time Complexity : O(n*m)
}
