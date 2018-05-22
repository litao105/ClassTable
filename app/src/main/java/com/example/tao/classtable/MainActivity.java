package com.example.tao.classtable;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private boolean flag = false;

    EditText[][] classedit = new EditText[6][6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //隐藏系统标题栏
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = PreferenceManager.getDefaultSharedPreferences(this);

        classedit[1][1] = findViewById(R.id.class11);
        classedit[1][2] = findViewById(R.id.class12);
        classedit[1][3] = findViewById(R.id.class13);
        classedit[1][4] = findViewById(R.id.class14);
        classedit[1][5] = findViewById(R.id.class15);
        classedit[2][1] = findViewById(R.id.class21);
        classedit[2][2] = findViewById(R.id.class22);
        classedit[2][3] = findViewById(R.id.class23);
        classedit[2][4] = findViewById(R.id.class24);
        classedit[2][5] = findViewById(R.id.class25);
        classedit[3][1] = findViewById(R.id.class31);
        classedit[3][2] = findViewById(R.id.class32);
        classedit[3][3] = findViewById(R.id.class33);
        classedit[3][4] = findViewById(R.id.class34);
        classedit[3][5] = findViewById(R.id.class35);
        classedit[4][1] = findViewById(R.id.class41);
        classedit[4][2] = findViewById(R.id.class42);
        classedit[4][3] = findViewById(R.id.class43);
        classedit[4][4] = findViewById(R.id.class44);
        classedit[4][5] = findViewById(R.id.class45);
        classedit[5][1] = findViewById(R.id.class51);
        classedit[5][2] = findViewById(R.id.class52);
        classedit[5][3] = findViewById(R.id.class53);
        classedit[5][4] = findViewById(R.id.class54);
        classedit[5][5] = findViewById(R.id.class55);

        pref = getSharedPreferences("classtable", MODE_PRIVATE);

        //设置文本框样式
        for (int i=1; i<classedit.length; i++){
            for (int j=1; j<classedit.length; j++){
                classedit[i][j].setTextSize(14);
                classedit[i][j].setTextColor(ContextCompat.getColor(this, R.color.edittext));
                classedit[i][j].setGravity(Gravity.CENTER | Gravity.CENTER_VERTICAL);
                classedit[i][j].setBackgroundColor(ContextCompat.getColor(this, R.color.editback));
                classedit[i][j].setHeight(210);
                classedit[i][j].setFocusable(false);
                classedit[i][j].setFocusableInTouchMode(false);
            }
        }

        //编辑切换按钮
        final Button buttonedit = findViewById(R.id.buttonedit);
        buttonedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag){
                    flag = true;
                    buttonedit.setText("保存");
                }else{
                    flag = false;
                    buttonedit.setText("编辑");
                }

                //设置文本框样式
                for (int i=1; i<classedit.length; i++){
                    for (int j=1; j<classedit.length; j++){
                        if(flag){
                            //使编辑框可编辑
                            classedit[i][j].setFocusableInTouchMode(true);
                            classedit[i][j].setFocusable(true);
                            classedit[i][j].requestFocus();
                            //classedit[i][j].setEnabled(true);
                        }else{
                            classedit[i][j].setFocusable(false);
                            classedit[i][j].setFocusableInTouchMode(false);
                            //classedit[i][j].setEnabled(false);
                        }
                    }
                }

            }
        });

        String [][] classes = new String[6][6];
        for (int i=1; i<classes.length; i++){
            for (int j=1; j<classes.length; j++){
                switch (i){
                    case 1:
                        switch (j){
                            case 1:
                                classes[i][j] = pref.getString("classes11", "");
                                break;
                            case 2:
                                classes[i][j] = pref.getString("classes12", "");
                                break;
                            case 3:
                                classes[i][j] = pref.getString("classes13", "");
                                break;
                            case 4:
                                classes[i][j] = pref.getString("classes14", "");
                                break;
                            case 5:
                                classes[i][j] = pref.getString("classes15", "");
                                break;
                        }
                        break;

                    case 2:
                        switch (j){
                            case 1:
                                classes[i][j] = pref.getString("classes21", "");
                                break;
                            case 2:
                                classes[i][j] = pref.getString("classes22", "");
                                break;
                            case 3:
                                classes[i][j] = pref.getString("classes23", "");
                                break;
                            case 4:
                                classes[i][j] = pref.getString("classes24", "");
                                break;
                            case 5:
                                classes[i][j] = pref.getString("classes25", "");
                                break;
                        }
                        break;

                    case 3:
                        switch (j){
                            case 1:
                                classes[i][j] = pref.getString("classes31", "");
                                break;
                            case 2:
                                classes[i][j] = pref.getString("classes32", "");
                                break;
                            case 3:
                                classes[i][j] = pref.getString("classes33", "");
                                break;
                            case 4:
                                classes[i][j] = pref.getString("classes34", "");
                                break;
                            case 5:
                                classes[i][j] = pref.getString("classes35", "");
                                break;
                        }
                        break;

                    case 4:
                        switch (j){
                            case 1:
                                classes[i][j] = pref.getString("classes41", "");
                                break;
                            case 2:
                                classes[i][j] = pref.getString("classes42", "");
                                break;
                            case 3:
                                classes[i][j] = pref.getString("classes43", "");
                                break;
                            case 4:
                                classes[i][j] = pref.getString("classes44", "");
                                break;
                            case 5:
                                classes[i][j] = pref.getString("classes45", "");
                                break;
                        }
                        break;

                    case 5:
                        switch (j){
                            case 1:
                                classes[i][j] = pref.getString("classes51", "");
                                break;
                            case 2:
                                classes[i][j] = pref.getString("classes52", "");
                                break;
                            case 3:
                                classes[i][j] = pref.getString("classes53", "");
                                break;
                            case 4:
                                classes[i][j] = pref.getString("classes54", "");
                                break;
                            case 5:
                                classes[i][j] = pref.getString("classes55", "");
                                break;
                        }
                        break;
                }
                classedit[i][j].setText(classes[i][j]);
                //Log.d("classes", "查询了一个" + classes[i][j]);
            }
        }

    }

    protected void onDestroy() {
        super.onDestroy();
        //Log.d("classes", "保存成功" );
        save();

    }

    public void save(){
        String [][] classes = new String[6][6];
        for (int i=1; i<classes.length; i++){
            for (int j=1; j<classes.length; j++){
                classes[i][j] = classedit[i][j].getText().toString();
                editor = getSharedPreferences("classtable", MODE_PRIVATE).edit();
                switch (i){
                    case 1:
                        switch (j){
                            case 1:
                                editor.putString("classes11", classes[i][j]);
                                break;
                            case 2:
                                editor.putString("classes12", classes[i][j]);
                                break;
                            case 3:
                                editor.putString("classes13", classes[i][j]);
                                break;
                            case 4:
                                editor.putString("classes14", classes[i][j]);
                                break;
                            case 5:
                                editor.putString("classes15", classes[i][j]);
                                break;
                        }
                        break;

                    case 2:
                        switch (j){
                            case 1:
                                editor.putString("classes21", classes[i][j]);
                                break;
                            case 2:
                                editor.putString("classes22", classes[i][j]);
                                break;
                            case 3:
                                editor.putString("classes23", classes[i][j]);
                                break;
                            case 4:
                                editor.putString("classes24", classes[i][j]);
                                break;
                            case 5:
                                editor.putString("classes25", classes[i][j]);
                                break;
                        }
                        break;

                    case 3:
                        switch (j){
                            case 1:
                                editor.putString("classes31", classes[i][j]);
                                break;
                            case 2:
                                editor.putString("classes32", classes[i][j]);
                                break;
                            case 3:
                                editor.putString("classes33", classes[i][j]);
                                break;
                            case 4:
                                editor.putString("classes34", classes[i][j]);
                                break;
                            case 5:
                                editor.putString("classes35", classes[i][j]);
                                break;
                        }
                        break;

                    case 4:
                        switch (j){
                            case 1:
                                editor.putString("classes41", classes[i][j]);
                                break;
                            case 2:
                                editor.putString("classes42", classes[i][j]);
                                break;
                            case 3:
                                editor.putString("classes43", classes[i][j]);
                                break;
                            case 4:
                                editor.putString("classes44", classes[i][j]);
                                break;
                            case 5:
                                editor.putString("classes45", classes[i][j]);
                                break;
                        }
                        break;

                    case 5:
                        switch (j){
                            case 1:
                                editor.putString("classes51", classes[i][j]);
                                break;
                            case 2:
                                editor.putString("classes52", classes[i][j]);
                                break;
                            case 3:
                                editor.putString("classes53", classes[i][j]);
                                break;
                            case 4:
                                editor.putString("classes54", classes[i][j]);
                                break;
                            case 5:
                                editor.putString("classes55", classes[i][j]);
                                break;
                        }
                        break;
                }
                editor.apply();
                //Log.d("classes", "保存了一个" + classes[i][j]);
            }
        }
    }
}

