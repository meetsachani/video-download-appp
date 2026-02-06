package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class KR1<T> implements IG<T> {
    public final List<T> a = new ArrayList();
    public final List<T> b = new ArrayList();
    public int c = 0;
    public final MR1<T> d;

    public KR1(MR1<T> mr1) {
        this.d = mr1;
    }

    @Override // o.IG
    public void a(T t) {
        this.a.add(t);
    }

    @Override // o.IG
    public void b(T t) {
        this.b.add(t);
    }

    @Override // o.IG
    public void c(T t) {
        if (this.b.isEmpty() && this.a.isEmpty()) {
            this.c++;
            return;
        }
        this.d.a(this.c, this.b, this.a);
        this.b.clear();
        this.a.clear();
        this.c = 1;
    }
}
