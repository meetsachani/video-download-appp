package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o.C3153Hj2;
import o.C3679Mt;
import o.D10;
import o.InterfaceC10290vj2;

/* renamed from: o.Bj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2554Bj2 extends InterfaceC10290vj2.a implements InterfaceC10290vj2, C3153Hj2.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f420o = "SyncCaptureSessionBase";
    public final C5700cz b;
    public final Handler c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public InterfaceC10290vj2.a f;
    public C4075Qv g;
    public InterfaceFutureC8411o11<Void> h;
    public C3679Mt.a<Void> i;
    public InterfaceFutureC8411o11<List<Surface>> j;
    public final Object a = new Object();
    public List<D10> k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    /* renamed from: o.Bj2$b */
    /* loaded from: classes.dex */
    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C2554Bj2.this.H(cameraCaptureSession);
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.u(c2554Bj2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C2554Bj2.this.H(cameraCaptureSession);
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.v(c2554Bj2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C2554Bj2.this.H(cameraCaptureSession);
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.w(c2554Bj2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C3679Mt.a<Void> aVar;
            try {
                C2554Bj2.this.H(cameraCaptureSession);
                C2554Bj2 c2554Bj2 = C2554Bj2.this;
                c2554Bj2.x(c2554Bj2);
                synchronized (C2554Bj2.this.a) {
                    C10907yF1.m(C2554Bj2.this.i, "OpenCaptureSession completer should not null");
                    C2554Bj2 c2554Bj22 = C2554Bj2.this;
                    aVar = c2554Bj22.i;
                    c2554Bj22.i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C2554Bj2.this.a) {
                    C10907yF1.m(C2554Bj2.this.i, "OpenCaptureSession completer should not null");
                    C2554Bj2 c2554Bj23 = C2554Bj2.this;
                    C3679Mt.a<Void> aVar2 = c2554Bj23.i;
                    c2554Bj23.i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C3679Mt.a<Void> aVar;
            try {
                C2554Bj2.this.H(cameraCaptureSession);
                C2554Bj2 c2554Bj2 = C2554Bj2.this;
                c2554Bj2.y(c2554Bj2);
                synchronized (C2554Bj2.this.a) {
                    C10907yF1.m(C2554Bj2.this.i, "OpenCaptureSession completer should not null");
                    C2554Bj2 c2554Bj22 = C2554Bj2.this;
                    aVar = c2554Bj22.i;
                    c2554Bj22.i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (C2554Bj2.this.a) {
                    C10907yF1.m(C2554Bj2.this.i, "OpenCaptureSession completer should not null");
                    C2554Bj2 c2554Bj23 = C2554Bj2.this;
                    C3679Mt.a<Void> aVar2 = c2554Bj23.i;
                    c2554Bj23.i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C2554Bj2.this.H(cameraCaptureSession);
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.z(c2554Bj2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C2554Bj2.this.H(cameraCaptureSession);
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.B(c2554Bj2, surface);
        }
    }

    /* renamed from: o.Bj2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Surface a(CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public C2554Bj2(C5700cz c5700cz, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = c5700cz;
        this.c = handler;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    public static /* synthetic */ void C(C2554Bj2 c2554Bj2, InterfaceC10290vj2 interfaceC10290vj2) {
        c2554Bj2.b.h(c2554Bj2);
        c2554Bj2.G(interfaceC10290vj2);
        Objects.requireNonNull(c2554Bj2.f);
        c2554Bj2.f.w(interfaceC10290vj2);
    }

    public static /* synthetic */ Object D(C2554Bj2 c2554Bj2, List list, C2895Ew c2895Ew, U12 u12, C3679Mt.a aVar) {
        boolean z;
        String str;
        synchronized (c2554Bj2.a) {
            c2554Bj2.I(list);
            if (c2554Bj2.i == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The openCaptureSessionCompleter can only set once!");
            c2554Bj2.i = aVar;
            c2895Ew.a(u12);
            str = "openCaptureSession[session=" + c2554Bj2 + C6566gU0.g;
        }
        return str;
    }

    public static /* synthetic */ void E(C2554Bj2 c2554Bj2, InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(c2554Bj2.f);
        c2554Bj2.f.A(interfaceC10290vj2);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 F(C2554Bj2 c2554Bj2, List list, List list2) {
        c2554Bj2.getClass();
        C7433k41.a(f420o, C6566gU0.f + c2554Bj2 + "] getSurface...done");
        if (list2.contains(null)) {
            return C7221jC0.f(new D10.a("Surface closed", (D10) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return C7221jC0.f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C7221jC0.h(list2);
    }

    @Override // o.InterfaceC10290vj2.a
    /* renamed from: A */
    public void G(final InterfaceC10290vj2 interfaceC10290vj2) {
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11;
        synchronized (this.a) {
            try {
                if (!this.n) {
                    this.n = true;
                    C10907yF1.m(this.h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC8411o11 = this.h;
                } else {
                    interfaceFutureC8411o11 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceFutureC8411o11 != null) {
            interfaceFutureC8411o11.h4(new Runnable() { // from class: o.wj2
                @Override // java.lang.Runnable
                public final void run() {
                    C2554Bj2.E(C2554Bj2.this, interfaceC10290vj2);
                }
            }, C5211ay.b());
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void B(InterfaceC10290vj2 interfaceC10290vj2, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.B(interfaceC10290vj2, surface);
    }

    public void H(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = C4075Qv.g(cameraCaptureSession, this.c);
        }
    }

    public void I(List<D10> list) throws D10.a {
        synchronized (this.a) {
            K();
            I10.f(list);
            this.k = list;
        }
    }

    public boolean J() {
        boolean z;
        synchronized (this.a) {
            if (this.h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void K() {
        synchronized (this.a) {
            try {
                List<D10> list = this.k;
                if (list != null) {
                    I10.e(list);
                    this.k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC10290vj2
    public void a() throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        this.g.e().stopRepeating();
    }

    @Override // o.InterfaceC10290vj2
    public void b() throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        this.g.e().abortCaptures();
    }

    @Override // o.InterfaceC10290vj2
    public Surface c() {
        C10907yF1.l(this.g);
        return c.a(this.g.e());
    }

    @Override // o.InterfaceC10290vj2
    public void close() {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        this.b.i(this);
        this.g.e().close();
        d().execute(new Runnable() { // from class: o.xj2
            @Override // java.lang.Runnable
            public final void run() {
                C2554Bj2.this.G(r0);
            }
        });
    }

    @Override // o.C3153Hj2.b
    public Executor d() {
        return this.d;
    }

    @Override // o.InterfaceC10290vj2
    public int f(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.a(list, executor, captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public int g(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.c(list, executor, captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public int h(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.d(captureRequest, executor, captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public int i(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.b(captureRequest, executor, captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public void j() {
        K();
    }

    @Override // o.InterfaceC10290vj2
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.b(captureRequest, d(), captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public CameraDevice l() {
        C10907yF1.l(this.g);
        return this.g.e().getDevice();
    }

    @Override // o.InterfaceC10290vj2
    public int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.d(captureRequest, d(), captureCallback);
    }

    @Override // o.C3153Hj2.b
    public InterfaceFutureC8411o11<List<Surface>> n(final List<D10> list, long j) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return C7221jC0.f(new CancellationException("Opener is disabled"));
                }
                YB0 f = YB0.b(I10.g(list, false, j, d(), this.e)).f(new InterfaceC2829Ef() { // from class: o.Aj2
                    @Override // o.InterfaceC2829Ef
                    public final InterfaceFutureC8411o11 apply(Object obj) {
                        return C2554Bj2.F(C2554Bj2.this, list, (List) obj);
                    }
                }, d());
                this.j = f;
                return C7221jC0.i(f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.C3153Hj2.b
    public U12 o(int i, List<C3006Fw1> list, InterfaceC10290vj2.a aVar) {
        this.f = aVar;
        return new U12(i, list, d(), new b());
    }

    @Override // o.InterfaceC10290vj2
    public int p(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.c(list, d(), captureCallback);
    }

    @Override // o.InterfaceC10290vj2
    public int q(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C10907yF1.m(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.a(list, d(), captureCallback);
    }

    @Override // o.C3153Hj2.b
    public InterfaceFutureC8411o11<Void> r(CameraDevice cameraDevice, final U12 u12, final List<D10> list) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return C7221jC0.f(new CancellationException("Opener is disabled"));
                }
                this.b.l(this);
                final C2895Ew d = C2895Ew.d(cameraDevice, this.c);
                InterfaceFutureC8411o11<Void> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.zj2
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return C2554Bj2.D(C2554Bj2.this, list, d, u12, aVar);
                    }
                });
                this.h = a2;
                C7221jC0.b(a2, new a(), C5211ay.b());
                return C7221jC0.i(this.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC10290vj2
    public C4075Qv s() {
        C10907yF1.l(this.g);
        return this.g;
    }

    @Override // o.C3153Hj2.b
    public boolean stop() {
        boolean z;
        InterfaceFutureC8411o11<List<Surface>> interfaceFutureC8411o11 = null;
        try {
            synchronized (this.a) {
                if (!this.m) {
                    InterfaceFutureC8411o11<List<Surface>> interfaceFutureC8411o112 = this.j;
                    if (interfaceFutureC8411o112 != null) {
                        interfaceFutureC8411o11 = interfaceFutureC8411o112;
                    }
                    this.m = true;
                }
                z = !J();
            }
            return z;
        } finally {
            if (interfaceFutureC8411o11 != null) {
                interfaceFutureC8411o11.cancel(true);
            }
        }
    }

    @Override // o.InterfaceC10290vj2
    public InterfaceFutureC8411o11<Void> t() {
        return C7221jC0.h(null);
    }

    @Override // o.InterfaceC10290vj2.a
    public void u(InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(this.f);
        this.f.u(interfaceC10290vj2);
    }

    @Override // o.InterfaceC10290vj2.a
    public void v(InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(this.f);
        this.f.v(interfaceC10290vj2);
    }

    @Override // o.InterfaceC10290vj2.a
    public void w(final InterfaceC10290vj2 interfaceC10290vj2) {
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11;
        synchronized (this.a) {
            try {
                if (!this.l) {
                    this.l = true;
                    C10907yF1.m(this.h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC8411o11 = this.h;
                } else {
                    interfaceFutureC8411o11 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j();
        if (interfaceFutureC8411o11 != null) {
            interfaceFutureC8411o11.h4(new Runnable() { // from class: o.yj2
                @Override // java.lang.Runnable
                public final void run() {
                    C2554Bj2.C(C2554Bj2.this, interfaceC10290vj2);
                }
            }, C5211ay.b());
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void x(InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(this.f);
        j();
        this.b.j(this);
        this.f.x(interfaceC10290vj2);
    }

    @Override // o.InterfaceC10290vj2.a
    public void y(InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(this.f);
        this.b.k(this);
        this.f.y(interfaceC10290vj2);
    }

    @Override // o.InterfaceC10290vj2.a
    public void z(InterfaceC10290vj2 interfaceC10290vj2) {
        Objects.requireNonNull(this.f);
        this.f.z(interfaceC10290vj2);
    }

    @Override // o.InterfaceC10290vj2
    public InterfaceC10290vj2.a e() {
        return this;
    }

    /* renamed from: o.Bj2$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public a() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C2554Bj2.this.j();
            C2554Bj2 c2554Bj2 = C2554Bj2.this;
            c2554Bj2.b.j(c2554Bj2);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }
}
