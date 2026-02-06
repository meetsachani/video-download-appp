package o;

/* renamed from: o.Tx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4377Tx1<F, S> {
    public final F a;
    public final S b;

    public C4377Tx1(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> C4377Tx1<A, B> a(A a, B b) {
        return new C4377Tx1<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4377Tx1)) {
            return false;
        }
        C4377Tx1 c4377Tx1 = (C4377Tx1) obj;
        if (!C2691Ct1.a(c4377Tx1.a, this.a) || !C2691Ct1.a(c4377Tx1.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f = this.a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.a + C4500Ve2.b + this.b + "}";
    }
}
