package o;

import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.em2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6136em2 {
    public static Method a;
    public static Method b;

    /* renamed from: o.em2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static String a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* renamed from: o.em2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* renamed from: o.em2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    public static String a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(telephonyManager);
        }
        int b2 = b(telephonyManager);
        if (b2 != Integer.MAX_VALUE && b2 != -1) {
            return a.a(telephonyManager, C3435Kg2.a(b2));
        }
        return telephonyManager.getDeviceId();
    }

    public static int b(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) b.invoke(telephonyManager, null);
            if (num != null && num.intValue() != -1) {
                return num.intValue();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
