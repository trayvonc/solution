package daimasuixianglu.tanxin;

public class tiaoyueyouxi2 {
    public int jump(int[] nums) {
        //  有点类似图的思想，当前这一步为根，这步范围内的是子节点
        //当前这一步没有到达子节点，则取子节点覆盖范围最大的走一步
        int cover=0,nextStep=0,ans=0;
        for(int i=0;i<nums.length;i++){
            nextStep=Math.max(nextStep,i+nums[i]);//更新下一步能走的最远距离
            if(i==cover){//如果到达当前步的末尾
                if(i==nums.length-1)return ans;
                ans++;
                cover=nextStep;
                if(cover>=nums.length-1)return ans;
            }
        }
        return ans;

    }
}
