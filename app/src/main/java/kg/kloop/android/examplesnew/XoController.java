package kg.kloop.android.examplesnew;

/**
 * Created by alexwalker on 12.02.2018.
 */

class XoController {
    XoModel xoModel;
    int[][] field;

    public XoController(XoModel xoModel) {
        this.xoModel = xoModel;
        field = xoModel.getField();
    }
    public void playerMove(int x, int y) {
        if (xoModel.getPlayer() == XoModel.PLAYER_X) {
            field[x][y] = XoModel.PLAYER_X;
            xoModel.setField(field);
            checkWinner();
            xoModel.setPlayer(XoModel.PLAYER_O);
        } else if (xoModel.getPlayer() == XoModel.PLAYER_O) {
            field[x][y] = XoModel.PLAYER_O;
            xoModel.setField(field);
            checkWinner();
            xoModel.setPlayer(XoModel.PLAYER_X);
        }

    }

    private void checkWinner() {
        if (field[0][0] == field[1][0]
                && field[2][0] == field[1][0]
                && field[0][0] != XoModel.NO_WINNER) {
            xoModel.setWinner(field[0][0]);
        } else if (field[0][2] == field[1][2]
                && field[2][2] == field[0][2]
                && field[0][2] != XoModel.NO_WINNER) {
            xoModel.setWinner(field[0][2]);
        }

    }
}
