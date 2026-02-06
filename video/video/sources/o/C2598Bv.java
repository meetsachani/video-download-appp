package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import o.C4475Uy;
import o.HJ;

/* renamed from: o.Bv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598Bv extends C4475Uy {
    public static final String L = "camera2.captureRequest.option.";
    public static final HJ.a<Integer> M = HJ.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final HJ.a<Long> N = HJ.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);
    public static final HJ.a<CameraDevice.StateCallback> O = HJ.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final HJ.a<CameraCaptureSession.StateCallback> P = HJ.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final HJ.a<CameraCaptureSession.CaptureCallback> Q = HJ.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final HJ.a<C4663Ww> R = HJ.a.a("camera2.cameraEvent.callback", C4663Ww.class);
    public static final HJ.a<Object> S = HJ.a.a("camera2.captureRequest.tag", Object.class);
    public static final HJ.a<String> T = HJ.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: o.Bv$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC10288vj0<C2598Bv> {
        public final C2569Bn1 a = C2569Bn1.u0();

        @Override // o.InterfaceC10288vj0
        /* renamed from: c */
        public C2598Bv build() {
            return new C2598Bv(C5932dw1.t0(this.a));
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        public a f(HJ hj) {
            for (HJ.a<?> aVar : hj.f()) {
                this.a.h0(aVar, hj.j(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.a.h0(C2598Bv.t0(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a h(CaptureRequest.Key<ValueT> key, ValueT valuet, HJ.c cVar) {
            this.a.M(C2598Bv.t0(key), cVar, valuet);
            return this;
        }
    }

    /* renamed from: o.Bv$b */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public InterfaceC10288vj0<T> a;

        public b(InterfaceC10288vj0<T> interfaceC10288vj0) {
            this.a = interfaceC10288vj0;
        }

        public b<T> a(C4663Ww c4663Ww) {
            this.a.e().h0(C2598Bv.R, c4663Ww);
            return this;
        }
    }

    public C2598Bv(HJ hj) {
        super(hj);
    }

    public static HJ.a<Object> t0(CaptureRequest.Key<?> key) {
        return HJ.a.b(L + key.getName(), Object.class, key);
    }

    public CameraCaptureSession.CaptureCallback A0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) d().h(Q, captureCallback);
    }

    public CameraCaptureSession.StateCallback B0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) d().h(P, stateCallback);
    }

    public long C0(long j) {
        return ((Long) d().h(N, Long.valueOf(j))).longValue();
    }

    public C4663Ww u0(C4663Ww c4663Ww) {
        return (C4663Ww) d().h(R, c4663Ww);
    }

    public C4475Uy v0() {
        return C4475Uy.a.h(d()).build();
    }

    public Object w0(Object obj) {
        return d().h(S, obj);
    }

    public int x0(int i) {
        return ((Integer) d().h(M, Integer.valueOf(i))).intValue();
    }

    public CameraDevice.StateCallback y0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) d().h(O, stateCallback);
    }

    public String z0(String str) {
        return (String) d().h(T, str);
    }
}
