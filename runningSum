
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
class runningSum {
     //Approach 1
        // int n= nums.length;
        // int[] numsSum= new int[n];

        // for (int i=0; i< n; i++){
        //     int currentSum=0;
        //     for(int j=0;j<=i; j++){
        //         currentSum=currentSum+nums[j];
        //     }
        //     numsSum[i]=currentSum;
        // }
        // return numsSum;

    // Approach 2
        int n= nums.length;
        int currentSum=0;
        for(int i=0; i< n; i++){
            currentSum=currentSum+nums[i];
            nums[i]=currentSum;
        }
        return nums;
    }
}
