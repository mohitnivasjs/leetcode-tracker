// Last updated: 15/07/2026, 15:00:44
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            int j=0;
            while(i+j<haystack.length()&&j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}