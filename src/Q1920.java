//基于排列构建数组
public class Q1920 {
    //根据示例解释无脑写即可 无难度
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
