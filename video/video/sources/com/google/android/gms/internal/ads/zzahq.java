package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import o.C10323vs;
import o.C10997yd1;
import o.C3307Iz;
import o.C4731Xo;
import o.C5588cW;
import o.C8206nB;
import o.HS1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC8557od0;
import o.VN2;

/* loaded from: classes2.dex */
public final class zzahq implements zzadn {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    @InterfaceC11300zs1
    public zzdy E;
    @InterfaceC11300zs1
    public zzdy F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final zzahs a;
    public int a0;
    public final SparseArray b;
    public byte b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public zzadq d0;
    public final zzakj e;
    public final zzahl e0;
    public final zzek f;
    public final zzek g;
    public final zzek h;
    public final zzek i;
    public final zzek j;
    public final zzek k;
    public final zzek l;
    public final zzek m;
    public final zzek n;

    /* renamed from: o  reason: collision with root package name */
    public final zzek f202o;
    public ByteBuffer p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    @InterfaceC11300zs1
    public zzaho w;
    public boolean x;
    public int y;
    public long z;

    static {
        String str = zzeu.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", Integer.valueOf((int) C4731Xo.d1));
        k0 = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahq() {
        this(new zzahl(), 2, zzakj.a);
    }

    public static byte[] y(long j, String str, long j2) {
        boolean z;
        if (j != C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzeu.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    public static int[] z(@InterfaceC11300zs1 int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        if (length >= i) {
            return iArr;
        }
        return new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0262, code lost:
        throw com.google.android.gms.internal.ads.zzaz.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b2  */
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, zzado zzadoVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        int i13 = 1;
        int i14 = 0;
        if (i12 != 161 && i12 != 163) {
            if (i12 != 165) {
                if (i12 != 16877) {
                    if (i12 != 16981) {
                        if (i12 != 18402) {
                            if (i12 != 21419) {
                                if (i12 != 25506) {
                                    if (i12 == 30322) {
                                        t(i);
                                        byte[] bArr = new byte[i2];
                                        this.w.x = bArr;
                                        zzadoVar.I(bArr, 0, i2);
                                        return;
                                    }
                                    throw zzaz.a("Unexpected id: " + i12, null);
                                }
                                t(i);
                                byte[] bArr2 = new byte[i2];
                                this.w.l = bArr2;
                                zzadoVar.I(bArr2, 0, i2);
                                return;
                            }
                            zzek zzekVar = this.j;
                            Arrays.fill(zzekVar.n(), (byte) 0);
                            zzadoVar.I(zzekVar.n(), 4 - i2, i2);
                            zzekVar.l(0);
                            this.y = (int) zzekVar.O();
                            return;
                        }
                        byte[] bArr3 = new byte[i2];
                        zzadoVar.I(bArr3, 0, i2);
                        t(i);
                        this.w.k = new zzaes(1, bArr3, 0, 0);
                        return;
                    }
                    t(i);
                    byte[] bArr4 = new byte[i2];
                    this.w.j = bArr4;
                    zzadoVar.I(bArr4, 0, i2);
                    return;
                }
                t(i);
                zzaho zzahoVar = this.w;
                if (zzaho.a(zzahoVar) != 1685485123 && zzaho.a(zzahoVar) != 1685480259) {
                    zzadoVar.G(i2);
                    return;
                }
                byte[] bArr5 = new byte[i2];
                zzahoVar.P = bArr5;
                zzadoVar.I(bArr5, 0, i2);
                return;
            } else if (this.I == 2) {
                zzaho zzahoVar2 = (zzaho) this.b.get(this.O);
                if (this.R == 4 && C10997yd1.p0.equals(zzahoVar2.c)) {
                    zzek zzekVar2 = this.f202o;
                    zzekVar2.i(i2);
                    zzadoVar.I(zzekVar2.n(), 0, i2);
                    return;
                }
                zzadoVar.G(i2);
                return;
            } else {
                return;
            }
        }
        int i15 = 8;
        if (this.I == 0) {
            zzahs zzahsVar = this.a;
            this.O = (int) zzahsVar.d(zzadoVar, false, true, 8);
            this.P = zzahsVar.a();
            this.K = C10323vs.b;
            this.I = 1;
            this.h.i(0);
        }
        zzaho zzahoVar3 = (zzaho) this.b.get(this.O);
        if (zzahoVar3 == null) {
            zzadoVar.G(i2 - this.P);
            this.I = 0;
            return;
        }
        zzaho.d(zzahoVar3);
        if (this.I == 1) {
            v(zzadoVar, 3);
            zzek zzekVar3 = this.h;
            int i16 = (zzekVar3.n()[2] & 6) >> 1;
            if (i16 == 0) {
                this.M = 1;
                int[] z = z(this.N, 1);
                this.N = z;
                z[0] = (i2 - this.P) - 3;
            } else {
                v(zzadoVar, 4);
                int i17 = (zzekVar3.n()[3] & 255) + 1;
                this.M = i17;
                int[] z2 = z(this.N, i17);
                this.N = z2;
                if (i16 == 2) {
                    int i18 = this.M;
                    Arrays.fill(z2, 0, i18, ((i2 - this.P) - 4) / i18);
                } else if (i16 == 1) {
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 4;
                    while (true) {
                        i8 = this.M - 1;
                        if (i19 >= i8) {
                            break;
                        }
                        this.N[i19] = 0;
                        while (true) {
                            i9 = i21 + 1;
                            v(zzadoVar, i9);
                            int i22 = zzekVar3.n()[i21] & 255;
                            int[] iArr = this.N;
                            i10 = iArr[i19] + i22;
                            iArr[i19] = i10;
                            if (i22 != 255) {
                                break;
                            }
                            i21 = i9;
                        }
                        i20 += i10;
                        i19++;
                        i21 = i9;
                    }
                    this.N[i8] = ((i2 - this.P) - i21) - i20;
                } else if (i16 == 3) {
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 4;
                    while (true) {
                        int i26 = this.M - 1;
                        if (i23 < i26) {
                            this.N[i23] = i14;
                            int i27 = i25 + 1;
                            v(zzadoVar, i27);
                            if (zzekVar3.n()[i25] != 0) {
                                int i28 = i13;
                                int i29 = i14;
                                while (true) {
                                    if (i29 < i15) {
                                        i7 = i15;
                                        int i30 = i28 << (7 - i29);
                                        if ((zzekVar3.n()[i25] & i30) != 0) {
                                            i27 += i29;
                                            v(zzadoVar, i27);
                                            i6 = i14;
                                            j = zzekVar3.n()[i25] & 255 & (~i30);
                                            int i31 = i25 + 1;
                                            while (i31 < i27) {
                                                j = (j << i7) | (zzekVar3.n()[i31] & 255);
                                                i31++;
                                                i29 = i29;
                                            }
                                            int i32 = i29;
                                            if (i23 > 0) {
                                                j -= (1 << ((i32 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i29++;
                                            i15 = i7;
                                        }
                                    } else {
                                        i6 = i14;
                                        i7 = i15;
                                        j = 0;
                                        break;
                                    }
                                }
                                i25 = i27;
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int[] iArr2 = this.N;
                                int i33 = (int) j;
                                if (i23 != 0) {
                                    i33 += iArr2[i23 - 1];
                                }
                                iArr2[i23] = i33;
                                i24 += i33;
                                i23++;
                                i13 = i28;
                                i14 = i6;
                                i15 = i7;
                            } else {
                                throw zzaz.a("No valid varint length mask found", null);
                            }
                        } else {
                            i3 = i13;
                            i5 = i14;
                            this.N[i26] = ((i2 - this.P) - i25) - i24;
                            break;
                        }
                    }
                    this.J = this.D + r((zzekVar3.n()[i5] << 8) | (zzekVar3.n()[i3] & 255));
                    if (zzahoVar3.e == 2) {
                        if (i12 == 163) {
                            if ((zzekVar3.n()[2] & 128) == 128) {
                                i11 = i3;
                            } else {
                                i11 = i5;
                            }
                            i12 = C10997yd1.o1;
                        } else {
                            i11 = i5;
                        }
                    } else {
                        i11 = i3;
                    }
                    this.Q = i11;
                    this.I = 2;
                    this.L = i5;
                    i4 = C10997yd1.o1;
                } else {
                    throw zzaz.a("Unexpected lacing value: 2", null);
                }
            }
            i3 = 1;
            i5 = 0;
            this.J = this.D + r((zzekVar3.n()[i5] << 8) | (zzekVar3.n()[i3] & 255));
            if (zzahoVar3.e == 2) {
            }
            this.Q = i11;
            this.I = 2;
            this.L = i5;
            i4 = C10997yd1.o1;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i12 == i4) {
            while (true) {
                int i34 = this.L;
                if (i34 < this.M) {
                    int p = p(zzadoVar, zzahoVar3, this.N[i34], false);
                    zzaho zzahoVar4 = zzahoVar3;
                    u(zzahoVar4, this.J + ((this.L * zzahoVar3.f) / 1000), this.Q, p, 0);
                    this.L++;
                    zzahoVar3 = zzahoVar4;
                } else {
                    this.I = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i35 = this.L;
                if (i35 < this.M) {
                    int[] iArr3 = this.N;
                    boolean z3 = i3;
                    iArr3[i35] = p(zzadoVar, zzahoVar3, iArr3[i35], z3);
                    this.L += z3 ? 1 : 0;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    @InterfaceC2591Bt
    public final void e(long j, long j2) {
        this.D = C10323vs.b;
        int i = 0;
        this.I = 0;
        this.e0.b();
        this.a.e();
        w();
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                zzaeu zzaeuVar = ((zzaho) sparseArray.valueAt(i)).V;
                if (zzaeuVar != null) {
                    zzaeuVar.b();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        return new zzahr().a(zzadoVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0250, code lost:
        if (r2.equals(o.C10997yd1.q0) != false) goto L101;
     */
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i) throws zzaz {
        int i2;
        zzaem zzaelVar;
        int i3;
        zzdc.b(this.d0);
        char c = 2;
        int i4 = 0;
        if (i != 160) {
            if (i != 174) {
                if (i != 19899) {
                    if (i != 25152) {
                        if (i != 28032) {
                            if (i != 357149030) {
                                if (i != 374648427) {
                                    if (i == 475249515) {
                                        if (!this.x) {
                                            zzadq zzadqVar = this.d0;
                                            zzdy zzdyVar = this.E;
                                            zzdy zzdyVar2 = this.F;
                                            if (this.r != -1 && this.u != C10323vs.b && zzdyVar != null && zzdyVar.a() != 0 && zzdyVar2 != null && zzdyVar2.a() == zzdyVar.a()) {
                                                int a = zzdyVar.a();
                                                int[] iArr = new int[a];
                                                long[] jArr = new long[a];
                                                long[] jArr2 = new long[a];
                                                long[] jArr3 = new long[a];
                                                for (int i5 = 0; i5 < a; i5++) {
                                                    jArr3[i5] = zzdyVar.b(i5);
                                                    jArr[i5] = this.r + zzdyVar2.b(i5);
                                                }
                                                while (true) {
                                                    i3 = a - 1;
                                                    if (i4 >= i3) {
                                                        break;
                                                    }
                                                    int i6 = i4 + 1;
                                                    iArr[i4] = (int) (jArr[i6] - jArr[i4]);
                                                    jArr2[i4] = jArr3[i6] - jArr3[i4];
                                                    i4 = i6;
                                                }
                                                int i7 = i3;
                                                while (i7 > 0 && jArr3[i7] > this.u) {
                                                    i7--;
                                                }
                                                iArr[i7] = (int) ((this.r + this.q) - jArr[i7]);
                                                jArr2[i7] = this.u - jArr3[i7];
                                                if (i7 < i3) {
                                                    zzdx.f(C10997yd1.h0, "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i8 = i7 + 1;
                                                    iArr = Arrays.copyOf(iArr, i8);
                                                    jArr = Arrays.copyOf(jArr, i8);
                                                    jArr2 = Arrays.copyOf(jArr2, i8);
                                                    jArr3 = Arrays.copyOf(jArr3, i8);
                                                }
                                                zzaelVar = new zzadb(iArr, jArr, jArr2, jArr3);
                                            } else {
                                                zzaelVar = new zzael(this.u, 0L);
                                            }
                                            zzadqVar.P(zzaelVar);
                                            this.x = true;
                                        }
                                        this.E = null;
                                        this.F = null;
                                        return;
                                    }
                                    return;
                                } else if (this.b.size() != 0) {
                                    this.d0.N();
                                    return;
                                } else {
                                    throw zzaz.a("No valid tracks were found", null);
                                }
                            }
                            if (this.s == C10323vs.b) {
                                this.s = 1000000L;
                            }
                            long j = this.t;
                            if (j != C10323vs.b) {
                                this.u = r(j);
                                return;
                            }
                            return;
                        }
                        t(i);
                        zzaho zzahoVar = this.w;
                        if (zzahoVar.i && zzahoVar.j != null) {
                            throw zzaz.a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    t(i);
                    zzaho zzahoVar2 = this.w;
                    if (zzahoVar2.i) {
                        if (zzahoVar2.k != null) {
                            zzahoVar2.m = new zzs(null, new zzr(zzh.a, null, "video/webm", this.w.k.b));
                            return;
                        }
                        throw zzaz.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i9 = this.y;
                if (i9 != -1) {
                    long j2 = this.z;
                    if (j2 != -1) {
                        if (i9 == 475249515) {
                            this.B = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzaz.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            zzaho zzahoVar3 = this.w;
            zzdc.b(zzahoVar3);
            String str = zzahoVar3.c;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2095576542:
                        if (str.equals(C10997yd1.u0)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2095575984:
                        if (str.equals(C10997yd1.s0)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1985379776:
                        if (str.equals(C10997yd1.L0)) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1784763192:
                        if (str.equals(C10997yd1.G0)) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1730367663:
                        if (str.equals(C10997yd1.z0)) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641358:
                        if (str.equals(C10997yd1.C0)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641357:
                        if (str.equals(C10997yd1.D0)) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1373388978:
                        if (str.equals(C10997yd1.x0)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -933872740:
                        if (str.equals(C10997yd1.U0)) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363189:
                        if (str.equals(C10997yd1.t0)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363109:
                        if (str.equals(C10997yd1.v0)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -425012669:
                        if (str.equals(C10997yd1.S0)) {
                            c = C5588cW.p;
                            break;
                        }
                        c = 65535;
                        break;
                    case -356037306:
                        if (str.equals(C10997yd1.J0)) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923557:
                        if (str.equals(C10997yd1.B0)) {
                            c = C8206nB.d;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923603:
                        if (str.equals(C10997yd1.E0)) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62927045:
                        if (str.equals(C10997yd1.H0)) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82318131:
                        break;
                    case 82338133:
                        if (str.equals(C10997yd1.o0)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338134:
                        if (str.equals(C10997yd1.p0)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99146302:
                        if (str.equals(C10997yd1.T0)) {
                            c = VN2.b;
                            break;
                        }
                        c = 65535;
                        break;
                    case 444813526:
                        if (str.equals(C10997yd1.y0)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 542569478:
                        if (str.equals(C10997yd1.I0)) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 635596514:
                        if (str.equals(C10997yd1.O0)) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725948237:
                        if (str.equals(C10997yd1.N0)) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725957860:
                        if (str.equals(C10997yd1.M0)) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 738597099:
                        if (str.equals(C10997yd1.Q0)) {
                            c = C5588cW.n;
                            break;
                        }
                        c = 65535;
                        break;
                    case 855502857:
                        if (str.equals(C10997yd1.w0)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1045209816:
                        if (str.equals(C10997yd1.R0)) {
                            c = C5588cW.f706o;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1422270023:
                        if (str.equals(C10997yd1.P0)) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1809237540:
                        if (str.equals(C10997yd1.r0)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950749482:
                        if (str.equals(C10997yd1.F0)) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950789798:
                        if (str.equals(C10997yd1.K0)) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951062397:
                        if (str.equals(C10997yd1.A0)) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                        zzahoVar3.e(this.d0, zzahoVar3.d);
                        this.b.put(zzahoVar3.d, zzahoVar3);
                        break;
                }
                this.w = null;
                return;
            }
            throw zzaz.a("CodecId is missing in TrackEntry element", null);
        } else if (this.I == 2) {
            zzaho zzahoVar4 = (zzaho) this.b.get(this.O);
            zzaho.d(zzahoVar4);
            if (this.T > 0 && C10997yd1.A0.equals(zzahoVar4.c)) {
                zzek zzekVar = this.f202o;
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.T).array();
                zzekVar.j(array, array.length);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.M; i11++) {
                i10 += this.N[i11];
            }
            int i12 = 0;
            while (i12 < this.M) {
                long j3 = this.J + ((zzahoVar4.f * i12) / 1000);
                int i13 = this.Q;
                if (i12 == 0) {
                    if (!this.S) {
                        i13 |= 1;
                    }
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                int i14 = this.N[i2];
                int i15 = i10 - i14;
                u(zzahoVar4, j3, i13, i14, i15);
                i12 = i2 + 1;
                i10 = i15;
            }
            this.I = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        if (this.d) {
            zzadqVar = new zzakm(zzadqVar, this.e);
        }
        this.d0 = zzadqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        int i = 0;
        this.H = false;
        while (!this.H) {
            if (this.e0.c(zzadoVar)) {
                long e = zzadoVar.e();
                if (this.A) {
                    this.C = e;
                    zzaejVar.a = this.B;
                    this.A = false;
                    return 1;
                } else if (this.x) {
                    long j = this.C;
                    if (j != -1) {
                        zzaejVar.a = j;
                        this.C = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.b;
                    if (i < sparseArray.size()) {
                        zzaho zzahoVar = (zzaho) sparseArray.valueAt(i);
                        zzaho.d(zzahoVar);
                        zzaeu zzaeuVar = zzahoVar.V;
                        if (zzaeuVar != null) {
                            zzaeuVar.a(zzahoVar.Z, zzahoVar.k);
                        }
                        i++;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    @InterfaceC2591Bt
    public final void k(int i, double d) throws zzaz {
        if (i != 181) {
            if (i != 17545) {
                switch (i) {
                    case C10997yd1.E2 /* 21969 */:
                        t(i);
                        this.w.F = (float) d;
                        return;
                    case C10997yd1.F2 /* 21970 */:
                        t(i);
                        this.w.G = (float) d;
                        return;
                    case C10997yd1.G2 /* 21971 */:
                        t(i);
                        this.w.H = (float) d;
                        return;
                    case C10997yd1.H2 /* 21972 */:
                        t(i);
                        this.w.I = (float) d;
                        return;
                    case C10997yd1.I2 /* 21973 */:
                        t(i);
                        this.w.J = (float) d;
                        return;
                    case C10997yd1.J2 /* 21974 */:
                        t(i);
                        this.w.K = (float) d;
                        return;
                    case C10997yd1.K2 /* 21975 */:
                        t(i);
                        this.w.L = (float) d;
                        return;
                    case C10997yd1.L2 /* 21976 */:
                        t(i);
                        this.w.M = (float) d;
                        return;
                    case C10997yd1.M2 /* 21977 */:
                        t(i);
                        this.w.N = (float) d;
                        return;
                    case C10997yd1.N2 /* 21978 */:
                        t(i);
                        this.w.O = (float) d;
                        return;
                    default:
                        switch (i) {
                            case C10997yd1.t2 /* 30323 */:
                                t(i);
                                this.w.u = (float) d;
                                return;
                            case C10997yd1.u2 /* 30324 */:
                                t(i);
                                this.w.v = (float) d;
                                return;
                            case C10997yd1.v2 /* 30325 */:
                                t(i);
                                this.w.w = (float) d;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.t = (long) d;
            return;
        }
        t(i);
        this.w.S = (int) d;
    }

    @InterfaceC2591Bt
    public final void l(int i, long j) throws zzaz {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        t(i);
                        this.w.e = (int) j;
                        return;
                    case 136:
                        if (j == 1) {
                            z = true;
                        }
                        t(i);
                        this.w.X = z;
                        return;
                    case 155:
                        this.K = r(j);
                        return;
                    case 159:
                        t(i);
                        this.w.Q = (int) j;
                        return;
                    case 176:
                        t(i);
                        this.w.n = (int) j;
                        return;
                    case 179:
                        s(i);
                        this.E.c(r(j));
                        return;
                    case C10997yd1.Q1 /* 186 */:
                        t(i);
                        this.w.f201o = (int) j;
                        return;
                    case C10997yd1.z1 /* 215 */:
                        t(i);
                        this.w.d = (int) j;
                        return;
                    case C10997yd1.n1 /* 231 */:
                        this.D = r(j);
                        return;
                    case C10997yd1.u1 /* 238 */:
                        this.R = (int) j;
                        return;
                    case C10997yd1.o2 /* 241 */:
                        if (!this.G) {
                            s(i);
                            this.F.c(j);
                            this.G = true;
                            return;
                        }
                        return;
                    case C10997yd1.w1 /* 251 */:
                        this.S = true;
                        return;
                    case C10997yd1.G1 /* 16871 */:
                        t(i);
                        zzaho.b(this.w, (int) j);
                        return;
                    case C10997yd1.d2 /* 16980 */:
                        if (j != 3) {
                            throw zzaz.a("ContentCompAlgo " + j + " not supported", null);
                        }
                        return;
                    case C10997yd1.c1 /* 17029 */:
                        if (j < 1 || j > 2) {
                            throw zzaz.a("DocTypeReadVersion " + j + " not supported", null);
                        }
                        return;
                    case C10997yd1.a1 /* 17143 */:
                        if (j != 1) {
                            throw zzaz.a("EBMLReadVersion " + j + " not supported", null);
                        }
                        return;
                    case C10997yd1.g2 /* 18401 */:
                        if (j != 5) {
                            throw zzaz.a("ContentEncAlgo " + j + " not supported", null);
                        }
                        return;
                    case C10997yd1.j2 /* 18408 */:
                        if (j != 1) {
                            throw zzaz.a("AESSettingsCipherMode " + j + " not supported", null);
                        }
                        return;
                    case C10997yd1.i1 /* 21420 */:
                        this.z = j + this.r;
                        return;
                    case C10997yd1.w2 /* 21432 */:
                        int i2 = (int) j;
                        t(i);
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 15) {
                                        this.w.y = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.w.y = 1;
                                return;
                            }
                            this.w.y = 2;
                            return;
                        }
                        this.w.y = 0;
                        return;
                    case C10997yd1.R1 /* 21680 */:
                        t(i);
                        this.w.q = (int) j;
                        return;
                    case C10997yd1.T1 /* 21682 */:
                        t(i);
                        this.w.s = (int) j;
                        return;
                    case C10997yd1.S1 /* 21690 */:
                        t(i);
                        this.w.r = (int) j;
                        return;
                    case C10997yd1.C1 /* 21930 */:
                        if (j == 1) {
                            z = true;
                        }
                        t(i);
                        this.w.W = z;
                        return;
                    case 21938:
                        t(i);
                        zzaho zzahoVar = this.w;
                        zzahoVar.z = true;
                        zzahoVar.p = (int) j;
                        return;
                    case C10997yd1.E1 /* 21998 */:
                        t(i);
                        this.w.g = (int) j;
                        return;
                    case C10997yd1.L1 /* 22186 */:
                        t(i);
                        this.w.T = j;
                        return;
                    case C10997yd1.M1 /* 22203 */:
                        t(i);
                        this.w.U = j;
                        return;
                    case C10997yd1.W1 /* 25188 */:
                        t(i);
                        this.w.R = (int) j;
                        return;
                    case C10997yd1.N1 /* 30114 */:
                        this.T = j;
                        return;
                    case C10997yd1.r2 /* 30321 */:
                        int i3 = (int) j;
                        t(i);
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        this.w.t = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.w.t = 2;
                                return;
                            }
                            this.w.t = 1;
                            return;
                        }
                        this.w.t = 0;
                        return;
                    case C10997yd1.D1 /* 2352003 */:
                        t(i);
                        this.w.f = (int) j;
                        return;
                    case C10997yd1.k1 /* 2807729 */:
                        this.s = j;
                        return;
                    default:
                        switch (i) {
                            case C10997yd1.y2 /* 21945 */:
                                int i4 = (int) j;
                                t(i);
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        this.w.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.w.C = 2;
                                return;
                            case C10997yd1.z2 /* 21946 */:
                                t(i);
                                int b = zzk.b((int) j);
                                if (b != -1) {
                                    this.w.B = b;
                                    return;
                                }
                                return;
                            case C10997yd1.A2 /* 21947 */:
                                t(i);
                                this.w.z = true;
                                int a = zzk.a((int) j);
                                if (a != -1) {
                                    this.w.A = a;
                                    return;
                                }
                                return;
                            case C10997yd1.B2 /* 21948 */:
                                t(i);
                                this.w.D = (int) j;
                                return;
                            case C10997yd1.C2 /* 21949 */:
                                t(i);
                                this.w.E = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw zzaz.a("ContentEncodingScope " + j + " not supported", null);
            }
        } else if (j == 0) {
        } else {
            throw zzaz.a("ContentEncodingOrder " + j + " not supported", null);
        }
    }

    @InterfaceC2591Bt
    public final void m(int i, long j, long j2) throws zzaz {
        zzdc.b(this.d0);
        if (i != 160) {
            if (i != 174) {
                if (i != 187) {
                    if (i != 19899) {
                        if (i != 20533) {
                            if (i != 21968) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i == 524531317 && !this.x) {
                                            if (this.c && this.B != -1) {
                                                this.A = true;
                                                return;
                                            }
                                            this.d0.P(new zzael(this.u, 0L));
                                            this.x = true;
                                            return;
                                        }
                                        return;
                                    }
                                    this.E = new zzdy(32);
                                    this.F = new zzdy(32);
                                    return;
                                }
                                long j3 = this.r;
                                if (j3 != -1 && j3 != j) {
                                    throw zzaz.a("Multiple Segment elements not supported", null);
                                }
                                this.r = j;
                                this.q = j2;
                                return;
                            }
                            t(i);
                            this.w.z = true;
                            return;
                        }
                        t(i);
                        this.w.i = true;
                        return;
                    }
                    this.y = -1;
                    this.z = -1L;
                    return;
                }
                this.G = false;
                return;
            }
            zzaho zzahoVar = new zzaho();
            this.w = zzahoVar;
            zzahoVar.a = this.v;
            return;
        }
        this.S = false;
        this.T = 0L;
    }

    @InterfaceC2591Bt
    public final void n(int i, String str) throws zzaz {
        if (i != 134) {
            if (i != 17026) {
                if (i != 21358) {
                    if (i != 2274716) {
                        return;
                    }
                    t(i);
                    zzaho.c(this.w, str);
                    return;
                }
                t(i);
                this.w.b = str;
                return;
            } else if (!C10997yd1.n0.equals(str) && !C10997yd1.m0.equals(str)) {
                throw zzaz.a("DocType " + str + " not supported", null);
            } else {
                this.v = Objects.equals(str, C10997yd1.n0);
                return;
            }
        }
        t(i);
        this.w.c = str;
    }

    @HS1({"#2.output"})
    public final int p(zzado zzadoVar, zzaho zzahoVar, int i, boolean z) throws IOException {
        int i2;
        if (C10997yd1.P0.equals(zzahoVar.c)) {
            x(zzadoVar, f0, i);
            int i3 = this.V;
            w();
            return i3;
        } else if (C10997yd1.Q0.equals(zzahoVar.c)) {
            x(zzadoVar, h0, i);
            int i4 = this.V;
            w();
            return i4;
        } else if (C10997yd1.R0.equals(zzahoVar.c)) {
            x(zzadoVar, i0, i);
            int i5 = this.V;
            w();
            return i5;
        } else {
            zzaet zzaetVar = zzahoVar.Z;
            boolean z2 = true;
            if (!this.X) {
                if (zzahoVar.i) {
                    this.Q &= -1073741825;
                    int i6 = 128;
                    if (!this.Y) {
                        zzek zzekVar = this.h;
                        zzadoVar.I(zzekVar.n(), 0, 1);
                        this.U++;
                        if ((zzekVar.n()[0] & 128) != 128) {
                            this.b0 = zzekVar.n()[0];
                            this.Y = true;
                        } else {
                            throw zzaz.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b = this.b0;
                    if ((b & 1) == 1) {
                        int i7 = b & 2;
                        this.Q |= 1073741824;
                        if (!this.c0) {
                            zzek zzekVar2 = this.m;
                            zzadoVar.I(zzekVar2.n(), 0, 8);
                            this.U += 8;
                            this.c0 = true;
                            zzek zzekVar3 = this.h;
                            if (i7 != 2) {
                                i6 = 0;
                            }
                            zzekVar3.n()[0] = (byte) (i6 | 8);
                            zzekVar3.l(0);
                            zzaetVar.a(zzekVar3, 1, 1);
                            this.V++;
                            zzekVar2.l(0);
                            zzaetVar.a(zzekVar2, 8, 1);
                            this.V += 8;
                        }
                        if (i7 == 2) {
                            if (!this.Z) {
                                zzek zzekVar4 = this.h;
                                zzadoVar.I(zzekVar4.n(), 0, 1);
                                this.U++;
                                zzekVar4.l(0);
                                this.a0 = zzekVar4.G();
                                this.Z = true;
                            }
                            int i8 = this.a0 * 4;
                            zzek zzekVar5 = this.h;
                            zzekVar5.i(i8);
                            zzadoVar.I(zzekVar5.n(), 0, i8);
                            this.U += i8;
                            int i9 = (this.a0 >> 1) + 1;
                            int i10 = (i9 * 6) + 2;
                            ByteBuffer byteBuffer = this.p;
                            if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                this.p = ByteBuffer.allocate(i10);
                            }
                            this.p.position(0);
                            this.p.putShort((short) i9);
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i2 = this.a0;
                                if (i11 >= i2) {
                                    break;
                                }
                                int J = zzekVar5.J();
                                int i13 = J - i12;
                                if (i11 % 2 == 0) {
                                    this.p.putShort((short) i13);
                                } else {
                                    this.p.putInt(i13);
                                }
                                i11++;
                                i12 = J;
                            }
                            int i14 = (i - this.U) - i12;
                            if ((i2 & 1) == 1) {
                                this.p.putInt(i14);
                            } else {
                                this.p.putShort((short) i14);
                                this.p.putInt(0);
                            }
                            zzek zzekVar6 = this.n;
                            zzekVar6.j(this.p.array(), i10);
                            zzaetVar.a(zzekVar6, i10, 1);
                            this.V += i10;
                        }
                    }
                } else {
                    byte[] bArr = zzahoVar.j;
                    if (bArr != null) {
                        this.k.j(bArr, bArr.length);
                    }
                }
                if (!C10997yd1.A0.equals(zzahoVar.c) ? zzahoVar.g > 0 : z) {
                    this.Q |= 268435456;
                    this.f202o.i(0);
                    int x = (this.k.x() + i) - this.U;
                    zzek zzekVar7 = this.h;
                    zzekVar7.i(4);
                    zzekVar7.n()[0] = (byte) ((x >> 24) & 255);
                    zzekVar7.n()[1] = (byte) ((x >> 16) & 255);
                    zzekVar7.n()[2] = (byte) ((x >> 8) & 255);
                    zzekVar7.n()[3] = (byte) (x & 255);
                    zzaetVar.a(zzekVar7, 4, 2);
                    this.V += 4;
                }
                this.X = true;
            }
            zzek zzekVar8 = this.k;
            int x2 = i + zzekVar8.x();
            if (!C10997yd1.v0.equals(zzahoVar.c) && !C10997yd1.w0.equals(zzahoVar.c)) {
                if (zzahoVar.V != null) {
                    if (zzekVar8.x() != 0) {
                        z2 = false;
                    }
                    zzdc.f(z2);
                    zzahoVar.V.d(zzadoVar);
                }
                while (true) {
                    int i15 = this.U;
                    if (i15 >= x2) {
                        break;
                    }
                    int q = q(zzadoVar, zzaetVar, x2 - i15);
                    this.U += q;
                    this.V += q;
                }
            } else {
                zzek zzekVar9 = this.g;
                byte[] n = zzekVar9.n();
                n[0] = 0;
                n[1] = 0;
                n[2] = 0;
                int i16 = zzahoVar.a0;
                int i17 = 4 - i16;
                while (this.U < x2) {
                    int i18 = this.W;
                    if (i18 == 0) {
                        int min = Math.min(i16, zzekVar8.u());
                        zzadoVar.I(n, i17 + min, i16 - min);
                        if (min > 0) {
                            zzekVar8.h(n, i17, min);
                        }
                        this.U += i16;
                        zzekVar9.l(0);
                        this.W = zzekVar9.J();
                        zzek zzekVar10 = this.f;
                        zzekVar10.l(0);
                        zzaetVar.d(zzekVar10, 4);
                        this.V += 4;
                    } else {
                        int q2 = q(zzadoVar, zzaetVar, i18);
                        this.U += q2;
                        this.V += q2;
                        this.W -= q2;
                    }
                }
            }
            if (C10997yd1.z0.equals(zzahoVar.c)) {
                zzek zzekVar11 = this.i;
                zzekVar11.l(0);
                zzaetVar.d(zzekVar11, 4);
                this.V += 4;
            }
            int i19 = this.V;
            w();
            return i19;
        }
    }

    public final int q(zzado zzadoVar, zzaet zzaetVar, int i) throws IOException {
        zzek zzekVar = this.k;
        int u = zzekVar.u();
        if (u > 0) {
            int min = Math.min(i, u);
            zzaetVar.d(zzekVar, min);
            return min;
        }
        return zzaetVar.b(zzadoVar, i, false);
    }

    public final long r(long j) throws zzaz {
        long j2 = this.s;
        if (j2 != C10323vs.b) {
            return zzeu.P(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzaz.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @InterfaceC8557od0({"cueTimesUs", "cueClusterPositions"})
    public final void s(int i) throws zzaz {
        if (this.E != null && this.F != null) {
            return;
        }
        throw zzaz.a("Element " + i + " must be in a Cues", null);
    }

    @InterfaceC8557od0({"currentTrack"})
    public final void t(int i) throws zzaz {
        if (this.w != null) {
            return;
        }
        throw zzaz.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[EDGE_INSN: B:61:0x00d8->B:51:0x00d8 ?: BREAK  , SYNTHETIC] */
    @HS1({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(zzaho zzahoVar, long j, int i, int i2, int i3) {
        char c;
        byte[] y;
        int i4;
        int w;
        int x;
        zzaeu zzaeuVar = zzahoVar.V;
        if (zzaeuVar != null) {
            zzaeuVar.c(zzahoVar.Z, j, i, i2, i3, zzahoVar.k);
        } else {
            if (C10997yd1.P0.equals(zzahoVar.c) || C10997yd1.Q0.equals(zzahoVar.c) || C10997yd1.R0.equals(zzahoVar.c)) {
                if (this.M > 1) {
                    zzdx.f(C10997yd1.h0, "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.K;
                    if (j2 == C10323vs.b) {
                        zzdx.f(C10997yd1.h0, "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzahoVar.c;
                        zzek zzekVar = this.l;
                        byte[] n = zzekVar.n();
                        int hashCode = str.hashCode();
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023 && str.equals(C10997yd1.P0)) {
                                    c = 0;
                                    if (c == 0) {
                                        if (c != 1) {
                                            if (c == 2) {
                                                y = y(j2, C10997yd1.k3, 1000L);
                                                i4 = 25;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            y = y(j2, C10997yd1.g3, 10000L);
                                            i4 = 21;
                                        }
                                    } else {
                                        y = y(j2, C10997yd1.b3, 1000L);
                                        i4 = 19;
                                    }
                                    System.arraycopy(y, 0, n, i4, y.length);
                                    w = zzekVar.w();
                                    while (true) {
                                        if (w >= zzekVar.x()) {
                                            break;
                                        } else if (zzekVar.n()[w] == 0) {
                                            zzekVar.k(w);
                                            break;
                                        } else {
                                            w++;
                                        }
                                    }
                                    zzahoVar.Z.d(zzekVar, zzekVar.x());
                                    x = i2 + zzekVar.x();
                                    if ((i & 268435456) != 0) {
                                        if (this.M > 1) {
                                            this.f202o.i(0);
                                        } else {
                                            zzek zzekVar2 = this.f202o;
                                            int x2 = zzekVar2.x();
                                            zzahoVar.Z.a(zzekVar2, x2, 2);
                                            x += x2;
                                        }
                                    }
                                    zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                                }
                                c = 65535;
                                if (c == 0) {
                                }
                                System.arraycopy(y, 0, n, i4, y.length);
                                w = zzekVar.w();
                                while (true) {
                                    if (w >= zzekVar.x()) {
                                    }
                                    w++;
                                }
                                zzahoVar.Z.d(zzekVar, zzekVar.x());
                                x = i2 + zzekVar.x();
                                if ((i & 268435456) != 0) {
                                }
                                zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                            } else {
                                if (str.equals(C10997yd1.R0)) {
                                    c = 2;
                                    if (c == 0) {
                                    }
                                    System.arraycopy(y, 0, n, i4, y.length);
                                    w = zzekVar.w();
                                    while (true) {
                                        if (w >= zzekVar.x()) {
                                        }
                                        w++;
                                    }
                                    zzahoVar.Z.d(zzekVar, zzekVar.x());
                                    x = i2 + zzekVar.x();
                                    if ((i & 268435456) != 0) {
                                    }
                                    zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                                }
                                c = 65535;
                                if (c == 0) {
                                }
                                System.arraycopy(y, 0, n, i4, y.length);
                                w = zzekVar.w();
                                while (true) {
                                    if (w >= zzekVar.x()) {
                                    }
                                    w++;
                                }
                                zzahoVar.Z.d(zzekVar, zzekVar.x());
                                x = i2 + zzekVar.x();
                                if ((i & 268435456) != 0) {
                                }
                                zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                            }
                        } else {
                            if (str.equals(C10997yd1.Q0)) {
                                c = 1;
                                if (c == 0) {
                                }
                                System.arraycopy(y, 0, n, i4, y.length);
                                w = zzekVar.w();
                                while (true) {
                                    if (w >= zzekVar.x()) {
                                    }
                                    w++;
                                }
                                zzahoVar.Z.d(zzekVar, zzekVar.x());
                                x = i2 + zzekVar.x();
                                if ((i & 268435456) != 0) {
                                }
                                zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                            System.arraycopy(y, 0, n, i4, y.length);
                            w = zzekVar.w();
                            while (true) {
                                if (w >= zzekVar.x()) {
                                }
                                w++;
                            }
                            zzahoVar.Z.d(zzekVar, zzekVar.x());
                            x = i2 + zzekVar.x();
                            if ((i & 268435456) != 0) {
                            }
                            zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
                        }
                    }
                }
            }
            x = i2;
            if ((i & 268435456) != 0) {
            }
            zzahoVar.Z.c(j, i, x, i3, zzahoVar.k);
        }
        this.H = true;
    }

    public final void v(zzado zzadoVar, int i) throws IOException {
        zzek zzekVar = this.h;
        if (zzekVar.x() >= i) {
            return;
        }
        if (zzekVar.v() < i) {
            int v = zzekVar.v();
            zzekVar.f(Math.max(v + v, i));
        }
        zzadoVar.I(zzekVar.n(), zzekVar.x(), i - zzekVar.x());
        zzekVar.k(i);
    }

    public final void w() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = (byte) 0;
        this.c0 = false;
        this.k.i(0);
    }

    public final void x(zzado zzadoVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzek zzekVar = this.l;
        if (zzekVar.v() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzekVar.j(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzekVar.n(), 0, length);
        }
        zzadoVar.I(zzekVar.n(), length, i);
        zzekVar.l(0);
        zzekVar.k(i2);
    }

    public zzahq(zzahl zzahlVar, int i, zzakj zzakjVar) {
        this.r = -1L;
        this.s = C10323vs.b;
        this.t = C10323vs.b;
        this.u = C10323vs.b;
        this.B = -1L;
        this.C = -1L;
        this.D = C10323vs.b;
        this.e0 = zzahlVar;
        zzahlVar.a(new zzahn(this, null));
        this.e = zzakjVar;
        this.c = 1 == ((i & 1) ^ 1);
        this.d = (i & 2) == 0;
        this.a = new zzahs();
        this.b = new SparseArray();
        this.h = new zzek(4);
        this.i = new zzek(ByteBuffer.allocate(4).putInt(-1).array());
        this.j = new zzek(4);
        this.f = new zzek(zzfs.a);
        this.g = new zzek(4);
        this.k = new zzek();
        this.l = new zzek();
        this.m = new zzek(8);
        this.n = new zzek();
        this.f202o = new zzek();
        this.N = new int[1];
    }

    public zzahq(zzakj zzakjVar, int i) {
        this(new zzahl(), 0, zzakjVar);
    }
}
