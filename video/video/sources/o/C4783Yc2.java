package o;

import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* renamed from: o.Yc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4783Yc2 {
    public final boolean a;

    public C4783Yc2() {
        boolean z;
        if (((C4686Xc2) X20.a(C4686Xc2.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(List<CaptureRequest> list, boolean z) {
        if (this.a && z) {
            for (CaptureRequest captureRequest : list) {
                int intValue = ((Integer) captureRequest.get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
                while (r3.hasNext()) {
                }
            }
        }
        return false;
    }
}
