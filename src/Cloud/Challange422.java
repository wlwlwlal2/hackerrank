package Cloud;

public class Challange422 {
	 public static void main(String[] args) {
		    // ��ü ����
		    Basketball b = new Basketball();
		    Soccer s = new Soccer();
		    PingPong p = new PingPong();
		    
		    // ��ü �ʵ� �ʱ�ȭ
		    b.name = "��";
		    s.name = "�౸";
		    p.name = "Ź��";
		    
		    // �θ� Ÿ��(�� ĳ����)���� �迭 ����
		    Sports[] sportsArr = { b, s, p };
		    
		    // ��� � ���� ���
		    for (int i = 0; i < sportsArr.length; i++) {
		      Sports tmp = sportsArr[i];
		      tmp.description();
		    }
		  }
		}

		// �
		class Sports {
		  /* 1. ��� ���� �� ���� ��Ű�������� �ش� �ʵ带 �������� ���� �ϼ���. */
		  protected String name;
		  
		  public void description() {
		    System.out.printf("[%s]�� ����/���/ü�� �ܷ� ���� ���� ��ü ��Դϴ�.\n", name);
		  }
		}

		// ��
		class Basketball extends Sports {
		  /* 2. �޼ҵ� �������̵�(������)�� ���� ���� �������ּ���. */
		  public void description() {
			 System.out.printf("[%s]�� ������ ���� ���� ���� �ִ� ��̴�.\n", name);
		  }
		}

		// �౸
		class Soccer extends Sports {
		  /* 3. �޼ҵ� �������̵�(������)�� ���� �౸�� �������ּ���. */
		  public void description() {
			 System.out.printf("[%s]�� �ַ� �߷� ���� �� �ִ� ��̴�.\n", name);
		  }
		}

		// Ź��
		class PingPong extends Sports {
		  /* 4. �޼ҵ� �������̵�(������)�� ���� Ź���� �������ּ���. */
		  public void description() {
			  System.out.printf("[%s]�� ���� �����ư��� �ְ� �޴� ��̴�.\n", name);
		  }
		}


