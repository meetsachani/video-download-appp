package o;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import o.C10266vd2;

/* renamed from: o.xd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10755xd2 implements C10266vd2.a {
    public final StreamConfigurationMap a;

    /* renamed from: o.xd2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public C10755xd2(StreamConfigurationMap streamConfigurationMap) {
        this.a = streamConfigurationMap;
    }

    @Override // o.C10266vd2.a
    public Size[] a(int i) {
        if (i == 34) {
            return this.a.getOutputSizes(SurfaceTexture.class);
        }
        return this.a.getOutputSizes(i);
    }

    @Override // o.C10266vd2.a
    public <T> Size[] b(Class<T> cls) {
        return this.a.getOutputSizes(cls);
    }

    @Override // o.C10266vd2.a
    public Size[] c(int i) {
        return a.a(this.a, i);
    }

    @Override // o.C10266vd2.a
    public StreamConfigurationMap e() {
        return this.a;
    }
}
