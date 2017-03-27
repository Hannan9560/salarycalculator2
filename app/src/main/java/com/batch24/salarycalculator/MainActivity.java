package com.batch24.salarycalculator;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText salryET;
    private EditText medicalET;
    private EditText rentET;
    private Button salarybtn;
    private TextView showTV;

    private Calculation calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salryET = (EditText) findViewById(R.id.salary);
        medicalET = (EditText) findViewById(R.id.medical);
        rentET = (EditText) findViewById(R.id.rent);
        salarybtn = (Button) findViewById(R.id.salarybtn);
        showTV = (TextView) findViewById(R.id.show);

        calculation = new Calculation();

    }

    public void calculate(View view) {
        try{
            double proSalary = Double.parseDouble(salryET.getText().toString());
            double medical = Double.parseDouble(medicalET.getText().toString());
            double rent = Double.parseDouble(rentET.getText().toString());

            calculation.setSalary(proSalary);
            calculation.setMedical(medical);
            calculation.setRent(rent);
            double salary1 = ((proSalary*medical)/100)+proSalary-((((proSalary*medical)/100)+proSalary)*15)/100;
            showTV.setText(String.valueOf(salary1));


        }catch (Exception e)
        {

        }
    }
}