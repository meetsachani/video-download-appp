package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.C2775Dq;
import o.TB;

@KeepForSdk
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @TB(api = 11)
    public static boolean a() {
        return true;
    }

    @KeepForSdk
    @TB(api = 12)
    public static boolean b() {
        return true;
    }

    @KeepForSdk
    @TB(api = 14)
    public static boolean c() {
        return true;
    }

    @KeepForSdk
    @TB(api = 15)
    public static boolean d() {
        return true;
    }

    @KeepForSdk
    @TB(api = 16)
    public static boolean e() {
        return true;
    }

    @KeepForSdk
    @TB(api = 17)
    public static boolean f() {
        return true;
    }

    @KeepForSdk
    @TB(api = 18)
    public static boolean g() {
        return true;
    }

    @KeepForSdk
    @TB(api = 19)
    public static boolean h() {
        return true;
    }

    @KeepForSdk
    @TB(api = 20)
    public static boolean i() {
        return true;
    }

    @KeepForSdk
    @TB(api = 21)
    public static boolean j() {
        return true;
    }

    @KeepForSdk
    @TB(api = 22)
    public static boolean k() {
        return true;
    }

    @KeepForSdk
    @TB(api = 23)
    public static boolean l() {
        return true;
    }

    @KeepForSdk
    @TB(api = 24)
    public static boolean m() {
        return true;
    }

    @KeepForSdk
    @TB(api = 26)
    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @TB(api = 28)
    public static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @TB(api = 29)
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @TB(api = 30)
    public static boolean q() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @TB(api = 31)
    public static boolean r() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    @TB(api = 32)
    public static boolean s() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    @TB(api = 33)
    public static boolean t() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @KeepForSdk
    @TB(api = 33, codename = "UpsideDownCake")
    public static boolean u() {
        if (!t()) {
            return false;
        }
        return C2775Dq.n();
    }

    @KeepForSdk
    @TB(api = 34, codename = "VanillaIceCream")
    public static boolean v() {
        if (!u()) {
            return false;
        }
        return C2775Dq.o();
    }
}
