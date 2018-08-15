package onebyte.com.luckywheelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import onebyte.com.luckywheel.LuckyWheelView;
import onebyte.com.luckywheel.model.LuckyItem;

public class MainActivity extends AppCompatActivity {

    List<LuckyItem> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LuckyWheelView luckyWheelView = (LuckyWheelView) findViewById(R.id.luckyWheel);

        LuckyItem luckyItem = new LuckyItem();
        luckyItem.text = "Item 1";
        luckyItem.icon = R.drawable.test1;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();

        luckyItem.text = "Item 2";
        luckyItem.icon = R.drawable.test2;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();

        luckyItem.text = "Item 3";
        luckyItem.icon = R.drawable.test3;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();

        luckyItem.text = "Item 4";
        luckyItem.icon = R.drawable.test4;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();

        luckyItem.text = "Item 5";
        luckyItem.icon = R.drawable.test5;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();

        luckyItem.text = "Item 6";
        luckyItem.icon = R.drawable.test6;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();
        luckyItem.text = "Item 7";
        luckyItem.icon = R.drawable.test7;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);


        luckyItem = new LuckyItem();
        luckyItem.text = "Item 8";
        luckyItem.icon = R.drawable.test8;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);

        luckyItem = new LuckyItem();
        luckyItem.text = "Item 9";
        luckyItem.icon = R.drawable.test9;
        luckyItem.color = 0xffFFF3E0;
        data.add(luckyItem);


        luckyWheelView.setData(data);
        luckyWheelView.setRound(5);


            // listener after finish lucky wheel
        luckyWheelView.setLuckyRoundItemSelectedListener(new LuckyWheelView.LuckyRoundItemSelectedListener() {
            @Override
            public void LuckyRoundItemSelected(int index) {
                // do something with index

                Toast.makeText(MainActivity.this, "Congrats..! You Won Item " + index , Toast.LENGTH_SHORT).show();
            }
        });


        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start
                luckyWheelView.startLuckyWheelWithTargetIndex(5);

            }
        });
    }

    public int getRandomNumber() {
        Random random = new Random();

        return random.nextInt(data.size() - 1);

    }

    public int getRandomRound() {
        Random random = new Random();

        return random.nextInt(data.size()-1);

    }
}
