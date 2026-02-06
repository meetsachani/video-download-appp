package o;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import o.C2598Bv;
import o.T12;

/* loaded from: classes.dex */
public class ZG1 {
    public static final Rational a = new Rational(16, 9);

    public static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, T12.b bVar) {
        if (((C5047aH1) X20.a(C5047aH1.class)) == null || a(size, a)) {
            return;
        }
        C2598Bv.a aVar = new C2598Bv.a();
        aVar.g(CaptureRequest.TONEMAP_MODE, 2);
        bVar.h(aVar.build());
    }
}
