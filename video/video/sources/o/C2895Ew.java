package o;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import o.C2895Ew;

/* renamed from: o.Ew  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2895Ew {
    public static final int b = 0;
    public static final int c = 1;
    public final a a;

    /* renamed from: o.Ew$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(U12 u12) throws C3197Hv;

        CameraDevice e();
    }

    /* renamed from: o.Ew$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {
        public final CameraDevice.StateCallback a;
        public final Executor b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.b = executor;
            this.a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: o.Fw
                @Override // java.lang.Runnable
                public final void run() {
                    C2895Ew.b.this.a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: o.Hw
                @Override // java.lang.Runnable
                public final void run() {
                    C2895Ew.b.this.a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.b.execute(new Runnable() { // from class: o.Gw
                @Override // java.lang.Runnable
                public final void run() {
                    C2895Ew.b.this.a.onError(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: o.Iw
                @Override // java.lang.Runnable
                public final void run() {
                    C2895Ew.b.this.a.onOpened(cameraDevice);
                }
            });
        }
    }

    public C2895Ew(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new C3591Lw(cameraDevice);
        } else {
            this.a = C3494Kw.i(cameraDevice, handler);
        }
    }

    public static C2895Ew c(CameraDevice cameraDevice) {
        return d(cameraDevice, C10632x71.a());
    }

    public static C2895Ew d(CameraDevice cameraDevice, Handler handler) {
        return new C2895Ew(cameraDevice, handler);
    }

    public void a(U12 u12) throws C3197Hv {
        this.a.a(u12);
    }

    public CameraDevice b() {
        return this.a.e();
    }
}
