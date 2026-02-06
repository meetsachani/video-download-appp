package o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class M implements YP {
    public final float a;

    public M(float f) {
        this.a = f;
    }

    @Override // o.YP
    public float a(@InterfaceC5670cr1 RectF rectF) {
        return this.a;
    }

    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && this.a == ((M) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public String toString() {
        return b() + "px";
    }
}
