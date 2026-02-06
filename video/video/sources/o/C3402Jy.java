package o;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: o.Jy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3402Jy extends AbstractC3393Jv {
    public final CameraCaptureSession.CaptureCallback a;

    public C3402Jy(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    public static C3402Jy d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C3402Jy(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback e() {
        return this.a;
    }
}
