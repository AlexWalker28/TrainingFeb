package kg.kloop.android.examplesnew;

/**
 * Created by alexwalker on 12.02.2018.
 */

class XoModel {
    public static final int PLAYER_X = 1;
    public static final int PLAYER_O = 2;
    private static final int NO_WINNER = 0;

    private int player;
    private int winner;
    private int[][] field;

    public XoModel() {
        field = new int[3][3];
        player = PLAYER_X;
        winner = NO_WINNER;
    }

    public int getPlayer() {
        return player;
    }

    public int getWinner() {
        return winner;
    }

    public int[][] getField() {
        return field;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
