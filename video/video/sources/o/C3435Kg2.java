package o;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.Kg2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3435Kg2 {
    public static Method a;

    /* renamed from: o.Kg2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    public static int a(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return a.a(i);
        }
        try {
            if (a == null) {
                Class cls = Integer.TYPE;
                if (i2 >= 26) {
                    a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", cls);
                } else {
                    a = SubscriptionManager.class.getDeclaredMethod("getSlotId", cls);
                }
                a.setAccessible(true);
            }
            Integer num = (Integer) a.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
