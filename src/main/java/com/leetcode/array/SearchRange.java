package com.leetcode.array;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？

 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 */
public class SearchRange {

    public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        searchRange.searchRange(new int[]{1}, 1);
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = 0;
        int index = -1;
        while(left <= right) {
            mid = (left+right)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        if (index == -1) return new int[]{-1, -1};
        left = index; right = index;
        while(left>=0 && nums[left]==target) left--;
        while(right<nums.length && nums[right]==target) right++;
        return new int[]{left+1, right-1};
    }
}
