package Cloud;

public class Challange419 {
	public static void main(String[] args) {
	    // ��ü ����
	    Pet dog = new Pet();
	   
	    /* 4. ��ü�� �ʱ�ȭ�ϼ���. */ 
	    dog.name = "��������";
	    dog.age = 3;
	    dog.price = 2200000;
	    
	    // ���� ���
	    System.out.printf("Pet { name: %s, age: %d��, price: %d�� }", dog.name, dog.age, dog.price);
	  }
	}

	class Animal {
	  String name; // �̸�

	  public void cry() {
	    System.out.println("������ ��ϴ�!");
	  }
	}

	/* 1. Pet Ŭ������ Animal�κ��� Ȯ�� ���� �ϼ���. */
	class Pet extends Animal {
	  /* 2. �θ� Ŭ���� Animal�� �ߺ��Ǵ� �ʵ带 �����ϼ���. */
	  int age;     // ����
	  int price;   // ����
	  
	  /* 3. �θ� Ŭ���� Animal�� �ߺ��Ǵ� �޼ҵ带 ���켼��. */
	  public void play() {
	    System.out.println("�ֿ� ������ �峭�� Ĩ�ϴ�~");
	  }
	}


