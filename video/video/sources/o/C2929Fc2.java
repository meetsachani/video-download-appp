package o;

import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.Fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2929Fc2<T> {
    public char a;
    public char b;
    public char c;
    public String d;
    public InterfaceC7449k81<T> e;
    public final Writer f;
    public final VI0 g;
    public OR h;
    public boolean i;
    public Locale j;
    public boolean k;
    public final InterfaceC7664l11<Class<?>, Field> l;
    public String m;

    public C2929Fc2(Writer writer) {
        this.a = ',';
        this.b = '\"';
        this.c = '\"';
        this.d = "\n";
        this.e = null;
        this.h = new C9051qf0();
        this.i = true;
        this.j = Locale.getDefault();
        this.k = true;
        this.l = new C11242ze();
        this.m = "";
        this.f = writer;
        this.g = null;
    }

    public C2820Ec2<T> a() {
        C2820Ec2<T> c2820Ec2;
        Writer writer = this.f;
        if (writer != null) {
            c2820Ec2 = new C2820Ec2<>(this.c, this.d, this.e, this.b, this.a, this.h, writer, this.k, this.l, this.m);
        } else {
            c2820Ec2 = new C2820Ec2<>(this.e, this.h, this.k, this.g, this.l, this.m);
        }
        c2820Ec2.f(this.i);
        c2820Ec2.e(this.j);
        return c2820Ec2;
    }

    public C2929Fc2<T> b(boolean z) {
        this.k = z;
        return this;
    }

    public C2929Fc2<T> c(Locale locale) {
        this.j = (Locale) C11304zt1.t(locale, Locale.getDefault());
        return this;
    }

    public C2929Fc2<T> d(char c) {
        this.c = c;
        return this;
    }

    public C2929Fc2<T> e(OR or) {
        if (or != null) {
            this.h = or;
        }
        return this;
    }

    public C2929Fc2<T> f(Class<?> cls, Field field) throws IllegalArgumentException {
        if (cls != null && field != null && field.getDeclaringClass().isAssignableFrom(cls)) {
            this.l.put(cls, field);
            return this;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k, this.j).getString("ignore.field.inconsistent"));
    }

    public C2929Fc2<T> g(String str) {
        this.d = str;
        return this;
    }

    public C2929Fc2<T> h(InterfaceC7449k81<T> interfaceC7449k81) {
        this.e = interfaceC7449k81;
        return this;
    }

    public C2929Fc2<T> i(boolean z) {
        this.i = z;
        return this;
    }

    public C2929Fc2<T> j(String str) {
        this.m = str;
        return this;
    }

    public C2929Fc2<T> k(char c) {
        this.b = c;
        return this;
    }

    public C2929Fc2<T> l(char c) {
        this.a = c;
        return this;
    }

    public C2929Fc2<T> m(boolean z) {
        if (z) {
            this.h = new C9051qf0();
            return this;
        }
        this.h = new C8565of0();
        return this;
    }

    public C2929Fc2(VI0 vi0) {
        this.a = ',';
        this.b = '\"';
        this.c = '\"';
        this.d = "\n";
        this.e = null;
        this.h = new C9051qf0();
        this.i = true;
        this.j = Locale.getDefault();
        this.k = true;
        this.l = new C11242ze();
        this.m = "";
        this.f = null;
        this.g = vi0;
    }
}
