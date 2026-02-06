package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C10833xx0;

@Deprecated
/* renamed from: o.Pu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3976Pu0 {
    public static final String m = "FlacStreamMetadata";
    public static final int n = -1;
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
    public final a k;
    @InterfaceC11300zs1
    public final C4224Si1 l;

    /* renamed from: o.Pu0$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public C3976Pu0(byte[] bArr, int i) {
        C2903Ey1 c2903Ey1 = new C2903Ey1(bArr);
        c2903Ey1.q(i * 8);
        this.a = c2903Ey1.h(16);
        this.b = c2903Ey1.h(16);
        this.c = c2903Ey1.h(24);
        this.d = c2903Ey1.h(24);
        int h = c2903Ey1.h(20);
        this.e = h;
        this.f = m(h);
        this.g = c2903Ey1.h(3) + 1;
        int h2 = c2903Ey1.h(5) + 1;
        this.h = h2;
        this.i = f(h2);
        this.j = c2903Ey1.j(36);
        this.k = null;
        this.l = null;
    }

    @InterfaceC11300zs1
    public static C4224Si1 a(List<String> list, List<WC1> list2) {
        C4224Si1 c = C8241nJ2.c(list);
        if (c == null && list2.isEmpty()) {
            return null;
        }
        return new C4224Si1(list2).b(c);
    }

    public static int f(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            return -1;
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

    public static int m(int i) {
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

    public C3976Pu0 b(List<WC1> list) {
        return new C3976Pu0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, k(new C4224Si1(list)));
    }

    public C3976Pu0 c(@InterfaceC11300zs1 a aVar) {
        return new C3976Pu0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public C3976Pu0 d(List<String> list) {
        return new C3976Pu0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, k(C8241nJ2.c(list)));
    }

    public long e() {
        long j;
        long j2;
        long j3;
        int i = this.d;
        if (i > 0) {
            j2 = (i + this.c) / 2;
            j3 = 1;
        } else {
            int i2 = this.a;
            if (i2 == this.b && i2 > 0) {
                j = i2;
            } else {
                j = PlaybackStateCompat.t1;
            }
            j2 = ((j * this.g) * this.h) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public int g() {
        return this.h * this.e * this.g;
    }

    public long h() {
        long j = this.j;
        if (j == 0) {
            return C10323vs.b;
        }
        return (j * 1000000) / this.e;
    }

    public C10833xx0 i(byte[] bArr, @InterfaceC11300zs1 C4224Si1 c4224Si1) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new C10833xx0.b().g0(C4128Rj1.e0).Y(i).J(this.g).h0(this.e).V(Collections.singletonList(bArr)).Z(k(c4224Si1)).G();
    }

    public int j() {
        return this.b * this.g * (this.h / 8);
    }

    @InterfaceC11300zs1
    public C4224Si1 k(@InterfaceC11300zs1 C4224Si1 c4224Si1) {
        C4224Si1 c4224Si12 = this.l;
        if (c4224Si12 == null) {
            return c4224Si1;
        }
        return c4224Si12.b(c4224Si1);
    }

    public long l(long j) {
        return TD2.x((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public C3976Pu0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ArrayList<String> arrayList, ArrayList<WC1> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j, (a) null, a(arrayList, arrayList2));
    }

    public C3976Pu0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @InterfaceC11300zs1 a aVar, @InterfaceC11300zs1 C4224Si1 c4224Si1) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = m(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = aVar;
        this.l = c4224Si1;
    }
}
