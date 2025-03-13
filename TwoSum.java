import java.util.HashMap;
import java.util.Arrays;
class TwoSum{

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        

        return new int[]{-1,-1};
        
        
    
         

    }
    public static void main(String[] args){

        int nums[]={3,3,6};
        int a[]=twoSum(nums,9);

        System.out.println(Arrays.toString(a));

    }
}

