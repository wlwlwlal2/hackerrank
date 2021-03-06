package Cloud;

public class Challange426 {
	public static void main(String[] args) {
	    // 객체 생성
	    SmartPhone iPhone = new SmartPhone("아이폰 X");
	    
	    // 객체를 알람 인터페이스(역할)로 해석
	    Alarm alarm = (Alarm) iPhone;
	    
	    // 알람 기기의 비프음 내기
	    alarm.beep();

	    // 알람 기기의 음악 재생하기
	    alarm.playMusic("상어송");
	  }
	}

	interface Alarm {
	  public void beep();                  // 비프음
	  public void playMusic(String title); // 음악 재생
	  
	  
	}

	/* 1. Alarm 인터페이스를 해당 클래스에 구현하세요. */
	class SmartPhone implements Alarm {
	  private String name; // 모델명

	  public SmartPhone(String name) {
	    this.name = name;
	  }

	  /* 2. beep() 메소드를 오버라이딩(재정의) 하세요. */
	  /* 3. playMusic() 메소드를 오버라이딩하세요. */
	  
	  public void beep() {
		  System.out.println("삐빕! 삐비비빕~!");
	  }
	  
	  public void playMusic(String title) {
		  System.out.println("[" + title + "]" + "을 재생합니다");
	  }
}