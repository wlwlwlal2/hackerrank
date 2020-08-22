package Cloud;

public class Challange421 {
	 public static void main(String[] args) {
		    // ��ü ����
		    Square s = new Square();
		    Triangle t = new Triangle();
		    Circle c = new Circle();
		    
		    // ��ü �ʱ�ȭ
		    s.name = "���簢��";
		    s.length = 5;
		    
		    t.name = "�ﰢ��";
		    t.base = 4;
		    t.height = 3;
		    
		    c.name = "��";
		    c.radius = 4;

		    // �� ĳ���� ��ü �迭 �����
		    Shape[] shapes = { s, t, c };
		    
		    // ��� ������ ���� ���
		    for (int i = 0; i < shapes.length; i++) {
		      Shape tmp = shapes[i];
		      System.out.printf("%s�� ���� -> %.2f\n", tmp.name, tmp.area());
		    }
		  }
		}

		// ����
		class Shape {
		  String name;

		  // ������ ���̸� ��ȯ
		  public double area() {
		    return 0;
		  }
		}

		// ���簢��
		class Square extends Shape {
		  int length; // �� ���� ����

		  /* 1. ���簢�� ���̸� ���ϵ��� area()�� �������ϼ���. */
		  public double area() {
			    return length*length;
			  }
		}

		// �ﰢ��
		class Triangle extends Shape {
		  int base;   // �غ�
		  int height; // ����

		  /* 2. �ﰢ�� ���̸� ���ϵ��� area()�� �������ϼ���. */
		  public double area() {
			    return base*height/2;
			  }
		}

		// ��
		class Circle extends Shape {
		  int radius; // ������

		  /* 3. ���� ���̸� ���ϵ��� area()�� �������ϼ���. */  
		  public double area() {
			    return radius*radius*3.14;
			  }
		}


