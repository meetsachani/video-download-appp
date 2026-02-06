package o;

import o.C5548cL1;

/* renamed from: o.jj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7346jj extends C5548cL1.b {
    public final int j;
    public final String k;

    public C7346jj(int i, String str) {
        this.j = i;
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // o.C5548cL1.b
    public String c() {
        return this.k;
    }

    @Override // o.C5548cL1.b
    public int d() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5548cL1.b) {
            C5548cL1.b bVar = (C5548cL1.b) obj;
            if (this.j == bVar.d() && this.k.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.j ^ 1000003) * 1000003) ^ this.k.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.j + ", name=" + this.k + "}";
    }
}
