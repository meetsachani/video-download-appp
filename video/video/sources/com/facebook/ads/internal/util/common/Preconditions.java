package com.facebook.ads.internal.util.common;

import android.os.Looper;
import androidx.annotation.Keep;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new RuntimeException("Must be called from the UiThread");
    }

    public static void checkIsTrue(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}
