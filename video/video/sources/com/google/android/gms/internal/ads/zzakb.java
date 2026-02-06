package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.C4128Rj1;
import o.C8241nJ2;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;

/* loaded from: classes2.dex */
final class zzakb extends zzajz {
    @InterfaceC11300zs1
    public zzaka n;

    /* renamed from: o  reason: collision with root package name */
    public int f209o;
    public boolean p;
    @InterfaceC11300zs1
    public zzaey q;
    @InterfaceC11300zs1
    public zzaew r;

    @Override // com.google.android.gms.internal.ads.zzajz
    public final long a(zzek zzekVar) {
        int i;
        int i2 = 0;
        if ((zzekVar.n()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzekVar.n()[0];
        zzaka zzakaVar = this.n;
        zzdc.b(zzakaVar);
        if (!zzakaVar.d[(b >> 1) & (255 >>> (8 - zzakaVar.e))].a) {
            i = zzakaVar.a.e;
        } else {
            i = zzakaVar.a.f;
        }
        if (this.p) {
            i2 = (this.f209o + i) / 4;
        }
        if (zzekVar.v() < zzekVar.x() + 4) {
            byte[] copyOf = Arrays.copyOf(zzekVar.n(), zzekVar.x() + 4);
            zzekVar.j(copyOf, copyOf.length);
        } else {
            zzekVar.k(zzekVar.x() + 4);
        }
        long j = i2;
        byte[] n = zzekVar.n();
        n[zzekVar.x() - 4] = (byte) (j & 255);
        n[zzekVar.x() - 3] = (byte) ((j >>> 8) & 255);
        n[zzekVar.x() - 2] = (byte) ((j >>> 16) & 255);
        n[zzekVar.x() - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.f209o = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.f209o = 0;
        this.p = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public final boolean c(zzek zzekVar, long j, zzajw zzajwVar) throws IOException {
        zzaka zzakaVar;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        boolean z;
        if (this.n != null) {
            zzajwVar.a.getClass();
            return false;
        }
        zzaey zzaeyVar = this.q;
        int i9 = 1;
        if (zzaeyVar == null) {
            zzaez.d(1, zzekVar, false);
            int D = zzekVar.D();
            int G = zzekVar.G();
            int D2 = zzekVar.D();
            int C = zzekVar.C();
            if (C <= 0) {
                i6 = -1;
            } else {
                i6 = C;
            }
            int C2 = zzekVar.C();
            if (C2 <= 0) {
                i7 = -1;
            } else {
                i7 = C2;
            }
            int C3 = zzekVar.C();
            if (C3 <= 0) {
                i8 = -1;
            } else {
                i8 = C3;
            }
            int G2 = zzekVar.G();
            int pow = (int) Math.pow(2.0d, G2 & 15);
            int pow2 = (int) Math.pow(2.0d, (G2 & 240) >> 4);
            if (1 != (zzekVar.G() & 1)) {
                z = false;
            } else {
                z = true;
            }
            this.q = new zzaey(D, G, D2, i6, i7, i8, pow, pow2, z, Arrays.copyOf(zzekVar.n(), zzekVar.x()));
        } else {
            int i10 = 4;
            zzaew zzaewVar = this.r;
            if (zzaewVar == null) {
                this.r = zzaez.c(zzekVar, true, true);
            } else {
                byte[] bArr = new byte[zzekVar.x()];
                System.arraycopy(zzekVar.n(), 0, bArr, 0, zzekVar.x());
                int i11 = zzaeyVar.a;
                int i12 = 5;
                zzaez.d(5, zzekVar, false);
                int G3 = zzekVar.G() + 1;
                zzaev zzaevVar = new zzaev(zzekVar.n());
                zzaevVar.c(zzekVar.w() * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 < G3) {
                        if (zzaevVar.b(24) == 5653314) {
                            int b = zzaevVar.b(16);
                            int b2 = zzaevVar.b(24);
                            if (!zzaevVar.d()) {
                                boolean d = zzaevVar.d();
                                for (int i16 = 0; i16 < b2; i16++) {
                                    if (d) {
                                        if (zzaevVar.d()) {
                                            zzaevVar.c(i12);
                                        }
                                    } else {
                                        zzaevVar.c(i12);
                                    }
                                }
                            } else {
                                zzaevVar.c(i12);
                                for (int i17 = 0; i17 < b2; i17 += zzaevVar.b(zzaez.a(b2 - i17))) {
                                }
                            }
                            int i18 = i10;
                            int b3 = zzaevVar.b(i18);
                            if (b3 <= 2) {
                                if (b3 != i9) {
                                    if (b3 != 2) {
                                        i5 = i9;
                                        i13++;
                                        i9 = i5;
                                        i10 = 4;
                                        i12 = 5;
                                    }
                                } else {
                                    i14 = b3;
                                }
                                zzaevVar.c(32);
                                zzaevVar.c(32);
                                int b4 = zzaevVar.b(i18) + i9;
                                zzaevVar.c(i9);
                                if (i14 == i9) {
                                    if (b != 0) {
                                        i5 = i9;
                                        j2 = (long) Math.floor(Math.pow(b2, 1.0d / b));
                                    } else {
                                        i5 = i9;
                                        j2 = 0;
                                    }
                                } else {
                                    i5 = i9;
                                    j2 = b * b2;
                                }
                                zzaevVar.c((int) (j2 * b4));
                                i13++;
                                i9 = i5;
                                i10 = 4;
                                i12 = 5;
                            } else {
                                throw zzaz.a("lookup type greater than 2 not decodable: " + b3, null);
                            }
                        } else {
                            throw zzaz.a("expected code book to start with [0x56, 0x43, 0x42] at " + zzaevVar.a(), null);
                        }
                    } else {
                        int i19 = i9;
                        int i20 = 6;
                        int b5 = zzaevVar.b(6) + i19;
                        for (int i21 = 0; i21 < b5; i21++) {
                            if (zzaevVar.b(16) != 0) {
                                throw zzaz.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int b6 = zzaevVar.b(6) + i19;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < b6) {
                                int b7 = zzaevVar.b(i15);
                                if (b7 != 0) {
                                    if (b7 == i19) {
                                        int b8 = zzaevVar.b(5);
                                        int[] iArr2 = new int[b8];
                                        int i24 = -1;
                                        for (int i25 = 0; i25 < b8; i25++) {
                                            int b9 = zzaevVar.b(4);
                                            iArr2[i25] = b9;
                                            if (b9 > i24) {
                                                i24 = b9;
                                            }
                                        }
                                        int i26 = i24 + 1;
                                        int[] iArr3 = new int[i26];
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            int i28 = 1;
                                            iArr3[i27] = zzaevVar.b(i23) + 1;
                                            int b10 = zzaevVar.b(2);
                                            if (b10 > 0) {
                                                i4 = 8;
                                                zzaevVar.c(8);
                                            } else {
                                                i4 = 8;
                                            }
                                            int i29 = i26;
                                            int i30 = 0;
                                            while (true) {
                                                int i31 = i28 << b10;
                                                iArr = iArr2;
                                                if (i30 < i31) {
                                                    zzaevVar.c(i4);
                                                    i30++;
                                                    iArr2 = iArr;
                                                    i4 = 8;
                                                    i28 = 1;
                                                }
                                            }
                                            i27++;
                                            iArr2 = iArr;
                                            i26 = i29;
                                            i23 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        zzaevVar.c(2);
                                        int b11 = zzaevVar.b(4);
                                        int i32 = 0;
                                        int i33 = 0;
                                        for (int i34 = 0; i34 < b8; i34++) {
                                            i32 += iArr3[iArr4[i34]];
                                            while (i33 < i32) {
                                                zzaevVar.c(b11);
                                                i33++;
                                            }
                                        }
                                    } else {
                                        throw zzaz.a("floor type greater than 1 not decodable: " + b7, null);
                                    }
                                } else {
                                    int i35 = 8;
                                    zzaevVar.c(8);
                                    zzaevVar.c(16);
                                    zzaevVar.c(16);
                                    zzaevVar.c(6);
                                    zzaevVar.c(8);
                                    int b12 = zzaevVar.b(4) + 1;
                                    int i36 = 0;
                                    while (i36 < b12) {
                                        zzaevVar.c(i35);
                                        i36++;
                                        i35 = 8;
                                    }
                                }
                                i22++;
                                i20 = 6;
                                i15 = 16;
                                i19 = 1;
                            } else {
                                int i37 = 1;
                                int b13 = zzaevVar.b(i20) + 1;
                                int i38 = 0;
                                while (i38 < b13) {
                                    if (zzaevVar.b(16) <= 2) {
                                        zzaevVar.c(24);
                                        zzaevVar.c(24);
                                        zzaevVar.c(24);
                                        int b14 = zzaevVar.b(i20) + i37;
                                        int i39 = 8;
                                        zzaevVar.c(8);
                                        int[] iArr5 = new int[b14];
                                        for (int i40 = 0; i40 < b14; i40++) {
                                            int b15 = zzaevVar.b(3);
                                            if (zzaevVar.d()) {
                                                i3 = zzaevVar.b(5);
                                            } else {
                                                i3 = 0;
                                            }
                                            iArr5[i40] = (i3 * 8) + b15;
                                        }
                                        int i41 = 0;
                                        while (i41 < b14) {
                                            int i42 = 0;
                                            while (i42 < i39) {
                                                if ((iArr5[i41] & (1 << i42)) != 0) {
                                                    zzaevVar.c(i39);
                                                }
                                                i42++;
                                                i39 = 8;
                                            }
                                            i41++;
                                            i39 = 8;
                                        }
                                        i38++;
                                        i20 = 6;
                                        i37 = 1;
                                    } else {
                                        throw zzaz.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int b16 = zzaevVar.b(i20) + 1;
                                for (int i43 = 0; i43 < b16; i43++) {
                                    int b17 = zzaevVar.b(16);
                                    if (b17 != 0) {
                                        zzdx.c(C8241nJ2.a, "mapping type other than 0 not supported: " + b17);
                                    } else {
                                        if (zzaevVar.d()) {
                                            i = 1;
                                            i2 = zzaevVar.b(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzaevVar.d()) {
                                            int b18 = zzaevVar.b(8) + i;
                                            for (int i44 = 0; i44 < b18; i44++) {
                                                int i45 = i11 - 1;
                                                zzaevVar.c(zzaez.a(i45));
                                                zzaevVar.c(zzaez.a(i45));
                                            }
                                        }
                                        if (zzaevVar.b(2) == 0) {
                                            if (i2 > 1) {
                                                for (int i46 = 0; i46 < i11; i46++) {
                                                    zzaevVar.c(4);
                                                }
                                            }
                                            for (int i47 = 0; i47 < i2; i47++) {
                                                zzaevVar.c(8);
                                                zzaevVar.c(8);
                                                zzaevVar.c(8);
                                            }
                                        } else {
                                            throw zzaz.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int b19 = zzaevVar.b(6);
                                int i48 = b19 + 1;
                                zzaex[] zzaexVarArr = new zzaex[i48];
                                for (int i49 = 0; i49 < i48; i49++) {
                                    zzaexVarArr[i49] = new zzaex(zzaevVar.d(), zzaevVar.b(16), zzaevVar.b(16), zzaevVar.b(8));
                                }
                                if (zzaevVar.d()) {
                                    zzakaVar = new zzaka(zzaeyVar, zzaewVar, bArr, zzaexVarArr, zzaez.a(b19));
                                } else {
                                    throw zzaz.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzakaVar = null;
        this.n = zzakaVar;
        if (zzakaVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaey zzaeyVar2 = zzakaVar.a;
        arrayList.add(zzaeyVar2.g);
        arrayList.add(zzakaVar.c);
        zzav b20 = zzaez.b(zzfyc.D(zzakaVar.b.a));
        zzx zzxVar = new zzx();
        zzxVar.e(C4128Rj1.h0);
        zzxVar.E("audio/vorbis");
        zzxVar.a(zzaeyVar2.d);
        zzxVar.y(zzaeyVar2.c);
        zzxVar.b(zzaeyVar2.a);
        zzxVar.F(zzaeyVar2.b);
        zzxVar.p(arrayList);
        zzxVar.w(b20);
        zzajwVar.a = zzxVar.K();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void h(long j) {
        boolean z;
        super.h(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        zzaey zzaeyVar = this.q;
        if (zzaeyVar != null) {
            i = zzaeyVar.e;
        }
        this.f209o = i;
    }
}
