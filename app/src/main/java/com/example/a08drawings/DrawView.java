package com.example.a08drawings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        Paint p = new Paint();
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //p.setColor();
        canvas.drawCircle(100, 100, 12, new Paint());
    }
}
