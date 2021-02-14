class Solution {
    public int minCost(String s, int[] cost) {

        
        int result=0;
        
        char []ch=s.toCharArray();
        int group_cost=0;
        int max_cost=0;
        for(int i=0;i<ch.length;i++){
            if(i>0 && ch[i]!=ch[i-1]){
                result+=group_cost-max_cost;
                group_cost=0;
                max_cost=0;
            }
            
            group_cost+=cost[i];
            max_cost=Math.max(cost[i],max_cost);
            
        }
        result+=group_cost-max_cost;
        return result;
    }
}
