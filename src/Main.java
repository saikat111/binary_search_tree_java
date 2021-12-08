import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Tree tree = new Tree();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            tree.insert( array[i]);
        }
        /*tree.insert(12);
        tree.insert(23);
        tree.insert(34);
        tree.insert(45);
        tree.insert(11);
        tree.insert(13);
        tree.insert(23);*/
 /*       System.out.println(tree.get(30));
        System.out.println(tree.get(3000));
        System.out.println(tree.get(30000));*/
        System.out.println("Inorder");
        tree.traverseInorder();
      /*  System.out.println("Preorder");
        tree.traversePreorder();
        System.out.println("Postorder");
        tree.traversePostorder();*/
      /*  System.out.println(tree.min());
        System.out.println(tree.max());*/



    }
}
