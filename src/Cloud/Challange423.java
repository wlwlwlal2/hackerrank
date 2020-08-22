package Cloud;

public class Challange423{
public static void main(String[] args) {
    // 건물 객체 생성
    Building myBuilding = new Building(150, 10);
  }
}

// 토지
class Land {
  protected int area; // 토지 평수
  
  public Land(int area) {
    System.out.println("[Land]의 생성자 호출!");
    this.area = area;
    System.out.printf("=> %d평의 토지에,\n", area);
  }
}

// 건물
class Building extends Land {
  protected int top; // 건물 꼭대기 층수
  
  public Building(int area, int top) {
    /* 1. 부모 클래스의 생성자를 호출하세요.
    super(area); */
	super(area);
    System.out.println("[Build]의 생성자 호출!");
    this.top = top;
    System.out.printf("=> %d층짜리 건물이 세워졌습니다.\n", top);
  }
}

