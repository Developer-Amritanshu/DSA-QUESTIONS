// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#


class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int totalLength = n+m; //8
        int[] totalArray = new int[totalLength];  // 0-7
        for(int i=0;i<n;i++){  // 0-4
            totalArray[i] = a[i];
        }
        int k =0;
        for(int i=n;i<totalLength;i++){ 
            totalArray[i] = b[k];
            k++;
        }
        int max = totalArray[0];
        for(int i =0;i<totalLength;i++){
            if(totalArray[i]>max){
                max = totalArray[i];
            }
        }
        int[] mapArray = new int[max+1];
        
        for(int i=0;i<totalLength;i++){
            mapArray[totalArray[i]] = 1;
        }
        int c =0;
        for(int j: mapArray){
            if(j==1){
                c+=1;
            }
        }
        return c;
    }
}