package homework.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author YANGYI
 * @create 2021/11/17
 */
enum Color {
    RED, BLACK
}

class TNode {
    Color color;
    int key;
    TNode left;
    TNode right;
    TNode p;

    public TNode(TNode left, TNode right, TNode p) {
        this.left = left;
        this.right = right;
        this.p = p;
    }

    public TNode(Color color, int key) {
        this.color = color;
        this.key = key;
    }

    public TNode() {
    }
}

class RBTree {
    TNode root;
    TNode nil;
}

public class RB {
    public static void main(String[] args) throws IOException {
        RBTree T = new RBTree();
        TNode nil = new TNode();
        nil.right = nil;
        nil.left = nil;
        nil.p = nil;
        nil.color = Color.BLACK;
        T.root = nil;
        T.nil = nil;
        BufferedReader br = new BufferedReader(new FileReader("src/homework/three/insert.txt"));
        br.readLine();
        String res = br.readLine();
        String[] s1 = res.split(" ");
        for (int i = 0; i < s1.length; i++) {
            int n = Integer.parseInt(s1[i]);
            TNode z = new TNode(Color.RED, n);
            RB_INSERT(T, z);
        }
        System.out.println(Arrays.toString(s1));
        TNode p=T.root;
        LinkedList<TNode> queue=new LinkedList<>();
        if(p!=nil) queue.addLast(p);
        while (!queue.isEmpty()){
            TNode tNode = queue.removeFirst();
            if(tNode!=nil){
                System.out.print(tNode.key+" ");
                System.out.println(tNode.color);
                if(tNode!=nil)queue.addLast(tNode.left);
                if(tNode!=nil)queue.addLast(tNode.right);
            }else {
                System.out.println("NIL");
            }
        }
        br.close();
        /*RBTree T = new RBTree();
        TNode nil=new TNode();
        nil.right=nil;
        nil.left=nil;
        nil.p=nil;

        TNode z1=new TNode(Color.BLACK,20);
        T.root=z1;
        z1.left=nil;
        z1.right=nil;
        z1.p=nil;
        T.nil=nil;
        TNode z2=new TNode(Color.RED,10);
        TNode z3=new TNode(Color.RED,14);
        RB_INSERT(T,z2);
        RB_INSERT(T,z3);*/
    }

    public static void RB_INSERT(RBTree T, TNode z) {
        TNode y = T.nil;
        TNode x = T.root;
        while (x != T.nil) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.p = y;
        if (y == T.nil) {
            T.root = z;
        } else if (z.key < y.key) {
            y.left = z;
        } else {
            y.right = z;
        }
        z.left = T.nil;
        z.right = T.nil;
        z.color = Color.RED;
        RB_INSERT_FIXUP(T, z);
    }

    private static void RB_INSERT_FIXUP(RBTree T, TNode z) {
        while (z.p.color == Color.RED) {
            if (z.p == z.p.p.left) {
                TNode y = z.p.p.right;
                if (y.color == Color.RED) {
                    z.p.color = Color.BLACK;
                    y.color = Color.BLACK;
                    z.p.p.color = Color.RED;
                    z = z.p.p;
                } else if (z == z.p.right) {
                    z = z.p;
                    LEFT_ROTATE(T, z);
                } else {
                    z.p.color = Color.BLACK;
                    z.p.p.color = Color.RED;
                    RIGHT_ROTATE(T, z.p.p);
                }
            } else {
                TNode y = z.p.p.left;
                if (y.color == Color.RED) {
                    z.p.color = Color.BLACK;
                    y.color = Color.BLACK;
                    z.p.p.color = Color.RED;
                    z = z.p.p;
                } else if (z == z.p.left) {
                    z = z.p;
                    RIGHT_ROTATE(T, z);
                } else {
                    z.p.color = Color.BLACK;
                    z.p.p.color = Color.RED;
                    LEFT_ROTATE(T, z.p.p);
                }
            }
        }
        T.root.color = Color.BLACK;
    }

    public static void LEFT_ROTATE(RBTree T, TNode x) {
        TNode y = x.right;
        x.right = y.left;
        if (y.left != T.nil) {
            y.left.p = x;
        }
        y.p = x.p;
        if (x.p == T.nil) {
            T.root = y;
        } else if (x == x.p.left) {
            x.p.left = y;
        } else {
            x.p.right = y;
        }
        y.left = x;
        x.p = y;
    }

    public static void RIGHT_ROTATE(RBTree T, TNode x) {
        TNode y = x.left;
        x.left = y.right;
        if (y.right != T.nil) {
            y.right.p = x;
        }
        y.p = x.p;
        if (x.p == T.nil) {
            T.root = y;
        } else if (x == x.p.right) {
            x.p.right = y;
        } else {
            x.p.left = y;
        }
        y.right = x;
        x.p = y;
    }
}
