package o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* renamed from: o.px  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8879px extends C8636ox {
    public C8879px(Context context) {
        super(context);
    }

    @Override // o.C8636ox, o.C9371rx, o.C8392nx.b
    public CameraCharacteristics c(String str) throws C3197Hv {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }

    @Override // o.C8636ox, o.C9371rx, o.C8392nx.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3197Hv {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }
}
