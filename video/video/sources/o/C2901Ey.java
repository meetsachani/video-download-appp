package o;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.Ey  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2901Ey {
    public static Method a;
    public static Method b;
    public static boolean c;

    /* renamed from: o.Ey$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    public static void a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                a.b(canvas);
            } else {
                a.a(canvas);
            }
        } else if (i != 28) {
            if (!c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                    b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                c = true;
            }
            if (z) {
                try {
                    Method method2 = a;
                    if (method2 != null) {
                        method2.invoke(canvas, null);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (!z && (method = b) != null) {
                method.invoke(canvas, null);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
