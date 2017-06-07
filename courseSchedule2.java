public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        int count=numCourses;
        Queue<Integer>queue=new LinkedList<>();
        int degree[]=new int[numCourses];
        int []result=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            degree[prerequisites[i][0]]++;
        }
        
        for(int i=0;i<numCourses;i++){
            if(degree[i]==0){
                queue.offer(i);
            }
        }
        int j=0;
        while(!queue.isEmpty()){
            int cur=queue.poll();
            result[j++]=cur;
            for(int i:map.get(cur)){
                if(--degree[i]==0){
                    queue.offer(i);
                }
            }
            
            count--;
        }
        
        if(count==0){
            return result;
        }
        else{
            return new int[0];
        }
        
    }
}