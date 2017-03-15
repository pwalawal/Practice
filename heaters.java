/*
Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.

Now, you are given positions of houses and heaters on a horizontal line, find out minimum radius of heaters so that all houses could be covered by those heaters.

So, your input will be the positions of houses and heaters seperately, and your expected output will be the minimum radius standard of heaters.


*/

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int i=0,res=0;
        for(int house:houses){
            while(i<heaters.length-1 && Math.abs(heaters[i]-house)>=Math.abs(heaters[i+1]-house)){
                i++;
            }
            
            res=Math.max(res,Math.abs(heaters[i]-house));
        }
        
        return res;
        
    }
}