package o;

import o.C6879hn0;

/* renamed from: o.Li  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3538Li extends C6879hn0.b {
    public final C5548cL1 g;
    public final int h;

    public C3538Li(C5548cL1 c5548cL1, int i) {
        if (c5548cL1 != null) {
            this.g = c5548cL1;
            this.h = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    @Override // o.C6879hn0.b
    public C5548cL1 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6879hn0.b) {
            C6879hn0.b bVar = (C6879hn0.b) obj;
            if (this.g.equals(bVar.e()) && this.h == bVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C6879hn0.b
    public int f() {
        return this.h;
    }

    public int hashCode() {
        return ((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.g + ", fallbackRule=" + this.h + "}";
    }
}
