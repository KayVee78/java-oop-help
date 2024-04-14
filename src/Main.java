public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
//        System.out.println("Tree Type: " + myFavoriteOakTree.treeType);
        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
        //Accessing non-static behaviours
        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();

//        if (myFavoriteOakTree.height > 100) {
//            System.out.println("That a tall " + myFavoriteOakTree.treeType + " tree");
//        }
//
//        if (myFavoriteMapleTree.height > 100) {
//            System.out.println("That a tall " + myFavoriteMapleTree.treeType + " tree");
//        }

        //Accessing static-attributes
        System.out.println(Tree.TRUNK_COLOR);

        //Accessing static-behaviors
        Tree.announceTree();

    }
}