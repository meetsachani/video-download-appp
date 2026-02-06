package o;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C2837Eh;
import o.C3679Mt;
import o.InterfaceC2789Dt1;
import o.InterfaceC3240Ih;
import o.InterfaceC7617kq;

/* renamed from: o.Eh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2837Eh {
    public static final String w = "AudioSource";
    public static final long x = 3000;
    public final Executor a;
    public final AtomicReference<Boolean> b;
    public final AtomicBoolean c;
    public final InterfaceC3240Ih d;
    public final C8676p62 e;
    public final long f;
    public f g;
    public InterfaceC7617kq.a h;
    public boolean i;
    public Executor j;
    public d k;
    public InterfaceC7617kq<? extends ZP0> l;
    public XB0<ZP0> m;
    public InterfaceC2789Dt1.a<InterfaceC7617kq.a> n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f450o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public long u;
    public final int v;

    /* renamed from: o.Eh$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2789Dt1.a<InterfaceC7617kq.a> {
        public final /* synthetic */ InterfaceC7617kq a;

        public a(InterfaceC7617kq interfaceC7617kq) {
            this.a = interfaceC7617kq;
        }

        @Override // o.InterfaceC2789Dt1.a
        /* renamed from: b */
        public void a(InterfaceC7617kq.a aVar) {
            Objects.requireNonNull(aVar);
            if (C2837Eh.this.l == this.a) {
                C7433k41.a(C2837Eh.w, "Receive BufferProvider state change: " + C2837Eh.this.h + " to " + aVar);
                C2837Eh c2837Eh = C2837Eh.this;
                if (c2837Eh.h != aVar) {
                    c2837Eh.h = aVar;
                    c2837Eh.J();
                }
            }
        }

        @Override // o.InterfaceC2789Dt1.a
        public void onError(Throwable th) {
            C2837Eh c2837Eh = C2837Eh.this;
            if (c2837Eh.l == this.a) {
                c2837Eh.s(th);
            }
        }
    }

    /* renamed from: o.Eh$b */
    /* loaded from: classes.dex */
    public class b implements XB0<ZP0> {
        public final /* synthetic */ InterfaceC7617kq a;

        public b(InterfaceC7617kq interfaceC7617kq) {
            this.a = interfaceC7617kq;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (C2837Eh.this.l != this.a) {
                return;
            }
            C7433k41.a(C2837Eh.w, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (!(th instanceof IllegalStateException)) {
                C2837Eh.this.s(th);
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(ZP0 zp0) {
            C2837Eh c2837Eh = C2837Eh.this;
            if (c2837Eh.i && c2837Eh.l == this.a) {
                if (c2837Eh.f450o && c2837Eh.q()) {
                    C2837Eh.this.z();
                }
                InterfaceC3240Ih n = C2837Eh.this.n();
                ByteBuffer X = zp0.X();
                InterfaceC3240Ih.c read = n.read(X);
                if (read.a() > 0) {
                    C2837Eh c2837Eh2 = C2837Eh.this;
                    if (c2837Eh2.r) {
                        c2837Eh2.v(X, read.a());
                    }
                    if (C2837Eh.this.j != null) {
                        long b = read.b();
                        C2837Eh c2837Eh3 = C2837Eh.this;
                        if (b - c2837Eh3.u >= 200) {
                            c2837Eh3.u = read.b();
                            C2837Eh.this.w(X);
                        }
                    }
                    X.limit(X.position() + read.a());
                    zp0.c(TimeUnit.NANOSECONDS.toMicros(read.b()));
                    zp0.b();
                } else {
                    C7433k41.p(C2837Eh.w, "Unable to read data from AudioStream.");
                    zp0.cancel();
                }
                C2837Eh.this.A();
                return;
            }
            zp0.cancel();
        }
    }

    /* renamed from: o.Eh$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: o.Eh$e */
    /* loaded from: classes.dex */
    public class e implements InterfaceC3240Ih.a {
        public e() {
        }

        @Override // o.InterfaceC3240Ih.a
        public void a(boolean z) {
            C2837Eh c2837Eh = C2837Eh.this;
            c2837Eh.q = z;
            if (c2837Eh.g == f.STARTED) {
                c2837Eh.t();
            }
        }
    }

    /* renamed from: o.Eh$f */
    /* loaded from: classes.dex */
    public enum f {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public C2837Eh(AbstractC8328nh abstractC8328nh, Executor executor, Context context) throws C2946Fh {
        this(abstractC8328nh, executor, context, new InterfaceC3338Jh() { // from class: o.uh
            @Override // o.InterfaceC3338Jh
            public final InterfaceC3240Ih a(AbstractC8328nh abstractC8328nh2, Context context2) {
                return new C3534Lh(abstractC8328nh2, context2);
            }
        }, 3000L);
    }

    public static /* synthetic */ Object a(final C2837Eh c2837Eh, final C3679Mt.a aVar) {
        c2837Eh.a.execute(new Runnable() { // from class: o.zh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.f(C2837Eh.this, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(C2837Eh c2837Eh, Executor executor, d dVar) {
        c2837Eh.getClass();
        int i = c.a[c2837Eh.g.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
        c2837Eh.j = executor;
        c2837Eh.k = dVar;
    }

    public static /* synthetic */ void d(C2837Eh c2837Eh, InterfaceC7617kq interfaceC7617kq) {
        c2837Eh.getClass();
        int i = c.a[c2837Eh.g.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (c2837Eh.l != interfaceC7617kq) {
            c2837Eh.y(interfaceC7617kq);
        }
    }

    public static /* synthetic */ void e(C2837Eh c2837Eh, boolean z) {
        c2837Eh.getClass();
        int i = c.a[c2837Eh.g.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (c2837Eh.r != z) {
            c2837Eh.r = z;
            if (c2837Eh.g == f.STARTED) {
                c2837Eh.t();
            }
        }
    }

    public static /* synthetic */ void f(C2837Eh c2837Eh, C3679Mt.a aVar) {
        c2837Eh.getClass();
        try {
            int i = c.a[c2837Eh.g.ordinal()];
            if (i == 1 || i == 2) {
                c2837Eh.y(null);
                c2837Eh.e.g();
                c2837Eh.d.g();
                c2837Eh.I();
                c2837Eh.D(f.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    public static /* synthetic */ void g(C2837Eh c2837Eh) {
        c2837Eh.getClass();
        int i = c.a[c2837Eh.g.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            C7433k41.p(w, "AudioSource is released. Calling stop() is a no-op.");
            return;
        }
        c2837Eh.D(f.CONFIGURED);
        c2837Eh.J();
    }

    public static /* synthetic */ void k(C2837Eh c2837Eh, boolean z) {
        c2837Eh.getClass();
        int i = c.a[c2837Eh.g.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            throw new AssertionError("AudioSource is released");
        }
        c2837Eh.b.set(null);
        c2837Eh.c.set(false);
        c2837Eh.D(f.STARTED);
        c2837Eh.r(z);
        c2837Eh.J();
    }

    public static InterfaceC7617kq.a m(InterfaceC7617kq<? extends ZP0> interfaceC7617kq) {
        try {
            InterfaceFutureC8411o11<? extends ZP0> a2 = interfaceC7617kq.a();
            if (a2.isDone()) {
                return (InterfaceC7617kq.a) a2.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public static long o() {
        return System.nanoTime();
    }

    public static boolean p(int i, int i2, int i3) {
        return C3534Lh.j(i, i2, i3);
    }

    public void A() {
        InterfaceC7617kq<? extends ZP0> interfaceC7617kq = this.l;
        Objects.requireNonNull(interfaceC7617kq);
        InterfaceFutureC8411o11<? extends ZP0> c2 = interfaceC7617kq.c();
        XB0<ZP0> xb0 = this.m;
        Objects.requireNonNull(xb0);
        C7221jC0.b(c2, xb0, this.a);
    }

    public void B(final Executor executor, final d dVar) {
        this.a.execute(new Runnable() { // from class: o.Bh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.b(C2837Eh.this, executor, dVar);
            }
        });
    }

    public void C(final InterfaceC7617kq<? extends ZP0> interfaceC7617kq) {
        this.a.execute(new Runnable() { // from class: o.sh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.d(C2837Eh.this, interfaceC7617kq);
            }
        });
    }

    public void D(f fVar) {
        C7433k41.a(w, "Transitioning internal state: " + this.g + " --> " + fVar);
        this.g = fVar;
    }

    public void E() {
        this.a.execute(new Runnable() { // from class: o.Ah
            @Override // java.lang.Runnable
            public final void run() {
                r0.F(C2837Eh.this.r);
            }
        });
    }

    public void F(final boolean z) {
        this.a.execute(new Runnable() { // from class: o.xh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.k(C2837Eh.this, z);
            }
        });
    }

    public final void G() {
        if (this.i) {
            return;
        }
        try {
            C7433k41.a(w, "startSendingAudio");
            this.d.start();
            this.f450o = false;
        } catch (InterfaceC3240Ih.b e2) {
            C7433k41.q(w, "Failed to start AudioStream", e2);
            this.f450o = true;
            this.e.start();
            this.p = o();
            t();
        }
        this.i = true;
        A();
    }

    public void H() {
        this.a.execute(new Runnable() { // from class: o.vh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.g(C2837Eh.this);
            }
        });
    }

    public final void I() {
        if (!this.i) {
            return;
        }
        this.i = false;
        C7433k41.a(w, "stopSendingAudio");
        this.d.stop();
    }

    public void J() {
        boolean z;
        if (this.g == f.STARTED) {
            if (this.h == InterfaceC7617kq.a.ACTIVE) {
                z = true;
            } else {
                z = false;
            }
            u(!z);
            if (z) {
                G();
                return;
            } else {
                I();
                return;
            }
        }
        I();
    }

    public InterfaceC3240Ih n() {
        if (this.f450o) {
            return this.e;
        }
        return this.d;
    }

    public boolean q() {
        boolean z;
        if (this.p > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        if (o() - this.p < this.f) {
            return false;
        }
        return true;
    }

    public void r(final boolean z) {
        this.a.execute(new Runnable() { // from class: o.rh
            @Override // java.lang.Runnable
            public final void run() {
                C2837Eh.e(C2837Eh.this, z);
            }
        });
    }

    public void s(final Throwable th) {
        Executor executor = this.j;
        final d dVar = this.k;
        if (executor != null && dVar != null) {
            executor.execute(new Runnable() { // from class: o.th
                @Override // java.lang.Runnable
                public final void run() {
                    C2837Eh.d.this.onError(th);
                }
            });
        }
    }

    public void t() {
        final boolean z;
        Executor executor = this.j;
        final d dVar = this.k;
        if (executor != null && dVar != null) {
            if (!this.r && !this.f450o && !this.q) {
                z = false;
            } else {
                z = true;
            }
            if (!Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
                executor.execute(new Runnable() { // from class: o.yh
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2837Eh.d.this.a(z);
                    }
                });
            }
        }
    }

    public void u(final boolean z) {
        Executor executor = this.j;
        final d dVar = this.k;
        if (executor != null && dVar != null && this.c.getAndSet(z) != z) {
            executor.execute(new Runnable() { // from class: o.Dh
                @Override // java.lang.Runnable
                public final void run() {
                    C2837Eh.d.this.c(z);
                }
            });
        }
    }

    public void v(ByteBuffer byteBuffer, int i) {
        byte[] bArr = this.s;
        if (bArr == null || bArr.length < i) {
            this.s = new byte[i];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.s, 0, i);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    public void w(ByteBuffer byteBuffer) {
        Executor executor = this.j;
        final d dVar = this.k;
        if (this.v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d2 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d2 = Math.max(d2, Math.abs((int) asShortBuffer.get()));
            }
            this.t = d2 / 32767.0d;
            if (executor != null && dVar != null) {
                executor.execute(new Runnable() { // from class: o.Ch
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.b(C2837Eh.this.t);
                    }
                });
            }
        }
    }

    public InterfaceFutureC8411o11<Void> x() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.wh
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C2837Eh.a(C2837Eh.this, aVar);
            }
        });
    }

    public final void y(InterfaceC7617kq<? extends ZP0> interfaceC7617kq) {
        InterfaceC7617kq<? extends ZP0> interfaceC7617kq2 = this.l;
        if (interfaceC7617kq2 != null) {
            InterfaceC2789Dt1.a<InterfaceC7617kq.a> aVar = this.n;
            Objects.requireNonNull(aVar);
            interfaceC7617kq2.d(aVar);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = InterfaceC7617kq.a.INACTIVE;
            J();
        }
        if (interfaceC7617kq != null) {
            this.l = interfaceC7617kq;
            this.n = new a(interfaceC7617kq);
            this.m = new b(interfaceC7617kq);
            InterfaceC7617kq.a m = m(interfaceC7617kq);
            if (m != null) {
                this.h = m;
                J();
            }
            this.l.b(this.a, this.n);
        }
    }

    public void z() {
        C10907yF1.n(this.f450o);
        try {
            this.d.start();
            C7433k41.a(w, "Retry start AudioStream succeed");
            this.e.stop();
            this.f450o = false;
        } catch (InterfaceC3240Ih.b e2) {
            C7433k41.q(w, "Retry start AudioStream failed", e2);
            this.p = o();
        }
    }

    public C2837Eh(AbstractC8328nh abstractC8328nh, Executor executor, Context context, InterfaceC3338Jh interfaceC3338Jh, long j) throws C2946Fh {
        this.b = new AtomicReference<>(null);
        this.c = new AtomicBoolean(false);
        this.g = f.CONFIGURED;
        this.h = InterfaceC7617kq.a.INACTIVE;
        this.u = 0L;
        Executor i = C5211ay.i(executor);
        this.a = i;
        this.f = TimeUnit.MILLISECONDS.toNanos(j);
        try {
            C9829tq c9829tq = new C9829tq(interfaceC3338Jh.a(abstractC8328nh, context), abstractC8328nh);
            this.d = c9829tq;
            c9829tq.a(new e(), i);
            this.e = new C8676p62(abstractC8328nh);
            this.v = abstractC8328nh.b();
        } catch (IllegalArgumentException | InterfaceC3240Ih.b e2) {
            throw new C2946Fh("Unable to create AudioStream", e2);
        }
    }

    /* renamed from: o.Eh$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);

        void b(double d);

        void onError(Throwable th);

        default void c(boolean z) {
        }
    }
}
