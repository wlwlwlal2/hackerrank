package Cloud;

public class Challange425 {
	public static void main(String[] args) {
	    // 객체 생성
	    Person park = new Person("홍팍");
	    
	    // 객체를 인터페이스(역할)로 캐스팅(해석하기)
	    Son son = (Son) park;
	    
	    // (아들로서의 요청) 엄마 밥 좀~!
	    son.pleaseCook();
	    
	    // (아들로서의 요청) 엄마 사랑해!
	    son.sayILoveYou();
	  }
	}

	/* Son 인터페이스에 필요한 프로토타입 메소드를 만드세요. */
	interface Son {
	  /* 1. 엄마 밥 좀~ */
	  /* 2. 엄마 사랑해! */
		
		public void pleaseCook();
		
		public void sayILoveYou();
	}
	
	

	class Person implements Son {
	  String name;
	  
	  public Person(String name) {
	    this.name = name;
	  }
	  
	  public void pleaseCook() {
	    System.out.println("엄마 밥 좀~!");
	  }
	  
	  public void sayILoveYou() {
	    System.out.println("엄마 사랑해!");
	  }
	}

