package o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import o.V80;

/* loaded from: classes.dex */
public class X80 implements V80.a {
    public static final V80 a = new V80(new X80());
    public static final Set<N80> b = Collections.singleton(N80.n);

    @Override // o.V80.a
    public Set<N80> a() {
        return b;
    }

    @Override // o.V80.a
    public boolean b(N80 n80) {
        boolean equals = N80.n.equals(n80);
        C10907yF1.b(equals, "DynamicRange is not supported: " + n80);
        return false;
    }

    @Override // o.V80.a
    public Set<N80> c(N80 n80) {
        boolean equals = N80.n.equals(n80);
        C10907yF1.b(equals, "DynamicRange is not supported: " + n80);
        return b;
    }

    @Override // o.V80.a
    public DynamicRangeProfiles e() {
        return null;
    }
}
