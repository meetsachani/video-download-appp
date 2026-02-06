package o;

import android.util.Range;
import android.util.Size;
import java.util.List;
import o.InterfaceC6986iD2;

/* renamed from: o.ii  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7100ii extends AbstractC8324ng {
    public final AbstractC4609Wh2 a;
    public final int b;
    public final Size c;
    public final N80 d;
    public final List<InterfaceC6986iD2.b> e;
    public final HJ f;
    public final Range<Integer> g;

    public C7100ii(AbstractC4609Wh2 abstractC4609Wh2, int i, Size size, N80 n80, List<InterfaceC6986iD2.b> list, HJ hj, Range<Integer> range) {
        if (abstractC4609Wh2 != null) {
            this.a = abstractC4609Wh2;
            this.b = i;
            if (size != null) {
                this.c = size;
                if (n80 != null) {
                    this.d = n80;
                    if (list != null) {
                        this.e = list;
                        this.f = hj;
                        this.g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    @Override // o.AbstractC8324ng
    public List<InterfaceC6986iD2.b> b() {
        return this.e;
    }

    @Override // o.AbstractC8324ng
    public N80 c() {
        return this.d;
    }

    @Override // o.AbstractC8324ng
    public int d() {
        return this.b;
    }

    @Override // o.AbstractC8324ng
    public HJ e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        HJ hj;
        Range<Integer> range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8324ng) {
            AbstractC8324ng abstractC8324ng = (AbstractC8324ng) obj;
            if (this.a.equals(abstractC8324ng.g()) && this.b == abstractC8324ng.d() && this.c.equals(abstractC8324ng.f()) && this.d.equals(abstractC8324ng.c()) && this.e.equals(abstractC8324ng.b()) && ((hj = this.f) != null ? hj.equals(abstractC8324ng.e()) : abstractC8324ng.e() == null) && ((range = this.g) != null ? range.equals(abstractC8324ng.h()) : abstractC8324ng.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC8324ng
    public Size f() {
        return this.c;
    }

    @Override // o.AbstractC8324ng
    public AbstractC4609Wh2 g() {
        return this.a;
    }

    @Override // o.AbstractC8324ng
    public Range<Integer> h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        HJ hj = this.f;
        int i = 0;
        if (hj == null) {
            hashCode = 0;
        } else {
            hashCode = hj.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        Range<Integer> range = this.g;
        if (range != null) {
            i = range.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
