package finalex;

public class UsingDefine {

	public static void main(String[] args) {
		//※static으로 선언 했으므로 인스터스를 생성하지않고 클래스 이름으로 참조 가능
		System.out.println(Define.Good_MORNIG);
		System.out.println("최솟값은 " + Define.MIN + "입니다.");
		System.out.println("최댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.") ;
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
	}

}
