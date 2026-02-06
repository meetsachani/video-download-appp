package o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3016Ga;

/* renamed from: o.hw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6914hw {

    /* renamed from: o.hw$a */
    /* loaded from: classes.dex */
    public static final class a extends CameraCaptureSession.StateCallback {
        public final List<CameraCaptureSession.StateCallback> a = new ArrayList();

        public a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                stateCallback.onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                C3016Ga.d.b(stateCallback, cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                stateCallback.onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                stateCallback.onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback stateCallback : this.a) {
                C3016Ga.b.a(stateCallback, cameraCaptureSession, surface);
            }
        }
    }

    public static CameraCaptureSession.StateCallback a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static CameraCaptureSession.StateCallback b(CameraCaptureSession.StateCallback... stateCallbackArr) {
        return a(Arrays.asList(stateCallbackArr));
    }

    public static CameraCaptureSession.StateCallback c() {
        return new b();
    }

    /* renamed from: o.hw$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }
}
