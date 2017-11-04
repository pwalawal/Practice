//Repeated String Match

/*
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
*/

class Solution {
    public int repeatedStringMatch(String A, String B) {
        
        int count=0;
        StringBuilder sb=new StringBuilder();
        
        while(sb.length()<B.length()){
            sb.append(A);
            count++;
        }
        
        if(sb.toString().contains(B)){
            return count;
        }
        else if(sb.append(A).toString().contains(B)){
            return count+1;
        }
        return -1;
        
    }
}