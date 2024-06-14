package sumago.androidipt.day5calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAdd, btnSub, btnMul, btnDiv;
    EditText etNum1, etNum2;
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvAns = findViewById(R.id.tvAns);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double n1 = 0d, n2 = 0d;
        double ans = 0d;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());

        if(v.getId() == R.id.btnAdd){
            ans = n1+n2;
            tvAns.setText(""+ans);
        }
        if(v.getId() == R.id.btnSub){
            ans = n1-n2;
            tvAns.setText(""+ans);
        }
        if(v.getId() == R.id.btnMul){
            ans = n1*n2;
            tvAns.setText(""+ans);
        }
        if(v.getId() == R.id.btnDiv){
            ans = n1/n2;
            tvAns.setText(""+ans);
        }

    }
}