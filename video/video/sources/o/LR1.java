package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class LR1<T> implements JG<T> {
    public final List<T> a = new ArrayList();
    public final List<T> b = new ArrayList();
    public int c = 0;
    public final NR1<T> d;

    public LR1(NR1<T> nr1) {
        this.d = nr1;
    }

    @Override // o.JG
    public void a(T t) {
        this.a.add(t);
    }

    @Override // o.JG
    public void b(T t) {
        this.b.add(t);
    }

    @Override // o.JG
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
