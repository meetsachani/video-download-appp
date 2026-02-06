package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;
import o.InterfaceC8557od0;
import o.JK1;

/* loaded from: classes2.dex */
public final class zzdc {
    @JK1
    public static int a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static Object b(@InterfaceC11300zs1 Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @InterfaceC8557od0({"#1"})
    @JK1
    public static String c(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @JK1
    public static void d(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @JK1
    public static void e(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    @JK1
    public static void f(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    @JK1
    public static void g(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
