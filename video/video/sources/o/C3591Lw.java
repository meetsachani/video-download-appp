package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* renamed from: o.Lw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3591Lw extends C3494Kw {
    public C3591Lw(CameraDevice cameraDevice) {
        super((CameraDevice) C10907yF1.l(cameraDevice), null);
    }

    @Override // o.C3494Kw, o.C3396Jw, o.C3689Mw, o.C2895Ew.a
    public void a(U12 u12) throws C3197Hv {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) u12.k();
        C10907yF1.l(sessionConfiguration);
        try {
            this.a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }
}
