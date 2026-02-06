package o;

/* loaded from: classes.dex */
public class F61 extends O61<Integer> {
    public Integer e(C9410s61<Integer> c9410s61) {
        T t = this.c;
        if (t != 0) {
            return (Integer) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // o.O61
    /* renamed from: f */
    public Integer a(C9410s61<Integer> c9410s61) {
        return Integer.valueOf(C4713Xj1.l(c9410s61.g().intValue(), c9410s61.b().intValue(), c9410s61.c()) + e(c9410s61).intValue());
    }
}
