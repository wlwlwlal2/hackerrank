package Cloud;

public class Challange423{
public static void main(String[] args) {
    // �ǹ� ��ü ����
    Building myBuilding = new Building(150, 10);
  }
}

// ����
class Land {
  protected int area; // ���� ���
  
  public Land(int area) {
    System.out.println("[Land]�� ������ ȣ��!");
    this.area = area;
    System.out.printf("=> %d���� ������,\n", area);
  }
}

// �ǹ�
class Building extends Land {
  protected int top; // �ǹ� ����� ����
  
  public Building(int area, int top) {
    /* 1. �θ� Ŭ������ �����ڸ� ȣ���ϼ���.
    super(area); */
	super(area);
    System.out.println("[Build]�� ������ ȣ��!");
    this.top = top;
    System.out.printf("=> %d��¥�� �ǹ��� ���������ϴ�.\n", top);
  }
}
