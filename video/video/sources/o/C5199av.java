package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Map;

/* renamed from: o.av  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5199av {
    public static final String b = "Camera2CameraInfo";
    public final C5926dv a;

    public C5199av(C5926dv c5926dv) {
        this.a = c5926dv;
    }

    public static CameraCharacteristics a(InterfaceC6420fx interfaceC6420fx) {
        InterfaceC6918hx implementation = ((InterfaceC6918hx) interfaceC6420fx).getImplementation();
        C10907yF1.o(implementation instanceof C5926dv, "CameraInfo does not contain any Camera2 information.");
        return ((C5926dv) implementation).B().e();
    }

    public static C5199av b(InterfaceC6420fx interfaceC6420fx) {
        InterfaceC6918hx implementation = ((InterfaceC6918hx) interfaceC6420fx).getImplementation();
        C10907yF1.b(implementation instanceof C5926dv, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C5926dv) implementation).A();
    }

    public <T> T c(CameraCharacteristics.Key<T> key) {
        return (T) this.a.B().a(key);
    }

    public Map<String, CameraCharacteristics> d() {
        return this.a.C();
    }

    public String e() {
        return this.a.c();
    }
}
