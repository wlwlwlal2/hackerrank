package Cloud;

public class Challange424 {
	public static void main(String[] args) {
	    // ��ü ����
	    Elf elf = new Elf("Ƽ����", 100);
	    HighElf high = new HighElf("��ǻ����", 160, 100);
	    ElfLord lord = new ElfLord("���̿���", 230, 140, 100);
	    
	    // ��ü �迭 ����
	    Elf[] elves = { elf, high, lord };
	    
	    // ��� ��ü ���� ���
	    for (int i = 0; i < elves.length; i++) {
	      System.out.println(elves[i].toString());
	    }
	  }
	}

	class Elf {
	  /* 1. ����� ���� ���� �����ڸ� ����ϼ���. */
	  protected String name;
	  protected int hp;
	  
	  public Elf(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }
	  
	  public String toString() {
	    return String.format("[����] Name: %s, HP: %d", name, hp);
	  }
	}

	class HighElf extends Elf {
	  protected int mp;
	  
	  public HighElf(String name, int hp, int mp) {
	    super(name, hp);
	    this.mp = mp;
	  }

	  public String toString() {
	    return String.format("[���̿���] Name: %s, HP: %d, MP: %d", name, hp, mp);
	  }
	}

	class ElfLord extends HighElf {
	  protected int shield;
	  
	  public ElfLord(String name, int hp, int mp, int shield) {
	    /* 2. �θ��� �����ڸ� ȣ���ϼ���. */
		  super(name, hp, mp);
	    this.shield = shield;
	  }

	  /* 3. toString() �޼ҵ带 �������̵�(������) �ϼ���. */
	  public String toString() {
		    return String.format("[�����ε�] Name: %s, HP: %d, MP: %d, SH: %d", name, hp, mp, shield);
		  }
	}

