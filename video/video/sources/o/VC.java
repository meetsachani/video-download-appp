package o;

import android.graphics.RectF;
import java.util.Arrays;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class VC implements YP {
    public final float a;

    public VC(float f) {
        this.a = f;
    }

    @InterfaceC5670cr1
    public static VC b(@InterfaceC5670cr1 M m) {
        return new VC(m.b());
    }

    public static float c(@InterfaceC5670cr1 RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // o.YP
    public float a(@InterfaceC5670cr1 RectF rectF) {
        return C9293rd1.d(this.a, 0.0f, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VC) && this.a == ((VC) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
