class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old_color = image[sr][sc];
        if(color == old_color) {
            return image;
        }
        recursiveFillColor(image, sr, sc, color, old_color);
        return image;
    }

    private void recursiveFillColor(int[][] image, int sr, int sc, int color, int old_color) {        
        if( sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != old_color) {
            return;
        }        
        image[sr][sc] = color;
        
        recursiveFillColor(image, sr + 1, sc, color, old_color);
        recursiveFillColor(image, sr-1, sc, color, old_color);
        recursiveFillColor(image, sr, sc+1, color, old_color);
        recursiveFillColor(image, sr, sc-1, color, old_color);       
    }
}