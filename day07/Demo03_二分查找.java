class Demo03_���ֲ��� {
	public static void main(String[] args) {
		int[] nums = {11, 33, 66, 77, 88, 99, 666};

		/*//�ҵ�ֵΪ33��Ԫ��
		//��������������ȷ��Ѱ��Ԫ�صķ�Χ
		int i = 0;
		int j = nums.length - 1;
		//��ߵķ�Χ���ܳ����ұߵķ�Χ
		while (i <= j) {
			//���㵱ǰ��Χ���м�λ�õ�����
			int mid = (i + j) / 2;
			//��Ҫ�ҵ�Ԫ�غ��м�Ԫ�رȽ�
			if (100 < nums[mid]) {//���Ҫ�ҵı��м��С��������ߵ�λ��Ѱ��
				j = mid - 1;//���ұߵı߽磬�ƶ���mid�����
			} else if (100 > nums[mid]) {//���Ҫ�ҵı��м�Ĵ󣬾����ұߵ�λ��Ѱ��
				i = mid + 1;//��Ҫ����ߵı߽磬�ƶ���mid���ұ�
			} else {//������м�λ�õ�Ԫ����ȣ���˵���ҵ���
				System.out.println(mid);//��ӡ����
				break;//��ֹѭ��
			}
		}
		//ѭ����ֹ�����ֿ��ܣ�һ�����ҵ��ˣ���һ����û���ҵ������û���ҵ�����ô��ߵı߽�һ���Ǵ������ұߵı߽�
		if (i > j) {
			System.out.println("û�ҵ�");
		}*/
		System.out.println(binarySearch(nums, 33));
		System.out.println(binarySearch(nums, 100));
	}

	//����һ����������ָ���������У���ѯָ��ֵ������������Ҳ������ͷ���-1
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
				return mid;//����ҵ��ˣ���ֱ�ӷ��أ�����������
			}
		}
		//���ѭ���������ˣ���û��return��������û�н�����������˵��û���ҵ�
		return -1;
	}
}
