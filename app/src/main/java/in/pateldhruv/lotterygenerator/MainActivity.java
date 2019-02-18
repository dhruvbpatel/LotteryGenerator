package in.pateldhruv.lotterygenerator;

import android.opengl.ETC1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // declaring variables ;

    private Button button;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private EditText editText;
    private int num;
    private String input;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// initializing all the value
        button=(Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        editText=(EditText)findViewById(R.id.editText);


        // create a onlcick listner event which activates when the button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();               // creating an object of   Random class as random
                num=random.nextInt(10);          // generating random numbers
                input=editText.getText().toString();    // getting the input ; which user entered
                textView.setText(Integer.toString(num)); // setting the  number generated in textview

                validate(editText.getText().toString(),textView.getText().toString());

            }

            private void validate(String num,String input) {

                if(num.equals(input))
                {

                    Toast.makeText(MainActivity.this,"correct Number",Toast.LENGTH_SHORT).show();
                    textView3.setText("You Won !!");


                }
                else {
                    //Toast.makeText(MainActivity.this,"Better Luck Next Time",Toast.LENGTH_SHORT).show();
                    textView3.setText("Better Luck Next Time!!");
                }


            }
        });



    }
}
