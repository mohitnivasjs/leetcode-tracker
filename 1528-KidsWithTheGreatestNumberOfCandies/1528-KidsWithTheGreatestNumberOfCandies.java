// Last updated: 09/07/2026, 09:45:50
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li=new LinkedList<>();
        int max=0;
        for(int i:candies){
            if(max<i) max=i;
        }
        for(int i:candies){
            if(i+extraCandies>=max) li.add(true);
            else li.add(false);
        }
        return li;
    }
}