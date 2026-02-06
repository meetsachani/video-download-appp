package o;

import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class UH1 {

    /* loaded from: classes.dex */
    public static class a {
        public static final Object a = new Object();
        public static Method b;
        public static boolean c;

        public static boolean a(int i) {
            try {
                synchronized (a) {
                    if (!c) {
                        c = true;
                        b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    public static boolean a(int i) {
        return b.a(i);
    }
}
