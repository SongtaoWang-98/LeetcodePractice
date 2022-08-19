import java.util.HashMap;

//两数之和
public class Q1 {
    //普通的暴力穷举 时间复杂度O(n^2) 空间复杂度O(1)
    public int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //用空间换时间 将每个元素与target的差值为key，该元素下标为value保存在hashmap中，若map有当前元素的key则表明找到两数的位置
    //时间复杂度O(n) 空间复杂度O(n)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            else {
                map.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}
