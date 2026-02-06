package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o.AbstractC4501Vf;
import o.C10323vs;
import o.C3894Oz0;
import o.C4128Rj1;
import o.C8077mf;
import o.DK1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaiv implements zzadn {
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, C8077mf.x, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final zzz K;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public zzadq F;
    public zzaet[] G;
    public zzaet[] H;
    public boolean I;
    public final zzakj a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final zzek e;
    public final zzek f;
    public final zzek g;
    public final byte[] h;
    public final zzek i;
    public final zzagk j;
    public final zzek k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final zzfw n;

    /* renamed from: o  reason: collision with root package name */
    public zzfyc f204o;
    public int p;
    public int q;
    public long r;
    public int s;
    @InterfaceC11300zs1
    public zzek t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    @InterfaceC11300zs1
    public zzaiu z;

    static {
        zzx zzxVar = new zzx();
        zzxVar.E(C4128Rj1.J0);
        K = zzxVar.K();
    }

    @Deprecated
    public zzaiv() {
        this(zzakj.a, 32, null, null, zzfyc.F(), null);
    }

    public static int b(int i) throws zzaz {
        if (i >= 0) {
            return i;
        }
        throw zzaz.a("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzs d(List list) {
        int i;
        UUID[] uuidArr;
        zzajd zzajdVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzfa zzfaVar = (zzfa) list.get(i2);
            if (zzfaVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] n = zzfaVar.b.n();
                zzek zzekVar = new zzek(n);
                if (zzekVar.x() >= 32) {
                    zzekVar.l(0);
                    int u = zzekVar.u();
                    int A = zzekVar.A();
                    if (A != u) {
                        zzdx.f(DK1.a, "Advertised atom size (" + A + ") does not match buffer size: " + u);
                    } else {
                        int A2 = zzekVar.A();
                        if (A2 != 1886614376) {
                            zzdx.f(DK1.a, "Atom type is not pssh: " + A2);
                        } else {
                            int a = zzaip.a(zzekVar.A());
                            if (a > 1) {
                                zzdx.f(DK1.a, "Unsupported pssh version: " + a);
                            } else {
                                UUID uuid2 = new UUID(zzekVar.N(), zzekVar.N());
                                if (a == 1) {
                                    int J2 = zzekVar.J();
                                    uuidArr = new UUID[J2];
                                    int i3 = 0;
                                    while (i3 < J2) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzekVar.N(), zzekVar.N());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int J3 = zzekVar.J();
                                int u2 = zzekVar.u();
                                if (J3 != u2) {
                                    zzdx.f(DK1.a, "Atom data size (" + J3 + ") does not match the bytes left: " + u2);
                                    zzajdVar = null;
                                    if (zzajdVar == null) {
                                        uuid = null;
                                    } else {
                                        uuid = zzajdVar.a;
                                    }
                                    if (uuid == null) {
                                        zzdx.f(C3894Oz0.Q, "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new zzr(uuid, null, C4128Rj1.f, n));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[J3];
                                    zzekVar.h(bArr, 0, J3);
                                    zzajdVar = new zzajd(uuid2, a, bArr, uuidArr);
                                    if (zzajdVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                zzajdVar = null;
                if (zzajdVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzs(arrayList);
    }

    private final void h() {
        this.p = 0;
        this.s = 0;
    }

    public static void k(zzek zzekVar, int i, zzajj zzajjVar) throws zzaz {
        boolean z;
        zzekVar.l(i + 8);
        int A = zzekVar.A();
        int i2 = zzaip.b;
        if ((A & 1) == 0) {
            if ((A & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int J2 = zzekVar.J();
            if (J2 == 0) {
                Arrays.fill(zzajjVar.l, 0, zzajjVar.e, false);
                return;
            }
            int i3 = zzajjVar.e;
            if (J2 == i3) {
                Arrays.fill(zzajjVar.l, 0, J2, z);
                zzajjVar.a(zzekVar.u());
                zzek zzekVar2 = zzajjVar.n;
                zzekVar.h(zzekVar2.n(), 0, zzekVar2.x());
                zzekVar2.l(0);
                zzajjVar.f206o = false;
                return;
            }
            throw zzaz.a("Senc sample count " + J2 + " is different from fragment sample count" + i3, null);
        }
        throw zzaz.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static final zzaiq m(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaiq) sparseArray.valueAt(0);
        }
        zzaiq zzaiqVar = (zzaiq) sparseArray.get(i);
        zzaiqVar.getClass();
        return zzaiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzaiu) sparseArray.valueAt(i)).i();
        }
        this.m.clear();
        this.v = 0;
        this.n.c();
        this.w = j2;
        this.l.clear();
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return this.f204o;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzfyc F;
        zzaeq a = zzajg.a(zzadoVar);
        if (a != null) {
            F = zzfyc.G(a);
        } else {
            F = zzfyc.F();
        }
        this.f204o = F;
        if (a == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            zzadqVar = new zzakm(zzadqVar, this.a);
        }
        this.F = zzadqVar;
        h();
        zzaet[] zzaetVarArr = new zzaet[2];
        this.G = zzaetVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzaetVarArr[0] = this.F.O(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzaet[] zzaetVarArr2 = (zzaet[]) zzeu.q(this.G, i);
        this.G = zzaetVarArr2;
        for (zzaet zzaetVar : zzaetVarArr2) {
            zzaetVar.e(K);
        }
        List list = this.c;
        this.H = new zzaet[list.size()];
        while (i4 < this.H.length) {
            zzaet O = this.F.O(i3, 3);
            O.e((zzz) list.get(i4));
            this.H[i4] = O;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
        if (java.util.Objects.equals(r2, o.C4128Rj1.k) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fe, code lost:
        if (com.google.android.gms.internal.ads.zzay.g(r9.k, o.C4128Rj1.k) == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0201, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
        if (((r10 & 126) >> 1) != 39) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020b, code lost:
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020e, code lost:
        r21 = r6;
        r33 = r8;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0214, code lost:
        r31.E = r2;
        r7.d(r15, r4);
        r31.B += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021e, code lost:
        if (r4 <= 0) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
        if (r31.D != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022b, code lost:
        if (com.google.android.gms.internal.ads.zzfs.j(r13, 4, r4, r3.g) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022d, code lost:
        r31.D = r19;
        r8 = r33;
        r6 = r21;
        r2 = r28;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023b, code lost:
        r8 = r33;
        r6 = r21;
        r2 = r28;
        r10 = 0;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024e, code lost:
        throw com.google.android.gms.internal.ads.zzaz.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024f, code lost:
        r28 = r2;
        r21 = r6;
        r33 = r8;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0258, code lost:
        if (r31.E == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025a, code lost:
        r2 = r31.g;
        r2.i(r4);
        r32.I(r2.n(), 0, r31.C);
        r7.d(r2, r31.C);
        r4 = r31.C;
        r8 = com.google.android.gms.internal.ads.zzfs.c(r2.n(), r2.x());
        r2.l(0);
        r2.k(r8);
        r8 = r3.g.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0287, code lost:
        if (r8 != (-1)) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0289, code lost:
        r8 = r31.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028f, code lost:
        if (r8.a() == 0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0291, code lost:
        r8.e(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0295, code lost:
        r9 = r31.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029b, code lost:
        if (r9.a() == r8) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029d, code lost:
        r9.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a0, code lost:
        r8 = r31.n;
        r8.b(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ad, code lost:
        if ((r28.a() & 4) == 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02af, code lost:
        r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b3, code lost:
        r4 = r7.b(r32, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b8, code lost:
        r31.B += r4;
        r31.C -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c4, code lost:
        r1 = r28.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ca, code lost:
        if (r31.D != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cc, code lost:
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cf, code lost:
        r22 = r1;
        r1 = r28.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d5, code lost:
        if (r1 == null) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d7, code lost:
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02dc, code lost:
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02de, code lost:
        r7.c(r11, r22, r31.A, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02eb, code lost:
        r1 = r31.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f1, code lost:
        if (r1.isEmpty() != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f3, code lost:
        r1 = (com.google.android.gms.internal.ads.zzait) r1.removeFirst();
        r2 = r31.v;
        r7 = r1.c;
        r31.v = r2 - r7;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0304, code lost:
        if (r1.b == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0306, code lost:
        r2 = r2 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0308, code lost:
        r4 = r2;
        r1 = r31.G;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030d, code lost:
        if (r10 >= r2) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030f, code lost:
        r1[r10].c(r4, 1, r7, r31.v, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031f, code lost:
        if (r28.l() != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0321, code lost:
        r31.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0324, code lost:
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0325, code lost:
        r31.p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0329, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        r6 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r31.p != 3) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r31.A = r2.b();
        r3 = r2.d.a.g.f301o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        java.util.Objects.equals(r3, o.C4128Rj1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r31.D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r2.f >= r2.i) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
        r32.G(r31.A);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r1 != null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r3 = r2.b;
        r5 = r3.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        if (r1 == 0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
        r5.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r3.b(r2.f) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r5.m(r5.K() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
        if (r2.l() != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
        r31.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
        if (r2.d.a.h != 1) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
        r31.A -= 8;
        r32.G(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
        if (o.C4128Rj1.T.equals(r2.d.a.g.f301o) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        r31.B = r2.c(r31.A, 7);
        r3 = r31.A;
        r11 = r31.i;
        com.google.android.gms.internal.ads.zzacr.c(r3, r11);
        r2.a.d(r11, 7);
        r3 = r31.B + 7;
        r31.B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
        r3 = r2.c(r31.A, 0);
        r31.B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
        r31.A += r3;
        r31.p = 4;
        r31.C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
        r3 = r2.d.a;
        r7 = r2.a;
        r11 = r2.e();
        r14 = r3.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
        if (r14 != 0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
        r3 = r31.B;
        r4 = r31.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
        if (r3 >= r4) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
        r31.B += r7.b(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
        r15 = r31.f;
        r13 = r15.n();
        r13[0] = 0;
        r13[1] = 0;
        r13[r33] = 0;
        r8 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017c, code lost:
        if (r31.B >= r31.A) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
        r4 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
        if (r4 != 0) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
        if (r31.H.length > 0) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
        if (r31.D != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018c, code lost:
        r28 = r2;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
        r4 = com.google.android.gms.internal.ads.zzfs.b(r3.g);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
        if ((r14 + r4) <= (r31.A - r31.B)) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
        r32.I(r13, r8, r14 + r4);
        r15.l(0);
        r9 = r15.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
        if (r9 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
        r31.C = r9 - r4;
        r9 = r31.e;
        r9.l(0);
        r7.d(r9, 4);
        r31.B += 4;
        r31.A += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
        if (r31.H.length <= 0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cc, code lost:
        if (r4 <= 0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
        r9 = r3.g;
        r10 = r13[4];
        r2 = com.google.android.gms.internal.ads.zzfs.a;
        r2 = r9.f301o;
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dc, code lost:
        if (java.util.Objects.equals(r2, r6) != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
        if (com.google.android.gms.internal.ads.zzay.g(r9.k, r6) == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e7, code lost:
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01eb, code lost:
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f0, code lost:
        if ((r10 & 31) == 6) goto L412;
     */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        char c;
        boolean z;
        boolean z2;
        long j;
        long j2;
        long O;
        String str;
        String str2;
        long j3;
        zzaet[] zzaetVarArr;
        long Q;
        long Q2;
        while (true) {
            int i = this.p;
            char c2 = 2;
            int i2 = 0;
            if (i == 0) {
                if (this.s == 0) {
                    zzek zzekVar = this.k;
                    if (!zzadoVar.E(zzekVar.n(), 0, 8, true)) {
                        this.n.d();
                        return -1;
                    }
                    this.s = 8;
                    zzekVar.l(0);
                    this.r = zzekVar.O();
                    this.q = zzekVar.A();
                }
                long j4 = this.r;
                if (j4 == 1) {
                    zzek zzekVar2 = this.k;
                    zzadoVar.I(zzekVar2.n(), 8, 8);
                    this.s += 8;
                    this.r = zzekVar2.Q();
                } else if (j4 == 0) {
                    long f = zzadoVar.f();
                    if (f == -1) {
                        ArrayDeque arrayDeque = this.l;
                        f = !arrayDeque.isEmpty() ? ((zzez) arrayDeque.peek()).b : -1L;
                    }
                    if (f != -1) {
                        this.r = (f - zzadoVar.e()) + this.s;
                    }
                }
                long j5 = this.r;
                long j6 = this.s;
                if (j5 >= j6) {
                    long e = zzadoVar.e() - j6;
                    int i3 = this.q;
                    if ((i3 == 1836019558 || i3 == 1835295092) && !this.I) {
                        this.F.P(new zzael(this.x, e));
                        this.I = true;
                    }
                    if (this.q == 1836019558) {
                        SparseArray sparseArray = this.d;
                        int size = sparseArray.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zzajj zzajjVar = ((zzaiu) sparseArray.valueAt(i4)).b;
                            zzajjVar.c = e;
                            zzajjVar.b = e;
                        }
                    }
                    int i5 = this.q;
                    if (i5 == 1835295092) {
                        this.z = null;
                        this.u = e + this.r;
                        this.p = 2;
                    } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                        long e2 = (zzadoVar.e() + this.r) - 8;
                        this.l.push(new zzez(i5, e2));
                        if (this.r == this.s) {
                            l(e2);
                        } else {
                            h();
                        }
                    } else if (i5 != 1751411826 && i5 != 1835296868 && i5 != 1836476516 && i5 != 1936286840 && i5 != 1937011556 && i5 != 1937011827 && i5 != 1668576371 && i5 != 1937011555 && i5 != 1937011578 && i5 != 1937013298 && i5 != 1937007471 && i5 != 1668232756 && i5 != 1937011571 && i5 != 1952867444 && i5 != 1952868452 && i5 != 1953196132 && i5 != 1953654136 && i5 != 1953658222 && i5 != 1886614376 && i5 != 1935763834 && i5 != 1935763823 && i5 != 1936027235 && i5 != 1970628964 && i5 != 1935828848 && i5 != 1936158820 && i5 != 1701606260 && i5 != 1835362404 && i5 != 1701671783) {
                        if (this.r <= 2147483647L) {
                            this.t = null;
                            this.p = 1;
                        } else {
                            throw zzaz.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else if (this.s == 8) {
                        if (this.r <= 2147483647L) {
                            zzek zzekVar3 = new zzek((int) this.r);
                            System.arraycopy(this.k.n(), 0, zzekVar3.n(), 0, 8);
                            this.t = zzekVar3;
                            this.p = 1;
                        } else {
                            throw zzaz.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        throw zzaz.c("Leaf atom defines extended atom size (unsupported).");
                    }
                } else {
                    throw zzaz.c("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j7 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaiu zzaiuVar = this.z;
                    if (zzaiuVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.d;
                    int size2 = sparseArray2.size();
                    long j8 = Long.MAX_VALUE;
                    zzaiu zzaiuVar2 = null;
                    int i6 = 0;
                    while (i6 < size2) {
                        char c3 = c2;
                        zzaiu zzaiuVar3 = (zzaiu) sparseArray2.valueAt(i6);
                        z = zzaiuVar3.m;
                        if (z || zzaiuVar3.f != zzaiuVar3.d.b) {
                            z2 = zzaiuVar3.m;
                            if (!z2 || zzaiuVar3.h != zzaiuVar3.b.d) {
                                long d = zzaiuVar3.d();
                                if (d < j8) {
                                    zzaiuVar2 = zzaiuVar3;
                                    j8 = d;
                                }
                            }
                        }
                        i6++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzaiuVar2 == null) {
                        int e3 = (int) (this.u - zzadoVar.e());
                        if (e3 >= 0) {
                            zzadoVar.G(e3);
                            h();
                        } else {
                            throw zzaz.a("Offset to end of mdat was negative.", null);
                        }
                    } else {
                        int d2 = (int) (zzaiuVar2.d() - zzadoVar.e());
                        if (d2 < 0) {
                            zzdx.f(C3894Oz0.Q, "Ignoring negative offset to sample data.");
                            d2 = 0;
                        }
                        zzadoVar.G(d2);
                        this.z = zzaiuVar2;
                        zzaiuVar = zzaiuVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.d;
                    int size3 = sparseArray3.size();
                    zzaiu zzaiuVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzajj zzajjVar2 = ((zzaiu) sparseArray3.valueAt(i7)).b;
                        if (zzajjVar2.f206o) {
                            long j9 = zzajjVar2.c;
                            if (j9 < j7) {
                                zzaiuVar4 = (zzaiu) sparseArray3.valueAt(i7);
                                j7 = j9;
                            }
                        }
                    }
                    if (zzaiuVar4 == null) {
                        this.p = 3;
                    } else {
                        int e4 = (int) (j7 - zzadoVar.e());
                        if (e4 >= 0) {
                            zzadoVar.G(e4);
                            zzajj zzajjVar3 = zzaiuVar4.b;
                            zzek zzekVar4 = zzajjVar3.n;
                            zzadoVar.I(zzekVar4.n(), 0, zzekVar4.x());
                            zzekVar4.l(0);
                            zzajjVar3.f206o = false;
                        } else {
                            throw zzaz.a("Offset to encryption data was negative.", null);
                        }
                    }
                }
            } else {
                zzek zzekVar5 = this.t;
                int i8 = (int) (this.r - this.s);
                if (zzekVar5 != null) {
                    zzadoVar.I(zzekVar5.n(), 8, i8);
                    zzfa zzfaVar = new zzfa(this.q, zzekVar5);
                    long e5 = zzadoVar.e();
                    ArrayDeque arrayDeque2 = this.l;
                    if (!arrayDeque2.isEmpty()) {
                        ((zzez) arrayDeque2.peek()).e(zzfaVar);
                    } else {
                        int i9 = zzfaVar.a;
                        if (i9 == 1936286840) {
                            zzek zzekVar6 = zzfaVar.b;
                            zzekVar6.l(8);
                            int a = zzaip.a(zzekVar6.A());
                            zzekVar6.m(4);
                            long O2 = zzekVar6.O();
                            if (a == 0) {
                                Q = zzekVar6.O();
                                Q2 = zzekVar6.O();
                            } else {
                                Q = zzekVar6.Q();
                                Q2 = zzekVar6.Q();
                            }
                            long j10 = e5 + Q2;
                            long j11 = Q;
                            long P = zzeu.P(j11, 1000000L, O2, RoundingMode.DOWN);
                            zzekVar6.m(2);
                            int K2 = zzekVar6.K();
                            int[] iArr = new int[K2];
                            long[] jArr = new long[K2];
                            long[] jArr2 = new long[K2];
                            long[] jArr3 = new long[K2];
                            long j12 = P;
                            long j13 = j11;
                            int i10 = 0;
                            while (i10 < K2) {
                                int A = zzekVar6.A();
                                if ((A & Integer.MIN_VALUE) == 0) {
                                    long O3 = zzekVar6.O();
                                    iArr[i10] = A & Integer.MAX_VALUE;
                                    jArr[i10] = j10;
                                    jArr3[i10] = j12;
                                    long j14 = j13 + O3;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i11 = i10;
                                    long P2 = zzeu.P(j14, 1000000L, O2, RoundingMode.DOWN);
                                    jArr4[i11] = P2 - jArr5[i11];
                                    zzekVar6.m(4);
                                    j10 += iArr[i11];
                                    j13 = j14;
                                    i10 = i11 + 1;
                                    K2 = K2;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    P = P;
                                    j12 = P2;
                                } else {
                                    throw zzaz.a("Unhandled indirect reference", null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(P), new zzadb(iArr, jArr, jArr2, jArr3));
                            this.y = ((Long) create.first).longValue();
                            this.F.P((zzaem) create.second);
                            this.I = true;
                        } else if (i9 == 1701671783) {
                            zzek zzekVar7 = zzfaVar.b;
                            if (this.G.length != 0) {
                                zzekVar7.l(8);
                                int a2 = zzaip.a(zzekVar7.A());
                                if (a2 == 0) {
                                    String S = zzekVar7.S((char) 0);
                                    S.getClass();
                                    String S2 = zzekVar7.S((char) 0);
                                    S2.getClass();
                                    long O4 = zzekVar7.O();
                                    long O5 = zzekVar7.O();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long P3 = zzeu.P(O5, 1000000L, O4, roundingMode);
                                    long j15 = this.y;
                                    long j16 = j15 != C10323vs.b ? j15 + P3 : -9223372036854775807L;
                                    long P4 = zzeu.P(zzekVar7.O(), 1000L, O4, roundingMode);
                                    long j17 = j16;
                                    j = P3;
                                    j2 = j17;
                                    O = zzekVar7.O();
                                    str = S;
                                    str2 = S2;
                                    j3 = P4;
                                } else if (a2 != 1) {
                                    zzdx.f(C3894Oz0.Q, "Skipping unsupported emsg version: " + a2);
                                } else {
                                    long O6 = zzekVar7.O();
                                    long Q3 = zzekVar7.Q();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    j2 = zzeu.P(Q3, 1000000L, O6, roundingMode2);
                                    long P5 = zzeu.P(zzekVar7.O(), 1000L, O6, roundingMode2);
                                    long O7 = zzekVar7.O();
                                    String S3 = zzekVar7.S((char) 0);
                                    S3.getClass();
                                    String S4 = zzekVar7.S((char) 0);
                                    S4.getClass();
                                    O = O7;
                                    str = S3;
                                    str2 = S4;
                                    j3 = P5;
                                    j = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzekVar7.u()];
                                zzekVar7.h(bArr, 0, zzekVar7.u());
                                zzek zzekVar8 = new zzek(this.j.a(new zzagj(str, str2, j3, O, bArr)));
                                int u = zzekVar8.u();
                                for (zzaet zzaetVar : this.G) {
                                    zzekVar8.l(0);
                                    zzaetVar.d(zzekVar8, u);
                                }
                                if (j2 == C10323vs.b) {
                                    this.m.addLast(new zzait(j, true, u));
                                    this.v += u;
                                } else {
                                    ArrayDeque arrayDeque3 = this.m;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzaet zzaetVar2 : this.G) {
                                            zzaetVar2.c(j2, 1, u, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzait(j2, false, u));
                                        this.v += u;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    zzadoVar.G(i8);
                }
                l(zzadoVar.e());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0351, code lost:
        if ((com.google.android.gms.internal.ads.zzeu.P(r40, 1000000, r9, r46) + com.google.android.gms.internal.ads.zzeu.P(r2[0], 1000000, r7.c, r46)) < r7.e) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06c3, code lost:
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06c6, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j) throws zzaz {
        int i;
        List list;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z3;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((zzez) arrayDeque.peek()).b != j) {
                break;
            }
            zzez zzezVar = (zzez) arrayDeque.pop();
            int i24 = zzezVar.a;
            int i25 = 12;
            int i26 = 8;
            if (i24 == 1836019574) {
                zzs d = d(zzezVar.c);
                zzez b = zzezVar.b(AbstractC4501Vf.q0);
                b.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = b.c;
                int size = list2.size();
                long j2 = C10323vs.b;
                int i27 = 0;
                while (i27 < size) {
                    zzfa zzfaVar = (zzfa) list2.get(i27);
                    int i28 = zzfaVar.a;
                    if (i28 == 1953654136) {
                        zzek zzekVar = zzfaVar.b;
                        zzekVar.l(i25);
                        Pair create = Pair.create(Integer.valueOf(zzekVar.A()), new zzaiq(zzekVar.A() - 1, zzekVar.A(), zzekVar.A(), zzekVar.A()));
                        sparseArray.put(((Integer) create.first).intValue(), (zzaiq) create.second);
                    } else if (i28 == 1835362404) {
                        zzek zzekVar2 = zzfaVar.b;
                        zzekVar2.l(8);
                        j2 = zzaip.a(zzekVar2.A()) == 0 ? zzekVar2.O() : zzekVar2.Q();
                    }
                    i27++;
                    i25 = 12;
                }
                List f = zzaip.f(zzezVar, new zzaeb(), j2, d, (this.b & 16) != 0, false, new zzfur(this) { // from class: com.google.android.gms.internal.ads.zzair
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        return (zzajh) obj;
                    }
                });
                int size2 = f.size();
                SparseArray sparseArray2 = this.d;
                if (sparseArray2.size() == 0) {
                    String a = zzaiy.a(f);
                    for (int i29 = 0; i29 < size2; i29++) {
                        zzajk zzajkVar = (zzajk) f.get(i29);
                        zzajh zzajhVar = zzajkVar.a;
                        zzaet O = this.F.O(i29, zzajhVar.b);
                        long j3 = zzajhVar.e;
                        O.f(j3);
                        int i30 = zzajhVar.a;
                        sparseArray2.put(i30, new zzaiu(O, zzajkVar, m(sparseArray, i30), a));
                        this.x = Math.max(this.x, j3);
                    }
                    this.F.N();
                } else {
                    zzdc.f(sparseArray2.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzajk zzajkVar2 = (zzajk) f.get(i31);
                        int i32 = zzajkVar2.a.a;
                        ((zzaiu) sparseArray2.get(i32)).h(zzajkVar2, m(sparseArray, i32));
                    }
                }
            } else {
                int i33 = 16;
                if (i24 == 1836019558) {
                    SparseArray sparseArray3 = this.d;
                    int i34 = this.b;
                    byte[] bArr2 = this.h;
                    List list3 = zzezVar.d;
                    int size3 = list3.size();
                    int i35 = 0;
                    while (i35 < size3) {
                        zzez zzezVar2 = (zzez) list3.get(i35);
                        if (zzezVar2.a == 1953653094) {
                            zzfa c = zzezVar2.c(AbstractC4501Vf.c0);
                            c.getClass();
                            zzek zzekVar3 = c.b;
                            zzekVar3.l(i26);
                            int A = zzekVar3.A();
                            int i36 = zzaip.b;
                            zzaiu zzaiuVar = (zzaiu) sparseArray3.get(zzekVar3.A());
                            if (zzaiuVar == null) {
                                zzaiuVar = null;
                            } else {
                                if ((A & 1) != 0) {
                                    long Q = zzekVar3.Q();
                                    zzajj zzajjVar = zzaiuVar.b;
                                    zzajjVar.b = Q;
                                    zzajjVar.c = Q;
                                }
                                zzaiq zzaiqVar = zzaiuVar.e;
                                int A2 = (A & 2) != 0 ? zzekVar3.A() - 1 : zzaiqVar.a;
                                if ((A & 8) != 0) {
                                    i6 = zzekVar3.A();
                                } else {
                                    i6 = zzaiqVar.b;
                                }
                                if ((A & 16) != 0) {
                                    i7 = zzekVar3.A();
                                } else {
                                    i7 = zzaiqVar.c;
                                }
                                if ((A & 32) != 0) {
                                    i8 = zzekVar3.A();
                                } else {
                                    i8 = zzaiqVar.d;
                                }
                                zzaiuVar.b.a = new zzaiq(A2, i6, i7, i8);
                            }
                            if (zzaiuVar == null) {
                                i = i34;
                                list = list3;
                                i2 = size3;
                                i4 = i35;
                                i5 = i33;
                                i3 = 8;
                            } else {
                                zzajj zzajjVar2 = zzaiuVar.b;
                                long j4 = zzajjVar2.p;
                                boolean z4 = zzajjVar2.q;
                                zzaiuVar.i();
                                zzaiuVar.m = true;
                                zzfa c2 = zzezVar2.c(AbstractC4501Vf.b0);
                                if (c2 == null || (i34 & 2) != 0) {
                                    zzajjVar2.p = j4;
                                    zzajjVar2.q = z4;
                                } else {
                                    zzek zzekVar4 = c2.b;
                                    zzekVar4.l(8);
                                    zzajjVar2.p = zzaip.a(zzekVar4.A()) == 1 ? zzekVar4.Q() : zzekVar4.O();
                                    zzajjVar2.q = true;
                                }
                                List list4 = zzezVar2.c;
                                int size4 = list4.size();
                                i = i34;
                                int i37 = 0;
                                int i38 = 0;
                                int i39 = 0;
                                while (true) {
                                    i9 = AbstractC4501Vf.e0;
                                    if (i37 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzfa zzfaVar2 = (zzfa) list4.get(i37);
                                    int i40 = size3;
                                    if (zzfaVar2.a == 1953658222) {
                                        zzek zzekVar5 = zzfaVar2.b;
                                        zzekVar5.l(12);
                                        int J2 = zzekVar5.J();
                                        if (J2 > 0) {
                                            i39 += J2;
                                            i38++;
                                        }
                                    }
                                    i37++;
                                    size3 = i40;
                                    list3 = list5;
                                }
                                list = list3;
                                i2 = size3;
                                zzaiuVar.h = 0;
                                zzaiuVar.g = 0;
                                zzaiuVar.f = 0;
                                zzajjVar2.d = i38;
                                zzajjVar2.e = i39;
                                if (zzajjVar2.g.length < i38) {
                                    zzajjVar2.f = new long[i38];
                                    zzajjVar2.g = new int[i38];
                                }
                                if (zzajjVar2.h.length < i39) {
                                    int i41 = (i39 * 125) / 100;
                                    zzajjVar2.h = new int[i41];
                                    zzajjVar2.i = new long[i41];
                                    zzajjVar2.j = new boolean[i41];
                                    zzajjVar2.l = new boolean[i41];
                                }
                                int i42 = 0;
                                int i43 = 0;
                                int i44 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i42 >= size4) {
                                        break;
                                    }
                                    zzfa zzfaVar3 = (zzfa) list4.get(i42);
                                    if (zzfaVar3.a == i9) {
                                        int i45 = i43 + 1;
                                        zzek zzekVar6 = zzfaVar3.b;
                                        zzekVar6.l(8);
                                        int A3 = zzekVar6.A();
                                        i11 = i42;
                                        zzajh zzajhVar2 = zzaiuVar.d.a;
                                        int i46 = i43;
                                        zzaiq zzaiqVar2 = zzajjVar2.a;
                                        String str = zzeu.a;
                                        i12 = size4;
                                        zzajjVar2.g[i46] = zzekVar6.J();
                                        long[] jArr2 = zzajjVar2.f;
                                        i13 = i35;
                                        long j6 = zzajjVar2.b;
                                        jArr2[i46] = j6;
                                        if ((A3 & 1) != 0) {
                                            jArr2[i46] = j6 + zzekVar6.A();
                                        }
                                        boolean z5 = (A3 & 4) != 0;
                                        int i47 = zzaiqVar2.d;
                                        int A4 = z5 ? zzekVar6.A() : i47;
                                        boolean z6 = z5;
                                        int i48 = A3 & 256;
                                        int i49 = A3 & 512;
                                        int i50 = A3 & 1024;
                                        int i51 = A3 & 2048;
                                        long[] jArr3 = zzajhVar2.i;
                                        if (jArr3 != null) {
                                            i14 = i50;
                                            if (jArr3.length == 1 && (jArr = zzajhVar2.j) != null) {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    i15 = i47;
                                                } else {
                                                    i15 = i47;
                                                    long j8 = zzajhVar2.d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                }
                                                j5 = jArr[0];
                                                int[] iArr = zzajjVar2.h;
                                                long[] jArr4 = zzajjVar2.i;
                                                boolean[] zArr = zzajjVar2.j;
                                                boolean z7 = (zzajhVar2.b == 2 || (i & 1) == 0) ? false : true;
                                                i16 = zzajjVar2.g[i46] + i44;
                                                int i52 = i44;
                                                long j9 = zzajhVar2.c;
                                                long j10 = zzajjVar2.p;
                                                i17 = i52;
                                                while (i17 < i16) {
                                                    if (i48 != 0) {
                                                        z2 = z7;
                                                        i18 = zzekVar6.A();
                                                    } else {
                                                        z2 = z7;
                                                        i18 = zzaiqVar2.b;
                                                    }
                                                    b(i18);
                                                    if (i49 != 0) {
                                                        i19 = i17;
                                                        i20 = zzekVar6.A();
                                                    } else {
                                                        i19 = i17;
                                                        i20 = zzaiqVar2.c;
                                                    }
                                                    b(i20);
                                                    if (i14 != 0) {
                                                        i21 = zzekVar6.A();
                                                    } else {
                                                        if (i19 == 0) {
                                                            if (z6) {
                                                                i21 = A4;
                                                                i19 = 0;
                                                            } else {
                                                                i19 = 0;
                                                            }
                                                        }
                                                        i21 = i15;
                                                    }
                                                    if (i51 != 0) {
                                                        i22 = i20;
                                                        i23 = zzekVar6.A();
                                                    } else {
                                                        i22 = i20;
                                                        i23 = 0;
                                                    }
                                                    zzaiq zzaiqVar3 = zzaiqVar2;
                                                    long P = zzeu.P((i23 + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                                    jArr4[i19] = P;
                                                    if (!zzajjVar2.q) {
                                                        jArr4[i19] = P + zzaiuVar.d.h;
                                                    }
                                                    iArr[i19] = i22;
                                                    if (((i21 >> 16) & 1) == 0) {
                                                        if (!z2) {
                                                            z3 = true;
                                                        } else if (i19 == 0) {
                                                            z3 = true;
                                                            i19 = 0;
                                                        }
                                                        zArr[i19] = z3;
                                                        j10 += i18;
                                                        i17 = i19 + 1;
                                                        z7 = z2;
                                                        zzaiqVar2 = zzaiqVar3;
                                                    }
                                                    z3 = false;
                                                    zArr[i19] = z3;
                                                    j10 += i18;
                                                    i17 = i19 + 1;
                                                    z7 = z2;
                                                    zzaiqVar2 = zzaiqVar3;
                                                }
                                                zzajjVar2.p = j10;
                                                i44 = i16;
                                                i43 = i45;
                                            }
                                        } else {
                                            i14 = i50;
                                        }
                                        i15 = i47;
                                        int[] iArr2 = zzajjVar2.h;
                                        long[] jArr42 = zzajjVar2.i;
                                        boolean[] zArr2 = zzajjVar2.j;
                                        if (zzajhVar2.b == 2) {
                                        }
                                        i16 = zzajjVar2.g[i46] + i44;
                                        int i522 = i44;
                                        long j92 = zzajhVar2.c;
                                        long j102 = zzajjVar2.p;
                                        i17 = i522;
                                        while (i17 < i16) {
                                        }
                                        zzajjVar2.p = j102;
                                        i44 = i16;
                                        i43 = i45;
                                    } else {
                                        i11 = i42;
                                        i12 = size4;
                                        i13 = i35;
                                    }
                                    i42 = i11 + 1;
                                    size4 = i12;
                                    i35 = i13;
                                    i9 = AbstractC4501Vf.e0;
                                }
                                i4 = i35;
                                zzajh zzajhVar3 = zzaiuVar.d.a;
                                zzaiq zzaiqVar4 = zzajjVar2.a;
                                zzaiqVar4.getClass();
                                zzaji b2 = zzajhVar3.b(zzaiqVar4.a);
                                zzfa c3 = zzezVar2.c(AbstractC4501Vf.G0);
                                if (c3 != null) {
                                    b2.getClass();
                                    int i53 = b2.d;
                                    zzek zzekVar7 = c3.b;
                                    zzekVar7.l(8);
                                    if ((zzekVar7.A() & 1) == 1) {
                                        zzekVar7.m(8);
                                    }
                                    int G = zzekVar7.G();
                                    int J3 = zzekVar7.J();
                                    int i54 = zzajjVar2.e;
                                    if (J3 > i54) {
                                        throw zzaz.a("Saiz sample count " + J3 + " is greater than fragment sample count" + i54, null);
                                    }
                                    if (G == 0) {
                                        boolean[] zArr3 = zzajjVar2.l;
                                        i10 = 0;
                                        for (int i55 = 0; i55 < J3; i55++) {
                                            int G2 = zzekVar7.G();
                                            i10 += G2;
                                            zArr3[i55] = G2 > i53;
                                        }
                                        z = false;
                                    } else {
                                        boolean z8 = G > i53;
                                        i10 = G * J3;
                                        z = false;
                                        Arrays.fill(zzajjVar2.l, 0, J3, z8);
                                    }
                                    Arrays.fill(zzajjVar2.l, J3, zzajjVar2.e, z);
                                    if (i10 > 0) {
                                        zzajjVar2.a(i10);
                                    }
                                }
                                zzfa c4 = zzezVar2.c(AbstractC4501Vf.H0);
                                if (c4 != null) {
                                    zzek zzekVar8 = c4.b;
                                    zzekVar8.l(8);
                                    int A5 = zzekVar8.A();
                                    if ((A5 & 1) == 1) {
                                        zzekVar8.m(8);
                                    }
                                    int J4 = zzekVar8.J();
                                    if (J4 != 1) {
                                        throw zzaz.a("Unexpected saio entry count: " + J4, null);
                                    }
                                    zzajjVar2.c += zzaip.a(A5) == 0 ? zzekVar8.O() : zzekVar8.Q();
                                }
                                zzfa c5 = zzezVar2.c(AbstractC4501Vf.L0);
                                if (c5 != null) {
                                    k(c5.b, 0, zzajjVar2);
                                }
                                String str2 = b2 != null ? b2.b : null;
                                zzek zzekVar9 = null;
                                zzek zzekVar10 = null;
                                for (int i56 = 0; i56 < list4.size(); i56++) {
                                    zzfa zzfaVar4 = (zzfa) list4.get(i56);
                                    zzek zzekVar11 = zzfaVar4.b;
                                    int i57 = zzfaVar4.a;
                                    if (i57 == 1935828848) {
                                        zzekVar11.l(12);
                                        if (zzekVar11.A() == 1936025959) {
                                            zzekVar9 = zzekVar11;
                                        }
                                    } else if (i57 == 1936158820) {
                                        zzekVar11.l(12);
                                        if (zzekVar11.A() == 1936025959) {
                                            zzekVar10 = zzekVar11;
                                        }
                                    }
                                }
                                if (zzekVar9 != null && zzekVar10 != null) {
                                    zzekVar9.l(8);
                                    int a2 = zzaip.a(zzekVar9.A());
                                    zzekVar9.m(4);
                                    if (a2 == 1) {
                                        zzekVar9.m(4);
                                    }
                                    if (zzekVar9.A() == 1) {
                                        zzekVar10.l(8);
                                        int a3 = zzaip.a(zzekVar10.A());
                                        zzekVar10.m(4);
                                        if (a3 == 1) {
                                            if (zzekVar10.O() == 0) {
                                                throw zzaz.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (a3 >= 2) {
                                            zzekVar10.m(4);
                                        }
                                        if (zzekVar10.O() == 1) {
                                            zzekVar10.m(1);
                                            int G3 = zzekVar10.G();
                                            int i58 = (G3 & 240) >> 4;
                                            int i59 = G3 & 15;
                                            if (zzekVar10.G() == 1) {
                                                int G4 = zzekVar10.G();
                                                int i60 = i33;
                                                byte[] bArr3 = new byte[i60];
                                                zzekVar10.h(bArr3, 0, i60);
                                                if (G4 == 0) {
                                                    int G5 = zzekVar10.G();
                                                    byte[] bArr4 = new byte[G5];
                                                    zzekVar10.h(bArr4, 0, G5);
                                                    bArr = bArr4;
                                                } else {
                                                    bArr = null;
                                                }
                                                zzajjVar2.k = true;
                                                zzajjVar2.m = new zzaji(true, str2, G4, bArr3, i58, i59, bArr);
                                            }
                                        } else {
                                            throw zzaz.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzaz.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = list4.size();
                                for (int i61 = 0; i61 < size5; i61++) {
                                    zzfa zzfaVar5 = (zzfa) list4.get(i61);
                                    if (zzfaVar5.a == 1970628964) {
                                        zzek zzekVar12 = zzfaVar5.b;
                                        zzekVar12.l(8);
                                        zzekVar12.h(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, J)) {
                                            k(zzekVar12, 16, zzajjVar2);
                                        }
                                    }
                                }
                                i5 = 16;
                                i3 = 8;
                            }
                        } else {
                            i = i34;
                            list = list3;
                            i2 = size3;
                            i3 = i26;
                            i4 = i35;
                            i5 = i33;
                        }
                        i33 = i5;
                        i26 = i3;
                        i34 = i;
                        size3 = i2;
                        list3 = list;
                        i35 = i4 + 1;
                    }
                    zzs d2 = d(zzezVar.c);
                    if (d2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i62 = 0; i62 < size6; i62++) {
                            ((zzaiu) sparseArray3.valueAt(i62)).j(d2);
                        }
                    }
                    if (this.w != C10323vs.b) {
                        int size7 = sparseArray3.size();
                        for (int i63 = 0; i63 < size7; i63++) {
                            zzaiu zzaiuVar2 = (zzaiu) sparseArray3.valueAt(i63);
                            long j11 = this.w;
                            int i64 = zzaiuVar2.f;
                            while (true) {
                                zzajj zzajjVar3 = zzaiuVar2.b;
                                if (i64 < zzajjVar3.e && zzajjVar3.i[i64] <= j11) {
                                    if (zzajjVar3.j[i64]) {
                                        zzaiuVar2.i = i64;
                                    }
                                    i64++;
                                }
                            }
                        }
                        this.w = C10323vs.b;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzez) arrayDeque.peek()).d(zzezVar);
                }
            }
        }
    }

    public zzaiv(zzakj zzakjVar, int i, @InterfaceC11300zs1 zzer zzerVar, @InterfaceC11300zs1 zzajh zzajhVar, List list, @InterfaceC11300zs1 zzaet zzaetVar) {
        this.a = zzakjVar;
        this.b = i;
        this.c = Collections.unmodifiableList(list);
        this.j = new zzagk();
        this.k = new zzek(16);
        this.e = new zzek(zzfs.a);
        this.f = new zzek(6);
        this.g = new zzek();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new zzek(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.f204o = zzfyc.F();
        this.x = C10323vs.b;
        this.w = C10323vs.b;
        this.y = C10323vs.b;
        this.F = zzadq.h;
        this.G = new zzaet[0];
        this.H = new zzaet[0];
        this.n = new zzfw(new zzfv() { // from class: com.google.android.gms.internal.ads.zzais
            @Override // com.google.android.gms.internal.ads.zzfv
            public final void a(long j, zzek zzekVar) {
                zzada.a(j, zzekVar, zzaiv.this.H);
            }
        });
    }
}
