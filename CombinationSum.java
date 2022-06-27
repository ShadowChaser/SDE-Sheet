class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Solution(0,target,candidates,result,new ArrayList<>());
        return result;
    }
    
    public static void Solution(int ind,int target,int candidates[], List<List<Integer>> res,ArrayList<Integer> ds){
      if(ind==candidates.length){
          if(target==0){
              res.add(new ArrayList<>(ds));
          }
          return;
      }
          if(candidates[ind]<=target){
              ds.add(candidates[ind]);
              Solution(ind,target-candidates[ind],candidates,res,ds);
              ds.remove(ds.size()-1);
          }
        
        Solution(ind+1,target,candidates,res,ds);
        
    }
}
