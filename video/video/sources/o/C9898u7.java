package o;

import android.graphics.RectF;
import java.util.Arrays;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.u7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9898u7 implements YP {
    public final YP a;
    public final float b;

    public C9898u7(float f, @InterfaceC5670cr1 YP yp) {
        while (yp instanceof C9898u7) {
            yp = ((C9898u7) yp).a;
            f += ((C9898u7) yp).b;
        }
        this.a = yp;
        this.b = f;
    }

    @Override // o.YP
    public float a(@InterfaceC5670cr1 RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9898u7)) {
            return false;
        }
        C9898u7 c9898u7 = (C9898u7) obj;
        if (this.a.equals(c9898u7.a) && this.b == c9898u7.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
