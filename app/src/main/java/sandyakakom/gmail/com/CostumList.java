// TODO 1 : Nama package
package sandyakakom.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

// TODO 2 : Mendeklarasikan suatu class
public class CostumList extends AppCompatActivity {
    Intent intent;
    ListView list;

    // TODO 3 : Mendeklarasi manintitle dengan tipe array
    String[] maintitle = {
            "Youtebe", "Facebook","Email",
            "Github","Muhammad Aprizal Abyan","Agus Afriyanto","Dikdik Maulana",

// TODO 4 : Mendeklarasi atribut subtitle bertipe array
    };
    String[] subtitle = {
            "wwww.youtube.com/", "wwww.facebook.com/","sandyakakom@gmail.com",
            "https://github.com/sandyao19","aprzla_","agus_afriyanto14","dikdik_maulanaa",
    };

    // TODO 5 : Mendeklarasi atribut imgid bertipde array
    Integer[] imgid = {
            R.drawable.youtube,R.drawable.fb,R.drawable.gmail,
            R.drawable.git,R.drawable.ig,R.drawable.ig,R.drawable.ig,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costum);
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 0) {
                                                Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 1) {
//code specific to 2nd list item
                                                Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 2) {
                                                Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 3) {
                                                Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 4) {
                                                Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 5) {
                                                Toast.makeText(getApplicationContext(), "Place Your sixth Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 6) {
                                                Toast.makeText(getApplicationContext(), "Place Your seventh Option Code", Toast.LENGTH_SHORT).show();
                                            } else if (position == 7) {
                                                Toast.makeText(getApplicationContext(), "Place Your eighth Option Code", Toast.LENGTH_SHORT).show();
            }
                                        }
                                    }
        );
    }
}