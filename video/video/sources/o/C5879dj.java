package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: o.dj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5879dj<T> extends AbstractC3401Jx1<T> {
    public final T a;
    public final C11251zg0 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final InterfaceC3784Nv h;

    public C5879dj(T t, C11251zg0 c11251zg0, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC3784Nv interfaceC3784Nv) {
        if (t != null) {
            this.a = t;
            this.b = c11251zg0;
            this.c = i;
            if (size != null) {
                this.d = size;
                if (rect != null) {
                    this.e = rect;
                    this.f = i2;
                    if (matrix != null) {
                        this.g = matrix;
                        if (interfaceC3784Nv != null) {
                            this.h = interfaceC3784Nv;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }

    @Override // o.AbstractC3401Jx1
    public InterfaceC3784Nv a() {
        return this.h;
    }

    @Override // o.AbstractC3401Jx1
    public Rect b() {
        return this.e;
    }

    @Override // o.AbstractC3401Jx1
    public T c() {
        return this.a;
    }

    @Override // o.AbstractC3401Jx1
    public C11251zg0 d() {
        return this.b;
    }

    @Override // o.AbstractC3401Jx1
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        C11251zg0 c11251zg0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3401Jx1) {
            AbstractC3401Jx1 abstractC3401Jx1 = (AbstractC3401Jx1) obj;
            if (this.a.equals(abstractC3401Jx1.c()) && ((c11251zg0 = this.b) != null ? c11251zg0.equals(abstractC3401Jx1.d()) : abstractC3401Jx1.d() == null) && this.c == abstractC3401Jx1.e() && this.d.equals(abstractC3401Jx1.h()) && this.e.equals(abstractC3401Jx1.b()) && this.f == abstractC3401Jx1.f() && this.g.equals(abstractC3401Jx1.g()) && this.h.equals(abstractC3401Jx1.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC3401Jx1
    public int f() {
        return this.f;
    }

    @Override // o.AbstractC3401Jx1
    public Matrix g() {
        return this.g;
    }

    @Override // o.AbstractC3401Jx1
    public Size h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        C11251zg0 c11251zg0 = this.b;
        if (c11251zg0 == null) {
            hashCode = 0;
        } else {
            hashCode = c11251zg0.hashCode();
        }
        return ((((((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
