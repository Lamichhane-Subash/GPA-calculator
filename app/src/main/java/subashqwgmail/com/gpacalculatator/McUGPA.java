package subashqwgmail.com.gpacalculatator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class McUGPA extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public String[] all = {"A+", "A","A-" ,"B+", "B", "B-","C+", "C", "C-","D+", "D","D-", "F","---"};
    private List<String> letterGrade = new ArrayList<>();
    private List<Integer> courseWeight = new ArrayList<>();
    private List<Integer> numberGrade = new ArrayList<>();
    private Spinner letter;
    private Spinner letter2;
    private Spinner letter3;
    private Spinner letter4;
    private Spinner letter5;
    private Spinner letter6;
    private Spinner letter7;
    private Spinner letter8;
    private Spinner letter9;
    private Spinner letter10;
    private EditText credit;
    private EditText credit2;
    private EditText credit3;
    private EditText credit4;
    private EditText credit5;
    private EditText credit6;
    private EditText credit7;
    private EditText credit8;
    private EditText credit9;
    private EditText credit10;

    private TextView result;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int btnOn = 0; //True
        letter = (Spinner) findViewById(R.id.spnletter);
        letter2 =  (Spinner)findViewById(R.id.spnletter2);
        letter3 = (Spinner)findViewById(R.id.spnletter3);
        letter4 =  (Spinner)findViewById(R.id.spnletter4);
        letter5 =  (Spinner)findViewById(R.id.spnletter5);
        letter6 =  (Spinner)findViewById(R.id.spnletter6);
        letter7 = (Spinner) findViewById(R.id.spnletter7);
        letter8 = (Spinner) findViewById(R.id.spnletter8);
        letter9 = (Spinner) findViewById(R.id.spnletter9);
        letter10 = (Spinner) findViewById(R.id.spnletter10);
        credit = (EditText) findViewById(R.id.txtcrd);
        credit2 = (EditText) findViewById(R.id.txtcrd2);
        credit3 = (EditText) findViewById(R.id.txtcrd3);
        credit4 = (EditText) findViewById(R.id.txtcrd4);
        credit5 = (EditText) findViewById(R.id.txtcrd5);
        credit6 = (EditText) findViewById(R.id.txtcrd6);
        credit7 = (EditText) findViewById(R.id.txtcrd7);
        credit8 = (EditText) findViewById(R.id.txtcrd8);
        credit9 = (EditText) findViewById(R.id.txtcrd9);
        credit10 = (EditText) findViewById(R.id.txtcrd10);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.lettersMcU, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        letter.setAdapter(adapter);
        letter2.setAdapter(adapter);
        letter3.setAdapter(adapter);
        letter4.setAdapter(adapter);
        letter5.setAdapter(adapter);
        letter6.setAdapter(adapter);
        letter7.setAdapter(adapter);
        letter8.setAdapter(adapter);
        letter9.setAdapter(adapter);
        letter10.setAdapter(adapter);
        letter.setOnItemSelectedListener(this);
        letter2.setOnItemSelectedListener(this);
        letter3.setOnItemSelectedListener(this);
        letter4.setOnItemSelectedListener(this);
        letter5.setOnItemSelectedListener(this);
        letter6.setOnItemSelectedListener(this);
        letter7.setOnItemSelectedListener(this);
        letter8.setOnItemSelectedListener(this);
        letter9.setOnItemSelectedListener(this);
        letter10.setOnItemSelectedListener(this);
        result = (TextView) findViewById(R.id.txtresult);
        final Button cal = (Button) findViewById(R.id.btncal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isEmpty();
                letterGrade.add(letter.getSelectedItem().toString());
                letterGrade.add(letter2.getSelectedItem().toString());
                letterGrade.add(letter3.getSelectedItem().toString());
                letterGrade.add(letter4.getSelectedItem().toString());
                letterGrade.add(letter5.getSelectedItem().toString());
                letterGrade.add(letter6.getSelectedItem().toString());
                letterGrade.add(letter7.getSelectedItem().toString());
                letterGrade.add(letter8.getSelectedItem().toString());
                letterGrade.add(letter9.getSelectedItem().toString());
                letterGrade.add(letter10.getSelectedItem().toString());

                courseWeight.add(Integer.parseInt(credit.getText().toString()));
                courseWeight.add(Integer.parseInt(credit2.getText().toString()));
                courseWeight.add(Integer.parseInt(credit3.getText().toString()));
                courseWeight.add(Integer.parseInt(credit4.getText().toString()));
                courseWeight.add(Integer.parseInt(credit5.getText().toString()));
                courseWeight.add(Integer.parseInt(credit6.getText().toString()));
                courseWeight.add(Integer.parseInt(credit7.getText().toString()));
                courseWeight.add(Integer.parseInt(credit8.getText().toString()));
                courseWeight.add(Integer.parseInt(credit9.getText().toString()));
                courseWeight.add(Integer.parseInt(credit10.getText().toString()));
                numberGrade();
                double valResult = calculated ();
                result.setText(String.format("%.2f", valResult));
                letterGrade.clear();
                courseWeight.clear();
                numberGrade.clear();
                clearAll();
            }
        });


        Button home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

    }
    /*
     *openHome() when home button is clicked returns the user back to homepage where they can select
     *  a new GPA school
     */
    public void openHome(){
        Intent intent =new Intent(this,Home.class);
        startActivity(intent);
    }

    /*
     * Makes a Toast displaying what the user has inputted
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String display = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),display,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /**
     * This method converts all letters contained in letterGrade to a numerical value
     */
    private void numberGrade() {
        for (int i = 0; i < this.letterGrade.size(); i++) {
            if (this.letterGrade.get(i).toUpperCase().equals(all[0])) {
                this.numberGrade.add(12);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[1])) {
                this.numberGrade.add(11);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[2])) {
                this.numberGrade.add(10);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[3])) {
                this.numberGrade.add(9);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[4])) {
                this.numberGrade.add(8);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[5])) {
                this.numberGrade.add(7);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[6])) {
                this.numberGrade.add(6);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[7])) {
                this.numberGrade.add(5);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[8])) {
                this.numberGrade.add(4);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[9])) {
                this.numberGrade.add(3);
            }
            if(this.letterGrade.get(i).toUpperCase().equals(all[10])){
                this.numberGrade.add(2);
            }
            if(this.letterGrade.get(i).toUpperCase().equals(all[11])){
                this.numberGrade.add(1);
            }
            if(this.letterGrade.get(i).toUpperCase().equals(all[12])){
                this.numberGrade.add(0);
            }
            if(this.letterGrade.get(i).toUpperCase().equals(all[13])){
                this.numberGrade.add(0);
            }
        }
    }

    /**
     * Returns the calculated GPA, in 9.0 scale, by multiplying the  number(s) associated
     * with the grades acclimated then dividing by the total credits
     *
     * @return a value containing the average GPA in 9.0 scale
     */
    private double calculated() {
        double result = 0;
        double multply = 0;
        double totalCredit = 0;
        for (int i = 0; i < this.numberGrade.size(); i++) {
            multply = multply + this.numberGrade.get(i) * this.courseWeight.get(i);
        }
        for (int i = 0; i < this.courseWeight.size(); i++) {
            totalCredit = totalCredit + courseWeight.get(i);
        }
        result = multply / totalCredit;
        return result;
    }

    /**
     * Checks credit texts ,and checks if they are empty.
     * If it's empty the user will get a notification
     */
    private void isEmpty(){
//
        credit = (EditText) findViewById(R.id.txtcrd);
        credit2 = (EditText) findViewById(R.id.txtcrd2);
        credit3 = (EditText) findViewById(R.id.txtcrd3);
        credit4 = (EditText) findViewById(R.id.txtcrd4);
        credit5 = (EditText) findViewById(R.id.txtcrd5);
        credit6 = (EditText) findViewById(R.id.txtcrd6);
        credit7 = (EditText) findViewById(R.id.txtcrd7);
        credit8 = (EditText) findViewById(R.id.txtcrd8);
        credit9 = (EditText) findViewById(R.id.txtcrd9);
        credit10 = (EditText) findViewById(R.id.txtcrd10);
        if (credit.length() == 0){
            credit.setText("0");
        }
        if (credit2.length() == 0){
            credit2.setText("0");

        }
        if (credit3.length() == 0){
            credit3.setText("0");

        }
        if (credit4.length() == 0){
            credit4.setText("0");
        }
        if (credit5.length() == 0){
            credit5.setText("0");

        }
        if (credit6.length() == 0){
            credit6.setText("0");

        }
        if (credit7.length() == 0){
            credit7.setText("0");

        }
        if (credit8.length() == 0){
            credit8.setText("0");

        }
        if (credit9.length() == 0){
            credit9.setText("0");

        }
        if (credit10.length() == 0){
            credit10.setText("0");

        }
    }

    /**
     * sets all EditTexts to "".
     */
    private void clearAll(){
        letter = (Spinner)findViewById(R.id.spnletter);
        letter2 = (Spinner) findViewById(R.id.spnletter2);
        letter3 = (Spinner) findViewById(R.id.spnletter3);
        letter4 =(Spinner)  findViewById(R.id.spnletter4);
        letter5 =  (Spinner)findViewById(R.id.spnletter5);
        letter6 = (Spinner) findViewById(R.id.spnletter6);
        letter7 = (Spinner) findViewById(R.id.spnletter7);
        letter8 =  (Spinner)findViewById(R.id.spnletter8);
        letter9 = (Spinner) findViewById(R.id.spnletter9);
        letter10 = (Spinner) findViewById(R.id.spnletter10);
//
        credit = (EditText) findViewById(R.id.txtcrd);
        credit7 = (EditText) findViewById(R.id.txtcrd2);
        credit2 = (EditText) findViewById(R.id.txtcrd3);
        credit3 = (EditText) findViewById(R.id.txtcrd4);
        credit4 = (EditText) findViewById(R.id.txtcrd5);
        credit5 = (EditText) findViewById(R.id.txtcrd6);
        credit6 = (EditText) findViewById(R.id.txtcrd7);
        credit8 = (EditText) findViewById(R.id.txtcrd8);
        credit9 = (EditText) findViewById(R.id.txtcrd9);
        credit10 = (EditText) findViewById(R.id.txtcrd10);
//


        // result.setText("");
        credit.setText("");
        credit2.setText("");
        credit3.setText("");
        credit4.setText("");
        credit5.setText("");
        credit6.setText("");
        credit7.setText("");
        credit8.setText("");
        credit9.setText("");
        credit10.setText("");
    }
}
