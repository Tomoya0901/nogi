package com.websarva.wings.android.nogi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class  ikki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikki);

        ListView list = (ListView) findViewById(R.id.listview1);
        String[] item01 = getResources().getStringArray(R.array.ikki);

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
                        Intent manatsu = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/秋元真夏"));
                        startActivity(manatsu);
                        break;
                    case 1:
                        Intent erika = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/生田絵梨花"));
                        startActivity(erika);
                        break;
                    case 2:
                        Intent inoue = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/井上小百合"));
                        startActivity(inoue);
                        break;
                    case 3:
                        Intent misa = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/衛藤美彩"));
                        startActivity(misa);
                        break;
                    case 4:
                        Intent kawago = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/kawagohina.php"));
                        startActivity(kawago);
                        break;
                    case 5:
                        Intent asuka = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/齋藤飛鳥"));
                        startActivity(asuka);
                        break;
                    case 6:
                        Intent yuri = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/斉藤優里"));
                        startActivity(yuri);
                        break;
                    case 7:
                        Intent reika = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/桜井玲香"));
                        startActivity(reika);
                        break;
                    case 8:
                        Intent shiraishi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/白石麻衣"));
                        startActivity(shiraishi);
                        break;
                    case 9:
                        Intent kazumi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/高山一実"));
                        startActivity(kazumi);
                        break;
                    case 10:
                        Intent kana = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/中田花奈"));
                        startActivity(kana);
                        break;
                    case 11:
                        Intent nanase = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/西野七瀬"));
                        startActivity(nanase);
                        break;
                    case 12:
                        Intent ami = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/能條愛未"));
                        startActivity(ami);
                        break;
                    case 13:
                        Intent hina = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/樋口日奈"));
                        startActivity(hina);
                        break;
                    case 14:
                        Intent minami = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/星野みなみ"));
                        startActivity(minami);
                        break;
                    case 15:
                        Intent sayuri = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/松村沙友里"));
                        startActivity(sayuri);
                        break;
                    case 16:
                        Intent maya = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/和田まあや"));
                        startActivity(maya);
                        break;
                }
            }
        });
    }
}
