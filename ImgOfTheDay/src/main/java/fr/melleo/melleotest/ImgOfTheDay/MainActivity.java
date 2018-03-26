package fr.melleo.melleotest.ImgOfTheDay;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private imgRotator mImgRotator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgRotator = new imgRotator();

        final ImageView mImg = findViewById(R.id.imageView);
        Integer id = mImgRotator.getImgId();

        Drawable drawable =  getResources().getDrawable(id, null);
        mImg.setImageDrawable(drawable);

        mImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer newId = mImgRotator.getImgId();
                Drawable drawable =  getResources().getDrawable(newId, null);
                mImg.setImageDrawable(drawable);
            }
        });

    }


}
