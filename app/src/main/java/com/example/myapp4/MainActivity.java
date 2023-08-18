package com.example.myapp4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Switch swich;
//    ProgressBar pro;
    SeekBar seekb;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.text1);
        seekb = (SeekBar) findViewById(R.id.seek);
        seekb.setMax(100);
        seekb.setMin(0);
        seekb.setProgress(100);
        text.setText(String.valueOf(seekb.getProgress()));
        seekb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
              text.setText(String.valueOf(seekBar.getProgress()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        swich = (Switch) findViewById(R.id.sw1);
//        pro = (ProgressBar) findViewById(R.id.pr1);

//        swich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    pro.setVisibility(View.VISIBLE);
//                }else {
//                    pro.setVisibility(View.GONE);
//                }
//            }
//        });




    }

//        @Override

//        public void onBackPressed() {
//
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//
//            builder.setMessage("Do you want to exit ?");
//
//            builder.setTitle("Alert !");
//
//            builder.setCancelable(false);
//
//            builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
//                finish();
//            });
//
//            builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
//                dialog.cancel();
//            });
//
//            AlertDialog alertDialog = builder.create();
//            alertDialog.show();
//        }
    }