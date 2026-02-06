package o;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC3007Fx;
import o.C3016Ga;
import o.C3153Hj2;
import o.C3399Jx;
import o.C3597Ly;
import o.C3679Mt;
import o.C4851Yu;
import o.C9803tj1;
import o.D10;
import o.InterfaceC7402jx;
import o.InterfaceC9610sw;
import o.T12;

/* renamed from: o.Yu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4851Yu implements InterfaceC7402jx {
    public static final String C1 = "Camera2CameraImpl";
    public static final int D1 = 0;
    public final C7641kw A1;
    public final V80 B1;
    public final C6500gD2 X;
    public final C8392nx Y;
    public final ScheduledExecutorService Y0;
    public final Executor Z;
    public volatile g Z0 = g.INITIALIZED;
    public final I11<InterfaceC7402jx.a> a1;
    public final C3105Gx b1;
    public final C11306zu c1;
    public final h d1;
    public final C5926dv e1;
    public CameraDevice f1;
    public int g1;
    public InterfaceC4970Zy h1;
    public final AtomicInteger i1;
    public InterfaceFutureC8411o11<Void> j1;
    public C3679Mt.a<Void> k1;
    public final Map<InterfaceC4970Zy, InterfaceFutureC8411o11<Void>> l1;
    public final d m1;
    public final e n1;
    public final InterfaceC2797Dw o1;
    public final C3399Jx p1;
    public final Set<C4863Yy> q1;
    public C9803tj1 r1;
    public final C5700cz s1;
    public final C3153Hj2.a t1;
    public final Set<String> u1;
    public InterfaceC8388nw v1;
    public final Object w1;
    public InterfaceC4988a22 x1;
    public boolean y1;
    public final C10376w40 z1;

    /* renamed from: o.Yu$b */
    /* loaded from: classes.dex */
    public class b implements XB0<Void> {
        public b() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (th instanceof D10.a) {
                T12 W = C4851Yu.this.W(((D10.a) th).a());
                if (W != null) {
                    C4851Yu.this.n0(W);
                }
            } else if (th instanceof CancellationException) {
                C4851Yu.this.U("Unable to configure camera cancelled");
            } else {
                g gVar = C4851Yu.this.Z0;
                g gVar2 = g.OPENED;
                if (gVar == gVar2) {
                    C4851Yu.this.v0(gVar2, AbstractC3007Fx.b.b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    C4851Yu c4851Yu = C4851Yu.this;
                    c4851Yu.U("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    C7433k41.c("Camera2CameraImpl", "Unable to configure camera " + C4851Yu.this.e1.c() + ", timeout!");
                }
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            if (C4851Yu.this.o1.e() == 2 && C4851Yu.this.Z0 == g.OPENED) {
                C4851Yu.this.u0(g.CONFIGURED);
            }
        }
    }

    /* renamed from: o.Yu$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: o.Yu$d */
    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements C3399Jx.c {
        public final String a;
        public boolean b = true;

        public d(String str) {
            this.a = str;
        }

        @Override // o.C3399Jx.c
        public void a() {
            if (C4851Yu.this.Z0 == g.PENDING_OPEN) {
                C4851Yu.this.C0(false);
            }
        }

        public boolean b() {
            return this.b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.a.equals(str)) {
                this.b = true;
                if (C4851Yu.this.Z0 == g.PENDING_OPEN) {
                    C4851Yu.this.C0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (!this.a.equals(str)) {
                return;
            }
            this.b = false;
        }
    }

    /* renamed from: o.Yu$e */
    /* loaded from: classes.dex */
    public final class e implements C3399Jx.b {
        public e() {
        }

        @Override // o.C3399Jx.b
        public void a() {
            if (C4851Yu.this.Z0 == g.OPENED) {
                C4851Yu.this.l0();
            }
        }
    }

    /* renamed from: o.Yu$f */
    /* loaded from: classes.dex */
    public final class f implements InterfaceC9610sw.c {
        public f() {
        }

        @Override // o.InterfaceC9610sw.c
        public void a() {
            C4851Yu.this.D0();
        }

        @Override // o.InterfaceC9610sw.c
        public void b(List<C3597Ly> list) {
            C4851Yu.this.x0((List) C10907yF1.l(list));
        }
    }

    /* renamed from: o.Yu$g */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: o.Yu$h */
    /* loaded from: classes.dex */
    public final class h extends CameraDevice.StateCallback {
        public final Executor a;
        public final ScheduledExecutorService b;
        public b c;
        public ScheduledFuture<?> d;
        public final a e = new a();

        /* renamed from: o.Yu$h$a */
        /* loaded from: classes.dex */
        public class a {
            public static final int c = 700;
            public static final int d = 10000;
            public static final int e = 1000;
            public static final int f = 1800000;
            public static final int g = -1;
            public long a = -1;

            public a() {
            }

            public boolean a() {
                if (b() >= d()) {
                    e();
                    return false;
                }
                return true;
            }

            public long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.a == -1) {
                    this.a = uptimeMillis;
                }
                return uptimeMillis - this.a;
            }

            public int c() {
                if (!h.this.f()) {
                    return 700;
                }
                long b = b();
                if (b <= 120000) {
                    return 1000;
                }
                if (b <= 300000) {
                    return 2000;
                }
                return S92.y;
            }

            public int d() {
                if (!h.this.f()) {
                    return 10000;
                }
                return 1800000;
            }

            public void e() {
                this.a = -1L;
            }
        }

        /* renamed from: o.Yu$h$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public Executor X;
            public boolean Y = false;

            public b(Executor executor) {
                this.X = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                boolean z;
                if (!bVar.Y) {
                    if (C4851Yu.this.Z0 == g.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10907yF1.n(z);
                    if (h.this.f()) {
                        C4851Yu.this.B0(true);
                    } else {
                        C4851Yu.this.C0(true);
                    }
                }
            }

            public void b() {
                this.Y = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.execute(new Runnable() { // from class: o.Zu
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4851Yu.h.b.a(C4851Yu.h.b.this);
                    }
                });
            }
        }

        public h(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.a = executor;
            this.b = scheduledExecutorService;
        }

        public boolean a() {
            if (this.d == null) {
                return false;
            }
            C4851Yu c4851Yu = C4851Yu.this;
            c4851Yu.U("Cancelling scheduled re-open: " + this.c);
            this.c.b();
            this.c = null;
            this.d.cancel(false);
            this.d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i) {
            boolean z;
            int i2;
            if (C4851Yu.this.Z0 != g.OPENING && C4851Yu.this.Z0 != g.OPENED && C4851Yu.this.Z0 != g.CONFIGURED && C4851Yu.this.Z0 != g.REOPENING) {
                z = false;
            } else {
                z = true;
            }
            C10907yF1.o(z, "Attempt to handle open error from non open state: " + C4851Yu.this.Z0);
            if (i != 1 && i != 2 && i != 4) {
                C7433k41.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C4851Yu.Z(i) + " closing camera.");
                if (i == 3) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                C4851Yu.this.v0(g.CLOSING, AbstractC3007Fx.b.a(i2));
                C4851Yu.this.Q(false);
                return;
            }
            C7433k41.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C4851Yu.Z(i)));
            c(i);
        }

        public final void c(int i) {
            boolean z;
            int i2 = 1;
            if (C4851Yu.this.g1 != 0) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            C4851Yu.this.v0(g.REOPENING, AbstractC3007Fx.b.a(i2));
            C4851Yu.this.Q(false);
        }

        public void d() {
            this.e.e();
        }

        public void e() {
            boolean z;
            boolean z2 = true;
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.n(z);
            if (this.d != null) {
                z2 = false;
            }
            C10907yF1.n(z2);
            if (this.e.a()) {
                this.c = new b(this.a);
                C4851Yu.this.U("Attempting camera re-open in " + this.e.c() + "ms: " + this.c + " activeResuming = " + C4851Yu.this.y1);
                this.d = this.b.schedule(this.c, (long) this.e.c(), TimeUnit.MILLISECONDS);
                return;
            }
            C7433k41.c("Camera2CameraImpl", "Camera reopening attempted for " + this.e.d() + "ms without success.");
            C4851Yu.this.w0(g.PENDING_OPEN, null, false);
        }

        public boolean f() {
            C4851Yu c4851Yu = C4851Yu.this;
            if (c4851Yu.y1) {
                int i = c4851Yu.g1;
                if (i == 1 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            boolean z;
            C4851Yu.this.U("CameraDevice.onClosed()");
            if (C4851Yu.this.f1 == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = c.a[C4851Yu.this.Z0.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("Camera closed while in state: " + C4851Yu.this.Z0);
                    }
                } else {
                    C4851Yu c4851Yu = C4851Yu.this;
                    if (c4851Yu.g1 != 0) {
                        c4851Yu.U("Camera closed due to error: " + C4851Yu.Z(C4851Yu.this.g1));
                        e();
                        return;
                    }
                    c4851Yu.C0(false);
                    return;
                }
            }
            C10907yF1.n(C4851Yu.this.f0());
            C4851Yu.this.X();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C4851Yu.this.U("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            C4851Yu c4851Yu = C4851Yu.this;
            c4851Yu.f1 = cameraDevice;
            c4851Yu.g1 = i;
            switch (c.a[c4851Yu.Z0.ordinal()]) {
                case 3:
                case 8:
                    C7433k41.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C4851Yu.Z(i), C4851Yu.this.Z0.name()));
                    C4851Yu.this.Q(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    C7433k41.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C4851Yu.Z(i), C4851Yu.this.Z0.name()));
                    b(cameraDevice, i);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + C4851Yu.this.Z0);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C4851Yu.this.U("CameraDevice.onOpened()");
            C4851Yu c4851Yu = C4851Yu.this;
            c4851Yu.f1 = cameraDevice;
            c4851Yu.g1 = 0;
            d();
            int i = c.a[C4851Yu.this.Z0.ordinal()];
            if (i != 3) {
                if (i != 6 && i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("onOpened() should not be possible from state: " + C4851Yu.this.Z0);
                    }
                } else {
                    C4851Yu.this.u0(g.OPENED);
                    C3399Jx c3399Jx = C4851Yu.this.p1;
                    String id = cameraDevice.getId();
                    C4851Yu c4851Yu2 = C4851Yu.this;
                    if (c3399Jx.j(id, c4851Yu2.o1.d(c4851Yu2.f1.getId()))) {
                        C4851Yu.this.l0();
                        return;
                    }
                    return;
                }
            }
            C10907yF1.n(C4851Yu.this.f0());
            C4851Yu.this.f1.close();
            C4851Yu.this.f1 = null;
        }
    }

    /* renamed from: o.Yu$i */
    /* loaded from: classes.dex */
    public static abstract class i {
        public static i a(String str, Class<?> cls, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2, Size size) {
            return new C9797ti(str, cls, t12, interfaceC6743hD2, size);
        }

        public static i b(androidx.camera.core.m mVar) {
            return a(C4851Yu.c0(mVar), mVar.getClass(), mVar.t(), mVar.j(), mVar.f());
        }

        public abstract T12 c();

        public abstract Size d();

        public abstract InterfaceC6743hD2<?> e();

        public abstract String f();

        public abstract Class<?> g();
    }

    public C4851Yu(C8392nx c8392nx, String str, C5926dv c5926dv, InterfaceC2797Dw interfaceC2797Dw, C3399Jx c3399Jx, Executor executor, Handler handler, C10376w40 c10376w40) throws C3594Lx {
        I11<InterfaceC7402jx.a> i11 = new I11<>();
        this.a1 = i11;
        this.g1 = 0;
        this.i1 = new AtomicInteger(0);
        this.l1 = new LinkedHashMap();
        this.q1 = new HashSet();
        this.u1 = new HashSet();
        this.v1 = C9125qw.a();
        this.w1 = new Object();
        this.y1 = false;
        this.Y = c8392nx;
        this.o1 = interfaceC2797Dw;
        this.p1 = c3399Jx;
        ScheduledExecutorService h2 = C5211ay.h(handler);
        this.Y0 = h2;
        Executor i2 = C5211ay.i(executor);
        this.Z = i2;
        this.d1 = new h(i2, h2);
        this.X = new C6500gD2(str);
        i11.k(InterfaceC7402jx.a.CLOSED);
        C3105Gx c3105Gx = new C3105Gx(c3399Jx);
        this.b1 = c3105Gx;
        C5700cz c5700cz = new C5700cz(i2);
        this.s1 = c5700cz;
        this.z1 = c10376w40;
        try {
            C7641kw d2 = c8392nx.d(str);
            this.A1 = d2;
            C11306zu c11306zu = new C11306zu(d2, h2, i2, new f(), c5926dv.m());
            this.c1 = c11306zu;
            this.e1 = c5926dv;
            c5926dv.F(c11306zu);
            c5926dv.I(c3105Gx.a());
            this.B1 = V80.a(d2);
            this.h1 = h0();
            this.t1 = new C3153Hj2.a(i2, h2, handler, c5700cz, c5926dv.m(), X20.b());
            d dVar = new d(str);
            this.m1 = dVar;
            e eVar = new e();
            this.n1 = eVar;
            c3399Jx.h(this, i2, eVar, dVar);
            c8392nx.h(i2, dVar);
        } catch (C3197Hv e2) {
            throw C3692Mx.a(e2);
        }
    }

    public static /* synthetic */ Object A(C4851Yu c4851Yu, C3679Mt.a aVar) {
        boolean z;
        if (c4851Yu.k1 == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Camera can only be released once, so release completer should be null on creation.");
        c4851Yu.k1 = aVar;
        return "Release[camera=" + c4851Yu + C6566gU0.g;
    }

    public static /* synthetic */ void B(C4851Yu c4851Yu, String str, T12 t12, InterfaceC6743hD2 interfaceC6743hD2) {
        c4851Yu.getClass();
        c4851Yu.U("Use case " + str + " UPDATED");
        c4851Yu.X.r(str, t12, interfaceC6743hD2);
        c4851Yu.D0();
    }

    public static /* synthetic */ void D(C4851Yu c4851Yu, C3679Mt.a aVar) {
        C9803tj1 c9803tj1 = c4851Yu.r1;
        if (c9803tj1 == null) {
            aVar.c(Boolean.FALSE);
            return;
        }
        aVar.c(Boolean.valueOf(c4851Yu.X.l(a0(c9803tj1))));
    }

    public static /* synthetic */ void E(C4851Yu c4851Yu, String str, T12 t12, InterfaceC6743hD2 interfaceC6743hD2) {
        c4851Yu.getClass();
        c4851Yu.U("Use case " + str + " ACTIVE");
        c4851Yu.X.n(str, t12, interfaceC6743hD2);
        c4851Yu.X.r(str, t12, interfaceC6743hD2);
        c4851Yu.D0();
    }

    public static /* synthetic */ Object F(final C4851Yu c4851Yu, final C3679Mt.a aVar) {
        c4851Yu.getClass();
        try {
            c4851Yu.Z.execute(new Runnable() { // from class: o.Fu
                @Override // java.lang.Runnable
                public final void run() {
                    C4851Yu.D(C4851Yu.this, aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void G(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void I(C4851Yu c4851Yu) {
        if (!c4851Yu.e0()) {
            return;
        }
        c4851Yu.t0(a0(c4851Yu.r1), c4851Yu.r1.g(), c4851Yu.r1.h());
    }

    public static /* synthetic */ void J(C4851Yu c4851Yu, String str) {
        c4851Yu.getClass();
        c4851Yu.U("Use case " + str + " INACTIVE");
        c4851Yu.X.q(str);
        c4851Yu.D0();
    }

    public static /* synthetic */ Object K(final C4851Yu c4851Yu, final String str, final C3679Mt.a aVar) {
        c4851Yu.getClass();
        try {
            c4851Yu.Z.execute(new Runnable() { // from class: o.Lu
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(C4851Yu.this.X.l(str)));
                }
            });
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    public static String Z(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    public static String a0(C9803tj1 c9803tj1) {
        return c9803tj1.e() + c9803tj1.hashCode();
    }

    public static String c0(androidx.camera.core.m mVar) {
        return mVar.o() + mVar.hashCode();
    }

    public static /* synthetic */ Object t(final C4851Yu c4851Yu, final C3679Mt.a aVar) {
        c4851Yu.Z.execute(new Runnable() { // from class: o.Ju
            @Override // java.lang.Runnable
            public final void run() {
                C7221jC0.j(C4851Yu.this.o0(), aVar);
            }
        });
        return "Release[request=" + c4851Yu.i1.getAndIncrement() + C6566gU0.g;
    }

    public static /* synthetic */ void w(C4851Yu c4851Yu, boolean z) {
        c4851Yu.y1 = z;
        if (z && c4851Yu.Z0 == g.PENDING_OPEN) {
            c4851Yu.B0(false);
        }
    }

    public static /* synthetic */ void x(C4851Yu c4851Yu, String str, T12 t12, InterfaceC6743hD2 interfaceC6743hD2) {
        c4851Yu.getClass();
        c4851Yu.U("Use case " + str + " RESET");
        c4851Yu.X.r(str, t12, interfaceC6743hD2);
        c4851Yu.O();
        c4851Yu.s0(false);
        c4851Yu.D0();
        if (c4851Yu.Z0 == g.OPENED) {
            c4851Yu.l0();
        }
    }

    public static /* synthetic */ void y(C4851Yu c4851Yu, List list) {
        c4851Yu.getClass();
        try {
            c4851Yu.z0(list);
        } finally {
            c4851Yu.c1.D();
        }
    }

    public final void A0(Collection<i> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (i iVar : collection) {
            if (this.X.l(iVar.f())) {
                this.X.m(iVar.f());
                arrayList.add(iVar.f());
                if (iVar.g() == androidx.camera.core.k.class) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            U("Use cases [" + TextUtils.join(C6566gU0.h, arrayList) + "] now DETACHED for camera");
            if (z) {
                this.c1.e0(null);
            }
            O();
            if (this.X.h().isEmpty()) {
                this.c1.a(false);
            } else {
                E0();
            }
            if (this.X.g().isEmpty()) {
                this.c1.D();
                s0(false);
                this.c1.d0(false);
                this.h1 = h0();
                R();
                return;
            }
            D0();
            s0(false);
            if (this.Z0 == g.OPENED) {
                l0();
            }
        }
    }

    public void B0(boolean z) {
        U("Attempting to force open the camera.");
        if (!this.p1.i(this)) {
            U("No cameras available. Waiting for available camera before opening camera.");
            u0(g.PENDING_OPEN);
            return;
        }
        k0(z);
    }

    public void C0(boolean z) {
        U("Attempting to open the camera.");
        if (this.m1.b() && this.p1.i(this)) {
            k0(z);
            return;
        }
        U("No cameras available. Waiting for available camera before opening camera.");
        u0(g.PENDING_OPEN);
    }

    public void D0() {
        T12.g d2 = this.X.d();
        if (d2.f()) {
            this.c1.f0(d2.c().m());
            d2.a(this.c1.c());
            this.h1.g(d2.c());
            return;
        }
        this.c1.c0();
        this.h1.g(this.c1.c());
    }

    public final void E0() {
        boolean z = false;
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : this.X.h()) {
            z |= interfaceC6743hD2.Z(false);
        }
        this.c1.a(z);
    }

    public final void N() {
        C9803tj1 c9803tj1 = this.r1;
        if (c9803tj1 != null) {
            String a0 = a0(c9803tj1);
            this.X.o(a0, this.r1.g(), this.r1.h());
            this.X.n(a0, this.r1.g(), this.r1.h());
        }
    }

    public final void O() {
        T12 c2 = this.X.f().c();
        C3597Ly i2 = c2.i();
        int size = i2.g().size();
        int size2 = c2.l().size();
        if (!c2.l().isEmpty()) {
            if (i2.g().isEmpty()) {
                if (this.r1 == null) {
                    this.r1 = new C9803tj1(this.e1.B(), this.z1, new C9803tj1.c() { // from class: o.Iu
                        @Override // o.C9803tj1.c
                        public final void a() {
                            C4851Yu.I(C4851Yu.this);
                        }
                    });
                }
                N();
            } else if (size2 == 1 && size == 1) {
                r0();
            } else if (size >= 2) {
                r0();
            } else {
                C7433k41.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    public final boolean P(C3597Ly.a aVar) {
        if (!aVar.n().isEmpty()) {
            C7433k41.p("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (T12 t12 : this.X.e()) {
            List<D10> g2 = t12.i().g();
            if (!g2.isEmpty()) {
                for (D10 d10 : g2) {
                    aVar.f(d10);
                }
            }
        }
        if (aVar.n().isEmpty()) {
            C7433k41.p("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    public void Q(boolean z) {
        boolean z2;
        if (this.Z0 != g.CLOSING && this.Z0 != g.RELEASING && (this.Z0 != g.REOPENING || this.g1 == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C10907yF1.o(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.Z0 + " (error: " + Z(this.g1) + C9811tl1.d);
        if (Build.VERSION.SDK_INT < 29 && d0() && this.g1 == 0) {
            S(z);
        } else {
            s0(z);
        }
        this.h1.b();
    }

    public final void R() {
        U("Closing camera.");
        int i2 = c.a[this.Z0.ordinal()];
        boolean z = false;
        if (i2 != 2) {
            if (i2 != 4 && i2 != 5) {
                if (i2 != 6 && i2 != 7) {
                    U("close() ignored due to being in state: " + this.Z0);
                    return;
                }
                boolean a2 = this.d1.a();
                u0(g.CLOSING);
                if (a2) {
                    C10907yF1.n(f0());
                    X();
                    return;
                }
                return;
            }
            u0(g.CLOSING);
            Q(false);
            return;
        }
        if (this.f1 == null) {
            z = true;
        }
        C10907yF1.n(z);
        u0(g.INITIALIZED);
    }

    public final void S(boolean z) {
        final C4863Yy c4863Yy = new C4863Yy(this.B1);
        this.q1.add(c4863Yy);
        s0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, com.facebook.internal.q0.n1);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: o.Qu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.G(surface, surfaceTexture);
            }
        };
        T12.b bVar = new T12.b();
        final MN0 mn0 = new MN0(surface);
        bVar.i(mn0);
        bVar.z(1);
        U("Start configAndClose.");
        c4863Yy.d(bVar.q(), (CameraDevice) C10907yF1.l(this.f1), this.t1.a()).h4(new Runnable() { // from class: o.Ru
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.this.p0(c4863Yy, mn0, runnable);
            }
        }, this.Z);
    }

    public final CameraDevice.StateCallback T() {
        ArrayList arrayList = new ArrayList(this.X.f().c().b());
        arrayList.add(this.s1.c());
        arrayList.add(this.d1);
        return C3884Ow.a(arrayList);
    }

    public void U(String str) {
        V(str, null);
    }

    public final void V(String str, Throwable th) {
        C7433k41.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public T12 W(D10 d10) {
        for (T12 t12 : this.X.g()) {
            if (t12.l().contains(d10)) {
                return t12;
            }
        }
        return null;
    }

    public void X() {
        boolean z;
        if (this.Z0 != g.RELEASING && this.Z0 != g.CLOSING) {
            z = false;
        } else {
            z = true;
        }
        C10907yF1.n(z);
        C10907yF1.n(this.l1.isEmpty());
        this.f1 = null;
        if (this.Z0 == g.CLOSING) {
            u0(g.INITIALIZED);
            return;
        }
        this.Y.i(this.m1);
        u0(g.RELEASED);
        C3679Mt.a<Void> aVar = this.k1;
        if (aVar != null) {
            aVar.c(null);
            this.k1 = null;
        }
    }

    public d Y() {
        return this.m1;
    }

    @Override // o.InterfaceC7402jx, o.InterfaceC3099Gv
    public InterfaceC8388nw b() {
        return this.v1;
    }

    public final InterfaceFutureC8411o11<Void> b0() {
        if (this.j1 == null) {
            if (this.Z0 != g.RELEASED) {
                this.j1 = C3679Mt.a(new C3679Mt.c() { // from class: o.Mu
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return C4851Yu.A(C4851Yu.this, aVar);
                    }
                });
            } else {
                this.j1 = C7221jC0.h(null);
            }
        }
        return this.j1;
    }

    @Override // o.InterfaceC7402jx
    public void close() {
        this.Z.execute(new Runnable() { // from class: o.Pu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.this.R();
            }
        });
    }

    @Override // o.InterfaceC7402jx, o.InterfaceC3099Gv
    public void d(InterfaceC8388nw interfaceC8388nw) {
        if (interfaceC8388nw == null) {
            interfaceC8388nw = C9125qw.a();
        }
        InterfaceC4988a22 D = interfaceC8388nw.D(null);
        this.v1 = interfaceC8388nw;
        synchronized (this.w1) {
            this.x1 = D;
        }
    }

    public final boolean d0() {
        if (((C5926dv) n()).E() == 2) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC2789Dt1<InterfaceC7402jx.a> e() {
        return this.a1;
    }

    public boolean e0() {
        try {
            return ((Boolean) C3679Mt.a(new C3679Mt.c() { // from class: o.Uu
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4851Yu.F(C4851Yu.this, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e2);
        }
    }

    public boolean f0() {
        if (this.l1.isEmpty() && this.q1.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7402jx
    public InterfaceFutureC8411o11<Void> g() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.Gu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C4851Yu.t(C4851Yu.this, aVar);
            }
        });
    }

    public boolean g0(androidx.camera.core.m mVar) {
        try {
            final String c0 = c0(mVar);
            return ((Boolean) C3679Mt.a(new C3679Mt.c() { // from class: o.Ku
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4851Yu.K(C4851Yu.this, c0, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException("Unable to check if use case is attached.", e2);
        }
    }

    @Override // androidx.camera.core.m.d
    public void h(androidx.camera.core.m mVar) {
        C10907yF1.l(mVar);
        final String c0 = c0(mVar);
        final T12 t = mVar.t();
        final InterfaceC6743hD2<?> j = mVar.j();
        this.Z.execute(new Runnable() { // from class: o.Xu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.E(C4851Yu.this, c0, t, j);
            }
        });
    }

    public final InterfaceC4970Zy h0() {
        synchronized (this.w1) {
            try {
                if (this.x1 == null) {
                    return new C4863Yy(this.B1);
                }
                return new C6762hI1(this.x1, this.e1, this.B1, this.Z, this.Y0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.m.d
    public void i(androidx.camera.core.m mVar) {
        C10907yF1.l(mVar);
        final String c0 = c0(mVar);
        final T12 t = mVar.t();
        final InterfaceC6743hD2<?> j = mVar.j();
        this.Z.execute(new Runnable() { // from class: o.Vu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.B(C4851Yu.this, c0, t, j);
            }
        });
    }

    public final void i0(List<androidx.camera.core.m> list) {
        for (androidx.camera.core.m mVar : list) {
            String c0 = c0(mVar);
            if (!this.u1.contains(c0)) {
                this.u1.add(c0);
                mVar.L();
                mVar.J();
            }
        }
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC9610sw j() {
        return this.c1;
    }

    public final void j0(List<androidx.camera.core.m> list) {
        for (androidx.camera.core.m mVar : list) {
            String c0 = c0(mVar);
            if (this.u1.contains(c0)) {
                mVar.M();
                this.u1.remove(c0);
            }
        }
    }

    @Override // o.InterfaceC7402jx
    public void k(final boolean z) {
        this.Z.execute(new Runnable() { // from class: o.Ou
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.w(C4851Yu.this, z);
            }
        });
    }

    public final void k0(boolean z) {
        if (!z) {
            this.d1.d();
        }
        this.d1.a();
        U("Opening camera.");
        u0(g.OPENING);
        try {
            this.Y.g(this.e1.c(), this.Z, T());
        } catch (SecurityException e2) {
            U("Unable to open camera due to " + e2.getMessage());
            u0(g.REOPENING);
            this.d1.e();
        } catch (C3197Hv e3) {
            U("Unable to open camera due to " + e3.getMessage());
            if (e3.d() == 10001) {
                v0(g.INITIALIZED, AbstractC3007Fx.b.b(7, e3));
            }
        }
    }

    @Override // o.InterfaceC7402jx
    public void l(Collection<androidx.camera.core.m> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.c1.V();
        i0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(y0(arrayList));
        try {
            this.Z.execute(new Runnable() { // from class: o.Su
                @Override // java.lang.Runnable
                public final void run() {
                    C4851Yu.y(C4851Yu.this, arrayList2);
                }
            });
        } catch (RejectedExecutionException e2) {
            V("Unable to attach use cases.", e2);
            this.c1.D();
        }
    }

    public void l0() {
        boolean z;
        if (this.Z0 == g.OPENED) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        T12.g f2 = this.X.f();
        if (!f2.f()) {
            U("Unable to create capture session due to conflicting configurations");
        } else if (!this.p1.j(this.f1.getId(), this.o1.d(this.f1.getId()))) {
            U("Unable to create capture session in camera operating mode = " + this.o1.e());
        } else {
            HashMap hashMap = new HashMap();
            C4205Sd2.m(this.X.g(), this.X.h(), hashMap);
            this.h1.h(hashMap);
            C7221jC0.b(this.h1.d(f2.c(), (CameraDevice) C10907yF1.l(this.f1), this.t1.a()), new b(), this.Z);
        }
    }

    @Override // o.InterfaceC7402jx
    public void m(Collection<androidx.camera.core.m> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(y0(arrayList));
        j0(new ArrayList(arrayList));
        this.Z.execute(new Runnable() { // from class: o.Nu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.this.A0(arrayList2);
            }
        });
    }

    public final void m0() {
        int i2 = c.a[this.Z0.ordinal()];
        boolean z = false;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                U("open() ignored due to being in state: " + this.Z0);
                return;
            }
            u0(g.REOPENING);
            if (!f0() && this.g1 == 0) {
                if (this.f1 != null) {
                    z = true;
                }
                C10907yF1.o(z, "Camera Device should be open if session close is not complete");
                u0(g.OPENED);
                l0();
                return;
            }
            return;
        }
        B0(false);
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC6918hx n() {
        return this.e1;
    }

    public void n0(final T12 t12) {
        ScheduledExecutorService f2 = C5211ay.f();
        List<T12.c> c2 = t12.c();
        if (!c2.isEmpty()) {
            final T12.c cVar = c2.get(0);
            V("Posting surface closed", new Throwable());
            f2.execute(new Runnable() { // from class: o.Hu
                @Override // java.lang.Runnable
                public final void run() {
                    T12.c.this.a(t12, T12.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public final InterfaceFutureC8411o11<Void> o0() {
        InterfaceFutureC8411o11<Void> b0 = b0();
        boolean z = false;
        switch (c.a[this.Z0.ordinal()]) {
            case 1:
            case 2:
                if (this.f1 == null) {
                    z = true;
                }
                C10907yF1.n(z);
                u0(g.RELEASING);
                C10907yF1.n(f0());
                X();
                return b0;
            case 3:
            case 6:
            case 7:
            case 8:
                boolean a2 = this.d1.a();
                u0(g.RELEASING);
                if (a2) {
                    C10907yF1.n(f0());
                    X();
                }
                return b0;
            case 4:
            case 5:
                u0(g.RELEASING);
                Q(false);
                return b0;
            default:
                U("release() ignored due to being in state: " + this.Z0);
                return b0;
        }
    }

    @Override // o.InterfaceC7402jx
    public void open() {
        this.Z.execute(new Runnable() { // from class: o.Eu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.this.m0();
            }
        });
    }

    @Override // androidx.camera.core.m.d
    public void p(androidx.camera.core.m mVar) {
        C10907yF1.l(mVar);
        t0(c0(mVar), mVar.t(), mVar.j());
    }

    public void p0(C4863Yy c4863Yy, D10 d10, Runnable runnable) {
        this.q1.remove(c4863Yy);
        InterfaceFutureC8411o11<Void> q0 = q0(c4863Yy, false);
        d10.d();
        C7221jC0.m(Arrays.asList(q0, d10.k())).h4(runnable, C5211ay.b());
    }

    public InterfaceFutureC8411o11<Void> q0(InterfaceC4970Zy interfaceC4970Zy, boolean z) {
        interfaceC4970Zy.close();
        InterfaceFutureC8411o11<Void> e2 = interfaceC4970Zy.e(z);
        U("Releasing session in state " + this.Z0.name());
        this.l1.put(interfaceC4970Zy, e2);
        C7221jC0.b(e2, new a(interfaceC4970Zy), C5211ay.b());
        return e2;
    }

    public final void r0() {
        if (this.r1 != null) {
            C6500gD2 c6500gD2 = this.X;
            c6500gD2.p(this.r1.e() + this.r1.hashCode());
            C6500gD2 c6500gD22 = this.X;
            c6500gD22.q(this.r1.e() + this.r1.hashCode());
            this.r1.c();
            this.r1 = null;
        }
    }

    @Override // androidx.camera.core.m.d
    public void s(androidx.camera.core.m mVar) {
        C10907yF1.l(mVar);
        final String c0 = c0(mVar);
        this.Z.execute(new Runnable() { // from class: o.Wu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.J(C4851Yu.this, c0);
            }
        });
    }

    public void s0(boolean z) {
        boolean z2;
        if (this.h1 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.n(z2);
        U("Resetting Capture Session");
        InterfaceC4970Zy interfaceC4970Zy = this.h1;
        T12 c2 = interfaceC4970Zy.c();
        List<C3597Ly> f2 = interfaceC4970Zy.f();
        InterfaceC4970Zy h0 = h0();
        this.h1 = h0;
        h0.g(c2);
        this.h1.a(f2);
        q0(interfaceC4970Zy, z);
    }

    public final void t0(final String str, final T12 t12, final InterfaceC6743hD2<?> interfaceC6743hD2) {
        this.Z.execute(new Runnable() { // from class: o.Tu
            @Override // java.lang.Runnable
            public final void run() {
                C4851Yu.x(C4851Yu.this, str, t12, interfaceC6743hD2);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.e1.c());
    }

    public void u0(g gVar) {
        v0(gVar, null);
    }

    public void v0(g gVar, AbstractC3007Fx.b bVar) {
        w0(gVar, bVar, true);
    }

    public void w0(g gVar, AbstractC3007Fx.b bVar, boolean z) {
        InterfaceC7402jx.a aVar;
        U("Transitioning camera internal state: " + this.Z0 + " --> " + gVar);
        this.Z0 = gVar;
        switch (c.a[gVar.ordinal()]) {
            case 1:
                aVar = InterfaceC7402jx.a.CLOSED;
                break;
            case 2:
                aVar = InterfaceC7402jx.a.PENDING_OPEN;
                break;
            case 3:
                aVar = InterfaceC7402jx.a.CLOSING;
                break;
            case 4:
                aVar = InterfaceC7402jx.a.OPEN;
                break;
            case 5:
                aVar = InterfaceC7402jx.a.CONFIGURED;
                break;
            case 6:
            case 7:
                aVar = InterfaceC7402jx.a.OPENING;
                break;
            case 8:
                aVar = InterfaceC7402jx.a.RELEASING;
                break;
            case 9:
                aVar = InterfaceC7402jx.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + gVar);
        }
        this.p1.f(this, aVar, z);
        this.a1.k(aVar);
        this.b1.c(aVar, bVar);
    }

    public void x0(List<C3597Ly> list) {
        ArrayList arrayList = new ArrayList();
        for (C3597Ly c3597Ly : list) {
            C3597Ly.a k = C3597Ly.a.k(c3597Ly);
            if (c3597Ly.i() == 5 && c3597Ly.d() != null) {
                k.t(c3597Ly.d());
            }
            if (!c3597Ly.g().isEmpty() || !c3597Ly.j() || P(k)) {
                arrayList.add(k.h());
            }
        }
        U("Issue capture request");
        this.h1.a(arrayList);
    }

    public final Collection<i> y0(Collection<androidx.camera.core.m> collection) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.m mVar : collection) {
            arrayList.add(i.b(mVar));
        }
        return arrayList;
    }

    public final void z0(Collection<i> collection) {
        Size d2;
        boolean isEmpty = this.X.g().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (i iVar : collection) {
            if (!this.X.l(iVar.f())) {
                this.X.o(iVar.f(), iVar.c(), iVar.e());
                arrayList.add(iVar.f());
                if (iVar.g() == androidx.camera.core.k.class && (d2 = iVar.d()) != null) {
                    rational = new Rational(d2.getWidth(), d2.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            U("Use cases [" + TextUtils.join(C6566gU0.h, arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.c1.d0(true);
                this.c1.V();
            }
            O();
            E0();
            D0();
            s0(false);
            if (this.Z0 == g.OPENED) {
                l0();
            } else {
                m0();
            }
            if (rational != null) {
                this.c1.e0(rational);
            }
        }
    }

    /* renamed from: o.Yu$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ InterfaceC4970Zy a;

        public a(InterfaceC4970Zy interfaceC4970Zy) {
            this.a = interfaceC4970Zy;
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            CameraDevice cameraDevice;
            C4851Yu.this.l1.remove(this.a);
            int i = c.a[C4851Yu.this.Z0.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        return;
                    }
                } else if (C4851Yu.this.g1 == 0) {
                    return;
                }
            }
            if (C4851Yu.this.f0() && (cameraDevice = C4851Yu.this.f1) != null) {
                C3016Ga.a.a(cameraDevice);
                C4851Yu.this.f1 = null;
            }
        }

        @Override // o.XB0
        public void b(Throwable th) {
        }
    }
}
