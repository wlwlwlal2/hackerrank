package Cloud;

public class Challange418 {
	public static void main(String[] args) {
	    // ��ü ���� �� �ʱ�ȭ
	    Novice novice = new Novice();
	    novice.name = "���ε�";
	    novice.hp = 100;
	    
	    Wizard wizard = new Wizard();
	    wizard.name = "�ظ�����";
	    wizard.hp = 120;
	    wizard.mp = 100;
	    
	    // �� ��ü�� ��ġ
	    novice.punch();
	    wizard.punch();
	    
	    // ���ڵ� ��ü�� ���̾
	    wizard.fireball();
	  }
	}

	class Novice {
	  String name;
	  int hp;
	  
	  public void punch() {
	    System.out.printf("[%s]�� ��ġ!!\n", name);
	  }
	}

	/* 1. Wizard Ŭ������ Novice Ŭ�����κ��� Ȯ���ϼ���. */
	class Wizard extends Novice{
	  /* 2. mp �ʵ带 �߰��ϼ���. */
	  int mp;
	  
	  /* 3. fireball() �޼ҵ带 ���弼��. */
	  public void fireball() {
	    System.out.printf("[%s]�����̾@@", name);
	  }
	}
