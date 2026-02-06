package o;

import o.C6033eL1;

/* renamed from: o.ij  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7104ij extends C6033eL1.a {
    public final C5548cL1 a;
    public final int b;

    public C7104ij(C5548cL1 c5548cL1, int i) {
        if (c5548cL1 != null) {
            this.a = c5548cL1;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    @Override // o.C6033eL1.a
    public int a() {
        return this.b;
    }

    @Override // o.C6033eL1.a
    public C5548cL1 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6033eL1.a) {
            C6033eL1.a aVar = (C6033eL1.a) obj;
            if (this.a.equals(aVar.b()) && this.b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.a + ", aspectRatio=" + this.b + "}";
    }
}
