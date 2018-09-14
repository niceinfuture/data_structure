public class Main {
	private static Main main = new Main();

	public static void main(String[] args) {
		main.twoSum();
	}

	/**
	 * 1. 两数之和 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int i = 0, j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] == target) {
				return new int[] { i, j };
			} else if (nums[i] + nums[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] { -1, -1 };
	}

	public void twoSum() {
		int[] a = new int[] { 2, 7, 11, 15 };
		int[] reslut = main.twoSum(a, 18);
		System.out.println(reslut[0] + "," + reslut[1]);
	}
}
