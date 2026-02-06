package o;

import o.AbstractC3007Fx;

/* renamed from: o.vi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10283vi extends AbstractC3007Fx {
    public final AbstractC3007Fx.c h;
    public final AbstractC3007Fx.b i;

    public C10283vi(AbstractC3007Fx.c cVar, AbstractC3007Fx.b bVar) {
        if (cVar != null) {
            this.h = cVar;
            this.i = bVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // o.AbstractC3007Fx
    public AbstractC3007Fx.b c() {
        return this.i;
    }

    @Override // o.AbstractC3007Fx
    public AbstractC3007Fx.c d() {
        return this.h;
    }

    public boolean equals(Object obj) {
        AbstractC3007Fx.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3007Fx) {
            AbstractC3007Fx abstractC3007Fx = (AbstractC3007Fx) obj;
            if (this.h.equals(abstractC3007Fx.d()) && ((bVar = this.i) != null ? bVar.equals(abstractC3007Fx.c()) : abstractC3007Fx.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.h.hashCode() ^ 1000003) * 1000003;
        AbstractC3007Fx.b bVar = this.i;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.h + ", error=" + this.i + "}";
    }
}
