package Cloud;

public class Challange431 {
	public static void main(String[] args) {
	    // ��ü ����
	    Artist kim = new Artist("�达");
	    Architect lee = new Architect("�̾�");
	    Developer2 park = new Developer2("�ھ�");
	    Lawyer choi = new Lawyer("�־�");

	    // �׷�ȭ: �������̽� ����
	    Friend[] friends = { kim, lee, park, choi };
	    for (Friend f : friends) {
	      f.dearFriend();
	    }
	  }
	}

	interface Friend {
	  public void dearFriend();
	}

	/* 1. �ش� Ŭ������ Friend �������̽��� �����ϼ���. */
	class Artist implements Friend {
	  private String name;
	  public Artist(String name) {
	    this.name = name;
	  }
	    public void dearFriend() {
	  	  System.out.printf("[������]%s -> Ī�� ���̰�!\n", name);
	  	}
	  }
	  /* 1.1 dearFriend() �޼ҵ带 �������̵� �ϼ���. */
	 

	/* 2. �ش� Ŭ������ Friend �������̽��� �����ϼ���. */
	class Architect implements Friend {
	  private String name;
	  public Architect(String name) {
	    this.name = name;
	  }
	  @Override
	  public void dearFriend() {
	  	  System.out.printf("[���డ]%s -> Ī�� ���̰�!\n", name);
	  	}
	  /* 2.1 dearFriend() �޼ҵ带 �������̵� �ϼ���. */
	}

	/* 3. �ش� Ŭ������ Friend �������̽��� �����ϼ���. */
	class Developer2 implements Friend {
	  private String name;
	  public Developer2(String name) {
	    this.name = name;
	  }
	  
	  public void dearFriend() {
	  	  System.out.printf("[������]%s -> Ī�� ���̰�!\n", name);
	  	}
	  /* 3.1 dearFriend() �޼ҵ带 �������̵� �ϼ���. */
	}

	/* 4. �ش� Ŭ������ Friend �������̽��� �����ϼ���. */
	class Lawyer implements Friend {
	  private String name;
	  public Lawyer(String name) {
	    this.name = name;
	  }
	  public void dearFriend() {
	  	  System.out.printf("[��ȣ��]%s -> Ī�� ���̰�!\n", name);
	  	}
	  /* 4.1 dearFriend() �޼ҵ带 �������̵� �ϼ���. */
}
