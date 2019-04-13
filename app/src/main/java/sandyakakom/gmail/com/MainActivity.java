package sandyakakom.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // TODO 6: menginisialisasi intent
    public void sendMessage(View view){
        Intent intentList = new Intent(getApplicationContext(), CostumList.class);
        Intent intentRegister = new Intent(getApplicationContext(), Registrasi.class);

        // TODO 7: menginisialisasi atribut bertipe string
        String username = "sandy";
        String password = "165410183";

        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        String inputUser = user.getText().toString();
        String inputPass = pass.getText().toString();

        // TODO 8: Validasi inputan id username dan password
        if(inputUser.equals(username) && inputPass.equals(password)){
            startActivity(intentList);
        }
        else{
            startActivity(intentRegister);
        }

    }
}

