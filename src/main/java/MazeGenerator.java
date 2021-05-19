public class MazeGenerator {

    public static void generateMaze(int size) {
        int lastIndexFromSize = size * 2;
        int initialSize = 0;
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 1) {
                initialSize++;
            }
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size) {
                    System.out.print("@");
                } else if (i % 2 == 1) {
                    if ((j == 2 && initialSize % 2 == 1) || (j == (size - 1) && initialSize % 2 == 0)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("@");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
