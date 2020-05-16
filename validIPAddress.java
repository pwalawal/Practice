class Solution {
    public String validIPAddress(String IP) {
     
        if(isValidIPv4(IP)){
            return "IPv4";
        }else if(isValidIPv6(IP)){
            return "IPv6";
        }
        else return "Neither";
    }
    
    public boolean isValidIPv4(String IP){
        String address[]=IP.split("\\.");
        if(address.length!=4){
            return false;
        }
        for(String s:address){
            if(s.length()==0||s.length()>1 &s.charAt(0)=='0'||s.length()>3){
                return false;
            }
            for(char c:s.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            int value=Integer.parseInt(s);
            if(value<0 ||value>255){
                return false;
            }
            
        }
        return IP.charAt(IP.length() - 1) != '.';
            //return true
        
    }
    
    public boolean isValidIPv6(String IP){
        
        String address[]=IP.split("\\:");
        if(address.length!=8){
            //System.out.print("address.length!=8");
            return false;
            
        }
        for(String s:address){
            if(s.length()==0||s.length()>4){
                //System.out.print("s.length()==0||s.length()>4");
                return false;
                
            }
            for(char c:s.toCharArray()){
                if(!isHexa(c)){
                    //System.out.print("isHexa(c)");
                    return false;
                }
                }
            }
            return IP.charAt(IP.length() - 1) != ':';
            //return true;
        
        }
    
        public boolean isHexa(char c){
        return (c>='a' && c<='f')||(c>='A' && c<='F' )||(Character.isDigit(c));
    }
        
    }
    
    
    
