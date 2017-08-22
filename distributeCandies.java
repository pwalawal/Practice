/*
Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
*/

class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:candies){
            set.add(i);
        }
        
        return Math.min(set.size(),candies.length/2);
        
    }
}