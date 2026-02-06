package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzffa {
    public final long a;
    public long c;
    public final zzfez b = new zzfez();
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public zzffa() {
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        this.a = a;
        this.c = a;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final zzfez d() {
        zzfez zzfezVar = this.b;
        zzfez clone = zzfezVar.clone();
        zzfezVar.X = false;
        zzfezVar.Y = 0;
        return clone;
    }

    public final String e() {
        return "Created: " + this.a + " Last accessed: " + this.c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void f() {
        this.c = com.google.android.gms.ads.internal.zzv.d().a();
        this.d++;
    }

    public final void g() {
        this.f++;
        this.b.Y++;
    }

    public final void h() {
        this.e++;
        this.b.X = true;
    }
}
