class Solution {
    
    static Boolean fun(int[] arr , int k , int n , long limit ){
        
        int m = 1 ;
        long page = arr[0];
        
        for( int i = 1 ; i < n ; i++){
            
            if(page + arr[i] <= limit ){
                page = page + arr[i];
                
            } else {
                m++;
                page = arr[i];
                
                if(m > k){
                    return false;
                }
            }
        }
        
        return true ;
    }
    
    
    public int findPages(int[] arr, int k) {
        
        int n = arr.length;
        
        if(n < k){
            return -1 ;
        }
        
        long low = 0;
        long high = 0;
        
        for( int i = 0 ; i < n ; i++){
            
            low = Math.max(low , arr[i]);
            high += arr[i];
        }
        
        long res = -1;
        
        while(low <= high){
            
            long guess = low + ( high - low ) / 2 ;
            
            if(fun(arr, k, n, guess)){
                res = guess;
                high = guess - 1 ;
            } else {
                low = guess + 1 ;
            }
        }
        
        return (int)res;
    }
}
