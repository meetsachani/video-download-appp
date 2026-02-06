package o;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.qH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8963qH2 {
    public static boolean a = true;
    public static Method b;
    public static boolean c;

    /* renamed from: o.qH2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    public static int a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a(viewGroup, i);
        }
        if (!c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                a.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z);
        } else {
            b(viewGroup, z);
        }
    }
}
