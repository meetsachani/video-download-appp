package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.vj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10290vj2 {
    void a() throws CameraAccessException;

    void b() throws CameraAccessException;

    Surface c();

    void close();

    a e();

    int f(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int g(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int h(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int i(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void j();

    int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    CameraDevice l();

    int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int p(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int q(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    C4075Qv s();

    InterfaceFutureC8411o11<Void> t();

    /* renamed from: o.vj2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void A(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void u(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void v(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void w(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void x(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void y(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void z(InterfaceC10290vj2 interfaceC10290vj2) {
        }

        public void B(InterfaceC10290vj2 interfaceC10290vj2, Surface surface) {
        }
    }
}
