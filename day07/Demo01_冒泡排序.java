class Demo01_冒泡排序 {
	public static void main(String[] args) {
		int[] nums = {99, 66, 88, 11, 33, 22, 55};
		printArr(nums);

		/*//需要排序6趟，才能有序
		for (int i = 1; i < nums.length; i++) {
			//第i趟，比较的次数，应该是nums.length - i
			for (int j = 1; j <= nums.length - i; j++) {
				//j在此处，不仅表示比较的次数，由于需要交换元素，所以j也需要表示每个元素的索引
				//j由于是从1开始的，所以，只能让j和j-1索引上的两个元素比较
				if (nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}*/
		bubbleSort(nums);

		printArr(nums);
	}

	//定义一个方法，可以打印指定数组的全部元素
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//定义一个方法，可以对指定的数组进行冒泡排序
	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {//j arr.length - i - 1     i=1		arr.length-2											
													  //j+1  arr.length - i					arr.length-1
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
