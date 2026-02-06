package o;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o.sD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9439sD2 {
    public static Method a;
    public static Constructor<UserHandle> b;

    /* renamed from: o.sD2$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static UserHandle a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    public static Method a() throws NoSuchMethodException {
        if (a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return a;
    }

    public static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return b;
    }

    public static UserHandle c(int i) {
        return a.a(i);
    }
}
