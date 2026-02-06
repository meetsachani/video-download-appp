package o;

import java.util.List;

/* renamed from: o.kx0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7646kx0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public C7646kx0(C10931yL1 c10931yL1, C10931yL1 c10931yL12) {
        this.a = c10931yL12.a(C7365jn2.class);
        this.b = c10931yL1.a(YG1.class);
        this.c = c10931yL1.a(XJ.class);
    }

    public void a(List<D10> list) {
        if (b() && list != null) {
            for (D10 d10 : list) {
                d10.d();
            }
            C7433k41.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    public boolean b() {
        if (!this.a && !this.b && !this.c) {
            return false;
        }
        return true;
    }
}
