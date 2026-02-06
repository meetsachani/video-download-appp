package o;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

/* loaded from: classes3.dex */
public abstract class V<T, I> implements InterfaceC8348nm<T, I> {
    public Class<?> a;
    public Field b;
    public boolean c;
    public Locale d;
    public ER e;
    public C4631Wn0<Object> f;

    public V() {
        this.c = false;
        this.d = Locale.getDefault();
    }

    public void a(Object obj, Object obj2, String str) throws JR {
        if (obj2 != null) {
            try {
                this.f.j(obj, obj2);
            } catch (IllegalAccessException e) {
                e = e;
                C8270nR c8270nR = new C8270nR(obj, this.b, e.getLocalizedMessage());
                c8270nR.initCause(e);
                throw c8270nR;
            } catch (IllegalArgumentException e2) {
                JR jr = new JR(obj2, this.b.getType());
                jr.initCause(e2);
                throw jr;
            } catch (InvocationTargetException e3) {
                e = e3;
                C8270nR c8270nR2 = new C8270nR(obj, this.b, e.getLocalizedMessage());
                c8270nR2.initCause(e);
                throw c8270nR2;
            }
        }
    }

    public abstract Object b(String str) throws JR, DR;

    public String c(Object obj) throws JR, XR {
        return Objects.toString(obj, "");
    }

    @Override // o.InterfaceC8348nm
    public void d(Locale locale) {
        Locale locale2 = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.d = locale2;
        ER er = this.e;
        if (er != null) {
            er.d(locale2);
        }
    }

    @Override // o.InterfaceC8348nm
    public void e(Class<?> cls) {
        this.a = cls;
    }

    @Override // o.InterfaceC8348nm
    public void f(Field field) {
        this.b = field;
        this.f = new C4631Wn0<>(field);
    }

    @Override // o.InterfaceC8348nm
    public final void g(Object obj, String str, String str2) throws JR, XR, DR, C5817dS {
        if (this.c && C4500Ve2.H0(str)) {
            throw new XR(obj.getClass(), this.b, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("required.field.empty"), this.b.getName()));
        }
        for (TE1 te1 : (TE1[]) this.b.getAnnotationsByType(TE1.class)) {
            str = p(te1, str);
        }
        for (UE1 ue1 : (UE1[]) this.b.getAnnotationsByType(UE1.class)) {
            q(ue1, str);
        }
        a(obj, b(str), str2);
    }

    @Override // o.InterfaceC8348nm
    public Class<?> getType() {
        return this.a;
    }

    @Override // o.InterfaceC8348nm
    public final String[] h(Object obj, I i) throws JR, XR {
        Object obj2;
        Class<?> cls = null;
        if (obj != null) {
            obj2 = m(obj);
        } else {
            obj2 = null;
        }
        if (this.c && (obj == null || o(obj2))) {
            throw new XR(this.a, this.b, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("required.field.empty"), this.b.getName()));
        }
        Object[] k = k(obj2, i);
        String[] strArr = new String[k.length];
        for (int i2 = 0; i2 < k.length; i2++) {
            try {
                strArr[i2] = c(k[i2]);
            } catch (JR e) {
                JR jr = new JR(obj, this.b.getType(), e.getMessage());
                jr.initCause(e.getCause());
                throw jr;
            } catch (XR e2) {
                if (obj != null) {
                    cls = obj.getClass();
                }
                XR xr = new XR(cls, this.b, e2.getMessage());
                xr.initCause(e2.getCause());
                throw xr;
            }
        }
        return strArr;
    }

    @Override // o.InterfaceC8348nm
    public Field i() {
        return this.b;
    }

    @Override // o.InterfaceC8348nm
    public void j(boolean z) {
        this.c = z;
    }

    @Override // o.InterfaceC8348nm
    public Object[] k(Object obj, I i) throws JR {
        return new Object[]{obj};
    }

    @Override // o.InterfaceC8348nm
    public boolean l() {
        return this.c;
    }

    @Override // o.InterfaceC8348nm
    public Object m(Object obj) {
        try {
            return this.f.i(obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C8270nR c8270nR = new C8270nR(obj, this.b, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("error.introspecting.field"), this.b.getName(), obj.getClass().toString()));
            c8270nR.initCause(e);
            throw c8270nR;
        }
    }

    @Override // o.InterfaceC8348nm
    public Locale n() {
        return this.d;
    }

    public boolean o(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    public final String p(TE1 te1, String str) throws C5817dS {
        try {
            InterfaceC3133He2 newInstance = te1.processor().newInstance();
            newInstance.b(te1.paramString());
            return newInstance.c(str);
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new C5817dS(String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("validator.instantiation.impossible"), te1.processor().getName(), this.b.getName()));
        }
    }

    public final void q(UE1 ue1, String str) throws C5817dS {
        try {
            InterfaceC4791Ye2 newInstance = ue1.validator().newInstance();
            newInstance.b(ue1.paramString());
            newInstance.c(str, this);
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new C5817dS(String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("validator.instantiation.impossible"), ue1.validator().getName(), this.b.getName()));
        }
    }

    public V(Class<?> cls, Field field, boolean z, Locale locale, ER er) {
        this.a = cls;
        this.b = field;
        this.c = z;
        this.d = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.e = er;
        this.f = new C4631Wn0<>(this.b);
    }
}
