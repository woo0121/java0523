package CH01;

public class c02SystemOut {

	public static void main(String[] args) {
		
		
//		System : OS
//		System.out : OS가 관리하는 표준 출력 스트링
		
		
//		System.out.print();
//		ESCAPE문자 : 그래픽 a-z, 0-9, 특수문자
//				    제어 : ctrl,tab,esc
//		\n : 개별, 줄바꿈
//		\b : 엑스페이스
//		\t : 탭길이 (기본 8칸) 만큼 커서이동
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HE\tLLOWORLD\n");
		
		
//		System.out.printf();
		System.out.printf("%d %d %d \n" , 10, 20, 30);
		System.out.printf("%f %f %f \n" , 10.1, 20.1, 30.1);
		System.out.printf("%c %c %c \n" , 'A', 'B', 'C');
		System.out.printf("%s %s %s \n" , "This is", "String", "Test");
		System.out.printf("%d %s : %d\n" , 1, "국어", 100);
//		System.out.printf();
		
//		System.out.println();
		
		System.out.println();

	}

}
