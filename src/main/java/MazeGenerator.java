/**
 * @author ahmadfajar - ahmad.fajar@outlook.co.id
 * @since 19/05/2021
 */
public class MazeGenerator {

    /**
     * This method will generate maze based on the given size
     *
     * @param size - int
     */
    public static void generateMaze(int size) {
        int initialSize = 0;
        for (int verticalWall = 1; verticalWall <= size; verticalWall++) {
            if (verticalWall % 2 == 1) {
                initialSize++;
            }
            for (int horizontalWall = 1; horizontalWall <= size; horizontalWall++) {
                if (horizontalWall == 1 || horizontalWall == size) {
                    System.out.print("@");
                } else if (verticalWall % 2 == 1) {
                    if ((horizontalWall == 2 && initialSize % 2 == 1) || (horizontalWall == (size - 1) && initialSize % 2 == 0)) {
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
