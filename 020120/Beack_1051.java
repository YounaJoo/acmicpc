import java.util.*;


public class Beack_1051 {
	
	// ����
	// M�� N�� ���� ��
	// �� �������� ������ �� �� ���̰� ���� ū���� ã�� ����
	// ������ ������ ������ �� �����ϰ� 
	// ������ �Ǵ� ����?�� �Ƚ��ϰ� �ϳ��ϳ� �� ���غ���.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int len = 0;
		int res = 1;
		
		String[] temp = new String [n+1];
		int[][] num = new int [n+1][m+1];
		
		// �Է¹ޱ�
		// ����Ű ����� ������
		//for(int i = 0; i < n; i++) {
		//	for(int j = 0; j < m; j++) {
		//		num[i][j] = sc.nextInt();
		//	}
		//}
		
		for(int i = 0; i < n; i++) {
			temp[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				num[i][j] = (temp[i].charAt(j));
			}
		}
		
		// ������ �Ǵ� ���� �Ƚ��ϱ�
		if(n > m) { // ���ΰ� �� ���
			len = m;
		}else {
			len = n;
		}
		
		// for�� ������
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 1; k < len; k++) {
					// ���� ���� �ְ� �� ���������� ���� �����϶� ������� ������
					if(i + k < n && j + k < m &&
					   num[i + k][j] == num[i][j] &&
					   num[i + k][j + k] == num[i][j] &&
					   num[i][j + k] == num[i][j]) {
						res = Math.max(res, k + 1);
					}
				}
			}
		}
		
		System.out.println(res * res);
		
	}
}
