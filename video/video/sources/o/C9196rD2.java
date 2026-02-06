package o;

import java.util.List;
import o.C10833xx0;
import o.Yu2;

@Deprecated
/* renamed from: o.rD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9196rD2 {
    public static final int c = 434;
    public final List<C10833xx0> a;
    public final InterfaceC10568wr2[] b;

    public C9196rD2(List<C10833xx0> list) {
        this.a = list;
        this.b = new InterfaceC10568wr2[list.size()];
    }

    public void a(long j, C3012Fy1 c3012Fy1) {
        if (c3012Fy1.a() >= 9) {
            int s = c3012Fy1.s();
            int s2 = c3012Fy1.s();
            int L = c3012Fy1.L();
            if (s == 434 && s2 == 1195456820 && L == 3) {
                C3893Oz.b(j, c3012Fy1, this.b);
            }
        }
    }

    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        boolean z;
        for (int i = 0; i < this.b.length; i++) {
            eVar.a();
            InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 3);
            C10833xx0 c10833xx0 = this.a.get(i);
            String str = c10833xx0.g1;
            if (!C4128Rj1.x0.equals(str) && !C4128Rj1.y0.equals(str)) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.b(z, "Invalid closed caption MIME type provided: " + str);
            b.a(new C10833xx0.b().U(eVar.b()).g0(str).i0(c10833xx0.Y0).X(c10833xx0.Z).H(c10833xx0.y1).V(c10833xx0.i1).G());
            this.b[i] = b;
        }
    }
}
