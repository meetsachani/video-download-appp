package o;

import android.graphics.RectF;
import java.util.Arrays;
import o.HT1;

/* loaded from: classes3.dex */
public final class YQ1 implements YP {
    public final float a;

    public YQ1(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.a = f;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static YQ1 b(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 YP yp) {
        if (yp instanceof YQ1) {
            return (YQ1) yp;
        }
        return new YQ1(yp.a(rectF) / c(rectF));
    }

    private static float c(@InterfaceC5670cr1 RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // o.YP
    public float a(@InterfaceC5670cr1 RectF rectF) {
        return this.a * c(rectF);
    }

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public float d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof YQ1) && this.a == ((YQ1) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public String toString() {
        return ((int) (d() * 100.0f)) + "%";
    }
}
