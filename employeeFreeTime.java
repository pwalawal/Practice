/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/

class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        
        
        List<Interval>result=new ArrayList<>();
        
        List<Interval> scheduleList=new ArrayList<>();
        
        for(List<Interval> s:schedule){
            scheduleList.addAll(s);
        }
        Collections.sort(scheduleList,(a,b)->(a.start-b.start));
        
        Interval temp=scheduleList.get(0);
        for(Interval i:scheduleList){
            if(i.start>temp.end){
                result.add(new Interval(temp.end,i.start));
                temp=i;
            }else{
                temp.end=Math.max(temp.end,i.end);
            }
        }
        return result;
    }
}
