package kg.kloop.android.examplesnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView messagesListView;
    EditText messageTextEditText;
    Button sendButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesListView = findViewById(R.id.messages_list_view);
        messageTextEditText = findViewById(R.id.message_text_edit_text);
        sendButton = findViewById(R.id.send_button);




    }

}
