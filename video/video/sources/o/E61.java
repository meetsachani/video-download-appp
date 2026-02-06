package o;

/* loaded from: classes.dex */
public class E61 extends O61<Float> {
    public E61() {
    }

    public Float e(C9410s61<Float> c9410s61) {
        T t = this.c;
        if (t != 0) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // o.O61
    /* renamed from: f */
    public Float a(C9410s61<Float> c9410s61) {
        return Float.valueOf(C4713Xj1.k(c9410s61.g().floatValue(), c9410s61.b().floatValue(), c9410s61.c()) + e(c9410s61).floatValue());
    }

    public E61(Float f) {
        super(f);
    }
}
