package o;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import o.C3491Kv;

/* renamed from: o.Ky  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3500Ky {
    public static CameraCaptureSession.CaptureCallback a(AbstractC3393Jv abstractC3393Jv) {
        if (abstractC3393Jv == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC3393Jv, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return C6169ev.a(arrayList);
    }

    public static void b(AbstractC3393Jv abstractC3393Jv, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC3393Jv instanceof C3491Kv.a) {
            for (AbstractC3393Jv abstractC3393Jv2 : ((C3491Kv.a) abstractC3393Jv).d()) {
                b(abstractC3393Jv2, list);
            }
        } else if (abstractC3393Jv instanceof C3402Jy) {
            list.add(((C3402Jy) abstractC3393Jv).e());
        } else {
            list.add(new C3304Iy(abstractC3393Jv));
        }
    }
}
