package kg.kloop.android.examplesnew;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alexwalker on 28.02.2018.
 */

class MessagesArrayAdapter extends android.widget.ArrayAdapter<MyMessage> {

    private Context context;

    public MessagesArrayAdapter(@NonNull Context context, int resource, @NonNull List<MyMessage> messageList) {
        super(context, resource, messageList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(context).inflate(R.layout.message_item, parent, false);
        }

        MyMessage currentMessage = getItem(position);

        TextView authorTextView = listViewItem.findViewById(R.id.author_text_view);
        TextView messageTextView = listViewItem.findViewById(R.id.message_text_view);
        TextView timeTextView = listViewItem.findViewById(R.id.time_text_view);

        authorTextView.setText(currentMessage.getAuthor());
        messageTextView.setText(currentMessage.getText());
        timeTextView.setText(currentMessage.getTime());

        return listViewItem;
    }
}
