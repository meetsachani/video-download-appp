package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class AdSize {
    public static final int i = -1;
    public static final int j = -2;
    @InterfaceC5670cr1
    public static final AdSize k = new AdSize(320, 50, "320x50_mb");
    @InterfaceC5670cr1
    public static final AdSize l = new AdSize(468, 60, "468x60_as");
    @InterfaceC5670cr1
    public static final AdSize m = new AdSize(320, 100, "320x100_as");
    @InterfaceC5670cr1
    public static final AdSize n = new AdSize(728, 90, "728x90_as");
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public static final AdSize f176o = new AdSize(300, 250, "300x250_as");
    @InterfaceC5670cr1
    public static final AdSize p = new AdSize(160, 600, "160x600_as");
    @InterfaceC5670cr1
    @Deprecated
    public static final AdSize q = new AdSize(-1, -2, "smart_banner");
    @InterfaceC5670cr1
    public static final AdSize r = new AdSize(-3, -4, "fluid");
    @InterfaceC5670cr1
    public static final AdSize s = new AdSize(0, 0, "invalid");
    @InterfaceC5670cr1
    public static final AdSize t = new AdSize(50, 50, "50x50_mb");
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;

    static {
        new AdSize(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i2, int i3) {
        this(i2, i3, r0 + "x" + r1 + "_as");
        String valueOf;
        if (i2 == -1) {
            valueOf = "FULL";
        } else {
            valueOf = String.valueOf(i2);
        }
        String valueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
    }

    @InterfaceC5670cr1
    public static AdSize a(@InterfaceC5670cr1 Context context, int i2) {
        AdSize i3 = com.google.android.gms.ads.internal.util.client.zzf.i(context, i2, 50, 0);
        i3.d = true;
        return i3;
    }

    @InterfaceC5670cr1
    public static AdSize b(@InterfaceC5670cr1 Context context, int i2) {
        int f = com.google.android.gms.ads.internal.util.client.zzf.f(context, 0);
        if (f == -1) {
            return s;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    @InterfaceC5670cr1
    public static AdSize e(int i2, int i3) {
        AdSize adSize = new AdSize(i2, 0);
        adSize.f = i3;
        adSize.e = true;
        if (i3 < 32) {
            zzo.g("The maximum height set for the inline adaptive ad size was " + i3 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @InterfaceC5670cr1
    public static AdSize f(@InterfaceC5670cr1 Context context, int i2) {
        AdSize i3 = com.google.android.gms.ads.internal.util.client.zzf.i(context, i2, 50, 2);
        i3.d = true;
        return i3;
    }

    @InterfaceC5670cr1
    public static AdSize g(@InterfaceC5670cr1 Context context, int i2) {
        int f = com.google.android.gms.ads.internal.util.client.zzf.f(context, 2);
        AdSize adSize = new AdSize(i2, 0);
        if (f == -1) {
            return s;
        }
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    @InterfaceC5670cr1
    public static AdSize h(@InterfaceC5670cr1 Context context, int i2) {
        AdSize i3 = com.google.android.gms.ads.internal.util.client.zzf.i(context, i2, 50, 1);
        i3.d = true;
        return i3;
    }

    @InterfaceC5670cr1
    public static AdSize i(@InterfaceC5670cr1 Context context, int i2) {
        int f = com.google.android.gms.ads.internal.util.client.zzf.f(context, 1);
        AdSize adSize = new AdSize(i2, 0);
        if (f == -1) {
            return s;
        }
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    public int c() {
        return this.b;
    }

    public int d(@InterfaceC5670cr1 Context context) {
        int i2 = this.b;
        if (i2 != -4 && i2 != -3) {
            if (i2 != -2) {
                zzbb.b();
                return com.google.android.gms.ads.internal.util.client.zzf.D(context, i2);
            }
            return zzr.m0(context.getResources().getDisplayMetrics());
        }
        return -1;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.a != adSize.a || this.b != adSize.b || !this.c.equals(adSize.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public int j() {
        return this.a;
    }

    public int k(@InterfaceC5670cr1 Context context) {
        int i2 = this.a;
        if (i2 == -3) {
            return -1;
        }
        if (i2 != -1) {
            zzbb.b();
            return com.google.android.gms.ads.internal.util.client.zzf.D(context, i2);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.b == -2;
    }

    public boolean m() {
        return this.a == -3 && this.b == -4;
    }

    public boolean n() {
        return this.a == -1;
    }

    public final int o() {
        return this.h;
    }

    public final int p() {
        return this.f;
    }

    public final void q(int i2) {
        this.f = i2;
    }

    public final void r(int i2) {
        this.h = i2;
    }

    public final void s(boolean z) {
        this.e = true;
    }

    public final void t(boolean z) {
        this.g = true;
    }

    @InterfaceC5670cr1
    public String toString() {
        return this.c;
    }

    public final boolean u() {
        return this.d;
    }

    public final boolean v() {
        return this.e;
    }

    public final boolean w() {
        return this.g;
    }

    public AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i2);
        } else if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i3);
        } else {
            this.a = i2;
            this.b = i3;
            this.c = str;
        }
    }
}
