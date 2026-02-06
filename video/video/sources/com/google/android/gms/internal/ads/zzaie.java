package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaie {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final zzek f;
    public final zzek g;
    public int h;
    public int i;

    public zzaie(zzek zzekVar, zzek zzekVar2, boolean z) throws zzaz {
        this.g = zzekVar;
        this.f = zzekVar2;
        this.e = z;
        zzekVar2.l(12);
        this.a = zzekVar2.J();
        zzekVar.l(12);
        this.i = zzekVar.J();
        zzadr.b(zzekVar.A() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long O;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        if (this.e) {
            O = this.f.Q();
        } else {
            O = this.f.O();
        }
        this.d = O;
        if (this.b == this.h) {
            zzek zzekVar = this.g;
            this.c = zzekVar.J();
            zzekVar.m(4);
            int i2 = -1;
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i2 = (-1) + zzekVar.J();
            }
            this.h = i2;
        }
        return true;
    }
}
