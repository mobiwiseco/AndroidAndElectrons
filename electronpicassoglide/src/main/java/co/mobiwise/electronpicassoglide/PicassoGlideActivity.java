package co.mobiwise.electronpicassoglide;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

/**
 * Created by mertsimsek on 11/11/15.
 */
public class PicassoGlideActivity extends AppCompatActivity{

    ImageView imageViewPicasso;
    ImageView imageViewGlide;

    String imageURL = "http://weknowyourdreams.com/images/nature/nature-02.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_picasso_glide);

        imageViewPicasso = (ImageView) findViewById(R.id.imageview_picasso);
        imageViewGlide = (ImageView) findViewById(R.id.imageview_glide);

        Picasso.with(this)
                .load(imageURL)
                .into(imageViewPicasso);
        /*
        Picasso.with(this)
                .load(imageURL)
                .placeholder(R.drawable.placeholder)
                .resize(200, 200)
                .rotate(45f)
                .transform(new BlurTransformation(this))
                .error(R.drawable.error)
                .into(imageViewPicasso);*/

        Glide.with(this)
                .load(imageURL)
                .into(imageViewGlide);

        /*
        Glide.with(this)
                .load(imageURL)
                .placeholder(R.drawable.placeholder)
                .override(200, 200)
                .error(R.drawable.error)
                .transform(new GlideTransformation(this))
                .fitCenter()
                .into(imageViewGlide);*/


    }
}
