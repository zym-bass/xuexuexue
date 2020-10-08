class Demo02_选择排序 {
	public static void main(String[] args) {
		int[] nums = {99, 66, 88, 11, 33, 22, 55};
		Demo01_冒泡排序.printArr(nums);

		//从索引为0开始，依次确定该索引上的值：应该是后面所有元素的最小值
		//索引一直到最大索引-1即可，最后一个索引不需要确定
		/*for (int i = 0; i < nums.length - 1; i++) {
			//找到i索引后面的所有元素的最小值，存储到i索引上
			//找最小值的思路：i+1和i比较，i+2和i比较，如果发现后面的元素小，就和i索引的元素交换
			for (int j = i + 1; j < nums.length; j++) {
				//
				if (nums[j] < nums[i]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}*/

		selectSort(nums);

		//调用上个类中的打印数组的方法，打印出数组中的全部元素
		Demo01_冒泡排序.printArr(nums);
	}

	//定义一个方法，可以对指定的数组进行选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} 
}
