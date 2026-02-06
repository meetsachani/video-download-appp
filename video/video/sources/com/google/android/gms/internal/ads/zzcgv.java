package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcgv {
    public final int a;
    public final int b;
    public final int c;

    public zzcgv(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static zzcgv a() {
        return new zzcgv(0, 0, 0);
    }

    public static zzcgv b(int i, int i2) {
        return new zzcgv(1, i, i2);
    }

    public static zzcgv c(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.Y0) {
            return new zzcgv(3, 0, 0);
        }
        if (zzrVar.d1) {
            return new zzcgv(2, 0, 0);
        }
        if (zzrVar.c1) {
            return new zzcgv(0, 0, 0);
        }
        return new zzcgv(1, zzrVar.a1, zzrVar.Z);
    }

    public static zzcgv d() {
        return new zzcgv(5, 0, 0);
    }

    public static zzcgv e() {
        return new zzcgv(4, 0, 0);
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final boolean g() {
        return this.a == 2;
    }

    public final boolean h() {
        return this.a == 5;
    }

    public final boolean i() {
        return this.a == 3;
    }

    public final boolean j() {
        return this.a == 4;
    }
}
