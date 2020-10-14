package com.example.graphicsdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class GraphicsDemoActivity extends Activity
{
    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Draw();

        //Set tampilan ke ourView
        setContentView(ourView);
    }

    public void Draw()
    {
        //Deklarasi objek bitmap
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(500,1000, Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);

        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();

        //Mengubah warna canvas
        canvas.drawColor(Color.argb(255,247,239,215));

        //Deklarasi objek bitmap
        Bitmap bitmapRestart, bitmapPlay, bitmapQuit;

        bitmapPlay = BitmapFactory.decodeResource(this.getResources(), R.drawable.play_button);
        bitmapRestart = BitmapFactory.decodeResource(this.getResources(), R.drawable.restart_button);
        bitmapQuit = BitmapFactory.decodeResource(this.getResources(), R.drawable.quit_button);

        //Menggambar objek bitmap di tampilan layar
        canvas.drawBitmap(bitmapPlay, 160, 100, paint);
        canvas.drawBitmap(bitmapRestart, 160,250, paint);
        canvas.drawBitmap(bitmapQuit, 160,400, paint);

        //Ubah warna paint
        paint.setColor(Color.argb(255, 249,129, 0));

        //Menulis teks
        canvas.drawText("Graphics Demo Activity", 200,50, paint);

        //Menggambar kotak
        canvas.drawRect(100, 700, 400, 850, paint);

        paint.setColor(Color.argb(255, 255,255, 255));

        canvas.drawText("Vivian Azalia A", 210, 750, paint);
        canvas.drawText("4210191015", 215, 780, paint);
        canvas.drawText("Workshop Produksi Game 3", 170, 810, paint);
    }
}