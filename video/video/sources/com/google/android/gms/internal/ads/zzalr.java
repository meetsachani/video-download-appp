package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;
import o.C6516gH2;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalr {
    public boolean b;
    public boolean c;
    public int[] d;
    public int e;
    public int f;
    @InterfaceC11300zs1
    public Rect g;
    public final int[] a = new int[4];
    public int h = -1;
    public int i = -1;

    public static int e(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    public static int f(int i, int i2) {
        return (i & C6516gH2.x) | ((i2 * 17) << 24);
    }

    @InterfaceC11300zs1
    public final zzcu a(zzek zzekVar) {
        Rect rect;
        if (this.d != null && this.b && this.c && (rect = this.g) != null && this.h != -1 && this.i != -1 && rect.width() >= 2 && this.g.height() >= 2) {
            Rect rect2 = this.g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            zzej zzejVar = new zzej();
            zzekVar.l(this.h);
            zzejVar.j(zzekVar);
            g(zzejVar, true, rect2, iArr);
            zzekVar.l(this.i);
            zzejVar.j(zzekVar);
            g(zzejVar, false, rect2, iArr);
            Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            zzcs zzcsVar = new zzcs();
            zzcsVar.c(createBitmap);
            zzcsVar.h(rect2.left / this.e);
            zzcsVar.i(0);
            zzcsVar.e(rect2.top / this.f, 0);
            zzcsVar.f(0);
            zzcsVar.k(rect2.width() / this.e);
            zzcsVar.d(rect2.height() / this.f);
            return zzcsVar.p();
        }
        return null;
    }

    public final void b(String str) {
        String[] split;
        int i;
        String trim = str.trim();
        String str2 = zzeu.a;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] split2 = str3.substring(9).split(",", -1);
                this.d = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = this.d;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] split3 = str3.substring(6).trim().split("x", -1);
                if (split3.length == 2) {
                    try {
                        this.e = Integer.parseInt(split3[0]);
                        this.f = Integer.parseInt(split3[1]);
                        this.b = true;
                    } catch (RuntimeException e) {
                        zzdx.g("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public final void c(zzek zzekVar) {
        int[] iArr = this.d;
        if (iArr != null && this.b) {
            zzekVar.m(zzekVar.K() - 2);
            int K = zzekVar.K();
            while (zzekVar.w() < K && zzekVar.u() > 0) {
                switch (zzekVar.G()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (zzekVar.u() >= 2) {
                            int G = zzekVar.G();
                            int G2 = zzekVar.G();
                            int[] iArr2 = this.a;
                            iArr2[3] = e(iArr, G >> 4);
                            iArr2[2] = e(iArr, G & 15);
                            iArr2[1] = e(iArr, G2 >> 4);
                            iArr2[0] = e(iArr, G2 & 15);
                            this.c = true;
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (zzekVar.u() >= 2 && this.c) {
                            int G3 = zzekVar.G();
                            int G4 = zzekVar.G();
                            int[] iArr3 = this.a;
                            iArr3[3] = f(iArr3[3], G3 >> 4);
                            iArr3[2] = f(iArr3[2], G3 & 15);
                            iArr3[1] = f(iArr3[1], G4 >> 4);
                            iArr3[0] = f(iArr3[0], G4 & 15);
                            break;
                        } else {
                            return;
                        }
                        break;
                    case 5:
                        if (zzekVar.u() >= 6) {
                            int G5 = zzekVar.G();
                            int G6 = zzekVar.G();
                            int i = G6 >> 4;
                            int G7 = ((G6 & 15) << 8) | zzekVar.G();
                            int G8 = zzekVar.G();
                            int G9 = zzekVar.G();
                            this.g = new Rect((G5 << 4) | i, (G8 << 4) | (G9 >> 4), G7 + 1, (((G9 & 15) << 8) | zzekVar.G()) + 1);
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (zzekVar.u() >= 4) {
                            this.h = zzekVar.K();
                            this.i = zzekVar.K();
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public final void d() {
        this.c = false;
        this.g = null;
        this.h = -1;
        this.i = -1;
    }

    public final void g(zzej zzejVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int width = rect.width();
        int i4 = i3 * width;
        int height = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (zzejVar.a() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | zzejVar.d(4);
                }
                i = i6 & 3;
                if (i6 < 4) {
                    i2 = width;
                } else {
                    i2 = i6 >> 2;
                }
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.a[i]);
                    i5 += min;
                    i4 = i8;
                    continue;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            zzejVar.f();
        }
    }
}
