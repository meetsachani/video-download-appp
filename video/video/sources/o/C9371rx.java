package o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C2895Ew;
import o.C8392nx;

/* renamed from: o.rx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9371rx implements C8392nx.b {
    public final CameraManager a;
    public final Object b;

    /* renamed from: o.rx$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Map<CameraManager.AvailabilityCallback, C8392nx.a> a = new HashMap();
        public final Handler b;

        public a(Handler handler) {
            this.b = handler;
        }
    }

    public C9371rx(Context context, Object obj) {
        this.a = (CameraManager) context.getSystemService("camera");
        this.b = obj;
    }

    public static C9371rx i(Context context, Handler handler) {
        return new C9371rx(context, new a(handler));
    }

    @Override // o.C8392nx.b
    public CameraManager a() {
        return this.a;
    }

    @Override // o.C8392nx.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C8392nx.a aVar;
        if (executor != null) {
            a aVar2 = (a) this.b;
            if (availabilityCallback != null) {
                synchronized (aVar2.a) {
                    try {
                        aVar = aVar2.a.get(availabilityCallback);
                        if (aVar == null) {
                            aVar = new C8392nx.a(executor, availabilityCallback);
                            aVar2.a.put(availabilityCallback, aVar);
                        }
                    } finally {
                    }
                }
            } else {
                aVar = null;
            }
            this.a.registerAvailabilityCallback(aVar, aVar2.b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // o.C8392nx.b
    public CameraCharacteristics c(String str) throws C3197Hv {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }

    @Override // o.C8392nx.b
    public Set<Set<String>> d() throws C3197Hv {
        return Collections.EMPTY_SET;
    }

    @Override // o.C8392nx.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3197Hv {
        C10907yF1.l(executor);
        C10907yF1.l(stateCallback);
        try {
            this.a.openCamera(str, new C2895Ew.b(executor, stateCallback), ((a) this.b).b);
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }

    @Override // o.C8392nx.b
    public String[] f() throws C3197Hv {
        try {
            return this.a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }

    @Override // o.C8392nx.b
    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        C8392nx.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.b;
            synchronized (aVar2.a) {
                aVar = aVar2.a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.d();
        }
        this.a.unregisterAvailabilityCallback(aVar);
    }
}
