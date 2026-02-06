package o;

import android.util.Size;
import java.util.Map;

/* renamed from: o.Bj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2551Bj extends AbstractC3149Hi2 {
    public final Size a;
    public final Map<Integer, Size> b;
    public final Size c;
    public final Map<Integer, Size> d;
    public final Size e;
    public final Map<Integer, Size> f;
    public final Map<Integer, Size> g;

    public C2551Bj(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size != null) {
            this.a = size;
            if (map != null) {
                this.b = map;
                if (size2 != null) {
                    this.c = size2;
                    if (map2 != null) {
                        this.d = map2;
                        if (size3 != null) {
                            this.e = size3;
                            if (map3 != null) {
                                this.f = map3;
                                if (map4 != null) {
                                    this.g = map4;
                                    return;
                                }
                                throw new NullPointerException("Null ultraMaximumSizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }

    @Override // o.AbstractC3149Hi2
    public Size b() {
        return this.a;
    }

    @Override // o.AbstractC3149Hi2
    public Map<Integer, Size> d() {
        return this.f;
    }

    @Override // o.AbstractC3149Hi2
    public Size e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3149Hi2) {
            AbstractC3149Hi2 abstractC3149Hi2 = (AbstractC3149Hi2) obj;
            if (this.a.equals(abstractC3149Hi2.b()) && this.b.equals(abstractC3149Hi2.j()) && this.c.equals(abstractC3149Hi2.e()) && this.d.equals(abstractC3149Hi2.h()) && this.e.equals(abstractC3149Hi2.f()) && this.f.equals(abstractC3149Hi2.d()) && this.g.equals(abstractC3149Hi2.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC3149Hi2
    public Size f() {
        return this.e;
    }

    @Override // o.AbstractC3149Hi2
    public Map<Integer, Size> h() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // o.AbstractC3149Hi2
    public Map<Integer, Size> j() {
        return this.b;
    }

    @Override // o.AbstractC3149Hi2
    public Map<Integer, Size> l() {
        return this.g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
