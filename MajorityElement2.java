class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        double max=Math.floor(nums.length/3);
        int result=0;
        for(int value : map.keySet()){
           
            if(map.get(value)>max){
                res.add(value);
                }
        }
        
        return res;
    }
}
