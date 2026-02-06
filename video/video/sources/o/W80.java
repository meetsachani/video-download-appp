package o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.V80;

/* loaded from: classes.dex */
public class W80 implements V80.a {
    public final DynamicRangeProfiles a;

    public W80(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set<N80> f(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long l : set) {
            hashSet.add(g(l.longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static N80 g(long j) {
        N80 b = P80.b(j);
        return (N80) C10907yF1.m(b, "Dynamic range profile cannot be converted to a DynamicRange object: " + j);
    }

    @Override // o.V80.a
    public Set<N80> a() {
        return f(this.a.getSupportedProfiles());
    }

    @Override // o.V80.a
    public boolean b(N80 n80) {
        boolean z;
        Long d = d(n80);
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "DynamicRange is not supported: " + n80);
        return this.a.isExtraLatencyPresent(d.longValue());
    }

    @Override // o.V80.a
    public Set<N80> c(N80 n80) {
        boolean z;
        Long d = d(n80);
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "DynamicRange is not supported: " + n80);
        return f(this.a.getProfileCaptureRequestConstraints(d.longValue()));
    }

    public final Long d(N80 n80) {
        return P80.a(n80, this.a);
    }

    @Override // o.V80.a
    public DynamicRangeProfiles e() {
        return this.a;
    }
}
