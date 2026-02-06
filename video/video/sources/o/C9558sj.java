package o;

import o.AbstractC2824Ed2;
import o.C3051Gi2;

/* renamed from: o.sj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9558sj extends AbstractC2824Ed2 {
    public final int f;
    public final AbstractC2824Ed2.a g;
    public final C3051Gi2.h h;

    public C9558sj(int i, AbstractC2824Ed2.a aVar, C3051Gi2.h hVar) {
        this.f = i;
        if (aVar != null) {
            this.g = aVar;
            this.h = hVar;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    @Override // o.AbstractC2824Ed2
    public int a() {
        return this.f;
    }

    @Override // o.AbstractC2824Ed2
    public C3051Gi2.h b() {
        return this.h;
    }

    @Override // o.AbstractC2824Ed2
    public AbstractC2824Ed2.a c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        C3051Gi2.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2824Ed2) {
            AbstractC2824Ed2 abstractC2824Ed2 = (AbstractC2824Ed2) obj;
            if (this.f == abstractC2824Ed2.a() && this.g.equals(abstractC2824Ed2.c()) && ((hVar = this.h) != null ? hVar.equals(abstractC2824Ed2.b()) : abstractC2824Ed2.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003;
        C3051Gi2.h hVar = this.h;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "StreamInfo{id=" + this.f + ", streamState=" + this.g + ", inProgressTransformationInfo=" + this.h + "}";
    }
}
