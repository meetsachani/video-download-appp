package o;

import java.util.Iterator;
import o.C8068mc2;

/* renamed from: o.p8  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8681p8 extends C9210rH0 {
    public float q0;

    public C8681p8(C8068mc2 c8068mc2) {
        super(c8068mc2, C8068mc2.d.ALIGN_VERTICALLY);
        this.q0 = 0.5f;
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        Iterator<Object> it = this.o0.iterator();
        while (it.hasNext()) {
            QK f = this.m0.f(it.next());
            f.y();
            Object obj = this.S;
            if (obj != null) {
                f.H0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    f.G0(obj2);
                } else {
                    f.H0(C8068mc2.f805o);
                }
            }
            Object obj3 = this.V;
            if (obj3 != null) {
                f.r(obj3);
            } else {
                Object obj4 = this.W;
                if (obj4 != null) {
                    f.q(obj4);
                } else {
                    f.q(C8068mc2.f805o);
                }
            }
            float f2 = this.q0;
            if (f2 != 0.5f) {
                f.M0(f2);
            }
        }
    }
}
