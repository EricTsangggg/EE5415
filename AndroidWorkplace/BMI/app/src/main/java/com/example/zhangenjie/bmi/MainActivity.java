package com.example.zhangenjie.bmi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Height;
    EditText Weight;
    Button btn;
    ImageView bmiImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onCreate", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Height=(EditText)findViewById(R.id.height);
        Weight=(EditText)findViewById(R.id.weight);
        btn=(Button)findViewById(R.id.btn);
        bmiImage=(ImageView)findViewById(R.id.bmi_image);
        registerForContextMenu(bmiImage);




    }

    public void about(View v) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(R.string.about_btn)
                .setMessage(R.string.about)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
    }


    public void opengl(View v){
        Intent i = new Intent(this, OpenGLES20Activity.class);
        startActivity(i);
    }

    public void btn_onClick(View v){

        String h=Height.getText().toString();
        String w=Weight.getText().toString();
        Toast toast;
        LinearLayout toastView;
        ImageView imageCodeProject;

        if(h.equals("")||w.equals("")){
            imageCodeProject=new ImageView(MainActivity.this);
            imageCodeProject.setImageResource(R.drawable.error);
            toast=Toast.makeText(MainActivity.this,R.string.warning,Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toastView=(LinearLayout)toast.getView();
            toastView.addView(imageCodeProject, 240, 240);
            toastView.setGravity(Gravity.CENTER);

            toast.show();

        } else {

            Intent i = new Intent(this, report.class); //action: this->report
            Bundle b = new Bundle();                   //values: h,w->
            b.putString("Height", h);
            b.putString("Weight", w);
            i.putExtras(b);
            startActivity(i);
        }

    }




    @Override
    protected void onStart() {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onStart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onStart");

        super.onStart();

    }

    @Override
    protected void onResume() {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onResume", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onResume");

        super.onResume();

    }

    @Override
    protected void onPause() {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onPause", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onPause");

        super.onPause();


    }

    @Override
    protected void onStop() {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onStop", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onStop");

        super.onStop();

    }

    @Override
    protected void onRestart() {
        Toast toast;
        toast=Toast.makeText(MainActivity.this, " onRestart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onRestart");

        super.onRestart();

    }

    @Override
    protected void onDestroy() {
        Toast toast;
        toast=Toast.makeText(MainActivity.
                this, " onDestroy", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        Log.d("zhangenjieAPP: ", " onDestroy");
        super.onDestroy();



    }
}
