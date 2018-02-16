package kg.kloop.android.examplesnew;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
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
    ConstraintLayout layout;
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
        layout = findViewById(R.id.constraint_layout);
        xoModel = new XoModel();
        xoController = new XoController(xoModel);

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(0, 0, (Button) view);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(1, 0, (Button) view);

            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(2, 0, (Button) view);
            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(0, 1, (Button) view);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(1, 1, (Button) view);
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(0, 2, (Button) view);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(1, 2, (Button) view);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMove(2, 2, (Button) view);
            }
        });

    }

    private void playerMove(int x, int y, Button button) {
        if (xoModel.getWinner() == XoModel.NO_WINNER && xoModel.getField()[x][y] == 0) {
            if (xoModel.getPlayer() == XoModel.PLAYER_X) {
                button.setText("x");
                infoTextView.setText("It's now Player 2 turn");
            } else {
                button.setText("o");
                infoTextView.setText("It's now Player 1 turn");
            }
            xoController.playerMove(x, y);
            if (xoModel.getWinner() != XoModel.NO_WINNER) {
                infoTextView.setText("The winner is Player " + String.valueOf(xoModel.getWinner()));
            }
        }

    }

    private void resetViews() {
        for (int i = 0; i < layout.getChildCount(); i++) {
            if (layout.getChildAt(i) instanceof Button) {
                Button button = (Button) layout.getChildAt(i);
                button.setText("");
            } else {
                TextView textView = (TextView) layout.getChildAt(i);
                textView.setText("");
            }

        }
    }

}
