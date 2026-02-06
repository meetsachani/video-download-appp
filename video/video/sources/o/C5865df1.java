package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C4088Qz0;
import o.C5137af1;
import o.InterfaceC2827Ee1;
import o.InterfaceC6014eG2;
import o.NG2;

@Deprecated
/* renamed from: o.df1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5865df1 extends AbstractC3914Pe1 {
    public static final String A3 = "MediaCodecVideoRenderer";
    public static final String B3 = "crop-left";
    public static final String C3 = "crop-right";
    public static final String D3 = "crop-bottom";
    public static final String E3 = "crop-top";
    public static final int[] F3 = {1920, 1600, 1440, com.facebook.internal.q0.q1, 960, 854, 640, 540, com.facebook.internal.q0.n1};
    public static final float G3 = 1.5f;
    public static final long H3 = Long.MAX_VALUE;
    public static final int I3 = 2097152;
    public static boolean J3;
    public static boolean K3;
    public final Context S2;
    public final C6755hG2 T2;
    public final NG2.a U2;
    public final d V2;
    public final long W2;
    public final int X2;
    public final boolean Y2;
    public b Z2;
    public boolean a3;
    public boolean b3;
    @InterfaceC11300zs1
    public Surface c3;
    @InterfaceC11300zs1
    public C6742hD1 d3;
    public boolean e3;
    public int f3;
    public boolean g3;
    public boolean h3;
    public boolean i3;
    public long j3;
    public long k3;
    public long l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public long q3;
    public long r3;
    public int s3;
    public long t3;
    public PG2 u3;
    @InterfaceC11300zs1
    public PG2 v3;
    public boolean w3;
    public int x3;
    @InterfaceC11300zs1
    public c y3;
    @InterfaceC11300zs1
    public InterfaceC5529cG2 z3;

    @ES1(26)
    /* renamed from: o.df1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static boolean a(Context context) {
            Display display;
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display != null) {
                isHdr = display.isHdr();
                if (isHdr) {
                    for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                        if (i == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: o.df1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    @ES1(23)
    /* renamed from: o.df1$c */
    /* loaded from: classes2.dex */
    public final class c implements InterfaceC2827Ee1.c, Handler.Callback {
        public static final int Z = 0;
        public final Handler X;

        public c(InterfaceC2827Ee1 interfaceC2827Ee1) {
            Handler D = TD2.D(this);
            this.X = D;
            interfaceC2827Ee1.c(this, D);
        }

        @Override // o.InterfaceC2827Ee1.c
        public void a(InterfaceC2827Ee1 interfaceC2827Ee1, long j, long j2) {
            if (TD2.a < 30) {
                this.X.sendMessageAtFrontOfQueue(Message.obtain(this.X, 0, (int) (j >> 32), (int) j));
                return;
            }
            b(j);
        }

        public final void b(long j) {
            C5865df1 c5865df1 = C5865df1.this;
            if (this == c5865df1.y3 && c5865df1.B0() != null) {
                if (j == Long.MAX_VALUE) {
                    C5865df1.this.y2();
                    return;
                }
                try {
                    C5865df1.this.x2(j);
                } catch (C3824Og0 e) {
                    C5865df1.this.u1(e);
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(TD2.X1(message.arg1, message.arg2));
            return true;
        }
    }

    /* renamed from: o.df1$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final long u = 50000;
        public final C6755hG2 a;
        public final C5865df1 b;
        public Handler e;
        @InterfaceC11300zs1
        public InterfaceC6014eG2 f;
        @InterfaceC11300zs1
        public CopyOnWriteArrayList<P90> g;
        @InterfaceC11300zs1
        public C10833xx0 h;
        public Pair<Long, C10833xx0> i;
        @InterfaceC11300zs1
        public Pair<Surface, L82> j;
        public boolean m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f716o;
        public boolean r;
        public final ArrayDeque<Long> c = new ArrayDeque<>();
        public final ArrayDeque<Pair<Long, C10833xx0>> d = new ArrayDeque<>();
        public int k = -1;
        public boolean l = true;
        public long p = C10323vs.b;
        public PG2 q = PG2.d1;
        public long s = C10323vs.b;
        public long t = C10323vs.b;

        /* renamed from: o.df1$d$a */
        /* loaded from: classes2.dex */
        public class a implements InterfaceC6014eG2.c {
            public final /* synthetic */ C10833xx0 a;

            public a(C10833xx0 c10833xx0) {
                this.a = c10833xx0;
            }

            @Override // o.InterfaceC6014eG2.c
            public void a() {
                throw new IllegalStateException();
            }

            @Override // o.InterfaceC6014eG2.c
            public void b(long j) {
                boolean z;
                if (d.this.m) {
                    if (d.this.p != C10323vs.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.i(z);
                }
                d.this.c.add(Long.valueOf(j));
                if (d.this.m && j >= d.this.p) {
                    d.this.n = true;
                }
                if (d.this.r) {
                    d.this.r = false;
                    d.this.s = j;
                }
            }

            @Override // o.InterfaceC6014eG2.c
            public void c(int i, int i2) {
                C9542sf.k(d.this.h);
                d.this.q = new PG2(i, i2, 0, 1.0f);
                d.this.r = true;
            }

            @Override // o.InterfaceC6014eG2.c
            public void d(C5772dG2 c5772dG2) {
                d.this.b.u1(d.this.b.I(c5772dG2, this.a, 7001));
            }
        }

        /* renamed from: o.df1$d$b */
        /* loaded from: classes2.dex */
        public static final class b {
            public static Constructor<?> a;
            public static Method b;
            public static Method c;
            public static Constructor<?> d;
            public static Method e;

            public static P90 a(float f) throws Exception {
                c();
                Object newInstance = a.newInstance(null);
                b.invoke(newInstance, Float.valueOf(f));
                return (P90) C9542sf.g(c.invoke(newInstance, null));
            }

            public static InterfaceC6014eG2.a b() throws Exception {
                c();
                return (InterfaceC6014eG2.a) C9542sf.g(e.invoke(d.newInstance(null), null));
            }

            @InterfaceC8557od0({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            public static void c() throws Exception {
                if (a == null || b == null || c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    a = cls.getConstructor(null);
                    b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    c = cls.getMethod("build", null);
                }
                if (d != null && e != null) {
                    return;
                }
                Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                d = cls2.getConstructor(null);
                e = cls2.getMethod("build", null);
            }
        }

        public d(C6755hG2 c6755hG2, C5865df1 c5865df1) {
            this.a = c6755hG2;
            this.b = c5865df1;
        }

        public void A(List<P90> list) {
            CopyOnWriteArrayList<P90> copyOnWriteArrayList = this.g;
            if (copyOnWriteArrayList == null) {
                this.g = new CopyOnWriteArrayList<>(list);
                return;
            }
            copyOnWriteArrayList.clear();
            this.g.addAll(list);
        }

        public MediaFormat k(MediaFormat mediaFormat) {
            if (TD2.a >= 29 && this.b.S2.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void l() {
            ((InterfaceC6014eG2) C9542sf.g(this.f)).b(null);
            this.j = null;
        }

        public void m() {
            C9542sf.k(this.f);
            this.f.flush();
            this.c.clear();
            this.e.removeCallbacksAndMessages(null);
            if (this.m) {
                this.m = false;
                this.n = false;
                this.f716o = false;
            }
        }

        public long n(long j, long j2) {
            boolean z;
            if (this.t != C10323vs.b) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            return (j + j2) - this.t;
        }

        public Surface o() {
            return ((InterfaceC6014eG2) C9542sf.g(this.f)).c();
        }

        public boolean p() {
            if (this.f != null) {
                return true;
            }
            return false;
        }

        public boolean q() {
            Pair<Surface, L82> pair = this.j;
            if (pair != null && ((L82) pair.second).equals(L82.c)) {
                return false;
            }
            return true;
        }

        @InterfaceC6181ey
        public boolean r(C10833xx0 c10833xx0, long j) throws C3824Og0 {
            int i;
            C9542sf.i(!p());
            if (!this.l) {
                return false;
            }
            if (this.g == null) {
                this.l = false;
                return false;
            }
            this.e = TD2.C();
            Pair<IF, IF> e2 = this.b.e2(c10833xx0.s1);
            try {
                if (!C5865df1.H1() && (i = c10833xx0.o1) != 0) {
                    this.g.add(0, b.a(i));
                }
                IF r7 = (IF) e2.second;
                Handler handler = this.e;
                Objects.requireNonNull(handler);
                InterfaceC6014eG2 a2 = b.b().a(this.b.S2, (List) C9542sf.g(this.g), SV.a, (IF) e2.first, r7, false, new ExecutorC7491kJ(handler), new a(c10833xx0));
                this.f = a2;
                a2.i(1);
                this.t = j;
                Pair<Surface, L82> pair = this.j;
                if (pair != null) {
                    L82 l82 = (L82) pair.second;
                    this.f.b(new C6861hi2((Surface) pair.first, l82.b(), l82.a()));
                }
                y(c10833xx0);
                return true;
            } catch (Exception e) {
                throw this.b.I(e, c10833xx0, 7000);
            }
        }

        public boolean s(C10833xx0 c10833xx0, long j, boolean z) {
            boolean z2;
            C9542sf.k(this.f);
            if (this.k != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.i(z2);
            if (this.f.k() >= this.k) {
                return false;
            }
            this.f.j();
            Pair<Long, C10833xx0> pair = this.i;
            if (pair == null) {
                this.i = Pair.create(Long.valueOf(j), c10833xx0);
            } else if (!TD2.g(c10833xx0, pair.second)) {
                this.d.add(Pair.create(Long.valueOf(j), c10833xx0));
            }
            if (z) {
                this.m = true;
                this.p = j;
            }
            return true;
        }

        public void t(String str) {
            this.k = TD2.r0(this.b.S2, str, false);
        }

        public final void u(long j, boolean z) {
            C9542sf.k(this.f);
            this.f.h(j);
            this.c.remove();
            this.b.q3 = SystemClock.elapsedRealtime() * 1000;
            if (j != -2) {
                this.b.r2();
            }
            if (z) {
                this.f716o = true;
            }
        }

        public void v(long j, long j2) {
            boolean z;
            C9542sf.k(this.f);
            while (!this.c.isEmpty()) {
                boolean z2 = false;
                if (this.b.getState() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                long longValue = ((Long) C9542sf.g(this.c.peek())).longValue();
                long j3 = longValue + this.t;
                long V1 = this.b.V1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z);
                if (this.n && this.c.size() == 1) {
                    z2 = true;
                }
                if (this.b.J2(j, V1)) {
                    u(-1L, z2);
                    return;
                } else if (z && j != this.b.j3 && V1 <= u) {
                    this.a.h(j3);
                    long b2 = this.a.b(System.nanoTime() + (V1 * 1000));
                    if (this.b.I2((b2 - System.nanoTime()) / 1000, j2, z2)) {
                        u(-2L, z2);
                    } else {
                        if (!this.d.isEmpty() && j3 > ((Long) this.d.peek().first).longValue()) {
                            this.i = this.d.remove();
                        }
                        this.b.w2(longValue, b2, (C10833xx0) this.i.second);
                        if (this.s >= j3) {
                            this.s = C10323vs.b;
                            this.b.t2(this.q);
                        }
                        u(b2, z2);
                    }
                } else {
                    return;
                }
            }
        }

        public boolean w() {
            return this.f716o;
        }

        public void x() {
            ((InterfaceC6014eG2) C9542sf.g(this.f)).g();
            this.f = null;
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<P90> copyOnWriteArrayList = this.g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.c.clear();
            this.l = true;
        }

        public void y(C10833xx0 c10833xx0) {
            ((InterfaceC6014eG2) C9542sf.g(this.f)).d(new C4088Qz0.b(c10833xx0.l1, c10833xx0.m1).d(c10833xx0.p1).a());
            this.h = c10833xx0;
            if (this.m) {
                this.m = false;
                this.n = false;
                this.f716o = false;
            }
        }

        public void z(Surface surface, L82 l82) {
            Pair<Surface, L82> pair = this.j;
            if (pair == null || !((Surface) pair.first).equals(surface) || !((L82) this.j.second).equals(l82)) {
                this.j = Pair.create(surface, l82);
                if (p()) {
                    ((InterfaceC6014eG2) C9542sf.g(this.f)).b(new C6861hi2(surface, l82.b(), l82.a()));
                }
            }
        }
    }

    public C5865df1(Context context, InterfaceC4108Re1 interfaceC4108Re1) {
        this(context, interfaceC4108Re1, 0L);
    }

    @ES1(29)
    public static void D2(InterfaceC2827Ee1 interfaceC2827Ee1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC2827Ee1.j(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.df1, o.El, o.Pe1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.Surface] */
    private void F2(@InterfaceC11300zs1 Object obj) throws C3824Og0 {
        C6742hD1 c6742hD1;
        if (obj instanceof Surface) {
            c6742hD1 = (Surface) obj;
        } else {
            c6742hD1 = null;
        }
        if (c6742hD1 == null) {
            C6742hD1 c6742hD12 = this.d3;
            if (c6742hD12 != null) {
                c6742hD1 = c6742hD12;
            } else {
                C3621Me1 C0 = C0();
                if (C0 != null && L2(C0)) {
                    c6742hD1 = C6742hD1.c(this.S2, C0.g);
                    this.d3 = c6742hD1;
                }
            }
        }
        if (this.c3 != c6742hD1) {
            this.c3 = c6742hD1;
            this.T2.m(c6742hD1);
            this.e3 = false;
            int state = getState();
            InterfaceC2827Ee1 B0 = B0();
            if (B0 != null && !this.V2.p()) {
                if (TD2.a >= 23 && c6742hD1 != null && !this.a3) {
                    G2(B0, c6742hD1);
                } else {
                    l1();
                    U0();
                }
            }
            if (c6742hD1 != null && c6742hD1 != this.d3) {
                v2();
                W1();
                if (state == 2) {
                    E2();
                }
                if (this.V2.p()) {
                    this.V2.z(c6742hD1, L82.c);
                    return;
                }
                return;
            }
            X1();
            W1();
            if (this.V2.p()) {
                this.V2.l();
            }
        } else if (c6742hD1 != null && c6742hD1 != this.d3) {
            v2();
            u2();
        }
    }

    public static /* synthetic */ boolean H1() {
        return Y1();
    }

    public static boolean Y1() {
        if (TD2.a >= 21) {
            return true;
        }
        return false;
    }

    @ES1(21)
    public static void a2(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean b2() {
        return "NVIDIA".equals(TD2.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0844, code lost:
        if (r0.equals("PGN528") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d2() {
        boolean z;
        boolean z2;
        int i = TD2.a;
        char c2 = 7;
        if (i <= 28) {
            String str = TD2.b;
            str.getClass();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        z2 = false;
                        break;
                    }
                    z2 = true;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                default:
                    z2 = true;
                    break;
            }
            switch (z2) {
                case false:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                    return true;
            }
        }
        if (i <= 27 && "HWEML".equals(TD2.b)) {
            return true;
        }
        String str2 = TD2.d;
        str2.getClass();
        switch (str2.hashCode()) {
            case -349662828:
                if (str2.equals("AFTJMST12")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case -321033677:
                if (str2.equals("AFTKMST12")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 2006354:
                if (str2.equals("AFTA")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 2006367:
                if (str2.equals("AFTN")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 2006371:
                if (str2.equals("AFTR")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1785421873:
                if (str2.equals("AFTEU011")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1785421876:
                if (str2.equals("AFTEU014")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1798172390:
                if (str2.equals("AFTSO001")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 2119412532:
                if (str2.equals("AFTEUFF014")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                if (i <= 26) {
                    String str3 = TD2.b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (str3.equals("GIONEE_SWW1609")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1936688988:
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c2 = C8206nB.d;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c2 = 26;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c2 = 27;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c2 = 28;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c2 = C5588cW.f706o;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c2 = C5588cW.p;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c2 = VN2.b;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c2 = ' ';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c2 = '!';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c2 = '\"';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c2 = '#';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c2 = '$';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c2 = '%';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c2 = '&';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c2 = '\'';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c2 = '(';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c2 = ')';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c2 = '*';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c2 = '+';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c2 = ',';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c2 = '-';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c2 = '.';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c2 = '/';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c2 = C3599Ly1.j;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c2 = '1';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c2 = '2';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c2 = '3';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c2 = '4';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c2 = '5';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c2 = '6';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c2 = '7';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c2 = '8';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c2 = '9';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c2 = ':';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c2 = C10928yK2.l;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c2 = '<';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c2 = '=';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c2 = '>';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c2 = '?';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c2 = C11304zt1.a;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c2 = 'A';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c2 = 'B';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c2 = 'C';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c2 = 'D';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c2 = C3599Ly1.i;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c2 = 'F';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c2 = 'G';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c2 = 'H';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c2 = 'I';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c2 = 'J';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c2 = 'K';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c2 = 'L';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c2 = 'M';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c2 = 'N';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c2 = 'O';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c2 = 'P';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c2 = 'Q';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c2 = 'R';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c2 = 'S';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c2 = 'T';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c2 = 'U';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c2 = 'V';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c2 = 'W';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c2 = 'X';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c2 = 'Y';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c2 = 'Z';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c2 = '[';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c2 = '\\';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c2 = ']';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c2 = '^';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c2 = '_';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c2 = '`';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c2 = 'a';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c2 = 'b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c2 = 'c';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c2 = 'd';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c2 = 'e';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c2 = 'f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c2 = 'g';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c2 = 'h';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c2 = 'i';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c2 = 'j';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c2 = 'k';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c2 = 'l';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c2 = 'm';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c2 = 'n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c2 = 'o';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c2 = 'p';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c2 = 'q';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c2 = 'r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c2 = 's';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c2 = 't';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c2 = 'u';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c2 = 'v';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c2 = 'w';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c2 = 'x';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c2 = 'y';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c2 = 'z';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c2 = '{';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c2 = '|';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c2 = '}';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c2 = '~';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c2 = C8077mf.N;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c2 = 128;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c2 = KH0.a;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c2 = 130;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c2 = 131;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c2 = 132;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c2 = 133;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c2 = 134;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c2 = 135;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c2 = 136;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c2 = 137;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c2 = 138;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c2 = 139;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
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
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case '~':
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case C3503Kz.V /* 132 */:
                        case C3503Kz.W /* 133 */:
                        case 134:
                        case 135:
                        case 136:
                        case C3503Kz.a0 /* 137 */:
                        case 138:
                        case C3503Kz.c0 /* 139 */:
                            break;
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                            break;
                    }
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3.equals(o.C4128Rj1.n) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f2(C3621Me1 c3621Me1, C10833xx0 c10833xx0) {
        int intValue;
        int i = c10833xx0.l1;
        int i2 = c10833xx0.m1;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = c10833xx0.g1;
        char c2 = 1;
        if (C4128Rj1.w.equals(str)) {
            Pair<Integer, Integer> s = C5137af1.s(c10833xx0);
            if (s != null && ((intValue = ((Integer) s.first).intValue()) == 512 || intValue == 1 || intValue == 2)) {
                str = "video/avc";
            } else {
                str = C4128Rj1.k;
            }
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(C4128Rj1.i)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals(C4128Rj1.k)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals(C4128Rj1.p)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals(C4128Rj1.m)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 3:
            case 5:
                return k2(i * i2, 2);
            case 2:
                return Math.max(2097152, k2(i * i2, 2));
            case 4:
                String str2 = TD2.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(TD2.c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c3621Me1.g)))) {
                    return -1;
                }
                return k2(TD2.q(i, 16) * TD2.q(i2, 16) * 256, 2);
            case 6:
                return k2(i * i2, 4);
            default:
                return -1;
        }
    }

    @InterfaceC11300zs1
    public static Point g2(C3621Me1 c3621Me1, C10833xx0 c10833xx0) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4 = c10833xx0.m1;
        int i5 = c10833xx0.l1;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i4;
        } else {
            i = i5;
        }
        if (z) {
            i4 = i5;
        }
        float f = i4 / i;
        for (int i6 : F3) {
            int i7 = (int) (i6 * f);
            if (i6 <= i || i7 <= i4) {
                break;
            }
            if (TD2.a >= 21) {
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (!z) {
                    i6 = i7;
                }
                Point c2 = c3621Me1.c(i3, i6);
                if (c3621Me1.z(c2.x, c2.y, c10833xx0.n1)) {
                    return c2;
                }
            } else {
                try {
                    int q = TD2.q(i6, 16) * 16;
                    int q2 = TD2.q(i7, 16) * 16;
                    if (q * q2 <= C5137af1.M()) {
                        if (z) {
                            i2 = q2;
                        } else {
                            i2 = q;
                        }
                        if (!z) {
                            q = q2;
                        }
                        return new Point(i2, q);
                    }
                } catch (C5137af1.c unused) {
                }
            }
        }
        return null;
    }

    public static List<C3621Me1> i2(Context context, InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z, boolean z2) throws C5137af1.c {
        String str = c10833xx0.g1;
        if (str == null) {
            return AbstractC5317bO0.L();
        }
        if (TD2.a >= 26 && C4128Rj1.w.equals(str) && !a.a(context)) {
            List<C3621Me1> o2 = C5137af1.o(interfaceC4108Re1, c10833xx0, z, z2);
            if (!o2.isEmpty()) {
                return o2;
            }
        }
        return C5137af1.w(interfaceC4108Re1, c10833xx0, z, z2);
    }

    public static int j2(C3621Me1 c3621Me1, C10833xx0 c10833xx0) {
        if (c10833xx0.h1 != -1) {
            int size = c10833xx0.i1.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += c10833xx0.i1.get(i2).length;
            }
            return c10833xx0.h1 + i;
        }
        return f2(c3621Me1, c10833xx0);
    }

    public static int k2(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    public static boolean n2(long j) {
        if (j < -30000) {
            return true;
        }
        return false;
    }

    public static boolean o2(long j) {
        if (j < -500000) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    public void A(float f, float f2) throws C3824Og0 {
        super.A(f, f2);
        this.T2.i(f);
    }

    public void A2(InterfaceC2827Ee1 interfaceC2827Ee1, int i, long j) {
        C7624kr2.a("releaseOutputBuffer");
        interfaceC2827Ee1.n(i, true);
        C7624kr2.c();
        this.w2.e++;
        this.n3 = 0;
        if (!this.V2.p()) {
            this.q3 = SystemClock.elapsedRealtime() * 1000;
            t2(this.u3);
            r2();
        }
    }

    @Override // o.AbstractC3914Pe1
    public int B1(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0) throws C5137af1.c {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!C4128Rj1.t(c10833xx0.g1)) {
            return InterfaceC10712xR1.r(0);
        }
        if (c10833xx0.j1 != null) {
            z = true;
        } else {
            z = false;
        }
        List<C3621Me1> i22 = i2(this.S2, interfaceC4108Re1, c10833xx0, z, false);
        if (z && i22.isEmpty()) {
            i22 = i2(this.S2, interfaceC4108Re1, c10833xx0, false, false);
        }
        if (i22.isEmpty()) {
            return InterfaceC10712xR1.r(1);
        }
        if (!AbstractC3914Pe1.C1(c10833xx0)) {
            return InterfaceC10712xR1.r(2);
        }
        C3621Me1 c3621Me1 = i22.get(0);
        boolean q = c3621Me1.q(c10833xx0);
        if (!q) {
            for (int i6 = 1; i6 < i22.size(); i6++) {
                C3621Me1 c3621Me12 = i22.get(i6);
                if (c3621Me12.q(c10833xx0)) {
                    z2 = false;
                    q = true;
                    c3621Me1 = c3621Me12;
                    break;
                }
            }
        }
        z2 = true;
        if (q) {
            i = 4;
        } else {
            i = 3;
        }
        if (c3621Me1.t(c10833xx0)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (c3621Me1.h) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (TD2.a >= 26 && C4128Rj1.w.equals(c10833xx0.g1) && !a.a(this.S2)) {
            i4 = 256;
        }
        if (q) {
            List<C3621Me1> i23 = i2(this.S2, interfaceC4108Re1, c10833xx0, z, true);
            if (!i23.isEmpty()) {
                C3621Me1 c3621Me13 = C5137af1.x(i23, c10833xx0).get(0);
                if (c3621Me13.q(c10833xx0) && c3621Me13.t(c10833xx0)) {
                    i5 = 32;
                }
            }
        }
        return InterfaceC10712xR1.n(i, i2, i5, i3, i4);
    }

    public final void B2(InterfaceC2827Ee1 interfaceC2827Ee1, C10833xx0 c10833xx0, int i, long j, boolean z) {
        long nanoTime;
        long j2;
        if (this.V2.p()) {
            nanoTime = this.V2.n(j, J0()) * 1000;
        } else {
            nanoTime = System.nanoTime();
        }
        long j3 = nanoTime;
        if (z) {
            j2 = j;
            w2(j2, j3, c10833xx0);
        } else {
            j2 = j;
        }
        if (TD2.a >= 21) {
            C2(interfaceC2827Ee1, i, j2, j3);
        } else {
            A2(interfaceC2827Ee1, i, j2);
        }
    }

    @ES1(21)
    public void C2(InterfaceC2827Ee1 interfaceC2827Ee1, int i, long j, long j2) {
        C7624kr2.a("releaseOutputBuffer");
        interfaceC2827Ee1.k(i, j2);
        C7624kr2.c();
        this.w2.e++;
        this.n3 = 0;
        if (!this.V2.p()) {
            this.q3 = SystemClock.elapsedRealtime() * 1000;
            t2(this.u3);
            r2();
        }
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    @InterfaceC2591Bt
    public void D(long j, long j2) throws C3824Og0 {
        super.D(j, j2);
        if (this.V2.p()) {
            this.V2.v(j, j2);
        }
    }

    @Override // o.AbstractC3914Pe1
    public boolean D0() {
        if (this.w3 && TD2.a < 23) {
            return true;
        }
        return false;
    }

    public final void E2() {
        long j;
        if (this.W2 > 0) {
            j = SystemClock.elapsedRealtime() + this.W2;
        } else {
            j = C10323vs.b;
        }
        this.k3 = j;
    }

    @Override // o.AbstractC3914Pe1
    public float F0(float f, C10833xx0 c10833xx0, C10833xx0[] c10833xx0Arr) {
        float f2 = -1.0f;
        for (C10833xx0 c10833xx02 : c10833xx0Arr) {
            float f3 = c10833xx02.n1;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @ES1(23)
    public void G2(InterfaceC2827Ee1 interfaceC2827Ee1, Surface surface) {
        interfaceC2827Ee1.f(surface);
    }

    @Override // o.AbstractC3914Pe1
    public List<C3621Me1> H0(InterfaceC4108Re1 interfaceC4108Re1, C10833xx0 c10833xx0, boolean z) throws C5137af1.c {
        return C5137af1.x(i2(this.S2, interfaceC4108Re1, c10833xx0, z, this.w3), c10833xx0);
    }

    public boolean H2(long j, long j2, boolean z) {
        if (o2(j) && !z) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3914Pe1
    @TargetApi(17)
    public InterfaceC2827Ee1.a I0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f) {
        int i;
        Surface surface;
        C6742hD1 c6742hD1 = this.d3;
        if (c6742hD1 != null && c6742hD1.X != c3621Me1.g) {
            z2();
        }
        String str = c3621Me1.c;
        b h2 = h2(c3621Me1, c10833xx0, P());
        this.Z2 = h2;
        boolean z = this.Y2;
        if (this.w3) {
            i = this.x3;
        } else {
            i = 0;
        }
        MediaFormat l2 = l2(c10833xx0, str, h2, f, z, i);
        if (this.c3 == null) {
            if (L2(c3621Me1)) {
                if (this.d3 == null) {
                    this.d3 = C6742hD1.c(this.S2, c3621Me1.g);
                }
                this.c3 = this.d3;
            } else {
                throw new IllegalStateException();
            }
        }
        if (this.V2.p()) {
            l2 = this.V2.k(l2);
        }
        if (this.V2.p()) {
            surface = this.V2.o();
        } else {
            surface = this.c3;
        }
        return InterfaceC2827Ee1.a.b(c3621Me1, l2, c10833xx0, surface, mediaCrypto);
    }

    public boolean I2(long j, long j2, boolean z) {
        if (n2(j) && !z) {
            return true;
        }
        return false;
    }

    public final boolean J2(long j, long j2) {
        boolean z;
        boolean z2;
        if (getState() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.i3 ? this.g3 : !z && !this.h3) {
            z2 = false;
        } else {
            z2 = true;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.q3;
        if (this.k3 != C10323vs.b || j < J0() || (!z2 && (!z || !K2(j2, elapsedRealtime)))) {
            return false;
        }
        return true;
    }

    public boolean K2(long j, long j2) {
        if (n2(j) && j2 > 100000) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3914Pe1
    @TargetApi(29)
    public void L0(C9267rW c9267rW) throws C3824Og0 {
        if (this.b3) {
            ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c9267rW.b1);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        D2(B0(), bArr);
                    }
                }
            }
        }
    }

    public final boolean L2(C3621Me1 c3621Me1) {
        if (TD2.a >= 23 && !this.w3 && !Z1(c3621Me1.a)) {
            if (!c3621Me1.g || C6742hD1.b(this.S2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void M2(InterfaceC2827Ee1 interfaceC2827Ee1, int i, long j) {
        C7624kr2.a("skipVideoBuffer");
        interfaceC2827Ee1.n(i, false);
        C7624kr2.c();
        this.w2.f++;
    }

    public void N2(int i, int i2) {
        C8775pW c8775pW = this.w2;
        c8775pW.h += i;
        int i3 = i + i2;
        c8775pW.g += i3;
        this.m3 += i3;
        int i4 = this.n3 + i3;
        this.n3 = i4;
        c8775pW.i = Math.max(i4, c8775pW.i);
        int i5 = this.X2;
        if (i5 > 0 && this.m3 >= i5) {
            q2();
        }
    }

    public void O2(long j) {
        this.w2.a(j);
        this.r3 += j;
        this.s3++;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void R() {
        X1();
        W1();
        this.e3 = false;
        this.y3 = null;
        try {
            super.R();
        } finally {
            this.U2.m(this.w2);
            this.U2.t(PG2.d1);
        }
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void S(boolean z, boolean z2) throws C3824Og0 {
        boolean z3;
        super.S(z, z2);
        boolean z4 = K().a;
        if (z4 && this.x3 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        C9542sf.i(z3);
        if (this.w3 != z4) {
            this.w3 = z4;
            l1();
        }
        this.U2.o(this.w2);
        this.h3 = z2;
        this.i3 = false;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void T(long j, boolean z) throws C3824Og0 {
        super.T(j, z);
        if (this.V2.p()) {
            this.V2.m();
        }
        W1();
        this.T2.j();
        this.p3 = C10323vs.b;
        this.j3 = C10323vs.b;
        this.n3 = 0;
        if (z) {
            E2();
        } else {
            this.k3 = C10323vs.b;
        }
    }

    public final long V1(long j, long j2, long j3, long j4, boolean z) {
        long K0 = (long) ((j4 - j) / K0());
        if (z) {
            return K0 - (j3 - j2);
        }
        return K0;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    @TargetApi(17)
    public void W() {
        try {
            super.W();
        } finally {
            if (this.V2.p()) {
                this.V2.x();
            }
            if (this.d3 != null) {
                z2();
            }
        }
    }

    @Override // o.AbstractC3914Pe1
    public void W0(Exception exc) {
        I31.e(A3, "Video codec error", exc);
        this.U2.s(exc);
    }

    public final void W1() {
        InterfaceC2827Ee1 B0;
        this.g3 = false;
        if (TD2.a >= 23 && this.w3 && (B0 = B0()) != null) {
            this.y3 = new c(B0);
        }
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void X() {
        super.X();
        this.m3 = 0;
        this.l3 = SystemClock.elapsedRealtime();
        this.q3 = SystemClock.elapsedRealtime() * 1000;
        this.r3 = 0L;
        this.s3 = 0;
        this.T2.k();
    }

    @Override // o.AbstractC3914Pe1
    public void X0(String str, InterfaceC2827Ee1.a aVar, long j, long j2) {
        this.U2.k(str, j, j2);
        this.a3 = Z1(str);
        this.b3 = ((C3621Me1) C9542sf.g(C0())).r();
        if (TD2.a >= 23 && this.w3) {
            this.y3 = new c((InterfaceC2827Ee1) C9542sf.g(B0()));
        }
        this.V2.t(str);
    }

    public final void X1() {
        this.v3 = null;
    }

    @Override // o.AbstractC3914Pe1, o.AbstractC2853El
    public void Y() {
        this.k3 = C10323vs.b;
        q2();
        s2();
        this.T2.l();
        super.Y();
    }

    @Override // o.AbstractC3914Pe1
    public void Y0(String str) {
        this.U2.l(str);
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC11300zs1
    public C9996uW Z0(C2899Ex0 c2899Ex0) throws C3824Og0 {
        C9996uW Z0 = super.Z0(c2899Ex0);
        this.U2.p(c2899Ex0.b, Z0);
        return Z0;
    }

    public boolean Z1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C5865df1.class) {
            try {
                if (!J3) {
                    K3 = d2();
                    J3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return K3;
    }

    @Override // o.AbstractC3914Pe1
    public void a1(C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC2827Ee1 B0 = B0();
        if (B0 != null) {
            B0.e(this.f3);
        }
        int i3 = 0;
        if (this.w3) {
            i2 = c10833xx0.l1;
            i = c10833xx0.m1;
        } else {
            C9542sf.g(mediaFormat);
            if (mediaFormat.containsKey(C3) && mediaFormat.containsKey(B3) && mediaFormat.containsKey(D3) && mediaFormat.containsKey(E3)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger(C3) - mediaFormat.getInteger(B3)) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger(D3) - mediaFormat.getInteger(E3)) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i4 = integer;
            i = integer2;
            i2 = i4;
        }
        float f = c10833xx0.p1;
        if (Y1()) {
            int i5 = c10833xx0.o1;
            if (i5 == 90 || i5 == 270) {
                f = 1.0f / f;
                int i6 = i;
                i = i2;
                i2 = i6;
            }
        } else if (!this.V2.p()) {
            i3 = c10833xx0.o1;
        }
        this.u3 = new PG2(i2, i, i3, f);
        this.T2.g(c10833xx0.n1);
        if (this.V2.p()) {
            this.V2.y(c10833xx0.b().n0(i2).S(i).f0(i3).c0(f).G());
        }
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    public boolean c() {
        boolean c2 = super.c();
        if (this.V2.p()) {
            return c2 & this.V2.w();
        }
        return c2;
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC2591Bt
    public void c1(long j) {
        super.c1(j);
        if (!this.w3) {
            this.o3--;
        }
    }

    public void c2(InterfaceC2827Ee1 interfaceC2827Ee1, int i, long j) {
        C7624kr2.a("dropVideoBuffer");
        interfaceC2827Ee1.n(i, false);
        C7624kr2.c();
        N2(0, 1);
    }

    @Override // o.AbstractC3914Pe1
    public void d1() {
        super.d1();
        W1();
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC2591Bt
    public void e1(C9267rW c9267rW) throws C3824Og0 {
        boolean z = this.w3;
        if (!z) {
            this.o3++;
        }
        if (TD2.a < 23 && z) {
            x2(c9267rW.a1);
        }
    }

    public Pair<IF, IF> e2(@InterfaceC11300zs1 IF r3) {
        if (!IF.g(r3)) {
            IF r32 = IF.a1;
            return Pair.create(r32, r32);
        } else if (r3.Z == 7) {
            return Pair.create(r3, r3.b().d(6).a());
        } else {
            return Pair.create(r3, r3);
        }
    }

    @Override // o.AbstractC3914Pe1
    public C9996uW f0(C3621Me1 c3621Me1, C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        int i;
        C9996uW f = c3621Me1.f(c10833xx0, c10833xx02);
        int i2 = f.e;
        int i3 = c10833xx02.l1;
        b bVar = this.Z2;
        if (i3 > bVar.a || c10833xx02.m1 > bVar.b) {
            i2 |= 256;
        }
        if (j2(c3621Me1, c10833xx02) > this.Z2.c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = c3621Me1.a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = f.d;
        }
        return new C9996uW(str, c10833xx0, c10833xx02, i, i4);
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC2591Bt
    public void f1(C10833xx0 c10833xx0) throws C3824Og0 {
        if (!this.V2.p()) {
            this.V2.r(c10833xx0, J0());
        }
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public String getName() {
        return A3;
    }

    @Override // o.AbstractC3914Pe1
    public boolean h1(long j, long j2, @InterfaceC11300zs1 InterfaceC2827Ee1 interfaceC2827Ee1, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10833xx0 c10833xx0) throws C3824Og0 {
        boolean z3;
        long j4;
        boolean z4;
        long j5;
        boolean z5;
        C9542sf.g(interfaceC2827Ee1);
        if (this.j3 == C10323vs.b) {
            this.j3 = j;
        }
        if (j3 != this.p3) {
            if (!this.V2.p()) {
                this.T2.h(j3);
            }
            this.p3 = j3;
        }
        long J0 = j3 - J0();
        if (z && !z2) {
            M2(interfaceC2827Ee1, i, J0);
            return true;
        }
        if (getState() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        long V1 = V1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z3);
        if (this.c3 == this.d3) {
            if (!n2(V1)) {
                return false;
            }
            M2(interfaceC2827Ee1, i, J0);
            O2(V1);
            return true;
        } else if (J2(j, V1)) {
            if (this.V2.p()) {
                if (!this.V2.s(c10833xx0, J0, z2)) {
                    return false;
                }
                z5 = false;
            } else {
                z5 = true;
            }
            B2(interfaceC2827Ee1, c10833xx0, i, J0, z5);
            O2(V1);
            return true;
        } else {
            if (z3 && j != this.j3) {
                long nanoTime = System.nanoTime();
                long b2 = this.T2.b((V1 * 1000) + nanoTime);
                if (!this.V2.p()) {
                    V1 = (b2 - nanoTime) / 1000;
                }
                if (this.k3 != C10323vs.b) {
                    j4 = V1;
                    z4 = true;
                } else {
                    j4 = V1;
                    z4 = false;
                }
                long j6 = j4;
                if (H2(j6, j2, z2) && p2(j, z4)) {
                    return false;
                }
                if (I2(j6, j2, z2)) {
                    if (z4) {
                        M2(interfaceC2827Ee1, i, J0);
                    } else {
                        c2(interfaceC2827Ee1, i, J0);
                    }
                    O2(j6);
                    return true;
                } else if (this.V2.p()) {
                    this.V2.v(j, j2);
                    if (!this.V2.s(c10833xx0, J0, z2)) {
                        return false;
                    }
                    B2(interfaceC2827Ee1, c10833xx0, i, J0, false);
                    return true;
                } else if (TD2.a >= 21) {
                    if (j6 < d.u) {
                        if (b2 == this.t3) {
                            M2(interfaceC2827Ee1, i, J0);
                            j5 = b2;
                        } else {
                            w2(J0, b2, c10833xx0);
                            C2(interfaceC2827Ee1, i, J0, b2);
                            j5 = b2;
                        }
                        O2(j6);
                        this.t3 = j5;
                        return true;
                    }
                } else if (j6 < 30000) {
                    if (j6 > 11000) {
                        try {
                            Thread.sleep((j6 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    w2(J0, b2, c10833xx0);
                    A2(interfaceC2827Ee1, i, J0);
                    O2(j6);
                    return true;
                }
            }
            return false;
        }
    }

    public b h2(C3621Me1 c3621Me1, C10833xx0 c10833xx0, C10833xx0[] c10833xx0Arr) {
        boolean z;
        int f2;
        int i = c10833xx0.l1;
        int i2 = c10833xx0.m1;
        int j2 = j2(c3621Me1, c10833xx0);
        if (c10833xx0Arr.length == 1) {
            if (j2 != -1 && (f2 = f2(c3621Me1, c10833xx0)) != -1) {
                j2 = Math.min((int) (j2 * 1.5f), f2);
            }
            return new b(i, i2, j2);
        }
        int length = c10833xx0Arr.length;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            C10833xx0 c10833xx02 = c10833xx0Arr[i3];
            if (c10833xx0.s1 != null && c10833xx02.s1 == null) {
                c10833xx02 = c10833xx02.b().L(c10833xx0.s1).G();
            }
            if (c3621Me1.f(c10833xx0, c10833xx02).d != 0) {
                int i4 = c10833xx02.l1;
                if (i4 != -1 && c10833xx02.m1 != -1) {
                    z = false;
                } else {
                    z = true;
                }
                z2 |= z;
                i = Math.max(i, i4);
                i2 = Math.max(i2, c10833xx02.m1);
                j2 = Math.max(j2, j2(c3621Me1, c10833xx02));
            }
        }
        if (z2) {
            I31.n(A3, "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point g2 = g2(c3621Me1, c10833xx0);
            if (g2 != null) {
                i = Math.max(i, g2.x);
                i2 = Math.max(i2, g2.y);
                j2 = Math.max(j2, f2(c3621Me1, c10833xx0.b().n0(i).S(i2).G()));
                I31.n(A3, "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new b(i, i2, j2);
    }

    @Override // o.AbstractC3914Pe1, o.InterfaceC10469wR1
    public boolean isReady() {
        C6742hD1 c6742hD1;
        if (super.isReady() && ((!this.V2.p() || this.V2.q()) && (this.g3 || (((c6742hD1 = this.d3) != null && this.c3 == c6742hD1) || B0() == null || this.w3)))) {
            this.k3 = C10323vs.b;
            return true;
        } else if (this.k3 == C10323vs.b) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.k3) {
                return true;
            }
            this.k3 = C10323vs.b;
            return false;
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat l2(C10833xx0 c10833xx0, String str, b bVar, float f, boolean z, int i) {
        Pair<Integer, Integer> s;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c10833xx0.l1);
        mediaFormat.setInteger("height", c10833xx0.m1);
        C7818lf1.x(mediaFormat, c10833xx0.i1);
        C7818lf1.r(mediaFormat, "frame-rate", c10833xx0.n1);
        C7818lf1.s(mediaFormat, "rotation-degrees", c10833xx0.o1);
        C7818lf1.q(mediaFormat, c10833xx0.s1);
        if (C4128Rj1.w.equals(c10833xx0.g1) && (s = C5137af1.s(c10833xx0)) != null) {
            C7818lf1.s(mediaFormat, Scopes.a, ((Integer) s.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.a);
        mediaFormat.setInteger("max-height", bVar.b);
        C7818lf1.s(mediaFormat, "max-input-size", bVar.c);
        if (TD2.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            a2(mediaFormat, i);
        }
        return mediaFormat;
    }

    @InterfaceC11300zs1
    public Surface m2() {
        return this.c3;
    }

    @Override // o.AbstractC3914Pe1
    @InterfaceC2591Bt
    public void n1() {
        super.n1();
        this.o3 = 0;
    }

    @Override // o.AbstractC3914Pe1
    public C3034Ge1 p0(Throwable th, @InterfaceC11300zs1 C3621Me1 c3621Me1) {
        return new C5380bf1(th, c3621Me1, this.c3);
    }

    public boolean p2(long j, boolean z) throws C3824Og0 {
        int c0 = c0(j);
        if (c0 == 0) {
            return false;
        }
        if (z) {
            C8775pW c8775pW = this.w2;
            c8775pW.d += c0;
            c8775pW.f += this.o3;
        } else {
            this.w2.j++;
            N2(c0, this.o3);
        }
        y0();
        if (this.V2.p()) {
            this.V2.m();
        }
        return true;
    }

    public final void q2() {
        if (this.m3 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.U2.n(this.m3, elapsedRealtime - this.l3);
            this.m3 = 0;
            this.l3 = elapsedRealtime;
        }
    }

    public void r2() {
        this.i3 = true;
        if (!this.g3) {
            this.g3 = true;
            this.U2.q(this.c3);
            this.e3 = true;
        }
    }

    public final void s2() {
        int i = this.s3;
        if (i != 0) {
            this.U2.r(this.r3, i);
            this.r3 = 0L;
            this.s3 = 0;
        }
    }

    @Override // o.AbstractC2853El, o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
        Surface surface;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    super.t(i, obj);
                                    return;
                                }
                                L82 l82 = (L82) C9542sf.g(obj);
                                if (l82.b() != 0 && l82.a() != 0 && (surface = this.c3) != null) {
                                    this.V2.z(surface, l82);
                                    return;
                                }
                                return;
                            }
                            this.V2.A((List) C9542sf.g(obj));
                            return;
                        }
                        this.T2.o(((Integer) obj).intValue());
                        return;
                    }
                    this.f3 = ((Integer) obj).intValue();
                    InterfaceC2827Ee1 B0 = B0();
                    if (B0 != null) {
                        B0.e(this.f3);
                        return;
                    }
                    return;
                }
                int intValue = ((Integer) obj).intValue();
                if (this.x3 != intValue) {
                    this.x3 = intValue;
                    if (this.w3) {
                        l1();
                        return;
                    }
                    return;
                }
                return;
            }
            this.z3 = (InterfaceC5529cG2) obj;
            return;
        }
        F2(obj);
    }

    public final void t2(PG2 pg2) {
        if (!pg2.equals(PG2.d1) && !pg2.equals(this.v3)) {
            this.v3 = pg2;
            this.U2.t(pg2);
        }
    }

    public final void u2() {
        if (this.e3) {
            this.U2.q(this.c3);
        }
    }

    public final void v2() {
        PG2 pg2 = this.v3;
        if (pg2 != null) {
            this.U2.t(pg2);
        }
    }

    public final void w2(long j, long j2, C10833xx0 c10833xx0) {
        InterfaceC5529cG2 interfaceC5529cG2 = this.z3;
        if (interfaceC5529cG2 != null) {
            interfaceC5529cG2.h(j, j2, c10833xx0, G0());
        }
    }

    public void x2(long j) throws C3824Og0 {
        G1(j);
        t2(this.u3);
        this.w2.e++;
        r2();
        c1(j);
    }

    @Override // o.AbstractC3914Pe1
    public boolean y1(C3621Me1 c3621Me1) {
        if (this.c3 == null && !L2(c3621Me1)) {
            return false;
        }
        return true;
    }

    public final void y2() {
        t1();
    }

    @ES1(17)
    public final void z2() {
        Surface surface = this.c3;
        C6742hD1 c6742hD1 = this.d3;
        if (surface == c6742hD1) {
            this.c3 = null;
        }
        c6742hD1.release();
        this.d3 = null;
    }

    public C5865df1(Context context, InterfaceC4108Re1 interfaceC4108Re1, long j) {
        this(context, interfaceC4108Re1, j, null, null, 0);
    }

    public C5865df1(Context context, InterfaceC4108Re1 interfaceC4108Re1, long j, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2, int i) {
        this(context, InterfaceC2827Ee1.b.a, interfaceC4108Re1, j, false, handler, ng2, i, 30.0f);
    }

    public C5865df1(Context context, InterfaceC4108Re1 interfaceC4108Re1, long j, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2, int i) {
        this(context, InterfaceC2827Ee1.b.a, interfaceC4108Re1, j, z, handler, ng2, i, 30.0f);
    }

    public C5865df1(Context context, InterfaceC2827Ee1.b bVar, InterfaceC4108Re1 interfaceC4108Re1, long j, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2, int i) {
        this(context, bVar, interfaceC4108Re1, j, z, handler, ng2, i, 30.0f);
    }

    public C5865df1(Context context, InterfaceC2827Ee1.b bVar, InterfaceC4108Re1 interfaceC4108Re1, long j, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2, int i, float f) {
        super(2, bVar, interfaceC4108Re1, z, f);
        this.W2 = j;
        this.X2 = i;
        Context applicationContext = context.getApplicationContext();
        this.S2 = applicationContext;
        C6755hG2 c6755hG2 = new C6755hG2(applicationContext);
        this.T2 = c6755hG2;
        this.U2 = new NG2.a(handler, ng2);
        this.V2 = new d(c6755hG2, this);
        this.Y2 = b2();
        this.k3 = C10323vs.b;
        this.f3 = 1;
        this.u3 = PG2.d1;
        this.x3 = 0;
        X1();
    }
}
