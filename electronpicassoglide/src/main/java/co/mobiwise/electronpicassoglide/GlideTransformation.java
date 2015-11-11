package co.mobiwise.electronpicassoglide;

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * Created by mertsimsek on 11/11/15.
 */
public class GlideTransformation extends BitmapTransformation{

    public GlideTransformation(Context context) {
        super(context);
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return toTransform;
    }

    @Override
    public String getId() {
        return null;
    }
}
