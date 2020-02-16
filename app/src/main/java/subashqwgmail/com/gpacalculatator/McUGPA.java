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
    private Spinner letter11;
    private Spinner letter12;
    private Spinner letter13;
    private Spinner letter14;
    private Spinner letter15;
    private Spinner letter16;
    private Spinner letter17;
    private Spinner letter18;
    private Spinner letter19;
    private Spinner letter20;
    private Spinner letter21;
    private Spinner letter22;
    private Spinner letter23;
    private Spinner letter24;
    private Spinner letter25;
    private Spinner letter26;
    private Spinner letter27;
    private Spinner letter28;
    private Spinner letter29;
    private Spinner letter30;
    private Spinner letter31;
    private Spinner letter32;
    private Spinner letter33;
    private Spinner letter34;
    private Spinner letter35;
    private Spinner letter36;
    private Spinner letter37;
    private Spinner letter38;
    private Spinner letter39;
    private Spinner letter40;
    private Spinner letter41;
    private Spinner letter42;
    private Spinner letter43;
    private Spinner letter44;
    private Spinner letter45;
    private Spinner letter46;
    private Spinner letter47;
    private Spinner letter48;
    private Spinner letter49;
    private Spinner letter50;
    //
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
    private EditText credit11;
    private EditText credit12;
    private EditText credit13;
    private EditText credit14;
    private EditText credit15;
    private EditText credit16;
    private EditText credit17;
    private EditText credit18;
    private EditText credit19;
    private EditText credit20;
    private EditText credit21;
    private EditText credit22;
    private EditText credit23;
    private EditText credit24;
    private EditText credit25;
    private EditText credit26;
    private EditText credit27;
    private EditText credit28;
    private EditText credit29;
    private EditText credit30;
    private EditText credit31;
    private EditText credit32;
    private EditText credit33;
    private EditText credit34;
    private EditText credit35;
    private EditText credit36;
    private EditText credit37;
    private EditText credit38;
    private EditText credit39;
    private EditText credit40;
    private EditText credit41;
    private EditText credit42;
    private EditText credit43;
    private EditText credit44;
    private EditText credit45;
    private EditText credit46;
    private EditText credit47;
    private EditText credit48;
    private EditText credit49;
    private EditText credit50;

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
        letter11 = (Spinner) findViewById(R.id.spnletter11);
        letter12 =  (Spinner)findViewById(R.id.spnletter12);
        letter13 = (Spinner)findViewById(R.id.spnletter13);
        letter14 =  (Spinner)findViewById(R.id.spnletter14);
        letter15 =  (Spinner)findViewById(R.id.spnletter15);
        letter16 =  (Spinner)findViewById(R.id.spnletter16);
        letter17 = (Spinner) findViewById(R.id.spnletter17);
        letter18 = (Spinner) findViewById(R.id.spnletter18);
        letter19 = (Spinner) findViewById(R.id.spnletter19);
        letter20 = (Spinner) findViewById(R.id.spnletter20);
        letter21 = (Spinner) findViewById(R.id.spnletter21);
        letter22 =  (Spinner)findViewById(R.id.spnletter22);
        letter23 = (Spinner)findViewById(R.id.spnletter23);
        letter24 =  (Spinner)findViewById(R.id.spnletter24);
        letter25 =  (Spinner)findViewById(R.id.spnletter25);
        letter26 =  (Spinner)findViewById(R.id.spnletter26);
        letter27 = (Spinner) findViewById(R.id.spnletter27);
        letter28 = (Spinner) findViewById(R.id.spnletter28);
        letter29 = (Spinner) findViewById(R.id.spnletter29);
        letter30 = (Spinner) findViewById(R.id.spnletter30);
        letter31 = (Spinner) findViewById(R.id.spnletter31);
        letter32 =  (Spinner)findViewById(R.id.spnletter32);
        letter33 = (Spinner)findViewById(R.id.spnletter33);
        letter34 =  (Spinner)findViewById(R.id.spnletter34);
        letter35 =  (Spinner)findViewById(R.id.spnletter35);
        letter36 =  (Spinner)findViewById(R.id.spnletter36);
        letter37 = (Spinner) findViewById(R.id.spnletter37);
        letter38 = (Spinner) findViewById(R.id.spnletter38);
        letter39 = (Spinner) findViewById(R.id.spnletter39);
        letter40 = (Spinner) findViewById(R.id.spnletter40);
        letter41 = (Spinner) findViewById(R.id.spnletter41);
        letter42 =  (Spinner)findViewById(R.id.spnletter42);
        letter43 = (Spinner)findViewById(R.id.spnletter43);
        letter44 =  (Spinner)findViewById(R.id.spnletter44);
        letter45 =  (Spinner)findViewById(R.id.spnletter45);
        letter46 =  (Spinner)findViewById(R.id.spnletter46);
        letter47 = (Spinner) findViewById(R.id.spnletter47);
        letter48 = (Spinner) findViewById(R.id.spnletter48);
        letter49 = (Spinner) findViewById(R.id.spnletter49);
        letter50 = (Spinner) findViewById(R.id.spnletter50);
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
        credit11 = (EditText) findViewById(R.id.txtcrd11);
        credit12 = (EditText) findViewById(R.id.txtcrd12);
        credit13 = (EditText) findViewById(R.id.txtcrd13);
        credit14 = (EditText) findViewById(R.id.txtcrd14);
        credit15 = (EditText) findViewById(R.id.txtcrd15);
        credit16 = (EditText) findViewById(R.id.txtcrd16);
        credit17 = (EditText) findViewById(R.id.txtcrd17);
        credit18 = (EditText) findViewById(R.id.txtcrd18);
        credit19 = (EditText) findViewById(R.id.txtcrd19);
        credit20 = (EditText) findViewById(R.id.txtcrd20);
        credit21 = (EditText) findViewById(R.id.txtcrd21);
        credit22 = (EditText) findViewById(R.id.txtcrd22);
        credit23 = (EditText) findViewById(R.id.txtcrd23);
        credit24 = (EditText) findViewById(R.id.txtcrd24);
        credit25 = (EditText) findViewById(R.id.txtcrd25);
        credit26 = (EditText) findViewById(R.id.txtcrd26);
        credit27 = (EditText) findViewById(R.id.txtcrd27);
        credit28 = (EditText) findViewById(R.id.txtcrd28);
        credit29 = (EditText) findViewById(R.id.txtcrd29);
        credit30 = (EditText) findViewById(R.id.txtcrd30);
        credit31 = (EditText) findViewById(R.id.txtcrd31);
        credit32 = (EditText) findViewById(R.id.txtcrd32);
        credit33 = (EditText) findViewById(R.id.txtcrd33);
        credit34 = (EditText) findViewById(R.id.txtcrd34);
        credit35 = (EditText) findViewById(R.id.txtcrd35);
        credit36 = (EditText) findViewById(R.id.txtcrd36);
        credit37 = (EditText) findViewById(R.id.txtcrd37);
        credit38 = (EditText) findViewById(R.id.txtcrd38);
        credit39 = (EditText) findViewById(R.id.txtcrd39);
        credit40 = (EditText) findViewById(R.id.txtcrd40);
        credit41 = (EditText) findViewById(R.id.txtcrd41);
        credit42 = (EditText) findViewById(R.id.txtcrd42);
        credit43 = (EditText) findViewById(R.id.txtcrd43);
        credit44 = (EditText) findViewById(R.id.txtcrd44);
        credit45 = (EditText) findViewById(R.id.txtcrd45);
        credit46 = (EditText) findViewById(R.id.txtcrd46);
        credit47 = (EditText) findViewById(R.id.txtcrd47);
        credit48 = (EditText) findViewById(R.id.txtcrd48);
        credit49 = (EditText) findViewById(R.id.txtcrd49);
        credit50 = (EditText) findViewById(R.id.txtcrd50);
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
        letter11.setAdapter(adapter);
        letter12.setAdapter(adapter);
        letter13.setAdapter(adapter);
        letter14.setAdapter(adapter);
        letter15.setAdapter(adapter);
        letter16.setAdapter(adapter);
        letter17.setAdapter(adapter);
        letter18.setAdapter(adapter);
        letter19.setAdapter(adapter);
        letter20.setAdapter(adapter);
        letter21.setAdapter(adapter);
        letter22.setAdapter(adapter);
        letter23.setAdapter(adapter);
        letter24.setAdapter(adapter);
        letter25.setAdapter(adapter);
        letter26.setAdapter(adapter);
        letter27.setAdapter(adapter);
        letter28.setAdapter(adapter);
        letter29.setAdapter(adapter);
        letter30.setAdapter(adapter);
        letter31.setAdapter(adapter);
        letter32.setAdapter(adapter);
        letter33.setAdapter(adapter);
        letter34.setAdapter(adapter);
        letter35.setAdapter(adapter);
        letter36.setAdapter(adapter);
        letter37.setAdapter(adapter);
        letter38.setAdapter(adapter);
        letter39.setAdapter(adapter);
        letter40.setAdapter(adapter);
        letter41.setAdapter(adapter);
        letter42.setAdapter(adapter);
        letter43.setAdapter(adapter);
        letter44.setAdapter(adapter);
        letter45.setAdapter(adapter);
        letter46.setAdapter(adapter);
        letter47.setAdapter(adapter);
        letter48.setAdapter(adapter);
        letter49.setAdapter(adapter);
        letter50.setAdapter(adapter);

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
        letter11.setOnItemSelectedListener(this);
        letter12.setOnItemSelectedListener(this);
        letter13.setOnItemSelectedListener(this);
        letter14.setOnItemSelectedListener(this);
        letter15.setOnItemSelectedListener(this);
        letter16.setOnItemSelectedListener(this);
        letter17.setOnItemSelectedListener(this);
        letter18.setOnItemSelectedListener(this);
        letter19.setOnItemSelectedListener(this);
        letter20.setOnItemSelectedListener(this);
        letter21.setOnItemSelectedListener(this);
        letter22.setOnItemSelectedListener(this);
        letter23.setOnItemSelectedListener(this);
        letter24.setOnItemSelectedListener(this);
        letter25.setOnItemSelectedListener(this);
        letter26.setOnItemSelectedListener(this);
        letter27.setOnItemSelectedListener(this);
        letter28.setOnItemSelectedListener(this);
        letter29.setOnItemSelectedListener(this);
        letter30.setOnItemSelectedListener(this);
        letter31.setOnItemSelectedListener(this);
        letter32.setOnItemSelectedListener(this);
        letter33.setOnItemSelectedListener(this);
        letter34.setOnItemSelectedListener(this);
        letter35.setOnItemSelectedListener(this);
        letter36.setOnItemSelectedListener(this);
        letter37.setOnItemSelectedListener(this);
        letter38.setOnItemSelectedListener(this);
        letter39.setOnItemSelectedListener(this);
        letter40.setOnItemSelectedListener(this);
        letter41.setOnItemSelectedListener(this);
        letter42.setOnItemSelectedListener(this);
        letter43.setOnItemSelectedListener(this);
        letter44.setOnItemSelectedListener(this);
        letter45.setOnItemSelectedListener(this);
        letter46.setOnItemSelectedListener(this);
        letter47.setOnItemSelectedListener(this);
        letter48.setOnItemSelectedListener(this);
        letter49.setOnItemSelectedListener(this);
        letter50.setOnItemSelectedListener(this);
        //
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
                letterGrade.add(letter11.getSelectedItem().toString());
                letterGrade.add(letter12.getSelectedItem().toString());
                letterGrade.add(letter13.getSelectedItem().toString());
                letterGrade.add(letter14.getSelectedItem().toString());
                letterGrade.add(letter15.getSelectedItem().toString());
                letterGrade.add(letter16.getSelectedItem().toString());
                letterGrade.add(letter17.getSelectedItem().toString());
                letterGrade.add(letter18.getSelectedItem().toString());
                letterGrade.add(letter19.getSelectedItem().toString());
                letterGrade.add(letter20.getSelectedItem().toString());
                letterGrade.add(letter21.getSelectedItem().toString());
                letterGrade.add(letter22.getSelectedItem().toString());
                letterGrade.add(letter23.getSelectedItem().toString());
                letterGrade.add(letter24.getSelectedItem().toString());
                letterGrade.add(letter25.getSelectedItem().toString());
                letterGrade.add(letter26.getSelectedItem().toString());
                letterGrade.add(letter27.getSelectedItem().toString());
                letterGrade.add(letter28.getSelectedItem().toString());
                letterGrade.add(letter29.getSelectedItem().toString());
                letterGrade.add(letter30.getSelectedItem().toString());
                letterGrade.add(letter31.getSelectedItem().toString());
                letterGrade.add(letter32.getSelectedItem().toString());
                letterGrade.add(letter33.getSelectedItem().toString());
                letterGrade.add(letter34.getSelectedItem().toString());
                letterGrade.add(letter35.getSelectedItem().toString());
                letterGrade.add(letter36.getSelectedItem().toString());
                letterGrade.add(letter37.getSelectedItem().toString());
                letterGrade.add(letter38.getSelectedItem().toString());
                letterGrade.add(letter39.getSelectedItem().toString());
                letterGrade.add(letter40.getSelectedItem().toString());
                letterGrade.add(letter41.getSelectedItem().toString());
                letterGrade.add(letter42.getSelectedItem().toString());
                letterGrade.add(letter43.getSelectedItem().toString());
                letterGrade.add(letter44.getSelectedItem().toString());
                letterGrade.add(letter45.getSelectedItem().toString());
                letterGrade.add(letter46.getSelectedItem().toString());
                letterGrade.add(letter47.getSelectedItem().toString());
                letterGrade.add(letter48.getSelectedItem().toString());
                letterGrade.add(letter49.getSelectedItem().toString());
                letterGrade.add(letter50.getSelectedItem().toString());


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
                courseWeight.add(Integer.parseInt(credit11.getText().toString()));
                courseWeight.add(Integer.parseInt(credit12.getText().toString()));
                courseWeight.add(Integer.parseInt(credit13.getText().toString()));
                courseWeight.add(Integer.parseInt(credit14.getText().toString()));
                courseWeight.add(Integer.parseInt(credit15.getText().toString()));
                courseWeight.add(Integer.parseInt(credit16.getText().toString()));
                courseWeight.add(Integer.parseInt(credit17.getText().toString()));
                courseWeight.add(Integer.parseInt(credit18.getText().toString()));
                courseWeight.add(Integer.parseInt(credit19.getText().toString()));
                courseWeight.add(Integer.parseInt(credit20.getText().toString()));
                courseWeight.add(Integer.parseInt(credit21.getText().toString()));
                courseWeight.add(Integer.parseInt(credit22.getText().toString()));
                courseWeight.add(Integer.parseInt(credit23.getText().toString()));
                courseWeight.add(Integer.parseInt(credit24.getText().toString()));
                courseWeight.add(Integer.parseInt(credit25.getText().toString()));
                courseWeight.add(Integer.parseInt(credit26.getText().toString()));
                courseWeight.add(Integer.parseInt(credit27.getText().toString()));
                courseWeight.add(Integer.parseInt(credit28.getText().toString()));
                courseWeight.add(Integer.parseInt(credit29.getText().toString()));
                courseWeight.add(Integer.parseInt(credit30.getText().toString()));
                courseWeight.add(Integer.parseInt(credit31.getText().toString()));
                courseWeight.add(Integer.parseInt(credit32.getText().toString()));
                courseWeight.add(Integer.parseInt(credit33.getText().toString()));
                courseWeight.add(Integer.parseInt(credit34.getText().toString()));
                courseWeight.add(Integer.parseInt(credit35.getText().toString()));
                courseWeight.add(Integer.parseInt(credit36.getText().toString()));
                courseWeight.add(Integer.parseInt(credit37.getText().toString()));
                courseWeight.add(Integer.parseInt(credit38.getText().toString()));
                courseWeight.add(Integer.parseInt(credit39.getText().toString()));
                courseWeight.add(Integer.parseInt(credit40.getText().toString()));
                courseWeight.add(Integer.parseInt(credit41.getText().toString()));
                courseWeight.add(Integer.parseInt(credit42.getText().toString()));
                courseWeight.add(Integer.parseInt(credit43.getText().toString()));
                courseWeight.add(Integer.parseInt(credit44.getText().toString()));
                courseWeight.add(Integer.parseInt(credit45.getText().toString()));
                courseWeight.add(Integer.parseInt(credit46.getText().toString()));
                courseWeight.add(Integer.parseInt(credit47.getText().toString()));
                courseWeight.add(Integer.parseInt(credit48.getText().toString()));
                courseWeight.add(Integer.parseInt(credit49.getText().toString()));
                courseWeight.add(Integer.parseInt(credit50.getText().toString()));
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
        credit11 = (EditText) findViewById(R.id.txtcrd11);
        credit12 = (EditText) findViewById(R.id.txtcrd12);
        credit13 = (EditText) findViewById(R.id.txtcrd13);
        credit14 = (EditText) findViewById(R.id.txtcrd14);
        credit15 = (EditText) findViewById(R.id.txtcrd15);
        credit16 = (EditText) findViewById(R.id.txtcrd16);
        credit17 = (EditText) findViewById(R.id.txtcrd17);
        credit18 = (EditText) findViewById(R.id.txtcrd18);
        credit19 = (EditText) findViewById(R.id.txtcrd19);
        credit20 = (EditText) findViewById(R.id.txtcrd20);
        credit21 = (EditText) findViewById(R.id.txtcrd21);
        credit22 = (EditText) findViewById(R.id.txtcrd22);
        credit23 = (EditText) findViewById(R.id.txtcrd23);
        credit24 = (EditText) findViewById(R.id.txtcrd24);
        credit25 = (EditText) findViewById(R.id.txtcrd25);
        credit26 = (EditText) findViewById(R.id.txtcrd26);
        credit27 = (EditText) findViewById(R.id.txtcrd27);
        credit28 = (EditText) findViewById(R.id.txtcrd28);
        credit29 = (EditText) findViewById(R.id.txtcrd29);
        credit30 = (EditText) findViewById(R.id.txtcrd30);
        credit31 = (EditText) findViewById(R.id.txtcrd31);
        credit32 = (EditText) findViewById(R.id.txtcrd32);
        credit33 = (EditText) findViewById(R.id.txtcrd33);
        credit34 = (EditText) findViewById(R.id.txtcrd34);
        credit35 = (EditText) findViewById(R.id.txtcrd35);
        credit36 = (EditText) findViewById(R.id.txtcrd36);
        credit37 = (EditText) findViewById(R.id.txtcrd37);
        credit38 = (EditText) findViewById(R.id.txtcrd38);
        credit39 = (EditText) findViewById(R.id.txtcrd39);
        credit40 = (EditText) findViewById(R.id.txtcrd40);
        credit41 = (EditText) findViewById(R.id.txtcrd41);
        credit42 = (EditText) findViewById(R.id.txtcrd42);
        credit43 = (EditText) findViewById(R.id.txtcrd43);
        credit44 = (EditText) findViewById(R.id.txtcrd44);
        credit45 = (EditText) findViewById(R.id.txtcrd45);
        credit46 = (EditText) findViewById(R.id.txtcrd46);
        credit47 = (EditText) findViewById(R.id.txtcrd47);
        credit48 = (EditText) findViewById(R.id.txtcrd48);
        credit49 = (EditText) findViewById(R.id.txtcrd49);
        credit50 = (EditText) findViewById(R.id.txtcrd50);
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
        if (credit11.length() == 0){
            credit11.setText("0");
        }
        if (credit12.length() == 0){
            credit12.setText("0");

        }
        if (credit13.length() == 0){
            credit13.setText("0");

        }
        if (credit14.length() == 0){
            credit14.setText("0");
        }
        if (credit15.length() == 0){
            credit15.setText("0");

        }
        if (credit16.length() == 0){
            credit16.setText("0");

        }
        if (credit17.length() == 0){
            credit17.setText("0");

        }
        if (credit18.length() == 0){
            credit18.setText("0");

        }
        if (credit19.length() == 0){
            credit19.setText("0");

        }
        if (credit20.length() == 0){
            credit20.setText("0");

        }
        if (credit21.length() == 0){
            credit21.setText("0");
        }
        if (credit22.length() == 0){
            credit22.setText("0");

        }
        if (credit23.length() == 0){
            credit23.setText("0");

        }
        if (credit24.length() == 0){
            credit24.setText("0");
        }
        if (credit25.length() == 0){
            credit25.setText("0");

        }
        if (credit26.length() == 0){
            credit26.setText("0");

        }
        if (credit27.length() == 0){
            credit27.setText("0");

        }
        if (credit28.length() == 0){
            credit28.setText("0");

        }
        if (credit29.length() == 0){
            credit29.setText("0");

        }
        if (credit30.length() == 0){
            credit30.setText("0");

        }
        if (credit31.length() == 0){
            credit31.setText("0");
        }
        if (credit32.length() == 0){
            credit32.setText("0");

        }
        if (credit33.length() == 0){
            credit33.setText("0");

        }
        if (credit34.length() == 0){
            credit34.setText("0");
        }
        if (credit35.length() == 0){
            credit35.setText("0");

        }
        if (credit36.length() == 0){
            credit36.setText("0");

        }
        if (credit37.length() == 0){
            credit37.setText("0");

        }
        if (credit38.length() == 0){
            credit38.setText("0");

        }
        if (credit39.length() == 0){
            credit39.setText("0");

        }
        if (credit40.length() == 0){
            credit40.setText("0");

        }
        if (credit41.length() == 0){
            credit41.setText("0");
        }
        if (credit42.length() == 0){
            credit42.setText("0");

        }
        if (credit43.length() == 0){
            credit43.setText("0");

        }
        if (credit44.length() == 0){
            credit44.setText("0");
        }
        if (credit45.length() == 0){
            credit45.setText("0");

        }
        if (credit46.length() == 0){
            credit46.setText("0");

        }
        if (credit47.length() == 0){
            credit47.setText("0");

        }
        if (credit48.length() == 0){
            credit48.setText("0");

        }
        if (credit49.length() == 0){
            credit49.setText("0");

        }
        if (credit50.length() == 0){
            credit50.setText("0");

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
        credit2 = (EditText) findViewById(R.id.txtcrd2);
        credit3 = (EditText) findViewById(R.id.txtcrd3);
        credit4 = (EditText) findViewById(R.id.txtcrd4);
        credit5 = (EditText) findViewById(R.id.txtcrd5);
        credit6 = (EditText) findViewById(R.id.txtcrd6);
        credit7 = (EditText) findViewById(R.id.txtcrd7);
        credit8 = (EditText) findViewById(R.id.txtcrd8);
        credit9 = (EditText) findViewById(R.id.txtcrd9);
        credit10 = (EditText) findViewById(R.id.txtcrd10);
        credit11 = (EditText) findViewById(R.id.txtcrd11);
        credit12 = (EditText) findViewById(R.id.txtcrd12);
        credit13 = (EditText) findViewById(R.id.txtcrd13);
        credit14 = (EditText) findViewById(R.id.txtcrd14);
        credit15 = (EditText) findViewById(R.id.txtcrd15);
        credit16 = (EditText) findViewById(R.id.txtcrd16);
        credit17 = (EditText) findViewById(R.id.txtcrd17);
        credit18 = (EditText) findViewById(R.id.txtcrd18);
        credit19 = (EditText) findViewById(R.id.txtcrd19);
        credit20 = (EditText) findViewById(R.id.txtcrd20);
        credit21 = (EditText) findViewById(R.id.txtcrd21);
        credit22 = (EditText) findViewById(R.id.txtcrd22);
        credit23 = (EditText) findViewById(R.id.txtcrd23);
        credit24 = (EditText) findViewById(R.id.txtcrd24);
        credit25 = (EditText) findViewById(R.id.txtcrd25);
        credit26 = (EditText) findViewById(R.id.txtcrd26);
        credit27 = (EditText) findViewById(R.id.txtcrd27);
        credit28 = (EditText) findViewById(R.id.txtcrd28);
        credit29 = (EditText) findViewById(R.id.txtcrd29);
        credit30 = (EditText) findViewById(R.id.txtcrd30);
        credit31 = (EditText) findViewById(R.id.txtcrd31);
        credit32 = (EditText) findViewById(R.id.txtcrd32);
        credit33 = (EditText) findViewById(R.id.txtcrd33);
        credit34 = (EditText) findViewById(R.id.txtcrd34);
        credit35 = (EditText) findViewById(R.id.txtcrd35);
        credit36 = (EditText) findViewById(R.id.txtcrd36);
        credit37 = (EditText) findViewById(R.id.txtcrd37);
        credit38 = (EditText) findViewById(R.id.txtcrd38);
        credit39 = (EditText) findViewById(R.id.txtcrd39);
        credit40 = (EditText) findViewById(R.id.txtcrd40);
        credit41 = (EditText) findViewById(R.id.txtcrd41);
        credit42 = (EditText) findViewById(R.id.txtcrd42);
        credit43 = (EditText) findViewById(R.id.txtcrd43);
        credit44 = (EditText) findViewById(R.id.txtcrd44);
        credit45 = (EditText) findViewById(R.id.txtcrd45);
        credit46 = (EditText) findViewById(R.id.txtcrd46);
        credit47 = (EditText) findViewById(R.id.txtcrd47);
        credit48 = (EditText) findViewById(R.id.txtcrd48);
        credit49 = (EditText) findViewById(R.id.txtcrd49);
        credit50 = (EditText) findViewById(R.id.txtcrd50);
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
        credit11.setText("");
        credit12.setText("");
        credit13.setText("");
        credit14.setText("");
        credit15.setText("");
        credit16.setText("");
        credit17.setText("");
        credit18.setText("");
        credit19.setText("");
        credit20.setText("");
        credit21.setText("");
        credit22.setText("");
        credit23.setText("");
        credit24.setText("");
        credit25.setText("");
        credit26.setText("");
        credit27.setText("");
        credit28.setText("");
        credit29.setText("");
        credit30.setText("");
        credit31.setText("");
        credit32.setText("");
        credit33.setText("");
        credit34.setText("");
        credit35.setText("");
        credit36.setText("");
        credit37.setText("");
        credit38.setText("");
        credit39.setText("");
        credit40.setText("");
        credit41.setText("");
        credit42.setText("");
        credit43.setText("");
        credit44.setText("");
        credit45.setText("");
        credit46.setText("");
        credit47.setText("");
        credit48.setText("");
        credit49.setText("");
        credit50.setText("");

    }
}
