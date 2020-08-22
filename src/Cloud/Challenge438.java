package Cloud;

public class Challenge438 {
	public static void main(String[] args) {
	    // Ʈ�� ���� �� ����ȭ
	    MyTree tree7 = new MyTree(77, null, null);
	    MyTree tree6 = new MyTree(66, null, null);
	    MyTree tree5 = new MyTree(55, null, null);
	    MyTree tree4 = new MyTree(44, null, null);
	    MyTree tree3 = new MyTree(33, tree6, tree7);
	    MyTree tree2 = new MyTree(22, tree4, tree5);
	    MyTree tree1 = new MyTree(11, tree2, tree3);
	    
	    // ���� ��ȸ ���
	    tree1.printInorder();
	  }
	}

	class MyTree {
	  // �ֻ��� ���
	  private Node3 root;

	  // ������
	  public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
	    // ��Ʈ ��� ����
	    this.root = new Node3(data, null, null);

	    // ���� Ʈ�� ����
	    root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
	    root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
	  }
	  
	  // ���� ��ȸ
	  public void printInorder() {
	    System.out.print("inorder: ");
	    _inorder(root); // ��� ȣ��
	    System.out.println();
	  }
	  
	  private void _inorder(Node3 parent) {
	    if (parent.leftChild == null && parent.rightChild == null) {
	      System.out.print(parent.data + " ");
	    } else {
	      _inorder(parent.leftChild);
	      System.out.print(parent.data + " ");
	      _inorder(parent.rightChild);
	    }
	  }
	}

	class Node3 {
	  int data; // ������
	  Node3 leftChild; // ���� �ڽ� ���
	  Node3 rightChild; // ������ �ڽ� ���
	  
	  public Node3(int data, Node3 leftChild, Node3 rightChild) {
	    this.data = data;
	    this.leftChild = leftChild;
	    this.rightChild = rightChild;
	  }
	}