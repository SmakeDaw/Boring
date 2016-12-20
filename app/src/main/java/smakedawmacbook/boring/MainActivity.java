package smakedawmacbook.boring;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEditMessage;
    EditText mMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditMessage  = (EditText) findViewById(R.id.edita);
        mMessage  = (EditText) findViewById(R.id.editb);

        mEditMessage.addTextChangedListener(myTextWatcher);
    }

    //text watcher for read and write realtime
    public TextWatcher myTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            mMessage.setText(s);
            mMessage.setTextColor(Color.RED);


        }
    };

}
