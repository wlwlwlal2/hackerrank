package Cloud;

public class Challange426 {
	public static void main(String[] args) {
	    // ��ü ����
	    SmartPhone iPhone = new SmartPhone("������ X");
	    
	    // ��ü�� �˶� �������̽�(����)�� �ؼ�
	    Alarm alarm = (Alarm) iPhone;
	    
	    // �˶� ����� ������ ����
	    alarm.beep();

	    // �˶� ����� ���� ����ϱ�
	    alarm.playMusic("����");
	  }
	}

	interface Alarm {
	  public void beep();                  // ������
	  public void playMusic(String title); // ���� ���
	  
	  
	}

	/* 1. Alarm �������̽��� �ش� Ŭ������ �����ϼ���. */
	class SmartPhone implements Alarm {
	  private String name; // �𵨸�

	  public SmartPhone(String name) {
	    this.name = name;
	  }

	  /* 2. beep() �޼ҵ带 �������̵�(������) �ϼ���. */
	  /* 3. playMusic() �޼ҵ带 �������̵��ϼ���. */
	  
	  public void beep() {
		  System.out.println("�ߺ�! �ߺ���~!");
	  }
	  
	  public void playMusic(String title) {
		  System.out.println("[" + title + "]" + "�� ����մϴ�");
	  }
}