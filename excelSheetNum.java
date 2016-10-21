// Excel Sheet Column Number

public class Solution {
    public int titleToNumber(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        //Mapping value of each character in hashmap
        char ch='A';
        for(int i=1;i<=26;i++)
        {
            hm.put(ch++,i);
        }
        
        int len=s.length()-1;
        int exp=0;
        int result=0;
        while(len>=0)
        {
            char temp=s.charAt(len--);
            result=result+(int)Math.pow(26,exp++)*hm.get(temp);
            
        }
        return result;
    }
}