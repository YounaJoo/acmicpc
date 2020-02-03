import java.util.*;

public class Baeck_1018 {

	// 1���� ���� ���� �������µ�
	// B�� �����ϴ� �Ͱ� W�� �����ϴ� STRING �迭 ���� �ϳ��ϳ� ���ϱ�? 
	// ������ ����� �ּҰ� INT ���̴�?
	
	public static String[] WB = {
			"WBWBWBWB", "BWBWBWBW", 
			"WBWBWBWB", "BWBWBWBW", 
            "WBWBWBWB", "BWBWBWBW", 
            "WBWBWBWB", "BWBWBWBW"
	};
	
	public static String[] BW = {
			"BWBWBWBW", "WBWBWBWB",
			"BWBWBWBW", "WBWBWBWB", 
			"BWBWBWBW", "WBWBWBWB", 
			"BWBWBWBW", "WBWBWBWB"
	}; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		String[] str = new String[m];
		
		// �̰� ��� ��� �����Ϸ��� ����ϴٰ� �� ū���� �����ؼ� �� ��
		int res = Integer.MAX_VALUE;
		
		for(int i = 0; i < m; i++) {
			str[i] = sc.next();
		}
		
		// �������� �������� 8X8�� �ڸ��� 
		for(int i = 0; i <= m - 8; i++) {
			for(int j = 0; j <= n - 8; j++) {
				// �ƾƾƾ� �̰� ���󤿤���
				// �Լ��� �ѱ��� ���⼭ �� �����ϰ� Ǯ�� ���
				int resBW = 0;
				int resWB = 0;
				// BW
				for(int k = 0; k < 8; k++) {
					// ���η� 8�� �ڸ���
					String temp = str[i + k].substring(j, j + 8);
					
					// ���ϱ� �� �κ� �� �����ϰ� �ȵǳ� ���� �ΰ� �� ����
					for(int l = 0; l < 8; l++) {
						if(temp.charAt(l) == BW[k].charAt(l)) {
							resBW++;
						}
						if(temp.charAt(l) == WB[k].charAt(l)) {
							resWB++;
						}
					}
				}
				int t = Math.min(resBW, resWB);
				res = res > t ? t : res;
			}
		}
		
		System.out.println(res);
	}
}
