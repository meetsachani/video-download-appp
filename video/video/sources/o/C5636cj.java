package o;

import android.util.Size;
import android.view.Surface;

/* renamed from: o.cj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5636cj extends AbstractC6179ex1 {
    public final Surface a;
    public final Size b;
    public final int c;

    public C5636cj(Surface surface, Size size, int i) {
        if (surface != null) {
            this.a = surface;
            if (size != null) {
                this.b = size;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    @Override // o.AbstractC6179ex1
    public int b() {
        return this.c;
    }

    @Override // o.AbstractC6179ex1
    public Size c() {
        return this.b;
    }

    @Override // o.AbstractC6179ex1
    public Surface d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6179ex1) {
            AbstractC6179ex1 abstractC6179ex1 = (AbstractC6179ex1) obj;
            if (this.a.equals(abstractC6179ex1.d()) && this.b.equals(abstractC6179ex1.c()) && this.c == abstractC6179ex1.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.a + ", size=" + this.b + ", imageFormat=" + this.c + "}";
    }
}
