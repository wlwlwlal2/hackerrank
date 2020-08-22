package Cloud;

public class Challenge439 {
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
	    tree1.printPostorder();
	  }
	}

	class MyTree {
	  // �ֻ��� ���
	  private Node root;

	  // ������
	  public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
	    // ��Ʈ ��� ����
	    this.root = new Node(data, null, null);

	    // ���� Ʈ�� ����
	    root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
	    root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
	  }
	  
	  // ���� ��ȸ
	  public void printPostorder() {
	    System.out.print("postorder: ");
	    _postorder(root); // ��� ȣ��
	    System.out.println();
	  }
	  
	    private void _postorder(Node parent) {
	    /* �ش� �޼ҵ带 �����Ͽ� ���� ��ȸ�� �ϼ��Ͻÿ�. */
	    if(leftChild == null && rightChild == null) {
	      return;
	    } else {
	      System.out.print(parent.leftChild);
	      _postorder(root);
	      System.out.print(parent.rightChild);
	    }
	  }
	}


	class Node {
	  int data; // ������
	  Node leftChild; // ���� �ڽ� ���
	  Node rightChild; // ������ �ڽ� ���
	  
	  public Node(int data, Node leftChild, Node rightChild) {
	    this.data = data;
	    this.leftChild = leftChild;
	    this.rightChild = rightChild;
	  }
	}