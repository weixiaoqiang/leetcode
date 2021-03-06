import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 *
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/description/
 *
 * algorithms
 * Easy (44.55%)
 * Likes:    70
 * Dislikes: 0
 * Total Accepted:    7.3K
 * Total Submissions: 16.2K
 * Testcase Example:  '[1,3,2,2,5,2,3,7]'
 *
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * 
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [1,3,2,2,5,2,3,7]
 * 输出: 5
 * 原因: 最长的和谐数组是：[3,2,2,2,3].
 * 
 * 
 * 说明: 输入的数组长度最大不超过20,000.
 * 
 */

// @lc code=start
class Solution {
    static int maxLHS = 0;
    static int count = 0;

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i =0;i<nums.length;i++){
            int end=i+1;
            while((end)<nums.length && nums[end]-nums[i]<=1){
                end++;
            }
            if(nums[end-1]-nums[i]==1){
                res = Math.max(res,end-i);
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        findLHS(new int[]{1,1,1,1});
    }
}
// @lc code=end

