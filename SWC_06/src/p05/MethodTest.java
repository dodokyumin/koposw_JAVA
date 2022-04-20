package p05;

public class MethodTest {

	static int k44_iStatic;	//static을 통해서 iStatic이라는 정수형 변수를 전역 변수로 선언해준다.
	
	public static void add(int k44_i) {	//iStatic과 파라미터로 받은 i에 1씩 더해주는 add함수.
		k44_iStatic++;
		k44_i++;
		System.out.printf("add메소드에서 -> iStatic = [%d]\n",k44_iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n",k44_i);
	}
	
	public static int add2(int k44_i) {	////iStatic과 파라미터로 받은 i에 1씩 더해주는 add함수. 정수형 i를 리턴한다.
		k44_iStatic++;
		k44_i++;
		System.out.printf("add메소드에서 -> iStatic = [%d]\n",k44_iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n",k44_i);
		return k44_i;
	}
	
	public static void main(String[] args) {
		
		int k44_iMain;
		
		k44_iMain = 1;
		k44_iStatic = 1;

		System.out.printf("**********************\n");
		System.out.printf("메소드호출전 메인에서 -> iStatic = [%d]\n",k44_iStatic); //2
		System.out.printf("메소드호출전 메인에서 -> iMain = [%d]\n",k44_iMain); //1
		System.out.printf("**********************\n");
		
		add(k44_iMain);	//add메소드에 iMain(1)값을 넣어주어 sysout으로 출력한다. 출력 자료형이 void이므로.

		System.out.printf("**********************\n");
		System.out.printf("메소드호출후 메인에서 -> iStatic = [%d]\n",k44_iStatic);	// 3이 나올것을 예상
		System.out.printf("메소드호출후 메인에서 -> iMain = [%d]\n",k44_iMain);	// 2가 나올것을 예상
		System.out.printf("**********************\n");

		k44_iMain = add2(k44_iMain); //add메소드에 iMain(1)값을 넣어주어 리턴값 i를 받음.

		System.out.printf("**********************\n");
		System.out.printf("메소드 add2호출후 메인에서 -> iStatic = [%d]\n",k44_iStatic);	// 3이 나올것을 예상
		System.out.printf("메소드 add2호출후 메인에서 -> iMain = [%d]\n",k44_iMain);	// 2가 나올것을 예상
		System.out.printf("**********************\n");
		
	}

}