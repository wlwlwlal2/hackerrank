package Cloud;

import java.util.ArrayList;

public class Challange430 {
	public static void main(String[] args) {
	    // �پ��� Ÿ���� ��ü ����
	    Food jokbal = new Food("����", 19800);
	    Electronics airpod = new Electronics("������", 199000);
	    Clothing shirt = new Clothing("����", 49900);
	
	    // Orderable Ÿ���� ���� ArrayList ����
	    ArrayList<Orderable> list = new ArrayList<Orderable>();
	    
	    // Orderable Ÿ������ �ؼ� ������, ��ü���� ���
	    list.add(jokbal);
	    list.add(airpod);
	    list.add(shirt);
	    
	    // ���� ���
	    int sum = 0;
	    for (int i = 0; i < list.size(); i++) {
	      Orderable temp = list.get(i);
	      sum += temp.discountedPrice();
	    }
	    
	    // ��� ���
	    System.out.printf("����: %d��\n", sum);
	  }
}

	interface Orderable {
	  public int discountedPrice();
	}

	class Food implements Orderable {
	  private String name;
	  private int price;
	  
	  public Food(String name, int price) {
	    this.name = name;
	    this.price = price;
	  }

	  /* 1. �������̵��� ����, ���� �������� �����ϼ���. */
	  public int discountedPrice() {
	    return (int) (price*0.9);
	  }
	}

	class Electronics implements Orderable {
	  private String name;
	  private int price;
	  
	  public Electronics(String name, int price) {
	    this.name = name;
	    this.price = price;
	  }
	  
	  /* 2. �������̵��� ����, ���ڱ�� �������� �����ϼ���. */
	  public int discountedPrice() {
	    return (int) (price*0.8);
	  }
	}

	class Clothing implements Orderable {
	  private String name;
	  private int price;
	  
	  public Clothing(String name, int price) {
	    this.name = name;
	    this.price = price;
	  }
	  
	  /* 3. �������̵��� ����, �Ƿ� �������� �����ϼ���. */
	  public int discountedPrice() {
	    return (int) (price*0.7);
	  }
	}

	
