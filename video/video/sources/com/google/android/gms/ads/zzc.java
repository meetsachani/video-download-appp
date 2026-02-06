package com.google.android.gms.ads;

import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzc {
    public static int a(AdSize adSize) {
        return adSize.p();
    }

    public static int b(AdSize adSize) {
        return adSize.o();
    }

    public static AdSize c(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize d(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.s(true);
        adSize.q(i2);
        return adSize;
    }

    public static AdSize e(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.t(true);
        adSize.r(i2);
        return adSize;
    }

    public static boolean f(AdSize adSize) {
        return adSize.u();
    }

    public static boolean g(AdSize adSize) {
        return adSize.v();
    }

    public static boolean h(AdSize adSize) {
        return adSize.w();
    }
}
