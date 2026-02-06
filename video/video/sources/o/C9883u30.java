package o;

/* renamed from: o.u30  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9883u30 {
    public final int a;
    public final int b;

    public C9883u30(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            this.a = i;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9883u30) {
            C9883u30 c9883u30 = (C9883u30) obj;
            if (this.a == c9883u30.a && this.b == c9883u30.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
