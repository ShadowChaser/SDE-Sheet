class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        int result=0;
        for(int value : map.keySet()){
            System.out.print(map.get(value));
            if(map.get(value)>max){
                max=map.get(value);
                result=value;
                }
        }
        
        return result;
    }
}

//Boyyer Moore Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count++;
                res=nums[i];
            }else if(nums[i]==res){
                count++;
            }else{
                count--;
            }
        }
        
        return res;
    }
}
