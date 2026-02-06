package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C10997yd1;
import o.C4128Rj1;
import o.C4731Xo;
import o.C5588cW;
import o.C8206nB;
import o.HS1;
import o.InterfaceC8557od0;
import o.VN2;

/* loaded from: classes2.dex */
public final class zzaho {
    public byte[] P;
    public zzaeu V;
    public boolean W;
    public zzaet Z;
    public boolean a;
    public int a0;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public byte[] j;
    public zzaes k;
    public byte[] l;
    public zzs m;
    public int n = -1;

    /* renamed from: o */
    public int f201o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = 0;
    public int t = -1;
    public float u = 0.0f;
    public float v = 0.0f;
    public float w = 0.0f;
    public byte[] x = null;
    public int y = -1;
    public boolean z = false;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = 8000;
    public long T = 0;
    public long U = 0;
    public boolean X = true;
    public String Y = "eng";

    public static Pair f(zzek zzekVar) throws zzaz {
        try {
            zzekVar.m(16);
            long M = zzekVar.M();
            if (M == 1482049860) {
                return new Pair(C4128Rj1.u, null);
            }
            if (M == 859189832) {
                return new Pair(C4128Rj1.i, null);
            }
            if (M == 826496599) {
                int w = zzekVar.w() + 20;
                byte[] n = zzekVar.n();
                while (true) {
                    int length = n.length;
                    if (w < length - 4) {
                        int i = w + 1;
                        if (n[w] == 0 && n[i] == 0 && n[w + 2] == 1 && n[w + 3] == 15) {
                            return new Pair(C4128Rj1.t, Collections.singletonList(Arrays.copyOfRange(n, w, length)));
                        }
                        w = i;
                    } else {
                        throw zzaz.a("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzdx.f(C10997yd1.h0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(C4128Rj1.D, null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.a("Error parsing FourCC private data", null);
        }
    }

    public static List g(byte[] bArr) throws zzaz {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    int i5 = bArr[i4];
                    i4++;
                    i = i5 & 255;
                    if (i != 255) {
                        break;
                    }
                    i3 += 255;
                }
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    int i8 = bArr[i4];
                    i4++;
                    i2 = i8 & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                }
                int i9 = i7 + i2;
                if (bArr[i4] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i4, bArr2, 0, i6);
                    int i10 = i4 + i6;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzaz.a("Error parsing vorbis codec private", null);
                    }
                    throw zzaz.a("Error parsing vorbis codec private", null);
                }
                throw zzaz.a("Error parsing vorbis codec private", null);
            }
            throw zzaz.a("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.a("Error parsing vorbis codec private", null);
        }
    }

    public static boolean h(zzek zzekVar) throws zzaz {
        UUID uuid;
        UUID uuid2;
        try {
            int E = zzekVar.E();
            if (E == 1) {
                return true;
            }
            if (E == 65534) {
                zzekVar.l(24);
                long N = zzekVar.N();
                uuid = zzahq.j0;
                if (N == uuid.getMostSignificantBits()) {
                    long N2 = zzekVar.N();
                    uuid2 = zzahq.j0;
                    if (N2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.a("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:466:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x05f2  */
    @InterfaceC8557od0({"this.output"})
    @HS1({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(zzadq zzadqVar, int i) throws zzaz {
        char c;
        List G;
        List list;
        String str;
        String str2;
        int i2;
        int i3;
        byte[] bArr;
        String str3;
        int i4;
        int i5;
        int i6;
        Map map;
        Map map2;
        int i7;
        Map map3;
        zzew a;
        String str4 = this.c;
        int i8 = 4;
        int i9 = 0;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals(C10997yd1.u0)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals(C10997yd1.s0)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals(C10997yd1.L0)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals(C10997yd1.G0)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals(C10997yd1.z0)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals(C10997yd1.C0)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals(C10997yd1.D0)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals(C10997yd1.x0)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals(C10997yd1.U0)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals(C10997yd1.t0)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals(C10997yd1.v0)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals(C10997yd1.S0)) {
                    c = C5588cW.p;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals(C10997yd1.J0)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals(C10997yd1.B0)) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals(C10997yd1.E0)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals(C10997yd1.H0)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals(C10997yd1.q0)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals(C10997yd1.o0)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals(C10997yd1.p0)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals(C10997yd1.T0)) {
                    c = VN2.b;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals(C10997yd1.y0)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals(C10997yd1.I0)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals(C10997yd1.O0)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals(C10997yd1.N0)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals(C10997yd1.M0)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals(C10997yd1.Q0)) {
                    c = C5588cW.n;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals(C10997yd1.w0)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals(C10997yd1.R0)) {
                    c = C5588cW.f706o;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals(C10997yd1.P0)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals(C10997yd1.r0)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals(C10997yd1.F0)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals(C10997yd1.K0)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals(C10997yd1.A0)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str5 = C4128Rj1.N;
        zzk zzkVar = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        byte[] bArr2 = null;
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null && (a = zzew.a(new zzek(this.P))) != null) {
                    str2 = a.a;
                    str5 = C4128Rj1.w;
                }
                str3 = str5;
                int i10 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar = new zzx();
                if (!zzay.h(str3)) {
                    zzxVar.b(this.Q);
                    zzxVar.F(this.S);
                    zzxVar.x(i8);
                    i4 = 1;
                } else if (zzay.j(str3)) {
                    if (this.s == 0) {
                        int i11 = this.q;
                        i5 = -1;
                        if (i11 == -1) {
                            i11 = this.n;
                        }
                        this.q = i11;
                        int i12 = this.r;
                        if (i12 == -1) {
                            i12 = this.f201o;
                        }
                        this.r = i12;
                    } else {
                        i5 = -1;
                    }
                    float f = (this.q == i5 || (i7 = this.r) == i5) ? -1.0f : (this.f201o * i6) / (this.n * i7);
                    if (this.z) {
                        if (this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f && this.N != -1.0f && this.O != -1.0f) {
                            bArr2 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.L * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.M * 50000.0f) + 0.5f));
                            order.putShort((short) (this.N + 0.5f));
                            order.putShort((short) (this.O + 0.5f));
                            order.putShort((short) this.D);
                            order.putShort((short) this.E);
                        }
                        zzi zziVar = new zzi();
                        zziVar.c(this.A);
                        zziVar.b(this.C);
                        zziVar.d(this.B);
                        zziVar.e(bArr2);
                        zziVar.f(this.p);
                        zziVar.a(this.p);
                        zzkVar = zziVar.g();
                    }
                    if (this.b != null) {
                        map = zzahq.k0;
                        if (map.containsKey(this.b)) {
                            map2 = zzahq.k0;
                            i5 = ((Integer) map2.get(this.b)).intValue();
                        }
                    }
                    if (this.t == 0 && Float.compare(this.u, 0.0f) == 0 && Float.compare(this.v, 0.0f) == 0) {
                        if (Float.compare(this.w, 0.0f) != 0) {
                            if (Float.compare(this.w, 90.0f) == 0) {
                                i9 = 90;
                            } else if (Float.compare(this.w, -180.0f) == 0 || Float.compare(this.w, 180.0f) == 0) {
                                i9 = 180;
                            } else if (Float.compare(this.w, -90.0f) == 0) {
                                i9 = C4731Xo.d1;
                            }
                        }
                        zzxVar.J(this.n);
                        zzxVar.m(this.f201o);
                        zzxVar.z(f);
                        zzxVar.D(i9);
                        zzxVar.B(this.x);
                        zzxVar.H(this.y);
                        zzxVar.d(zzkVar);
                        i4 = 2;
                    }
                    i9 = i5;
                    zzxVar.J(this.n);
                    zzxVar.m(this.f201o);
                    zzxVar.z(f);
                    zzxVar.D(i9);
                    zzxVar.B(this.x);
                    zzxVar.H(this.y);
                    zzxVar.d(zzkVar);
                    i4 = 2;
                } else if (!C4128Rj1.z0.equals(str3) && !C4128Rj1.n0.equals(str3) && !C4128Rj1.m0.equals(str3) && !C4128Rj1.F0.equals(str3) && !C4128Rj1.G0.equals(str3) && !C4128Rj1.K0.equals(str3)) {
                    throw zzaz.a("Unexpected MIME type.", null);
                } else {
                    i4 = 3;
                }
                if (this.b != null) {
                    map3 = zzahq.k0;
                    if (!map3.containsKey(this.b)) {
                        zzxVar.q(this.b);
                    }
                }
                zzxVar.n(i);
                zzxVar.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar.E(str3);
                zzxVar.t(i2);
                zzxVar.s(this.Y);
                zzxVar.G(i10);
                zzxVar.p(G);
                zzxVar.c(str2);
                zzxVar.h(this.m);
                zzz K = zzxVar.K();
                zzaet O = zzadqVar.O(this.d, i4);
                this.Z = O;
                O.e(K);
                return;
            case 1:
                byte[] bArr3 = this.l;
                G = bArr3 == null ? null : zzfyc.G(bArr3);
                str5 = C4128Rj1.m;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                    str2 = a.a;
                    str5 = C4128Rj1.w;
                    break;
                }
                str3 = str5;
                int i102 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2.n(i);
                zzxVar2.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2.E(str3);
                zzxVar2.t(i2);
                zzxVar2.s(this.Y);
                zzxVar2.G(i102);
                zzxVar2.p(G);
                zzxVar2.c(str2);
                zzxVar2.h(this.m);
                zzz K2 = zzxVar2.K();
                zzaet O2 = zzadqVar.O(this.d, i4);
                this.Z = O2;
                O2.e(K2);
                return;
            case 2:
                byte[] bArr4 = this.l;
                G = bArr4 == null ? null : zzfyc.G(bArr4);
                str5 = C4128Rj1.n;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22.n(i);
                zzxVar22.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22.E(str3);
                zzxVar22.t(i2);
                zzxVar22.s(this.Y);
                zzxVar22.G(i1022);
                zzxVar22.p(G);
                zzxVar22.c(str2);
                zzxVar22.h(this.m);
                zzz K22 = zzxVar22.K();
                zzaet O22 = zzadqVar.O(this.d, i4);
                this.Z = O22;
                O22.e(K22);
                return;
            case 3:
                str5 = C4128Rj1.s;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222.n(i);
                zzxVar222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222.E(str3);
                zzxVar222.t(i2);
                zzxVar222.s(this.Y);
                zzxVar222.G(i10222);
                zzxVar222.p(G);
                zzxVar222.c(str2);
                zzxVar222.h(this.m);
                zzz K222 = zzxVar222.K();
                zzaet O222 = zzadqVar.O(this.d, i4);
                this.Z = O222;
                O222.e(K222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.l;
                G = bArr5 == null ? null : Collections.singletonList(bArr5);
                str5 = C4128Rj1.p;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222.n(i);
                zzxVar2222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222.E(str3);
                zzxVar2222.t(i2);
                zzxVar2222.s(this.Y);
                zzxVar2222.G(i102222);
                zzxVar2222.p(G);
                zzxVar2222.c(str2);
                zzxVar2222.h(this.m);
                zzz K2222 = zzxVar2222.K();
                zzaet O2222 = zzadqVar.O(this.d, i4);
                this.Z = O2222;
                O2222.e(K2222);
                return;
            case 7:
                zzacs a2 = zzacs.a(new zzek(i(this.c)));
                list = a2.a;
                this.a0 = a2.b;
                str = a2.l;
                str5 = "video/avc";
                str2 = str;
                G = list;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222.n(i);
                zzxVar22222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222.E(str3);
                zzxVar22222.t(i2);
                zzxVar22222.s(this.Y);
                zzxVar22222.G(i1022222);
                zzxVar22222.p(G);
                zzxVar22222.c(str2);
                zzxVar22222.h(this.m);
                zzz K22222 = zzxVar22222.K();
                zzaet O22222 = zzadqVar.O(this.d, i4);
                this.Z = O22222;
                O22222.e(K22222);
                return;
            case '\b':
                zzaec a3 = zzaec.a(new zzek(i(this.c)));
                list = a3.a;
                this.a0 = a3.b;
                str = a3.l;
                str5 = C4128Rj1.k;
                str2 = str;
                G = list;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222.n(i);
                zzxVar222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222.E(str3);
                zzxVar222222.t(i2);
                zzxVar222222.s(this.Y);
                zzxVar222222.G(i10222222);
                zzxVar222222.p(G);
                zzxVar222222.c(str2);
                zzxVar222222.h(this.m);
                zzz K222222 = zzxVar222222.K();
                zzaet O222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222;
                O222222.e(K222222);
                return;
            case '\t':
                Pair f2 = f(new zzek(i(this.c)));
                str5 = (String) f2.first;
                G = (List) f2.second;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222.n(i);
                zzxVar2222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222.E(str3);
                zzxVar2222222.t(i2);
                zzxVar2222222.s(this.Y);
                zzxVar2222222.G(i102222222);
                zzxVar2222222.p(G);
                zzxVar2222222.c(str2);
                zzxVar2222222.h(this.m);
                zzz K2222222 = zzxVar2222222.K();
                zzaet O2222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222;
                O2222222.e(K2222222);
                return;
            case '\n':
                str5 = C4128Rj1.D;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222.n(i);
                zzxVar22222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222.E(str3);
                zzxVar22222222.t(i2);
                zzxVar22222222.s(this.Y);
                zzxVar22222222.G(i1022222222);
                zzxVar22222222.p(G);
                zzxVar22222222.c(str2);
                zzxVar22222222.h(this.m);
                zzz K22222222 = zzxVar22222222.K();
                zzaet O22222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222;
                O22222222.e(K22222222);
                return;
            case 11:
                G = g(i(str4));
                i2 = 8192;
                str5 = "audio/vorbis";
                str2 = null;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222.n(i);
                zzxVar222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222.E(str3);
                zzxVar222222222.t(i2);
                zzxVar222222222.s(this.Y);
                zzxVar222222222.G(i10222222222);
                zzxVar222222222.p(G);
                zzxVar222222222.c(str2);
                zzxVar222222222.h(this.m);
                zzz K222222222 = zzxVar222222222.K();
                zzaet O222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222;
                O222222222.e(K222222222);
                return;
            case '\f':
                G = new ArrayList(3);
                G.add(i(this.c));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                G.add(allocate.order(byteOrder).putLong(this.T).array());
                G.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.U).array());
                i2 = C10997yd1.W0;
                str5 = C4128Rj1.a0;
                str2 = null;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222.n(i);
                zzxVar2222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222.E(str3);
                zzxVar2222222222.t(i2);
                zzxVar2222222222.s(this.Y);
                zzxVar2222222222.G(i102222222222);
                zzxVar2222222222.p(G);
                zzxVar2222222222.c(str2);
                zzxVar2222222222.h(this.m);
                zzz K2222222222 = zzxVar2222222222.K();
                zzaet O2222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222;
                O2222222222.e(K2222222222);
                return;
            case '\r':
                G = Collections.singletonList(i(str4));
                zzaci a4 = zzack.a(this.l);
                this.S = a4.a;
                this.Q = a4.b;
                str5 = "audio/mp4a-latm";
                str2 = a4.c;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222.n(i);
                zzxVar22222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222.E(str3);
                zzxVar22222222222.t(i2);
                zzxVar22222222222.s(this.Y);
                zzxVar22222222222.G(i1022222222222);
                zzxVar22222222222.p(G);
                zzxVar22222222222.c(str2);
                zzxVar22222222222.h(this.m);
                zzz K22222222222 = zzxVar22222222222.K();
                zzaet O22222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222;
                O22222222222.e(K22222222222);
                return;
            case 14:
                i3 = 4096;
                str5 = C4128Rj1.K;
                i2 = i3;
                G = null;
                str2 = null;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222.n(i);
                zzxVar222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222.E(str3);
                zzxVar222222222222.t(i2);
                zzxVar222222222222.s(this.Y);
                zzxVar222222222222.G(i10222222222222);
                zzxVar222222222222.p(G);
                zzxVar222222222222.c(str2);
                zzxVar222222222222.h(this.m);
                zzz K222222222222 = zzxVar222222222222.K();
                zzaet O222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222;
                O222222222222.e(K222222222222);
                return;
            case 15:
                i3 = 4096;
                str5 = C4128Rj1.I;
                i2 = i3;
                G = null;
                str2 = null;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222.n(i);
                zzxVar2222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222.E(str3);
                zzxVar2222222222222.t(i2);
                zzxVar2222222222222.s(this.Y);
                zzxVar2222222222222.G(i102222222222222);
                zzxVar2222222222222.p(G);
                zzxVar2222222222222.c(str2);
                zzxVar2222222222222.h(this.m);
                zzz K2222222222222 = zzxVar2222222222222.K();
                zzaet O2222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222;
                O2222222222222.e(K2222222222222);
                return;
            case 16:
                str5 = C4128Rj1.Q;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222222.n(i);
                zzxVar22222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222222.E(str3);
                zzxVar22222222222222.t(i2);
                zzxVar22222222222222.s(this.Y);
                zzxVar22222222222222.G(i1022222222222222);
                zzxVar22222222222222.p(G);
                zzxVar22222222222222.c(str2);
                zzxVar22222222222222.h(this.m);
                zzz K22222222222222 = zzxVar22222222222222.K();
                zzaet O22222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222222;
                O22222222222222.e(K22222222222222);
                return;
            case 17:
                str5 = C4128Rj1.R;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222.n(i);
                zzxVar222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222.E(str3);
                zzxVar222222222222222.t(i2);
                zzxVar222222222222222.s(this.Y);
                zzxVar222222222222222.G(i10222222222222222);
                zzxVar222222222222222.p(G);
                zzxVar222222222222222.c(str2);
                zzxVar222222222222222.h(this.m);
                zzz K222222222222222 = zzxVar222222222222222.K();
                zzaet O222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222;
                O222222222222222.e(K222222222222222);
                return;
            case 18:
                this.V = new zzaeu();
                str5 = C4128Rj1.U;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222222.n(i);
                zzxVar2222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222222.E(str3);
                zzxVar2222222222222222.t(i2);
                zzxVar2222222222222222.s(this.Y);
                zzxVar2222222222222222.G(i102222222222222222);
                zzxVar2222222222222222.p(G);
                zzxVar2222222222222222.c(str2);
                zzxVar2222222222222222.h(this.m);
                zzz K2222222222222222 = zzxVar2222222222222222.K();
                zzaet O2222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222222;
                O2222222222222222.e(K2222222222222222);
                return;
            case 19:
            case 20:
                str5 = C4128Rj1.V;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222222222.n(i);
                zzxVar22222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222222222.E(str3);
                zzxVar22222222222222222.t(i2);
                zzxVar22222222222222222.s(this.Y);
                zzxVar22222222222222222.G(i1022222222222222222);
                zzxVar22222222222222222.p(G);
                zzxVar22222222222222222.c(str2);
                zzxVar22222222222222222.h(this.m);
                zzz K22222222222222222 = zzxVar22222222222222222.K();
                zzaet O22222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222222222;
                O22222222222222222.e(K22222222222222222);
                return;
            case 21:
                str5 = C4128Rj1.W;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222222.n(i);
                zzxVar222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222222.E(str3);
                zzxVar222222222222222222.t(i2);
                zzxVar222222222222222222.s(this.Y);
                zzxVar222222222222222222.G(i10222222222222222222);
                zzxVar222222222222222222.p(G);
                zzxVar222222222222222222.c(str2);
                zzxVar222222222222222222.h(this.m);
                zzz K222222222222222222 = zzxVar222222222222222222.K();
                zzaet O222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222222;
                O222222222222222222.e(K222222222222222222);
                return;
            case 22:
                G = Collections.singletonList(i(str4));
                str5 = C4128Rj1.e0;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222222222.n(i);
                zzxVar2222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222222222.E(str3);
                zzxVar2222222222222222222.t(i2);
                zzxVar2222222222222222222.s(this.Y);
                zzxVar2222222222222222222.G(i102222222222222222222);
                zzxVar2222222222222222222.p(G);
                zzxVar2222222222222222222.c(str2);
                zzxVar2222222222222222222.h(this.m);
                zzz K2222222222222222222 = zzxVar2222222222222222222.K();
                zzaet O2222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222222222;
                O2222222222222222222.e(K2222222222222222222);
                return;
            case 23:
                if (h(new zzek(i(this.c)))) {
                    i8 = zzeu.I(this.R);
                    if (i8 == 0) {
                        zzdx.f(C10997yd1.h0, "Unsupported PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                    }
                    G = null;
                    str2 = null;
                    i2 = -1;
                    if (this.P != null) {
                    }
                    str3 = str5;
                    int i1022222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                    zzx zzxVar22222222222222222222 = new zzx();
                    if (!zzay.h(str3)) {
                    }
                    if (this.b != null) {
                    }
                    zzxVar22222222222222222222.n(i);
                    zzxVar22222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                    zzxVar22222222222222222222.E(str3);
                    zzxVar22222222222222222222.t(i2);
                    zzxVar22222222222222222222.s(this.Y);
                    zzxVar22222222222222222222.G(i1022222222222222222222);
                    zzxVar22222222222222222222.p(G);
                    zzxVar22222222222222222222.c(str2);
                    zzxVar22222222222222222222.h(this.m);
                    zzz K22222222222222222222 = zzxVar22222222222222222222.K();
                    zzaet O22222222222222222222 = zzadqVar.O(this.d, i4);
                    this.Z = O22222222222222222222;
                    O22222222222222222222.e(K22222222222222222222);
                    return;
                }
                zzdx.f(C10997yd1.h0, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                G = null;
                str2 = null;
                str5 = C4128Rj1.l0;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222222222.n(i);
                zzxVar222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222222222.E(str3);
                zzxVar222222222222222222222.t(i2);
                zzxVar222222222222222222222.s(this.Y);
                zzxVar222222222222222222222.G(i10222222222222222222222);
                zzxVar222222222222222222222.p(G);
                zzxVar222222222222222222222.c(str2);
                zzxVar222222222222222222222.h(this.m);
                zzz K222222222222222222222 = zzxVar222222222222222222222.K();
                zzaet O222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222222222;
                O222222222222222222222.e(K222222222222222222222);
                return;
            case 24:
                i8 = zzeu.I(this.R);
                if (i8 == 0) {
                    zzdx.f(C10997yd1.h0, "Unsupported little endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                    G = null;
                    str2 = null;
                    str5 = C4128Rj1.l0;
                    i2 = -1;
                    i8 = -1;
                    if (this.P != null) {
                    }
                    str3 = str5;
                    int i102222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                    zzx zzxVar2222222222222222222222 = new zzx();
                    if (!zzay.h(str3)) {
                    }
                    if (this.b != null) {
                    }
                    zzxVar2222222222222222222222.n(i);
                    zzxVar2222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                    zzxVar2222222222222222222222.E(str3);
                    zzxVar2222222222222222222222.t(i2);
                    zzxVar2222222222222222222222.s(this.Y);
                    zzxVar2222222222222222222222.G(i102222222222222222222222);
                    zzxVar2222222222222222222222.p(G);
                    zzxVar2222222222222222222222.c(str2);
                    zzxVar2222222222222222222222.h(this.m);
                    zzz K2222222222222222222222 = zzxVar2222222222222222222222.K();
                    zzaet O2222222222222222222222 = zzadqVar.O(this.d, i4);
                    this.Z = O2222222222222222222222;
                    O2222222222222222222222.e(K2222222222222222222222);
                    return;
                }
                G = null;
                str2 = null;
                i2 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222222222222222.n(i);
                zzxVar22222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222222222222222.E(str3);
                zzxVar22222222222222222222222.t(i2);
                zzxVar22222222222222222222222.s(this.Y);
                zzxVar22222222222222222222222.G(i1022222222222222222222222);
                zzxVar22222222222222222222222.p(G);
                zzxVar22222222222222222222222.c(str2);
                zzxVar22222222222222222222222.h(this.m);
                zzz K22222222222222222222222 = zzxVar22222222222222222222222.K();
                zzaet O22222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222222222222222;
                O22222222222222222222222.e(K22222222222222222222222);
                return;
            case 25:
                int i13 = this.R;
                if (i13 == 8) {
                    i8 = 3;
                } else if (i13 == 16) {
                    i8 = 268435456;
                } else if (i13 == 24) {
                    i8 = 1342177280;
                } else if (i13 != 32) {
                    zzdx.f(C10997yd1.h0, "Unsupported big endian PCM bit depth: " + i13 + ". Setting mimeType to audio/x-unknown");
                    G = null;
                    str2 = null;
                    str5 = C4128Rj1.l0;
                    i2 = -1;
                    i8 = -1;
                    if (this.P != null) {
                    }
                    str3 = str5;
                    int i10222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                    zzx zzxVar222222222222222222222222 = new zzx();
                    if (!zzay.h(str3)) {
                    }
                    if (this.b != null) {
                    }
                    zzxVar222222222222222222222222.n(i);
                    zzxVar222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                    zzxVar222222222222222222222222.E(str3);
                    zzxVar222222222222222222222222.t(i2);
                    zzxVar222222222222222222222222.s(this.Y);
                    zzxVar222222222222222222222222.G(i10222222222222222222222222);
                    zzxVar222222222222222222222222.p(G);
                    zzxVar222222222222222222222222.c(str2);
                    zzxVar222222222222222222222222.h(this.m);
                    zzz K222222222222222222222222 = zzxVar222222222222222222222222.K();
                    zzaet O222222222222222222222222 = zzadqVar.O(this.d, i4);
                    this.Z = O222222222222222222222222;
                    O222222222222222222222222.e(K222222222222222222222222);
                    return;
                } else {
                    i8 = 1610612736;
                }
                G = null;
                str2 = null;
                i2 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222222222222222.n(i);
                zzxVar2222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222222222222222.E(str3);
                zzxVar2222222222222222222222222.t(i2);
                zzxVar2222222222222222222222222.s(this.Y);
                zzxVar2222222222222222222222222.G(i102222222222222222222222222);
                zzxVar2222222222222222222222222.p(G);
                zzxVar2222222222222222222222222.c(str2);
                zzxVar2222222222222222222222222.h(this.m);
                zzz K2222222222222222222222222 = zzxVar2222222222222222222222222.K();
                zzaet O2222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222222222222222;
                O2222222222222222222222222.e(K2222222222222222222222222);
                return;
            case 26:
                int i14 = this.R;
                if (i14 != 32) {
                    zzdx.f(C10997yd1.h0, "Unsupported floating point PCM bit depth: " + i14 + ". Setting mimeType to audio/x-unknown");
                    G = null;
                    str2 = null;
                    str5 = C4128Rj1.l0;
                    i2 = -1;
                    i8 = -1;
                    if (this.P != null) {
                    }
                    str3 = str5;
                    int i1022222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                    zzx zzxVar22222222222222222222222222 = new zzx();
                    if (!zzay.h(str3)) {
                    }
                    if (this.b != null) {
                    }
                    zzxVar22222222222222222222222222.n(i);
                    zzxVar22222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                    zzxVar22222222222222222222222222.E(str3);
                    zzxVar22222222222222222222222222.t(i2);
                    zzxVar22222222222222222222222222.s(this.Y);
                    zzxVar22222222222222222222222222.G(i1022222222222222222222222222);
                    zzxVar22222222222222222222222222.p(G);
                    zzxVar22222222222222222222222222.c(str2);
                    zzxVar22222222222222222222222222.h(this.m);
                    zzz K22222222222222222222222222 = zzxVar22222222222222222222222222.K();
                    zzaet O22222222222222222222222222 = zzadqVar.O(this.d, i4);
                    this.Z = O22222222222222222222222222;
                    O22222222222222222222222222.e(K22222222222222222222222222);
                    return;
                }
                G = null;
                str2 = null;
                i2 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222222222222222.n(i);
                zzxVar222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222222222222222.E(str3);
                zzxVar222222222222222222222222222.t(i2);
                zzxVar222222222222222222222222222.s(this.Y);
                zzxVar222222222222222222222222222.G(i10222222222222222222222222222);
                zzxVar222222222222222222222222222.p(G);
                zzxVar222222222222222222222222222.c(str2);
                zzxVar222222222222222222222222222.h(this.m);
                zzz K222222222222222222222222222 = zzxVar222222222222222222222222222.K();
                zzaet O222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222222222222222;
                O222222222222222222222222222.e(K222222222222222222222222222);
                return;
            case 27:
                str5 = C4128Rj1.z0;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222222222222222222.n(i);
                zzxVar2222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222222222222222222.E(str3);
                zzxVar2222222222222222222222222222.t(i2);
                zzxVar2222222222222222222222222222.s(this.Y);
                zzxVar2222222222222222222222222222.G(i102222222222222222222222222222);
                zzxVar2222222222222222222222222222.p(G);
                zzxVar2222222222222222222222222222.c(str2);
                zzxVar2222222222222222222222222222.h(this.m);
                zzz K2222222222222222222222222222 = zzxVar2222222222222222222222222222.K();
                zzaet O2222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222222222222222222;
                O2222222222222222222222222222.e(K2222222222222222222222222222);
                return;
            case 28:
                bArr = zzahq.g0;
                G = zzfyc.H(bArr, i(this.c));
                str5 = C4128Rj1.n0;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222222222222222222222.n(i);
                zzxVar22222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222222222222222222222.E(str3);
                zzxVar22222222222222222222222222222.t(i2);
                zzxVar22222222222222222222222222222.s(this.Y);
                zzxVar22222222222222222222222222222.G(i1022222222222222222222222222222);
                zzxVar22222222222222222222222222222.p(G);
                zzxVar22222222222222222222222222222.c(str2);
                zzxVar22222222222222222222222222222.h(this.m);
                zzz K22222222222222222222222222222 = zzxVar22222222222222222222222222222.K();
                zzaet O22222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222222222222222222222;
                O22222222222222222222222222222.e(K22222222222222222222222222222);
                return;
            case 29:
                str5 = C4128Rj1.m0;
                G = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222222222222222222.n(i);
                zzxVar222222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222222222222222222.E(str3);
                zzxVar222222222222222222222222222222.t(i2);
                zzxVar222222222222222222222222222222.s(this.Y);
                zzxVar222222222222222222222222222222.G(i10222222222222222222222222222222);
                zzxVar222222222222222222222222222222.p(G);
                zzxVar222222222222222222222222222222.c(str2);
                zzxVar222222222222222222222222222222.h(this.m);
                zzz K222222222222222222222222222222 = zzxVar222222222222222222222222222222.K();
                zzaet O222222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222222222222222222;
                O222222222222222222222222222222.e(K222222222222222222222222222222);
                return;
            case 30:
                G = zzfyc.G(i(str4));
                str2 = null;
                str5 = C4128Rj1.F0;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i102222222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar2222222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar2222222222222222222222222222222.n(i);
                zzxVar2222222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar2222222222222222222222222222222.E(str3);
                zzxVar2222222222222222222222222222222.t(i2);
                zzxVar2222222222222222222222222222222.s(this.Y);
                zzxVar2222222222222222222222222222222.G(i102222222222222222222222222222222);
                zzxVar2222222222222222222222222222222.p(G);
                zzxVar2222222222222222222222222222222.c(str2);
                zzxVar2222222222222222222222222222222.h(this.m);
                zzz K2222222222222222222222222222222 = zzxVar2222222222222222222222222222222.K();
                zzaet O2222222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O2222222222222222222222222222222;
                O2222222222222222222222222222222.e(K2222222222222222222222222222222);
                return;
            case 31:
                G = null;
                str2 = null;
                str5 = C4128Rj1.G0;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i1022222222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar22222222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar22222222222222222222222222222222.n(i);
                zzxVar22222222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar22222222222222222222222222222222.E(str3);
                zzxVar22222222222222222222222222222222.t(i2);
                zzxVar22222222222222222222222222222222.s(this.Y);
                zzxVar22222222222222222222222222222222.G(i1022222222222222222222222222222222);
                zzxVar22222222222222222222222222222222.p(G);
                zzxVar22222222222222222222222222222222.c(str2);
                zzxVar22222222222222222222222222222222.h(this.m);
                zzz K22222222222222222222222222222222 = zzxVar22222222222222222222222222222222.K();
                zzaet O22222222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O22222222222222222222222222222222;
                O22222222222222222222222222222222.e(K22222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr6 = new byte[4];
                System.arraycopy(i(str4), 0, bArr6, 0, 4);
                G = zzfyc.G(bArr6);
                str5 = C4128Rj1.K0;
                str2 = null;
                i2 = -1;
                i8 = -1;
                if (this.P != null) {
                }
                str3 = str5;
                int i10222222222222222222222222222222222 = (this.X ? 1 : 0) | (true == this.W ? 0 : 2);
                zzx zzxVar222222222222222222222222222222222 = new zzx();
                if (!zzay.h(str3)) {
                }
                if (this.b != null) {
                }
                zzxVar222222222222222222222222222222222.n(i);
                zzxVar222222222222222222222222222222222.e(true == this.a ? C4128Rj1.g : "video/webm");
                zzxVar222222222222222222222222222222222.E(str3);
                zzxVar222222222222222222222222222222222.t(i2);
                zzxVar222222222222222222222222222222222.s(this.Y);
                zzxVar222222222222222222222222222222222.G(i10222222222222222222222222222222222);
                zzxVar222222222222222222222222222222222.p(G);
                zzxVar222222222222222222222222222222222.c(str2);
                zzxVar222222222222222222222222222222222.h(this.m);
                zzz K222222222222222222222222222222222 = zzxVar222222222222222222222222222222222.K();
                zzaet O222222222222222222222222222222222 = zzadqVar.O(this.d, i4);
                this.Z = O222222222222222222222222222222222;
                O222222222222222222222222222222222.e(K222222222222222222222222222222222);
                return;
            default:
                throw zzaz.a("Unrecognized codec identifier.", null);
        }
    }

    @InterfaceC8557od0({"codecPrivate"})
    public final byte[] i(String str) throws zzaz {
        byte[] bArr = this.l;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
