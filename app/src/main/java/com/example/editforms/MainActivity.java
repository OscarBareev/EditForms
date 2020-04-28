package com.example.editforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.nameField);
        final EditText email = (EditText) findViewById(R.id.mailField);
        final TextView textField = (TextView) findViewById(R.id.putText);
        final Button okButton = (Button) findViewById(R.id.okButton);
        final Button cleanButton = (Button) findViewById(R.id.cleanButton);

        okButton(name, email, textField, okButton);
        cleanButton(name, email, textField, cleanButton);
    }


    private void okButton(final EditText name, final EditText email, final TextView textField, final Button okButton) {

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userMail = email.getText().toString();

                if (userName.trim().equals("") || userMail.trim().equals("")) {
                    textField.setText("Введите данные!");
                } else {
                    textField.setText("Подписка на рассылку успешно оформлена для пользователя " +
                            userName + " на электронный адрес " + userMail);
                }
            }
        });
    }

    private void cleanButton(final EditText name, final EditText email, final TextView textField, final Button cleanButton) {
        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText("");
                name.setText("");
                email.setText("");
            }
        });
    }
}
