package o;

import android.hardware.camera2.CaptureRequest;
import o.C2598Bv;

/* loaded from: classes.dex */
public class KM0 {
    public void a(int i, C2598Bv.a aVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((LM0) X20.a(LM0.class)) != null) {
            if (i == 0) {
                key = CaptureRequest.CONTROL_ENABLE_ZSL;
                aVar.g(key, Boolean.TRUE);
            } else if (i == 1) {
                key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                aVar.g(key2, Boolean.FALSE);
            }
        }
    }
}
