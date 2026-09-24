class SortColors {
    public void sortColors(int[] nums) {
     int zerocount = 0;
     int onecount = 0;
     int twocount = 0;

     for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
           zerocount ++ ;
        } else if(nums[i] == 1){
             onecount ++ ;
        } else if(nums[i] == 2){
             twocount ++ ;
        }
     }

        int index = 0;
        
        while(zerocount > 0){
            nums[index ++] = 0;
            zerocount -- ;
        }

        while(onecount > 0){
            nums[index ++] = 1;
            onecount -- ;
        }

        while(twocount > 0){
            nums[index ++] = 2;
            twocount -- ;
        }
     }   
}