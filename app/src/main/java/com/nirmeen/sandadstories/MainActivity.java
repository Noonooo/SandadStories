package com.nirmeen.sandadstories;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);
        TextView textView=(TextView)findViewById(R.id.textView);

        String [] item=getResources().getStringArray(R.array.index);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.row_itme,R.id.textView2,item);
        listView.setAdapter(arrayAdapter);

        Typeface typeface=Typeface.createFromAsset(getAssets(),"font.otf");
        textView.setTypeface(typeface);

        listView.setOnItemClickListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("page", position);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


            public void shareapp(View view) {
                String txtshare = "حكايات سندباد";
                String sharlink = "https://play.google.com/store/apps/details?id=com.nirmeen.sndbad";
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, txtshare + "\n" + sharlink);
                startActivity(share);

            }

            public void moreapp(View view) {


                Intent moreappp = new Intent(Intent.ACTION_VIEW);
                moreappp.setData(Uri.parse("https://play.google.com/store/apps/details?id=nerminD"));

                startActivity(moreappp);

            }

            }

        }// sebe l zefffft tayb :(
    // rkz b2a 3l4an b3d kda trf3 l proj lw7dk tmam ?
    //7adr aywn tmam a5dt bale

    public void emailapp(View view) {
        String txt = "hello guys";
        Intent sendemail = new Intent(Intent.ACTION_SEND);
        sendemail.setData(Uri.parse("mailto"));
        sendemail.setType("message/rfc822");
        sendemail.putExtra(Intent.EXTRA_EMAIL, "nermin.diaa@outlook.com");
        sendemail.putExtra(Intent.EXTRA_SUBJECT,"7kayat sndbad");
        sendemail.putExtra(Intent.EXTRA_TEXT,txt);
        startActivity(sendemail);
    }

    public void closeapp(View view) {
        finish();
    }
}