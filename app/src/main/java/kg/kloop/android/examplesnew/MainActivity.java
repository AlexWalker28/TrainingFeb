package kg.kloop.android.examplesnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button00;
    Button button10;
    Button button20;
    Button button01;
    Button button11;
    Button button21;
    Button button02;
    Button button12;
    Button button22;
    TextView infoTextView;
    XoController xoController;
    XoModel xoModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button00 = findViewById(R.id.button00);
        button10 = findViewById(R.id.button10);
        button20 = findViewById(R.id.button20);
        button01 = findViewById(R.id.button01);
        button11 = findViewById(R.id.button11);
        button21 = findViewById(R.id.button21);
        button02 = findViewById(R.id.button02);
        button12 = findViewById(R.id.button12);
        button22 = findViewById(R.id.button22);
        infoTextView = findViewById(R.id.info_text_view);
        xoModel = new XoModel();
        xoController = new XoController(xoModel);

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (xoModel.getWinner() == 0) {
                    if (xoModel.getPlayer() == XoModel.PLAYER_X) {
                        button00.setText("x");
                        infoTextView.setText("It's now Player 2 turn");
                    } else {
                        button00.setText("o");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(0, 0);
                } else {
                    infoTextView.setText(xoModel.getWinner());
                }
            }
        });


    }

}
