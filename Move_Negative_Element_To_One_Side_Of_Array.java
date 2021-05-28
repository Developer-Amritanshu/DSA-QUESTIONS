public class Move_Negative_Element_To_One_Side_Of_Array {
  public static void main(String[] args) {
    int[] myArray = {-11,12,13,-20,1,2,3,-4,-5,-6};
    int left = 0;
    int right = myArray.length-1;
    while(left<=right){
      if(myArray[left]<0){
        left++;
      }else{
        if(myArray[right]<0){
          int temp = myArray[left];
          myArray[left] = myArray[right];
          myArray[right] = temp;
          right--;
        }else{
          right--;
        }
      }
    }
    for(int a:myArray){
      System.out.print(a+" ");
    }
  }
}
