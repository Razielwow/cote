package html.esindex.esy.httpraguil.cote2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        mHelloTextView = (TextView) findViewById(R.id.textView);
//        nNameEditeText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText("Привет Котик");
       if (nNameEditeText.getText().length() == 0) {
            mHelloTextView.setText("Привет Котэ");
        } else {
            mHelloTextView.setText("Привет " + nNameEditeText.getText());
//        }
    }
    }