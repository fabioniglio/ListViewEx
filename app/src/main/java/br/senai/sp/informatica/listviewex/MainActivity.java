package br.senai.sp.informatica.listviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recupera a listview do layout
        listView = (ListView)findViewById(R.id.list_view);

        // associa o listview

        listView.setAdapter(new Adaptador(this));

    }
}
