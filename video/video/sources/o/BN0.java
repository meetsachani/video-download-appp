package o;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
public final class BN0 {
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
