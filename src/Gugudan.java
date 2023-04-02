import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//	System.out.println("구구단 중 출력할 단은? : ");
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
	
	// 6단
//	int i = 1;
//	while(i < 10) {
//		System.out.println(6 * i);
//		i = i + 1;
//	}
	
	// 7단
//	for(int j = 1; j < 10; j++) {
//		System.out.println(7 * j);
//	}
		
	// 8,9단
//	System.out.println("구구단 중 출력할 단은? : ");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	System.out.println("사용자가 입력한 값 : " + number);
//	
//	if(number < 2) {
//		System.out.println("값을 잘못 입력했습니다.");
//	} else if(number > 9) {
//		System.out.println("값을 잘못 입력했습니다.");
//	} else {
//		for(int i = 1; i< 10; i++) {
//			System.out.println(number * i);
//		}
//	}
		
	int[] result = new int[9];
	for(int i = 0; i < result.length; i++) {
		result[i] = 2 * (i + 1);
	}
	
	for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	
	result = new int[9]; // 기존에 있던 9개의 값 덮어 씌우는 것.
	for(int i = 0; i < result.length; i++) {
		result[i] = 3 * (i + 1);
	}
	
	for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	
	int[] times4 = new int[9]; // 기존에 있던 9개의 값 덮어 씌우는 것.
	for(int i = 0; i < times4.length; i++) {
		times4[i] = 4 * (i + 1);
	}
	
	for(int i = 0; i < times4.length; i++) {
		System.out.println(times4[i]);
	}
	

	}
}
