package Day1;

class Fourth {
  public void moveZeroes(int[] nums) {
      int i=0;
      while(i < nums.length){
          if(nums[i]==0){
              break;
          }
          i++;
      }
      int j=i+1;
      while(i< nums.length && j< nums.length){
          if( nums[j]!=0){
              int temp=nums[j];
              nums[j]=nums[i];
              nums[i]=temp;
              i++;
              
          } else {
              
              j++;
          }
      }
      }
  }
