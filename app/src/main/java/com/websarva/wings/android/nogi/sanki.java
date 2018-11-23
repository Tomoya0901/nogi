package com.websarva.wings.android.nogi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sanki extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanki);

        ListView list = (ListView) findViewById(R.id.listview3);
        String[] item01 = getResources().getStringArray(R.array.sanki);

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
                        Intent manatsu = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/itouriria.php"));
                        startActivity(manatsu);
                        break;
                    case 1:
                        Intent erika = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/iwamotorenka.php"));
                        startActivity(erika);
                        break;
                    case 2:
                        Intent inoue = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/梅澤美波"));
                        startActivity(inoue);
                        break;
                    case 3:
                        Intent misa = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/oozonomomoko.php"));
                        startActivity(misa);
                        break;
                    case 4:
                        Intent kawago = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/久保史織里"));
                        startActivity(kawago);
                        break;
                    case 5:
                        Intent asuka = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/sakaguchitamami.php"));
                        startActivity(asuka);
                        break;
                    case 6:
                        Intent yuri = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/satoukaede.php"));
                        startActivity(yuri);
                        break;
                    case 7:
                        Intent reika = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/中村麗乃"));
                        startActivity(reika);
                        break;
                    case 8:
                        Intent shiraishi = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/mukaihazuki.php"));
                        startActivity(shiraishi);
                        break;
                    case 9:
                        Intent kazumi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/山下美月"));
                        startActivity(kazumi);
                        break;
                    case 10:
                        Intent kana = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mt.nogizaka46.com/member/detail/yoshidaayanochristie.php"));
                        startActivity(kana);
                        break;
                    case 11:
                        Intent nanase = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ja.wikipedia.org/wiki/与田祐希"));
                        startActivity(nanase);
                        break;
                }
            }
        });
    }
}
