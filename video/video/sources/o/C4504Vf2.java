package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Vf2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4504Vf2 implements InterfaceC3344Ji1 {
    public final WJ1 a;
    public final boolean b;
    public final int[] c;
    public final C5415bo0[] d;
    public final InterfaceC3540Li1 e;

    public C4504Vf2(WJ1 wj1, boolean z, int[] iArr, C5415bo0[] c5415bo0Arr, Object obj) {
        this.a = wj1;
        this.b = z;
        this.c = iArr;
        this.d = c5415bo0Arr;
        this.e = (InterfaceC3540Li1) C9740tS0.e(obj, "defaultInstance");
    }

    public static a e() {
        return new a();
    }

    public static a g(int i) {
        return new a(i);
    }

    @Override // o.InterfaceC3344Ji1
    public boolean a() {
        return this.b;
    }

    @Override // o.InterfaceC3344Ji1
    public InterfaceC3540Li1 b() {
        return this.e;
    }

    public int[] c() {
        return this.c;
    }

    public C5415bo0[] d() {
        return this.d;
    }

    @Override // o.InterfaceC3344Ji1
    public WJ1 f() {
        return this.a;
    }

    /* renamed from: o.Vf2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<C5415bo0> a;
        public WJ1 b;
        public boolean c;
        public boolean d;
        public int[] e;
        public Object f;

        public a() {
            this.e = null;
            this.a = new ArrayList();
        }

        public C4504Vf2 a() {
            if (!this.c) {
                if (this.b != null) {
                    this.c = true;
                    Collections.sort(this.a);
                    return new C4504Vf2(this.b, this.d, this.e, (C5415bo0[]) this.a.toArray(new C5415bo0[0]), this.f);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void b(int[] iArr) {
            this.e = iArr;
        }

        public void c(Object obj) {
            this.f = obj;
        }

        public void d(C5415bo0 c5415bo0) {
            if (!this.c) {
                this.a.add(c5415bo0);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void e(boolean z) {
            this.d = z;
        }

        public void f(WJ1 wj1) {
            this.b = (WJ1) C9740tS0.e(wj1, "syntax");
        }

        public a(int i) {
            this.e = null;
            this.a = new ArrayList(i);
        }
    }
}
