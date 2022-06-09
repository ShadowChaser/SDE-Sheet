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


//Boyeerr Moore

class Solution {
public List majorityElement(int[] nums) {
int candidate1=0,candidate2=0,count1=0,count2=0;
int n=nums.length;
for(int i=0;i<nums.length;i++){

        if(candidate1==nums[i]){
            count1+=1;
        }
        else if(candidate2==nums[i]){
            count2+=1;
        }
        else if(count1==0){
            candidate1=nums[i];
            count1=1;
        }
        else if(count2==0){
            candidate2=nums[i];
            count2=1;
        }
        else{
            
            count1-=1;
            count2-=1;
        }
        
    }
    System.out.println(count1+" bu "+count2);
    count1=count2=0;
    for(int i=0;i<nums.length;i++){
        if(candidate1==(nums[i])){
            count1+=1;
        }
       else if(candidate2==(nums[i])){
            count2+=1;
        }
    }
    List <Integer> l = new ArrayList<>();
    if(count1>(n/3))
        l.add(candidate1);
    if(count2>(n/3))
        l.add(candidate2);
    
    return l;
    
    
}
}
