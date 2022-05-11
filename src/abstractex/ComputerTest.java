package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); //=>추상클래스는 인스턴스로 생성할 수 없다.
		Computer c2 = new DeskTop(); 	//=>추상클래스에서도 형 변환을 사용할 수는 있다.
		//Computer c3 = new NoteBook() {
		Computer c4 = new MyNoteBook(); 
	}

}
