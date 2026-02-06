package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.fv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6415fv2 implements InterfaceC4020Qg2 {
    public final C5445bv2 X;
    public final long[] Y;
    public final Map<String, C5687cv2> Y0;
    public final Map<String, C6172ev2> Z;
    public final Map<String, String> Z0;

    public C6415fv2(C5445bv2 c5445bv2, Map<String, C6172ev2> map, Map<String, C5687cv2> map2, Map<String, String> map3) {
        Map<String, C6172ev2> map4;
        this.X = c5445bv2;
        this.Y0 = map2;
        this.Z0 = map3;
        if (map != null) {
            map4 = Collections.unmodifiableMap(map);
        } else {
            map4 = Collections.EMPTY_MAP;
        }
        this.Z = map4;
        this.Y = c5445bv2.j();
    }

    @InterfaceC5056aJ2
    public Map<String, C6172ev2> a() {
        return this.Z;
    }

    @InterfaceC5056aJ2
    public C5445bv2 b() {
        return this.X;
    }

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        int j2 = TD2.j(this.Y, j, false, false);
        if (j2 < this.Y.length) {
            return j2;
        }
        return -1;
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        return this.X.h(j, this.Z, this.Y0, this.Z0);
    }

    @Override // o.InterfaceC4020Qg2
    public long h(int i) {
        return this.Y[i];
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return this.Y.length;
    }
}
