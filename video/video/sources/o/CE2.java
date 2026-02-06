package o;

import java.util.Collections;

/* loaded from: classes.dex */
public class CE2<K, A> extends AbstractC7840ll<K, A> {
    public final A i;

    public CE2(O61<A> o61) {
        this(o61, null);
    }

    @Override // o.AbstractC7840ll
    public float c() {
        return 1.0f;
    }

    @Override // o.AbstractC7840ll
    public A h() {
        O61<A> o61 = this.e;
        A a = this.i;
        return o61.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // o.AbstractC7840ll
    public A i(LX0<K> lx0, float f) {
        return h();
    }

    @Override // o.AbstractC7840ll
    public void l() {
        if (this.e != null) {
            super.l();
        }
    }

    @Override // o.AbstractC7840ll
    public void n(float f) {
        this.d = f;
    }

    public CE2(O61<A> o61, A a) {
        super(Collections.EMPTY_LIST);
        o(o61);
        this.i = a;
    }
}
