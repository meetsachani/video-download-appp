package o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;

/* renamed from: o.Pj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3933Pj0 implements InterfaceC10688xL1 {
    public static boolean g() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        return g();
    }

    public Size[] d(int i) {
        if (i == 34 && g()) {
            return f();
        }
        return new Size[0];
    }

    public <T> Size[] e(Class<T> cls) {
        if (StreamConfigurationMap.isOutputSupportedFor(cls) && g()) {
            return f();
        }
        return new Size[0];
    }

    public final Size[] f() {
        return new Size[]{new Size(1920, FC.u), new Size(1440, FC.u), new Size(com.facebook.internal.q0.q1, 720), new Size(960, 720), new Size(864, com.facebook.internal.q0.n1), new Size(720, com.facebook.internal.q0.n1)};
    }
}
