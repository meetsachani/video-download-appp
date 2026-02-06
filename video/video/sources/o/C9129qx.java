package o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* renamed from: o.qx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9129qx extends C8879px {
    public C9129qx(Context context) {
        super(context);
    }

    @Override // o.C9371rx, o.C8392nx.b
    public Set<Set<String>> d() throws C3197Hv {
        try {
            return this.a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw C3197Hv.f(e);
        }
    }
}
