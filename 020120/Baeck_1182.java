import java.util.*;

public class Baeck_1182 {
	
	static int res = 0;
	static int[] ns = new int[2];
	
	public static void main(String[] args) {
		Scanner	 sc = new Scanner(System.in);
		// 0 : N
		ns[0] = sc.nextInt();
		// 1 : S
		ns[1] = sc.nextInt();
		
		int[] num = new int[ns[0]+1];
		
		for(int i = 0; i < ns[0]; i++) {
			num[i] = sc.nextInt();
		}
		PSS(num, 0, 0);
		
		System.out.println(res);
	}
	
	public static void PSS(int[] num, int i, int sum) {
		int temp = sum + num[i];
		// �ε����� N���� ũ�ų� ������ return
		// �ش�� ���� S�� �����ϸ� ����� ��� 
		if(i >= ns[0]) {
			return;
		}
		if(temp == ns[1]) {
			res++;
		}
		// ����Ž��
		// 1. ������ �ε����� ���ذ��� �κм��� ����
		PSS(num, i+1, temp);
		
		// 2. ������ �ε����� ������ �ʰ� �� �������� �κм��� ����
		PSS(num, i+1, sum);
	}
}
