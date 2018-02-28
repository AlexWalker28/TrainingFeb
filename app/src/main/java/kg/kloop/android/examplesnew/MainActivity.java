package kg.kloop.android.examplesnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView messagesListView;
    EditText messageTextEditText;
    Button sendButton;
    ArrayAdapter<MyMessage> arrayAdapter;
    ArrayList<MyMessage> messageArrayList;
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = firebaseDatabase.getReference("Messages");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesListView = findViewById(R.id.messages_list_view);
        messageTextEditText = findViewById(R.id.message_text_edit_text);
        sendButton = findViewById(R.id.send_button);

        messageArrayList = new ArrayList<>();
        arrayAdapter = new MessagesArrayAdapter(MainActivity.this, R.layout.message_item, messageArrayList);
        messagesListView.setAdapter(arrayAdapter);

        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                MyMessage message = dataSnapshot.getValue(MyMessage.class);
                messageArrayList.add(message);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyMessage message = new MyMessage("Alex", messageTextEditText.getText().toString(), "0000");
                databaseReference.push().setValue(message);
                messageTextEditText.setText("");
            }
        });

    }

}
