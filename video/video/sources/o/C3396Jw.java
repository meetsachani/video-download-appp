package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import o.C3689Mw;
import o.C4075Qv;

/* renamed from: o.Jw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3396Jw extends C3689Mw {
    public C3396Jw(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static C3396Jw h(CameraDevice cameraDevice, Handler handler) {
        return new C3396Jw(cameraDevice, new C3689Mw.a(handler));
    }

    @Override // o.C3689Mw, o.C2895Ew.a
    public void a(U12 u12) throws C3197Hv {
        C3689Mw.c(this.a, u12);
        C4075Qv.c cVar = new C4075Qv.c(u12.a(), u12.f());
        List<Surface> g = C3689Mw.g(u12.c());
        Handler handler = ((C3689Mw.a) C10907yF1.l((C3689Mw.a) this.b)).a;
        C5567cQ0 b = u12.b();
        try {
            if (b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b.e();
                C10907yF1.l(inputConfiguration);
                this.a.createReprocessableCaptureSession(inputConfiguration, g, cVar, handler);
            } else if (u12.e() == 1) {
                this.a.createConstrainedHighSpeedCaptureSession(g, cVar, handler);
            } else {
                f(this.a, g, cVar, handler);
            }
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }
}
