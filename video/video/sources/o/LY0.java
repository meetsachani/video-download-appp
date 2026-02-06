package o;

/* loaded from: classes4.dex */
public class LY0 extends C4816Yl implements InterfaceC4240Sm1 {
    public boolean c1;
    public boolean d1;

    public LY0() {
        this((String) null, (C80[]) null);
    }

    @Override // o.InterfaceC4240Sm1
    public void Q(String str) {
        g(new C80(str));
    }

    @Override // o.InterfaceC4240Sm1
    public void a(boolean z) {
        this.c1 = z;
    }

    public void g(C80 c80) {
        if (c80.b() != null) {
            if (!l()) {
                if (this.a1.get(c80.b()) != null) {
                    return;
                }
                C80[] e = e();
                C80[] c80Arr = new C80[e.length + 1];
                System.arraycopy(e, 0, c80Arr, 0, e.length);
                c80Arr[e.length] = c80;
                f(c80Arr);
                return;
            }
            throw new IllegalStateException("DynaClass is currently restricted. No new properties can be added.");
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    public boolean h(String str) {
        if (str != null) {
            if (this.a1.get(str) == null) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    @Override // o.InterfaceC4240Sm1
    public void i(String str, Class<?> cls, boolean z, boolean z2) {
        throw new UnsupportedOperationException("readable/writable properties not supported");
    }

    public boolean j() {
        return this.d1;
    }

    public void k(boolean z) {
        this.d1 = z;
    }

    @Override // o.InterfaceC4240Sm1
    public boolean l() {
        return this.c1;
    }

    @Override // o.InterfaceC4240Sm1
    public void n(String str, Class<?> cls) {
        if (cls == null) {
            Q(str);
        } else {
            g(new C80(str, cls));
        }
    }

    @Override // o.C4816Yl, o.B80
    public C80 p(String str) {
        if (str != null) {
            C80 c80 = this.a1.get(str);
            if (c80 == null && !j() && !l()) {
                return new C80(str);
            }
            return c80;
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    @Override // o.InterfaceC4240Sm1
    public void remove(String str) {
        if (str != null) {
            if (!l()) {
                if (this.a1.get(str) == null) {
                    return;
                }
                C80[] e = e();
                C80[] c80Arr = new C80[e.length - 1];
                int i = 0;
                for (int i2 = 0; i2 < e.length; i2++) {
                    if (!str.equals(e[i2].b())) {
                        c80Arr[i] = e[i2];
                        i++;
                    }
                }
                f(c80Arr);
                return;
            }
            throw new IllegalStateException("DynaClass is currently restricted. No properties can be removed.");
        }
        throw new IllegalArgumentException("Property name is missing.");
    }

    public LY0(String str) {
        this(str, (C80[]) null);
    }

    public LY0(String str, Class<?> cls) {
        this(str, cls, null);
    }

    public LY0(String str, C80[] c80Arr) {
        this(str, KY0.class, c80Arr);
    }

    public LY0(String str, Class<?> cls, C80[] c80Arr) {
        super(str, cls, c80Arr);
        this.d1 = false;
    }
}
