package id.co.aminfaruq.turnonlamp;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button button;
    Boolean turnOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!turnOn){
                    imageview.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);

                    turnOn = true;
                }else {
                    imageview.setImageResource(R.drawable.trans_of);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);

                    turnOn = false;
                }
            }
        });
    }
}
