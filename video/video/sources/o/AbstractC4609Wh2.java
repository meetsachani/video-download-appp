package o;

import android.util.Size;

/* renamed from: o.Wh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4609Wh2 {
    public static final long a = 0;

    /* renamed from: o.Wh2$a */
    /* loaded from: classes.dex */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);
        
        public final int X;

        a(int i) {
            this.X = i;
        }

        public int g() {
            return this.X;
        }
    }

    /* renamed from: o.Wh2$b */
    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static AbstractC4609Wh2 a(b bVar, a aVar) {
        return new C10287vj(bVar, aVar, 0L);
    }

    public static AbstractC4609Wh2 b(b bVar, a aVar, long j) {
        return new C10287vj(bVar, aVar, j);
    }

    public static b e(int i) {
        if (i == 35) {
            return b.YUV;
        }
        if (i == 256) {
            return b.JPEG;
        }
        if (i == 32) {
            return b.RAW;
        }
        return b.PRIV;
    }

    public static AbstractC4609Wh2 h(int i, int i2, Size size, AbstractC3149Hi2 abstractC3149Hi2) {
        b e = e(i2);
        a aVar = a.NOT_SUPPORT;
        int a2 = W82.a(size);
        if (i == 1) {
            if (a2 <= W82.a(abstractC3149Hi2.i(i2))) {
                aVar = a.s720p;
            } else if (a2 <= W82.a(abstractC3149Hi2.g(i2))) {
                aVar = a.s1440p;
            }
        } else if (a2 <= W82.a(abstractC3149Hi2.b())) {
            aVar = a.VGA;
        } else if (a2 <= W82.a(abstractC3149Hi2.e())) {
            aVar = a.PREVIEW;
        } else if (a2 <= W82.a(abstractC3149Hi2.f())) {
            aVar = a.RECORD;
        } else if (a2 <= W82.a(abstractC3149Hi2.c(i2))) {
            aVar = a.MAXIMUM;
        } else {
            Size k = abstractC3149Hi2.k(i2);
            if (k != null && a2 <= W82.a(k)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(e, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(AbstractC4609Wh2 abstractC4609Wh2) {
        b d = abstractC4609Wh2.d();
        if (abstractC4609Wh2.c().g() <= c().g() && d == d()) {
            return true;
        }
        return false;
    }
}
