import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//	System.out.println("������ �� ����� ����? : ");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	System.out.println(number * 1);
//	System.out.println(number * 2);
//	System.out.println(number * 3);
//	System.out.println(number * 4);
//	System.out.println(number * 5);
//	System.out.println(number * 6);
//	System.out.println(number * 7);
//	System.out.println(number * 8);
//	System.out.println(number * 9);
	
	// 6��
//	int i = 1;
//	while(i < 10) {
//		System.out.println(6 * i);
//		i = i + 1;
//	}
	
	// 7��
//	for(int j = 1; j < 10; j++) {
//		System.out.println(7 * j);
//	}
		
	// 8,9��
	System.out.println("������ �� ����� ����? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("����ڰ� �Է��� �� : " + number);
	
	if(number < 2) {
		System.out.println("���� �߸� �Է��߽��ϴ�.");
	} else if(number > 9) {
		System.out.println("���� �߸� �Է��߽��ϴ�.");
	} else {
		for(int i = 1; i< 10; i++) {
			System.out.println(number * i);
		}
	}
	

	}
}
