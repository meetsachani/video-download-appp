package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import o.C2895Ew;
import o.C4075Qv;

/* renamed from: o.Mw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3689Mw implements C2895Ew.a {
    public final CameraDevice a;
    public final Object b;

    /* renamed from: o.Mw$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }
    }

    public C3689Mw(CameraDevice cameraDevice, Object obj) {
        this.a = (CameraDevice) C10907yF1.l(cameraDevice);
        this.b = obj;
    }

    public static void b(CameraDevice cameraDevice, List<C3006Fw1> list) {
        String id = cameraDevice.getId();
        for (C3006Fw1 c3006Fw1 : list) {
            String e = c3006Fw1.e();
            if (e != null && !e.isEmpty()) {
                C7433k41.p("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + e + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, U12 u12) {
        C10907yF1.l(cameraDevice);
        C10907yF1.l(u12);
        C10907yF1.l(u12.f());
        List<C3006Fw1> c = u12.c();
        if (c != null) {
            if (u12.a() != null) {
                b(cameraDevice, c);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static C3689Mw d(CameraDevice cameraDevice, Handler handler) {
        return new C3689Mw(cameraDevice, new a(handler));
    }

    public static List<Surface> g(List<C3006Fw1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C3006Fw1 c3006Fw1 : list) {
            arrayList.add(c3006Fw1.g());
        }
        return arrayList;
    }

    @Override // o.C2895Ew.a
    public void a(U12 u12) throws C3197Hv {
        c(this.a, u12);
        if (u12.b() == null) {
            if (u12.e() != 1) {
                C4075Qv.c cVar = new C4075Qv.c(u12.a(), u12.f());
                f(this.a, g(u12.c()), cVar, ((a) this.b).a);
                return;
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }

    @Override // o.C2895Ew.a
    public CameraDevice e() {
        return this.a;
    }

    public void f(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws C3197Hv {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }
}
