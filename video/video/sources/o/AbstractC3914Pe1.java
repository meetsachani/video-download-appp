package o;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o.C5137af1;
import o.C9267rW;
import o.InterfaceC2827Ee1;
import o.InterfaceC7201j70;

@Deprecated
/* renamed from: o.Pe1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3914Pe1 extends AbstractC2853El {
    public static final float A2 = -1.0f;
    public static final String B2 = "MediaCodecRenderer";
    public static final long C2 = 1000;
    public static final int D2 = 0;
    public static final int E2 = 1;
    public static final int F2 = 2;
    public static final int G2 = 0;
    public static final int H2 = 1;
    public static final int I2 = 2;
    public static final int J2 = 0;
    public static final int K2 = 1;
    public static final int L2 = 2;
    public static final int M2 = 3;
    public static final int N2 = 0;
    public static final int O2 = 1;
    public static final int P2 = 2;
    public static final byte[] Q2 = {0, 0, 1, 103, 66, C2638Cg0.o7, C8077mf.m, C2638Cg0.B7, C3307Iz.X, -112, 0, 0, 1, 104, C2638Cg0.z7, C8077mf.q, 19, 32, 0, 0, 1, 101, -120, -124, 13, C2638Cg0.z7, 113, C8077mf.B, -96, 0, 47, -65, 28, 49, C2638Cg0.r7, C3307Iz.Z, 93, QC1.w};
    public static final int R2 = 32;
    @InterfaceC11300zs1
    public MediaCrypto A1;
    public boolean B1;
    public long C1;
    public float D1;
    public float E1;
    @InterfaceC11300zs1
    public InterfaceC2827Ee1 F1;
    @InterfaceC11300zs1
    public C10833xx0 G1;
    @InterfaceC11300zs1
    public MediaFormat H1;
    public boolean I1;
    public float J1;
    @InterfaceC11300zs1
    public ArrayDeque<C3621Me1> K1;
    @InterfaceC11300zs1
    public b L1;
    @InterfaceC11300zs1
    public C3621Me1 M1;
    public int N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    @InterfaceC11300zs1
    public C10812xs Y1;
    public long Z1;
    public int a2;
    public int b2;
    @InterfaceC11300zs1
    public ByteBuffer c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public int j2;
    public final InterfaceC2827Ee1.b k1;
    public int k2;
    public final InterfaceC4108Re1 l1;
    public int l2;
    public final boolean m1;
    public boolean m2;
    public final float n1;
    public boolean n2;
    public final C9267rW o1;
    public boolean o2;
    public final C9267rW p1;
    public long p2;
    public final C9267rW q1;
    public long q2;
    public final C5891dm r1;
    public boolean r2;
    public final ArrayList<Long> s1;
    public boolean s2;
    public final MediaCodec.BufferInfo t1;
    public boolean t2;
    public final ArrayDeque<c> u1;
    public boolean u2;
    public final C7635ku1 v1;
    @InterfaceC11300zs1
    public C3824Og0 v2;
    @InterfaceC11300zs1
    public C10833xx0 w1;
    public C8775pW w2;
    @InterfaceC11300zs1
    public C10833xx0 x1;
    public c x2;
    @InterfaceC11300zs1
    public InterfaceC7201j70 y1;
    public long y2;
    @InterfaceC11300zs1
    public InterfaceC7201j70 z1;
    public boolean z2;

    @ES1(31)
    /* renamed from: o.Pe1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static void a(InterfaceC2827Ee1.a aVar, ND1 nd1) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a = nd1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (!equals) {
                MediaFormat mediaFormat = aVar.b;
                stringId = a.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
    }

    /* renamed from: o.Pe1$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final c e = new c(C10323vs.b, C10323vs.b, C10323vs.b);
        public final long a;
        public final long b;
        public final long c;
        public final C6889hp2<C10833xx0> d = new C6889hp2<>();

        public c(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public AbstractC3914Pe1(int i, InterfaceC2827Ee1.b bVar, InterfaceC4108Re1 interfaceC4108Re1, boolean z, float f) {
        super(i);
        this.k1 = bVar;
        this.l1 = (InterfaceC4108Re1) C9542sf.g(interfaceC4108Re1);
        this.m1 = z;
        this.n1 = f;
        this.o1 = C9267rW.z();
        this.p1 = new C9267rW(0);
        this.q1 = new C9267rW(2);
        C5891dm c5891dm = new C5891dm();
        this.r1 = c5891dm;
        this.s1 = new ArrayList<>();
        this.t1 = new MediaCodec.BufferInfo();
        this.D1 = 1.0f;
        this.E1 = 1.0f;
        this.C1 = C10323vs.b;
        this.u1 = new ArrayDeque<>();
        s1(c.e);
        c5891dm.w(0);
        c5891dm.Y0.order(ByteOrder.nativeOrder());
        this.v1 = new C7635ku1();
        this.J1 = -1.0f;
        this.N1 = 0;
        this.j2 = 0;
        this.a2 = -1;
        this.b2 = -1;
        this.Z1 = C10323vs.b;
        this.p2 = C10323vs.b;
        this.q2 = C10323vs.b;
        this.y2 = C10323vs.b;
        this.k2 = 0;
        this.l2 = 0;
    }

    public static boolean C1(C10833xx0 c10833xx0) {
        int i = c10833xx0.B1;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    public static boolean R0(IllegalStateException illegalStateException) {
        if (TD2.a >= 21 && S0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return true;
        }
        return false;
    }

    @ES1(21)
    public static boolean S0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @ES1(21)
    public static boolean T0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    @TargetApi(23)
    private void g1() throws C3824Og0 {
        int i = this.l2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.s2 = true;
                    m1();
                    return;
                }
                k1();
                return;
            }
            x0();
            F1();
            return;
        }
        x0();
    }

    public static boolean h0(String str, C10833xx0 c10833xx0) {
        if (TD2.a < 21 && c10833xx0.i1.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean i0(String str) {
        if (TD2.a < 21 && "OMX.SEC.mp3.dec".equals(str) && D71.b.equals(TD2.c)) {
            String str2 = TD2.b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j0(String str) {
        int i = TD2.a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = TD2.b;
                if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
                    if ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean k0(String str) {
        if (TD2.a == 21 && "OMX.google.aac.decoder".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean l0(C3621Me1 c3621Me1) {
        String str = c3621Me1.a;
        int i = TD2.a;
        if (i > 25 || !"OMX.rk.video_decoder.avc".equals(str)) {
            if (i > 17 || !"OMX.allwinner.video.decoder.avc".equals(str)) {
                if (i > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str) && !"OMX.bcm.vdec.avc.tunnel".equals(str) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str) && !"OMX.bcm.vdec.hevc.tunnel".equals(str) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
                    if ("Amazon".equals(TD2.c) && "AFTS".equals(TD2.d) && c3621Me1.g) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean m0(String str) {
        int i = TD2.a;
        if (i >= 18) {
            if (i != 18 || (!"OMX.SEC.avc.dec".equals(str) && !"OMX.SEC.avc.dec.secure".equals(str))) {
                if (i == 19 && TD2.d.startsWith("SM-G800")) {
                    if (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean n0(String str, C10833xx0 c10833xx0) {
        if (TD2.a <= 18 && c10833xx0.t1 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean o0(String str) {
        if (TD2.a == 29 && "c2.android.aac.decoder".equals(str)) {
            return true;
        }
        return false;
    }

    private boolean w0() throws C3824Og0 {
        int i;
        if (this.F1 == null || (i = this.k2) == 2 || this.r2) {
            return false;
        }
        if (i == 0 && z1()) {
            s0();
        }
        if (this.a2 < 0) {
            int l = this.F1.l();
            this.a2 = l;
            if (l < 0) {
                return false;
            }
            this.p1.Y0 = this.F1.d(l);
            this.p1.l();
        }
        if (this.k2 == 1) {
            if (!this.X1) {
                this.n2 = true;
                this.F1.h(this.a2, 0, 0, 0L, 4);
                p1();
            }
            this.k2 = 2;
            return false;
        } else if (this.V1) {
            this.V1 = false;
            ByteBuffer byteBuffer = this.p1.Y0;
            byte[] bArr = Q2;
            byteBuffer.put(bArr);
            this.F1.h(this.a2, 0, bArr.length, 0L, 0);
            p1();
            this.m2 = true;
            return true;
        } else {
            if (this.j2 == 1) {
                for (int i2 = 0; i2 < this.G1.i1.size(); i2++) {
                    this.p1.Y0.put(this.G1.i1.get(i2));
                }
                this.j2 = 2;
            }
            int position = this.p1.Y0.position();
            C2899Ex0 L = L();
            try {
                int a0 = a0(L, this.p1, 0);
                if (k() || this.p1.t()) {
                    this.q2 = this.p2;
                }
                if (a0 == -3) {
                    return false;
                }
                if (a0 == -5) {
                    if (this.j2 == 2) {
                        this.p1.l();
                        this.j2 = 1;
                    }
                    Z0(L);
                    return true;
                } else if (this.p1.q()) {
                    if (this.j2 == 2) {
                        this.p1.l();
                        this.j2 = 1;
                    }
                    this.r2 = true;
                    if (!this.m2) {
                        g1();
                        return false;
                    }
                    try {
                        if (!this.X1) {
                            this.n2 = true;
                            this.F1.h(this.a2, 0, 0, 0L, 4);
                            p1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw I(e, this.w1, TD2.l0(e.getErrorCode()));
                    }
                } else if (!this.m2 && !this.p1.s()) {
                    this.p1.l();
                    if (this.j2 == 2) {
                        this.j2 = 1;
                    }
                    return true;
                } else {
                    boolean y = this.p1.y();
                    if (y) {
                        this.p1.Z.b(position);
                    }
                    if (this.O1 && !y) {
                        C9337ro1.b(this.p1.Y0);
                        if (this.p1.Y0.position() == 0) {
                            return true;
                        }
                        this.O1 = false;
                    }
                    C9267rW c9267rW = this.p1;
                    long j = c9267rW.a1;
                    C10812xs c10812xs = this.Y1;
                    if (c10812xs != null) {
                        j = c10812xs.d(this.w1, c9267rW);
                        this.p2 = Math.max(this.p2, this.Y1.b(this.w1));
                    }
                    long j2 = j;
                    if (this.p1.p()) {
                        this.s1.add(Long.valueOf(j2));
                    }
                    if (this.t2) {
                        if (!this.u1.isEmpty()) {
                            this.u1.peekLast().d.a(j2, this.w1);
                        } else {
                            this.x2.d.a(j2, this.w1);
                        }
                        this.t2 = false;
                    }
                    this.p2 = Math.max(this.p2, j2);
                    this.p1.x();
                    if (this.p1.o()) {
                        L0(this.p1);
                    }
                    e1(this.p1);
                    try {
                        if (y) {
                            this.F1.o(this.a2, 0, this.p1.Z, j2, 0);
                        } else {
                            this.F1.h(this.a2, 0, this.p1.Y0.limit(), j2, 0);
                        }
                        p1();
                        this.m2 = true;
                        this.j2 = 0;
                        this.w2.c++;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw I(e2, this.w1, TD2.l0(e2.getErrorCode()));
                    }
                }
            } catch (C9267rW.b e3) {
                W0(e3);
                j1(0);
                x0();
                return true;
            }
        }
    }

    private void w1(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.z1, interfaceC7201j70);
        this.z1 = interfaceC7201j70;
    }

    @Override // o.InterfaceC10469wR1
    public void A(float f, float f2) throws C3824Og0 {
        this.D1 = f;
        this.E1 = f2;
        E1(this.G1);
    }

    public final List<C3621Me1> A0(boolean z) throws C5137af1.c {
        List<C3621Me1> H0 = H0(this.l1, this.w1, z);
        if (H0.isEmpty() && z) {
            List<C3621Me1> H02 = H0(this.l1, this.w1, false);
            if (!H02.isEmpty()) {
                I31.n(B2, "Drm session requires secure decoder for " + this.w1.g1 + ", but no secure decoder available. Trying to proceed with " + H02 + UE.h);
            }
            return H02;
        }
        return H0;
    }

    public boolean A1(C10833xx0 c10833xx0) {
        return false;
    }

    @Override // o.AbstractC2853El, o.InterfaceC10712xR1
    public final int B() {
        return 8;
    }

    @InterfaceC11300zs1
    public final InterfaceC2827Ee1 B0() {
        return this.F1;
    }

    public abstract int B1(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0) throws C5137af1.c;

    @InterfaceC11300zs1
    public final C3621Me1 C0() {
        return this.M1;
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) throws C3824Og0 {
        boolean z = false;
        if (this.u2) {
            this.u2 = false;
            g1();
        }
        C3824Og0 c3824Og0 = this.v2;
        if (c3824Og0 == null) {
            try {
                if (this.s2) {
                    m1();
                    return;
                } else if (this.w1 == null && !j1(2)) {
                    return;
                } else {
                    U0();
                    if (this.f2) {
                        C7624kr2.a("bypassRender");
                        while (e0(j, j2)) {
                        }
                        C7624kr2.c();
                    } else if (this.F1 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C7624kr2.a("drainAndFeed");
                        while (u0(j, j2) && x1(elapsedRealtime)) {
                        }
                        while (w0() && x1(elapsedRealtime)) {
                        }
                        C7624kr2.c();
                    } else {
                        this.w2.d += c0(j);
                        j1(1);
                    }
                    this.w2.c();
                    return;
                }
            } catch (IllegalStateException e) {
                if (R0(e)) {
                    W0(e);
                    if (TD2.a >= 21 && T0(e)) {
                        z = true;
                    }
                    if (z) {
                        l1();
                    }
                    throw J(p0(e, C0()), this.w1, z, AD1.r1);
                }
                throw e;
            }
        }
        this.v2 = null;
        throw c3824Og0;
    }

    public boolean D0() {
        return false;
    }

    public final boolean D1() throws C3824Og0 {
        return E1(this.G1);
    }

    public float E0() {
        return this.J1;
    }

    public final boolean E1(C10833xx0 c10833xx0) throws C3824Og0 {
        if (TD2.a >= 23 && this.F1 != null && this.l2 != 3 && getState() != 0) {
            float F0 = F0(this.E1, c10833xx0, P());
            float f = this.J1;
            if (f == F0) {
                return true;
            }
            if (F0 == -1.0f) {
                s0();
                return false;
            } else if (f == -1.0f && F0 <= this.n1) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", F0);
                this.F1.j(bundle);
                this.J1 = F0;
            }
        }
        return true;
    }

    public float F0(float f, C10833xx0 c10833xx0, C10833xx0[] c10833xx0Arr) {
        return -1.0f;
    }

    @ES1(23)
    public final void F1() throws C3824Og0 {
        InterfaceC7280jR d = this.z1.d();
        if (d instanceof C4479Uz0) {
            try {
                this.A1.setMediaDrmSession(((C4479Uz0) d).b);
            } catch (MediaCryptoException e) {
                throw I(e, this.w1, AD1.C1);
            }
        }
        r1(this.z1);
        this.k2 = 0;
        this.l2 = 0;
    }

    @InterfaceC11300zs1
    public final MediaFormat G0() {
        return this.H1;
    }

    public final void G1(long j) throws C3824Og0 {
        C10833xx0 j2 = this.x2.d.j(j);
        if (j2 == null && this.z2 && this.H1 != null) {
            j2 = this.x2.d.i();
        }
        if (j2 != null) {
            this.x1 = j2;
        } else if (!this.I1 || this.x1 == null) {
            return;
        }
        a1(this.x1, this.H1);
        this.I1 = false;
        this.z2 = false;
    }

    public abstract List<C3621Me1> H0(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z) throws C5137af1.c;

    public abstract InterfaceC2827Ee1.a I0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f);

    public final long J0() {
        return this.x2.c;
    }

    public float K0() {
        return this.D1;
    }

    public final boolean M0() {
        if (this.b2 >= 0) {
            return true;
        }
        return false;
    }

    public final void N0(C10833xx0 c10833xx0) {
        q0();
        String str = c10833xx0.g1;
        if (!"audio/mp4a-latm".equals(str) && !C4128Rj1.I.equals(str) && !C4128Rj1.a0.equals(str)) {
            this.r1.H(1);
        } else {
            this.r1.H(32);
        }
        this.f2 = true;
    }

    public final void O0(C3621Me1 c3621Me1, @InterfaceC11300zs1 MediaCrypto mediaCrypto) throws Exception {
        float F0;
        boolean z;
        String str = c3621Me1.a;
        int i = TD2.a;
        float f = -1.0f;
        if (i < 23) {
            F0 = -1.0f;
        } else {
            F0 = F0(this.E1, this.w1, P());
        }
        if (F0 > this.n1) {
            f = F0;
        }
        f1(this.w1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC2827Ee1.a I0 = I0(c3621Me1, this.w1, mediaCrypto, f);
        if (i >= 31) {
            a.a(I0, O());
        }
        try {
            C7624kr2.a("createCodec:" + str);
            this.F1 = this.k1.a(I0);
            C7624kr2.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c3621Me1.q(this.w1)) {
                I31.n(B2, TD2.M("Format exceeds selected codec's capabilities [%s, %s]", C10833xx0.k(this.w1), str));
            }
            this.M1 = c3621Me1;
            this.J1 = f;
            this.G1 = this.w1;
            this.N1 = g0(str);
            this.O1 = h0(str, this.G1);
            this.P1 = m0(str);
            this.Q1 = o0(str);
            this.R1 = j0(str);
            this.S1 = k0(str);
            this.T1 = i0(str);
            this.U1 = n0(str, this.G1);
            boolean z2 = false;
            if (!l0(c3621Me1) && !D0()) {
                z = false;
            } else {
                z = true;
            }
            this.X1 = z;
            if (this.F1.i()) {
                this.i2 = true;
                this.j2 = 1;
                if (this.N1 != 0) {
                    z2 = true;
                }
                this.V1 = z2;
            }
            if ("c2.android.mp3.decoder".equals(c3621Me1.a)) {
                this.Y1 = new C10812xs();
            }
            if (getState() == 2) {
                this.Z1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.w2.a++;
            X0(str, I0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            C7624kr2.c();
            throw th;
        }
    }

    public final boolean P0(C10833xx0 c10833xx0) {
        if (this.z1 == null && A1(c10833xx0)) {
            return true;
        }
        return false;
    }

    public final boolean Q0(long j) {
        int size = this.s1.size();
        for (int i = 0; i < size; i++) {
            if (this.s1.get(i).longValue() == j) {
                this.s1.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC2853El
    public void R() {
        this.w1 = null;
        s1(c.e);
        this.u1.clear();
        z0();
    }

    @Override // o.AbstractC2853El
    public void S(boolean z, boolean z2) throws C3824Og0 {
        this.w2 = new C8775pW();
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) throws C3824Og0 {
        this.r2 = false;
        this.s2 = false;
        this.u2 = false;
        if (this.f2) {
            this.r1.l();
            this.q1.l();
            this.g2 = false;
            this.v1.d();
        } else {
            y0();
        }
        if (this.x2.d.l() > 0) {
            this.t2 = true;
        }
        this.x2.d.c();
        this.u1.clear();
    }

    public final void U0() throws C3824Og0 {
        C10833xx0 c10833xx0;
        boolean z;
        if (this.F1 == null && !this.f2 && (c10833xx0 = this.w1) != null) {
            if (P0(c10833xx0)) {
                N0(this.w1);
                return;
            }
            r1(this.z1);
            String str = this.w1.g1;
            InterfaceC7201j70 interfaceC7201j70 = this.y1;
            if (interfaceC7201j70 != null) {
                InterfaceC7280jR d = interfaceC7201j70.d();
                if (this.A1 == null) {
                    if (d == null) {
                        if (this.y1.i() == null) {
                            return;
                        }
                    } else if (d instanceof C4479Uz0) {
                        C4479Uz0 c4479Uz0 = (C4479Uz0) d;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(c4479Uz0.a, c4479Uz0.b);
                            this.A1 = mediaCrypto;
                            if (!c4479Uz0.c && mediaCrypto.requiresSecureDecoderComponent(str)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.B1 = z;
                        } catch (MediaCryptoException e) {
                            throw I(e, this.w1, AD1.C1);
                        }
                    }
                }
                if (C4479Uz0.d && (d instanceof C4479Uz0)) {
                    int state = this.y1.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        InterfaceC7201j70.a aVar = (InterfaceC7201j70.a) C9542sf.g(this.y1.i());
                        throw I(aVar, this.w1, aVar.X);
                    }
                }
            }
            try {
                V0(this.A1, this.B1);
            } catch (b e2) {
                throw I(e2, this.w1, AD1.p1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(@InterfaceC11300zs1 MediaCrypto mediaCrypto, boolean z) throws b {
        b bVar;
        if (this.K1 == null) {
            try {
                List<C3621Me1> A0 = A0(z);
                ArrayDeque<C3621Me1> arrayDeque = new ArrayDeque<>();
                this.K1 = arrayDeque;
                if (this.m1) {
                    arrayDeque.addAll(A0);
                } else if (!A0.isEmpty()) {
                    this.K1.add(A0.get(0));
                }
                this.L1 = null;
            } catch (C5137af1.c e) {
                throw new b(this.w1, e, z, (int) b.c1);
            }
        }
        if (!this.K1.isEmpty()) {
            C3621Me1 peekFirst = this.K1.peekFirst();
            while (this.F1 == null) {
                C3621Me1 peekFirst2 = this.K1.peekFirst();
                if (!y1(peekFirst2)) {
                    return;
                }
                try {
                    O0(peekFirst2, mediaCrypto);
                } catch (Exception e2) {
                    if (peekFirst2 == peekFirst) {
                        try {
                            I31.n(B2, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            O0(peekFirst2, mediaCrypto);
                        } catch (Exception e3) {
                            I31.o(B2, "Failed to initialize decoder: " + peekFirst2, e3);
                            this.K1.removeFirst();
                            b bVar2 = new b(this.w1, e3, z, peekFirst2);
                            W0(bVar2);
                            bVar = this.L1;
                            if (bVar != null) {
                                this.L1 = bVar2;
                            } else {
                                this.L1 = bVar.c(bVar2);
                            }
                            if (!this.K1.isEmpty()) {
                                throw this.L1;
                            }
                        }
                    } else {
                        throw e2;
                        break;
                    }
                    I31.o(B2, "Failed to initialize decoder: " + peekFirst2, e3);
                    this.K1.removeFirst();
                    b bVar22 = new b(this.w1, e3, z, peekFirst2);
                    W0(bVar22);
                    bVar = this.L1;
                    if (bVar != null) {
                    }
                    if (!this.K1.isEmpty()) {
                    }
                }
            }
            this.K1 = null;
            return;
        }
        throw new b(this.w1, (Throwable) null, z, (int) b.b1);
    }

    @Override // o.AbstractC2853El
    public void W() {
        try {
            q0();
            l1();
        } finally {
            w1(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4 >= r0) goto L14;
     */
    @Override // o.AbstractC2853El
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) throws C3824Og0 {
        if (this.x2.c == C10323vs.b) {
            s1(new c(C10323vs.b, j, j2));
            return;
        }
        if (this.u1.isEmpty()) {
            long j3 = this.p2;
            if (j3 != C10323vs.b) {
                long j4 = this.y2;
                if (j4 != C10323vs.b) {
                }
            }
            s1(new c(C10323vs.b, j, j2));
            if (this.x2.c != C10323vs.b) {
                d1();
                return;
            }
            return;
        }
        this.u1.add(new c(this.p2, j, j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (t0() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
        if (t0() == false) goto L45;
     */
    @InterfaceC11300zs1
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9996uW Z0(C2899Ex0 c2899Ex0) throws C3824Og0 {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = true;
        this.t2 = true;
        C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(c2899Ex0.b);
        if (c10833xx0.g1 != null) {
            w1(c2899Ex0.a);
            this.w1 = c10833xx0;
            if (this.f2) {
                this.h2 = true;
                return null;
            }
            InterfaceC2827Ee1 interfaceC2827Ee1 = this.F1;
            if (interfaceC2827Ee1 == null) {
                this.K1 = null;
                U0();
                return null;
            }
            C3621Me1 c3621Me1 = this.M1;
            C10833xx0 c10833xx02 = this.G1;
            if (v0(c3621Me1, c10833xx0, this.y1, this.z1)) {
                s0();
                return new C9996uW(c3621Me1.a, c10833xx02, c10833xx0, 0, 128);
            }
            if (this.z1 != this.y1) {
                z = true;
            } else {
                z = false;
            }
            if (z && TD2.a < 23) {
                z2 = false;
            } else {
                z2 = true;
            }
            C9542sf.i(z2);
            C9996uW f0 = f0(c3621Me1, c10833xx02, c10833xx0);
            int i2 = f0.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (E1(c10833xx0)) {
                                this.G1 = c10833xx0;
                                if (z) {
                                }
                            }
                            i = 16;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (E1(c10833xx0)) {
                            this.i2 = true;
                            this.j2 = 1;
                            int i3 = this.N1;
                            if (i3 != 2 && (i3 != 1 || c10833xx0.l1 != c10833xx02.l1 || c10833xx0.m1 != c10833xx02.m1)) {
                                z3 = false;
                            }
                            this.V1 = z3;
                            this.G1 = c10833xx0;
                            if (z) {
                            }
                        }
                        i = 16;
                    }
                } else {
                    if (E1(c10833xx0)) {
                        this.G1 = c10833xx0;
                        if (!z) {
                        }
                    }
                    i = 16;
                }
                if (f0.d == 0 && (this.F1 != interfaceC2827Ee1 || this.l2 == 3)) {
                    return new C9996uW(c3621Me1.a, c10833xx02, c10833xx0, 0, i);
                }
                return f0;
            }
            s0();
            i = 0;
            if (f0.d == 0) {
            }
            return f0;
        }
        throw I(new IllegalArgumentException(), c10833xx0, AD1.t1);
    }

    @Override // o.InterfaceC10712xR1
    public final int a(C10833xx0 c10833xx0) throws C3824Og0 {
        try {
            return B1(this.l1, c10833xx0);
        } catch (C5137af1.c e) {
            throw I(e, c10833xx0, AD1.q1);
        }
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return this.s2;
    }

    @InterfaceC2591Bt
    public void c1(long j) {
        this.y2 = j;
        while (!this.u1.isEmpty() && j >= this.u1.peek().a) {
            s1(this.u1.poll());
            d1();
        }
    }

    public final void d0() throws C3824Og0 {
        String str;
        C9542sf.i(!this.r2);
        C2899Ex0 L = L();
        this.q1.l();
        do {
            this.q1.l();
            int a0 = a0(L, this.q1, 0);
            if (a0 != -5) {
                if (a0 != -4) {
                    if (a0 == -3) {
                        return;
                    }
                    throw new IllegalStateException();
                } else if (this.q1.q()) {
                    this.r2 = true;
                    return;
                } else {
                    if (this.t2) {
                        C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(this.w1);
                        this.x1 = c10833xx0;
                        a1(c10833xx0, null);
                        this.t2 = false;
                    }
                    this.q1.x();
                    C10833xx0 c10833xx02 = this.w1;
                    if (c10833xx02 != null && (str = c10833xx02.g1) != null && str.equals(C4128Rj1.a0)) {
                        this.v1.a(this.q1, this.w1.i1);
                    }
                }
            } else {
                Z0(L);
                return;
            }
        } while (this.r1.B(this.q1));
        this.g2 = true;
    }

    public final boolean e0(long j, long j2) throws C3824Og0 {
        boolean z;
        C9542sf.i(!this.s2);
        if (this.r1.G()) {
            C5891dm c5891dm = this.r1;
            z = false;
            if (!h1(j, j2, null, c5891dm.Y0, this.b2, 0, c5891dm.F(), this.r1.D(), this.r1.p(), this.r1.q(), this.x1)) {
                return false;
            }
            c1(this.r1.E());
            this.r1.l();
        } else {
            z = false;
        }
        if (this.r2) {
            this.s2 = true;
            return z;
        }
        if (this.g2) {
            C9542sf.i(this.r1.B(this.q1));
            this.g2 = z;
        }
        if (this.h2) {
            if (this.r1.G()) {
                return true;
            }
            q0();
            this.h2 = z;
            U0();
            if (!this.f2) {
                return z;
            }
        }
        d0();
        if (this.r1.G()) {
            this.r1.x();
        }
        if (this.r1.G() || this.r2 || this.h2) {
            return true;
        }
        return z;
    }

    public C9996uW f0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        return new C9996uW(c3621Me1.a, c10833xx0, c10833xx02, 0, 1);
    }

    public final int g0(String str) {
        int i = TD2.a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = TD2.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = TD2.b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public abstract boolean h1(long j, long j2, @InterfaceC11300zs1 InterfaceC2827Ee1 interfaceC2827Ee1, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10833xx0 c10833xx0) throws C3824Og0;

    public final void i1() {
        this.o2 = true;
        MediaFormat a2 = this.F1.a();
        if (this.N1 != 0 && a2.getInteger("width") == 32 && a2.getInteger("height") == 32) {
            this.W1 = true;
            return;
        }
        if (this.U1) {
            a2.setInteger("channel-count", 1);
        }
        this.H1 = a2;
        this.I1 = true;
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        if (this.w1 != null) {
            if (!Q() && !M0()) {
                if (this.Z1 != C10323vs.b && SystemClock.elapsedRealtime() < this.Z1) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean j1(int i) throws C3824Og0 {
        C2899Ex0 L = L();
        this.o1.l();
        int a0 = a0(L, this.o1, i | 4);
        if (a0 == -5) {
            Z0(L);
            return true;
        } else if (a0 == -4 && this.o1.q()) {
            this.r2 = true;
            g1();
            return false;
        } else {
            return false;
        }
    }

    public final void k1() throws C3824Og0 {
        l1();
        U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.j70, android.media.MediaCrypto] */
    public void l1() {
        try {
            InterfaceC2827Ee1 interfaceC2827Ee1 = this.F1;
            if (interfaceC2827Ee1 != null) {
                interfaceC2827Ee1.g();
                this.w2.b++;
                Y0(this.M1.a);
            }
            this.F1 = null;
            try {
                MediaCrypto mediaCrypto = this.A1;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.F1 = null;
            try {
                MediaCrypto mediaCrypto2 = this.A1;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @InterfaceC2591Bt
    public void n1() {
        p1();
        q1();
        this.Z1 = C10323vs.b;
        this.n2 = false;
        this.m2 = false;
        this.V1 = false;
        this.W1 = false;
        this.d2 = false;
        this.e2 = false;
        this.s1.clear();
        this.p2 = C10323vs.b;
        this.q2 = C10323vs.b;
        this.y2 = C10323vs.b;
        C10812xs c10812xs = this.Y1;
        if (c10812xs != null) {
            c10812xs.c();
        }
        this.k2 = 0;
        this.l2 = 0;
        this.j2 = this.i2 ? 1 : 0;
    }

    @InterfaceC2591Bt
    public void o1() {
        n1();
        this.v2 = null;
        this.Y1 = null;
        this.K1 = null;
        this.M1 = null;
        this.G1 = null;
        this.H1 = null;
        this.I1 = false;
        this.o2 = false;
        this.J1 = -1.0f;
        this.N1 = 0;
        this.O1 = false;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = false;
        this.X1 = false;
        this.i2 = false;
        this.j2 = 0;
        this.B1 = false;
    }

    public C3034Ge1 p0(Throwable th, @InterfaceC11300zs1 C3621Me1 c3621Me1) {
        return new C3034Ge1(th, c3621Me1);
    }

    public final void p1() {
        this.a2 = -1;
        this.p1.Y0 = null;
    }

    public final void q0() {
        this.h2 = false;
        this.r1.l();
        this.q1.l();
        this.g2 = false;
        this.f2 = false;
        this.v1.d();
    }

    public final void q1() {
        this.b2 = -1;
        this.c2 = null;
    }

    public final boolean r0() {
        if (this.m2) {
            this.k2 = 1;
            if (!this.P1 && !this.R1) {
                this.l2 = 1;
            } else {
                this.l2 = 3;
                return false;
            }
        }
        return true;
    }

    public final void r1(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.y1, interfaceC7201j70);
        this.y1 = interfaceC7201j70;
    }

    public final void s0() throws C3824Og0 {
        if (this.m2) {
            this.k2 = 1;
            this.l2 = 3;
            return;
        }
        k1();
    }

    public final void s1(c cVar) {
        this.x2 = cVar;
        long j = cVar.c;
        if (j != C10323vs.b) {
            this.z2 = true;
            b1(j);
        }
    }

    @TargetApi(23)
    public final boolean t0() throws C3824Og0 {
        if (this.m2) {
            this.k2 = 1;
            if (!this.P1 && !this.R1) {
                this.l2 = 2;
            } else {
                this.l2 = 3;
                return false;
            }
        } else {
            F1();
        }
        return true;
    }

    public final void t1() {
        this.u2 = true;
    }

    public final boolean u0(long j, long j2) throws C3824Og0 {
        boolean z;
        boolean h1;
        boolean z2;
        int m;
        boolean z3;
        if (!M0()) {
            if (this.S1 && this.n2) {
                try {
                    m = this.F1.m(this.t1);
                } catch (IllegalStateException unused) {
                    g1();
                    if (this.s2) {
                        l1();
                    }
                    return false;
                }
            } else {
                m = this.F1.m(this.t1);
            }
            if (m < 0) {
                if (m == -2) {
                    i1();
                    return true;
                }
                if (this.X1 && (this.r2 || this.k2 == 2)) {
                    g1();
                }
                return false;
            } else if (this.W1) {
                this.W1 = false;
                this.F1.n(m, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.t1;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    g1();
                    return false;
                }
                this.b2 = m;
                ByteBuffer p = this.F1.p(m);
                this.c2 = p;
                if (p != null) {
                    p.position(this.t1.offset);
                    ByteBuffer byteBuffer = this.c2;
                    MediaCodec.BufferInfo bufferInfo2 = this.t1;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.T1) {
                    MediaCodec.BufferInfo bufferInfo3 = this.t1;
                    if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                        long j3 = this.p2;
                        if (j3 != C10323vs.b) {
                            bufferInfo3.presentationTimeUs = j3;
                        }
                    }
                }
                this.d2 = Q0(this.t1.presentationTimeUs);
                long j4 = this.q2;
                long j5 = this.t1.presentationTimeUs;
                if (j4 == j5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.e2 = z3;
                G1(j5);
            }
        }
        if (this.S1 && this.n2) {
            try {
                InterfaceC2827Ee1 interfaceC2827Ee1 = this.F1;
                ByteBuffer byteBuffer2 = this.c2;
                int i = this.b2;
                MediaCodec.BufferInfo bufferInfo4 = this.t1;
                z = false;
                try {
                    h1 = h1(j, j2, interfaceC2827Ee1, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.d2, this.e2, this.x1);
                } catch (IllegalStateException unused2) {
                    g1();
                    if (this.s2) {
                        l1();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            InterfaceC2827Ee1 interfaceC2827Ee12 = this.F1;
            ByteBuffer byteBuffer3 = this.c2;
            int i2 = this.b2;
            MediaCodec.BufferInfo bufferInfo5 = this.t1;
            h1 = h1(j, j2, interfaceC2827Ee12, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.d2, this.e2, this.x1);
        }
        if (h1) {
            c1(this.t1.presentationTimeUs);
            if ((this.t1.flags & 4) != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            q1();
            if (!z2) {
                return true;
            }
            g1();
        }
        return z;
    }

    public final void u1(C3824Og0 c3824Og0) {
        this.v2 = c3824Og0;
    }

    public final boolean v0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, @InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70, @InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j702) throws C3824Og0 {
        InterfaceC7280jR d;
        InterfaceC7280jR d2;
        boolean j;
        if (interfaceC7201j70 == interfaceC7201j702) {
            return false;
        }
        if (interfaceC7201j702 != null && interfaceC7201j70 != null && (d = interfaceC7201j702.d()) != null && (d2 = interfaceC7201j70.d()) != null && d.getClass().equals(d2.getClass())) {
            if (!(d instanceof C4479Uz0)) {
                return false;
            }
            C4479Uz0 c4479Uz0 = (C4479Uz0) d;
            if (!interfaceC7201j702.a().equals(interfaceC7201j70.a()) || TD2.a < 23) {
                return true;
            }
            UUID uuid = C10323vs.h2;
            if (!uuid.equals(interfaceC7201j70.a()) && !uuid.equals(interfaceC7201j702.a())) {
                if (c4479Uz0.c) {
                    j = false;
                } else {
                    j = interfaceC7201j702.j(c10833xx0.g1);
                }
                if (c3621Me1.g || !j) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public void v1(long j) {
        this.C1 = j;
    }

    public final void x0() {
        try {
            this.F1.flush();
        } finally {
            n1();
        }
    }

    public final boolean x1(long j) {
        if (this.C1 != C10323vs.b && SystemClock.elapsedRealtime() - j >= this.C1) {
            return false;
        }
        return true;
    }

    public final boolean y0() throws C3824Og0 {
        boolean z0 = z0();
        if (z0) {
            U0();
        }
        return z0;
    }

    public boolean y1(C3621Me1 c3621Me1) {
        return true;
    }

    public boolean z0() {
        boolean z;
        if (this.F1 == null) {
            return false;
        }
        int i = this.l2;
        if (i != 3 && !this.P1 && ((!this.Q1 || this.o2) && (!this.R1 || !this.n2))) {
            if (i == 2) {
                int i2 = TD2.a;
                if (i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                if (i2 >= 23) {
                    try {
                        F1();
                    } catch (C3824Og0 e) {
                        I31.o(B2, "Failed to update the DRM session, releasing the codec instead.", e);
                        l1();
                        return true;
                    }
                }
            }
            x0();
            return false;
        }
        l1();
        return true;
    }

    public boolean z1() {
        return false;
    }

    /* renamed from: o.Pe1$b */
    /* loaded from: classes2.dex */
    public static class b extends Exception {
        public static final int a1 = -50000;
        public static final int b1 = -49999;
        public static final int c1 = -49998;
        public final String X;
        public final boolean Y;
        @InterfaceC11300zs1
        public final String Y0;
        @InterfaceC11300zs1
        public final C3621Me1 Z;
        @InterfaceC11300zs1
        public final b Z0;

        public b(C10833xx0 c10833xx0, @InterfaceC11300zs1 Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c10833xx0, th, c10833xx0.g1, z, null, b(i), null);
        }

        public static String b(int i) {
            String str;
            if (i < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        @InterfaceC11300zs1
        @ES1(21)
        public static String d(@InterfaceC11300zs1 Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        @OB
        public final b c(b bVar) {
            return new b(getMessage(), getCause(), this.X, this.Y, this.Z, this.Y0, bVar);
        }

        public b(C10833xx0 c10833xx0, @InterfaceC11300zs1 Throwable th, boolean z, C3621Me1 c3621Me1) {
            this("Decoder init failed: " + c3621Me1.a + C6566gU0.h + c10833xx0, th, c10833xx0.g1, z, c3621Me1, TD2.a >= 21 ? d(th) : null, null);
        }

        public b(String str, @InterfaceC11300zs1 Throwable th, String str2, boolean z, @InterfaceC11300zs1 C3621Me1 c3621Me1, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 b bVar) {
            super(str, th);
            this.X = str2;
            this.Y = z;
            this.Z = c3621Me1;
            this.Y0 = str3;
            this.Z0 = bVar;
        }
    }

    @Override // o.AbstractC2853El
    public void X() {
    }

    @Override // o.AbstractC2853El
    public void Y() {
    }

    public void d1() {
    }

    public void m1() throws C3824Og0 {
    }

    public void L0(C9267rW c9267rW) throws C3824Og0 {
    }

    public void W0(Exception exc) {
    }

    public void Y0(String str) {
    }

    public void b1(long j) {
    }

    public void e1(C9267rW c9267rW) throws C3824Og0 {
    }

    public void f1(C10833xx0 c10833xx0) throws C3824Og0 {
    }

    public void a1(C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaFormat mediaFormat) throws C3824Og0 {
    }

    public void X0(String str, InterfaceC2827Ee1.a aVar, long j, long j2) {
    }
}
