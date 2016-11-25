/*
There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers
*/


public class Solution {
    public int lastRemaining(int n) {
     
     boolean flag=true;
     int head=1;
     int step=1;
     int counter=n;
     while(counter>1)
     {
         if(flag||counter%2==1)
         {
             head=head+step;
         }
         counter=counter/2;
         step=step*2;
         flag=!flag;
     }
    return head;
    }
}