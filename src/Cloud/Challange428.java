package Cloud;

public class Challange428 {
	public static void main(String[] args) {
	    // Person 객체 생성
	    Person0 park = new Person0("홍팍");

	    // 각 직업으로 변신
	    Developer devPark = park;
	    Instructor instPark = park;
	    Masseur masPark = park;
	    
	    /* 3. 직업별 메소드를 호출하여 코드를 완성하세요. */
	    devPark.programming("Java");
	    instPark.teach("자료구조");
	    masPark.massage();
	  }
	}

	interface Developer {
	  public void programming(String lang);
	}

	interface Instructor {
	  public void teach(String subject);
	}

	interface Masseur {
	  public void massage();
	}

	/* 1. Person 클래스에 개발자, 강사, 마사지사 역할을 부여하세요. */
	class Person0 implements Developer, Instructor, Masseur {
	  private String name;
	  public Person0(String name) {
	    this.name = name;
	  }

	  /* 2. 구현하기로 한 인터페이스의 메소드를 오버라이딩 하세요.*/
	  @Override
	  public void programming(String lang) {
		  System.out.println(name + " => " + lang + " 프로그래밍 중!");
	  }
	  @Override
	  public void teach(String subject) {
		  System.out.println(name + " => " + subject + " 수업 중!");
	  }
	  @Override
	  public void massage() {
		  System.out.println(name + " => " + "마사지 중!");
	  }
	}
	 
	