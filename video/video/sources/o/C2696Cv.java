package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import o.HJ;

/* renamed from: o.Cv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2696Cv {

    /* renamed from: o.Cv$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public InterfaceC10288vj0<T> a;

        public a(InterfaceC10288vj0<T> interfaceC10288vj0) {
            this.a = interfaceC10288vj0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a<T> a(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.a.e().M(C2598Bv.t0(key), HJ.c.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        public a<T> b(int i) {
            this.a.e().h0(C2598Bv.M, Integer.valueOf(i));
            return this;
        }

        public a<T> c(CameraDevice.StateCallback stateCallback) {
            this.a.e().h0(C2598Bv.O, stateCallback);
            return this;
        }

        public a<T> d(String str) {
            this.a.e().h0(C2598Bv.T, str);
            return this;
        }

        public a<T> e(CameraCaptureSession.CaptureCallback captureCallback) {
            this.a.e().h0(C2598Bv.Q, captureCallback);
            return this;
        }

        public a<T> f(CameraCaptureSession.StateCallback stateCallback) {
            this.a.e().h0(C2598Bv.P, stateCallback);
            return this;
        }

        public a<T> g(long j) {
            this.a.e().h0(C2598Bv.N, Long.valueOf(j));
            return this;
        }
    }
}
