package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;
import o.C9948uJ1;
import o.InterfaceC11300zs1;
import o.O70;

/* loaded from: classes2.dex */
public final class zzady {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    @InterfaceC11300zs1
    public final zzadx k;
    @InterfaceC11300zs1
    public final zzav l;

    public zzady(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @InterfaceC11300zs1 zzadx zzadxVar, @InterfaceC11300zs1 zzav zzavVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i(i5);
        this.g = i6;
        this.h = i7;
        this.i = h(i7);
        this.j = j;
        this.k = zzadxVar;
        this.l = zzavVar;
    }

    public static int h(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            return i != 32 ? -1 : 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case C9948uJ1.h /* 32000 */:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case O70.a /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return C10323vs.b;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        String str = zzeu.a;
        return Math.max(0L, Math.min((j * this.e) / 1000000, this.j - 1));
    }

    public final zzz c(byte[] bArr, @InterfaceC11300zs1 zzav zzavVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzav d = d(zzavVar);
        zzx zzxVar = new zzx();
        zzxVar.E(C4128Rj1.e0);
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        zzxVar.t(i);
        zzxVar.b(this.g);
        zzxVar.F(this.e);
        zzxVar.x(zzeu.I(this.h));
        zzxVar.p(Collections.singletonList(bArr));
        zzxVar.w(d);
        return zzxVar.K();
    }

    @InterfaceC11300zs1
    public final zzav d(@InterfaceC11300zs1 zzav zzavVar) {
        zzav zzavVar2 = this.l;
        if (zzavVar2 == null) {
            return zzavVar;
        }
        return zzavVar2.d(zzavVar);
    }

    public final zzady e(List list) {
        return new zzady(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(new zzav(list)));
    }

    public final zzady f(@InterfaceC11300zs1 zzadx zzadxVar) {
        return new zzady(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, zzadxVar, this.l);
    }

    public final zzady g(List list) {
        return new zzady(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(zzaez.b(list)));
    }

    public zzady(byte[] bArr, int i) {
        zzej zzejVar = new zzej(bArr, bArr.length);
        zzejVar.l(i * 8);
        this.a = zzejVar.d(16);
        this.b = zzejVar.d(16);
        this.c = zzejVar.d(24);
        this.d = zzejVar.d(24);
        int d = zzejVar.d(20);
        this.e = d;
        this.f = i(d);
        this.g = zzejVar.d(3) + 1;
        int d2 = zzejVar.d(5) + 1;
        this.h = d2;
        this.i = h(d2);
        this.j = zzejVar.e(36);
        this.k = null;
        this.l = null;
    }
}
