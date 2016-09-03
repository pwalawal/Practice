//Substring with Concatenation of All Words


public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> result=new ArrayList<>();
        HashMap<String,Integer> temp=new HashMap<String,Integer>();
        
        int sLen=s.length();//string length
        int w=words.length;//array Length
        int n=words[0].length();//array word length
        for(int i=0;i<w;i++)
        {
            if(!temp.containsKey(words[i]))
            {
                temp.put(words[i],1);
            }
            else
            {
                temp.put(words[i],temp.get(words[i])+1);
            }
        }
        
        for(int i=0;i<=sLen-(w*n);i++)
        {
            HashMap<String,Integer> test=new HashMap<String,Integer>(temp);
            for(int j=0;j<w;j++)
            {
                String check=s.substring(i+j*n,i+(j+1)*n);
                
                if(test.containsKey(check))
                {
                    if(test.get(check)>1)
                    {
                        test.put(check,test.get(check)-1);
                    }
                    else
                    {
                        test.remove(check);
                    }
                    
                }
                else
                {
                    break;
                }
            
        }
        
        
        if(test.size()==0)
        {
            result.add(i);
        }
        
    }
    return result;
    
    }    
}