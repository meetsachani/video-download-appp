package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import o.AD1;
import o.AbstractC3914Pe1;
import o.C10323vs;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3817Oe1;
import o.C4128Rj1;
import o.C6566gU0;
import o.C8077mf;
import o.C9811tl1;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.JT;
import o.QC1;

/* loaded from: classes2.dex */
public abstract class zztj extends zzhz {
    public static final byte[] v2 = {0, 0, 1, 103, 66, C2638Cg0.o7, C8077mf.m, C2638Cg0.B7, C3307Iz.X, -112, 0, 0, 1, 104, C2638Cg0.z7, C8077mf.q, 19, 32, 0, 0, 1, 101, -120, -124, 13, C2638Cg0.z7, 113, C8077mf.B, -96, 0, 47, -65, 28, 49, C2638Cg0.r7, C3307Iz.Z, 93, QC1.w};
    @InterfaceC11300zs1
    public MediaCrypto A1;
    public long B1;
    public float C1;
    public float D1;
    @InterfaceC11300zs1
    public zzsz E1;
    @InterfaceC11300zs1
    public zzz F1;
    @InterfaceC11300zs1
    public MediaFormat G1;
    public boolean H1;
    public float I1;
    @InterfaceC11300zs1
    public ArrayDeque J1;
    @InterfaceC11300zs1
    public zztf K1;
    @InterfaceC11300zs1
    public zztc L1;
    public int M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public long S1;
    public long T1;
    public int U1;
    public int V1;
    @InterfaceC11300zs1
    public ByteBuffer W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public int d2;
    public int e2;
    public int f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public long j2;
    public long k2;
    public boolean l2;
    public boolean m2;
    public final zzsx n1;
    public boolean n2;
    public final zztl o1;
    public zzia o2;
    public final float p1;
    public zzth p2;
    public final zzhp q1;
    public long q2;
    public final zzhp r1;
    public boolean r2;
    public final zzhp s1;
    public boolean s2;
    public final zzsq t1;
    @InterfaceC11300zs1
    public zzsc t2;
    public final MediaCodec.BufferInfo u1;
    @InterfaceC11300zs1
    public zzsc u2;
    public final ArrayDeque v1;
    public final zzrp w1;
    @InterfaceC11300zs1
    public zzz x1;
    public zzz y1;
    public zzlu z1;

    public zztj(int i, zzsx zzsxVar, zztl zztlVar, boolean z, float f) {
        super(i);
        this.n1 = zzsxVar;
        zztlVar.getClass();
        this.o1 = zztlVar;
        this.p1 = f;
        this.q1 = new zzhp(0, 0);
        this.r1 = new zzhp(0, 0);
        this.s1 = new zzhp(2, 0);
        zzsq zzsqVar = new zzsq();
        this.t1 = zzsqVar;
        this.u1 = new MediaCodec.BufferInfo();
        this.C1 = 1.0f;
        this.D1 = 1.0f;
        this.B1 = C10323vs.b;
        this.v1 = new ArrayDeque();
        this.p2 = zzth.e;
        zzsqVar.j(0);
        zzsqVar.d.order(ByteOrder.nativeOrder());
        this.w1 = new zzrp();
        this.I1 = -1.0f;
        this.M1 = 0;
        this.d2 = 0;
        this.U1 = -1;
        this.V1 = -1;
        this.T1 = C10323vs.b;
        this.j2 = C10323vs.b;
        this.k2 = C10323vs.b;
        this.q2 = C10323vs.b;
        this.S1 = C10323vs.b;
        this.e2 = 0;
        this.f2 = 0;
        this.o2 = new zzia();
    }

    private final void N0() {
        try {
            zzsz zzszVar = this.E1;
            zzdc.b(zzszVar);
            zzszVar.j();
        } finally {
            m0();
        }
    }

    private final void U0() {
        this.U1 = -1;
        this.r1.d = null;
    }

    public static boolean v0(zzz zzzVar) {
        if (zzzVar.L != 0) {
            return false;
        }
        return true;
    }

    @ES1(23)
    private final void z0() throws zzik {
        zzsc zzscVar = this.u2;
        zzscVar.getClass();
        this.t2 = zzscVar;
        this.e2 = 0;
        this.f2 = 0;
    }

    @TargetApi(23)
    public final boolean A0() throws zzik {
        if (this.g2) {
            this.e2 = 1;
            if (this.O1) {
                this.f2 = 3;
                return false;
            }
            this.f2 = 2;
        } else {
            z0();
        }
        return true;
    }

    public final boolean B0() {
        return this.V1 >= 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void C() {
        try {
            J0();
            l0();
        } finally {
            this.u2 = null;
        }
    }

    public final boolean C0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzz zzzVar = this.y1;
        if (zzzVar != null && Objects.equals(zzzVar.f301o, C4128Rj1.a0) && zzaei.f(j, j2)) {
            return false;
        }
        return true;
    }

    public final boolean D0(int i) throws zzik {
        zzkq W = W();
        zzhp zzhpVar = this.q1;
        zzhpVar.b();
        int O = O(W, zzhpVar, i | 4);
        if (O == -5) {
            I0(W);
            return true;
        } else if (O == -4 && zzhpVar.f()) {
            this.l2 = true;
            O0();
            return false;
        } else {
            return false;
        }
    }

    public final boolean E0(long j) {
        if (this.B1 != C10323vs.b && U().b() - j >= this.B1) {
            return false;
        }
        return true;
    }

