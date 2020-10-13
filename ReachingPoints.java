class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        
        while(sx<tx && sy<ty){
            if(tx<ty){
                ty=ty%tx;
            }else{
                tx=tx%ty;
            }
        }
        
        return (sx==tx && sy<=ty && (ty-sy)%sx==0)||(sx<=tx && sy==ty && (tx-sx)%sy==0);
        
        /*
        sy will translate to ty only by (sx+sy), if they translate then(sx, sy+k*sx) = ty for some k
sy+k*sx = ty => (ty-sy) / sx = k.
Since sx,sy,tx,ty are all integer, then k has to be a integer which means, there must be a integer k that help us to reach ty. Which makes reminder to be 0
Hence
(ty-sy) % sx == 0

Complexity : O(log(n)) where n = Max(tx,ty)
        */
        
    }
}
