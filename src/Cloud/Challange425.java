package Cloud;

public class Challange425 {
	public static void main(String[] args) {
	    // ��ü ����
	    Person park = new Person("ȫ��");
	    
	    // ��ü�� �������̽�(����)�� ĳ����(�ؼ��ϱ�)
	    Son son = (Son) park;
	    
	    // (�Ƶ�μ��� ��û) ���� �� ��~!
	    son.pleaseCook();
	    
	    // (�Ƶ�μ��� ��û) ���� �����!
	    son.sayILoveYou();
	  }
	}

	/* Son �������̽��� �ʿ��� ������Ÿ�� �޼ҵ带 ���弼��. */
	interface Son {
	  /* 1. ���� �� ��~ */
	  /* 2. ���� �����! */
		
		public void pleaseCook();
		
		public void sayILoveYou();
	}
	
	

	class Person implements Son {
	  String name;
	  
	  public Person(String name) {
	    this.name = name;
	  }
	  
	  public void pleaseCook() {
	    System.out.println("���� �� ��~!");
	  }
	  
	  public void sayILoveYou() {
	    System.out.println("���� �����!");
	  }
	}
