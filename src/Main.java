public class Main {
    public static void main(String[] args) {
        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        System.out.println(myFavoriteMapleTree.getHeight());
        System.out.println(myFavoriteMapleTree.getTrunkDiameter());
        System.out.println(myFavoriteMapleTree.getTreeType());

        myFavoriteMapleTree.setTrunkDiameter(60);
        myFavoriteMapleTree.setTreeType(TreeType.PECAN);
    }
}