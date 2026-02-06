package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C7855lo2;

/* loaded from: classes2.dex */
public final class zzfvz {
    public static final Object a;
    public static final /* synthetic */ int b = 0;

    static {
        Object a2 = a();
        a = a2;
        if (a2 != null) {
            b("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a2 == null) {
            return;
        }
        c(a2);
    }

    public static Object a() {
        try {
            return Class.forName(C7855lo2.b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method b(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName(C7855lo2.a, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Object obj) {
        try {
            Method b2 = b("getStackTraceDepth", Throwable.class);
            if (b2 == null) {
                return null;
            }
            b2.invoke(obj, new Throwable());
            return b2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
