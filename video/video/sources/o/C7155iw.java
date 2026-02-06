package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* renamed from: o.iw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7155iw extends C7398jw {
    public static final String b = "CameraCharacteristicsImpl";

    public C7155iw(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // o.C7398jw, o.C7641kw.a
    public Set<String> b() {
        try {
            return this.a.getPhysicalCameraIds();
        } catch (Exception e) {
            C7433k41.d(b, "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e);
            return Collections.EMPTY_SET;
        }
    }
}
