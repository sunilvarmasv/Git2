import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

class Node2{
	Node left,right;
	int data;
	Node2(int item){
		data=item;
		left=right=null;
	}
}
class BinaryTree2{
	Node root;
	public BinaryTree2() {
	root=null;
	}
}
public class BinaryTraversal2 {

	public static void printPreOrder(Node node){
		System.out.println(node.key+" ");
		System.out.println();
	}
	public static void main(String[] args) {
	

	}

}
