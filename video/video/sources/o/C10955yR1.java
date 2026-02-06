package o;

@Deprecated
/* renamed from: o.yR1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10955yR1 {
    public static final C10955yR1 b = new C10955yR1(false);
    public final boolean a;

    public C10955yR1(boolean z) {
        this.a = z;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10955yR1.class == obj.getClass() && this.a == ((C10955yR1) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
