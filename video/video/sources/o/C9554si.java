package o;

import android.graphics.Bitmap;
import o.C2970Fn;

/* renamed from: o.si  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9554si extends C2970Fn.a {
    public final AbstractC3401Jx1<Bitmap> a;
    public final int b;

    public C9554si(AbstractC3401Jx1<Bitmap> abstractC3401Jx1, int i) {
        if (abstractC3401Jx1 != null) {
            this.a = abstractC3401Jx1;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // o.C2970Fn.a
    public int a() {
        return this.b;
    }

    @Override // o.C2970Fn.a
    public AbstractC3401Jx1<Bitmap> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2970Fn.a) {
            C2970Fn.a aVar = (C2970Fn.a) obj;
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
        return "In{packet=" + this.a + ", jpegQuality=" + this.b + "}";
    }
}
