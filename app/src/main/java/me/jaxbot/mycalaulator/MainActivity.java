package me.jaxbot.mycalaulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static me.jaxbot.mycalaulator.R.id.one;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText et;
    String temp;
    double val1,val2;
    String result="";
    Button equalto,cross,add,sub,multi,div,zero0,one1,two2,three3,four4,five5,six6,seven7,eight8,nine9,point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button20);
        point=(Button)findViewById(R.id.button10);
        equalto=(Button)findViewById(R.id.button14);
        sub=(Button)findViewById(R.id.button21);
        multi=(Button)findViewById(R.id.button22);
        div=(Button)findViewById(R.id.button23);
        zero0=(Button)findViewById(R.id.zero);
        one1=(Button)findViewById(one);
        two2=(Button)findViewById(R.id.two);
        three3=(Button)findViewById(R.id.three);
        four4=(Button)findViewById(R.id.four);
        five5=(Button)findViewById(R.id.five);
        six6=(Button)findViewById(R.id.six);
        seven7=(Button)findViewById(R.id.seven);
        eight8=(Button)findViewById(R.id.eight);
        nine9=(Button)findViewById(R.id.nine);
        cross=(Button)findViewById(R.id.button2);
        add.setOnClickListener(this);
        point.setOnClickListener(this);
        equalto.setOnClickListener(this);
        sub.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
        zero0.setOnClickListener(this);
        one1.setOnClickListener(this);
        two2.setOnClickListener(this);
        three3.setOnClickListener(this);
        four4.setOnClickListener(this);
        five5.setOnClickListener(this);
        six6.setOnClickListener(this);
        seven7.setOnClickListener(this);
        eight8.setOnClickListener(this);
        nine9.setOnClickListener(this);
        cross.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

//        if(TextUtils.isEmpty(et.getText().toString()))
//        {
//            return;
//        }

        switch(view.getId())
        {

            case R.id.button20 :
                val1=Double.valueOf((et.getText().toString()));
                et.setText("");
               temp="+";
                result="";


                break;

            case R.id.button21:
                val1=Double.valueOf((et.getText().toString()));
                et.setText("");
               temp="-";
                result="";
                break;


            case R.id.button22:
                val1=Double.valueOf((et.getText().toString()));
                et.setText("");
               temp="*";
                result="";
                break;

            case one:
                result=(result+"1");
                et.setText(result);


                break;
            case R.id.button23:
                val1=Double.valueOf((et.getText().toString()));
                et.setText("");
                temp="/";
                result="";
                break;
            case R.id.two:
               result=(result+"2");
                et.setText(result);
                break;

            case R.id.three:
                result=(result+"3");
                et.setText(result);
                break;
            case R.id.four:
                result=(result+"4");
                et.setText(result);
                break;
            case R.id.five:
                result=(result+"5");
                et.setText(result);
                break;
            case R.id.six:
                result=(result+"6");
                et.setText(result);
                break;
            case R.id.seven:
                result=(result+"7");
                et.setText(result);
                break;
            case R.id.button10:
                result=(result+".");
                et.setText(result);
                break;
            case R.id.eight:
                result=(result+"8");
                et.setText(result);
                break;
            case R.id.nine:
                result=(result+"9");
                et.setText(result);
                break;
            case R.id.zero:
                result=(result+"0");
                et.setText(result);
                break;
            case R.id.button2:
              result="";
                et.setText("");

                break;
            case R.id.button14:
                if(!result.equals(null))
                {

                    val2=Double.valueOf((et.getText().toString()));
                           if(temp=="+")
                               val1=val1+val2;
                    else
                               if(temp=="-")
                                   val1=val1-val2;
                    else
                                   if(temp=="*")
                                       val1=val1*val2;
                    else
                                       val1=val1/val2;
                    et.setText(val1+"");

                }
                break;
            default:

        }
    }
}
