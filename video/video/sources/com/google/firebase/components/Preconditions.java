package com.google.firebase.components;

import o.InterfaceC6181ey;

/* loaded from: classes3.dex */
public final class Preconditions {
    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    @InterfaceC6181ey
    public static <T> T b(T t) {
        t.getClass();
        return t;
    }

    @InterfaceC6181ey
    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
