package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.fw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6416fw extends C6671gw {
    public C6416fw(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // o.C6671gw, o.C4075Qv.a
    public int f(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // o.C6671gw, o.C4075Qv.a
    public int g(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // o.C6671gw, o.C4075Qv.a
    public int h(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // o.C6671gw, o.C4075Qv.a
    public int i(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.captureSingleRequest(captureRequest, executor, captureCallback);
    }
}
