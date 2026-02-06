package o;

import android.graphics.Canvas;
import android.graphics.Picture;

/* loaded from: classes.dex */
public final class YC1 {
    public static final Picture a(Picture picture, int i, int i2, HA0<? super Canvas, C7458kA2> ha0) {
        Canvas beginRecording = picture.beginRecording(i, i2);
        try {
            ha0.invoke(beginRecording);
            return picture;
        } finally {
            UP0.d(1);
            picture.endRecording();
            UP0.c(1);
        }
    }
}
