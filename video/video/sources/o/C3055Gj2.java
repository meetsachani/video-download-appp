package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o.C7403jx0;
import o.C8971qJ2;

/* renamed from: o.Gj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3055Gj2 extends C2554Bj2 {
    public static final String v = "SyncCaptureSessionImpl";
    public final Object p;
    public List<D10> q;
    public InterfaceFutureC8411o11<Void> r;
    public final C7646kx0 s;
    public final C8971qJ2 t;
    public final C7403jx0 u;

    public C3055Gj2(C10931yL1 c10931yL1, C10931yL1 c10931yL12, C5700cz c5700cz, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c5700cz, executor, scheduledExecutorService, handler);
        this.p = new Object();
        this.s = new C7646kx0(c10931yL1, c10931yL12);
        this.t = new C8971qJ2(c10931yL1);
        this.u = new C7403jx0(c10931yL12);
    }

    public static /* synthetic */ void M(C3055Gj2 c3055Gj2) {
        c3055Gj2.P("Session call super.close()");
        super.close();
    }

    public void P(String str) {
        C7433k41.a(v, C6566gU0.f + this + "] " + str);
    }

    @Override // o.C2554Bj2, o.InterfaceC10290vj2
    public void close() {
        P("Session call close()");
        this.t.d();
        this.t.c().h4(new Runnable() { // from class: o.Ej2
            @Override // java.lang.Runnable
            public final void run() {
                C3055Gj2.M(C3055Gj2.this);
            }
        }, d());
    }

    @Override // o.C2554Bj2, o.InterfaceC10290vj2
    public int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.t.f(captureRequest, captureCallback, new C8971qJ2.c() { // from class: o.Cj2
            @Override // o.C8971qJ2.c
            public final int a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int m;
                m = super/*o.Bj2*/.m(captureRequest2, captureCallback2);
                return m;
            }
        });
    }

    @Override // o.C2554Bj2, o.C3153Hj2.b
    public InterfaceFutureC8411o11<List<Surface>> n(List<D10> list, long j) {
        InterfaceFutureC8411o11<List<Surface>> n;
        synchronized (this.p) {
            this.q = list;
            n = super.n(list, j);
        }
        return n;
    }

    @Override // o.C2554Bj2, o.C3153Hj2.b
    public InterfaceFutureC8411o11<Void> r(CameraDevice cameraDevice, U12 u12, List<D10> list) {
        InterfaceFutureC8411o11<Void> i;
        synchronized (this.p) {
            InterfaceFutureC8411o11<Void> e = this.t.e(cameraDevice, u12, list, this.b.e(), new C8971qJ2.b() { // from class: o.Fj2
                @Override // o.C8971qJ2.b
                public final InterfaceFutureC8411o11 a(CameraDevice cameraDevice2, U12 u122, List list2) {
                    InterfaceFutureC8411o11 r;
                    r = super/*o.Bj2*/.r(cameraDevice2, u122, list2);
                    return r;
                }
            });
            this.r = e;
            i = C7221jC0.i(e);
        }
        return i;
    }

    @Override // o.C2554Bj2, o.C3153Hj2.b
    public boolean stop() {
        boolean stop;
        synchronized (this.p) {
            try {
                if (J()) {
                    this.s.a(this.q);
                } else {
                    InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.r;
                    if (interfaceFutureC8411o11 != null) {
                        interfaceFutureC8411o11.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return stop;
    }

    @Override // o.C2554Bj2, o.InterfaceC10290vj2
    public InterfaceFutureC8411o11<Void> t() {
        return this.t.c();
    }

    @Override // o.C2554Bj2, o.InterfaceC10290vj2.a
    public void w(InterfaceC10290vj2 interfaceC10290vj2) {
        synchronized (this.p) {
            this.s.a(this.q);
        }
        P("onClosed()");
        super.w(interfaceC10290vj2);
    }

    @Override // o.C2554Bj2, o.InterfaceC10290vj2.a
    public void y(InterfaceC10290vj2 interfaceC10290vj2) {
        P("Session onConfigured()");
        this.u.c(interfaceC10290vj2, this.b.f(), this.b.d(), new C7403jx0.a() { // from class: o.Dj2
            @Override // o.C7403jx0.a
            public final void a(InterfaceC10290vj2 interfaceC10290vj22) {
                super/*o.Bj2*/.y(interfaceC10290vj22);
            }
        });
    }
}
