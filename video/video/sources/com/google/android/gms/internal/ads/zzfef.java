package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfef {
    public final zzfee a = new zzfee();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final zzfee a() {
        zzfee zzfeeVar = this.a;
        zzfee clone = zzfeeVar.clone();
        zzfeeVar.X = false;
        zzfeeVar.Y = false;
        return clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.b + "\n\tPools removed: " + this.c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }

    public final void c() {
        this.f++;
    }

    public final void d() {
        this.b++;
        this.a.X = true;
    }

    public final void e() {
        this.e++;
    }

    public final void f() {
        this.d++;
    }

    public final void g() {
        this.c++;
        this.a.Y = true;
    }
}
