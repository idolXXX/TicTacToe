package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ImB1,ImB2,ImB3,ImB4,ImB5,ImB6,ImB7,ImB8,ImB9;
    XO playBoard=new XO();
    TextView textViewTrn, textViewWnr;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImB1=findViewById(R.id.imageButton1);
        ImB2=findViewById(R.id.imageButton2);
        ImB3=findViewById(R.id.imageButton3);
        ImB4=findViewById(R.id.imageButton4);
        ImB5=findViewById(R.id.imageButton5);
        ImB6=findViewById(R.id.imageButton6);
        ImB7=findViewById(R.id.imageButton7);
        ImB8=findViewById(R.id.imageButton8);
        ImB9=findViewById(R.id.imageButton9);
        btn=findViewById(R.id.btn1);

        textViewTrn=findViewById(R.id.textViewT);
        textViewWnr=findViewById(R.id.textViewW);

        ImB1.setOnClickListener(this);
        ImB2.setOnClickListener(this);
        ImB3.setOnClickListener(this);
        ImB4.setOnClickListener(this);
        ImB5.setOnClickListener(this);
        ImB6.setOnClickListener(this);
        ImB7.setOnClickListener(this);
        ImB8.setOnClickListener(this);
        ImB9.setOnClickListener(this);
        btn.setOnClickListener(this);

        if (playBoard.getCount()%2==1){
            textViewTrn.setText("It's X's turn now");
        }
        else{
            textViewTrn.setText("It's O's turn now");
        }
    }

    @Override
    public void onClick(View view) {
        if (playBoard.getCount()%2==0){
            textViewTrn.setText("It's X's turn now");
        }
        else{
            textViewTrn.setText("It's O's turn now");
        }
        if (view==ImB1){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,0,0);
                ImB1.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,0,0);
                ImB1.setImageResource(R.drawable.redo);
            }
            ImB1.setClickable(false);
        }
        if (view==ImB2){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,0,1);
                ImB2.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,0,1);
                ImB2.setImageResource(R.drawable.redo);
            }
            ImB2.setClickable(false);
        }
        if (view==ImB3){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,0,2);
                ImB3.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,0,2);
                ImB3.setImageResource(R.drawable.redo);
            }
            ImB3.setClickable(false);
        }
        if (view==ImB4){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,1,0);
                ImB4.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,1,0);
                ImB4.setImageResource(R.drawable.redo);
            }
            ImB4.setClickable(false);
        }
        if (view==ImB5){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,1,1);
                ImB5.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,1,1);
                ImB5.setImageResource(R.drawable.redo);
            }
            ImB5.setClickable(false);
        }
        if (view==ImB6){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,1,2);
                ImB6.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,1,2);
                ImB6.setImageResource(R.drawable.redo);
            }
            ImB6.setClickable(false);
        }
        if (view==ImB7){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,2,0);
                ImB7.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,2,0);
                ImB7.setImageResource(R.drawable.redo);
            }
            ImB7.setClickable(false);
        }
        if (view==ImB8){
            playBoard.setCount(playBoard.getCount()+1);
            if (playBoard.getCount()%2==0){
                playBoard.setBoard(1,2,1);
                ImB8.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,2,1);
                ImB8.setImageResource(R.drawable.redo);
            }
            ImB8.setClickable(false);
        }
        if (view==ImB9){
            playBoard.setCount(playBoard.getCount()+1);
            if ((playBoard.getCount()%2)==0){
                playBoard.setBoard(1,2,2);
                ImB9.setImageResource(R.drawable.redx);
            }
            else{
                playBoard.setBoard(0,2,2);
                ImB9.setImageResource(R.drawable.redo);
            }
            ImB9.setClickable(false);
        }
        if(playBoard.isWin()){
            if(playBoard.getCount()%2==0) {
                textViewWnr.setText("X is the winner!!!! :)");
                textViewWnr.setVisibility(View.VISIBLE);
                ImB1.setClickable(false);
                ImB2.setClickable(false);
                ImB3.setClickable(false);
                ImB4.setClickable(false);
                ImB5.setClickable(false);
                ImB6.setClickable(false);
                ImB7.setClickable(false);
                ImB8.setClickable(false);
                ImB9.setClickable(false);
            }
            else{
                textViewWnr.setText("O is the winner!!!! :)");
                textViewWnr.setVisibility(View.VISIBLE);
                ImB1.setClickable(false);
                ImB2.setClickable(false);
                ImB3.setClickable(false);
                ImB4.setClickable(false);
                ImB5.setClickable(false);
                ImB6.setClickable(false);
                ImB7.setClickable(false);
                ImB8.setClickable(false);
                ImB9.setClickable(false);
            }

        }
        else{
            if (playBoard.getCount()==10) {
                textViewWnr.setText("It's a tie :(");
                textViewWnr.setVisibility(View.VISIBLE);
                textViewTrn.setVisibility(View.INVISIBLE);
            }
        }
        if(view==btn){
            playBoard=new XO();
            ImB1.setClickable(true);
            ImB2.setClickable(true);
            ImB3.setClickable(true);
            ImB4.setClickable(true);
            ImB5.setClickable(true);
            ImB6.setClickable(true);
            ImB7.setClickable(true);
            ImB8.setClickable(true);
            ImB9.setClickable(true);
            textViewWnr.setVisibility(View.INVISIBLE);
            textViewTrn.setVisibility(View.VISIBLE);
            ImB1.setImageResource(R.drawable.grey);
            ImB2.setImageResource(R.drawable.grey);
            ImB3.setImageResource(R.drawable.grey);
            ImB4.setImageResource(R.drawable.grey);
            ImB5.setImageResource(R.drawable.grey);
            ImB6.setImageResource(R.drawable.grey);
            ImB7.setImageResource(R.drawable.grey);
            ImB8.setImageResource(R.drawable.grey);
            ImB9.setImageResource(R.drawable.grey);
            playBoard.setCount(1);
            textViewTrn.setText("It's X's turn now");




        }

    }
}