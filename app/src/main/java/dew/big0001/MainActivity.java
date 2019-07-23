package dew.big0001;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnStart;
    ImageView img1;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 変数設定
        btnStart=findViewById(R.id.btnStart);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);

        // ボタンクリック
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            
                if(((Math.random() <= 0.5) ? 1 : 2) == 1) {
                    img1.setImageResource(R.drawable.hole);
                    img2.setImageResource(R.drawable.jjak);
                }else{
                    img1.setImageResource(R.drawable.jjak);
                    img2.setImageResource(R.drawable.hole);
                }
            }
        });

    }
}