    public final boolean F0(@InterfaceC11300zs1 zzz zzzVar) throws zzik {
        if (this.E1 != null && this.f2 != 3 && n() != 0) {
            float f = this.D1;
            zzzVar.getClass();
            float e0 = e0(f, zzzVar, L());
            float f2 = this.I1;
            if (f2 != e0) {
                if (e0 == -1.0f) {
                    K0();
                    return false;
                } else if (f2 != -1.0f || e0 > this.p1) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", e0);
                    zzsz zzszVar = this.E1;
                    zzszVar.getClass();
                    zzszVar.Z(bundle);
                    this.I1 = e0;
                }
            }
        }
        return true;
    }

    public abstract int G0(zztl zztlVar, zzz zzzVar) throws zztq;

    public zzib H0(zztc zztcVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (A0() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if (A0() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
        if (A0() == false) goto L29;
     */
    @InterfaceC11300zs1
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzib I0(zzkq zzkqVar) throws zzik {
        boolean z;
        int i;
        boolean z2 = true;
        this.n2 = true;
        zzz zzzVar = zzkqVar.a;
        zzzVar.getClass();
        String str = zzzVar.f301o;
        if (str != null) {
            if (str.equals(C4128Rj1.n) && !zzzVar.r.isEmpty()) {
                zzx b = zzzVar.b();
                b.p(null);
                zzzVar = b.K();
            }
            zzz zzzVar2 = zzzVar;
            this.u2 = zzkqVar.b;
            this.x1 = zzzVar2;
            if (this.Z1) {
                this.b2 = true;
                return null;
            }
            zzsz zzszVar = this.E1;
            if (zzszVar == null) {
                this.J1 = null;
                i0();
                return null;
            }
            zztc zztcVar = this.L1;
            zztcVar.getClass();
            zzz zzzVar3 = this.F1;
            zzzVar3.getClass();
            zzsc zzscVar = this.t2;
            zzsc zzscVar2 = this.u2;
            if (zzscVar == zzscVar2) {
                if (zzscVar2 != zzscVar) {
                    z = true;
                } else {
                    z = false;
                }
                zzib H0 = H0(zztcVar, zzzVar3, zzzVar2);
                int i2 = H0.d;
                if (i2 != 0) {
                    i = 2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (F0(zzzVar2)) {
                                this.F1 = zzzVar2;
                                if (z) {
                                }
                            }
                            i = 16;
                        } else {
                            if (F0(zzzVar2)) {
                                this.c2 = true;
                                this.d2 = 1;
                                int i3 = this.M1;
                                if (i3 != 2 && (i3 != 1 || zzzVar2.v != zzzVar3.v || zzzVar2.w != zzzVar3.w)) {
                                    z2 = false;
                                }
                                this.P1 = z2;
                                this.F1 = zzzVar2;
                                if (z) {
                                }
                            }
                            i = 16;
                        }
                    } else {
                        if (F0(zzzVar2)) {
                            this.F1 = zzzVar2;
                            if (!z) {
                                if (this.g2) {
                                    this.e2 = 1;
                                    if (this.O1) {
                                        this.f2 = 3;
                                    } else {
                                        this.f2 = 1;
                                    }
                                }
                            }
                        }
                        i = 16;
                    }
                    if (i2 == 0 && (this.E1 != zzszVar || this.f2 == 3)) {
                        return new zzib(zztcVar.a, zzzVar3, zzzVar2, 0, i);
                    }
                    return H0;
                }
                K0();
                i = 0;
                if (i2 == 0) {
                }
                return H0;
            }
            K0();
            return new zzib(zztcVar.a, zzzVar3, zzzVar2, 0, 128);
        }
        throw P(new IllegalArgumentException("Sample MIME type is null."), zzzVar, false, AD1.t1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r4 >= r0) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzhz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J(zzz[] zzzVarArr, long j, long j2, zzvb zzvbVar) throws zzik {
        if (this.p2.c == C10323vs.b) {
            y0(new zzth(C10323vs.b, j, j2));
            if (this.s2) {
                V0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.v1;
        if (arrayDeque.isEmpty()) {
            long j3 = this.j2;
            if (j3 != C10323vs.b) {
                long j4 = this.q2;
                if (j4 != C10323vs.b) {
                }
            }
            y0(new zzth(C10323vs.b, j, j2));
            if (this.p2.c != C10323vs.b) {
                V0();
                return;
            }
            return;
        }
        arrayDeque.add(new zzth(this.j2, j, j2));
    }

    public final void J0() {
        this.b2 = false;
        this.t1.b();
        this.s1.b();
        this.a2 = false;
        this.Z1 = false;
        this.w1.b();
    }

    public final void K0() throws zzik {
        if (this.g2) {
            this.e2 = 1;
            this.f2 = 3;
            return;
        }
        l0();
        i0();
    }

    public abstract zzsw L0(zztc zztcVar, zzz zzzVar, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f);

    public abstract List M0(zztl zztlVar, zzz zzzVar, boolean z) throws zztq;

    @TargetApi(23)
    public final void O0() throws zzik {
        int i = this.f2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.m2 = true;
                    W0();
                    return;
                }
                l0();
                i0();
                return;
            }
            N0();
            z0();
            return;
        }
        N0();
    }

    public void P0(zzhp zzhpVar) throws zzik {
        throw null;
    }

    public void Q0(Exception exc) {
        throw null;
    }

    public void R0(String str, zzsw zzswVar, long j, long j2) {
        throw null;
    }

    public void S0(String str) {
        throw null;
    }

    public void T0(zzz zzzVar, @InterfaceC11300zs1 MediaFormat mediaFormat) throws zzik {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public boolean V() {
        if (this.x1 == null) {
            return false;
        }
        if (K() || B0()) {
            return true;
        }
        if (this.T1 == C10323vs.b || U().b() >= this.T1) {
            return false;
        }
        return true;
    }

    public void V0() {
    }

    public void W0() throws zzik {
        throw null;
    }

    public abstract boolean X0(long j, long j2, @InterfaceC11300zs1 zzsz zzszVar, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzzVar) throws zzik;

    public boolean Y0(zzz zzzVar) {
        return false;
    }

    public final float Z0() {
        return this.C1;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void a0() {
        this.x1 = null;
        y0(zzth.e);
        this.v1.clear();
        p0();
    }

    public final long a1() {
        return this.p2.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void b0(boolean z, boolean z2) throws zzik {
        this.o2 = new zzia();
    }

    public final long b1() {
        return this.p2.b;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void c0(long j, boolean z) throws zzik {
        this.l2 = false;
        this.m2 = false;
        if (this.Z1) {
            this.t1.b();
            this.s1.b();
            this.a2 = false;
            this.w1.b();
        } else {
            o0();
        }
        zzeq zzeqVar = this.p2.d;
        if (zzeqVar.a() > 0) {
            this.n2 = true;
        }
        zzeqVar.e();
        this.v1.clear();
    }

    @InterfaceC11300zs1
    public final MediaFormat c1() {
        return this.G1;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzly
    public final int d() {
        return 8;
    }

    public float e0(float f, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    @InterfaceC11300zs1
    public final zzlu e1() {
        return this.z1;
    }

    public zztb f0(Throwable th, @InterfaceC11300zs1 zztc zztcVar) {
        return new zztb(th, zztcVar);
    }

    @InterfaceC11300zs1
    public final zzsz f1() {
        return this.E1;
    }

    @InterfaceC11300zs1
    public final zztc g0() {
        return this.L1;
    }

    public final void h0() {
        this.s2 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x046e A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:69:0x013d, B:71:0x0162, B:74:0x016d, B:76:0x0172, B:77:0x017a, B:79:0x017e, B:80:0x0186, B:82:0x018a, B:83:0x0192, B:85:0x0196, B:87:0x01a6, B:102:0x0205, B:89:0x01ae, B:91:0x01b6, B:92:0x01bc, B:94:0x01c4, B:95:0x01ca, B:97:0x01d2, B:98:0x01d8, B:100:0x01e0, B:101:0x01e6, B:103:0x020a, B:105:0x021a, B:107:0x021f, B:109:0x0223, B:110:0x0233, B:114:0x0253, B:116:0x0259, B:118:0x025f, B:119:0x0279, B:121:0x027d, B:123:0x0283, B:125:0x0289, B:126:0x0295, B:128:0x029b, B:129:0x02a3, B:131:0x02a8, B:132:0x02b0, B:134:0x02b5, B:135:0x02bd, B:137:0x02c2, B:138:0x02ca, B:140:0x02ce, B:141:0x02d6, B:144:0x02e0, B:145:0x02f4, B:147:0x02f8, B:149:0x0308, B:150:0x030d, B:152:0x0311, B:153:0x0316, B:154:0x031c, B:156:0x0320, B:158:0x0330, B:160:0x033c, B:162:0x0340, B:163:0x0345, B:165:0x0349, B:166:0x034e, B:168:0x0352, B:169:0x0357, B:171:0x035b, B:172:0x0360, B:174:0x0364, B:175:0x0369, B:177:0x036d, B:178:0x0372, B:180:0x0376, B:181:0x037b, B:183:0x037f, B:184:0x0384, B:186:0x0388, B:187:0x038d, B:189:0x0391, B:190:0x0396, B:192:0x039a, B:193:0x039f, B:195:0x03a3, B:196:0x03a8, B:198:0x03ac, B:199:0x03b1, B:201:0x03b5, B:202:0x03ba, B:204:0x03be, B:205:0x03c3, B:207:0x03cd, B:209:0x03d1, B:226:0x03fe, B:220:0x03eb, B:221:0x03f2, B:227:0x0401, B:229:0x041b, B:231:0x0427, B:233:0x042f, B:235:0x0439, B:237:0x0441, B:239:0x0449, B:243:0x0454, B:245:0x045a, B:249:0x0465, B:251:0x046e, B:276:0x04c5, B:278:0x04cb, B:280:0x04d2, B:281:0x04df, B:256:0x047b, B:258:0x0483, B:260:0x048b, B:262:0x0493, B:264:0x049b, B:266:0x04a3, B:268:0x04ab, B:270:0x04b5, B:272:0x04bf), top: B:319:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04cb A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:69:0x013d, B:71:0x0162, B:74:0x016d, B:76:0x0172, B:77:0x017a, B:79:0x017e, B:80:0x0186, B:82:0x018a, B:83:0x0192, B:85:0x0196, B:87:0x01a6, B:102:0x0205, B:89:0x01ae, B:91:0x01b6, B:92:0x01bc, B:94:0x01c4, B:95:0x01ca, B:97:0x01d2, B:98:0x01d8, B:100:0x01e0, B:101:0x01e6, B:103:0x020a, B:105:0x021a, B:107:0x021f, B:109:0x0223, B:110:0x0233, B:114:0x0253, B:116:0x0259, B:118:0x025f, B:119:0x0279, B:121:0x027d, B:123:0x0283, B:125:0x0289, B:126:0x0295, B:128:0x029b, B:129:0x02a3, B:131:0x02a8, B:132:0x02b0, B:134:0x02b5, B:135:0x02bd, B:137:0x02c2, B:138:0x02ca, B:140:0x02ce, B:141:0x02d6, B:144:0x02e0, B:145:0x02f4, B:147:0x02f8, B:149:0x0308, B:150:0x030d, B:152:0x0311, B:153:0x0316, B:154:0x031c, B:156:0x0320, B:158:0x0330, B:160:0x033c, B:162:0x0340, B:163:0x0345, B:165:0x0349, B:166:0x034e, B:168:0x0352, B:169:0x0357, B:171:0x035b, B:172:0x0360, B:174:0x0364, B:175:0x0369, B:177:0x036d, B:178:0x0372, B:180:0x0376, B:181:0x037b, B:183:0x037f, B:184:0x0384, B:186:0x0388, B:187:0x038d, B:189:0x0391, B:190:0x0396, B:192:0x039a, B:193:0x039f, B:195:0x03a3, B:196:0x03a8, B:198:0x03ac, B:199:0x03b1, B:201:0x03b5, B:202:0x03ba, B:204:0x03be, B:205:0x03c3, B:207:0x03cd, B:209:0x03d1, B:226:0x03fe, B:220:0x03eb, B:221:0x03f2, B:227:0x0401, B:229:0x041b, B:231:0x0427, B:233:0x042f, B:235:0x0439, B:237:0x0441, B:239:0x0449, B:243:0x0454, B:245:0x045a, B:249:0x0465, B:251:0x046e, B:276:0x04c5, B:278:0x04cb, B:280:0x04d2, B:281:0x04df, B:256:0x047b, B:258:0x0483, B:260:0x048b, B:262:0x0493, B:264:0x049b, B:266:0x04a3, B:268:0x04ab, B:270:0x04b5, B:272:0x04bf), top: B:319:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x052d A[Catch: zztf -> 0x0082, TryCatch #7 {zztf -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:296:0x0512, B:298:0x052d, B:300:0x0536, B:303:0x053d, B:304:0x053f, B:299:0x0530, B:306:0x0542, B:307:0x0543, B:309:0x0548, B:310:0x0549, B:311:0x0553, B:38:0x008a, B:39:0x0092, B:313:0x0555), top: B:326:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0530 A[Catch: zztf -> 0x0082, TryCatch #7 {zztf -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:296:0x0512, B:298:0x052d, B:300:0x0536, B:303:0x053d, B:304:0x053f, B:299:0x0530, B:306:0x0542, B:307:0x0543, B:309:0x0548, B:310:0x0549, B:311:0x0553, B:38:0x008a, B:39:0x0092, B:313:0x0555), top: B:326:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x053d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzti] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() throws zzik {
        zzz zzzVar;
        boolean z;
        Throwable th;
        zztf zztfVar;
        zzz zzzVar2;
        LogSessionId logSessionId;
        boolean equals;
        zzsw zzswVar;
        long j;
        long j2;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        if (this.E1 == null && !this.Z1 && (zzzVar = this.x1) != null) {
            boolean z4 = true;
            if (r0(zzzVar)) {
                J0();
                String str2 = zzzVar.f301o;
                if (!"audio/mp4a-latm".equals(str2) && !C4128Rj1.I.equals(str2) && !C4128Rj1.a0.equals(str2)) {
                    this.t1.p(1);
                } else {
                    this.t1.p(32);
                }
                this.Z1 = true;
                return;
            }
            zzsc zzscVar = this.u2;
            this.t2 = zzscVar;
            if (zzscVar != null) {
                zzdc.f(true);
                zzsc zzscVar2 = this.t2;
                boolean z5 = zzsd.a;
                zzscVar2.a();
            }
            try {
                zzz zzzVar3 = this.x1;
                ?? r13 = 0;
                if (zzzVar3 != null) {
                    if (this.J1 == null) {
                        try {
                            List M0 = M0(this.o1, zzzVar3, false);
                            M0.isEmpty();
                            this.J1 = new ArrayDeque();
                            if (!M0.isEmpty()) {
                                this.J1.add((zztc) M0.get(0));
                            }
                            this.K1 = null;
                        } catch (zztq e) {
                            throw new zztf(zzzVar3, (Throwable) e, false, (int) AbstractC3914Pe1.b.c1);
                        }
                    }
                    if (!this.J1.isEmpty()) {
                        ArrayDeque arrayDeque = this.J1;
                        if (arrayDeque != null) {
                            while (this.E1 == null) {
                                zztc zztcVar = (zztc) arrayDeque.peekFirst();
                                if (zztcVar != null) {
                                    s0(zzzVar3);
                                    if (u0(zztcVar)) {
                                        try {
                                            zzzVar2 = this.x1;
                                        } catch (Exception e2) {
                                            e = e2;
                                            z = z4;
                                            th = r13;
                                        }
                                        if (zzzVar2 != null) {
                                            String str3 = zztcVar.a;
                                            float e0 = e0(this.D1, zzzVar2, L());
                                            if (e0 <= this.p1) {
                                                e0 = -1.0f;
                                            }
                                            long b = U().b();
                                            zzsw L0 = L0(zztcVar, zzzVar2, r13, e0);
                                            if (Build.VERSION.SDK_INT >= 31) {
                                                try {
                                                    LogSessionId a = Z().a();
                                                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                                                    equals = a.equals(logSessionId);
                                                    if (!equals) {
                                                        L0.b.setString("log-session-id", C3817Oe1.a(a));
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    th = r13;
                                                    z = true;
                                                    zzdx.g(AbstractC3914Pe1.B2, "Failed to initialize decoder: ".concat(zztcVar.a), e);
                                                    arrayDeque.removeFirst();
                                                    zztf zztfVar2 = new zztf(zzzVar3, (Throwable) e, false, zztcVar);
                                                    Q0(zztfVar2);
                                                    zztfVar = this.K1;
                                                    if (zztfVar == null) {
                                                        this.K1 = zztfVar2;
                                                    } else {
                                                        this.K1 = zztf.a(zztfVar, zztfVar2);
                                                    }
                                                    if (!arrayDeque.isEmpty()) {
                                                        z4 = z;
                                                        r13 = th;
                                                    } else {
                                                        throw this.K1;
                                                    }
                                                }
                                            }
                                            Trace.beginSection("createCodec:" + str3);
                                            zzsz a2 = this.n1.a(L0);
                                            this.E1 = a2;
                                            a2.b(new zztg(this, r13));
                                            Trace.endSection();
                                            long b2 = U().b();
                                            th = r13;
                                            if (!zztcVar.e(zzzVar2)) {
                                                try {
                                                    zzswVar = L0;
                                                    StringBuilder sb = new StringBuilder();
                                                    j = b;
                                                    sb.append("id=");
                                                    sb.append(zzzVar2.a);
                                                    sb.append(", mimeType=");
                                                    sb.append(zzzVar2.f301o);
                                                    String str4 = zzzVar2.n;
                                                    if (str4 != null) {
                                                        sb.append(", container=");
                                                        sb.append(str4);
                                                    }
                                                    int i5 = zzzVar2.j;
                                                    if (i5 != -1) {
                                                        sb.append(", bitrate=");
                                                        sb.append(i5);
                                                    }
                                                    String str5 = zzzVar2.k;
                                                    if (str5 != null) {
                                                        sb.append(", codecs=");
                                                        sb.append(str5);
                                                    }
                                                    zzs zzsVar = zzzVar2.s;
                                                    if (zzsVar != null) {
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        j2 = b2;
                                                        int i6 = 0;
                                                        while (i6 < zzsVar.Y0) {
                                                            UUID uuid = zzsVar.a(i6).Y;
                                                            zzs zzsVar2 = zzsVar;
                                                            if (uuid.equals(zzh.b)) {
                                                                linkedHashSet.add("cenc");
                                                            } else if (uuid.equals(zzh.c)) {
                                                                linkedHashSet.add("clearkey");
                                                            } else if (uuid.equals(zzh.e)) {
                                                                linkedHashSet.add("playready");
                                                            } else if (uuid.equals(zzh.d)) {
                                                                linkedHashSet.add("widevine");
                                                            } else if (uuid.equals(zzh.a)) {
                                                                linkedHashSet.add("universal");
                                                            } else {
                                                                String obj = uuid.toString();
                                                                StringBuilder sb2 = new StringBuilder();
                                                                i3 = i6;
                                                                sb2.append("unknown (");
                                                                sb2.append(obj);
                                                                sb2.append(C9811tl1.d);
                                                                linkedHashSet.add(sb2.toString());
                                                                i6 = i3 + 1;
                                                                zzsVar = zzsVar2;
                                                            }
                                                            i3 = i6;
                                                            i6 = i3 + 1;
                                                            zzsVar = zzsVar2;
                                                        }
                                                        sb.append(", drm=[");
                                                        zzfuu.b(sb, linkedHashSet, ",");
                                                        sb.append(']');
                                                    } else {
                                                        j2 = b2;
                                                    }
                                                    int i7 = zzzVar2.v;
                                                    if (i7 != -1 && (i2 = zzzVar2.w) != -1) {
                                                        sb.append(", res=");
                                                        sb.append(i7);
                                                        sb.append("x");
                                                        sb.append(i2);
                                                    }
                                                    float f = zzzVar2.z;
                                                    double d = f;
                                                    int i8 = zzgav.a;
                                                    if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
                                                        sb.append(", par=");
                                                        String str6 = zzeu.a;
                                                        sb.append(String.format(Locale.US, "%.3f", Float.valueOf(f)));
                                                    }
                                                    zzk zzkVar = zzzVar2.C;
                                                    if (zzkVar != null && (zzkVar.e() || zzkVar.f())) {
                                                        sb.append(", color=");
                                                        sb.append(zzkVar.d());
                                                    }
                                                    float f2 = zzzVar2.x;
                                                    if (f2 != -1.0f) {
                                                        sb.append(", fps=");
                                                        sb.append(f2);
                                                    }
                                                    int i9 = zzzVar2.D;
                                                    if (i9 != -1) {
                                                        sb.append(", maxSubLayers=");
                                                        sb.append(i9);
                                                    }
                                                    int i10 = zzzVar2.E;
                                                    if (i10 != -1) {
                                                        sb.append(", channels=");
                                                        sb.append(i10);
                                                    }
                                                    int i11 = zzzVar2.F;
                                                    if (i11 != -1) {
                                                        sb.append(", sample_rate=");
                                                        sb.append(i11);
                                                    }
                                                    String str7 = zzzVar2.d;
                                                    if (str7 != null) {
                                                        sb.append(", language=");
                                                        sb.append(str7);
                                                    }
                                                    List list = zzzVar2.c;
                                                    if (!list.isEmpty()) {
                                                        sb.append(", labels=[");
                                                        zzfuu.b(sb, zzfys.b(list, new zzfur() { // from class: com.google.android.gms.internal.ads.zzw
                                                            @Override // com.google.android.gms.internal.ads.zzfur
                                                            public final Object apply(Object obj2) {
                                                                zzab zzabVar = (zzab) obj2;
                                                                int i12 = zzz.N;
                                                                String str8 = zzabVar.a;
                                                                String str9 = zzabVar.b;
                                                                return str8 + ": " + str9;
                                                            }
                                                        }), ",");
                                                        sb.append(C6566gU0.g);
                                                    }
                                                    int i12 = zzzVar2.e;
                                                    if (i12 != 0) {
                                                        sb.append(", selectionFlags=[");
                                                        String str8 = zzeu.a;
                                                        ArrayList arrayList = new ArrayList();
                                                        if ((i12 & 1) != 0) {
                                                            arrayList.add(JT.d);
                                                        }
                                                        if ((i12 & 2) != 0) {
                                                            arrayList.add("forced");
                                                        }
                                                        zzfuu.b(sb, arrayList, ",");
                                                        sb.append(C6566gU0.g);
                                                    }
                                                    int i13 = zzzVar2.f;
                                                    if (i13 != 0) {
                                                        sb.append(", roleFlags=[");
                                                        String str9 = zzeu.a;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        if ((i13 & 1) != 0) {
                                                            i = 32768;
                                                            arrayList2.add("main");
                                                        } else {
                                                            i = 32768;
                                                        }
                                                        if ((i13 & 2) != 0) {
                                                            arrayList2.add("alt");
                                                        }
                                                        if ((i13 & 4) != 0) {
                                                            arrayList2.add("supplementary");
                                                        }
                                                        if ((i13 & 8) != 0) {
                                                            arrayList2.add("commentary");
                                                        }
                                                        if ((i13 & 16) != 0) {
                                                            arrayList2.add("dub");
                                                        }
                                                        if ((i13 & 32) != 0) {
                                                            arrayList2.add("emergency");
                                                        }
                                                        if ((i13 & 64) != 0) {
                                                            arrayList2.add("caption");
                                                        }
                                                        if ((i13 & 128) != 0) {
                                                            arrayList2.add("subtitle");
                                                        }
                                                        if ((i13 & 256) != 0) {
                                                            arrayList2.add("sign");
                                                        }
                                                        if ((i13 & 512) != 0) {
                                                            arrayList2.add("describes-video");
                                                        }
                                                        if ((i13 & 1024) != 0) {
                                                            arrayList2.add("describes-music");
                                                        }
                                                        if ((i13 & 2048) != 0) {
                                                            arrayList2.add("enhanced-intelligibility");
                                                        }
                                                        if ((i13 & 4096) != 0) {
                                                            arrayList2.add("transcribes-dialog");
                                                        }
                                                        if ((i13 & 8192) != 0) {
                                                            arrayList2.add("easy-read");
                                                        }
                                                        if ((i13 & 16384) != 0) {
                                                            arrayList2.add("trick-play");
                                                        }
                                                        if ((i13 & i) != 0) {
                                                            arrayList2.add("auxiliary");
                                                        }
                                                        zzfuu.b(sb, arrayList2, ",");
                                                        sb.append(C6566gU0.g);
                                                    } else {
                                                        i = 32768;
                                                    }
                                                    if ((i13 & i) != 0) {
                                                        sb.append(", auxiliaryTrackType=");
                                                        int i14 = zzzVar2.g;
                                                        String str10 = zzeu.a;
                                                        if (i14 != 0) {
                                                            if (i14 != 1) {
                                                                if (i14 != 2) {
                                                                    if (i14 != 3) {
                                                                        if (i14 == 4) {
                                                                            str = "depth metadata";
                                                                        } else {
                                                                            throw new IllegalStateException("Unsupported auxiliary track type");
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        str = "depth-inverse";
                                                                    }
                                                                } else {
                                                                    str = "depth-linear";
                                                                }
                                                            } else {
                                                                str = "original";
                                                            }
                                                        } else {
                                                            str = "undefined";
                                                        }
                                                        sb.append(str);
                                                    }
                                                    String str11 = zzeu.a;
                                                    zzdx.f(AbstractC3914Pe1.B2, String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", sb.toString(), str3));
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    z = true;
                                                    zzdx.g(AbstractC3914Pe1.B2, "Failed to initialize decoder: ".concat(zztcVar.a), e);
                                                    arrayDeque.removeFirst();
                                                    zztf zztfVar22 = new zztf(zzzVar3, (Throwable) e, false, zztcVar);
                                                    Q0(zztfVar22);
                                                    zztfVar = this.K1;
                                                    if (zztfVar == null) {
                                                    }
                                                    if (!arrayDeque.isEmpty()) {
                                                    }
                                                }
                                            } else {
                                                zzswVar = L0;
                                                j = b;
                                                j2 = b2;
                                            }
                                            this.L1 = zztcVar;
                                            this.I1 = e0;
                                            this.F1 = zzzVar2;
                                            int i15 = Build.VERSION.SDK_INT;
                                            if (i15 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                                                String str12 = Build.MODEL;
                                                if (str12.startsWith("SM-T585") || str12.startsWith("SM-A510") || str12.startsWith("SM-A520") || str12.startsWith("SM-J700")) {
                                                    i4 = 2;
                                                    this.M1 = i4;
                                                    if (i15 != 29 && "c2.android.aac.decoder".equals(str3)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    this.N1 = z2;
                                                    this.O1 = false;
                                                    String str13 = zztcVar.a;
                                                    if (i15 <= 25) {
                                                        if ("OMX.rk.video_decoder.avc".equals(str13)) {
                                                        }
                                                        z3 = true;
                                                        this.R1 = z3;
                                                        if (this.E1 == null) {
                                                            if (n() == 2) {
                                                                this.T1 = U().b() + 1000;
                                                            }
                                                            z = true;
                                                            try {
                                                                this.o2.a++;
                                                                R0(str3, zzswVar, j2, j2 - j);
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                zzdx.g(AbstractC3914Pe1.B2, "Failed to initialize decoder: ".concat(zztcVar.a), e);
                                                                arrayDeque.removeFirst();
                                                                zztf zztfVar222 = new zztf(zzzVar3, (Throwable) e, false, zztcVar);
                                                                Q0(zztfVar222);
                                                                zztfVar = this.K1;
                                                                if (zztfVar == null) {
                                                                }
                                                                if (!arrayDeque.isEmpty()) {
                                                                }
                                                            }
                                                            z4 = z;
                                                            r13 = th;
                                                        } else {
                                                            throw th;
                                                        }
                                                    }
                                                    if ((i15 <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str13) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str13) && !"OMX.bcm.vdec.avc.tunnel".equals(str13) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str13) && !"OMX.bcm.vdec.hevc.tunnel".equals(str13) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str13))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zztcVar.f)) {
                                                        z3 = false;
                                                        this.R1 = z3;
                                                        if (this.E1 == null) {
                                                        }
                                                    }
                                                    z3 = true;
                                                    this.R1 = z3;
                                                    if (this.E1 == null) {
                                                    }
                                                }
                                            }
                                            i4 = 0;
                                            this.M1 = i4;
                                            if (i15 != 29) {
                                            }
                                            z2 = false;
                                            this.N1 = z2;
                                            this.O1 = false;
                                            String str132 = zztcVar.a;
                                            if (i15 <= 25) {
                                            }
                                            if (i15 <= 29) {
                                            }
                                            z3 = false;
                                            this.R1 = z3;
                                            if (this.E1 == null) {
                                            }
                                        } else {
                                            throw r13;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    throw r13;
                                }
                            }
                            this.J1 = r13;
                            return;
                        }
                        throw null;
                    }
                    throw new zztf(zzzVar3, (Throwable) null, false, (int) AbstractC3914Pe1.b.b1);
                }
                throw null;
            } catch (zztf e6) {
                throw P(e6, zzzVar, false, AD1.p1);
            }
        }
    }

    @InterfaceC2591Bt
    public void j0(long j) {
        this.q2 = j;
        while (true) {
            ArrayDeque arrayDeque = this.v1;
            if (!arrayDeque.isEmpty() && j >= ((zzth) arrayDeque.peek()).a) {
                zzth zzthVar = (zzth) arrayDeque.poll();
                zzthVar.getClass();
                y0(zzthVar);
                V0();
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final int k(zzz zzzVar) throws zzik {
        try {
            return G0(this.o1, zzzVar);
        } catch (zztq e) {
            throw P(e, zzzVar, false, AD1.q1);
        }
    }

    public void k0(zzhp zzhpVar) throws zzik {
    }

    public final void l0() {
        try {
            zzsz zzszVar = this.E1;
            if (zzszVar != null) {
                zzszVar.m();
                this.o2.b++;
                zztc zztcVar = this.L1;
                if (zztcVar != null) {
                    S0(zztcVar.a);
                } else {
                    throw null;
                }
            }
            this.E1 = null;
            this.A1 = null;
            this.t2 = null;
            n0();
        } catch (Throwable th) {
            this.E1 = null;
            this.A1 = null;
            this.t2 = null;
            n0();
            throw th;
        }
    }

    @InterfaceC2591Bt
    public void m0() {
        U0();
        w0();
        this.T1 = C10323vs.b;
        this.h2 = false;
        this.S1 = C10323vs.b;
        this.g2 = false;
        this.P1 = false;
        this.Q1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.j2 = C10323vs.b;
        this.k2 = C10323vs.b;
        this.q2 = C10323vs.b;
        this.e2 = 0;
        this.f2 = 0;
        this.d2 = this.c2 ? 1 : 0;
    }

    @InterfaceC2591Bt
    public final void n0() {
        m0();
        this.J1 = null;
        this.L1 = null;
        this.F1 = null;
        this.G1 = null;
        this.H1 = false;
        this.i2 = false;
        this.I1 = -1.0f;
        this.M1 = 0;
        this.N1 = false;
        this.O1 = false;
        this.R1 = false;
        this.c2 = false;
        this.d2 = 0;
    }

    public final boolean o0() throws zzik {
        boolean p0 = p0();
        if (p0) {
            i0();
        }
        return p0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x02db, code lost:
        if (r22.y1 != null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x033f, code lost:
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0383, code lost:
        if (r22.R1 != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0385, code lost:
        r22.h2 = true;
        r2.d(r22.U1, 0, 0, 0, 4);
        U0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0398, code lost:
        r22.e2 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x034b A[LOOP:0: B:125:0x01ec->B:219:0x034b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x034a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable, android.media.MediaFormat] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.zzlv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(long j, long j2) throws zzik {
        boolean z;
        boolean z2;
        ?? r10;
        boolean z3;
        boolean z4;
        ?? r2;
        boolean z5;
        Throwable th;
        long j3;
        boolean z6 = true;
        try {
            try {
                if (this.m2) {
                    W0();
                    return;
                }
                int i = 2;
                if (this.x1 == null && !D0(2)) {
                    return;
                }
                i0();
                ?? r5 = 65531;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            if (this.Z1) {
                                try {
                                    try {
                                        Trace.beginSection("bypassRender");
                                        while (true) {
                                            zzdc.f(this.m2 ^ z6);
                                            zzsq zzsqVar = this.t1;
                                            if (zzsqVar.r()) {
                                                ByteBuffer byteBuffer = zzsqVar.d;
                                                int i2 = this.V1;
                                                int n = zzsqVar.n();
                                                long j4 = zzsqVar.f;
                                                boolean C0 = C0(R(), zzsqVar.o());
                                                boolean f = zzsqVar.f();
                                                zzz zzzVar = this.y1;
                                                if (zzzVar != null) {
                                                    if (!X0(j, j2, null, byteBuffer, i2, 0, n, j4, C0, f, zzzVar)) {
                                                        z6 = true;
                                                        break;
                                                    }
                                                    j0(zzsqVar.o());
                                                    zzsqVar.b();
                                                    r2 = 0;
                                                } else {
                                                    throw th2;
                                                }
                                            } else {
                                                r2 = th2;
                                            }
                                            try {
                                                if (!this.l2) {
                                                    z6 = true;
                                                    if (this.a2) {
                                                        zzdc.f(zzsqVar.q(this.s1));
                                                        z5 = false;
                                                        this.a2 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (this.b2) {
                                                        if (!zzsqVar.r()) {
                                                            J0();
                                                            this.b2 = z5;
                                                            i0();
                                                            if (!this.Z1) {
                                                                break;
                                                            }
                                                        } else {
                                                            th2 = r2;
                                                        }
                                                    }
                                                    zzdc.f(!this.l2);
                                                    zzkq W = W();
                                                    zzhp zzhpVar = this.s1;
                                                    zzhpVar.b();
                                                    do {
                                                        zzhpVar.b();
                                                        int O = O(W, zzhpVar, z5 ? 1 : 0);
                                                        if (O == -5) {
                                                            I0(W);
                                                            break;
                                                        } else if (O == -4) {
                                                            if (!zzhpVar.f()) {
                                                                long max = Math.max(this.j2, zzhpVar.f);
                                                                this.j2 = max;
                                                                if (d0() || this.r1.h()) {
                                                                    this.k2 = max;
                                                                }
                                                                if (this.n2) {
                                                                    zzz zzzVar2 = this.x1;
                                                                    if (zzzVar2 != null) {
                                                                        this.y1 = zzzVar2;
                                                                        if (Objects.equals(zzzVar2.f301o, C4128Rj1.a0) && !this.y1.r.isEmpty()) {
                                                                            int a = zzaei.a((byte[]) this.y1.r.get(z5 ? 1 : 0));
                                                                            zzx b = this.y1.b();
                                                                            b.i(a);
                                                                            this.y1 = b.K();
                                                                        }
                                                                        T0(this.y1, r2);
                                                                        this.n2 = z5;
                                                                    } else {
                                                                        throw r2;
                                                                    }
                                                                }
                                                                zzhpVar.k();
                                                                zzz zzzVar3 = this.y1;
                                                                if (zzzVar3 != null && Objects.equals(zzzVar3.f301o, C4128Rj1.a0)) {
                                                                    if (zzhpVar.e()) {
                                                                        zzhpVar.b = this.y1;
                                                                        P0(zzhpVar);
                                                                    }
                                                                    if (zzaei.f(R(), zzhpVar.f)) {
                                                                        this.w1.a(zzhpVar, this.y1.r);
                                                                    }
                                                                }
                                                                if (zzsqVar.r()) {
                                                                    long R = R();
                                                                    if (C0(R, zzsqVar.o()) != C0(R, zzhpVar.f)) {
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                this.l2 = true;
                                                                this.k2 = this.j2;
                                                                break;
                                                            }
                                                        } else if (d0()) {
                                                            this.k2 = this.j2;
                                                        }
                                                    } while (zzsqVar.q(zzhpVar));
                                                    this.a2 = true;
                                                    if (zzsqVar.r()) {
                                                        zzsqVar.k();
                                                    }
                                                    if (!zzsqVar.r() && !this.l2 && !this.b2) {
                                                        break;
                                                    }
                                                    th2 = r2;
                                                } else {
                                                    z6 = true;
                                                    this.m2 = true;
                                                    break;
                                                }
                                            } catch (IllegalStateException e) {
                                                e = e;
                                                z6 = true;
                                                r5 = 0;
                                                z = z6;
                                                r10 = r5;
                                                z3 = e instanceof MediaCodec.CodecException;
                                                if (!z3) {
                                                    StackTraceElement[] stackTrace = e.getStackTrace();
                                                    if (stackTrace.length <= 0 || !stackTrace[r10].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                Q0(e);
                                                z4 = (z3 || !((MediaCodec.CodecException) e).isRecoverable()) ? r10 : z;
                                                if (z4) {
                                                    l0();
                                                }
                                                zztb f0 = f0(e, this.L1);
                                                throw P(f0, this.x1, z4, f0.X != 1101 ? 4006 : AD1.r1);
                                            }
                                        }
                                        z5 = false;
                                        Trace.endSection();
                                    } catch (MediaCodec.CryptoException e2) {
                                        e = e2;
                                        r5 = 0;
                                        z2 = r5;
                                        throw P(e, this.x1, z2, zzeu.G(e.getErrorCode()));
                                    }
                                } catch (IllegalStateException e3) {
                                    e = e3;
                                }
                            } else {
                                char c = 65531;
                                Throwable th3 = null;
                                boolean z7 = false;
                                if (this.E1 != null) {
                                    long b2 = U().b();
                                    Trace.beginSection("drainAndFeed");
                                    long j5 = b2;
                                    while (true) {
                                        zzsz zzszVar = this.E1;
                                        if (zzszVar != null) {
                                            if (!B0()) {
                                                MediaCodec.BufferInfo bufferInfo = this.u1;
                                                int l = zzszVar.l(bufferInfo);
                                                if (l >= 0) {
                                                    if (this.Q1) {
                                                        this.Q1 = z7;
                                                        zzszVar.k(l, z7);
                                                        th = th3;
                                                        j3 = j5;
                                                        if (!E0(j3)) {
                                                        }
                                                    } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                        O0();
                                                        break;
                                                    } else {
                                                        this.V1 = l;
                                                        ByteBuffer A = zzszVar.A(l);
                                                        this.W1 = A;
                                                        if (A != null) {
                                                            A.position(bufferInfo.offset);
                                                            this.W1.limit(bufferInfo.offset + bufferInfo.size);
                                                        }
                                                        this.X1 = bufferInfo.presentationTimeUs < R() ? z6 : z7;
                                                        long j6 = this.k2;
                                                        this.Y1 = (j6 == C10323vs.b || j6 > bufferInfo.presentationTimeUs) ? z7 : z6;
                                                        zzz zzzVar4 = (zzz) this.p2.d.c(bufferInfo.presentationTimeUs);
                                                        if (zzzVar4 == null && this.r2 && this.G1 != null) {
                                                            zzzVar4 = (zzz) this.p2.d.b();
                                                        }
                                                        if (zzzVar4 != null) {
                                                            this.y1 = zzzVar4;
                                                        } else if (this.H1) {
                                                        }
                                                        zzz zzzVar5 = this.y1;
                                                        if (zzzVar5 != null) {
                                                            T0(zzzVar5, this.G1);
                                                            this.H1 = z7;
                                                            this.r2 = z7;
                                                        } else {
                                                            throw th3;
                                                        }
                                                    }
                                                } else if (l == -2) {
                                                    this.i2 = z6;
                                                    zzsz zzszVar2 = this.E1;
                                                    if (zzszVar2 != null) {
                                                        MediaFormat c2 = zzszVar2.c();
                                                        if (this.M1 != 0 && c2.getInteger("width") == 32 && c2.getInteger("height") == 32) {
                                                            this.Q1 = z6;
                                                        } else {
                                                            this.G1 = c2;
                                                            this.H1 = z6;
                                                        }
                                                        th = th3;
                                                        j3 = j5;
                                                        if (!E0(j3)) {
                                                            break;
                                                        }
                                                        j5 = j3;
                                                        th3 = th;
                                                        z6 = true;
                                                        i = 2;
                                                        z7 = false;
                                                        c = 65531;
                                                    } else {
                                                        throw th3;
                                                    }
                                                } else {
                                                    if (this.R1 && (this.l2 || this.e2 == i)) {
                                                        O0();
                                                    }
                                                    long j7 = this.S1;
                                                    if (j7 != C10323vs.b && j7 + 100 < U().a()) {
                                                        O0();
                                                    }
                                                }
                                            }
                                            ByteBuffer byteBuffer2 = this.W1;
                                            int i3 = this.V1;
                                            MediaCodec.BufferInfo bufferInfo2 = this.u1;
                                            long j8 = j5;
                                            int i4 = bufferInfo2.flags;
                                            long j9 = bufferInfo2.presentationTimeUs;
                                            boolean z8 = this.X1;
                                            boolean z9 = this.Y1;
                                            zzz zzzVar6 = this.y1;
                                            if (zzzVar6 != null) {
                                                th = th3;
                                                if (!X0(j, j2, zzszVar, byteBuffer2, i3, i4, 1, j9, z8, z9, zzzVar6)) {
                                                    break;
                                                }
                                                j0(bufferInfo2.presentationTimeUs);
                                                boolean z10 = (bufferInfo2.flags & 4) != 0;
                                                if (!z10 && this.h2 && this.Y1) {
                                                    this.S1 = U().a();
                                                }
                                                w0();
                                                if (z10) {
                                                    O0();
                                                    break;
                                                } else {
                                                    j3 = j8;
                                                    if (!E0(j3)) {
                                                    }
                                                }
                                            } else {
                                                throw th3;
                                            }
                                        } else {
                                            throw th3;
                                        }
                                    }
                                    th = th3;
                                    j3 = j5;
                                    while (true) {
                                        zzsz zzszVar3 = this.E1;
                                        if (zzszVar3 == null || this.e2 == 2 || this.l2) {
                                            break;
                                        }
                                        if (this.U1 < 0) {
                                            int a2 = zzszVar3.a();
                                            this.U1 = a2;
                                            if (a2 < 0) {
                                                break;
                                            }
                                            zzhp zzhpVar2 = this.r1;
                                            zzhpVar2.d = zzszVar3.S(a2);
                                            zzhpVar2.b();
                                        }
                                        z = true;
                                        if (this.e2 == 1) {
                                            break;
                                        }
                                        try {
                                            if (this.P1) {
                                                this.P1 = false;
                                                ByteBuffer byteBuffer3 = this.r1.d;
                                                if (byteBuffer3 != null) {
                                                    byteBuffer3.put(v2);
                                                    zzszVar3.d(this.U1, 0, 38, 0L, 0);
                                                    U0();
                                                    this.g2 = true;
                                                } else {
                                                    throw th;
                                                }
                                            } else {
                                                z2 = false;
                                                r10 = 0;
                                                if (this.d2 == 1) {
                                                    int i5 = 0;
                                                    while (true) {
                                                        zzz zzzVar7 = this.F1;
                                                        if (zzzVar7 != null) {
                                                            if (i5 < zzzVar7.r.size()) {
                                                                byte[] bArr = (byte[]) this.F1.r.get(i5);
                                                                ByteBuffer byteBuffer4 = this.r1.d;
                                                                if (byteBuffer4 != null) {
                                                                    byteBuffer4.put(bArr);
                                                                    i5++;
                                                                } else {
                                                                    throw th;
                                                                }
                                                            } else {
                                                                this.d2 = 2;
                                                                break;
                                                            }
                                                        } else {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                zzhp zzhpVar3 = this.r1;
                                                ByteBuffer byteBuffer5 = zzhpVar3.d;
                                                if (byteBuffer5 != null) {
                                                    int position = byteBuffer5.position();
                                                    zzkq W2 = W();
                                                    try {
                                                        int O2 = O(W2, zzhpVar3, 0);
                                                        if (O2 == -3) {
                                                            if (d0()) {
                                                                this.k2 = this.j2;
                                                            }
                                                        } else if (O2 == -5) {
                                                            if (this.d2 == 2) {
                                                                this.r1.b();
                                                                this.d2 = 1;
                                                            }
                                                            I0(W2);
                                                        } else {
                                                            zzhp zzhpVar4 = this.r1;
                                                            if (zzhpVar4.f()) {
                                                                this.k2 = this.j2;
                                                                if (this.d2 == 2) {
                                                                    zzhpVar4.b();
                                                                    this.d2 = 1;
                                                                }
                                                                this.l2 = true;
                                                                if (!this.g2) {
                                                                    O0();
                                                                } else if (!this.R1) {
                                                                    this.h2 = true;
                                                                    zzszVar3.d(this.U1, 0, 0, 0L, 4);
                                                                    U0();
                                                                }
                                                            } else if (!this.g2 && !zzhpVar4.g()) {
                                                                zzhpVar4.b();
                                                                if (this.d2 == 2) {
                                                                    this.d2 = 1;
                                                                }
                                                            } else if (!t0(zzhpVar4)) {
                                                                boolean l2 = zzhpVar4.l();
                                                                if (l2) {
                                                                    zzhpVar4.c.b(position);
                                                                }
                                                                long j10 = zzhpVar4.f;
                                                                if (this.n2) {
                                                                    ArrayDeque arrayDeque = this.v1;
                                                                    if (!arrayDeque.isEmpty()) {
                                                                        zzeq zzeqVar = ((zzth) arrayDeque.peekLast()).d;
                                                                        zzz zzzVar8 = this.x1;
                                                                        if (zzzVar8 != null) {
                                                                            zzeqVar.d(j10, zzzVar8);
                                                                        } else {
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        zzeq zzeqVar2 = this.p2.d;
                                                                        zzz zzzVar9 = this.x1;
                                                                        if (zzzVar9 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzeqVar2.d(j10, zzzVar9);
                                                                    }
                                                                    this.n2 = false;
                                                                }
                                                                long max2 = Math.max(this.j2, j10);
                                                                this.j2 = max2;
                                                                if (d0() || zzhpVar4.h()) {
                                                                    this.k2 = max2;
                                                                }
                                                                zzhpVar4.k();
                                                                if (zzhpVar4.e()) {
                                                                    P0(zzhpVar4);
                                                                }
                                                                k0(zzhpVar4);
                                                                if (l2) {
                                                                    zzszVar3.g(this.U1, 0, zzhpVar4.c, j10, 0);
                                                                } else {
                                                                    int i6 = this.U1;
                                                                    ByteBuffer byteBuffer6 = zzhpVar4.d;
                                                                    if (byteBuffer6 != null) {
                                                                        zzszVar3.d(i6, 0, byteBuffer6.limit(), j10, 0);
                                                                    } else {
                                                                        throw th;
                                                                    }
                                                                }
                                                                U0();
                                                                this.g2 = true;
                                                                this.d2 = 0;
                                                                this.o2.c++;
                                                            }
                                                        }
                                                    } catch (zzho e4) {
                                                        Q0(e4);
                                                        D0(0);
                                                        N0();
                                                    }
                                                } else {
                                                    throw th;
                                                }
                                            }
                                            if (!E0(j3)) {
                                                break;
                                            }
                                        } catch (IllegalStateException e5) {
                                            e = e5;
                                            r10 = 0;
                                            z3 = e instanceof MediaCodec.CodecException;
                                            if (!z3) {
                                            }
                                            Q0(e);
                                            if (z3) {
                                            }
                                            if (z4) {
                                            }
                                            zztb f02 = f0(e, this.L1);
                                            throw P(f02, this.x1, z4, f02.X != 1101 ? 4006 : AD1.r1);
                                        }
                                    }
                                    Trace.endSection();
                                } else {
                                    this.o2.d += Q(j);
                                    D0(1);
                                }
                            }
                            this.o2.a();
                        } catch (MediaCodec.CryptoException e6) {
                            e = e6;
                        } catch (IllegalStateException e7) {
                            e = e7;
                        }
                    } catch (MediaCodec.CryptoException e8) {
                        e = e8;
                        throw P(e, this.x1, z2, zzeu.G(e.getErrorCode()));
                    } catch (IllegalStateException e9) {
                        e = e9;
                        z3 = e instanceof MediaCodec.CodecException;
                        if (!z3) {
                        }
                        Q0(e);
                        if (z3) {
                        }
                        if (z4) {
                        }
                        zztb f022 = f0(e, this.L1);
                        throw P(f022, this.x1, z4, f022.X != 1101 ? 4006 : AD1.r1);
                    }
                } catch (IllegalStateException e10) {
                    e = e10;
                    r10 = 0;
                    z = true;
                    z3 = e instanceof MediaCodec.CodecException;
                    if (!z3) {
                    }
                    Q0(e);
                    if (z3) {
                    }
                    if (z4) {
                    }
                    zztb f0222 = f0(e, this.L1);
                    throw P(f0222, this.x1, z4, f0222.X != 1101 ? 4006 : AD1.r1);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                z = true;
            }
        } catch (MediaCodec.CryptoException e12) {
            e = e12;
            z2 = false;
        }
    }

    public boolean p0() {
        if (this.E1 == null) {
            return false;
        }
        int i = this.f2;
        if (i != 3 && ((!this.N1 || this.i2) && (!this.O1 || !this.h2))) {
            if (i == 2) {
                try {
                    z0();
                } catch (zzik e) {
                    zzdx.g(AbstractC3914Pe1.B2, "Failed to update the DRM session, releasing the codec instead.", e);
                    l0();
                    return true;
                }
            }
            N0();
            return false;
        }
        l0();
        return true;
    }

    public final boolean q0() {
        return this.Z1;
    }

    public final boolean r0(zzz zzzVar) {
        if (this.u2 == null && Y0(zzzVar)) {
            return true;
        }
        return false;
    }

    public boolean s0(zzz zzzVar) throws zzik {
        return true;
    }

    public boolean t0(zzhp zzhpVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlv
    public void u(float f, float f2) throws zzik {
        this.C1 = f;
        this.D1 = f2;
        F0(this.F1);
    }

    public boolean u0(zztc zztcVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlq
    public void w(int i, @InterfaceC11300zs1 Object obj) throws zzik {
        if (i == 11) {
            zzlu zzluVar = (zzlu) obj;
            zzluVar.getClass();
            this.z1 = zzluVar;
        }
    }

    public final void w0() {
        this.V1 = -1;
        this.W1 = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public boolean x0() {
        return this.m2;
    }

    public final void y0(zzth zzthVar) {
        this.p2 = zzthVar;
        if (zzthVar.c != C10323vs.b) {
            this.r2 = true;
        }
    }
}
