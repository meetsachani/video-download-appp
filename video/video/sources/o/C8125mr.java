package o;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: o.mr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8125mr {
    public static final String a = "BundleUtil";
    @InterfaceC11300zs1
    public static Method b;
    @InterfaceC11300zs1
    public static Method c;

    @InterfaceC11300zs1
    public static IBinder a(Bundle bundle, @InterfaceC11300zs1 String str) {
        if (TD2.a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    @InterfaceC11300zs1
    public static IBinder b(Bundle bundle, @InterfaceC11300zs1 String str) {
        Method method = b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                b = method2;
                method2.setAccessible(true);
                method = b;
            } catch (NoSuchMethodException e) {
                I31.i(a, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            I31.i(a, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    public static void c(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 IBinder iBinder) {
        if (TD2.a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            d(bundle, str, iBinder);
        }
    }

    public static void d(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 IBinder iBinder) {
        Method method = c;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                c = method2;
                method2.setAccessible(true);
                method = c;
            } catch (NoSuchMethodException e) {
                I31.i(a, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            I31.i(a, "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
