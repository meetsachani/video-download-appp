package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C2638Cg0;

/* loaded from: classes2.dex */
final class zzamv {
    public final zzaet a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public zzamv(zzaet zzaetVar) {
        this.a = zzaetVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & C2638Cg0.o7) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d = z;
                this.c = false;
                return;
            }
            this.f = i3 + (i2 - i);
        }
    }

    public final void b(long j, int i, boolean z) {
        boolean z2;
        if (this.h != C10323vs.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.f(z2);
        if (this.e == 182 && z && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, long j) {
        boolean z;
        this.e = i;
        this.d = false;
        if (i != 182) {
            if (i != 179) {
                z = false;
                this.b = z;
                this.c = i == 182;
                this.f = 0;
                this.h = j;
            }
            i = 179;
        }
        z = true;
        this.b = z;
        this.c = i == 182;
        this.f = 0;
        this.h = j;
    }

    public final void d() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = -1;
    }
}
