package test;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 뜁니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴  돕니다.");
	}

	@Override
	public void showPlayerLevel() {
		System.out.println("*****상급자 레벨입니다.*****");
	}

}
