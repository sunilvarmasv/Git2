
public class BinaryTree {
Node root;
BinaryTree(){
root=null;
}

void printlevelOrder(){
	int h=height(root);
	for(int i=1;i<=h;i++){
		printGivenLevel(root,i);
	}
}

private void printGivenLevel(Node root, int level) {
	if(root==null) return;
	if(level==1) System.out.print(root.key+" ");
	else if(level>1){
		printGivenLevel(root.left, level-1);
		printGivenLevel(root.right, level-1);
		
	}
}

private int height(Node root) {
		if (root == null)
		return 0;
		else
		{
			int Lheight=height(root.left);
			int Rheight=height(root.left);
			if(Lheight>Rheight) return (Lheight+1);
			else  return (Rheight+1);
	}
}	

public static void main(String []args){
	BinaryTree tree=new BinaryTree();
	
	tree.root=new Node(1);
	tree.root.left=new Node(10);
	tree.root.right=new Node(5);
	tree.root.left.left=new Node(8);
	tree.root.left.right=new Node(7);
	tree.printlevelOrder();
}
}
