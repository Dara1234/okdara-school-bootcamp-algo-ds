public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    int ind = 0, n = nums.length; // where to place
    for (int i = 0; i < n - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[ind] = nums[i];
        ind++;
      }
    }
    nums[ind] = nums[n - 1];
    return ind + 1;
  }
}
