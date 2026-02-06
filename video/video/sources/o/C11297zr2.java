package o;

import java.util.Arrays;

@Deprecated
/* renamed from: o.zr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11297zr2 {
    public final int a;
    public final InterfaceC11054yr2[] b;
    public int c;

    public C11297zr2(InterfaceC11054yr2... interfaceC11054yr2Arr) {
        this.b = interfaceC11054yr2Arr;
        this.a = interfaceC11054yr2Arr.length;
    }

    @InterfaceC11300zs1
    public InterfaceC11054yr2 a(int i) {
        return this.b[i];
    }

    public InterfaceC11054yr2[] b() {
        return (InterfaceC11054yr2[]) this.b.clone();
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11297zr2.class == obj.getClass()) {
            return Arrays.equals(this.b, ((C11297zr2) obj).b);
        }
        return false;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
