// Last updated: 15/07/2026, 14:59:03
class Solution {
    public int[][] floodFill(int[][] image,int sr,int sc,int color) {
        if(image[sr][sc]!=color){
            fill(image,sr,sc,image[sr][sc],color);
        }
        return image;
    }

    public void fill(int[][] image,int i,int j,int old,int color){
        if(i<0||i>=image.length||j<0||j>=image[0].length){
            return;
        }
        if(image[i][j]!=old){
            return;
        }
        image[i][j]=color;
        fill(image,i+1,j,old,color);
        fill(image,i-1,j,old,color);
        fill(image,i,j+1,old,color);
        fill(image,i,j-1,old,color);
    }
}