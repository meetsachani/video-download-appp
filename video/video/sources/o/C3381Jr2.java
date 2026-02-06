package o;

@Deprecated
/* renamed from: o.Jr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3381Jr2 {
    public final int a;
    public final C10955yR1[] b;
    public final InterfaceC6859hi0[] c;
    public final C3773Nr2 d;
    @InterfaceC11300zs1
    public final Object e;

    @Deprecated
    public C3381Jr2(C10955yR1[] c10955yR1Arr, InterfaceC6859hi0[] interfaceC6859hi0Arr, @InterfaceC11300zs1 Object obj) {
        this(c10955yR1Arr, interfaceC6859hi0Arr, C3773Nr2.Y, obj);
    }

    public boolean a(@InterfaceC11300zs1 C3381Jr2 c3381Jr2) {
        if (c3381Jr2 == null || c3381Jr2.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!b(c3381Jr2, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@InterfaceC11300zs1 C3381Jr2 c3381Jr2, int i) {
        if (c3381Jr2 == null || !TD2.g(this.b[i], c3381Jr2.b[i]) || !TD2.g(this.c[i], c3381Jr2.c[i])) {
            return false;
        }
        return true;
    }

    public boolean c(int i) {
        if (this.b[i] != null) {
            return true;
        }
        return false;
    }

    public C3381Jr2(C10955yR1[] c10955yR1Arr, InterfaceC6859hi0[] interfaceC6859hi0Arr, C3773Nr2 c3773Nr2, @InterfaceC11300zs1 Object obj) {
        this.b = c10955yR1Arr;
        this.c = (InterfaceC6859hi0[]) interfaceC6859hi0Arr.clone();
        this.d = c3773Nr2;
        this.e = obj;
        this.a = c10955yR1Arr.length;
    }
}
