package o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;
import o.C4884Zb0;
import o.InterfaceC11231zb0;
import o.InterfaceC2789Dt1;
import o.InterfaceC7617kq;

/* renamed from: o.Zb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4884Zb0 implements InterfaceC11231zb0 {
    public static final boolean F = false;
    public static final long G = Long.MAX_VALUE;
    public static final Range<Long> H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final long I = 1000;
    public static final int J = -9999;
    public final C3217Ib0 E;
    public final String b;
    public final boolean d;
    public final MediaFormat e;
    public final MediaCodec f;
    public final InterfaceC11231zb0.b g;
    public final InterfaceC10506wc0 h;
    public final Executor i;
    public final InterfaceFutureC8411o11<Void> j;
    public final C3679Mt.a<Void> k;
    public final EnumC5905dp2 q;
    public e u;
    public final Object c = new Object();
    public final Queue<Integer> l = new ArrayDeque();
    public final Queue<C3679Mt.a<ZP0>> m = new ArrayDeque();
    public final Set<ZP0> n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public final Set<C10502wb0> f685o = new HashSet();
    public final Deque<Range<Long>> p = new ArrayDeque();
    public final InterfaceC4540Vo2 r = new C3255Ik2();
    public InterfaceC2814Eb0 s = InterfaceC2814Eb0.a;
    public Executor t = C5211ay.b();
    public Range<Long> v = H;
    public long w = 0;
    public boolean x = false;
    public Long y = null;
    public Future<?> z = null;
    public f A = null;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;

    /* renamed from: o.Zb0$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: o.Zb0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: o.Zb0$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC11231zb0.a {
        public final Map<InterfaceC2789Dt1.a<? super InterfaceC7617kq.a>, Executor> a = new LinkedHashMap();
        public InterfaceC7617kq.a b = InterfaceC7617kq.a.INACTIVE;
        public final List<InterfaceFutureC8411o11<ZP0>> c = new ArrayList();

        public d() {
        }

        public static /* synthetic */ Object h(final d dVar, final C3679Mt.a aVar) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.ec0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(C4884Zb0.d.this.b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(d dVar, final InterfaceC2789Dt1.a aVar, Executor executor) {
            dVar.a.put((InterfaceC2789Dt1.a) C10907yF1.l(aVar), (Executor) C10907yF1.l(executor));
            final InterfaceC7617kq.a aVar2 = dVar.b;
            executor.execute(new Runnable() { // from class: o.ic0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2789Dt1.a.this.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final d dVar, final C3679Mt.a aVar) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.dc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.d.n(C4884Zb0.d.this, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final d dVar, C3679Mt.a aVar) {
            InterfaceC7617kq.a aVar2 = dVar.b;
            if (aVar2 == InterfaceC7617kq.a.ACTIVE) {
                final InterfaceFutureC8411o11<ZP0> y = C4884Zb0.this.y();
                C7221jC0.j(y, aVar);
                aVar.a(new Runnable() { // from class: o.fc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4884Zb0.d.this.p(y);
                    }
                }, C5211ay.b());
                dVar.c.add(y);
                y.h4(new Runnable() { // from class: o.gc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4884Zb0.d.this.c.remove(y);
                    }
                }, C4884Zb0.this.i);
            } else if (aVar2 == InterfaceC7617kq.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
            } else {
                aVar.f(new IllegalStateException("Unknown state: " + dVar.b));
            }
        }

        @Override // o.InterfaceC2789Dt1
        public InterfaceFutureC8411o11<InterfaceC7617kq.a> a() {
            return C3679Mt.a(new C3679Mt.c() { // from class: o.bc0
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4884Zb0.d.h(C4884Zb0.d.this, aVar);
                }
            });
        }

        @Override // o.InterfaceC2789Dt1
        public void b(final Executor executor, final InterfaceC2789Dt1.a<? super InterfaceC7617kq.a> aVar) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.ac0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.d.i(C4884Zb0.d.this, aVar, executor);
                }
            });
        }

        @Override // o.InterfaceC7617kq
        public InterfaceFutureC8411o11<ZP0> c() {
            return C3679Mt.a(new C3679Mt.c() { // from class: o.cc0
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4884Zb0.d.m(C4884Zb0.d.this, aVar);
                }
            });
        }

        @Override // o.InterfaceC2789Dt1
        public void d(final InterfaceC2789Dt1.a<? super InterfaceC7617kq.a> aVar) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.jc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.d.this.a.remove(C10907yF1.l(aVar));
                }
            });
        }

        public final void p(InterfaceFutureC8411o11<ZP0> interfaceFutureC8411o11) {
            if (!interfaceFutureC8411o11.cancel(true)) {
                C10907yF1.n(interfaceFutureC8411o11.isDone());
                try {
                    interfaceFutureC8411o11.get().cancel();
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    String str = C4884Zb0.this.b;
                    C7433k41.p(str, "Unable to cancel the input buffer: " + e);
                }
            }
        }

        public void q(boolean z) {
            final InterfaceC7617kq.a aVar;
            if (z) {
                aVar = InterfaceC7617kq.a.ACTIVE;
            } else {
                aVar = InterfaceC7617kq.a.INACTIVE;
            }
            if (this.b != aVar) {
                this.b = aVar;
                if (aVar == InterfaceC7617kq.a.INACTIVE) {
                    for (InterfaceFutureC8411o11<ZP0> interfaceFutureC8411o11 : this.c) {
                        interfaceFutureC8411o11.cancel(true);
                    }
                    this.c.clear();
                }
                for (final Map.Entry<InterfaceC2789Dt1.a<? super InterfaceC7617kq.a>, Executor> entry : this.a.entrySet()) {
                    try {
                        entry.getValue().execute(new Runnable() { // from class: o.hc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((InterfaceC2789Dt1.a) entry.getKey()).a(aVar);
                            }
                        });
                    } catch (RejectedExecutionException e) {
                        C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        }
    }

    /* renamed from: o.Zb0$e */
    /* loaded from: classes.dex */
    public enum e {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* renamed from: o.Zb0$f */
    /* loaded from: classes.dex */
    public class f extends MediaCodec.Callback {
        public final SG2 a;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public long e = 0;
        public long f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;

        /* renamed from: o.Zb0$f$a */
        /* loaded from: classes.dex */
        public class a implements XB0<Void> {
            public final /* synthetic */ C10502wb0 a;

            public a(C10502wb0 c10502wb0) {
                this.a = c10502wb0;
            }

            @Override // o.XB0
            public void b(Throwable th) {
                C4884Zb0.this.f685o.remove(this.a);
                if (th instanceof MediaCodec.CodecException) {
                    C4884Zb0.this.E((MediaCodec.CodecException) th);
                } else {
                    C4884Zb0.this.D(0, th.getMessage(), th);
                }
            }

            @Override // o.XB0
            /* renamed from: c */
            public void a(Void r2) {
                C4884Zb0.this.f685o.remove(this.a);
            }
        }

        public f() {
            EnumC5905dp2 enumC5905dp2 = null;
            if (C4884Zb0.this.d) {
                if (V20.a(C4178Rx.class) != null) {
                    C7433k41.p(C4884Zb0.this.b, "CameraUseInconsistentTimebaseQuirk is enabled");
                } else {
                    enumC5905dp2 = C4884Zb0.this.q;
                }
                this.a = new SG2(C4884Zb0.this.r, enumC5905dp2);
                return;
            }
            this.a = null;
        }

        public static /* synthetic */ void a(final f fVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final InterfaceC2814Eb0 interfaceC2814Eb0;
            final Executor executor;
            if (fVar.i) {
                C7433k41.p(C4884Zb0.this.b, "Receives frame after codec is reset.");
                return;
            }
            switch (b.a[C4884Zb0.this.u.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C4884Zb0.this.c) {
                        C4884Zb0 c4884Zb0 = C4884Zb0.this;
                        interfaceC2814Eb0 = c4884Zb0.s;
                        executor = c4884Zb0.t;
                    }
                    if (!fVar.b) {
                        fVar.b = true;
                        try {
                            Objects.requireNonNull(interfaceC2814Eb0);
                            executor.execute(new Runnable() { // from class: o.oc0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC2814Eb0.this.e();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (fVar.i(bufferInfo)) {
                        if (!fVar.c) {
                            fVar.c = true;
                            String str = C4884Zb0.this.b;
                            C7433k41.a(str, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + C4884Zb0.this.q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo l = fVar.l(bufferInfo);
                        fVar.f = l.presentationTimeUs;
                        try {
                            fVar.m(new C10502wb0(mediaCodec, i, l), interfaceC2814Eb0, executor);
                        } catch (MediaCodec.CodecException e2) {
                            C4884Zb0.this.E(e2);
                            return;
                        }
                    } else if (i != -9999) {
                        try {
                            C4884Zb0.this.f.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            C4884Zb0.this.E(e3);
                            return;
                        }
                    }
                    if (!fVar.d && fVar.j(bufferInfo)) {
                        fVar.d = true;
                        C4884Zb0.this.T(new Runnable() { // from class: o.pc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C4884Zb0.f.e(C4884Zb0.f.this, executor, interfaceC2814Eb0);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4884Zb0.this.u);
            }
        }

        public static /* synthetic */ MediaFormat b(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void e(f fVar, Executor executor, final InterfaceC2814Eb0 interfaceC2814Eb0) {
            if (C4884Zb0.this.u == e.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC2814Eb0);
                executor.execute(new Runnable() { // from class: o.nc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2814Eb0.this.a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
            }
        }

        public static /* synthetic */ void f(f fVar, final MediaFormat mediaFormat) {
            final InterfaceC2814Eb0 interfaceC2814Eb0;
            Executor executor;
            if (fVar.i) {
                C7433k41.p(C4884Zb0.this.b, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (b.a[C4884Zb0.this.u.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C4884Zb0.this.c) {
                        C4884Zb0 c4884Zb0 = C4884Zb0.this;
                        interfaceC2814Eb0 = c4884Zb0.s;
                        executor = c4884Zb0.t;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: o.sc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC2814Eb0.this.c(new InterfaceC2897Ew1() { // from class: o.rc0
                                    @Override // o.InterfaceC2897Ew1
                                    public final MediaFormat a() {
                                        return C4884Zb0.f.b(r1);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C4884Zb0.this.u);
            }
        }

        public static /* synthetic */ void g(f fVar, int i) {
            if (fVar.i) {
                C7433k41.p(C4884Zb0.this.b, "Receives input frame after codec is reset.");
                return;
            }
            switch (b.a[C4884Zb0.this.u.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C4884Zb0.this.l.offer(Integer.valueOf(i));
                    C4884Zb0.this.J();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4884Zb0.this.u);
            }
        }

        public static /* synthetic */ void h(f fVar, MediaCodec.CodecException codecException) {
            fVar.getClass();
            switch (b.a[C4884Zb0.this.u.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C4884Zb0.this.E(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4884Zb0.this.u);
            }
        }

        public final boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.d) {
                C7433k41.a(C4884Zb0.this.b, "Drop buffer by already reach end of stream.");
                return false;
            } else if (bufferInfo.size <= 0) {
                C7433k41.a(C4884Zb0.this.b, "Drop buffer by invalid buffer size.");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                C7433k41.a(C4884Zb0.this.b, "Drop buffer by codec config.");
                return false;
            } else {
                SG2 sg2 = this.a;
                if (sg2 != null) {
                    bufferInfo.presentationTimeUs = sg2.b(bufferInfo.presentationTimeUs);
                }
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.e) {
                    C7433k41.a(C4884Zb0.this.b, "Drop buffer by out of order buffer from MediaCodec.");
                    return false;
                }
                this.e = j;
                if (!C4884Zb0.this.v.contains((Range<Long>) Long.valueOf(j))) {
                    C7433k41.a(C4884Zb0.this.b, "Drop buffer by not in start-stop range.");
                    C4884Zb0 c4884Zb0 = C4884Zb0.this;
                    if (c4884Zb0.x && bufferInfo.presentationTimeUs >= c4884Zb0.v.getUpper().longValue()) {
                        Future<?> future = C4884Zb0.this.z;
                        if (future != null) {
                            future.cancel(true);
                        }
                        C4884Zb0.this.y = Long.valueOf(bufferInfo.presentationTimeUs);
                        C4884Zb0.this.Q();
                        C4884Zb0.this.x = false;
                    }
                    return false;
                } else if (o(bufferInfo)) {
                    C7433k41.a(C4884Zb0.this.b, "Drop buffer by pause.");
                    return false;
                } else if (C4884Zb0.this.C(bufferInfo) <= this.f) {
                    C7433k41.a(C4884Zb0.this.b, "Drop buffer by adjusted time is less than the last sent time.");
                    if (C4884Zb0.this.d && C4884Zb0.I(bufferInfo)) {
                        this.h = true;
                    }
                    return false;
                } else {
                    if (!this.c && !this.h && C4884Zb0.this.d) {
                        this.h = true;
                    }
                    if (this.h) {
                        if (!C4884Zb0.I(bufferInfo)) {
                            C7433k41.a(C4884Zb0.this.b, "Drop buffer by not a key frame.");
                            C4884Zb0.this.M();
                            return false;
                        }
                        this.h = false;
                    }
                    return true;
                }
            }
        }

        public final boolean j(MediaCodec.BufferInfo bufferInfo) {
            if (!C4884Zb0.G(bufferInfo) && !k(bufferInfo)) {
                return false;
            }
            return true;
        }

        public final boolean k(MediaCodec.BufferInfo bufferInfo) {
            C4884Zb0 c4884Zb0 = C4884Zb0.this;
            if (c4884Zb0.D && bufferInfo.presentationTimeUs > c4884Zb0.v.getUpper().longValue()) {
                return true;
            }
            return false;
        }

        public final MediaCodec.BufferInfo l(MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            long C = C4884Zb0.this.C(bufferInfo);
            if (bufferInfo.presentationTimeUs == C) {
                return bufferInfo;
            }
            if (C > this.f) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.n(z);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, C, bufferInfo.flags);
            return bufferInfo2;
        }

        public final void m(final C10502wb0 c10502wb0, final InterfaceC2814Eb0 interfaceC2814Eb0, Executor executor) {
            C4884Zb0.this.f685o.add(c10502wb0);
            C7221jC0.b(c10502wb0.z4(), new a(c10502wb0), C4884Zb0.this.i);
            try {
                executor.execute(new Runnable() { // from class: o.qc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2814Eb0.this.b(c10502wb0);
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
                c10502wb0.close();
            }
        }

        public void n() {
            this.i = true;
        }

        public final boolean o(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC2814Eb0 interfaceC2814Eb0;
            C4884Zb0.this.U(bufferInfo.presentationTimeUs);
            boolean H = C4884Zb0.this.H(bufferInfo.presentationTimeUs);
            boolean z = this.g;
            if (!z && H) {
                C7433k41.a(C4884Zb0.this.b, "Switch to pause state");
                this.g = true;
                synchronized (C4884Zb0.this.c) {
                    C4884Zb0 c4884Zb0 = C4884Zb0.this;
                    executor = c4884Zb0.t;
                    interfaceC2814Eb0 = c4884Zb0.s;
                }
                Objects.requireNonNull(interfaceC2814Eb0);
                executor.execute(new Runnable() { // from class: o.tc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2814Eb0.this.d();
                    }
                });
                C4884Zb0 c4884Zb02 = C4884Zb0.this;
                if (c4884Zb02.u == e.PAUSED && ((c4884Zb02.d || V20.a(C3040Gg.class) == null) && (!C4884Zb0.this.d || V20.a(YF2.class) == null))) {
                    InterfaceC11231zb0.b bVar = C4884Zb0.this.g;
                    if (bVar instanceof d) {
                        ((d) bVar).q(false);
                    }
                    C4884Zb0.this.O(true);
                }
                C4884Zb0.this.y = Long.valueOf(bufferInfo.presentationTimeUs);
                C4884Zb0 c4884Zb03 = C4884Zb0.this;
                if (c4884Zb03.x) {
                    Future<?> future = c4884Zb03.z;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C4884Zb0.this.Q();
                    C4884Zb0.this.x = false;
                }
            } else if (z && !H) {
                C7433k41.a(C4884Zb0.this.b, "Switch to resume state");
                this.g = false;
                if (C4884Zb0.this.d && !C4884Zb0.I(bufferInfo)) {
                    this.h = true;
                }
            }
            return this.g;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.uc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.f.h(C4884Zb0.f.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.kc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.f.g(C4884Zb0.f.this, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.mc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.f.a(C4884Zb0.f.this, bufferInfo, mediaCodec, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            C4884Zb0.this.i.execute(new Runnable() { // from class: o.lc0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.f.f(C4884Zb0.f.this, mediaFormat);
                }
            });
        }
    }

    /* renamed from: o.Zb0$g */
    /* loaded from: classes.dex */
    public class g implements InterfaceC11231zb0.c {
        public Surface b;
        public InterfaceC11231zb0.c.a d;
        public Executor e;
        public final Object a = new Object();
        public final Set<Surface> c = new HashSet();

        public g() {
        }

        public final void b(Executor executor, final InterfaceC11231zb0.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: o.vc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11231zb0.c.a.this.a(surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.d(C4884Zb0.this.b, "Unable to post to the supplied executor.", e);
            }
        }

        public void c() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.a) {
                surface = this.b;
                this.b = null;
                hashSet = new HashSet(this.c);
                this.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        public void d() {
            Surface createInputSurface;
            InterfaceC11231zb0.c.a aVar;
            Executor executor;
            C10992yc0 c10992yc0 = (C10992yc0) V20.a(C10992yc0.class);
            synchronized (this.a) {
                try {
                    if (c10992yc0 == null) {
                        if (this.b == null) {
                            createInputSurface = c.a();
                            this.b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        c.b(C4884Zb0.this.f, this.b);
                    } else {
                        Surface surface = this.b;
                        if (surface != null) {
                            this.c.add(surface);
                        }
                        createInputSurface = C4884Zb0.this.f.createInputSurface();
                        this.b = createInputSurface;
                    }
                    aVar = this.d;
                    executor = this.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (createInputSurface != null && aVar != null && executor != null) {
                b(executor, aVar, createInputSurface);
            }
        }

        @Override // o.InterfaceC11231zb0.c
        public void e(Executor executor, InterfaceC11231zb0.c.a aVar) {
            Surface surface;
            synchronized (this.a) {
                this.d = (InterfaceC11231zb0.c.a) C10907yF1.l(aVar);
                this.e = (Executor) C10907yF1.l(executor);
                surface = this.b;
            }
            if (surface != null) {
                b(executor, aVar, surface);
            }
        }
    }

    public C4884Zb0(Executor executor, InterfaceC2923Fb0 interfaceC2923Fb0) throws C8279nT0 {
        C3217Ib0 c3217Ib0 = new C3217Ib0();
        this.E = c3217Ib0;
        C10907yF1.l(executor);
        C10907yF1.l(interfaceC2923Fb0);
        this.i = C5211ay.i(executor);
        if (interfaceC2923Fb0 instanceof AbstractC2735Dg) {
            this.b = "AudioEncoder";
            this.d = false;
            this.g = new d();
        } else if (interfaceC2923Fb0 instanceof IF2) {
            this.b = "VideoEncoder";
            this.d = true;
            this.g = new g();
        } else {
            throw new C8279nT0("Unknown encoder config type");
        }
        EnumC5905dp2 c2 = interfaceC2923Fb0.c();
        this.q = c2;
        String str = this.b;
        C7433k41.a(str, "mInputTimebase = " + c2);
        MediaFormat a2 = interfaceC2923Fb0.a();
        this.e = a2;
        String str2 = this.b;
        C7433k41.a(str2, "mMediaFormat = " + a2);
        MediaCodec a3 = c3217Ib0.a(a2);
        this.f = a3;
        String str3 = this.b;
        C7433k41.f(str3, "Selected encoder: " + a3.getName());
        InterfaceC10506wc0 A = A(this.d, a3.getCodecInfo(), interfaceC2923Fb0.b());
        this.h = A;
        if (this.d) {
            z((NF2) A, a2);
        }
        try {
            N();
            final AtomicReference atomicReference = new AtomicReference();
            this.j = C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.Pb0
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4884Zb0.v(atomicReference, aVar);
                }
            }));
            this.k = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
            P(e.CONFIGURED);
        } catch (MediaCodec.CodecException e2) {
            throw new C8279nT0(e2);
        }
    }

    public static InterfaceC10506wc0 A(boolean z, MediaCodecInfo mediaCodecInfo, String str) throws C8279nT0 {
        if (z) {
            return new OF2(mediaCodecInfo, str);
        }
        return new C3236Ig(mediaCodecInfo, str);
    }

    public static boolean G(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public static boolean I(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void i(C4884Zb0 c4884Zb0) {
        if (c4884Zb0.x) {
            C7433k41.p(c4884Zb0.b, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            c4884Zb0.y = null;
            c4884Zb0.Q();
            c4884Zb0.x = false;
        }
    }

    public static /* synthetic */ void l(C4884Zb0 c4884Zb0, List list, Runnable runnable) {
        if (c4884Zb0.u != e.ERROR) {
            if (!list.isEmpty()) {
                C7433k41.a(c4884Zb0.b, "encoded data and input buffers are returned");
            }
            if ((c4884Zb0.g instanceof g) && !c4884Zb0.C) {
                c4884Zb0.f.flush();
                c4884Zb0.B = true;
            } else {
                c4884Zb0.f.stop();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        c4884Zb0.F();
    }

    public static /* synthetic */ void m(C4884Zb0 c4884Zb0) {
        c4884Zb0.getClass();
        int i = b.a[c4884Zb0.u.ordinal()];
        if (i != 2) {
            if (i != 7 && i != 9) {
                return;
            }
            throw new IllegalStateException("Encoder is released");
        }
        c4884Zb0.M();
    }

    public static /* synthetic */ void o(C4884Zb0 c4884Zb0, long j) {
        c4884Zb0.getClass();
        switch (b.a[c4884Zb0.u.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                String str = c4884Zb0.b;
                C7433k41.a(str, "Pause on " + QV.k(j));
                c4884Zb0.p.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                c4884Zb0.P(e.PAUSED);
                return;
            case 6:
                c4884Zb0.P(e.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c4884Zb0.u);
        }
    }

    public static /* synthetic */ void r(C4884Zb0 c4884Zb0) {
        c4884Zb0.C = true;
        if (c4884Zb0.B) {
            c4884Zb0.f.stop();
            c4884Zb0.N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void t(final C4884Zb0 c4884Zb0, long j, long j2) {
        c4884Zb0.getClass();
        switch (b.a[c4884Zb0.u.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                e eVar = c4884Zb0.u;
                c4884Zb0.P(e.STOPPING);
                Long lower = c4884Zb0.v.getLower();
                long longValue = lower.longValue();
                if (longValue != Long.MAX_VALUE) {
                    if (j != -1) {
                        if (j < longValue) {
                            C7433k41.p(c4884Zb0.b, "The expected stop time is less than the start time. Use current time as stop time.");
                        }
                        if (j < longValue) {
                            c4884Zb0.v = Range.create(lower, Long.valueOf(j));
                            String str = c4884Zb0.b;
                            C7433k41.a(str, "Stop on " + QV.k(j));
                            if (eVar == e.PAUSED && c4884Zb0.y != null) {
                                c4884Zb0.Q();
                                return;
                            }
                            c4884Zb0.x = true;
                            c4884Zb0.z = C5211ay.f().schedule(new Runnable() { // from class: o.Yb0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r0.i.execute(new Runnable() { // from class: o.Rb0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C4884Zb0.i(C4884Zb0.this);
                                        }
                                    });
                                }
                            }, 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                        throw new AssertionError("The start time should be before the stop time.");
                    }
                    j = j2;
                    if (j < longValue) {
                    }
                } else {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                break;
            case 5:
            case 6:
                c4884Zb0.P(e.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c4884Zb0.u);
        }
    }

    public static /* synthetic */ void u(C4884Zb0 c4884Zb0, long j) {
        boolean z;
        c4884Zb0.getClass();
        switch (b.a[c4884Zb0.u.ordinal()]) {
            case 1:
                c4884Zb0.y = null;
                C7433k41.a(c4884Zb0.b, "Start on " + QV.k(j));
                try {
                    if (c4884Zb0.B) {
                        c4884Zb0.N();
                    }
                    c4884Zb0.v = Range.create(Long.valueOf(j), Long.MAX_VALUE);
                    c4884Zb0.f.start();
                    InterfaceC11231zb0.b bVar = c4884Zb0.g;
                    if (bVar instanceof d) {
                        ((d) bVar).q(true);
                    }
                    c4884Zb0.P(e.STARTED);
                    return;
                } catch (MediaCodec.CodecException e2) {
                    c4884Zb0.E(e2);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                c4884Zb0.y = null;
                Range<Long> removeLast = c4884Zb0.p.removeLast();
                if (removeLast != null && removeLast.getUpper().longValue() == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                C10907yF1.o(z, "There should be a \"pause\" before \"resume\"");
                Long lower = removeLast.getLower();
                long longValue = lower.longValue();
                c4884Zb0.p.addLast(Range.create(lower, Long.valueOf(j)));
                C7433k41.a(c4884Zb0.b, "Resume on " + QV.k(j) + "\nPaused duration = " + QV.k(j - longValue));
                if ((c4884Zb0.d || V20.a(C3040Gg.class) == null) && (!c4884Zb0.d || V20.a(YF2.class) == null)) {
                    c4884Zb0.O(false);
                    InterfaceC11231zb0.b bVar2 = c4884Zb0.g;
                    if (bVar2 instanceof d) {
                        ((d) bVar2).q(true);
                    }
                }
                if (c4884Zb0.d) {
                    c4884Zb0.M();
                }
                c4884Zb0.P(e.STARTED);
                return;
            case 4:
            case 5:
                c4884Zb0.P(e.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c4884Zb0.u);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ Object w(AtomicReference atomicReference, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public static /* synthetic */ void x(C4884Zb0 c4884Zb0) {
        c4884Zb0.getClass();
        switch (b.a[c4884Zb0.u.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                c4884Zb0.L();
                return;
            case 4:
            case 5:
            case 6:
                c4884Zb0.P(e.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + c4884Zb0.u);
        }
    }

    public long B() {
        return this.r.b();
    }

    public long C(MediaCodec.BufferInfo bufferInfo) {
        long j = this.w;
        if (j > 0) {
            return bufferInfo.presentationTimeUs - j;
        }
        return bufferInfo.presentationTimeUs;
    }

    public void D(final int i, final String str, final Throwable th) {
        switch (b.a[this.u.ordinal()]) {
            case 1:
                K(i, str, th);
                N();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                P(e.ERROR);
                T(new Runnable() { // from class: o.Wb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4884Zb0.this.K(i, str, th);
                    }
                });
                return;
            case 8:
                String str2 = this.b;
                C7433k41.q(str2, "Get more than one error: " + str + C9811tl1.c + i + C9811tl1.d, th);
                return;
            default:
                return;
        }
    }

    public void E(MediaCodec.CodecException codecException) {
        D(1, codecException.getMessage(), codecException);
    }

    public void F() {
        e eVar = this.u;
        if (eVar == e.PENDING_RELEASE) {
            L();
            return;
        }
        if (!this.B) {
            N();
        }
        P(e.CONFIGURED);
        if (eVar == e.PENDING_START || eVar == e.PENDING_START_PAUSED) {
            start();
            if (eVar == e.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    public boolean H(long j) {
        for (Range<Long> range : this.p) {
            if (range.contains((Range<Long>) Long.valueOf(j))) {
                return true;
            }
            if (j < range.getLower().longValue()) {
                break;
            }
        }
        return false;
    }

    public void J() {
        while (!this.m.isEmpty() && !this.l.isEmpty()) {
            C3679Mt.a<ZP0> poll = this.m.poll();
            Objects.requireNonNull(poll);
            Integer poll2 = this.l.poll();
            Objects.requireNonNull(poll2);
            try {
                final C5325bQ0 c5325bQ0 = new C5325bQ0(this.f, poll2.intValue());
                if (poll.c(c5325bQ0)) {
                    this.n.add(c5325bQ0);
                    c5325bQ0.d().h4(new Runnable() { // from class: o.Ob0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4884Zb0.this.n.remove(c5325bQ0);
                        }
                    }, this.i);
                } else {
                    c5325bQ0.cancel();
                }
            } catch (MediaCodec.CodecException e2) {
                E(e2);
                return;
            }
        }
    }

    public void K(final int i, final String str, final Throwable th) {
        final InterfaceC2814Eb0 interfaceC2814Eb0;
        Executor executor;
        synchronized (this.c) {
            interfaceC2814Eb0 = this.s;
            executor = this.t;
        }
        try {
            executor.execute(new Runnable() { // from class: o.Jb0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2814Eb0.this.f(new C9035qb0(i, str, th));
                }
            });
        } catch (RejectedExecutionException e2) {
            C7433k41.d(this.b, "Unable to post to the supplied executor.", e2);
        }
    }

    public final void L() {
        if (this.B) {
            this.f.stop();
            this.B = false;
        }
        this.f.release();
        InterfaceC11231zb0.b bVar = this.g;
        if (bVar instanceof g) {
            ((g) bVar).c();
        }
        P(e.RELEASED);
        this.k.c(null);
    }

    public void M() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f.setParameters(bundle);
    }

    public final void N() {
        this.v = H;
        this.w = 0L;
        this.p.clear();
        this.l.clear();
        for (C3679Mt.a<ZP0> aVar : this.m) {
            aVar.d();
        }
        this.m.clear();
        this.f.reset();
        this.B = false;
        this.C = false;
        this.D = false;
        this.x = false;
        Future<?> future = this.z;
        if (future != null) {
            future.cancel(true);
            this.z = null;
        }
        f fVar = this.A;
        if (fVar != null) {
            fVar.n();
        }
        f fVar2 = new f();
        this.A = fVar2;
        this.f.setCallback(fVar2);
        this.f.configure(this.e, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC11231zb0.b bVar = this.g;
        if (bVar instanceof g) {
            ((g) bVar).d();
        }
    }

    public void O(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f.setParameters(bundle);
    }

    public final void P(e eVar) {
        if (this.u == eVar) {
            return;
        }
        String str = this.b;
        C7433k41.a(str, "Transitioning encoder internal state: " + this.u + " --> " + eVar);
        this.u = eVar;
    }

    public void Q() {
        InterfaceC11231zb0.b bVar = this.g;
        if (bVar instanceof d) {
            ((d) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            for (ZP0 zp0 : this.n) {
                arrayList.add(zp0.d());
            }
            C7221jC0.m(arrayList).h4(new Runnable() { // from class: o.Xb0
                @Override // java.lang.Runnable
                public final void run() {
                    C4884Zb0.this.R();
                }
            }, this.i);
        } else if (bVar instanceof g) {
            try {
                this.f.signalEndOfInputStream();
                this.D = true;
            } catch (MediaCodec.CodecException e2) {
                E(e2);
            }
        }
    }

    public final void R() {
        C7221jC0.b(y(), new a(), this.i);
    }

    public void S() {
        this.i.execute(new Runnable() { // from class: o.Ub0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.r(C4884Zb0.this);
            }
        });
    }

    public void T(final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        for (C10502wb0 c10502wb0 : this.f685o) {
            arrayList.add(c10502wb0.z4());
        }
        for (ZP0 zp0 : this.n) {
            arrayList.add(zp0.d());
        }
        if (!arrayList.isEmpty()) {
            String str = this.b;
            C7433k41.a(str, "Waiting for resources to return. encoded data = " + this.f685o.size() + ", input buffers = " + this.n.size());
        }
        C7221jC0.m(arrayList).h4(new Runnable() { // from class: o.Vb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.l(C4884Zb0.this, arrayList, runnable);
            }
        }, this.i);
    }

    public void U(long j) {
        while (!this.p.isEmpty()) {
            Range<Long> first = this.p.getFirst();
            if (j > first.getUpper().longValue()) {
                this.p.removeFirst();
                this.w += first.getUpper().longValue() - first.getLower().longValue();
                C7433k41.a(this.b, "Total paused duration = " + QV.k(this.w));
            } else {
                return;
            }
        }
    }

    @Override // o.InterfaceC11231zb0
    public InterfaceC11231zb0.b a() {
        return this.g;
    }

    @Override // o.InterfaceC11231zb0
    public void b(final long j) {
        final long B = B();
        this.i.execute(new Runnable() { // from class: o.Lb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.t(C4884Zb0.this, j, B);
            }
        });
    }

    @Override // o.InterfaceC11231zb0
    public void c(InterfaceC2814Eb0 interfaceC2814Eb0, Executor executor) {
        synchronized (this.c) {
            this.s = interfaceC2814Eb0;
            this.t = executor;
        }
    }

    @Override // o.InterfaceC11231zb0
    public InterfaceC10506wc0 d() {
        return this.h;
    }

    @Override // o.InterfaceC11231zb0
    public InterfaceFutureC8411o11<Void> e() {
        return this.j;
    }

    @Override // o.InterfaceC11231zb0
    public void f() {
        this.i.execute(new Runnable() { // from class: o.Tb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.m(C4884Zb0.this);
            }
        });
    }

    @Override // o.InterfaceC11231zb0
    public void g() {
        this.i.execute(new Runnable() { // from class: o.Sb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.x(C4884Zb0.this);
            }
        });
    }

    @Override // o.InterfaceC11231zb0
    public int h() {
        if (this.e.containsKey("bitrate")) {
            return this.e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // o.InterfaceC11231zb0
    public void pause() {
        final long B = B();
        this.i.execute(new Runnable() { // from class: o.Qb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.o(C4884Zb0.this, B);
            }
        });
    }

    @Override // o.InterfaceC11231zb0
    public void start() {
        final long B = B();
        this.i.execute(new Runnable() { // from class: o.Kb0
            @Override // java.lang.Runnable
            public final void run() {
                C4884Zb0.u(C4884Zb0.this, B);
            }
        });
    }

    @Override // o.InterfaceC11231zb0
    public void stop() {
        b(-1L);
    }

    public InterfaceFutureC8411o11<ZP0> y() {
        switch (b.a[this.u.ordinal()]) {
            case 1:
                return C7221jC0.f(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                InterfaceFutureC8411o11<ZP0> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.Mb0
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return C4884Zb0.w(atomicReference, aVar);
                    }
                });
                final C3679Mt.a<ZP0> aVar = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
                this.m.offer(aVar);
                aVar.a(new Runnable() { // from class: o.Nb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4884Zb0.this.m.remove(aVar);
                    }
                }, this.i);
                J();
                return a2;
            case 8:
                return C7221jC0.f(new IllegalStateException("Encoder is in error state."));
            case 9:
                return C7221jC0.f(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.u);
        }
    }

    public final void z(NF2 nf2, MediaFormat mediaFormat) {
        C10907yF1.n(this.d);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = nf2.f().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                String str = this.b;
                C7433k41.a(str, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    /* renamed from: o.Zb0$a */
    /* loaded from: classes.dex */
    public class a implements XB0<ZP0> {
        public a() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C4884Zb0.this.D(0, "Unable to acquire InputBuffer.", th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(ZP0 zp0) {
            zp0.c(C4884Zb0.this.B());
            zp0.a(true);
            zp0.b();
            C7221jC0.b(zp0.d(), new C0256a(), C4884Zb0.this.i);
        }

        /* renamed from: o.Zb0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0256a implements XB0<Void> {
            public C0256a() {
            }

            @Override // o.XB0
            public void b(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    C4884Zb0.this.E((MediaCodec.CodecException) th);
                } else {
                    C4884Zb0.this.D(0, th.getMessage(), th);
                }
            }

            @Override // o.XB0
            /* renamed from: c */
            public void a(Void r1) {
            }
        }
    }
}
