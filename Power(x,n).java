class Solution {
    public double myPow(double x, int n) {
        return myPowSol(x,1L*n);
		
    }
    
    public double myPowSol(double x, Long n){
        if(n==0)
            return 1;
        if(n<0)
            return myPowSol(1/x,-n);
        
        return n%2==0 ?  myPowSol(x*x,n/2) :  x*myPowSol(x*x,n/2);
    }
}
