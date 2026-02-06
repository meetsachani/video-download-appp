package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import com.bumptech.glide.a;
import com.bumptech.glide.d;
import com.bumptech.glide.manager.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AbstractC10819xt2;
import o.AbstractC7322jd;
import o.C10175vF1;
import o.C10226vS0;
import o.C2531Be;
import o.C4490Vc0;
import o.C5171ao;
import o.C5735d71;
import o.C7102ii1;
import o.C8520oS1;
import o.C9273rY;
import o.InterfaceC2727De;
import o.InterfaceC4931Zn;
import o.InterfaceC5877di1;
import o.InterfaceC6270fK;
import o.InterfaceC7529kS1;
import o.U61;
import o.UD0;
import o.W61;
import o.WD0;
import o.Y30;

/* loaded from: classes.dex */
public final class b {
    public C4490Vc0 c;
    public InterfaceC4931Zn d;
    public InterfaceC2727De e;
    public InterfaceC5877di1 f;
    public UD0 g;
    public UD0 h;
    public Y30.a i;
    public C7102ii1 j;
    public InterfaceC6270fK k;
    public b.InterfaceC0066b n;

    /* renamed from: o  reason: collision with root package name */
    public UD0 f69o;
    public boolean p;
    public List<InterfaceC7529kS1<Object>> q;
    public final Map<Class<?>, AbstractC10819xt2<?, ?>> a = new C2531Be();
    public final d.a b = new d.a();
    public int l = 4;
    public a.InterfaceC0060a m = new a();

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0060a {
        public a() {
        }

        @Override // com.bumptech.glide.a.InterfaceC0060a
        public C8520oS1 build() {
            return new C8520oS1();
        }
    }

    /* renamed from: com.bumptech.glide.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0061b implements a.InterfaceC0060a {
        public final /* synthetic */ C8520oS1 a;

        public C0061b(C8520oS1 c8520oS1) {
            this.a = c8520oS1;
        }

        @Override // com.bumptech.glide.a.InterfaceC0060a
        public C8520oS1 build() {
            C8520oS1 c8520oS1 = this.a;
            if (c8520oS1 != null) {
                return c8520oS1;
            }
            return new C8520oS1();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d.b {
    }

    /* loaded from: classes.dex */
    public static final class d implements d.b {
    }

    /* loaded from: classes.dex */
    public static final class e implements d.b {
        public final int a;

        public e(int i) {
            this.a = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d.b {
    }

    /* loaded from: classes.dex */
    public static final class g implements d.b {
    }

    public b A(boolean z) {
        this.b.d(new g(), z);
        return this;
    }

    public b a(InterfaceC7529kS1<Object> interfaceC7529kS1) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(interfaceC7529kS1);
        return this;
    }

    public com.bumptech.glide.a b(Context context, List<WD0> list, AbstractC7322jd abstractC7322jd) {
        if (this.g == null) {
            this.g = UD0.p();
        }
        if (this.h == null) {
            this.h = UD0.l();
        }
        if (this.f69o == null) {
            this.f69o = UD0.i();
        }
        if (this.j == null) {
            this.j = new C7102ii1.a(context).a();
        }
        if (this.k == null) {
            this.k = new C9273rY();
        }
        if (this.d == null) {
            int b = this.j.b();
            if (b > 0) {
                this.d = new W61(b);
            } else {
                this.d = new C5171ao();
            }
        }
        if (this.e == null) {
            this.e = new U61(this.j.a());
        }
        if (this.f == null) {
            this.f = new C5735d71(this.j.d());
        }
        if (this.i == null) {
            this.i = new C10226vS0(context);
        }
        if (this.c == null) {
            this.c = new C4490Vc0(this.f, this.i, this.h, this.g, UD0.s(), this.f69o, this.p);
        }
        List<InterfaceC7529kS1<Object>> list2 = this.q;
        if (list2 == null) {
            this.q = Collections.EMPTY_LIST;
        } else {
            this.q = Collections.unmodifiableList(list2);
        }
        com.bumptech.glide.d c2 = this.b.c();
        return new com.bumptech.glide.a(context, this.c, this.f, this.d, this.e, new com.bumptech.glide.manager.b(this.n), this.k, this.l, this.m, this.a, this.q, list, abstractC7322jd, c2);
    }

    public b c(UD0 ud0) {
        this.f69o = ud0;
        return this;
    }

    public b d(InterfaceC2727De interfaceC2727De) {
        this.e = interfaceC2727De;
        return this;
    }

    public b e(InterfaceC4931Zn interfaceC4931Zn) {
        this.d = interfaceC4931Zn;
        return this;
    }

    public b f(InterfaceC6270fK interfaceC6270fK) {
        this.k = interfaceC6270fK;
        return this;
    }

    public b g(a.InterfaceC0060a interfaceC0060a) {
        this.m = (a.InterfaceC0060a) C10175vF1.e(interfaceC0060a);
        return this;
    }

    public b h(C8520oS1 c8520oS1) {
        return g(new C0061b(c8520oS1));
    }

    public <T> b i(Class<T> cls, AbstractC10819xt2<?, T> abstractC10819xt2) {
        this.a.put(cls, abstractC10819xt2);
        return this;
    }

    @Deprecated
    public b j(boolean z) {
        return this;
    }

    public b k(Y30.a aVar) {
        this.i = aVar;
        return this;
    }

    public b l(UD0 ud0) {
        this.h = ud0;
        return this;
    }

    @Deprecated
    public b m(boolean z) {
        return this;
    }

    public b n(C4490Vc0 c4490Vc0) {
        this.c = c4490Vc0;
        return this;
    }

    public b o(boolean z) {
        boolean z2;
        d.a aVar = this.b;
        c cVar = new c();
        if (z && Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.d(cVar, z2);
        return this;
    }

    public b p(boolean z) {
        this.p = z;
        return this;
    }

    public b q(int i) {
        if (i >= 2 && i <= 6) {
            this.l = i;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }

    public b r(boolean z) {
        this.b.d(new d(), z);
        return this;
    }

    public b s(InterfaceC5877di1 interfaceC5877di1) {
        this.f = interfaceC5877di1;
        return this;
    }

    public b t(C7102ii1.a aVar) {
        return u(aVar.a());
    }

    public b u(C7102ii1 c7102ii1) {
        this.j = c7102ii1;
        return this;
    }

    public b v(boolean z) {
        this.b.d(new f(), z);
        return this;
    }

    @Deprecated
    public b w(boolean z) {
        return this;
    }

    public void x(b.InterfaceC0066b interfaceC0066b) {
        this.n = interfaceC0066b;
    }

    @Deprecated
    public b y(UD0 ud0) {
        return z(ud0);
    }

    public b z(UD0 ud0) {
        this.g = ud0;
        return this;
    }
}
