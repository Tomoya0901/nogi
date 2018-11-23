package com.websarva.wings.android.nogi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class niki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niki);

        ListView list = (ListView) findViewById(R.id.listview2);
        String[] item01 = getResources().getStringArray(R.array.niki);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, item01);
        list.setAdapter(adapter);

        // リスト項目がクリックされた時の処理
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                String strData = adapter.getItem(position);

                Intent intent = new Intent();

                switch (position) {
                    case 0:
                        Intent manatsu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/伊藤かりん"));
                        startActivity(manatsu);
                        break;
                    case 1:
                        Intent erika = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/伊藤純奈"));
                        startActivity(erika);
                        break;
                    case 2:
                        Intent inoue = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/北野日奈子"));
                        startActivity(inoue);
                        break;
                    case 3:
                        Intent misa = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mt.nogizaka46.com/member/detail/sasakikotoko.php"));
                        startActivity(misa);
                        break;
                    case 4:
                        Intent kawago = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/新内眞衣"));
                        startActivity(kawago);
                        break;
                    case 5:
                        Intent asuka = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/鈴木絢音"));
                        startActivity(asuka);
                        break;
                    case 6:
                        Intent yuri = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mt.nogizaka46.com/member/detail/teradaranze.php"));
                        startActivity(yuri);
                        break;
                    case 7:
                        Intent reika = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/堀未央奈"));
                        startActivity(reika);
                        break;
                    case 8:
                        Intent shiraishi = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ja.wikipedia.org/wiki/山崎怜奈"));
                        startActivity(shiraishi);
                        break;
                    case 9:
                        Intent kazumi = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mt.nogizaka46.com/member/detail/watanabemiria.php"));
                        startActivity(kazumi);
                        break;
                }
            }
        });

    }
}
