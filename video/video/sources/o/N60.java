package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class N60 {
    public static final String a = "DrawableToBitmap";
    public static final InterfaceC4931Zn b = new a();

    public static InterfaceC5580cT1<Bitmap> a(InterfaceC4931Zn interfaceC4931Zn, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(interfaceC4931Zn, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            interfaceC4931Zn = b;
        }
        return C6141eo.c(bitmap, interfaceC4931Zn);
    }

    public static Bitmap b(InterfaceC4931Zn interfaceC4931Zn, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(a, 5)) {
                Log.w(a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(a, 5)) {
                Log.w(a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = C6658gs2.i();
            i3.lock();
            Bitmap f = interfaceC4931Zn.f(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(f);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return f;
            } finally {
                i3.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a extends C5171ao {
        @Override // o.C5171ao, o.InterfaceC4931Zn
        public void d(Bitmap bitmap) {
        }
    }
}
