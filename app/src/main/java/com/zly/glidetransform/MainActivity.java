package com.zly.glidetransform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url1 = "http://p4.image.hiapk.com/uploads/allimg/140916/7730-1409161G523.jpg";
//        String url1 = "http://pics.shoes.net.cn/UploadFiles/brand/2008/06/27/2008062710045920134825.jpg";
        String url2 = "http://upload.520apk.com/news/20141120/14164605934616.jpg";
//        String url2 = "http://img3.redocn.com/20140822/201408010512517866403921.jpg";

        Glide.with(this).load(url1).into((ImageView) findViewById(R.id.ivOriginal1));

        Glide.with(this).load(url1)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_star)).into((ImageView) findViewById(R.id.ivStar1));

        Glide.with(this).load(url1)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_hexagon)).into((ImageView) findViewById(R.id.ivHexagon1));

        Glide.with(this).load(url1)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_cloud)).into((ImageView) findViewById(R.id.ivCloud1));

        Glide.with(this).load(url2).into((ImageView) findViewById(R.id.ivOriginal2));

        Glide.with(this).load(url2)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_star)).into((ImageView) findViewById(R.id.ivStar2));

        Glide.with(this).load(url2)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_hexagon)).into((ImageView) findViewById(R.id.ivHexagon2));

        Glide.with(this).load(url2)
                .bitmapTransform(new CustomShapeTransformation(this, R.drawable.shape_cloud)).into((ImageView) findViewById(R.id.ivCloud2));

    }
}
