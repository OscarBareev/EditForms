package com.example.editforms;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private TextView textField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameField);
        email = findViewById(R.id.mailField);
        textField = findViewById(R.id.putText);

        Button okButton = findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userMail = email.getText().toString();

                if (userName.trim().isEmpty() || userMail.trim().isEmpty()) {
                    textField.setText(R.string.addData);
                } else {
                    textField.setText(getString(R.string.subscribe) +
                            userName + getString(R.string.yourMail) + userMail);
                }
            }
        });

        Button cleanButton = findViewById(R.id.cleanButton);
        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.setText("");
                textField.setText("");
                name.setText("");

            }
        });


    }


}
