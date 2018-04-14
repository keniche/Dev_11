package android.lifeistech.com.flashcardplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.listView);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(R.drawable.pictman_aim, getString(R.string.aim_title),
                getString(R.string.aim_content), getString(R.string.aim_meaning)));

        mCards.add(new Card(R.drawable.pictman_angry, getString(R.string.angry_title),
                getString(R.string.angry_content), getString(R.string.angry_meaning)));

        mCards.add(new Card(R.drawable.pictman_cry, getString(R.string.cry_title),
                getString(R.string.cry_content), getString(R.string.cry_meaning)));

        mCards.add(new Card(R.drawable.pictman_divorce, getString(R.string.divorce_title),
                getString(R.string.divorce_content), getString(R.string.divorce_meaning)));

        mCards.add(new Card(R.drawable.pictman_read, getString(R.string.read_title),
                getString(R.string.read_content), getString(R.string.read_meaning)));

        mCards.add(new Card(R.drawable.pictman_sing, getString(R.string.sing_title),
                getString(R.string.sing_content), getString(R.string.sing_meaning)));

        mCards.add(new Card(R.drawable.pictman_surprise, getString(R.string.surprise_title),
                getString(R.string.surprise_content), getString(R.string.surprise_meaning)));

        mCardAdapter = new CardAdapter(this, R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);
    }
}
