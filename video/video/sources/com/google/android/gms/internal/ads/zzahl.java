package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import o.C10997yd1;

/* loaded from: classes2.dex */
final class zzahl {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final zzahs c = new zzahs();
    public zzahm d;
    public int e;
    public int f;
    public long g;

    public final void a(zzahm zzahmVar) {
        this.d = zzahmVar;
    }

    public final void b() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r1 == 1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(zzado zzadoVar) throws IOException {
        String str;
        double longBitsToDouble;
        int b;
        int c;
        zzdc.b(this.d);
        while (true) {
            ArrayDeque arrayDeque = this.b;
            zzahj zzahjVar = (zzahj) arrayDeque.peek();
            if (zzahjVar != null && zzadoVar.e() >= zzahj.b(zzahjVar)) {
                ((zzahn) this.d).a.h(zzahj.a((zzahj) arrayDeque.pop()));
                return true;
            }
            int i = this.e;
            if (i == 0) {
                long d = this.c.d(zzadoVar, true, false, 4);
                if (d == -2) {
                    zzadoVar.j();
                    while (true) {
                        byte[] bArr = this.a;
                        zzadoVar.J(bArr, 0, 4);
                        b = zzahs.b(bArr[0]);
                        if (b != -1 && b <= 4) {
                            c = (int) zzahs.c(bArr, b, false);
                            zzahq zzahqVar = ((zzahn) this.d).a;
                            if (c != 357149030 && c != 524531317 && c != 475249515) {
                                if (c == 374648427) {
                                    c = 374648427;
                                }
                            }
                        }
                        zzadoVar.G(1);
                    }
                    zzadoVar.G(b);
                    d = c;
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            this.g = this.c.d(zzadoVar, false, true, 8);
            this.e = 2;
            zzahm zzahmVar = this.d;
            int i2 = this.f;
            zzahq zzahqVar2 = ((zzahn) zzahmVar).a;
            switch (i2) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case C10997yd1.Q1 /* 186 */:
                case C10997yd1.z1 /* 215 */:
                case C10997yd1.n1 /* 231 */:
                case C10997yd1.u1 /* 238 */:
                case C10997yd1.o2 /* 241 */:
                case C10997yd1.w1 /* 251 */:
                case C10997yd1.G1 /* 16871 */:
                case C10997yd1.d2 /* 16980 */:
                case C10997yd1.c1 /* 17029 */:
                case C10997yd1.a1 /* 17143 */:
                case C10997yd1.g2 /* 18401 */:
                case C10997yd1.j2 /* 18408 */:
                case C10997yd1.a2 /* 20529 */:
                case C10997yd1.b2 /* 20530 */:
                case C10997yd1.i1 /* 21420 */:
                case C10997yd1.w2 /* 21432 */:
                case C10997yd1.R1 /* 21680 */:
                case C10997yd1.T1 /* 21682 */:
                case C10997yd1.S1 /* 21690 */:
                case C10997yd1.C1 /* 21930 */:
                case 21938:
                case C10997yd1.y2 /* 21945 */:
                case C10997yd1.z2 /* 21946 */:
                case C10997yd1.A2 /* 21947 */:
                case C10997yd1.B2 /* 21948 */:
                case C10997yd1.C2 /* 21949 */:
                case C10997yd1.E1 /* 21998 */:
                case C10997yd1.L1 /* 22186 */:
                case C10997yd1.M1 /* 22203 */:
                case C10997yd1.W1 /* 25188 */:
                case C10997yd1.N1 /* 30114 */:
                case C10997yd1.r2 /* 30321 */:
                case C10997yd1.D1 /* 2352003 */:
                case C10997yd1.k1 /* 2807729 */:
                    long j = this.g;
                    if (j <= 8) {
                        zzahqVar2.l(i2, d(zzadoVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw zzaz.a("Invalid integer size: " + j, null);
                case 134:
                case 17026:
                case C10997yd1.I1 /* 21358 */:
                case C10997yd1.p2 /* 2274716 */:
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            str = "";
                        } else {
                            byte[] bArr2 = new byte[i3];
                            zzadoVar.I(bArr2, 0, i3);
                            while (i3 > 0) {
                                int i4 = i3 - 1;
                                if (bArr2[i4] == 0) {
                                    i3 = i4;
                                } else {
                                    str = new String(bArr2, 0, i3);
                                }
                            }
                            str = new String(bArr2, 0, i3);
                        }
                        zzahqVar2.n(i2, str);
                        this.e = 0;
                        return true;
                    }
                    throw zzaz.a("String element size: " + j2, null);
                case 160:
                case C10997yd1.t1 /* 166 */:
                case C10997yd1.y1 /* 174 */:
                case C10997yd1.n2 /* 183 */:
                case C10997yd1.l2 /* 187 */:
                case 224:
                case 225:
                case C10997yd1.F1 /* 16868 */:
                case C10997yd1.i2 /* 18407 */:
                case C10997yd1.g1 /* 19899 */:
                case C10997yd1.c2 /* 20532 */:
                case C10997yd1.f2 /* 20533 */:
                case C10997yd1.x2 /* 21936 */:
                case C10997yd1.D2 /* 21968 */:
                case C10997yd1.Z1 /* 25152 */:
                case C10997yd1.Y1 /* 28032 */:
                case C10997yd1.s1 /* 30113 */:
                case C10997yd1.q2 /* 30320 */:
                case C10997yd1.f1 /* 290298740 */:
                case 357149030:
                case C10997yd1.x1 /* 374648427 */:
                case C10997yd1.d1 /* 408125543 */:
                case 440786851:
                case C10997yd1.k2 /* 475249515 */:
                case C10997yd1.m1 /* 524531317 */:
                    long e = zzadoVar.e();
                    arrayDeque.push(new zzahj(i2, this.g + e, null));
                    ((zzahn) this.d).a.m(this.f, e, this.g);
                    this.e = 0;
                    return true;
                case C10997yd1.q1 /* 161 */:
                case C10997yd1.o1 /* 163 */:
                case C10997yd1.v1 /* 165 */:
                case C10997yd1.H1 /* 16877 */:
                case C10997yd1.e2 /* 16981 */:
                case C10997yd1.h2 /* 18402 */:
                case C10997yd1.h1 /* 21419 */:
                case C10997yd1.K1 /* 25506 */:
                case C10997yd1.s2 /* 30322 */:
                    zzahqVar2.d(i2, (int) this.g, zzadoVar);
                    this.e = 0;
                    return true;
                case 181:
                case C10997yd1.l1 /* 17545 */:
                case C10997yd1.E2 /* 21969 */:
                case C10997yd1.F2 /* 21970 */:
                case C10997yd1.G2 /* 21971 */:
                case C10997yd1.H2 /* 21972 */:
                case C10997yd1.I2 /* 21973 */:
                case C10997yd1.J2 /* 21974 */:
                case C10997yd1.K2 /* 21975 */:
                case C10997yd1.L2 /* 21976 */:
                case C10997yd1.M2 /* 21977 */:
                case C10997yd1.N2 /* 21978 */:
                case C10997yd1.t2 /* 30323 */:
                case C10997yd1.u2 /* 30324 */:
                case C10997yd1.v2 /* 30325 */:
                    long j3 = this.g;
                    if (j3 != 4 && j3 != 8) {
                        throw zzaz.a("Invalid float size: " + j3, null);
                    }
                    int i5 = (int) j3;
                    long d2 = d(zzadoVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) d2);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(d2);
                    }
                    zzahqVar2.k(i2, longBitsToDouble);
                    this.e = 0;
                    return true;
                default:
                    zzadoVar.G((int) this.g);
                    this.e = 0;
            }
        }
    }

    public final long d(zzado zzadoVar, int i) throws IOException {
        byte[] bArr = this.a;
        zzadoVar.I(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
