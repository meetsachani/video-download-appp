package o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: o.ox  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8636ox extends C9371rx {
    public C8636ox(Context context) {
        super(context, null);
    }

    public static C8636ox j(Context context) {
        return new C8636ox(context);
    }

    public static boolean l(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // o.C9371rx, o.C8392nx.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // o.C9371rx, o.C8392nx.b
    public CameraCharacteristics c(String str) throws C3197Hv {
        try {
            return super.c(str);
        } catch (RuntimeException e) {
            if (k(e)) {
                m(e);
            }
            throw e;
        }
    }

    @Override // o.C9371rx, o.C8392nx.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3197Hv {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (k(e4)) {
                m(e4);
            }
            throw e4;
        }
    }

    @Override // o.C9371rx, o.C8392nx.b
    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.unregisterAvailabilityCallback(availabilityCallback);
    }

    public final boolean k(Throwable th) {
        if (Build.VERSION.SDK_INT == 28 && l(th)) {
            return true;
        }
        return false;
    }

    public final void m(Throwable th) throws C3197Hv {
        throw new C3197Hv((int) C3197Hv.e1, th);
    }
}
