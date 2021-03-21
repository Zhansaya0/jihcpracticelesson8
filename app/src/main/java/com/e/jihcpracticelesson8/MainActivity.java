package com.e.jihcpracticelesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button btn_tekseru;
    TextView tv_surak1,tv_surak2, tv_surak3, tv_surak4;
    RadioButton rb_s1_jauap1, rb_s1_jauap2, rb_s2_jauap1, rb_s2_jauap2, rb_s3_jauap1, rb_s3_jauap2, rb_s4_jauap1, rb_s4_jauap2;
    String [] suraktar = {"0", "10/5=?", "25*25=?", "30-(-15)=?", "64*(1/4)=?"};
    String [][] variant = {
            {"0", "0"},
            {"2","5"},
            {"825","625"},
            {"15","45"},
            {"16","256"},
    };
    String [] jauaptar = {"0", "2", "625", "45", "16"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_surak1 = findViewById(R.id.tv_surak1);
        tv_surak2 = findViewById(R.id.tv_surak2);
        tv_surak3 = findViewById(R.id.tv_surak3);
        tv_surak4 = findViewById(R.id.tv_surak4);


         rb_s1_jauap1= findViewById(R.id.rb_s1_jauap1);
         rb_s1_jauap2= findViewById(R.id.rb_s1_jauap2);

         rb_s2_jauap1= findViewById(R.id.rb_s2_jauap1);
         rb_s2_jauap2= findViewById(R.id.rb_s2_jauap2);

         rb_s3_jauap1= findViewById(R.id.rb_s3_jauap1);
         rb_s3_jauap2= findViewById(R.id.rb_s3_jauap2);

         rb_s4_jauap1= findViewById(R.id.rb_s4_jauap1);
         rb_s4_jauap2= findViewById(R.id.rb_s4_jauap2);

         btn_tekseru = findViewById(R.id.btn_tekseru);

        suraktarJinau();

        btn_tekseru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekseru(tv_surak1, rb_s1_jauap1, rb_s1_jauap2 , 1);
                tekseru(tv_surak2, rb_s2_jauap1, rb_s2_jauap2 , 2);
                tekseru(tv_surak3, rb_s3_jauap1, rb_s3_jauap2 , 3);
                tekseru(tv_surak4, rb_s4_jauap1, rb_s4_jauap2 , 4);
            }
        });
    }
    public void tekseru(TextView tv_surak, RadioButton rb1, RadioButton rb2, int index){
        if(rb1.isChecked() &&
            rb1.getText().toString().equals(jauaptar[index])){
        tv_surak.setText(suraktar[index] +"\nдұрыс");
        tv_surak.setTextColor(getResources().getColor(R.color.green));
    }else if(rb2.isChecked() &&
            rb2.getText().toString().equals(jauaptar[index])) {
        tv_surak.setText(suraktar[index] +"\nдұрыс");
        tv_surak.setTextColor(getResources().getColor(R.color.green));
    }else {
        tv_surak.setText(suraktar[index] +"\nқате");
        tv_surak.setTextColor(getResources().getColor(R.color.red));
    }

    }
    public void suraktarJinau(){
        tv_surak1.setText(suraktar[1]);
        rb_s1_jauap1.setText(variant[1][0]);
        rb_s1_jauap2.setText(variant[1][1]);

        tv_surak2.setText(suraktar[2]);
        rb_s2_jauap1.setText(variant[2][0]);
        rb_s2_jauap2.setText(variant[2][1]);

        tv_surak3.setText(suraktar[3]);
        rb_s3_jauap1.setText(variant[3][0]);
        rb_s3_jauap2.setText(variant[3][1]);

        tv_surak4.setText(suraktar[4]);
        rb_s4_jauap1.setText(variant[4][0]);
        rb_s4_jauap2.setText(variant[4][1]);
    }
}