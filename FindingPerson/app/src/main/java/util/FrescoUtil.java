package util;

import android.content.Context;
import android.net.Uri;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jimro.findingperson.R;

/**
 * Fresco 的工具类
 * Created by lixichang on 2017/1/4.
 */

public class FrescoUtil {
    public static void loadImage(Uri uri, ControllerListener listener, SimpleDraweeView imageView) {
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setControllerListener(listener)
                .build();
        imageView.setController(controller);
    }

    public static void setImageRotate(Context context,SimpleDraweeView imageView){
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.image_rotate);
        //设置匀速旋转
        LinearInterpolator interpolator = new LinearInterpolator();
        animation.setInterpolator(interpolator);
        imageView.startAnimation(animation);

    }
}
