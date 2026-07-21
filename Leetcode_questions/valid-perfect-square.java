class Solution {
    public boolean isPerfectSquare(int num) {
        int  low = 1 ;
        int  high = num ;

        while ( low <= high){
            int mid = low + ( high - low )/2;
            long s = (long) mid * mid ;
            if( s == num){
                return true ;
            } else if (s < num){
                low = mid + 1 ;
            } else {
                high = mid - 1 ;
            }
            
        }
        return false ;
    }
}
