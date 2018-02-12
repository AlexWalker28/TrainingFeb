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
            xoModel.setPlayer(XoModel.PLAYER_O);
        } else if (xoModel.getPlayer() == XoModel.PLAYER_O) {
            field[x][y] = XoModel.PLAYER_O;
            xoModel.setPlayer(XoModel.PLAYER_X);
        }

    }
}
