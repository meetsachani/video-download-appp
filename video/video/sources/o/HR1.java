package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HR1<T> implements CQ<T> {
    public final HA0<BQ, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public HR1(HA0<? super BQ, ? extends T> ha0) {
        C6562gT0.p(ha0, "produceNewData");
        this.a = ha0;
    }

    @Override // o.CQ
    public Object a(BQ bq, HM<? super T> hm) throws IOException {
        return this.a.invoke(bq);
    }
}
