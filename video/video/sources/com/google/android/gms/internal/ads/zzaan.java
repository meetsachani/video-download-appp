package com.google.android.gms.internal.ads;

import o.C10323vs;

/* loaded from: classes2.dex */
final class zzaan {
    public boolean c;
    public int e;
    public zzaam a = new zzaam();
    public zzaam b = new zzaam();
    public long d = C10323vs.b;

    public final float a() {
        if (this.a.f()) {
            return (float) (1.0E9d / this.a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        if (this.a.f()) {
            return this.a.a();
        }
        return C10323vs.b;
    }

    public final long d() {
        if (this.a.f()) {
            return this.a.b();
        }
        return C10323vs.b;
    }

    public final void e(long j) {
        this.a.c(j);
        int i = 0;
        if (this.a.f()) {
            this.c = false;
        } else if (this.d != C10323vs.b) {
            if (!this.c || this.b.e()) {
                this.b.d();
                this.b.c(this.d);
            }
            this.c = true;
            this.b.c(j);
        }
        if (this.c && this.b.f()) {
            zzaam zzaamVar = this.a;
            this.a = this.b;
            this.b = zzaamVar;
            this.c = false;
        }
        this.d = j;
        if (!this.a.f()) {
            i = this.e + 1;
        }
        this.e = i;
    }

    public final void f() {
        this.a.d();
        this.b.d();
        this.c = false;
        this.d = C10323vs.b;
        this.e = 0;
    }

    public final boolean g() {
        return this.a.f();
    }
}
