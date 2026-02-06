package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;

/* renamed from: o.zG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11152zG<T> extends AbstractC5470c2<String, Integer, VH<String, Integer, T>, T> {
    public C8844po0<T> i;
    public Comparator<Integer> j;
    public boolean h = false;
    public Integer[] k = null;

    @Override // o.AbstractC5470c2
    public void C() {
        C8844po0<T> c8844po0 = new C8844po0<>(this.e);
        this.i = c8844po0;
        c8844po0.w(this.j);
    }

    @Override // o.AbstractC5470c2
    public void F(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
        for (Map.Entry<Class<?>, Field> entry : interfaceC7664l11.r()) {
            Class<?> key = entry.getKey();
            Field value = entry.getValue();
            if (!value.isAnnotationPresent(HR.class) && !value.isAnnotationPresent(IR.class)) {
                if (!value.isAnnotationPresent(InterfaceC9978uR.class) && !value.isAnnotationPresent(InterfaceC10221vR.class)) {
                    if (!value.isAnnotationPresent(InterfaceC9000qR.class) && !value.isAnnotationPresent(InterfaceC9249rR.class)) {
                        InterfaceC10953yR interfaceC10953yR = (InterfaceC10953yR) K(value.getAnnotationsByType(InterfaceC10953yR.class), new Function() { // from class: o.yG
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((InterfaceC10953yR) obj).profiles();
                            }
                        });
                        if (interfaceC10953yR != null) {
                            Q(interfaceC10953yR, key, value);
                        }
                    } else {
                        InterfaceC9000qR interfaceC9000qR = (InterfaceC9000qR) K(value.getAnnotationsByType(InterfaceC9000qR.class), new Function() { // from class: o.xG
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((InterfaceC9000qR) obj).profiles();
                            }
                        });
                        if (interfaceC9000qR != null) {
                            S(interfaceC9000qR, key, value);
                        }
                    }
                } else {
                    InterfaceC9978uR interfaceC9978uR = (InterfaceC9978uR) K(value.getAnnotationsByType(InterfaceC9978uR.class), new Function() { // from class: o.wG
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((InterfaceC9978uR) obj).profiles();
                        }
                    });
                    if (interfaceC9978uR != null) {
                        T(interfaceC9978uR, key, value);
                    }
                }
            } else {
                HR hr = (HR) K(value.getAnnotationsByType(HR.class), new Function() { // from class: o.vG
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((HR) obj).profiles();
                    }
                });
                if (hr != null) {
                    R(hr, key, value);
                }
            }
        }
    }

    @Override // o.AbstractC5470c2
    public void I(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
        for (Map.Entry<Class<?>, Field> entry : interfaceC7664l11.r()) {
            Class<?> key = entry.getKey();
            Field value = entry.getValue();
            ER s = s(value, value.getType(), null, null, null);
            int[] c = this.b.c(value.getName());
            if (c.length != 0) {
                this.i.j(Integer.valueOf(c[0]), new C9327rm(key, value, false, this.e, s, null, null));
            }
        }
    }

    @Override // o.AbstractC5470c2
    public void M(int i) throws XR {
        if (!this.b.h()) {
            StringBuilder sb = null;
            while (i <= this.b.b()) {
                InterfaceC8348nm<T, Integer> u = u(i);
                if (u != null && u.l()) {
                    if (sb == null) {
                        sb = new StringBuilder(ResourceBundle.getBundle(UI0.k, this.e).getString("multiple.required.field.empty"));
                    }
                    sb.append(' ');
                    sb.append(u.i().getName());
                }
                i++;
            }
            if (sb != null) {
                throw new XR(this.a, sb.toString());
            }
        }
    }

    @Override // o.AbstractC5470c2
    /* renamed from: O */
    public Integer p(int i) {
        return Integer.valueOf(i);
    }

    public String[] P() {
        return this.b.e();
    }

    public final void Q(InterfaceC10953yR interfaceC10953yR, Class<?> cls, Field field) {
        String writeLocale;
        String locale = interfaceC10953yR.locale();
        if (interfaceC10953yR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC10953yR.writeLocale();
        }
        this.i.j(Integer.valueOf(interfaceC10953yR.position()), new C9327rm(cls, field, interfaceC10953yR.required(), this.e, s(field, field.getType(), locale, writeLocale, null), interfaceC10953yR.capture(), interfaceC10953yR.format()));
    }

    public final void R(HR hr, Class<?> cls, Field field) {
        InterfaceC8348nm<T, Integer> D = D(hr.converter());
        D.e(cls);
        D.f(field);
        D.j(hr.required());
        this.i.j(Integer.valueOf(hr.position()), D);
    }

    public final void S(InterfaceC9000qR interfaceC9000qR, Class<?> cls, Field field) {
        String writeLocale;
        String locale = interfaceC9000qR.locale();
        if (interfaceC9000qR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC9000qR.writeLocale();
        }
        this.i.i(interfaceC9000qR.position(), new C8835pm(cls, field, interfaceC9000qR.required(), this.e, s(field, interfaceC9000qR.elementType(), locale, writeLocale, interfaceC9000qR.converter()), interfaceC9000qR.mapType(), interfaceC9000qR.capture(), interfaceC9000qR.format()));
    }

    public final void T(InterfaceC9978uR interfaceC9978uR, Class<?> cls, Field field) {
        String writeLocale;
        String locale = interfaceC9978uR.locale();
        if (interfaceC9978uR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC9978uR.writeLocale();
        }
        Class<?> elementType = interfaceC9978uR.elementType();
        this.i.j(Integer.valueOf(interfaceC9978uR.position()), new C9570sm(cls, field, interfaceC9978uR.required(), this.e, s(field, elementType, locale, writeLocale, interfaceC9978uR.converter()), interfaceC9978uR.splitOn(), interfaceC9978uR.writeDelimiter(), interfaceC9978uR.collectionType(), elementType, interfaceC9978uR.capture(), interfaceC9978uR.format()));
    }

    public void U(String... strArr) {
        if (strArr != null) {
            this.b.g(strArr);
        } else {
            this.b.a();
        }
        this.h = true;
        if (z() != null) {
            G();
        }
    }

    public void V(Comparator<Integer> comparator) {
        this.j = comparator;
        C8844po0<T> c8844po0 = this.i;
        if (c8844po0 != null) {
            c8844po0.w(comparator);
        }
    }

    @Override // o.InterfaceC7449k81
    public void c(C3968Ps c3968Ps) throws IOException {
        if (this.a != null) {
            this.i.B(C4206Se.G2(c3968Ps.F()).length - 1);
            if (!this.h) {
                this.b.a();
                Iterator<C9087qo0<T>> it = this.i.iterator();
                while (it.hasNext()) {
                    C9087qo0<T> next = it.next();
                    Field i = next.a().i();
                    if (i.getAnnotation(HR.class) != null || i.getAnnotation(InterfaceC9978uR.class) != null || i.getAnnotation(InterfaceC9000qR.class) != null || i.getAnnotation(InterfaceC10953yR.class) != null) {
                        this.b.i(next.b(), i.getName().toUpperCase().trim());
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.e).getString("type.unset"));
    }

    @Override // o.AbstractC5470c2, o.InterfaceC7449k81
    public String[] f(T t) throws XR {
        Integer[] numArr = new Integer[super.f(t).length];
        this.k = numArr;
        Arrays.setAll(numArr, new IntFunction() { // from class: o.uG
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        });
        Arrays.sort(this.k, this.j);
        return C4206Se.u;
    }

    @Override // o.AbstractC5470c2
    public InterfaceC8348nm<T, Integer> u(int i) {
        Integer[] numArr = this.k;
        if (numArr != null) {
            if (i < numArr.length) {
                return this.i.h(numArr[i]);
            }
            return null;
        }
        return this.i.h(Integer.valueOf(i));
    }

    @Override // o.AbstractC5470c2
    public String v(int i) {
        return Integer.toString(i);
    }

    @Override // o.AbstractC5470c2
    public Set<Class<? extends Annotation>> w() {
        return new HashSet(Arrays.asList(InterfaceC11196zR.class, IR.class, InterfaceC9249rR.class, InterfaceC10221vR.class, InterfaceC10953yR.class, HR.class, InterfaceC9000qR.class, InterfaceC9978uR.class));
    }

    @Override // o.AbstractC5470c2
    public String x(int i) {
        return this.b.d(i);
    }

    @Override // o.AbstractC5470c2
    public InterfaceC6142eo0<String, Integer, ? extends VH<String, Integer, T>, T> y() {
        return this.i;
    }
}
