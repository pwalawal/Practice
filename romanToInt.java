//Roman to Integer


public class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0){
            return -1;
        }
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	    hm.put('I', 1);
	    hm.put('V', 5);
	    hm.put('X', 10);
	    hm.put('L', 50);
	    hm.put('C', 100);
	    hm.put('D', 500);
    	hm.put('M', 1000);
    	
    	int length=s.length()-1;
    	int result = hm.get(s.charAt(length));
    	
    	for(int i=length-1;i>=0;i--){
    	    if(hm.get(s.charAt(i))>=hm.get(s.charAt(i+1))){
    	        result+=hm.get(s.charAt(i));
    	    }
    	    else{
    	        result-=hm.get(s.charAt(i));
    	    }
    	}
        return result;
    }
}