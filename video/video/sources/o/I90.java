package o;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public class I90<T> {
    public final List<D90<T>> a = new ArrayList();
    public int b = 0;
    public int c = 0;

    public static /* synthetic */ void a(IG ig, D90 d90) {
        d90.a(ig);
    }

    public void b(X10<T> x10) {
        this.a.add(x10);
        this.c++;
    }

    public void c(C8511oQ0<T> c8511oQ0) {
        this.a.add(c8511oQ0);
        this.c++;
    }

    public void d(C6077eX0<T> c6077eX0) {
        this.a.add(c6077eX0);
        this.b++;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public void g(final IG<T> ig) {
        this.a.forEach(new Consumer() { // from class: o.H90
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                I90.a(ig, (D90) obj);
            }
        });
    }
}
