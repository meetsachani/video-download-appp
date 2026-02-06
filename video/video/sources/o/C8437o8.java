package o;

import java.util.Iterator;
import o.C8068mc2;

/* renamed from: o.o8  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8437o8 extends C9210rH0 {
    public float q0;

    public C8437o8(C8068mc2 c8068mc2) {
        super(c8068mc2, C8068mc2.d.ALIGN_VERTICALLY);
        this.q0 = 0.5f;
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        Iterator<Object> it = this.o0.iterator();
        while (it.hasNext()) {
            QK f = this.m0.f(it.next());
            f.x();
            Object obj = this.O;
            if (obj != null) {
                f.D0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    f.C0(obj2);
                } else {
                    f.D0(C8068mc2.f805o);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                f.D(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    f.C(obj4);
                } else {
                    f.C(C8068mc2.f805o);
                }
            }
            float f2 = this.q0;
            if (f2 != 0.5f) {
                f.a0(f2);
            }
        }
    }
}
