class Solution {
    
    static boolean fun(int[] arr, int k, int guess, int n){
        int cow = 1;
        int pos = arr[0];
        
        for(int i = 1; i < n; i++){
            
            int dist = arr[i] - pos;
            
            if(dist >= guess){
                cow++;
                pos = arr[i];
            }
            
            if(cow >= k){
                return true;
            }
        }
        
        return false;
    }
    
    
    public int aggressiveCows(int[] arr, int k) {
       
       int n = arr.length;
       
       Arrays.sort(arr);
       
       int low = 1;
       int high = arr[n-1] - arr[0];
       
       int res = -1;
       
       while(low <= high){
           
           int guess = low + (high - low)/2;
           
           if(fun(arr, k, guess, n)){
               res = guess;
               low = guess + 1;
           } else {
               high = guess - 1;
           }
       }
       
       return res;
    }
}
