package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzacs {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    @InterfaceC11300zs1
    public final String l;

    public zzacs(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, @InterfaceC11300zs1 String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static zzacs a(zzek zzekVar) throws zzaz {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzekVar.m(4);
            int G = (zzekVar.G() & 3) + 1;
            if (G != 3) {
                ArrayList arrayList = new ArrayList();
                int G2 = zzekVar.G() & 31;
                for (int i9 = 0; i9 < G2; i9++) {
                    arrayList.add(b(zzekVar));
                }
                int G3 = zzekVar.G();
                for (int i10 = 0; i10 < G3; i10++) {
                    arrayList.add(b(zzekVar));
                }
                if (G2 > 0) {
                    byte[] bArr = zzfs.a;
                    zzfr g = zzfs.g((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                    int i11 = g.e;
                    int i12 = g.f;
                    int i13 = g.j;
                    int i14 = g.k;
                    int i15 = g.l;
                    int i16 = g.m;
                    float f2 = g.g;
                    str = zzdh.c(g.a, g.b, g.c);
                    i5 = i15;
                    i6 = i16;
                    f = f2;
                    i4 = g.i + 8;
                    i7 = i13;
                    i8 = i14;
                    i = i11;
                    i2 = i12;
                    i3 = g.h + 8;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = 16;
                    f = 1.0f;
                    i7 = -1;
                    i8 = -1;
                }
                return new zzacs(arrayList, G, i, i2, i3, i4, i7, i8, i5, i6, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaz.a("Error parsing AVC config", e);
        }
    }

    public static byte[] b(zzek zzekVar) {
        int K = zzekVar.K();
        int w = zzekVar.w();
        zzekVar.m(K);
        return zzdh.e(zzekVar.n(), w, K);
    }
}
