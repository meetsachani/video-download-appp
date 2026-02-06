package o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* renamed from: o.wd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10512wd2 extends C10755xd2 {
    public C10512wd2(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // o.C10755xd2, o.C10266vd2.a
    public Size[] a(int i) {
        return this.a.getOutputSizes(i);
    }
}
