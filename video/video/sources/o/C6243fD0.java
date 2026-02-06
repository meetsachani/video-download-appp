package o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.fD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6243fD0 implements InterfaceC5758dD0 {
    public static final String Y = "GhostViewApi21";
    public static boolean Y0;
    public static Class<?> Z;
    public static Method Z0;
    public static boolean a1;
    public static Method b1;
    public static boolean c1;
    public final View X;

    public C6243fD0(View view) {
        this.X = view;
    }

    public static InterfaceC5758dD0 b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = Z0;
        if (method != null) {
            try {
                return new C6243fD0((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (!a1) {
            try {
                d();
                Method declaredMethod = Z.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                Z0 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(Y, "Failed to retrieve addGhost method", e);
            }
            a1 = true;
        }
    }

    public static void d() {
        if (!Y0) {
            try {
                Z = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i(Y, "Failed to retrieve GhostView class", e);
            }
            Y0 = true;
        }
    }

    public static void e() {
        if (!c1) {
            try {
                d();
                Method declaredMethod = Z.getDeclaredMethod("removeGhost", View.class);
                b1 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(Y, "Failed to retrieve removeGhost method", e);
            }
            c1 = true;
        }
    }

    public static void f(View view) {
        e();
        Method method = b1;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // o.InterfaceC5758dD0
    public void setVisibility(int i) {
        this.X.setVisibility(i);
    }

    @Override // o.InterfaceC5758dD0
    public void a(ViewGroup viewGroup, View view) {
    }
}
