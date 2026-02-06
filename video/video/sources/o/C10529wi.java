package o;

import o.AbstractC3007Fx;

/* renamed from: o.wi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10529wi extends AbstractC3007Fx.b {
    public final int a;
    public final Throwable b;

    public C10529wi(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // o.AbstractC3007Fx.b
    public Throwable c() {
        return this.b;
    }

    @Override // o.AbstractC3007Fx.b
    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3007Fx.b) {
            AbstractC3007Fx.b bVar = (AbstractC3007Fx.b) obj;
            if (this.a == bVar.d() && ((th = this.b) != null ? th.equals(bVar.c()) : bVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
