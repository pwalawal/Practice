/*
Permutation Sequence
The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

*/

public class Solution {
    public String getPermutation(int n, int k) {
        
        String result="";
        int perm=1;
        int index;
        k=k-1;
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        //add all the numbers in arraylist
        //calculating the total number of permutations
        for(int i=1;i<=n;i++)
        {
            al.add(i);
            perm=perm*i;
        }
        
        for(int i=0;i<n;i++)
        {
            
            perm=perm/(n-i);
            //calculating which index elemnt will start for given kth position
            index=k/perm;
            //add to string
            result=result+al.get(index);
            //remove that element from arraylist 
            al.remove(index);
            
            k=k%perm;
            
        }
        
        return result;
    }
}