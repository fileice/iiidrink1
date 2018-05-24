package tw.org.iii.iiidrink;

import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actMain extends AppCompatActivity {
    //類別變數;
    int 杯數1 = 0, 杯數2 = 0, 杯數3 = 0, 杯數4 = 0, 杯數5 = 0;
    double 售價1 = 0.0, 售價2 = 0.0, 售價3 = 0.0, 售價4 = 0.0, 售價5 = 0.0;
    double 品項1總價 = 0.0, 品項2總價 = 0.0, 品項3總價 = 0.0,
            品項4總價 = 0.0, 品項5總價 = 0.0;
    int 總杯數 = 0;
    double 總價 = 0.0;

    private View.OnClickListener btn_add1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數1++;
            tv1.setText(" " + 杯數1 + " ");

        }
    };
    private View.OnClickListener btn_add2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數2++;
            tv2.setText(" " + 杯數2 + " ");
        }
    };
    private View.OnClickListener btn_add3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數3++;
            tv3.setText(" " + 杯數3 + " ");
        }
    };
    private View.OnClickListener btn_add4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數4++;
            tv4.setText(" " + 杯數4 + " ");
        }
    };
    private View.OnClickListener btn_add5_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數5++;
            tv5.setText(" " + 杯數5 + " ");
        }
    };
    private View.OnClickListener btn_down1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數1--;
            if(杯數1 < 0)
                杯數1 = 0;
            tv1.setText(" " + 杯數1 + " ");
        }
    };
    private View.OnClickListener btn_down2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數2--;
            if(杯數2 < 0)
                杯數2 = 0;
            tv2.setText(" " + 杯數2 + " ");
        }
    };
    private View.OnClickListener btn_down3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數3--;
            if(杯數3 < 0)
                杯數3 = 0;
            tv3.setText(" " + 杯數3 + " ");
        }
    };
    private View.OnClickListener btn_down4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數4--;
            if(杯數4 < 0)
                杯數4 = 0;
            tv4.setText(" " + 杯數4 + " ");
        }
    };
    private View.OnClickListener btn_down5_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            杯數5--;
            if(杯數5 < 0)
                杯數5 = 0;
            tv5.setText(" " + 杯數5 + " ");
        }
    };
    private View.OnClickListener btn_enter_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new AlertDialog.Builder(actMain.this).setTitle("詳細訂購").setMessage(txt_order.getText()).show();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();


    }

    private void InitialComponent() {
        coffee = (TextView)findViewById(R.id.coffee);
        milk = (TextView)findViewById(R.id.milk);
        juice = (TextView)findViewById(R.id.juice);
        ham = (TextView)findViewById(R.id.ham);
        dount = (TextView)findViewById(R.id.dount);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        txt_order = (TextView)findViewById(R.id.txt_order);
        priceCoffee = (TextView)findViewById(R.id.priceCoffee);
        priceCoffee.setText("40");
        priceMilk = (TextView)findViewById(R.id.priceMilk);
        priceMilk.setText("30");
        pricejuice = (TextView)findViewById(R.id.pricejuice);
        pricejuice.setText("20");
        priceham = (TextView)findViewById(R.id.priceham);
        priceham.setText("50");
        priceDount = (TextView)findViewById(R.id.priceDount);
        priceDount.setText("10");

        tv1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                Enter();
            }
        });
        tv2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                Enter();
            }
        });
        tv3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                Enter();
            }
        });
        tv4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                Enter();
            }
        });
        tv5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                Enter();
            }
        });

        btn_add1 = (Button)findViewById(R.id.btn_add1);
        btn_add1.setOnClickListener(btn_add1_click);
        btn_add2 = (Button)findViewById(R.id.btn_add2);
        btn_add2.setOnClickListener(btn_add2_click);
        btn_add3 = (Button)findViewById(R.id.btn_add3);
        btn_add3.setOnClickListener(btn_add3_click);
        btn_add4 = (Button)findViewById(R.id.btn_add4);
        btn_add4.setOnClickListener(btn_add4_click);
        btn_add5 = (Button)findViewById(R.id.btn_add5);
        btn_add5.setOnClickListener(btn_add5_click);

        btn_down1 = (Button)findViewById(R.id.btn_down1);
        btn_down1.setOnClickListener(btn_down1_click);
        btn_down2 = (Button)findViewById(R.id.btn_down2);
        btn_down2.setOnClickListener(btn_down2_click);
        btn_down3 = (Button)findViewById(R.id.btn_down3);
        btn_down3.setOnClickListener(btn_down3_click);
        btn_down4 = (Button)findViewById(R.id.btn_down4);
        btn_down4.setOnClickListener(btn_down4_click);
        btn_down5 = (Button)findViewById(R.id.btn_down5);
        btn_down5.setOnClickListener(btn_down5_click);

        btn_enter = (Button)findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(btn_enter_click);

    }

    Button btn_add1;
    Button btn_add2;
    Button btn_add3;
    Button btn_add4;
    Button btn_add5;

    Button btn_down1;
    Button btn_down2;
    Button btn_down3;
    Button btn_down4;
    Button btn_down5;

    Button btn_enter;

    TextView coffee;
    TextView milk;
    TextView juice;
    TextView ham;
    TextView dount;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView priceCoffee;
    TextView priceMilk;
    TextView pricejuice;
    TextView priceham;
    TextView priceDount;
    TextView txt_order;

    //------------------------------------

    public void Enter(){
        售價1 = Double.parseDouble(priceCoffee.getText().toString());
        售價2 = Double.parseDouble(priceMilk.getText().toString());
        售價3 = Double.parseDouble(pricejuice.getText().toString());
        售價4 = Double.parseDouble(priceham.getText().toString());
        售價5 = Double.parseDouble(priceDount.getText().toString());

        品項1總價 = 售價1 * 杯數1;
        品項2總價 = 售價2 * 杯數2;
        品項3總價 = 售價3 * 杯數3;
        品項4總價 = 售價4 * 杯數4;
        品項5總價 = 售價5 * 杯數5;

        總杯數 = 杯數1 + 杯數2 + 杯數3 + 杯數4 + 杯數5;
        總價 = 品項1總價+品項2總價+品項3總價+品項4總價+品項5總價;

        String strOrder = "***** III冷飲店訂購單 *****\n";
        strOrder += "----------------------------\n";
        if (杯數1 > 0)
        {
            strOrder += coffee.getText() + " : " + priceCoffee.getText() + "元  x " + 杯數1 + "杯 = " + 品項1總價 + "\n";
        }
        if (杯數2 > 0)
        {
            strOrder += milk.getText() + ":" + priceMilk.getText() + "元  x" + 杯數2 + "杯 = " + 品項2總價 + "\n";
        }
        if (杯數3 > 0)
        {
            strOrder += juice.getText() + ":" + pricejuice.getText() + "元  x " + 杯數3 + "杯 = " + 品項3總價 + "\n";
        }
        if (杯數4 > 0)
        {
            strOrder += ham.getText() + ":" + priceham.getText() + "元  x " + 杯數4 + "杯 = " + 品項4總價 + "\n";
        }
        if (杯數5 > 0)
        {
            strOrder += dount.getText() + ":" + priceDount.getText() + "元  x " + 杯數5 + "杯 = " + 品項5總價 + "\n";
        }
        strOrder += "----------------------------\n";
        strOrder += "您購買了" + 總杯數 + "杯" + " + " + "總共 "+ 總價 + "元";

        txt_order.setText(strOrder);

    }




}
