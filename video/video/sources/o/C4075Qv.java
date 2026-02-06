package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import o.C3016Ga;
import o.C4075Qv;

/* renamed from: o.Qv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4075Qv {
    public final a a;

    /* renamed from: o.Qv$a */
    /* loaded from: classes.dex */
    public interface a {
        CameraCaptureSession e();

        int f(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int g(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int h(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int i(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: o.Qv$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final CameraCaptureSession.CaptureCallback a;
        public final Executor b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.b = executor;
            this.a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.b.execute(new Runnable() { // from class: o.Wv
                @Override // java.lang.Runnable
                public final void run() {
                    C3016Ga.c.a(C4075Qv.b.this.a, cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: o.Sv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.b.execute(new Runnable() { // from class: o.Vv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.b.execute(new Runnable() { // from class: o.Tv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.b.execute(new Runnable() { // from class: o.Xv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureSequenceAborted(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.b.execute(new Runnable() { // from class: o.Uv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.b.execute(new Runnable() { // from class: o.Rv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.b.this.a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    /* renamed from: o.Qv$c */
    /* loaded from: classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {
        public final CameraCaptureSession.StateCallback a;
        public final Executor b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.b = executor;
            this.a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.Yv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.c.this.a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.bw
                @Override // java.lang.Runnable
                public final void run() {
                    C3016Ga.d.b(C4075Qv.c.this.a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.Zv
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.c.this.a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.ew
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.c.this.a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.cw
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.c.this.a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o.dw
                @Override // java.lang.Runnable
                public final void run() {
                    C4075Qv.c.this.a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.b.execute(new Runnable() { // from class: o.aw
                @Override // java.lang.Runnable
                public final void run() {
                    C3016Ga.b.a(C4075Qv.c.this.a, cameraCaptureSession, surface);
                }
            });
        }
    }

    public C4075Qv(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new C6416fw(cameraCaptureSession);
        } else {
            this.a = C6671gw.a(cameraCaptureSession, handler);
        }
    }

    public static C4075Qv f(CameraCaptureSession cameraCaptureSession) {
        return g(cameraCaptureSession, C10632x71.a());
    }

    public static C4075Qv g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C4075Qv(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.f(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.i(captureRequest, executor, captureCallback);
    }

    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.g(list, executor, captureCallback);
    }

    public int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.a.h(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession e() {
        return this.a.e();
    }
}
