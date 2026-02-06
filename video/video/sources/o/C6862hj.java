package o;

/* renamed from: o.hj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6862hj extends BI1 {
    public final Integer a;

    public C6862hj(@InterfaceC11300zs1 Integer num) {
        this.a = num;
    }

    @Override // o.BI1
    @InterfaceC11300zs1
    public Integer a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BI1)) {
            return false;
        }
        Integer num = this.a;
        Integer a = ((BI1) obj).a();
        if (num == null) {
            if (a == null) {
                return true;
            }
            return false;
        }
        return num.equals(a);
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
