package o;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import o.C2598Bv;

/* loaded from: classes.dex */
public class N7 {
    public final Range<Integer> a;

    public N7(C10931yL1 c10931yL1) {
        O7 o7 = (O7) c10931yL1.b(O7.class);
        if (o7 == null) {
            this.a = null;
        } else {
            this.a = o7.e();
        }
    }

    public void a(C2598Bv.a aVar) {
        Range<Integer> range = this.a;
        if (range != null) {
            aVar.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
