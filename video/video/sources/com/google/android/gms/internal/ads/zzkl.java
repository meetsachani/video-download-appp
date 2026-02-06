package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzkl {
    public boolean a;
    public zzln b;
    public int c;
    public boolean d;
    public int e;

    public zzkl(zzln zzlnVar) {
        this.b = zzlnVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }

    public final void b(zzln zzlnVar) {
        this.a |= this.b != zzlnVar;
        this.b = zzlnVar;
    }

    public final void c(int i) {
        boolean z = true;
        if (this.d && this.e != 5) {
            if (i != 5) {
                z = false;
            }
            zzdc.d(z);
            return;
        }
        this.a = true;
        this.d = true;
        this.e = i;
    }
}
