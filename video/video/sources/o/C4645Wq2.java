package o;

import android.hardware.camera2.CaptureRequest;
import java.util.List;
import o.C2598Bv;
import o.C3597Ly;

/* renamed from: o.Wq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4645Wq2 {
    public final boolean a;

    public C4645Wq2() {
        boolean z;
        if (X20.a(C4451Uq2.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public C3597Ly a(C3597Ly c3597Ly) {
        C3597Ly.a aVar = new C3597Ly.a();
        aVar.w(c3597Ly.i());
        for (D10 d10 : c3597Ly.g()) {
            aVar.f(d10);
        }
        aVar.e(c3597Ly.f());
        C2598Bv.a aVar2 = new C2598Bv.a();
        aVar2.g(CaptureRequest.FLASH_MODE, 0);
        aVar.e(aVar2.build());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z) {
        if (this.a && z) {
            for (CaptureRequest captureRequest : list) {
                Integer num = (Integer) captureRequest.get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
