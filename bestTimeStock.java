/*
Best Time to Buy and Sell Stock
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/


public class Solution {
    public int maxProfit(int[] prices) {
        
        int result=0;
        int i=0;
        if(prices==null||prices.length==0)
        {
            return result;
        }
       
        int temp=prices[0];
        
        while(i<prices.length)
        {
            result=Math.max(result,prices[i]-temp);
            temp=Math.min(temp,prices[i]);
            i++;
        }
               
        return result;
        
    }
}