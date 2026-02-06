package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import o.C3588Lv;

/* renamed from: o.Iy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3304Iy extends CameraCaptureSession.CaptureCallback {
    public final AbstractC3393Jv a;

    public C3304Iy(AbstractC3393Jv abstractC3393Jv) {
        if (abstractC3393Jv != null) {
            this.a = abstractC3393Jv;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C4133Rk2 b;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C10907yF1.b(tag instanceof C4133Rk2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            b = (C4133Rk2) tag;
        } else {
            b = C4133Rk2.b();
        }
        this.a.b(new C5195au(b, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.a.c(new C3588Lv(C3588Lv.a.ERROR));
    }
}
