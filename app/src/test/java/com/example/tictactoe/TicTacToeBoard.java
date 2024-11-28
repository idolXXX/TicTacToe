package com.example.tictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TicTacToeBoard extends View {
    private final int boardColor;
    private final int XColor;
    private final int OColor;
    private final int winningLineColor;
    private final Paint paint=new Paint();
    private int cellSize=getWidth()/3;
    public TicTacToeBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a=context.getTheme().obtainStyledAttributes(attrs,R.styleable.TicTacToe,0,0);
        try {
            boardColor =a.getInteger(R.styleable.TicTacToe_boardColor,0);
            XColor=a.getInteger(R.styleable.TicTacToe_XColor,0);
            OColor=a.getInteger(R.styleable.TicTacToe_OColor,0);
            winningLineColor=a.getInteger(R.styleable.TicTacToe_winningLineColor,0);
        }finally {
            a.recycle();
        }
    }
    @Override
    protected void  onMeasure(int Width, int Height){
        super.onMeasure(Width,Height);

        int dimensions=Math.min(getMeasuredWidth(),getMeasuredHeight());
        cellSize=dimensions/3;
        setMeasuredDimension(dimensions,dimensions);
    }
    @Override
    protected void onDraw(Canvas canvas){
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        drawGameBoard(canvas);
    }
    private void drawGameBoard(Canvas canvas){
        paint.setColor(boardColor);
        paint.setStrokeWidth(16);
    for(int i=1; i<3;i++){
        canvas.drawLine(cellSize*i,0,cellSize*i,canvas.getWidth(),paint);
    }
    for(int j=1; j<3;j++){
        canvas.drawLine(0,cellSize*j ,canvas.getWidth(),cellSize*j ,paint);

    }
    }
}
