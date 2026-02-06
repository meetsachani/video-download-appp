package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class J90<T> {
    public final List<E90<T>> a = new ArrayList();
    public int b = 0;
    public int c = 0;

    public void a(Y10<T> y10) {
        this.a.add(y10);
        this.c++;
    }

    public void b(C8754pQ0<T> c8754pQ0) {
        this.a.add(c8754pQ0);
        this.c++;
    }

    public void c(C6320fX0<T> c6320fX0) {
        this.a.add(c6320fX0);
        this.b++;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public void f(JG<T> jg) {
        for (E90<T> e90 : this.a) {
            e90.a(jg);
        }
    }
}
