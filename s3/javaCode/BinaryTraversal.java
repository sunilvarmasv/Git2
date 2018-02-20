class Node{
	Node left,right;
	public int key;
	public Node(int item) {
		key=item;
		right=left=null;
	}
}

public class BinaryTraversal {
	Node root;
	public BinaryTraversal() {
		root=null;
	}
	
	void printPreOrder(Node node){
		if(node==null) return ;
		else{
			System.out.print(node.key+"");
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}
	
	void printPostOrder(Node node){
		if(node==null) return;
		else{
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.print(node.key+ "");
			
	}
}
	void printInOrder(Node node){
		if(node==null) return;
		else{
			printInOrder(node.left);
			printInOrder(node.right);
			System.out.print(node.key+ "");
		}
	}
	int maxDepth(Node node){
		if (node == null)
			return 0;
		else
		{
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
		}
	
	void printOrderlevelOrderTraversal(Node node){
		
		
	}

	
	void printPreorder()   {  printPreOrder(root);}
	void printPostOrder()  {  printPostOrder(root);}
	void printInorder()    {  printInOrder(root);}
	public static void main(String[] args) {
		BinaryTraversal traverse=new BinaryTraversal();
		traverse.root= new Node(1);
		traverse.root.left=new Node(2);
		traverse.root.right=new Node(3);
		traverse.root.left.left=new Node(5);
		
		System.out.println("PreOrder traversal of binary tree are: ");
		traverse.printPreorder();
		System.out.println();
		
		System.out.println("PostOrder traversal of binary tree are: ");
		traverse.printPostOrder();
		System.out.println();
		
		System.out.println("InOrder traversal of binary tree are: ");
		traverse.printInorder();
		
		System.out.println("height of the tree is: "+ traverse.maxDepth(traverse.root));
		
		

	}

}
