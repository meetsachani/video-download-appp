package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: o.Sx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4278Sx {
    public static final String a = "CameraValidator";

    /* renamed from: o.Sx$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(Context context, C2604Bx c2604Bx, C2898Ex c2898Ex) throws a {
        Integer d;
        if (c2898Ex != null) {
            try {
                d = c2898Ex.d();
                if (d == null) {
                    C7433k41.p(a, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C7433k41.d(a, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            d = null;
        }
        C7433k41.a(a, "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c2898Ex != null) {
                    if (d.intValue() == 1) {
                    }
                }
                C2898Ex.g.e(c2604Bx.f());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c2898Ex == null || d.intValue() == 0) {
                    C2898Ex.f.e(c2604Bx.f());
                }
            }
        } catch (IllegalArgumentException e2) {
            C7433k41.c(a, "Camera LensFacing verification failed, existing cameras: " + c2604Bx.f());
            throw new a("Expected camera missing from device.", e2);
        }
    }
}
