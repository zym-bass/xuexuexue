class Demo01_ð������ {
	public static void main(String[] args) {
		int[] nums = {99, 66, 88, 11, 33, 22, 55};
		printArr(nums);

		/*//��Ҫ����6�ˣ���������
		for (int i = 1; i < nums.length; i++) {
			//��i�ˣ��ȽϵĴ�����Ӧ����nums.length - i
			for (int j = 1; j <= nums.length - i; j++) {
				//j�ڴ˴���������ʾ�ȽϵĴ�����������Ҫ����Ԫ�أ�����jҲ��Ҫ��ʾÿ��Ԫ�ص�����
				//j�����Ǵ�1��ʼ�ģ����ԣ�ֻ����j��j-1�����ϵ�����Ԫ�رȽ�
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

	//����һ�����������Դ�ӡָ�������ȫ��Ԫ��
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//����һ�����������Զ�ָ�����������ð������
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
