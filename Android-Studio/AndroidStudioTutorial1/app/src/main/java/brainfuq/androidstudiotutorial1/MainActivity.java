package brainfuq.androidstudiotutorial1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity
{
    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.WelcomeMessage);
        editText = (EditText) findViewById(R.id.TextField);
        button = (Button) findViewById(R.id.ApplyButton);

        textView.setText(getString(R.string.welcome_message));
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textView.setText(getString(R.string.welcome_message_2) + editText.getText());
            }
        });
    }
}
