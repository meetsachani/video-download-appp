package o;

import android.content.res.Resources;
import o.C8587ok2;

/* renamed from: o.ok2 */
/* loaded from: classes.dex */
public final class C8587ok2 {
    public static final a e = new a(null);
    public final int a;
    public final int b;
    public final int c;
    public final HA0<Resources, Boolean> d;

    /* renamed from: o.ok2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ boolean a(Resources resources) {
            return g(resources);
        }

        public static /* synthetic */ boolean b(Resources resources) {
            return k(resources);
        }

        public static /* synthetic */ boolean c(Resources resources) {
            return i(resources);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C8587ok2 f(a aVar, int i, int i2, HA0 ha0, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                ha0 = new HA0() { // from class: o.nk2
                    @Override // o.HA0
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(C8587ok2.a.a((Resources) obj2));
                    }
                };
            }
            return aVar.e(i, i2, ha0);
        }

        public static final boolean g(Resources resources) {
            C6562gT0.p(resources, "resources");
            if ((resources.getConfiguration().uiMode & 48) == 32) {
                return true;
            }
            return false;
        }

        public static final boolean i(Resources resources) {
            C6562gT0.p(resources, "<unused var>");
            return true;
        }

        public static final boolean k(Resources resources) {
            C6562gT0.p(resources, "<unused var>");
            return false;
        }

        @InterfaceC9511sW0
        public final C8587ok2 d(int i, int i2) {
            return f(this, i, i2, null, 4, null);
        }

        @InterfaceC9511sW0
        public final C8587ok2 e(int i, int i2, HA0<? super Resources, Boolean> ha0) {
            C6562gT0.p(ha0, "detectDarkMode");
            return new C8587ok2(i, i2, 0, ha0, null);
        }

        @InterfaceC9511sW0
        public final C8587ok2 h(int i) {
            return new C8587ok2(i, i, 2, new HA0() { // from class: o.mk2
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C8587ok2.a.c((Resources) obj));
                }
            }, null);
        }

        @InterfaceC9511sW0
        public final C8587ok2 j(int i, int i2) {
            return new C8587ok2(i, i2, 1, new HA0() { // from class: o.lk2
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C8587ok2.a.b((Resources) obj));
                }
            }, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C8587ok2(int i, int i2, int i3, HA0 ha0, C9516sY c9516sY) {
        this(i, i2, i3, ha0);
    }

    @InterfaceC9511sW0
    public static final C8587ok2 a(int i, int i2) {
        return e.d(i, i2);
    }

    @InterfaceC9511sW0
    public static final C8587ok2 b(int i, int i2, HA0<? super Resources, Boolean> ha0) {
        return e.e(i, i2, ha0);
    }

    @InterfaceC9511sW0
    public static final C8587ok2 c(int i) {
        return e.h(i);
    }

    @InterfaceC9511sW0
    public static final C8587ok2 i(int i, int i2) {
        return e.j(i, i2);
    }

    public final int d() {
        return this.b;
    }

    public final HA0<Resources, Boolean> e() {
        return this.d;
    }

    public final int f() {
        return this.c;
    }

    public final int g(boolean z) {
        if (z) {
            return this.b;
        }
        return this.a;
    }

    public final int h(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        if (z) {
            return this.b;
        }
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8587ok2(int i, int i2, int i3, HA0<? super Resources, Boolean> ha0) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ha0;
    }
}
