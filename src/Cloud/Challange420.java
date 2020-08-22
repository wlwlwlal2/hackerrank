package Cloud;

public class Challange420 {
	public static void main(String[] args) {
	    // ��� ��ü ���� �� �ʱ�ȭ
	    Knight knight = new Knight();
	    knight.name = "�Ƽ���";
	    knight.hp = 180;
	    knight.strength = 50;

	    // ���� ��ü ���� �� �ʱ�ȭ
	    Thief thief = new Thief();
	    thief.name = "�߸���";
	    thief.hp = 120;
	    thief.agility = 40;

	    // �� ĳ���� - �θ� Ÿ������ ��ü�� �ؼ�
	    Adventurer adv0 = knight;
	    Adventurer adv1 = thief;

	    // ��ĳ���� �� ��ü �迭
	    Adventurer[] advs = { adv0, adv1 };
	    
	    // ���� ���
	    for (int i = 0; i < advs.length; i++) {
	      System.out.println(advs[i].toString());
	    }
	  }
	}

	/* 1. �θ� Ŭ���� Adventurer�� ���弼��. */
	class Adventurer {
	  /* 1.1 ���� �ʵ带 �����ϼ���. */
		 /* 2.1 �θ�� �ߺ��� �ʵ带 �����ϼ���. */
		  String name;
		  int hp;
	  /* 1.2 ���� �޼ҵ带 �ۼ��ϼ���. */
	}

	/* 2. Knight�� Adventurer�� �ڽ� Ŭ������ �����ϼ���. */
	class Knight extends Adventurer {
	  /* 2.1 �θ�� �ߺ��� �ʵ带 �����ϼ���. */
	 
	  int strength; // ��

	  /* 2.2 �θ�� �ߺ��� �޼ҵ带 �����ϼ���. */
	  public void punch() {
	    System.out.printf("[%s]�� ��ġ!!\n", name);
	  }

	  public String toString() {
	    return String.format("[%s] HP: %d", name, hp);
	  }

	  public void berserker() {
	    System.out.println("ü�°� ���ݷ��� �����մϴ�.");
	  }
	}

	/* 3. Thief�� Adventurer�� �ڽ� Ŭ������ �����ϼ���. */
	class Thief extends Adventurer{
	  /* 3.1 �θ�� �ߺ��� �ʵ带 �����ϼ���. */
	  
	  int agility; // ��ø

	  /* 3.2 �θ�� �ߺ��� �޼ҵ带 �����ϼ���. */
	  public void punch() {
	    System.out.printf("[%s]�� ��ġ!!\n", name);
	  }

	  public String toString() {
	    return String.format("[%s] HP: %d", name, hp);
	  }

	  public void sharpen() {
	    System.out.println("ũ��Ƽ�� Ȯ���� �����մϴ�.");
	  }
	}

