package o;

/* loaded from: classes.dex */
public class O61<T> {
    public final C9410s61<T> a;
    public AbstractC7840ll<?, ?> b;
    public T c;

    public O61() {
        this.a = new C9410s61<>();
        this.c = null;
    }

    public T a(C9410s61<T> c9410s61) {
        return this.c;
    }

    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.a.h(f, f2, t, t2, f3, f4, f5));
    }

    public final void c(AbstractC7840ll<?, ?> abstractC7840ll) {
        this.b = abstractC7840ll;
    }

    public final void d(T t) {
        this.c = t;
        AbstractC7840ll<?, ?> abstractC7840ll = this.b;
        if (abstractC7840ll != null) {
            abstractC7840ll.l();
        }
    }

    public O61(T t) {
        this.a = new C9410s61<>();
        this.c = t;
    }
}
