class Demo02_ѡ������ {
	public static void main(String[] args) {
		int[] nums = {99, 66, 88, 11, 33, 22, 55};
		Demo01_ð������.printArr(nums);

		//������Ϊ0��ʼ������ȷ���������ϵ�ֵ��Ӧ���Ǻ�������Ԫ�ص���Сֵ
		//����һֱ���������-1���ɣ����һ����������Ҫȷ��
		/*for (int i = 0; i < nums.length - 1; i++) {
			//�ҵ�i�������������Ԫ�ص���Сֵ���洢��i������
			//����Сֵ��˼·��i+1��i�Ƚϣ�i+2��i�Ƚϣ�������ֺ����Ԫ��С���ͺ�i������Ԫ�ؽ���
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

		//�����ϸ����еĴ�ӡ����ķ�������ӡ�������е�ȫ��Ԫ��
		Demo01_ð������.printArr(nums);
	}

	//����һ�����������Զ�ָ�����������ѡ������
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
