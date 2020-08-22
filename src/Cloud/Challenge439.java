package Cloud;

public class Challenge439 {
	public static void main(String[] args) {
	    // 트리 생성 및 구조화
	    MyTree tree7 = new MyTree(77, null, null);
	    MyTree tree6 = new MyTree(66, null, null);
	    MyTree tree5 = new MyTree(55, null, null);
	    MyTree tree4 = new MyTree(44, null, null);
	    MyTree tree3 = new MyTree(33, tree6, tree7);
	    MyTree tree2 = new MyTree(22, tree4, tree5);
	    MyTree tree1 = new MyTree(11, tree2, tree3);
	    
	    // 중위 순회 출력
	    tree1.printPostorder();
	  }
	}

	class MyTree {
	  // 최상위 노드
	  private Node root;

	  // 생성자
	  public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
	    // 루트 노드 생성
	    this.root = new Node(data, null, null);

	    // 서브 트리 연결
	    root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
	    root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
	  }
	  
	  // 후위 순회
	  public void printPostorder() {
	    System.out.print("postorder: ");
	    _postorder(root); // 재귀 호출
	    System.out.println();
	  }
	  
	    private void _postorder(Node parent) {
	    /* 해당 메소드를 구현하여 후위 순회를 완성하시오. */
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
	  int data; // 데이터
	  Node leftChild; // 왼쪽 자식 노드
	  Node rightChild; // 오른쪽 자식 노드
	  
	  public Node(int data, Node leftChild, Node rightChild) {
	    this.data = data;
	    this.leftChild = leftChild;
	    this.rightChild = rightChild;
	  }
	}