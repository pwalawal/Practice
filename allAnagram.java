// Find All Anagrams in a String

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result=new ArrayList<>();
        
        if(s.length()==0||p.length()==0){
            return result;
        }
        
        int arr[]=new int[28];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        
        int left=0,right=0,count=p.length();
        while(right<s.length()){
            
            if(arr[s.charAt(right)-'a']>0){
                count--;
            }
            arr[s.charAt(right)-'a']--;
            right++;
            
            if(count==0){
                result.add(left);
            }
            
            if(right-left==p.length()){
                if(arr[s.charAt(left)-'a']>=0){
                    count++;
                }
            arr[s.charAt(left)-'a']++;
            left++;
            }
            
        }
        
        return result;
        
    }
}