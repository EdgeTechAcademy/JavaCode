/**
 * Created by GJames on 11/16/2016.
 */
public class Tree {
    private String leafShape;
    public  String name;
    boolean deciduous;
    private int height;

    public Tree(String leafShape, String name, boolean deciduous, int height) {
        this.leafShape = leafShape;
        this.name = name;
        this.deciduous = deciduous;
        this.height = height;
    }

    public String getLeafShape() {
        return leafShape;

    }

    public void setLeafShape(String leafShape) {
        this.leafShape = leafShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeciduous() {
        return deciduous;
    }

    public void setDeciduous(Boolean deciduous) {
        this.deciduous = deciduous;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isTallerThan (Tree tree, int newHeight) {
        if ( height <= tree.height ) {
            tree.height = height - 10;
            tree = new Tree(tree.leafShape, tree.name, tree.deciduous, newHeight);
            newHeight = tree.height;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafShape='" + leafShape + '\'' +
                ", name='" + name + '\'' +
                ", deciduous=" + deciduous +
                ", height=" + height +
                '}';
    }

    public static void main (String[] args) {
        Tree tree1 = new Tree("Square", "Tall", true, 100);
        Tree tree2 = new Tree("Square", "Tall", true, 150);
        System.out.println(tree1);
        int height = 200;
        if (tree1.isTallerThan(tree2, height)) {
            System.out.println ("Tree1 height: " + tree1.height);
            System.out.println ("Tree2 height: " + tree2.height);
        }
    }
}
