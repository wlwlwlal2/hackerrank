package Cloud;

public class Challange428 {
	public static void main(String[] args) {
	    // Person ��ü ����
	    Person0 park = new Person0("ȫ��");

	    // �� �������� ����
	    Developer devPark = park;
	    Instructor instPark = park;
	    Masseur masPark = park;
	    
	    /* 3. ������ �޼ҵ带 ȣ���Ͽ� �ڵ带 �ϼ��ϼ���. */
	    devPark.programming("Java");
	    instPark.teach("�ڷᱸ��");
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

	/* 1. Person Ŭ������ ������, ����, �������� ������ �ο��ϼ���. */
	class Person0 implements Developer, Instructor, Masseur {
	  private String name;
	  public Person0(String name) {
	    this.name = name;
	  }

	  /* 2. �����ϱ�� �� �������̽��� �޼ҵ带 �������̵� �ϼ���.*/
	  @Override
	  public void programming(String lang) {
		  System.out.println(name + " => " + lang + " ���α׷��� ��!");
	  }
	  @Override
	  public void teach(String subject) {
		  System.out.println(name + " => " + subject + " ���� ��!");
	  }
	  @Override
	  public void massage() {
		  System.out.println(name + " => " + "������ ��!");
	  }
	}
	 
	