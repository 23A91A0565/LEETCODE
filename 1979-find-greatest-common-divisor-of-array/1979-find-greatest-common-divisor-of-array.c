int findGCD(int* nums, int numsSize) {
int max =nums[0] ,min = nums[0];
        int ans=1;
        for(int i=1;i<numsSize;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        for(int j=2;j<=min;j++)
        {
          if(min%j==0 && max%j==0)
          {
              ans = j;
          }
        }
        return ans;
    }
    
