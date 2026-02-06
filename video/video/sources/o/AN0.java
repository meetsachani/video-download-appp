package o;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class AN0 {
    public static void a(ImageWriter imageWriter) {
        BN0.a(imageWriter);
    }

    public static Image b(ImageWriter imageWriter) {
        return BN0.b(imageWriter);
    }

    public static ImageWriter c(Surface surface, int i) {
        return BN0.c(surface, i);
    }

    public static ImageWriter d(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return DN0.a(surface, i, i2);
        }
        if (i3 >= 26) {
            return CN0.a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    public static void e(ImageWriter imageWriter, Image image) {
        BN0.d(imageWriter, image);
    }
}
