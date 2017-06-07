public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        int count=numCourses;
        int []degree=new int[numCourses];
        Queue<Integer>queue=new LinkedList<Integer>();
        
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
        while(!queue.isEmpty()){
            int cur=queue.poll();
            for(int i:map.get(cur)){
                if(--degree[i]==0){
                    queue.offer(i);
                }
            }
            count--;
        }
        return count==0;
    }
}