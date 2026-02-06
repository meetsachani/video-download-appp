package o;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.Ow  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3884Ow {

    /* renamed from: o.Ow$a */
    /* loaded from: classes.dex */
    public static final class a extends CameraDevice.StateCallback {
        public final List<CameraDevice.StateCallback> a = new ArrayList();

        public a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.a) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.a) {
                stateCallback.onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback stateCallback : this.a) {
                stateCallback.onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.a) {
                stateCallback.onOpened(cameraDevice);
            }
        }
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static CameraDevice.StateCallback b(CameraDevice.StateCallback... stateCallbackArr) {
        return a(Arrays.asList(stateCallbackArr));
    }

    public static CameraDevice.StateCallback c() {
        return new b();
    }

    /* renamed from: o.Ow$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
        }
    }
}
