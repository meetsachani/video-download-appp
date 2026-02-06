package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzaky {
    public final zzek a = new zzek();
    public final int[] b = new int[256];
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public static /* bridge */ /* synthetic */ void b(zzaky zzakyVar, zzek zzekVar, int i) {
        int I;
        if (i >= 4) {
            zzekVar.m(3);
            int i2 = i - 4;
            if ((zzekVar.G() & 128) != 0) {
                if (i2 >= 7 && (I = zzekVar.I()) >= 4) {
                    zzakyVar.h = zzekVar.K();
                    zzakyVar.i = zzekVar.K();
                    zzakyVar.a.i(I - 4);
                    i2 = i - 11;
                } else {
                    return;
                }
            }
            zzek zzekVar2 = zzakyVar.a;
            int w = zzekVar2.w();
            int x = zzekVar2.x();
            if (w < x && i2 > 0) {
                int min = Math.min(i2, x - w);
                zzekVar.h(zzekVar2.n(), w, min);
                zzekVar2.l(w + min);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void c(zzaky zzakyVar, zzek zzekVar, int i) {
        if (i < 19) {
            return;
        }
        zzakyVar.d = zzekVar.K();
        zzakyVar.e = zzekVar.K();
        zzekVar.m(11);
        zzakyVar.f = zzekVar.K();
        zzakyVar.g = zzekVar.K();
    }

    public static /* bridge */ /* synthetic */ void d(zzaky zzakyVar, zzek zzekVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzekVar.m(2);
        int[] iArr = zzakyVar.b;
        Arrays.fill(iArr, 0);
        int i2 = 0;
        for (int i3 = i / 5; i2 < i3; i3 = i3) {
            int G = zzekVar.G();
            int G2 = zzekVar.G();
            int G3 = zzekVar.G();
            int G4 = zzekVar.G();
            double d = G2;
            int G5 = zzekVar.G() << 24;
            String str = zzeu.a;
            double d2 = G3 - 128;
            double d3 = G4 - 128;
            iArr[G] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)) << 16) | G5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
            i2++;
        }
        zzakyVar.c = true;
    }

    @InterfaceC11300zs1
    public final zzcu a() {
        int i;
        int i2;
        if (this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0) {
            zzek zzekVar = this.a;
            if (zzekVar.x() != 0 && zzekVar.w() == zzekVar.x() && this.c) {
                zzekVar.l(0);
                int i3 = this.h * this.i;
                int[] iArr = new int[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int G = zzekVar.G();
                    if (G != 0) {
                        i = i4 + 1;
                        iArr[i4] = this.b[G];
                    } else {
                        int G2 = zzekVar.G();
                        if (G2 != 0) {
                            int i5 = G2 & 63;
                            if ((G2 & 64) != 0) {
                                i5 = (i5 << 8) | zzekVar.G();
                            }
                            if ((G2 & 128) == 0) {
                                i2 = this.b[0];
                            } else {
                                i2 = this.b[zzekVar.G()];
                            }
                            i = i5 + i4;
                            Arrays.fill(iArr, i4, i, i2);
                        }
                    }
                    i4 = i;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
                zzcs zzcsVar = new zzcs();
                zzcsVar.c(createBitmap);
                zzcsVar.h(this.f / this.d);
                zzcsVar.i(0);
                zzcsVar.e(this.g / this.e, 0);
                zzcsVar.f(0);
                zzcsVar.k(this.h / this.d);
                zzcsVar.d(this.i / this.e);
                return zzcsVar.p();
            }
            return null;
        }
        return null;
    }

    public final void e() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a.i(0);
        this.c = false;
    }
}
