package dandiaozhan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class xiayigegengdayuansu {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums1.length;i++) hashMap.put(nums1[i],i);
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int [] res=new int[nums1.length];
        Arrays.fill(res,-1);

        for(int i=1;i<nums2.length;i++){
            while(!stack.isEmpty()&&nums2[i]>nums2[stack.peek()]){
                if(hashMap.containsKey(nums2[stack.peek()]))
                    res[hashMap.get(nums2[stack.peek()])]=nums2[i];
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums1={4,1,2};
        int [] nums2={1,3,4,2};
        nextGreaterElement(nums1,nums2);
    }

}
