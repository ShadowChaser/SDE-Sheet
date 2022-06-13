class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> map=new HashSet<>();
        
        for(int num: nums){
            map.add(num);
        }
        
        int longestseq=0;
        
        for(int num:nums){
            if(!map.contains(num-1)){
                int currentnum=num;
                int currentstreak=1;
                while(map.contains(currentnum+1)){
                    currentstreak++;
                    currentnum++;
                }
                
                longestseq=Math.max(longestseq,currentstreak);
            }
        }
        
        return longestseq;
    }
}
