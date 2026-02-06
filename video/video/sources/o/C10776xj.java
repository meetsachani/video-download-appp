package o;

import java.util.List;
import o.C9800ti2;

/* renamed from: o.xj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10776xj extends C9800ti2.b {
    public final C6618gi2 a;
    public final List<C9800ti2.d> b;

    public C10776xj(C6618gi2 c6618gi2, List<C9800ti2.d> list) {
        if (c6618gi2 != null) {
            this.a = c6618gi2;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    @Override // o.C9800ti2.b
    public List<C9800ti2.d> a() {
        return this.b;
    }

    @Override // o.C9800ti2.b
    public C6618gi2 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9800ti2.b) {
            C9800ti2.b bVar = (C9800ti2.b) obj;
            if (this.a.equals(bVar.b()) && this.b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
