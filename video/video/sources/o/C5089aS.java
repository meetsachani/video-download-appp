package o;

import java.io.Reader;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.aS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5089aS<T> {
    public final Reader b;
    public final C3968Ps c;
    public boolean g;
    public InterfaceC7449k81<? extends T> a = null;
    public InterfaceC5332bS d = null;
    public OR e = null;
    public EnumC4456Us f = null;
    public Integer h = null;
    public Boolean i = null;
    public Character j = null;
    public Character k = null;
    public Character l = null;
    public Boolean m = null;
    public Boolean n = null;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f692o = null;
    public Boolean p = Boolean.TRUE;
    public Class<? extends T> q = null;
    public Integer r = null;
    public boolean s = true;
    public boolean t = false;
    public Locale u = Locale.getDefault();
    public final List<InterfaceC3944Pm<T>> v = new LinkedList();
    public final InterfaceC7664l11<Class<?>, Field> w = new C11242ze();
    public String x = "";

    public C5089aS(Reader reader) {
        if (reader != null) {
            this.b = reader;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k).getString("reader.null"));
    }

    public ZR<T> a() throws IllegalStateException {
        if (this.a == null && this.q == null) {
            throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.u).getString("strategy.type.missing"));
        }
        ZR<T> zr = new ZR<>();
        C3968Ps c3968Ps = this.c;
        if (c3968Ps != null) {
            zr.D(c3968Ps);
        } else {
            zr.D(c(b()));
        }
        OR or = this.e;
        if (or != null) {
            zr.G(or);
        } else {
            zr.M(this.p.booleanValue());
        }
        zr.L(this.s);
        InterfaceC5332bS interfaceC5332bS = this.d;
        if (interfaceC5332bS != null) {
            zr.H(interfaceC5332bS);
        }
        zr.Q(this.v);
        if (this.a == null) {
            this.a = C3297Iv1.d(this.q, this.u, this.x);
        }
        if (!this.w.isEmpty()) {
            this.a.a(this.w);
        }
        zr.K(this.a);
        zr.F(this.u);
        zr.J(this.t);
        return zr;
    }

    public final C3675Ms b() {
        C3774Ns c3774Ns = new C3774Ns();
        EnumC4456Us enumC4456Us = this.f;
        if (enumC4456Us != null) {
            c3774Ns.k(enumC4456Us);
        }
        Character ch = this.j;
        if (ch != null) {
            c3774Ns.o(ch.charValue());
        }
        Character ch2 = this.k;
        if (ch2 != null) {
            c3774Ns.n(ch2.charValue());
        }
        Character ch3 = this.l;
        if (ch3 != null) {
            c3774Ns.j(ch3.charValue());
        }
        Boolean bool = this.m;
        if (bool != null) {
            c3774Ns.p(bool.booleanValue());
        }
        Boolean bool2 = this.n;
        if (bool2 != null) {
            c3774Ns.l(bool2.booleanValue());
        }
        Boolean bool3 = this.f692o;
        if (bool3 != null) {
            c3774Ns.m(bool3.booleanValue());
        }
        c3774Ns.i(this.u);
        return c3774Ns.a();
    }

    public final C3968Ps c(C3675Ms c3675Ms) {
        C4162Rs c4162Rs = new C4162Rs(this.b);
        c4162Rs.m(c3675Ms);
        c4162Rs.p(this.g);
        Boolean bool = this.i;
        if (bool != null) {
            c4162Rs.v(bool.booleanValue());
        }
        Integer num = this.h;
        if (num != null) {
            c4162Rs.u(num.intValue());
        }
        Integer num2 = this.r;
        if (num2 != null) {
            c4162Rs.r(num2.intValue());
        }
        c4162Rs.n(this.u);
        return c4162Rs.a();
    }

    public C5089aS<T> d(Locale locale) {
        this.u = (Locale) C11304zt1.t(locale, Locale.getDefault());
        return this;
    }

    public C5089aS<T> e(char c) {
        this.l = Character.valueOf(c);
        return this;
    }

    public C5089aS<T> f(OR or) {
        if (or != null) {
            this.e = or;
        }
        return this;
    }

    public C5089aS<T> g(EnumC4456Us enumC4456Us) {
        this.f = enumC4456Us;
        return this;
    }

    public C5089aS<T> h(InterfaceC5332bS interfaceC5332bS) {
        this.d = interfaceC5332bS;
        return this;
    }

    public C5089aS<T> i(boolean z) {
        this.t = z;
        return this;
    }

    public C5089aS<T> j(Class<?> cls, Field field) throws IllegalArgumentException {
        if (cls != null && field != null && field.getDeclaringClass().isAssignableFrom(cls)) {
            this.w.put(cls, field);
            return this;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k, this.u).getString("ignore.field.inconsistent"));
    }

    public C5089aS<T> k(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public C5089aS<T> l(boolean z) {
        this.f692o = Boolean.valueOf(z);
        return this;
    }

    public C5089aS<T> m(boolean z) {
        this.g = z;
        return this;
    }

    public C5089aS<T> n(InterfaceC7449k81<? extends T> interfaceC7449k81) {
        this.a = interfaceC7449k81;
        return this;
    }

    public C5089aS<T> o(int i) {
        this.r = Integer.valueOf(i);
        return this;
    }

    public C5089aS<T> p(boolean z) {
        this.s = z;
        return this;
    }

    public C5089aS<T> q(String str) {
        this.x = str;
        return this;
    }

    public C5089aS<T> r(char c) {
        this.k = Character.valueOf(c);
        return this;
    }

    public C5089aS<T> s(char c) {
        this.j = Character.valueOf(c);
        return this;
    }

    public C5089aS<T> t(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public C5089aS<T> u(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public C5089aS<T> v(boolean z) {
        this.p = Boolean.valueOf(z);
        return this;
    }

    public C5089aS<T> w(Class<? extends T> cls) {
        this.q = cls;
        return this;
    }

    public C5089aS<T> x(InterfaceC3944Pm<T> interfaceC3944Pm) {
        if (interfaceC3944Pm != null) {
            this.v.add(interfaceC3944Pm);
        }
        return this;
    }

    public C5089aS<T> y(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public C5089aS(C3968Ps c3968Ps) {
        if (c3968Ps != null) {
            this.b = null;
            this.c = c3968Ps;
            return;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k).getString("reader.null"));
    }
}
