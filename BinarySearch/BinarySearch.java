
public class BinarySearch{
   public int binarySearch(int [] nums, int start, int end, int key){
        int mid=0;
       while(start<=end){
            mid=start+(end-start)/2;
       
       if(nums[mid]==key){
       return mid;
    }else if(nums[mid]<key){
        start=mid + 1;
    }else{
        end=mid-1;
    }
}
   return 0;
}

public static void main(String[]args){
    BinarySearch b=new BinarySearch();
    int[]nums={1,2,3,4,5,6,7,8,9,10};
    int result=b.binarySearch(nums,0,nums.length-1,5);
    System.out.print(result);
}
}
