package o;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* renamed from: o.zN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11181zN0 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    /* renamed from: o.zN0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    public static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(imageView, matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            c(imageView, matrix);
        }
    }

    public static void b() {
        if (!c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
    }

    public static void c(ImageView imageView, Matrix matrix) {
        if (a) {
            try {
                a.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
