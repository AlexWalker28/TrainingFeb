package kg.kloop.android.examplesnew;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alexwalker on 19.02.2018.
 */

class CustomArrayAdapter extends ArrayAdapter<Flat> {
    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull List<Flat> flats) {
        super(context, resource, flats);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_view_item, parent, false);
        }

        Flat currentFlat = getItem(position);

        TextView addressTextView = itemView.findViewById(R.id.address_text_view);
        TextView priceTextView = itemView.findViewById(R.id.price_text_view);
        TextView areaTextView = itemView.findViewById(R.id.area_text_view);

        addressTextView.setText(currentFlat.getAddress());
        priceTextView.setText(currentFlat.getPrice());
        areaTextView.setText(currentFlat.getArea());

        return itemView;
    }
}
