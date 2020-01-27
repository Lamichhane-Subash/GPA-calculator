package subashqwgmail.com.gpacalculatator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String[] all = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"};
    private List<String> letterGrade = new ArrayList<>();
    private List<Integer> courseWeight = new ArrayList<>();
    private List<Integer> numberGrade = new ArrayList<>();
    private EditText letter;
    private EditText letter2;
    private EditText letter3;
    private EditText letter4;
    private EditText letter5;
    private EditText letter6;
    private EditText letter7;
    private EditText credit;
    private EditText credit2;
    private EditText credit3;
    private EditText credit4;
    private EditText credit5;
    private EditText credit6;
    private EditText credit7;
    private  EditText course;
    private  EditText course7;
    private  EditText course2;
    private  EditText course3;
    private  EditText course4;
    private  EditText course5;
    private  EditText course6;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int btnOn = 0; //True
        letter = (EditText) findViewById(R.id.txtletter);
        letter2 = (EditText) findViewById(R.id.txtletter2);
        letter3 = (EditText) findViewById(R.id.txtletter3);
        letter4 = (EditText) findViewById(R.id.txtletter4);
        letter5 = (EditText) findViewById(R.id.txtletter5);
        letter6 = (EditText) findViewById(R.id.txtletter6);
        letter7 = (EditText) findViewById(R.id.txtletter7);


        credit = (EditText) findViewById(R.id.txtcrd);
        credit7 = (EditText) findViewById(R.id.txtcrd2);
        credit2 = (EditText) findViewById(R.id.txtcrd3);
        credit3 = (EditText) findViewById(R.id.txtcrd4);
        credit4 = (EditText) findViewById(R.id.txtcrd5);
        credit5 = (EditText) findViewById(R.id.txtcrd6);
        credit6 = (EditText) findViewById(R.id.txtcrd7);

        result = (TextView) findViewById(R.id.txtresult);
        final Button cal = (Button) findViewById(R.id.btncal);
        isEmpty();
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                letterGrade.add(letter.getText().toString());
                letterGrade.add(letter2.getText().toString());
                letterGrade.add(letter3.getText().toString());
                letterGrade.add(letter4.getText().toString());
                letterGrade.add(letter5.getText().toString());
                letterGrade.add(letter6.getText().toString());
                letterGrade.add(letter7.getText().toString());

                courseWeight.add(Integer.parseInt(credit.getText().toString()));
                courseWeight.add(Integer.parseInt(credit7.getText().toString()));
                courseWeight.add(Integer.parseInt(credit2.getText().toString()));
                courseWeight.add(Integer.parseInt(credit3.getText().toString()));
                courseWeight.add(Integer.parseInt(credit4.getText().toString()));
                courseWeight.add(Integer.parseInt(credit5.getText().toString()));
                courseWeight.add(Integer.parseInt(credit6.getText().toString()));
                numberGrade();

                double valresult = calculated ();
                result.setText(String.format("%.2f", valresult));
                if (btnOn == 0){
                    cal.setEnabled(false);

                }
            }
        });

        Button clear = (Button) findViewById(R.id.btnclear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letterGrade.clear();
                courseWeight.clear();
                numberGrade.clear();
               clearAll();
                if (btnOn == 0){
                    cal.setEnabled(true);
                }
            }
        });

    }

    /**
     * This method converts all letters contained in letterGrade to a numerical value
     */
    private void numberGrade() {
        for (int i = 0; i < this.letterGrade.size(); i++) {
            if (this.letterGrade.get(i).toUpperCase().equals(all[0])) {
                this.numberGrade.add(9);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[1])) {
                this.numberGrade.add(8);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[2])) {
                this.numberGrade.add(7);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[3])) {
                this.numberGrade.add(6);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[4])) {
                this.numberGrade.add(5);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[5])) {
                this.numberGrade.add(4);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[6])) {
                this.numberGrade.add(3);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[7])) {
                this.numberGrade.add(2);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[8])) {
                this.numberGrade.add(1);
            }
            if (this.letterGrade.get(i).toUpperCase().equals(all[9])) {
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
     * Checks if all of the course texts, letter texts ,and credit texts,and
     * checks if they are empty and user is indicated
     */
    private void isEmpty(){
        Button cal = (Button) findViewById(R.id.btncal);
        letter = (EditText) findViewById(R.id.txtletter);
        letter2 = (EditText) findViewById(R.id.txtletter2);
        letter3 = (EditText) findViewById(R.id.txtletter3);
        letter4 = (EditText) findViewById(R.id.txtletter4);
        letter5 = (EditText) findViewById(R.id.txtletter5);
        letter6 = (EditText) findViewById(R.id.txtletter6);
        letter7 = (EditText) findViewById(R.id.txtletter7);
//
        credit = (EditText) findViewById(R.id.txtcrd);
        credit7 = (EditText) findViewById(R.id.txtcrd2);
        credit2 = (EditText) findViewById(R.id.txtcrd3);
        credit3 = (EditText) findViewById(R.id.txtcrd4);
        credit4 = (EditText) findViewById(R.id.txtcrd5);
        credit5 = (EditText) findViewById(R.id.txtcrd6);
        credit6 = (EditText) findViewById(R.id.txtcrd7);
//
        course = (EditText) findViewById(R.id.editText);
        course2 = (EditText) findViewById(R.id.editText2);
        course3 = (EditText) findViewById(R.id.editText5);
        course4 = (EditText) findViewById(R.id.editText6);
        course5 = (EditText) findViewById(R.id.editText9);
        course6 = (EditText) findViewById(R.id.editText12);
        course7 = (EditText) findViewById(R.id.editText15);
//
        if (letter.length()==0){
        letter.setError("Please input a letter grade!");
        }
        if (letter2.length()==0){
            letter2.setError("Please input a letter grade!");
        }
        if (letter3.length()==0){
            letter3.setError("Please input a letter grade!");
        }
        if (letter4.length()==0) {
            letter4.setError("Please input a letter grade!");
        }
        if (letter5.length()==0){
            letter5.setError("Please input a letter grade!");

        }
        if (letter6.length()==0){
            letter6.setError("Please input a letter grade!");
        }
        if (letter7.length()==0){
            letter7.setError("Please input a letter grade!");
        }
        //
        if (credit.length()==0){
            credit.setError("Please enter credit for the course!");
        }
        if (credit2.length()==0){
            credit2.setError("Please enter credit for the course!");
        }
        if (credit3.length()==0){
            credit3.setError("Please enter credit for the course!");
        }
        if (credit4.length()==0){
            credit4.setError("Please enter credit for the course!");
        }
        if (credit5.length()==0){
            credit5.setError("Please enter credit for the course!");
        }
        if (credit6.length()==0){
            credit6.setError("Please enter credit for the course!");
        }
        if (credit7.length()==0){
            credit7.setError("Please enter credit for the course!");
        }
 //

        if (TextUtils.isEmpty(course.getText().toString())){
            course.setText("");
        }
        if (TextUtils.isEmpty(course2.getText().toString())){
            course2.setText("");
        }
        if (TextUtils.isEmpty(course3.getText().toString())){
            course3.setText("");
        }
        if (TextUtils.isEmpty(course4.getText().toString())){
            course4.setText("");
        }
        if (TextUtils.isEmpty(course5.getText().toString())){
            course5.setText("");
        }
        if (TextUtils.isEmpty(course6.getText().toString())){
            course6.setText("");
        }
        if (TextUtils.isEmpty(course7.getText().toString())){
            course7.setText("");
        }

    }

    /**
     * sets all EditTexts to "".
     */
    private void clearAll(){
        letter = (EditText) findViewById(R.id.txtletter);
        letter2 = (EditText) findViewById(R.id.txtletter2);
        letter3 = (EditText) findViewById(R.id.txtletter3);
        letter4 = (EditText) findViewById(R.id.txtletter4);
        letter5 = (EditText) findViewById(R.id.txtletter5);
        letter6 = (EditText) findViewById(R.id.txtletter6);
        letter7 = (EditText) findViewById(R.id.txtletter7);
//
        credit = (EditText) findViewById(R.id.txtcrd);
        credit7 = (EditText) findViewById(R.id.txtcrd2);
        credit2 = (EditText) findViewById(R.id.txtcrd3);
        credit3 = (EditText) findViewById(R.id.txtcrd4);
        credit4 = (EditText) findViewById(R.id.txtcrd5);
        credit5 = (EditText) findViewById(R.id.txtcrd6);
        credit6 = (EditText) findViewById(R.id.txtcrd7);
//
        course = (EditText) findViewById(R.id.editText);
        course2 = (EditText) findViewById(R.id.editText2);
        course3 = (EditText) findViewById(R.id.editText5);
        course4 = (EditText) findViewById(R.id.editText6);
        course5 = (EditText) findViewById(R.id.editText9);
        course6 = (EditText) findViewById(R.id.editText12);
        course7 = (EditText) findViewById(R.id.editText15);

                result.setText("");
                letter.setText("");
                letter2.setText("");
                letter3.setText("");
                letter4.setText("");
                letter5.setText("");
                letter6.setText("");
                letter7.setText("");
                credit.setText("");
                credit2.setText("");
                credit3.setText("");
                credit4.setText("");
                credit5.setText("");
                credit6.setText("");
                credit7.setText("");
                course.setText("");
        course2.setText("");
        course3.setText("");
        course4.setText("");
        course5.setText("");
        course6.setText("");
        course7.setText("");
    }

}
