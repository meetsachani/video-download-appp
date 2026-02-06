package o;

import o.AbstractC11237zc2;

/* renamed from: o.rj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9315rj extends AbstractC11237zc2.a {
    public final Throwable a;

    public C9315rj(Throwable th) {
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("Null error");
    }

    @Override // o.AbstractC11237zc2.a
    public Throwable a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11237zc2.a) {
            return this.a.equals(((AbstractC11237zc2.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
