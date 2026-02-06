package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import o.C4075Qv;

/* renamed from: o.gw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6671gw implements C4075Qv.a {
    public final CameraCaptureSession a;
    public final Object b;

    /* renamed from: o.gw$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }
    }

    public C6671gw(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.a = (CameraCaptureSession) C10907yF1.l(cameraCaptureSession);
        this.b = obj;
    }

    public static C4075Qv.a a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C6671gw(cameraCaptureSession, new a(handler));
    }

    @Override // o.C4075Qv.a
    public CameraCaptureSession e() {
        return this.a;
    }

    @Override // o.C4075Qv.a
    public int f(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.captureBurst(list, new C4075Qv.b(executor, captureCallback), ((a) this.b).a);
    }

    @Override // o.C4075Qv.a
    public int g(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.setRepeatingBurst(list, new C4075Qv.b(executor, captureCallback), ((a) this.b).a);
    }

    @Override // o.C4075Qv.a
    public int h(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.setRepeatingRequest(captureRequest, new C4075Qv.b(executor, captureCallback), ((a) this.b).a);
    }

    @Override // o.C4075Qv.a
    public int i(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.capture(captureRequest, new C4075Qv.b(executor, captureCallback), ((a) this.b).a);
    }
}
