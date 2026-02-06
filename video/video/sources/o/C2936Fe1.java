package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import o.C10833xx0;
import o.C5137af1;
import o.C5594cY;
import o.InterfaceC10469wR1;
import o.InterfaceC2827Ee1;
import o.InterfaceC8085mh;
import o.InterfaceC9058qh;

@Deprecated
/* renamed from: o.Fe1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2936Fe1 extends AbstractC3914Pe1 implements InterfaceC2729De1 {
    public static final String f3 = "MediaCodecAudioRenderer";
    public static final String g3 = "v-bits-per-sample";
    public final Context S2;
    public final InterfaceC8085mh.a T2;
    public final InterfaceC9058qh U2;
    public int V2;
    public boolean W2;
    @InterfaceC11300zs1
    public C10833xx0 X2;
    @InterfaceC11300zs1
    public C10833xx0 Y2;
    public long Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public boolean d3;
    @InterfaceC11300zs1
    public InterfaceC10469wR1.c e3;

    @ES1(23)
    /* renamed from: o.Fe1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static void a(InterfaceC9058qh interfaceC9058qh, @InterfaceC11300zs1 Object obj) {
            interfaceC9058qh.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: o.Fe1$c */
    /* loaded from: classes2.dex */
    public final class c implements InterfaceC9058qh.c {
        public c() {
        }

        @Override // o.InterfaceC9058qh.c
        public void a(boolean z) {
            C2936Fe1.this.T2.s(z);
        }

        @Override // o.InterfaceC9058qh.c
        public void b(Exception exc) {
            I31.e(C2936Fe1.f3, "Audio sink error", exc);
            C2936Fe1.this.T2.l(exc);
        }

        @Override // o.InterfaceC9058qh.c
        public void c(long j) {
            C2936Fe1.this.T2.r(j);
        }

        @Override // o.InterfaceC9058qh.c
        public void d() {
            if (C2936Fe1.this.e3 != null) {
                C2936Fe1.this.e3.a();
            }
        }

        @Override // o.InterfaceC9058qh.c
        public void e(int i, long j, long j2) {
            C2936Fe1.this.T2.t(i, j, j2);
        }

        @Override // o.InterfaceC9058qh.c
        public void f() {
            C2936Fe1.this.V();
        }

        @Override // o.InterfaceC9058qh.c
        public void g() {
            C2936Fe1.this.R1();
        }

        @Override // o.InterfaceC9058qh.c
        public void h() {
            if (C2936Fe1.this.e3 != null) {
                C2936Fe1.this.e3.b();
            }
        }
    }

    public C2936Fe1(Context context, InterfaceC4108Re1 interfaceC4108Re1) {
        this(context, interfaceC4108Re1, null, null);
    }

    public static boolean K1(String str) {
        if (TD2.a < 24 && "OMX.SEC.aac.dec".equals(str) && D71.b.equals(TD2.c)) {
            String str2 = TD2.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean L1() {
        if (TD2.a == 23) {
            String str = TD2.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private int N1(C3621Me1 c3621Me1, C10833xx0 c10833xx0) {
        int i;
        if ("OMX.google.raw.decoder".equals(c3621Me1.a) && (i = TD2.a) < 24 && (i != 23 || !TD2.Z0(this.S2))) {
            return -1;
        }
        return c10833xx0.h1;
    }

    public static List<C3621Me1> P1(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z, InterfaceC9058qh interfaceC9058qh) throws C5137af1.c {
        C3621Me1 y;
        if (c10833xx0.g1 == null) {
            return AbstractC5317bO0.L();
        }
        if (interfaceC9058qh.a(c10833xx0) && (y = C5137af1.y()) != null) {
            return AbstractC5317bO0.M(y);
        }
        return C5137af1.w(interfaceC4108Re1, c10833xx0, z, false);
    }

    private void S1() {
        long v = this.U2.v(c());
        if (v != Long.MIN_VALUE) {
            if (!this.b3) {
                v = Math.max(this.Z2, v);
            }
            this.Z2 = v;
            this.b3 = false;
        }
    }

    @Override // o.AbstractC3914Pe1
    public boolean A1(C10833xx0 c10833xx0) {
        return this.U2.a(c10833xx0);
    }

    @Override // o.AbstractC3914Pe1
    public int B1(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0) throws C5137af1.c {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3 = 0;
        if (!C4128Rj1.p(c10833xx0.g1)) {
            return InterfaceC10712xR1.r(0);
        }
        if (TD2.a >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        boolean z3 = true;
        if (c10833xx0.B1 != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean C1 = AbstractC3914Pe1.C1(c10833xx0);
        int i4 = 8;
        int i5 = 4;
        if (C1 && this.U2.a(c10833xx0) && (!z || C5137af1.y() != null)) {
            return InterfaceC10712xR1.y(4, 8, i);
        }
        if (C4128Rj1.N.equals(c10833xx0.g1) && !this.U2.a(c10833xx0)) {
            return InterfaceC10712xR1.r(1);
        }
        if (!this.U2.a(TD2.v0(2, c10833xx0.t1, c10833xx0.u1))) {
            return InterfaceC10712xR1.r(1);
        }
        List<C3621Me1> P1 = P1(interfaceC4108Re1, c10833xx0, false, this.U2);
        if (P1.isEmpty()) {
            return InterfaceC10712xR1.r(1);
        }
        if (!C1) {
            return InterfaceC10712xR1.r(2);
        }
        C3621Me1 c3621Me1 = P1.get(0);
        boolean q = c3621Me1.q(c10833xx0);
        if (!q) {
            for (int i6 = 1; i6 < P1.size(); i6++) {
                C3621Me1 c3621Me12 = P1.get(i6);
                if (c3621Me12.q(c10833xx0)) {
                    z2 = false;
                    c3621Me1 = c3621Me12;
                    break;
                }
            }
        }
        z2 = true;
        z3 = q;
        if (!z3) {
            i5 = 3;
        }
        if (z3 && c3621Me1.t(c10833xx0)) {
            i4 = 16;
        }
        if (c3621Me1.h) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        if (z2) {
            i3 = 128;
        }
        return InterfaceC10712xR1.n(i5, i4, i, i2, i3);
    }

    @Override // o.AbstractC3914Pe1
    public float F0(float f, C10833xx0 c10833xx0, C10833xx0[] c10833xx0Arr) {
        int i = -1;
        for (C10833xx0 c10833xx02 : c10833xx0Arr) {
            int i2 = c10833xx02.u1;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // o.AbstractC3914Pe1
    public List<C3621Me1> H0(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z) throws C5137af1.c {
        return C5137af1.x(P1(interfaceC4108Re1, c10833xx0, z, this.U2), c10833xx0);
    }

    @Override // o.AbstractC3914Pe1
    public InterfaceC2827Ee1.a I0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f) {
        C10833xx0 c10833xx02;
        this.V2 = O1(c3621Me1, c10833xx0, P());
        this.W2 = K1(c3621Me1.a);
        MediaFormat Q1 = Q1(c10833xx0, c3621Me1.c, this.V2, f);
        if (C4128Rj1.N.equals(c3621Me1.b) && !C4128Rj1.N.equals(c10833xx0.g1)) {
            c10833xx02 = c10833xx0;
        } else {
            c10833xx02 = null;
        }
        this.Y2 = c10833xx02;
        return InterfaceC2827Ee1.a.a(c3621Me1, Q1, c10833xx0, mediaCrypto);
    }

    public void M1(boolean z) {
        this.d3 = z;
    }

    public int O1(C3621Me1 c3621Me1, C10833xx0 c10833xx0, C10833xx0[] c10833xx0Arr) {
        int N1 = N1(c3621Me1, c10833xx0);
        if (c10833xx0Arr.length == 1) {
            return N1;
        }
        for (C10833xx0 c10833xx02 : c10833xx0Arr) {
            if (c3621Me1.f(c10833xx0, c10833xx02).d != 0) {
                N1 = Math.max(N1, N1(c3621Me1, c10833xx02));
            }
        }
        return N1;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat Q1(C10833xx0 c10833xx0, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c10833xx0.t1);
        mediaFormat.setInteger("sample-rate", c10833xx0.u1);
        C7818lf1.x(mediaFormat, c10833xx0.i1);
        C7818lf1.s(mediaFormat, "max-input-size", i);
        int i2 = TD2.a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !L1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && C4128Rj1.T.equals(c10833xx0.g1)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.U2.s(TD2.v0(4, c10833xx0.t1, c10833xx0.u1)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void R() {
        this.c3 = true;
        this.X2 = null;
        try {
            this.U2.flush();
            try {
                super.R();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.R();
                throw th;
            } finally {
            }
        }
    }

    @InterfaceC2591Bt
    public void R1() {
        this.b3 = true;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void S(boolean z, boolean z2) throws C3824Og0 {
        super.S(z, z2);
        this.T2.p(this.w2);
        if (K().a) {
            this.U2.y();
        } else {
            this.U2.o();
        }
        this.U2.l(O());
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void T(long j, boolean z) throws C3824Og0 {
        super.T(j, z);
        if (this.d3) {
            this.U2.r();
        } else {
            this.U2.flush();
        }
        this.Z2 = j;
        this.a3 = true;
        this.b3 = true;
    }

    @Override // o.AbstractC2853El
    public void U() {
        this.U2.g();
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void W() {
        try {
            super.W();
        } finally {
            if (this.c3) {
                this.c3 = false;
                this.U2.reset();
            }
        }
    }

    @Override // o.AbstractC3914Pe1
    public void W0(Exception exc) {
        I31.e(f3, "Audio codec error", exc);
        this.T2.k(exc);
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void X() {
        super.X();
        this.U2.t0();
    }

    @Override // o.AbstractC3914Pe1
    public void X0(String str, InterfaceC2827Ee1.a aVar, long j, long j2) {
        this.T2.m(str, j, j2);
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void Y() {
        S1();
        this.U2.pause();
        super.Y();
    }

    @Override // o.AbstractC3914Pe1
    public void Y0(String str) {
        this.T2.n(str);
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC11300zs1
    public C9996uW Z0(C2899Ex0 c2899Ex0) throws C3824Og0 {
        this.X2 = (C10833xx0) C9542sf.g(c2899Ex0.b);
        C9996uW Z0 = super.Z0(c2899Ex0);
        this.T2.q(this.X2, Z0);
        return Z0;
    }

    @Override // o.AbstractC3914Pe1
    public void a1(C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaFormat mediaFormat) throws C3824Og0 {
        int i;
        int i2;
        C10833xx0 c10833xx02 = this.Y2;
        int[] iArr = null;
        if (c10833xx02 != null) {
            c10833xx0 = c10833xx02;
        } else if (B0() != null) {
            if (C4128Rj1.N.equals(c10833xx0.g1)) {
                i = c10833xx0.v1;
            } else if (TD2.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey(g3)) {
                i = TD2.u0(mediaFormat.getInteger(g3));
            } else {
                i = 2;
            }
            C10833xx0 G = new C10833xx0.b().g0(C4128Rj1.N).a0(i).P(c10833xx0.w1).Q(c10833xx0.x1).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.W2 && G.t1 == 6 && (i2 = c10833xx0.t1) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < c10833xx0.t1; i3++) {
                    iArr[i3] = i3;
                }
            }
            c10833xx0 = G;
        }
        try {
            this.U2.u(c10833xx0, 0, iArr);
        } catch (InterfaceC9058qh.a e) {
            throw I(e, e.X, AD1.u1);
        }
    }

    @Override // o.AbstractC3914Pe1
    public void b1(long j) {
        this.U2.w(j);
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    public boolean c() {
        if (super.c() && this.U2.c()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3914Pe1
    public void d1() {
        super.d1();
        this.U2.x();
    }

    @Override // o.AbstractC3914Pe1
    public void e1(C9267rW c9267rW) {
        if (this.a3 && !c9267rW.p()) {
            if (Math.abs(c9267rW.a1 - this.Z2) > C6118ei0.r2) {
                this.Z2 = c9267rW.a1;
            }
            this.a3 = false;
        }
    }

    @Override // o.InterfaceC2729De1
    public void f(DD1 dd1) {
        this.U2.f(dd1);
    }

    @Override // o.AbstractC3914Pe1
    public C9996uW f0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        int i;
        C9996uW f = c3621Me1.f(c10833xx0, c10833xx02);
        int i2 = f.e;
        if (P0(c10833xx02)) {
            i2 |= 32768;
        }
        if (N1(c3621Me1, c10833xx02) > this.V2) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = c3621Me1.a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = f.d;
        }
        return new C9996uW(str, c10833xx0, c10833xx02, i, i3);
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public String getName() {
        return f3;
    }

    @Override // o.InterfaceC2729De1
    public DD1 h() {
        return this.U2.h();
    }

    @Override // o.AbstractC3914Pe1
    public boolean h1(long j, long j2, @InterfaceC11300zs1 InterfaceC2827Ee1 interfaceC2827Ee1, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10833xx0 c10833xx0) throws C3824Og0 {
        C9542sf.g(byteBuffer);
        if (this.Y2 != null && (i2 & 2) != 0) {
            ((InterfaceC2827Ee1) C9542sf.g(interfaceC2827Ee1)).n(i, false);
            return true;
        } else if (z) {
            if (interfaceC2827Ee1 != null) {
                interfaceC2827Ee1.n(i, false);
            }
            this.w2.f += i3;
            this.U2.x();
            return true;
        } else {
            try {
                if (!this.U2.q(byteBuffer, j3, i3)) {
                    return false;
                }
                if (interfaceC2827Ee1 != null) {
                    interfaceC2827Ee1.n(i, false);
                }
                this.w2.e += i3;
                return true;
            } catch (InterfaceC9058qh.b e) {
                throw J(e, this.X2, e.Y, AD1.u1);
            } catch (InterfaceC9058qh.f e2) {
                throw J(e2, c10833xx0, e2.Y, AD1.v1);
            }
        }
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    public boolean isReady() {
        if (!this.U2.m() && !super.isReady()) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC3914Pe1
    public void m1() throws C3824Og0 {
        try {
            this.U2.t();
        } catch (InterfaceC9058qh.f e) {
            throw J(e, e.Z, e.Y, AD1.v1);
        }
    }

    @Override // o.AbstractC2853El, o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    switch (i) {
                        case 9:
                            this.U2.k(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            this.U2.d(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.e3 = (InterfaceC10469wR1.c) obj;
                            return;
                        case 12:
                            if (TD2.a >= 23) {
                                b.a(this.U2, obj);
                                return;
                            }
                            return;
                        default:
                            super.t(i, obj);
                            return;
                    }
                }
                this.U2.i((C3737Nj) obj);
                return;
            }
            this.U2.n((C9546sg) obj);
            return;
        }
        this.U2.setVolume(((Float) obj).floatValue());
    }

    @Override // o.InterfaceC2729De1
    public long z() {
        if (getState() == 2) {
            S1();
        }
        return this.Z2;
    }

    public C2936Fe1(Context context, InterfaceC4108Re1 interfaceC4108Re1, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh) {
        this(context, interfaceC4108Re1, handler, interfaceC8085mh, C10764xg.e, new InterfaceC5143ah[0]);
    }

    public C2936Fe1(Context context, InterfaceC4108Re1 interfaceC4108Re1, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, C10764xg c10764xg, InterfaceC5143ah... interfaceC5143ahArr) {
        this(context, interfaceC4108Re1, handler, interfaceC8085mh, new C5594cY.g().h((C10764xg) C3743Nk1.a(c10764xg, C10764xg.e)).j(interfaceC5143ahArr).g());
    }

    public C2936Fe1(Context context, InterfaceC4108Re1 interfaceC4108Re1, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, InterfaceC9058qh interfaceC9058qh) {
        this(context, InterfaceC2827Ee1.b.a, interfaceC4108Re1, false, handler, interfaceC8085mh, interfaceC9058qh);
    }

    public C2936Fe1(Context context, InterfaceC4108Re1 interfaceC4108Re1, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, InterfaceC9058qh interfaceC9058qh) {
        this(context, InterfaceC2827Ee1.b.a, interfaceC4108Re1, z, handler, interfaceC8085mh, interfaceC9058qh);
    }

    public C2936Fe1(Context context, InterfaceC2827Ee1.b bVar, InterfaceC4108Re1 interfaceC4108Re1, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, InterfaceC9058qh interfaceC9058qh) {
        super(1, bVar, interfaceC4108Re1, z, 44100.0f);
        this.S2 = context.getApplicationContext();
        this.U2 = interfaceC9058qh;
        this.T2 = new InterfaceC8085mh.a(handler, interfaceC8085mh);
        interfaceC9058qh.p(new c());
    }

    @Override // o.AbstractC2853El, o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public InterfaceC2729De1 G() {
        return this;
    }
}
