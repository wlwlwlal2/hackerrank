package Cloud;

public class Challange431 {
	public static void main(String[] args) {
	    // 객체 생성
	    Artist kim = new Artist("김씨");
	    Architect lee = new Architect("이씨");
	    Developer2 park = new Developer2("박씨");
	    Lawyer choi = new Lawyer("최씨");

	    // 그룹화: 인터페이스 기준
	    Friend[] friends = { kim, lee, park, choi };
	    for (Friend f : friends) {
	      f.dearFriend();
	    }
	  }
	}

	interface Friend {
	  public void dearFriend();
	}

	/* 1. 해당 클래스에 Friend 인터페이스를 구현하세요. */
	class Artist implements Friend {
	  private String name;
	  public Artist(String name) {
	    this.name = name;
	  }
	    public void dearFriend() {
	  	  System.out.printf("[예술가]%s -> 칭구 아이가!\n", name);
	  	}
	  }
	  /* 1.1 dearFriend() 메소드를 오버라이딩 하세요. */
	 

	/* 2. 해당 클래스에 Friend 인터페이스를 구현하세요. */
	class Architect implements Friend {
	  private String name;
	  public Architect(String name) {
	    this.name = name;
	  }
	  @Override
	  public void dearFriend() {
	  	  System.out.printf("[건축가]%s -> 칭구 아이가!\n", name);
	  	}
	  /* 2.1 dearFriend() 메소드를 오버라이딩 하세요. */
	}

	/* 3. 해당 클래스에 Friend 인터페이스를 구현하세요. */
	class Developer2 implements Friend {
	  private String name;
	  public Developer2(String name) {
	    this.name = name;
	  }
	  
	  public void dearFriend() {
	  	  System.out.printf("[개발자]%s -> 칭구 아이가!\n", name);
	  	}
	  /* 3.1 dearFriend() 메소드를 오버라이딩 하세요. */
	}

	/* 4. 해당 클래스에 Friend 인터페이스를 구현하세요. */
	class Lawyer implements Friend {
	  private String name;
	  public Lawyer(String name) {
	    this.name = name;
	  }
	  public void dearFriend() {
	  	  System.out.printf("[변호사]%s -> 칭구 아이가!\n", name);
	  	}
	  /* 4.1 dearFriend() 메소드를 오버라이딩 하세요. */
}
