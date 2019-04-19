package flanker.recursive;

public class EightQueen {

    private static final int maxlenth = 8;
    private int[][] flags;
    private int flagsCount = 0;

    public EightQueen() {
        flags = new int[maxlenth][maxlenth];
    }

    public static boolean isValid(EightQueen eightQueen, int x, int y) {
        return iSRowValid(eightQueen, x, y)
                && isColumnValid(eightQueen, x, y)
                &&
                isDiagonalValid(eightQueen, x, y);

    }

    public static void findall() {
        EightQueen eightQueen = new EightQueen();


    }


    public static void findInLine(EightQueen eightQueen, int y) {
        if (y == 7) {
            System.out.println("line 7 ");
        }
        for (int i = 0; i < maxlenth; i++) {
            if (isValid(eightQueen, i, y)) {
                putFlag(eightQueen, i, y);
                eightQueen.flagsCount++;
                System.out.println(String.format("put at %d %d, count %d", i, y, eightQueen.flagsCount));


                if (y < maxlenth - 1) {
                    findInLine(eightQueen, y + 1);
                } else {
                    return;
                }

            }
        }
    }

    public static EightQueen findOne() {

        EightQueen eightQueen = new EightQueen();
        int flags = 0;
        while (true) {
            int x = 0;
            int y = 0;
            if (isValid(eightQueen, x, y)) {
                putFlag(eightQueen, x, y);//放下棋子,并且跳转到下一行
                flags++;
                if (flags == 8) {
                    break;
                }
                x = 0;
                y++;
            } else {

                if (x < maxlenth) {
                    x++;//当前行内寻找
                } else {
                    //下一行寻找;
                    y++;
                    x = 0;
                }
                if (y <= maxlenth) {
                    x--;
                }
            }
        }
        return eightQueen;
    }

    public static void print(EightQueen eightQueen) {
        for (int i = 0; i < maxlenth; i++) {
            for (int j = 0; j < maxlenth; j++) {
                System.out.print(eightQueen.flags[i][j] == 0 ? "o" : "x");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void putFlag(EightQueen eightQueen, int x, int y) {
        eightQueen.flags[y][x] = 1;
    }

    public static boolean iSRowValid(EightQueen eightQueen, int x, int y) {

        for (int i = 0; i < maxlenth; i++) {
            if (eightQueen.flags[y][i] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isColumnValid(EightQueen eightQueen, int x, int y) {
        for (int i = 0; i < maxlenth; i++) {
            if (eightQueen.flags[i][x] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDiagonalValid(EightQueen eightQueen, int x, int y) {
        //左上到右下;
        for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
            if (eightQueen.flags[i][j] == 1) {
                return false;
            }
        }

        //左下到右上;
        for (int i = x, j = y; j >= 0 && i < maxlenth; i++, j--) {
            if (eightQueen.flags[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
