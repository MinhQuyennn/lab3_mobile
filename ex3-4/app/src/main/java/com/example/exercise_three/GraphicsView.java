package com.example.exercise_three;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[16];
    int i = 0;
    public GraphicsView(Context context)
    {
        super(context);
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (i < 16) {
            // Get the dimensions of the canvas
            int canvasWidth = canvas.getWidth();
            int canvasHeight = canvas.getHeight();

            // Calculate the scaling factor for the images
            float scaleX = (float) canvasWidth / frames[i].getWidth();
            float scaleY = (float) canvasHeight / frames[i].getHeight();

            // Apply the scaling factor
            canvas.save();
            canvas.scale(scaleX, scaleY);

            // Draw the scaled image at the center of the canvas
            canvas.drawBitmap(frames[i], 1, 1, null);

            canvas.restore();
        } else {
            i = 0;
        }

        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        i++;
        return true;
    }
}


//ex4
//        import android.graphics.Bitmap;
//        import android.graphics.BitmapFactory;
//        import android.graphics.Canvas;
//        import android.graphics.Paint;
//        import android.media.MediaPlayer;
//        import android.os.Bundle;
//        import android.view.MotionEvent;
//        import android.view.View;
//        import android.content.Context;
//
//public class GraphicsView extends View {
//
//    Bitmap[] frames = new Bitmap[16];
//    int i = 0;
//    long last_tick = 0;
//    long period = 200;
//    Context ctext;
//
//    MediaPlayer mediaPlayer;
//    public GraphicsView(Context context)
//    {
//        super(context);
//        ctext=context;
//        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
//        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
//        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
//        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
//        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
//        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
//        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
//        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
//        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
//        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
//        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
//        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
//        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
//        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
//        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
//        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
//
//        mediaPlayer = MediaPlayer.create(ctext, R.raw.music) ;
//        mediaPlayer.start();
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas)
//    {
//        if(i<16){
//            long time = (System.currentTimeMillis() - last_tick);
//            if(time >= period)
//            {
//                last_tick = System.currentTimeMillis();
//                int canvasWidth = canvas.getWidth();
//                int canvasHeight = canvas.getHeight();
//
//                // Calculate the scaling factor for the images
//                float scaleX = (float) canvasWidth / frames[i].getWidth();
//                float scaleY = (float) canvasHeight / frames[i].getHeight();
//
//                // Apply the scaling factor
//                canvas.save();
//                canvas.scale(scaleX, scaleY);
//
//                // Draw the scaled image at the center of the canvas
//                canvas.drawBitmap(frames[i], 1, 1, null);
//
//                canvas.restore();
//                i++;
//                postInvalidate();
//            }
//            else
//            {
//                int canvasWidth = canvas.getWidth();
//                int canvasHeight = canvas.getHeight();
//
//                // Calculate the scaling factor for the images
//                float scaleX = (float) canvasWidth / frames[i].getWidth();
//                float scaleY = (float) canvasHeight / frames[i].getHeight();
//
//                // Apply the scaling factor
//                canvas.save();
//                canvas.scale(scaleX, scaleY);
//
//                // Draw the scaled image at the center of the canvas
//                canvas.drawBitmap(frames[i], 1, 1, null);
//
//                canvas.restore();
//                postInvalidate();
//            }
//        }
//        else
//        {
//            i = 0;
//            postInvalidate();
//        }
//    }
//}


