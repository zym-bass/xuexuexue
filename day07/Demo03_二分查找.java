class Demo03_二分查找 {
	public static void main(String[] args) {
		int[] nums = {11, 33, 66, 77, 88, 99, 666};

		/*//找到值为33的元素
		//定义两个变量，确定寻找元素的范围
		int i = 0;
		int j = nums.length - 1;
		//左边的范围不能超过右边的范围
		while (i <= j) {
			//计算当前范围的中间位置的索引
			int mid = (i + j) / 2;
			//让要找的元素和中间元素比较
			if (100 < nums[mid]) {//如果要找的比中间的小，就在左边的位置寻找
				j = mid - 1;//让右边的边界，移动到mid的左边
			} else if (100 > nums[mid]) {//如果要找的比中间的大，就在右边的位置寻找
				i = mid + 1;//需要将左边的边界，移动到mid的右边
			} else {//如果和中间位置的元素相等，就说明找到了
				System.out.println(mid);//打印出来
				break;//终止循环
			}
		}
		//循环终止有两种可能，一种是找到了，另一种是没有找到，如果没有找到，那么左边的边界一定是大于了右边的边界
		if (i > j) {
			System.out.println("没找到");
		}*/
		System.out.println(binarySearch(nums, 33));
		System.out.println(binarySearch(nums, 100));
	}

	//定义一个方法，在指定的数组中，查询指定值的索引，如果找不到，就返回-1
	public static int binarySearch(int[] arr, int key) {
		int i = 0;
		int j = arr.length - 1;

		while (i <= j) {
			int mid = (i + j) / 2;

			if (key < arr[mid]) {
				j = mid - 1;
			} else if (key > arr[mid]) {
				i = mid + 1;
			} else {
				return mid;//如果找到了，就直接返回，并结束方法
			}
		}
		//如果循环都结束了，还没有return方法，还没有结束方法，就说明没有找到
		return -1;
	}
}
