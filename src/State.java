public class State {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int ID = 2;
    public static final int HP = 3;

    public static int[] Min, Max;
    public static void setupBoard(int minX, int maxX, int minY, int maxY) {
        Min = new int[2]; Min[X] = minX; Min[Y] = minY;
        Max = new int[2]; Max[X] = maxX; Max[Y] = maxY;
    }
    
    public static int[] createEntity(int id, int hp, int x, int y) {
        int[] entity = new int[4];
        entity[ID] = id;
        entity[HP] = hp;
        entity[X] = x;
        entity[Y] = y;
        return entity;
    }

    private int[][] footmen;
    private int[][] archers;

    public State() {
        this(
                new int[] { 0, 0, 0, 0 },
                new int[] { 0, 0, 0, 0 },
                new int[] { 0, 0, 0, 0 },
                new int[] { 0, 0, 0, 0 });
    }

    public State(int[] footman1, int[] footman2, int[] archer1, int[] archer2) {
        footmen = new int[][] { footman1, footman2 };
        archers = new int[][] { archer1, archer2 };
    }

    public int[] getFootman(int index) {
        return footmen[index];
    }

    public int getFootmenHealth() {
        return footmen[0][HP] + footmen[1][HP];
    }

    public int getArcherHealth() {
        return archers[0][HP] + archers[1][HP];
    }

    public int[] getArcher(int index) {
        return archers[index];
    }
}
