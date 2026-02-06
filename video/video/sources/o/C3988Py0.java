package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;

/* renamed from: o.Py0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3988Py0 {
    public static final String a = "FovUtil";

    public static int a(float f, float f2) {
        boolean z;
        boolean z2 = true;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Focal length should be positive.");
        if (f2 <= 0.0f) {
            z2 = false;
        }
        C10907yF1.b(z2, "Sensor length should be positive.");
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (f * 2.0f)) * 2.0d);
        C10907yF1.g(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float b(C7641kw c7641kw) {
        float[] fArr = (float[]) c7641kw.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        C10907yF1.m(fArr, "The focal lengths can not be empty.");
        return fArr[0];
    }

    public static int c(C8392nx c8392nx, int i) {
        try {
            for (String str : c8392nx.e()) {
                C7641kw d = c8392nx.d(str);
                Integer num = (Integer) d.a(CameraCharacteristics.LENS_FACING);
                C10907yF1.m(num, "Lens facing can not be null");
                if (num.intValue() == C9277rZ0.b(i)) {
                    return a(b(d), d(d));
                }
            }
            throw new IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
        } catch (C3197Hv unused) {
            throw new IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    public static float d(C7641kw c7641kw) {
        SizeF sizeF = (SizeF) c7641kw.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) c7641kw.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) c7641kw.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.SENSOR_ORIENTATION);
        C10907yF1.m(sizeF, "The sensor size can't be null.");
        C10907yF1.m(num, "The sensor orientation can't be null.");
        C10907yF1.m(rect, "The active array size can't be null.");
        C10907yF1.m(size, "The pixel array size can't be null.");
        Size m = C5433bs2.m(rect);
        if (C5433bs2.h(num.intValue())) {
            sizeF = C5433bs2.q(sizeF);
            m = C5433bs2.p(m);
            size = C5433bs2.p(size);
        }
        return (sizeF.getWidth() * m.getWidth()) / size.getWidth();
    }
}
