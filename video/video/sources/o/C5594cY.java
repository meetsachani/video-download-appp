package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import o.AbstractC5317bO0;
import o.C11250zg;
import o.C3924Ph;
import o.C7063iY;
import o.InterfaceC3921Pg0;
import o.InterfaceC5143ah;
import o.InterfaceC9058qh;

@Deprecated
/* renamed from: o.cY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5594cY implements InterfaceC9058qh {
    public static final int A0 = 100;
    public static final String B0 = "DefaultAudioSink";
    public static boolean C0 = false;
    public static final Object D0 = new Object();
    @InterfaceC8710pF0("releaseExecutorLock")
    @InterfaceC11300zs1
    public static ExecutorService E0 = null;
    @InterfaceC8710pF0("releaseExecutorLock")
    public static int F0 = 0;
    public static final int l0 = 1000000;
    public static final float m0 = 1.0f;
    public static final float n0 = 0.1f;
    public static final float o0 = 8.0f;
    public static final float p0 = 0.1f;
    public static final float q0 = 8.0f;
    public static final boolean r0 = false;
    public static final int s0 = 0;
    public static final int t0 = 1;
    public static final int u0 = 2;
    public static final int v0 = 3;
    public static final int w0 = 0;
    public static final int x0 = 1;
    public static final int y0 = 2;
    public static final int z0 = -32;
    @InterfaceC11300zs1
    public AudioTrack A;
    public C10764xg B;
    public C11250zg C;
    public C9546sg D;
    @InterfaceC11300zs1
    public k E;
    public k F;
    public DD1 G;
    public boolean H;
    @InterfaceC11300zs1
    public ByteBuffer I;
    public int J;
    public long K;
    public long L;
    public long M;
    public long N;
    public int O;
    public boolean P;
    public boolean Q;
    public long R;
    public float S;
    @InterfaceC11300zs1
    public ByteBuffer T;
    public int U;
    @InterfaceC11300zs1
    public ByteBuffer V;
    public byte[] W;
    public int X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public C3737Nj d0;
    @InterfaceC11300zs1
    public final Context e;
    @InterfaceC11300zs1
    public d e0;
    public final InterfaceC5386bh f;
    public boolean f0;
    public final boolean g;
    public long g0;
    public final C9910uA h;
    public long h0;
    public final C11066yu2 i;
    public boolean i0;
    public final AbstractC5317bO0<InterfaceC5143ah> j;
    public boolean j0;
    public final AbstractC5317bO0<InterfaceC5143ah> k;
    @InterfaceC11300zs1
    public Looper k0;
    public final CJ l;
    public final C3924Ph m;
    public final ArrayDeque<k> n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f707o;
    public final int p;
    public p q;
    public final n<InterfaceC9058qh.b> r;
    public final n<InterfaceC9058qh.f> s;
    public final f t;
    @InterfaceC11300zs1
    public final InterfaceC3921Pg0.b u;
    @InterfaceC11300zs1
    public ND1 v;
    @InterfaceC11300zs1
    public InterfaceC9058qh.c w;
    @InterfaceC11300zs1
    public h x;
    public h y;
    public C4903Zg z;

    @ES1(23)
    /* renamed from: o.cY$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static void a(AudioTrack audioTrack, @InterfaceC11300zs1 d dVar) {
            AudioDeviceInfo audioDeviceInfo;
            if (dVar == null) {
                audioDeviceInfo = null;
            } else {
                audioDeviceInfo = dVar.a;
            }
            audioTrack.setPreferredDevice(audioDeviceInfo);
        }
    }

    @ES1(31)
    /* renamed from: o.cY$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @K40
        public static void a(AudioTrack audioTrack, ND1 nd1) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a = nd1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (!equals) {
                audioTrack.setLogSessionId(a);
            }
        }
    }

    @ES1(23)
    /* renamed from: o.cY$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final AudioDeviceInfo a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.a = audioDeviceInfo;
        }
    }

    @Deprecated
    /* renamed from: o.cY$e */
    /* loaded from: classes2.dex */
    public interface e extends InterfaceC5386bh {
    }

    /* renamed from: o.cY$f */
    /* loaded from: classes2.dex */
    public interface f {
        public static final f a = new C7063iY.a().g();

        int a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* renamed from: o.cY$h */
    /* loaded from: classes2.dex */
    public static final class h {
        public final C10833xx0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final C4903Zg i;
        public final boolean j;

        public h(C10833xx0 c10833xx0, int i, int i2, int i3, int i4, int i5, int i6, int i7, C4903Zg c4903Zg, boolean z) {
            this.a = c10833xx0;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = c4903Zg;
            this.j = z;
        }

        @ES1(21)
        public static AudioAttributes i(C9546sg c9546sg, boolean z) {
            if (z) {
                return j();
            }
            return c9546sg.b().a;
        }

        @ES1(21)
        public static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z, C9546sg c9546sg, int i) throws InterfaceC9058qh.b {
            try {
                AudioTrack d = d(z, c9546sg, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC9058qh.b(state, this.e, this.f, this.h, this.a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new InterfaceC9058qh.b(0, this.e, this.f, this.h, this.a, l(), e);
            }
        }

        public boolean b(h hVar) {
            if (hVar.c == this.c && hVar.g == this.g && hVar.e == this.e && hVar.f == this.f && hVar.d == this.d && hVar.j == this.j) {
                return true;
            }
            return false;
        }

        public h c(int i) {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, i, this.i, this.j);
        }

        public final AudioTrack d(boolean z, C9546sg c9546sg, int i) {
            int i2 = TD2.a;
            if (i2 >= 29) {
                return f(z, c9546sg, i);
            }
            if (i2 >= 21) {
                return e(z, c9546sg, i);
            }
            return g(c9546sg, i);
        }

        @ES1(21)
        public final AudioTrack e(boolean z, C9546sg c9546sg, int i) {
            return new AudioTrack(i(c9546sg, z), C5594cY.N(this.e, this.f, this.g), this.h, 1, i);
        }

        @ES1(29)
        public final AudioTrack f(boolean z, C9546sg c9546sg, int i) {
            AudioTrack.Builder offloadedPlayback;
            AudioFormat N = C5594cY.N(this.e, this.f, this.g);
            AudioAttributes i2 = i(c9546sg, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i2).setAudioFormat(N).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i);
            if (this.c != 1) {
                z2 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z2);
            return offloadedPlayback.build();
        }

        public final AudioTrack g(C9546sg c9546sg, int i) {
            int y0 = TD2.y0(c9546sg.Z);
            if (i == 0) {
                return new AudioTrack(y0, this.e, this.f, this.g, this.h, 1);
            }
            return new AudioTrack(y0, this.e, this.f, this.g, this.h, 1, i);
        }

        public long h(long j) {
            return TD2.B1(j, this.e);
        }

        public long k(long j) {
            return TD2.B1(j, this.a.u1);
        }

        public boolean l() {
            if (this.c == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.cY$i */
    /* loaded from: classes2.dex */
    public static class i implements e {
        public final InterfaceC5143ah[] a;
        public final C8189n62 b;
        public final T92 c;

        public i(InterfaceC5143ah... interfaceC5143ahArr) {
            this(interfaceC5143ahArr, new C8189n62(), new T92());
        }

        @Override // o.InterfaceC5386bh
        public long a(long j) {
            return this.c.a(j);
        }

        @Override // o.InterfaceC5386bh
        public DD1 b(DD1 dd1) {
            this.c.j(dd1.X);
            this.c.i(dd1.Y);
            return dd1;
        }

        @Override // o.InterfaceC5386bh
        public InterfaceC5143ah[] c() {
            return this.a;
        }

        @Override // o.InterfaceC5386bh
        public long d() {
            return this.b.p();
        }

        @Override // o.InterfaceC5386bh
        public boolean e(boolean z) {
            this.b.v(z);
            return z;
        }

        public i(InterfaceC5143ah[] interfaceC5143ahArr, C8189n62 c8189n62, T92 t92) {
            InterfaceC5143ah[] interfaceC5143ahArr2 = new InterfaceC5143ah[interfaceC5143ahArr.length + 2];
            this.a = interfaceC5143ahArr2;
            System.arraycopy(interfaceC5143ahArr, 0, interfaceC5143ahArr2, 0, interfaceC5143ahArr.length);
            this.b = c8189n62;
            this.c = t92;
            interfaceC5143ahArr2[interfaceC5143ahArr.length] = c8189n62;
            interfaceC5143ahArr2[interfaceC5143ahArr.length + 1] = t92;
        }
    }

    /* renamed from: o.cY$j */
    /* loaded from: classes2.dex */
    public static final class j extends RuntimeException {
        public j(String str) {
            super(str);
        }
    }

    /* renamed from: o.cY$k */
    /* loaded from: classes2.dex */
    public static final class k {
        public final DD1 a;
        public final long b;
        public final long c;

        public k(DD1 dd1, long j, long j2) {
            this.a = dd1;
            this.b = j;
            this.c = j2;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cY$l */
    /* loaded from: classes2.dex */
    public @interface l {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cY$m */
    /* loaded from: classes2.dex */
    public @interface m {
    }

    /* renamed from: o.cY$n */
    /* loaded from: classes2.dex */
    public static final class n<T extends Exception> {
        public final long a;
        @InterfaceC11300zs1
        public T b;
        public long c;

        public n(long j) {
            this.a = j;
        }

        public void a() {
            this.b = null;
        }

        public void b(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = t;
                this.c = this.a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.c) {
                T t2 = this.b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.b;
                a();
                throw t3;
            }
        }
    }

    /* renamed from: o.cY$o */
    /* loaded from: classes2.dex */
    public final class o implements C3924Ph.a {
        public o() {
        }

        @Override // o.C3924Ph.a
        public void a(int i, long j) {
            if (C5594cY.this.w != null) {
                C5594cY.this.w.e(i, j, SystemClock.elapsedRealtime() - C5594cY.this.h0);
            }
        }

        @Override // o.C3924Ph.a
        public void b(long j) {
            I31.n(C5594cY.B0, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // o.C3924Ph.a
        public void c(long j) {
            if (C5594cY.this.w != null) {
                C5594cY.this.w.c(j);
            }
        }

        @Override // o.C3924Ph.a
        public void d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + C6566gU0.h + j2 + C6566gU0.h + j3 + C6566gU0.h + j4 + C6566gU0.h + C5594cY.this.R() + C6566gU0.h + C5594cY.this.S();
            if (!C5594cY.C0) {
                I31.n(C5594cY.B0, str);
                return;
            }
            throw new j(str);
        }

        @Override // o.C3924Ph.a
        public void e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + C6566gU0.h + j2 + C6566gU0.h + j3 + C6566gU0.h + j4 + C6566gU0.h + C5594cY.this.R() + C6566gU0.h + C5594cY.this.S();
            if (!C5594cY.C0) {
                I31.n(C5594cY.B0, str);
                return;
            }
            throw new j(str);
        }
    }

    @ES1(29)
    /* renamed from: o.cY$p */
    /* loaded from: classes2.dex */
    public final class p {
        public final Handler a = new Handler(Looper.myLooper());
        public final AudioTrack$StreamEventCallback b;

        /* renamed from: o.cY$p$a */
        /* loaded from: classes2.dex */
        public class a extends AudioTrack$StreamEventCallback {
            public final /* synthetic */ C5594cY a;

            public a(C5594cY c5594cY) {
                this.a = c5594cY;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(C5594cY.this.A) && C5594cY.this.w != null && C5594cY.this.a0) {
                    C5594cY.this.w.h();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(C5594cY.this.A) && C5594cY.this.w != null && C5594cY.this.a0) {
                    C5594cY.this.w.h();
                }
            }
        }

        public p() {
            this.b = new a(C5594cY.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC7491kJ(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    @ES1(21)
    public static AudioFormat N(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int O(int i2, int i3, int i4) {
        boolean z;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i4);
        if (minBufferSize != -2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return minBufferSize;
    }

    public static int P(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return I3.e(byteBuffer);
            case 7:
            case 8:
                return O70.e(byteBuffer);
            case 9:
                int m2 = C3062Gl1.m(TD2.V(byteBuffer, byteBuffer.position()));
                if (m2 != -1) {
                    return m2;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int b2 = I3.b(byteBuffer);
                if (b2 == -1) {
                    return 0;
                }
                return I3.i(byteBuffer, b2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return M3.c(byteBuffer);
            case 20:
                return C6418fw1.g(byteBuffer);
        }
    }

    public static boolean U(int i2) {
        if ((TD2.a >= 24 && i2 == -6) || i2 == -32) {
            return true;
        }
        return false;
    }

    public static boolean W(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (TD2.a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void c0(final AudioTrack audioTrack, final CJ cj) {
        cj.d();
        synchronized (D0) {
            try {
                if (E0 == null) {
                    E0 = TD2.k1("ExoPlayer:AudioTrackReleaseThread");
                }
                F0++;
                E0.execute(new Runnable() { // from class: o.bY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5594cY.e(audioTrack, cj);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void e(AudioTrack audioTrack, CJ cj) {
        try {
            audioTrack.flush();
            audioTrack.release();
            cj.f();
            synchronized (D0) {
                try {
                    int i2 = F0 - 1;
                    F0 = i2;
                    if (i2 == 0) {
                        E0.shutdown();
                        E0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            cj.f();
            synchronized (D0) {
                try {
                    int i3 = F0 - 1;
                    F0 = i3;
                    if (i3 == 0) {
                        E0.shutdown();
                        E0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @ES1(21)
    public static void h0(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void i0(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    @ES1(21)
    public static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    public final void G(long j2) {
        DD1 dd1;
        boolean z;
        if (!m0()) {
            if (k0()) {
                dd1 = this.f.b(this.G);
            } else {
                dd1 = DD1.Y0;
            }
            this.G = dd1;
        } else {
            dd1 = DD1.Y0;
        }
        DD1 dd12 = dd1;
        if (k0()) {
            z = this.f.e(this.H);
        } else {
            z = false;
        }
        this.H = z;
        this.n.add(new k(dd12, Math.max(0L, j2), this.y.h(S())));
        j0();
        InterfaceC9058qh.c cVar = this.w;
        if (cVar != null) {
            cVar.a(this.H);
        }
    }

    public final long H(long j2) {
        while (!this.n.isEmpty() && j2 >= this.n.getFirst().c) {
            this.F = this.n.remove();
        }
        k kVar = this.F;
        long j3 = j2 - kVar.c;
        if (kVar.a.equals(DD1.Y0)) {
            return this.F.b + j3;
        }
        if (this.n.isEmpty()) {
            return this.F.b + this.f.a(j3);
        }
        k first = this.n.getFirst();
        return first.b - TD2.s0(first.c - j2, this.F.a.X);
    }

    public final long I(long j2) {
        return j2 + this.y.h(this.f.d());
    }

    public final AudioTrack J(h hVar) throws InterfaceC9058qh.b {
        try {
            AudioTrack a2 = hVar.a(this.f0, this.D, this.c0);
            InterfaceC3921Pg0.b bVar = this.u;
            if (bVar != null) {
                bVar.k(W(a2));
                return a2;
            }
            return a2;
        } catch (InterfaceC9058qh.b e2) {
            InterfaceC9058qh.c cVar = this.w;
            if (cVar != null) {
                cVar.b(e2);
            }
            throw e2;
        }
    }

    public final AudioTrack K() throws InterfaceC9058qh.b {
        try {
            return J((h) C9542sf.g(this.y));
        } catch (InterfaceC9058qh.b e2) {
            h hVar = this.y;
            if (hVar.h > 1000000) {
                h c2 = hVar.c(1000000);
                try {
                    AudioTrack J = J(c2);
                    this.y = c2;
                    return J;
                } catch (InterfaceC9058qh.b e3) {
                    e2.addSuppressed(e3);
                    X();
                    throw e2;
                }
            }
            X();
            throw e2;
        }
    }

    public final boolean L() throws InterfaceC9058qh.f {
        ByteBuffer byteBuffer;
        if (!this.z.g()) {
            ByteBuffer byteBuffer2 = this.V;
            if (byteBuffer2 == null) {
                return true;
            }
            o0(byteBuffer2, Long.MIN_VALUE);
            if (this.V != null) {
                return false;
            }
            return true;
        }
        this.z.i();
        a0(Long.MIN_VALUE);
        if (!this.z.f() || ((byteBuffer = this.V) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final C10764xg M() {
        if (this.C == null && this.e != null) {
            this.k0 = Looper.myLooper();
            C11250zg c11250zg = new C11250zg(this.e, new C11250zg.f() { // from class: o.aY
                @Override // o.C11250zg.f
                public final void a(C10764xg c10764xg) {
                    C5594cY.this.Y(c10764xg);
                }
            });
            this.C = c11250zg;
            this.B = c11250zg.d();
        }
        return this.B;
    }

    @ES1(29)
    @SuppressLint({"InlinedApi"})
    public final int Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i2 = TD2.a;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return 0;
        }
        if (i2 == 30 && TD2.d.startsWith("Pixel")) {
            return 2;
        }
        return 1;
    }

    public final long R() {
        h hVar = this.y;
        if (hVar.c == 0) {
            return this.K / hVar.b;
        }
        return this.L;
    }

    public final long S() {
        h hVar = this.y;
        if (hVar.c == 0) {
            return this.M / hVar.d;
        }
        return this.N;
    }

    public final boolean T() throws InterfaceC9058qh.b {
        boolean z;
        ND1 nd1;
        if (!this.l.e()) {
            return false;
        }
        AudioTrack K = K();
        this.A = K;
        if (W(K)) {
            b0(this.A);
            if (this.p != 3) {
                AudioTrack audioTrack = this.A;
                C10833xx0 c10833xx0 = this.y.a;
                audioTrack.setOffloadDelayPadding(c10833xx0.w1, c10833xx0.x1);
            }
        }
        int i2 = TD2.a;
        if (i2 >= 31 && (nd1 = this.v) != null) {
            c.a(this.A, nd1);
        }
        this.c0 = this.A.getAudioSessionId();
        C3924Ph c3924Ph = this.m;
        AudioTrack audioTrack2 = this.A;
        h hVar = this.y;
        if (hVar.c == 2) {
            z = true;
        } else {
            z = false;
        }
        c3924Ph.r(audioTrack2, z, hVar.g, hVar.d, hVar.h);
        g0();
        int i3 = this.d0.a;
        if (i3 != 0) {
            this.A.attachAuxEffect(i3);
            this.A.setAuxEffectSendLevel(this.d0.b);
        }
        d dVar = this.e0;
        if (dVar != null && i2 >= 23) {
            b.a(this.A, dVar);
        }
        this.Q = true;
        return true;
    }

    public final boolean V() {
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public final void X() {
        if (!this.y.l()) {
            return;
        }
        this.i0 = true;
    }

    public void Y(C10764xg c10764xg) {
        boolean z;
        if (this.k0 == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (!c10764xg.equals(M())) {
            this.B = c10764xg;
            InterfaceC9058qh.c cVar = this.w;
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    public final void Z() {
        if (!this.Z) {
            this.Z = true;
            this.m.f(S());
            this.A.stop();
            this.J = 0;
        }
    }

    @Override // o.InterfaceC9058qh
    public boolean a(C10833xx0 c10833xx0) {
        if (s(c10833xx0) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = r2.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r0.hasRemaining() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r2.z.j(r2.T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(long j2) throws InterfaceC9058qh.f {
        if (!this.z.g()) {
            ByteBuffer byteBuffer = this.T;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC5143ah.a;
            }
            o0(byteBuffer, j2);
            return;
        }
        while (!this.z.f()) {
            while (true) {
                ByteBuffer d2 = this.z.d();
                if (!d2.hasRemaining()) {
                    break;
                }
                o0(d2, j2);
                if (d2.hasRemaining()) {
                    return;
                }
            }
        }
    }

    @Override // o.InterfaceC9058qh
    public C9546sg b() {
        return this.D;
    }

    @ES1(29)
    public final void b0(AudioTrack audioTrack) {
        if (this.q == null) {
            this.q = new p();
        }
        this.q.a(audioTrack);
    }

    @Override // o.InterfaceC9058qh
    public boolean c() {
        if (V()) {
            if (!this.Y || m()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.InterfaceC9058qh
    public void d(int i2) {
        boolean z;
        if (this.c0 != i2) {
            this.c0 = i2;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b0 = z;
            flush();
        }
    }

    public final void d0() {
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.j0 = false;
        this.O = 0;
        this.F = new k(this.G, 0L, 0L);
        this.R = 0L;
        this.E = null;
        this.n.clear();
        this.T = null;
        this.U = 0;
        this.V = null;
        this.Z = false;
        this.Y = false;
        this.I = null;
        this.J = 0;
        this.i.n();
        j0();
    }

    public final void e0(DD1 dd1) {
        k kVar = new k(dd1, C10323vs.b, C10323vs.b);
        if (V()) {
            this.E = kVar;
        } else {
            this.F = kVar;
        }
    }

    @Override // o.InterfaceC9058qh
    public void f(DD1 dd1) {
        this.G = new DD1(TD2.v(dd1.X, 0.1f, 8.0f), TD2.v(dd1.Y, 0.1f, 8.0f));
        if (m0()) {
            f0();
        } else {
            e0(dd1);
        }
    }

    @ES1(23)
    public final void f0() {
        if (V()) {
            try {
                this.A.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.G.X).setPitch(this.G.Y).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                I31.o(B0, "Failed to set playback params", e2);
            }
            DD1 dd1 = new DD1(this.A.getPlaybackParams().getSpeed(), this.A.getPlaybackParams().getPitch());
            this.G = dd1;
            this.m.s(dd1.X);
        }
    }

    @Override // o.InterfaceC9058qh
    public void flush() {
        if (V()) {
            d0();
            if (this.m.h()) {
                this.A.pause();
            }
            if (W(this.A)) {
                ((p) C9542sf.g(this.q)).b(this.A);
            }
            if (TD2.a < 21 && !this.b0) {
                this.c0 = 0;
            }
            h hVar = this.x;
            if (hVar != null) {
                this.y = hVar;
                this.x = null;
            }
            this.m.p();
            c0(this.A, this.l);
            this.A = null;
        }
        this.s.a();
        this.r.a();
    }

    @Override // o.InterfaceC9058qh
    public void g() {
        C11250zg c11250zg = this.C;
        if (c11250zg != null) {
            c11250zg.e();
        }
    }

    public final void g0() {
        if (!V()) {
            return;
        }
        if (TD2.a >= 21) {
            h0(this.A, this.S);
        } else {
            i0(this.A, this.S);
        }
    }

    @Override // o.InterfaceC9058qh
    public DD1 h() {
        return this.G;
    }

    @Override // o.InterfaceC9058qh
    public void i(C3737Nj c3737Nj) {
        if (this.d0.equals(c3737Nj)) {
            return;
        }
        int i2 = c3737Nj.a;
        float f2 = c3737Nj.b;
        AudioTrack audioTrack = this.A;
        if (audioTrack != null) {
            if (this.d0.a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.A.setAuxEffectSendLevel(f2);
            }
        }
        this.d0 = c3737Nj;
    }

    @Override // o.InterfaceC9058qh
    public boolean j() {
        return this.H;
    }

    public final void j0() {
        C4903Zg c4903Zg = this.y.i;
        this.z = c4903Zg;
        c4903Zg.b();
    }

    @Override // o.InterfaceC9058qh
    public void k(boolean z) {
        DD1 dd1;
        this.H = z;
        if (m0()) {
            dd1 = DD1.Y0;
        } else {
            dd1 = this.G;
        }
        e0(dd1);
    }

    public final boolean k0() {
        if (!this.f0) {
            h hVar = this.y;
            if (hVar.c == 0 && !l0(hVar.a.v1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.InterfaceC9058qh
    public void l(@InterfaceC11300zs1 ND1 nd1) {
        this.v = nd1;
    }

    public final boolean l0(int i2) {
        if (this.g && TD2.T0(i2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9058qh
    public boolean m() {
        if (V() && this.m.g(S())) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        h hVar = this.y;
        if (hVar != null && hVar.j && TD2.a >= 23) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9058qh
    public void n(C9546sg c9546sg) {
        if (!this.D.equals(c9546sg)) {
            this.D = c9546sg;
            if (this.f0) {
                return;
            }
            flush();
        }
    }

    public final boolean n0(C10833xx0 c10833xx0, C9546sg c9546sg) {
        int f2;
        int S;
        int Q;
        boolean z;
        boolean z2;
        if (TD2.a < 29 || this.p == 0 || (f2 = C4128Rj1.f((String) C9542sf.g(c10833xx0.g1), c10833xx0.d1)) == 0 || (S = TD2.S(c10833xx0.t1)) == 0 || (Q = Q(N(c10833xx0.u1, S, f2), c9546sg.b().a)) == 0) {
            return false;
        }
        if (Q != 1) {
            if (Q == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (c10833xx0.w1 == 0 && c10833xx0.x1 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.p == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC9058qh
    public void o() {
        if (this.f0) {
            this.f0 = false;
            flush();
        }
    }

    public final void o0(ByteBuffer byteBuffer, long j2) throws InterfaceC9058qh.f {
        C5594cY c5594cY;
        ByteBuffer byteBuffer2;
        int p02;
        boolean z;
        InterfaceC9058qh.c cVar;
        boolean z2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.V;
            boolean z3 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.a(z2);
            } else {
                this.V = byteBuffer;
                if (TD2.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.W;
                    if (bArr == null || bArr.length < remaining) {
                        this.W = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.W, 0, remaining);
                    byteBuffer.position(position);
                    this.X = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (TD2.a < 21) {
                int b2 = this.m.b(this.M);
                if (b2 > 0) {
                    p02 = this.A.write(this.W, this.X, Math.min(remaining2, b2));
                    if (p02 > 0) {
                        this.X += p02;
                        byteBuffer.position(byteBuffer.position() + p02);
                    }
                } else {
                    p02 = 0;
                }
                c5594cY = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f0) {
                if (j2 != C10323vs.b) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                if (j2 == Long.MIN_VALUE) {
                    j2 = this.g0;
                } else {
                    this.g0 = j2;
                }
                c5594cY = this;
                byteBuffer2 = byteBuffer;
                p02 = c5594cY.q0(this.A, byteBuffer2, remaining2, j2);
            } else {
                c5594cY = this;
                byteBuffer2 = byteBuffer;
                p02 = p0(c5594cY.A, byteBuffer2, remaining2);
            }
            c5594cY.h0 = SystemClock.elapsedRealtime();
            if (p02 < 0) {
                if (!U(p02) || c5594cY.N <= 0) {
                    z3 = false;
                }
                InterfaceC9058qh.f fVar = new InterfaceC9058qh.f(p02, c5594cY.y.a, z3);
                InterfaceC9058qh.c cVar2 = c5594cY.w;
                if (cVar2 != null) {
                    cVar2.b(fVar);
                }
                if (!fVar.Y) {
                    c5594cY.s.b(fVar);
                    return;
                } else {
                    c5594cY.B = C10764xg.e;
                    throw fVar;
                }
            }
            c5594cY.s.a();
            if (W(c5594cY.A)) {
                if (c5594cY.N > 0) {
                    c5594cY.j0 = false;
                }
                if (c5594cY.a0 && (cVar = c5594cY.w) != null && p02 < remaining2 && !c5594cY.j0) {
                    cVar.d();
                }
            }
            int i2 = c5594cY.y.c;
            if (i2 == 0) {
                c5594cY.M += p02;
            }
            if (p02 == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer2 != c5594cY.T) {
                        z3 = false;
                    }
                    C9542sf.i(z3);
                    c5594cY.N += c5594cY.O * c5594cY.U;
                }
                c5594cY.V = null;
            }
        }
    }

    @Override // o.InterfaceC9058qh
    public void p(InterfaceC9058qh.c cVar) {
        this.w = cVar;
    }

    @Override // o.InterfaceC9058qh
    public void pause() {
        this.a0 = false;
        if (V() && this.m.o()) {
            this.A.pause();
        }
    }

    @Override // o.InterfaceC9058qh
    public boolean q(ByteBuffer byteBuffer, long j2, int i2) throws InterfaceC9058qh.b, InterfaceC9058qh.f {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer2 = this.T;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        if (this.x != null) {
            if (!L()) {
                return false;
            }
            if (!this.x.b(this.y)) {
                Z();
                if (m()) {
                    return false;
                }
                flush();
            } else {
                this.y = this.x;
                this.x = null;
                if (W(this.A) && this.p != 3) {
                    if (this.A.getPlayState() == 3) {
                        this.A.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.A;
                    C10833xx0 c10833xx0 = this.y.a;
                    audioTrack.setOffloadDelayPadding(c10833xx0.w1, c10833xx0.x1);
                    this.j0 = true;
                }
            }
            G(j2);
        }
        if (!V()) {
            try {
                if (!T()) {
                    return false;
                }
            } catch (InterfaceC9058qh.b e2) {
                if (!e2.Y) {
                    this.r.b(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.r.a();
        if (this.Q) {
            this.R = Math.max(0L, j2);
            this.P = false;
            this.Q = false;
            if (m0()) {
                f0();
            }
            G(j2);
            if (this.a0) {
                t0();
            }
        }
        if (!this.m.j(S())) {
            return false;
        }
        if (this.T == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.a(z2);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.y;
            if (hVar.c != 0 && this.O == 0) {
                int P = P(hVar.g, byteBuffer);
                this.O = P;
                if (P == 0) {
                    return true;
                }
            }
            if (this.E != null) {
                if (!L()) {
                    return false;
                }
                G(j2);
                this.E = null;
            }
            long k2 = this.R + this.y.k(R() - this.i.m());
            if (!this.P && Math.abs(k2 - j2) > 200000) {
                InterfaceC9058qh.c cVar = this.w;
                if (cVar != null) {
                    cVar.b(new InterfaceC9058qh.e(j2, k2));
                }
                this.P = true;
            }
            if (this.P) {
                if (!L()) {
                    return false;
                }
                long j3 = j2 - k2;
                this.R += j3;
                this.P = false;
                G(j2);
                InterfaceC9058qh.c cVar2 = this.w;
                if (cVar2 != null && j3 != 0) {
                    cVar2.g();
                }
            }
            if (this.y.c == 0) {
                this.K += byteBuffer.remaining();
            } else {
                this.L += this.O * i2;
            }
            this.T = byteBuffer;
            this.U = i2;
        }
        a0(j2);
        if (!this.T.hasRemaining()) {
            this.T = null;
            this.U = 0;
            return true;
        } else if (!this.m.i(S())) {
            return false;
        } else {
            I31.n(B0, "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    @ES1(21)
    public final int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (TD2.a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.I == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.I = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.I.putInt(1431633921);
        }
        if (this.J == 0) {
            this.I.putInt(4, i2);
            this.I.putLong(8, j2 * 1000);
            this.I.position(0);
            this.J = i2;
        }
        int remaining = this.I.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.I, remaining, 1);
            if (write < 0) {
                this.J = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int p02 = p0(audioTrack, byteBuffer, i2);
        if (p02 < 0) {
            this.J = 0;
            return p02;
        }
        this.J -= p02;
        return p02;
    }

    @Override // o.InterfaceC9058qh
    public void r() {
        boolean z;
        if (TD2.a < 25) {
            flush();
            return;
        }
        this.s.a();
        this.r.a();
        if (!V()) {
            return;
        }
        d0();
        if (this.m.h()) {
            this.A.pause();
        }
        this.A.flush();
        this.m.p();
        C3924Ph c3924Ph = this.m;
        AudioTrack audioTrack = this.A;
        h hVar = this.y;
        if (hVar.c == 2) {
            z = true;
        } else {
            z = false;
        }
        c3924Ph.r(audioTrack, z, hVar.g, hVar.d, hVar.h);
        this.Q = true;
    }

    @Override // o.InterfaceC9058qh
    public void reset() {
        flush();
        AbstractC6237fB2<InterfaceC5143ah> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        AbstractC6237fB2<InterfaceC5143ah> it2 = this.k.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        C4903Zg c4903Zg = this.z;
        if (c4903Zg != null) {
            c4903Zg.k();
        }
        this.a0 = false;
        this.i0 = false;
    }

    @Override // o.InterfaceC9058qh
    public int s(C10833xx0 c10833xx0) {
        if (C4128Rj1.N.equals(c10833xx0.g1)) {
            if (!TD2.U0(c10833xx0.v1)) {
                I31.n(B0, "Invalid PCM encoding: " + c10833xx0.v1);
                return 0;
            }
            int i2 = c10833xx0.v1;
            if (i2 == 2 || (this.g && i2 == 4)) {
                return 2;
            }
            return 1;
        } else if ((this.i0 || !n0(c10833xx0, this.D)) && !M().j(c10833xx0)) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // o.InterfaceC9058qh
    @ES1(23)
    public void setPreferredDevice(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        d dVar;
        if (audioDeviceInfo == null) {
            dVar = null;
        } else {
            dVar = new d(audioDeviceInfo);
        }
        this.e0 = dVar;
        AudioTrack audioTrack = this.A;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // o.InterfaceC9058qh
    public void setVolume(float f2) {
        if (this.S != f2) {
            this.S = f2;
            g0();
        }
    }

    @Override // o.InterfaceC9058qh
    public void t() throws InterfaceC9058qh.f {
        if (!this.Y && V() && L()) {
            Z();
            this.Y = true;
        }
    }

    @Override // o.InterfaceC9058qh
    public void t0() {
        this.a0 = true;
        if (V()) {
            this.m.t();
            this.A.play();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    @Override // o.InterfaceC9058qh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(C10833xx0 c10833xx0, int i2, @InterfaceC11300zs1 int[] iArr) throws InterfaceC9058qh.a {
        int intValue;
        int intValue2;
        C4903Zg c4903Zg;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int f2;
        int S;
        int i7;
        double d2;
        int i8;
        int a2;
        int[] iArr2;
        if (C4128Rj1.N.equals(c10833xx0.g1)) {
            C9542sf.a(TD2.U0(c10833xx0.v1));
            i5 = TD2.w0(c10833xx0.v1, c10833xx0.t1);
            AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
            if (l0(c10833xx0.v1)) {
                aVar.c(this.k);
            } else {
                aVar.c(this.j);
                aVar.b(this.f.c());
            }
            C4903Zg c4903Zg2 = new C4903Zg(aVar.e());
            if (c4903Zg2.equals(this.z)) {
                c4903Zg2 = this.z;
            }
            this.i.o(c10833xx0.w1, c10833xx0.x1);
            if (TD2.a < 21 && c10833xx0.t1 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.h.m(iArr2);
            try {
                InterfaceC5143ah.a a3 = c4903Zg2.a(new InterfaceC5143ah.a(c10833xx0.u1, c10833xx0.t1, c10833xx0.v1));
                intValue = a3.c;
                int i10 = a3.a;
                intValue2 = TD2.S(a3.b);
                i6 = TD2.w0(intValue, a3.b);
                c4903Zg = c4903Zg2;
                i3 = i10;
                z = this.f707o;
                i4 = 0;
            } catch (InterfaceC5143ah.b e2) {
                throw new InterfaceC9058qh.a(e2, c10833xx0);
            }
        } else {
            C4903Zg c4903Zg3 = new C4903Zg(AbstractC5317bO0.L());
            int i11 = c10833xx0.u1;
            if (n0(c10833xx0, this.D)) {
                i5 = -1;
                i6 = -1;
                i4 = 1;
                c4903Zg = c4903Zg3;
                f2 = C4128Rj1.f((String) C9542sf.g(c10833xx0.g1), c10833xx0.d1);
                i3 = i11;
                S = TD2.S(c10833xx0.t1);
                z = true;
                if (f2 == 0) {
                    if (S != 0) {
                        if (i2 != 0) {
                            a2 = i2;
                            i8 = i3;
                        } else {
                            f fVar = this.t;
                            int O = O(i3, S, f2);
                            if (i6 != -1) {
                                i7 = i6;
                            } else {
                                i7 = 1;
                            }
                            int i12 = c10833xx0.c1;
                            if (z) {
                                d2 = 8.0d;
                            } else {
                                d2 = 1.0d;
                            }
                            double d3 = d2;
                            i8 = i3;
                            a2 = fVar.a(O, f2, i4, i7, i8, i12, d3);
                        }
                        this.i0 = false;
                        h hVar = new h(c10833xx0, i5, i4, i6, i8, S, f2, a2, c4903Zg, z);
                        if (V()) {
                            this.x = hVar;
                            return;
                        } else {
                            this.y = hVar;
                            return;
                        }
                    }
                    throw new InterfaceC9058qh.a("Invalid output channel config (mode=" + i4 + ") for: " + c10833xx0, c10833xx0);
                }
                throw new InterfaceC9058qh.a("Invalid output encoding (mode=" + i4 + ") for: " + c10833xx0, c10833xx0);
            }
            Pair<Integer, Integer> f3 = M().f(c10833xx0);
            if (f3 != null) {
                intValue = ((Integer) f3.first).intValue();
                intValue2 = ((Integer) f3.second).intValue();
                c4903Zg = c4903Zg3;
                i3 = i11;
                z = this.f707o;
                i4 = 2;
                i5 = -1;
                i6 = -1;
            } else {
                throw new InterfaceC9058qh.a("Unable to configure passthrough for: " + c10833xx0, c10833xx0);
            }
        }
        f2 = intValue;
        S = intValue2;
        if (f2 == 0) {
        }
    }

    @Override // o.InterfaceC9058qh
    public long v(boolean z) {
        if (V() && !this.Q) {
            return I(H(Math.min(this.m.c(z), this.y.h(S()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC9058qh
    public void x() {
        this.P = true;
    }

    @Override // o.InterfaceC9058qh
    public void y() {
        boolean z;
        if (TD2.a >= 21) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        C9542sf.i(this.b0);
        if (!this.f0) {
            this.f0 = true;
            flush();
        }
    }

    @HS1({"#1.audioProcessorChain"})
    public C5594cY(g gVar) {
        C10764xg c10764xg;
        Context context = gVar.a;
        this.e = context;
        if (context == null) {
            c10764xg = gVar.b;
        } else {
            c10764xg = C10764xg.c(context);
        }
        this.B = c10764xg;
        this.f = gVar.c;
        int i2 = TD2.a;
        boolean z = true;
        this.g = i2 >= 21 && gVar.d;
        this.f707o = (i2 < 23 || !gVar.e) ? false : z;
        this.p = i2 >= 29 ? gVar.f : 0;
        this.t = gVar.g;
        CJ cj = new CJ(LD.a);
        this.l = cj;
        cj.f();
        this.m = new C3924Ph(new o());
        C9910uA c9910uA = new C9910uA();
        this.h = c9910uA;
        C11066yu2 c11066yu2 = new C11066yu2();
        this.i = c11066yu2;
        this.j = AbstractC5317bO0.U(new C3764Np2(), c9910uA, c11066yu2);
        this.k = AbstractC5317bO0.M(new C3666Mp2());
        this.S = 1.0f;
        this.D = C9546sg.b1;
        this.c0 = 0;
        this.d0 = new C3737Nj(0, 0.0f);
        DD1 dd1 = DD1.Y0;
        this.F = new k(dd1, 0L, 0L);
        this.G = dd1;
        this.H = false;
        this.n = new ArrayDeque<>();
        this.r = new n<>(100L);
        this.s = new n<>(100L);
        this.u = gVar.h;
    }

    /* renamed from: o.cY$g */
    /* loaded from: classes2.dex */
    public static final class g {
        @InterfaceC11300zs1
        public final Context a;
        public C10764xg b;
        @InterfaceC11300zs1
        public InterfaceC5386bh c;
        public boolean d;
        public boolean e;
        public int f;
        public f g;
        @InterfaceC11300zs1
        public InterfaceC3921Pg0.b h;

        @Deprecated
        public g() {
            this.a = null;
            this.b = C10764xg.e;
            this.f = 0;
            this.g = f.a;
        }

        public C5594cY g() {
            if (this.c == null) {
                this.c = new i(new InterfaceC5143ah[0]);
            }
            return new C5594cY(this);
        }

        @InterfaceC6181ey
        @Deprecated
        public g h(C10764xg c10764xg) {
            C9542sf.g(c10764xg);
            this.b = c10764xg;
            return this;
        }

        @InterfaceC6181ey
        public g i(InterfaceC5386bh interfaceC5386bh) {
            C9542sf.g(interfaceC5386bh);
            this.c = interfaceC5386bh;
            return this;
        }

        @InterfaceC6181ey
        public g j(InterfaceC5143ah[] interfaceC5143ahArr) {
            C9542sf.g(interfaceC5143ahArr);
            return i(new i(interfaceC5143ahArr));
        }

        @InterfaceC6181ey
        public g k(f fVar) {
            this.g = fVar;
            return this;
        }

        @InterfaceC6181ey
        public g l(boolean z) {
            this.e = z;
            return this;
        }

        @InterfaceC6181ey
        public g m(boolean z) {
            this.d = z;
            return this;
        }

        @InterfaceC6181ey
        public g n(@InterfaceC11300zs1 InterfaceC3921Pg0.b bVar) {
            this.h = bVar;
            return this;
        }

        @InterfaceC6181ey
        public g o(int i) {
            this.f = i;
            return this;
        }

        public g(Context context) {
            this.a = context;
            this.b = C10764xg.e;
            this.f = 0;
            this.g = f.a;
        }
    }
}
