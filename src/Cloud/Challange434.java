package Cloud;

import java.util.Scanner;

public class Challange434 {
	public static void main(String[] args) {
	    // �Է°� �ޱ�
	    Scanner input = new Scanner(String.join(" ", args));

	    // ���� ����
	    int nodeCnt = input.nextInt(); // ���� ��
	    int lineCnt = input.nextInt(); // ���� ��

	    // �׷��� �� ���� ����
	    DirectedGraph graph = new DirectedGraph(nodeCnt);

	    // ���� �߰�
	    for (int i = 0; i < lineCnt; i++) {
	      int startNode = input.nextInt();
	      int endNode = input.nextInt();
	      graph.addEdge(startNode, endNode);
	    }

	    // ������� ���
	    graph.printMatrix();
	  }
	}

	class DirectedGraph {
	  private int n;       // ���� ��
	  private Node[] list; // ���� ����Ʈ

	  // ���� V = { 0, 1, ..., n-1 }�� ���� �׷��� ����
	  public DirectedGraph(int n) {
	    this.n = n;
	    this.list = new Node[n];
	  }

	  // ���� <start, end>�� �߰�
	  public void addEdge(int start, int end) {
	    Node first = list[start];
	    Node newest = new Node(end, first);
	    list[start] = newest;
	  }
	  
	  // ��� ���� ����Ʈ�� ���
	  public void printMatrix() {
	    for (int i = 0; i < n; i++) {
	      System.out.printf("Vertex[%d] ->", i);
	      Node temp = list[i];
	      while (temp != null) {
	        System.out.printf(" %d", temp.vertex);
	        temp = temp.next;
	      }
	      System.out.println(" null");
	    }
	  }
	}

	class Node {
	  int vertex;
	  Node next;

	  public Node(int vertex, Node next) {
	    this.vertex = vertex;
	    this.next = next;
	  }
	}