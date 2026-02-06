package o;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CN0 {
    public static final String a = "ImageWriterCompatApi26";
    public static Method b;

    static {
        try {
            Class cls = Integer.TYPE;
            b = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e) {
            Log.i(a, "Unable to initialize via reflection.", e);
        }
    }

    public static ImageWriter a(Surface surface, int i, int i2) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C10907yF1.l(b.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                th = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
