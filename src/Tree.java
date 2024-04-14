import java.awt.*;

public class Tree {
    //ATTRIBUTES
    static Color TRUNK_COLOR = new Color(102, 51, 0); //static attribute
    //non-static attributes
    private double height;
    private double trunkDiameter;
    private TreeType treeType; //created using its own enum

    //CONSTRUCTOR
    Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height; //in the right, they are the inputted values when creating the Tree Object
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    //GETTERS
    public double getHeight() {
        return height;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    //SETTERS
    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    //BEHAVIOUR - represented by a function
    void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree() {
        if (this.height > 100) {
            System.out.println("That a tall " + this.treeType + " tree");
        }
    }

    //static method > which is accessible by the class
    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }
}