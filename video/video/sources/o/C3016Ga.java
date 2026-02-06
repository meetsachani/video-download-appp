package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;

/* renamed from: o.Ga  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3016Ga {

    /* renamed from: o.Ga$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* renamed from: o.Ga$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* renamed from: o.Ga$c */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    /* renamed from: o.Ga$d */
    /* loaded from: classes.dex */
    public static class d {
        public static <T> OutputConfiguration a(Size size, Class<T> cls) {
            return C3212Ia.a(size, cls);
        }

        public static void b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    /* renamed from: o.Ga$e */
    /* loaded from: classes.dex */
    public static class e {
        public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }
}
