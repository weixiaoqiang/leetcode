import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 *
 * https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/description/
 *
 * algorithms
 * Easy (33.71%)
 * Likes:    219
 * Dislikes: 0
 * Total Accepted:    16.7K
 * Total Submissions: 49.3K
 * Testcase Example:  '[2,6,4,8,10,9,15]'
 *
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 
 * 你找到的子数组应是最短的，请输出它的长度。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 
 * 
 * 说明 :
 * 
 * 
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);

        
        int countstart=-1;
        int countend = nums.length;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != copy[i] && countstart==-1){
                countstart=i;
                break; 
            } 
        }
        for(int i = nums.length-1;i>0;i--){
            if(nums[i] != copy[i] && countend==nums.length){
                countend=i;
                break;
            }
        }
        if(countstart==-1 && countend==nums.length){
            return 0;
        }
        return countend -  countstart+1;
    }
}

// @lc code=end

