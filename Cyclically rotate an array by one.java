// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long t = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
           arr[i+1]  = arr[i];
       }
       arr[0] = t;
        
    }
}