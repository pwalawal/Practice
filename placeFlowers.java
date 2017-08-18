//Can Place Flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count =1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                count++;
                
            }
            else{
                n-=(count-1)/2;
                count=0;
                
            }
        }
        
        if(count!=0){
            n-=count/2;
        }
        return n<1;
        
    }
}