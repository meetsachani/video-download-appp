package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import o.C8139mu1;

/* loaded from: classes2.dex */
final class zzajs {
    public final zzajt a = new zzajt();
    public final zzek b = new zzek(new byte[C8139mu1.n], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final zzek a() {
        return this.b;
    }

    public final zzajt b() {
        return this.a;
    }

    public final void c() {
        this.a.a();
        this.b.i(0);
        this.c = -1;
        this.e = false;
    }

    public final void d() {
        zzek zzekVar = this.b;
        if (zzekVar.n().length == 65025) {
            return;
        }
        zzekVar.j(Arrays.copyOf(zzekVar.n(), Math.max((int) C8139mu1.n, zzekVar.x())), zzekVar.x());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(zzado zzadoVar) throws IOException {
        if (this.e) {
            this.e = false;
            this.b.i(0);
        }
        while (true) {
            boolean z = true;
            if (this.e) {
                return true;
            }
            int i = this.c;
            if (i < 0) {
                zzajt zzajtVar = this.a;
                if (!zzajtVar.c(zzadoVar, -1L) || !zzajtVar.b(zzadoVar, true)) {
                    break;
                }
                int i2 = zzajtVar.d;
                if ((zzajtVar.a & 1) == 1 && this.b.x() == 0) {
                    i2 += f(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!zzadr.e(zzadoVar, i2)) {
                    return false;
                }
                this.c = i;
            }
            int f = f(i);
            int i3 = this.c + this.d;
            if (f > 0) {
                zzek zzekVar = this.b;
                zzekVar.f(zzekVar.x() + f);
                if (!zzadr.d(zzadoVar, zzekVar.n(), zzekVar.x(), f)) {
                    return false;
                }
                zzekVar.k(zzekVar.x() + f);
                if (this.a.f[i3 - 1] == 255) {
                    z = false;
                }
                this.e = z;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }

    public final int f(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            zzajt zzajtVar = this.a;
            if (i5 >= zzajtVar.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = zzajtVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
