class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(0,nums.length-1,nums);
    }
    
    public int mergeSort(int low,int high,int nums[]){
        if(low>=high)
            return 0;
        int mid=(low+high)/2;
        int inv=mergeSort(low,mid,nums);
        inv+=mergeSort(mid+1,high,nums);
        inv+=merge(low,mid,high,nums);
        return inv;
    }
    
    public int merge(int low,int mid,int high,int nums[]){
        int cnt = 0;
        int j = mid + 1; 
        for(int i = low;i<=mid;i++) {
            while(j<=high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            cnt += (j - (mid+1));
        }
        
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low, right = mid+1; 
        while(left <= mid && right<=high) {
            if(nums[left]<=nums[right]) {
                temp.add(nums[left++]); 
            }
            else {
                temp.add(nums[right++]); 
            }
        }
        
        while(left<=mid) {
            temp.add(nums[left++]); 
        }
        while(right<=high) {
            temp.add(nums[right++]); 
        }
        
        for(int i = low; i<=high;i++) {
            nums[i] = temp.get(i - low); 
        }
        return cnt; 
    }
}
