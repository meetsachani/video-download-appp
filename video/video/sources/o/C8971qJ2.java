package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.List;
import o.C3679Mt;
import o.C8971qJ2;

/* renamed from: o.qJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8971qJ2 {
    public final boolean a;
    public final InterfaceFutureC8411o11<Void> c;
    public C3679Mt.a<Void> d;
    public boolean e;
    public final Object b = new Object();
    public final CameraCaptureSession.CaptureCallback f = new a();

    /* renamed from: o.qJ2$a */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C3679Mt.a<Void> aVar = C8971qJ2.this.d;
            if (aVar != null) {
                aVar.d();
                C8971qJ2.this.d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C3679Mt.a<Void> aVar = C8971qJ2.this.d;
            if (aVar != null) {
                aVar.c(null);
                C8971qJ2.this.d = null;
            }
        }
    }

    @FunctionalInterface
    /* renamed from: o.qJ2$b */
    /* loaded from: classes.dex */
    public interface b {
        InterfaceFutureC8411o11<Void> a(CameraDevice cameraDevice, U12 u12, List<D10> list);
    }

    @FunctionalInterface
    /* renamed from: o.qJ2$c */
    /* loaded from: classes.dex */
    public interface c {
        int a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    public C8971qJ2(C10931yL1 c10931yL1) {
        this.a = c10931yL1.a(C5942dz.class);
        if (g()) {
            this.c = C3679Mt.a(new C3679Mt.c() { // from class: o.oJ2
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C8971qJ2.b(C8971qJ2.this, aVar);
                }
            });
        } else {
            this.c = C7221jC0.h(null);
        }
    }

    public static /* synthetic */ Object b(C8971qJ2 c8971qJ2, C3679Mt.a aVar) {
        c8971qJ2.d = aVar;
        return "WaitForRepeatingRequestStart[" + c8971qJ2 + C6566gU0.g;
    }

    public InterfaceFutureC8411o11<Void> c() {
        return C7221jC0.i(this.c);
    }

    public void d() {
        synchronized (this.b) {
            try {
                if (g() && !this.e) {
                    this.c.cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceFutureC8411o11<Void> e(final CameraDevice cameraDevice, final U12 u12, final List<D10> list, List<InterfaceC10290vj2> list2, final b bVar) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10290vj2 interfaceC10290vj2 : list2) {
            arrayList.add(interfaceC10290vj2.t());
        }
        return YB0.b(C7221jC0.m(arrayList)).f(new InterfaceC2829Ef() { // from class: o.pJ2
            @Override // o.InterfaceC2829Ef
            public final InterfaceFutureC8411o11 apply(Object obj) {
                InterfaceFutureC8411o11 a2;
                List list3 = (List) obj;
                a2 = C8971qJ2.b.this.a(cameraDevice, u12, list);
                return a2;
            }
        }, C5211ay.b());
    }

    public int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) throws CameraAccessException {
        int a2;
        synchronized (this.b) {
            try {
                if (g()) {
                    captureCallback = C6169ev.b(this.f, captureCallback);
                    this.e = true;
                }
                a2 = cVar.a(captureRequest, captureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    public boolean g() {
        return this.a;
    }
}
