package android.lifeistech.com.flashcardplus;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {
    List<Card> mCards;

    public CardAdapter(Context context, int layoutResourceId, List<Card> objects) {
        super(context, layoutResourceId, objects);

        mCards = objects;
    }

    @Override
    public int getCount() {
        return mCards.size();
    }

    @Override
    public Card getItem(int position) {
        return mCards.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Card item = getItem(position);

        if(item != null){

            //Log.d("TAG",item.toString());

            //set data
            viewHolder.iconImageView.setBackgroundResource(item.imageId);
            viewHolder.contentTextView.setText(item.title);
            viewHolder.contentTextView.setText(item.content);
            viewHolder.likeButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    item.likeNum++;
                    viewHolder.likeTextView.setText(item.likeNum + "Likes!");
                }
            });
            viewHolder.iconImageView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Toast.makeText(getContext(), item.meaning, Toast.LENGTH_SHORT).show();
                }
            });
        }

        return convertView;
    }


    public static class ViewHolder {
        ImageView iconImageView;
        TextView titleTextView;
        TextView likeTextView;
        TextView contentTextView;
        ImageView likeButton;

        public ViewHolder(View view) {
            iconImageView = (ImageView) view.findViewById(R.id.icon);
            titleTextView = (TextView) view.findViewById(R.id.title_textview);
            likeTextView = (TextView) view.findViewById(R.id.like_textview);
            contentTextView = (TextView) view.findViewById(R.id.content);
            likeButton = (ImageView) view.findViewById(R.id.like_button);
        }

    }

}
