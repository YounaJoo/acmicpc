import java.util.*;

public class Baeck_10448 {
	// �̰� ��� ó���ؾ����� �𸣰ڴ�
	// �ﰢ���� �� Tn�� ���ؼ� n * (n + 1) / 2�ε� �ڿ����� 3~1000����
	// �� ������ �Ǵ� �ڿ����� n�ϱ� ������ϱ� 
	// �˻��غ��ϱ� ������̴�(n���� �Ӿ� ����)
	// ����� �غ��� n * (n + 1) / 2 < 1000 �̶�� n�� 44������
	// 1���� 44���� �ش� �Ŀ� �´� �����͸� �־��ְ�
	// ���� Ž������ �� ���� �ش�Ǵ� ���� ������ true ������ false�ε�
	// �� ���� �ش�ȴٴ� ���ǹ��� ã���� �� �� ����
	// �ٵ� �𸣰ڴ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] memo = new int [46];
		boolean[] res = new boolean[n + 1];
		

		
		// �ش�Ǵ� �� ����
		for(int i = 1; i <= 45; i++) {
			memo[i] = (i * (i + 1)) / 2;
		}
		
		// ���ǹ� ���ñ⿩
		// �� �� �� �� �¾� ���� Ž���̴ϱ�
		// 1 ~ 45���� �ش�Ǵ� ������ �����ְ� �װ� i���� �´��� Ȯ���ϸ� �Ǵ°� �Ƴ�
		// ù ��° ���̶� �� ���� �� 1�� �Ƚ��ϰ� 3��°�� 1~45���� �� Ž���ؼ� �Ǵ��� ã���� �Ǵ°� �ƴѰ�
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 1; j <= 45; j++) {
				for(int l = 1; l <= 45; l++) {
					for(int m = 1; m <= 45; m++) {
						if(memo[j] + memo[l] + memo[m] == k) {
							res[i] = true;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(res[i]) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
