package o;

import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.pl */
/* loaded from: classes4.dex */
public abstract class AbstractC8831pl implements InterfaceC8902q21 {
    public final J31 a;
    public Object b;
    public boolean c;
    public Locale d;
    public String e;
    public boolean f;

    public AbstractC8831pl(Locale locale, String str) {
        this(null, locale, str, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T c(Class<T> cls, Object obj) {
        if (cls == null) {
            return obj;
        }
        if (obj == 0) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new WM("Unsupported target type: " + cls);
    }

    @Override // o.InterfaceC8902q21
    public <T> T a(Class<T> cls, Object obj, String str) {
        Class<T> q = C6282fN.q(cls);
        if (obj == null) {
            if (this.c) {
                return (T) f(q);
            }
            this.a.a("Null value specified for conversion, returing null");
            return null;
        }
        try {
            if (str != null) {
                return (T) c(q, g(obj, str));
            }
            return (T) c(q, g(obj, this.e));
        } catch (Exception e) {
            if (this.c) {
                return (T) f(q);
            }
            if (e instanceof WM) {
                throw ((WM) e);
            }
            throw new WM(e);
        }
    }

    @Override // o.InterfaceC7507kN
    public <T> T b(Class<T> cls, Object obj) {
        return (T) a(cls, obj, null);
    }

    public Object d(Object obj) {
        return e(obj, null);
    }

    public Object e(Object obj, String str) {
        return a(null, obj, str);
    }

    public final <T> T f(Class<T> cls) {
        return (T) c(cls, this.b);
    }

    public abstract Object g(Object obj, String str) throws ParseException;

    public AbstractC8831pl(Locale locale, String str, boolean z) {
        this(null, locale, str, false, z);
    }

    public AbstractC8831pl(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public AbstractC8831pl(Object obj, Locale locale, String str, boolean z) {
        this(obj, locale, str, true, z);
    }

    public AbstractC8831pl(Object obj, Locale locale, String str, boolean z, boolean z2) {
        this.a = U31.q(AbstractC8831pl.class);
        this.b = null;
        this.c = false;
        this.d = Locale.getDefault();
        this.e = null;
        this.f = false;
        if (z) {
            this.b = obj;
            this.c = true;
        }
        if (locale != null) {
            this.d = locale;
        }
        this.e = str;
        this.f = z2;
    }
}
