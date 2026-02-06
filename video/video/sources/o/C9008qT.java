package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.AbstractC4253Sp2;

/* renamed from: o.qT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9008qT {
    public static final String a = "CustomSupport";
    public static final boolean b = false;

    /* renamed from: o.qT$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.EnumC0018a.values().length];
            a = iArr;
            try {
                iArr[a.EnumC0018a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC0018a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC0018a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.EnumC0018a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.EnumC0018a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.EnumC0018a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[a.EnumC0018a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = C10829xw0.c + aVar.h();
        try {
            int i = a.a[aVar.j().ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (i) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a2 = a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a3 = a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a2 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a3 << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + aVar.h());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e(a, "Cannot access method " + str + " on View \"" + AV.k(view) + AbstractC4253Sp2.b.x1, e);
        } catch (NoSuchMethodException e2) {
            Log.e(a, "No method " + str + " on View \"" + AV.k(view) + AbstractC4253Sp2.b.x1, e2);
        } catch (InvocationTargetException e3) {
            Log.e(a, "Cannot invoke method " + str + " on View \"" + AV.k(view) + AbstractC4253Sp2.b.x1, e3);
        }
    }
}
