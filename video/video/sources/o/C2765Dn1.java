package o;

/* renamed from: o.Dn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2765Dn1<T> {
    public T a;
    public T b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void b(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4377Tx1)) {
            return false;
        }
        C4377Tx1 c4377Tx1 = (C4377Tx1) obj;
        if (!a(c4377Tx1.a, this.a) || !a(c4377Tx1.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t = this.a;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.a + C4500Ve2.b + this.b + "}";
    }
}
