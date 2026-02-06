package o;

import android.graphics.Rect;
import android.util.Size;
import o.TS1;

/* renamed from: o.mj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8093mj extends TS1.a {
    public final Size a;
    public final Rect b;
    public final int c;

    /* renamed from: o.mj$b */
    /* loaded from: classes.dex */
    public static final class b extends TS1.a.AbstractC0229a {
        public Size a;
        public Rect b;
        public Integer c;

        @Override // o.TS1.a.AbstractC0229a
        public TS1.a a() {
            String str = "";
            if (this.a == null) {
                str = " resolution";
            }
            if (this.b == null) {
                str = str + " cropRect";
            }
            if (this.c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C8093mj(this.a, this.b, this.c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.TS1.a.AbstractC0229a
        public TS1.a.AbstractC0229a b(Rect rect) {
            if (rect != null) {
                this.b = rect;
                return this;
            }
            throw new NullPointerException("Null cropRect");
        }

        @Override // o.TS1.a.AbstractC0229a
        public TS1.a.AbstractC0229a c(Size size) {
            if (size != null) {
                this.a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        @Override // o.TS1.a.AbstractC0229a
        public TS1.a.AbstractC0229a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    @Override // o.TS1.a
    public Rect a() {
        return this.b;
    }

    @Override // o.TS1.a
    public Size b() {
        return this.a;
    }

    @Override // o.TS1.a
    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TS1.a) {
            TS1.a aVar = (TS1.a) obj;
            if (this.a.equals(aVar.b()) && this.b.equals(aVar.a()) && this.c == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.a + ", cropRect=" + this.b + ", rotationDegrees=" + this.c + "}";
    }

    public C8093mj(Size size, Rect rect, int i) {
        this.a = size;
        this.b = rect;
        this.c = i;
    }
}
