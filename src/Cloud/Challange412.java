package Cloud;
import java.util.ArrayList;
import java.util.Random;

public class Challange412 {
	public static void main(String[] args) {
	    // ��ü ����
	    LottoMachine machine = new LottoMachine();
	    
	    // ��ȣ ����
	    int[] arr = machine.generate();
	    
	    // ��� ���
	    System.out.print("���� ��ȣ: ");
	    for (int i = 0; i < arr.length; i++) {
	      System.out.printf("%d ", arr[i]);
	    }
	  }
	}

	class LottoMachine {
	  // �ʵ�
	  private ArrayList<Integer> numbers;
	  
	  // ������
	  public LottoMachine() {
	    numbers = new ArrayList<Integer>();
	    
	    for (int i = 1; i <= 45; i++) {
	        numbers.add(i);
	    }
	    /* 1. ��ȣ(1 ~ 45)�� �߰��ϼ���. */ 
	  }
	  
	  // �޼ҵ�
	  public int[] generate() {
	    int[] pickedNumbers = new int[6];
	    Random rand = new Random();
	    
	    for (int i = 0; i < 6; i++) {
	        pickedNumbers[i] = numbers.remove(rand.nextInt(numbers.size()));
	    }
	      
	    /* 2. ������ ���� 6���� �����ϼ���. */
	    
	    return pickedNumbers;
	  }
	}

