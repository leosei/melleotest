package fr.melleo.melleotest.ImgOfTheDay;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by leosei on 3/26/18.
 */

public class imgRotator {

    private ArrayList<Integer> mDrawable;
    private int mCurrentIndex;

    public imgRotator(){
        mDrawable = new ArrayList<Integer>();
        mDrawable.add(R.drawable.android);
        mDrawable.add(R.drawable.android2);
        mDrawable.add(R.drawable.android3);
        mDrawable.add(R.drawable.android4);
        mCurrentIndex = 0;
    }

    public Integer getImgId(){
        Integer drawable = mDrawable.get(mCurrentIndex);
        mCurrentIndex  = (mCurrentIndex+1) % mDrawable.size();
        return drawable;
    }

}
