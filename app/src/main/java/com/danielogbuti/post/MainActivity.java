package com.danielogbuti.post;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Retrofit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText topics;
    private EditText age;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        topics = (EditText)findViewById(R.id.topics);
        age = (EditText)findViewById(R.id.age);

        submitButton = (Button)findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNetworkRequest();
            }
        });


    }

    private void sendNetworkRequest(User user) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000/api")
    }
}
