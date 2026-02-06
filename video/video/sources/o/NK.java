package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NK<T> implements PK<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public TK<T> c;
    public a d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> workSpecIds);

        void b(List<String> workSpecIds);
    }

    public NK(TK<T> tracker) {
        this.c = tracker;
    }

    @Override // o.PK
    public void a(T newValue) {
        this.b = newValue;
        h(this.d, newValue);
    }

    public abstract boolean b(C8501oN2 workSpec);

    public abstract boolean c(T currentValue);

    public boolean d(String workSpecId) {
        T t = this.b;
        if (t != null && c(t) && this.a.contains(workSpecId)) {
            return true;
        }
        return false;
    }

    public void e(Iterable<C8501oN2> workSpecs) {
        this.a.clear();
        for (C8501oN2 c8501oN2 : workSpecs) {
            if (b(c8501oN2)) {
                this.a.add(c8501oN2.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }

    public void g(a callback) {
        if (this.d != callback) {
            this.d = callback;
            h(callback, this.b);
        }
    }

    public final void h(a callback, T currentValue) {
        if (!this.a.isEmpty() && callback != null) {
            if (currentValue != null && !c(currentValue)) {
                callback.a(this.a);
            } else {
                callback.b(this.a);
            }
        }
    }
}
