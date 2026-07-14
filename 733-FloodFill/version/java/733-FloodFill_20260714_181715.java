// Last updated: 14/07/2026, 18:17:15
1class Solution {
2    public int[][] floodFill(int[][] image,int sr,int sc,int color) {
3        if(image[sr][sc]!=color){
4            fill(image,sr,sc,image[sr][sc],color);
5        }
6        return image;
7    }
8
9    public void fill(int[][] image,int i,int j,int old,int color){
10        if(i<0||i>=image.length||j<0||j>=image[0].length){
11            return;
12        }
13        if(image[i][j]!=old){
14            return;
15        }
16        image[i][j]=color;
17        fill(image,i+1,j,old,color);
18        fill(image,i-1,j,old,color);
19        fill(image,i,j+1,old,color);
20        fill(image,i,j-1,old,color);
21    }
22}