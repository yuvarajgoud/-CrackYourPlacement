package Day1;

public class Third {
  public int removeDuplicates(int[] nums) {
      int n = nums.length;
      int i=0;
      int j=0;
      while(j<n){
          if(nums[i] != nums[j]){
              nums[++i] = nums[j];
          }
          j++;
      }
      return i+1;
  }
}