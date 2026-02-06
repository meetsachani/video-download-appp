package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public final class V80 {
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
        Set<N80> a();

        boolean b(N80 n80);

        Set<N80> c(N80 n80);

        DynamicRangeProfiles e();
    }

    public V80(a aVar) {
        this.a = aVar;
    }

    public static V80 a(C7641kw c7641kw) {
        V80 v80;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            v80 = f(U80.a(c7641kw.a(key)));
        } else {
            v80 = null;
        }
        if (v80 == null) {
            return X80.a;
        }
        return v80;
    }

    public static V80 f(DynamicRangeProfiles dynamicRangeProfiles) {
        boolean z;
        if (dynamicRangeProfiles == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new V80(new W80(dynamicRangeProfiles));
    }

    public Set<N80> b(N80 n80) {
        return this.a.c(n80);
    }

    public Set<N80> c() {
        return this.a.a();
    }

    public boolean d(N80 n80) {
        return this.a.b(n80);
    }

    public DynamicRangeProfiles e() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.a.e();
    }
}
