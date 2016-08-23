/*
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
*/

public class Solution {
    public String getHint(String secret, String guess) {
        
        int bull=0;
        int cow=0;
        
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        
        for(int i=0;i<secret.length();i++)
        {
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            
            if(c1==c2)
            {
                bull++;
            }
            else
            {
                arr1[c1-'0']++;
                arr2[c2-'0']++;
                
            }
            
        }
        
        for(int i=0;i<arr1.length;i++)
        {
            cow=cow+Math.min(arr1[i],arr2[i]);
        }
        
        return bull+"A"+cow+"B";
    }
}