package Cloud;

public class Challange427 {
	public static void main(String[] args) {
	    // ����� ��ü ����
	    HolyKnight uther = new HolyKnight("�켭", 180);
	    
	    // ��Ŀ�μ��� ���� ����
	    Tanker t = uther;
	    t.increaseHp();
	    
	    // �����μ��� ���� ����
	    Healer h = uther;
	    h.heal();
	  }
	}

	interface Tanker {
	  public void increaseHp();
	}

	interface Healer {
	  public void heal();
	}

	/* 1. ��Ŀ�� ���� ������ �ο��ϼ���. */
	class HolyKnight implements Healer, Tanker  {
	  private String name; int hp;

	  public void increaseHp () {
		  System.out.println("��ü ü�� +50 ������ŵ�ϴ�.");
	  }
	  
	  public void heal () {
		  System.out.println("ü���� +30 ȸ���մϴ�.");
	  }
	  
	  public HolyKnight(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  /* 2. Tanker�� �޼ҵ带 �������̵��ϼ���. */
	  /* 3. Healer�� �޼ҵ带 �������̵��ϼ���. */
	}

