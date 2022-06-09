class Solution {
    public double myPow(double x, int n) {
        if(n == 0){ //base case (x power 0 = 1)
            return 1;
        }
        double temp = myPow(x,n/2); //computing power for pow(x,n/2) -> divide & conquer step
        if(n%2 == 0){
            return temp * temp;
            
        }
        
        else {
            if(n < 0){
                return 1/x*(temp*temp);
            } else {
                return x * temp * temp;    
            }
        }
		
    }
}
