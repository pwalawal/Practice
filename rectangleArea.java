/*
Rectangle Area
Find the total area covered by two rectilinear rectangles in a 2D plane.
*/
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int area=(C-A)*(D-B)+(G-E)*(H-F);
        if(C<E||B>H||G<A||F>D)
        {
            return area;
        }
        else
        {
            return area-(Math.min(D,H)-Math.max(B,F))*(Math.min(C,G)-Math.max(A,E));
        }
    }
}