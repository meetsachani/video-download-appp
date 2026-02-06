package o;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class DZ0 extends AbstractC2699Cw {
    public static final String a0 = "CamLifecycleController";
    public KZ0 Z;

    public DZ0(Context context) {
        super(context);
    }

    public void L0(KZ0 kz0) {
        C5901do2.c();
        this.Z = kz0;
        t0();
    }

    public void M0() {
        SH1 sh1 = this.r;
        if (sh1 != null) {
            sh1.shutdown();
        }
    }

    public void N0() {
        C5901do2.c();
        this.Z = null;
        this.q = null;
        SH1 sh1 = this.r;
        if (sh1 != null) {
            sh1.a();
        }
    }

    @Override // o.AbstractC2699Cw
    public InterfaceC3099Gv s0() {
        if (this.Z == null) {
            Log.d(a0, "Lifecycle is not set.");
            return null;
        } else if (this.r == null) {
            Log.d(a0, "CameraProvider is not ready.");
            return null;
        } else {
            C7713lD2 k = k();
            if (k == null) {
                return null;
            }
            try {
                return this.r.d(this.Z, this.a, k);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
            }
        }
    }

    public DZ0(Context context, InterfaceFutureC8411o11<SH1> interfaceFutureC8411o11) {
        super(context, interfaceFutureC8411o11);
    }
}
