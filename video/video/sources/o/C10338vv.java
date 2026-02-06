package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C4475Uy;
import o.HJ;

/* renamed from: o.vv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10338vv {
    public static final String a = "Camera2CaptureRequestBuilder";

    /* renamed from: o.vv$a */
    /* loaded from: classes.dex */
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(C3597Ly c3597Ly, CaptureRequest.Builder builder) {
        C4475Uy build = C4475Uy.a.h(c3597Ly.f()).build();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        if (!build.g(C2598Bv.t0(key)) && !c3597Ly.e().equals(AbstractC4008Qd2.a)) {
            builder.set(key, c3597Ly.e());
        }
    }

    public static void b(CaptureRequest.Builder builder, HJ hj) {
        C4475Uy build = C4475Uy.a.h(hj).build();
        for (HJ.a<?> aVar : build.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, build.j(aVar));
            } catch (IllegalArgumentException unused) {
                C7433k41.c(a, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest c(C3597Ly c3597Ly, CameraDevice cameraDevice, Map<D10, Surface> map) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> e = e(c3597Ly.g(), map);
        if (e.isEmpty()) {
            return null;
        }
        InterfaceC3784Nv d = c3597Ly.d();
        if (c3597Ly.i() == 5 && d != null && (d.e() instanceof TotalCaptureResult)) {
            C7433k41.a(a, "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) d.e());
        } else {
            C7433k41.a(a, "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(c3597Ly.i());
        }
        b(createCaptureRequest, c3597Ly.f());
        a(c3597Ly, createCaptureRequest);
        HJ f = c3597Ly.f();
        HJ.a<Integer> aVar = C3597Ly.j;
        if (f.g(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c3597Ly.f().j(aVar));
        }
        HJ f2 = c3597Ly.f();
        HJ.a<Integer> aVar2 = C3597Ly.k;
        if (f2.g(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c3597Ly.f().j(aVar2)).byteValue()));
        }
        for (Surface surface : e) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(c3597Ly.h());
        return createCaptureRequest.build();
    }

    public static CaptureRequest d(C3597Ly c3597Ly, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c3597Ly.i());
        b(createCaptureRequest, c3597Ly.f());
        return createCaptureRequest.build();
    }

    public static List<Surface> e(List<D10> list, Map<D10, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (D10 d10 : list) {
            Surface surface = map.get(d10);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
