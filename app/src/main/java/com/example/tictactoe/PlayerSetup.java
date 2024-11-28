package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class PlayerSetup extends AppCompatActivity {
    private EditText Player1;
    private EditText Player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        Player1=findViewById(R.id.player1name);
        Player2=findViewById(R.id.player2name);
    }
    public void submitNameButton(View view){
        String player1name= Player1.getText().toString();
        String player2name= Player2.getText().toString();
        Intent intent=new Intent( this,GameDisplay.class);
        intent.putExtra("PLAYERS_NAMES",new String[]{player1name,player2name});
        startActivity(intent);

    }

}