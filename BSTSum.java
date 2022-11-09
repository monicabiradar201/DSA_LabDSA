import java.util.ArrayList;
import java.util.Scanner;

public class BSTSum {
	ArrayList<Integer>nodeList=new ArrayList<>();
	public static Node newNode (int z) {
		Node temp=new Node();
		temp.left=null;
		temp.data=z;
		temp.right=null;
		return temp;
	}
public void insert (Node root, Node nn) {
	if (nn.data<root.data) {
		if(root.left==null) {
			root.left=nn;
		}
		else {
			insert(root.left, nn);
		}
	}
		else
			if (root.right==null) {
				root.right=nn;
			}
			else {
				insert(root.right,nn);
			}
	}
	
private void traverse(Node root)
{
	if(root!=null) {
		traverse(root.left);
		nodeList.add(root.data);
		traverse(root.right);
	}
}
	public static void main (String[] args) 
	{
BSTSum bst=new BSTSum(); 
Node root=null;
Node nn=null;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number of nodes");
int noOfNodes=sc.nextInt();
int i;
for (i=1;i<=noOfNodes;i++)
{
	System.out.println("Enter Data for the node");
	int node_data=sc.nextInt();
	nn=newNode(node_data);
	if (root==null)
	{
		root=nn;
	}
	else
	{
		bst.insert(root,nn);
		}
	}
	bst.traverse(root);

	System.out.println("Enter sum");
	int sum= sc.nextInt();
	int flag=0;
	for(i=0;i<bst.nodeList.size();i++)
	{
		
		if(bst.nodeList.contains(sum-bst.nodeList.get(i))&& bst.nodeList.get(i)!=sum-bst.nodeList.get(i))
		{
			int a=bst.nodeList.get(i);
			int b=sum-bst.nodeList.get(i);
			System.out.println("Pair Found["+a+","+b+"]");
			flag=1;
			break;
		}
		}
	if (flag==0)
	{
		System.out.println("No Pair Found ");
	}
	}
}


