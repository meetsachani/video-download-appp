package o;

import o.AbstractC4609Wh2;

/* renamed from: o.vj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10287vj extends AbstractC4609Wh2 {
    public final AbstractC4609Wh2.b b;
    public final AbstractC4609Wh2.a c;
    public final long d;

    public C10287vj(AbstractC4609Wh2.b bVar, AbstractC4609Wh2.a aVar, long j) {
        if (bVar != null) {
            this.b = bVar;
            if (aVar != null) {
                this.c = aVar;
                this.d = j;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    @Override // o.AbstractC4609Wh2
    public AbstractC4609Wh2.a c() {
        return this.c;
    }

    @Override // o.AbstractC4609Wh2
    public AbstractC4609Wh2.b d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4609Wh2) {
            AbstractC4609Wh2 abstractC4609Wh2 = (AbstractC4609Wh2) obj;
            if (this.b.equals(abstractC4609Wh2.d()) && this.c.equals(abstractC4609Wh2.c()) && this.d == abstractC4609Wh2.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC4609Wh2
    public long f() {
        return this.d;
    }

    public int hashCode() {
        long j = this.d;
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.b + ", configSize=" + this.c + ", streamUseCase=" + this.d + "}";
    }
}
