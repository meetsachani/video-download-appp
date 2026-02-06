package o;

import o.C9701tI1;

/* renamed from: o.fj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6364fj extends C9701tI1.a {
    public final C7695l90<C9701tI1.b> a;
    public final int b;
    public final int c;

    public C6364fj(C7695l90<C9701tI1.b> c7695l90, int i, int i2) {
        if (c7695l90 != null) {
            this.a = c7695l90;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null edge");
    }

    @Override // o.C9701tI1.a
    public C7695l90<C9701tI1.b> a() {
        return this.a;
    }

    @Override // o.C9701tI1.a
    public int b() {
        return this.b;
    }

    @Override // o.C9701tI1.a
    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9701tI1.a) {
            C9701tI1.a aVar = (C9701tI1.a) obj;
            if (this.a.equals(aVar.a()) && this.b == aVar.b() && this.c == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        return "In{edge=" + this.a + ", inputFormat=" + this.b + ", outputFormat=" + this.c + "}";
    }
}
