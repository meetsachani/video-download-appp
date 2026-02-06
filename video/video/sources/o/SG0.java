package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes3.dex */
public class SG0<T> extends AbstractC5289bH0<T> {
    public SG0() {
    }

    @Override // o.AbstractC5470c2
    public void F(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
        for (Map.Entry<Class<?>, Field> entry : interfaceC7664l11.r()) {
            Class<?> key = entry.getKey();
            Field value = entry.getValue();
            if (!value.isAnnotationPresent(FR.class) && !value.isAnnotationPresent(GR.class)) {
                if (!value.isAnnotationPresent(InterfaceC9492sR.class) && !value.isAnnotationPresent(InterfaceC9735tR.class)) {
                    if (!value.isAnnotationPresent(InterfaceC8514oR.class) && !value.isAnnotationPresent(InterfaceC8757pR.class)) {
                        InterfaceC10467wR interfaceC10467wR = (InterfaceC10467wR) K(value.getAnnotationsByType(InterfaceC10467wR.class), new Function() { // from class: o.RG0
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((InterfaceC10467wR) obj).profiles();
                            }
                        });
                        if (interfaceC10467wR != null) {
                            S(interfaceC10467wR, key, value);
                        }
                    } else {
                        InterfaceC8514oR interfaceC8514oR = (InterfaceC8514oR) K(value.getAnnotationsByType(InterfaceC8514oR.class), new Function() { // from class: o.QG0
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((InterfaceC8514oR) obj).profiles();
                            }
                        });
                        if (interfaceC8514oR != null) {
                            U(interfaceC8514oR, key, value);
                        }
                    }
                } else {
                    InterfaceC9492sR interfaceC9492sR = (InterfaceC9492sR) K(value.getAnnotationsByType(InterfaceC9492sR.class), new Function() { // from class: o.PG0
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((InterfaceC9492sR) obj).profiles();
                        }
                    });
                    if (interfaceC9492sR != null) {
                        V(interfaceC9492sR, key, value);
                    }
                }
            } else {
                FR fr = (FR) K(value.getAnnotationsByType(FR.class), new Function() { // from class: o.OG0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((FR) obj).profiles();
                    }
                });
                if (fr != null) {
                    T(fr, key, value);
                }
            }
        }
    }

    public final void S(InterfaceC10467wR interfaceC10467wR, Class<?> cls, Field field) {
        String writeLocale;
        String trim = interfaceC10467wR.column().toUpperCase().trim();
        String locale = interfaceC10467wR.locale();
        if (interfaceC10467wR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC10467wR.writeLocale();
        }
        ER s = s(field, field.getType(), locale, writeLocale, null);
        if (C4500Ve2.I0(trim)) {
            this.h.j(field.getName().toUpperCase(), new C9327rm(cls, field, interfaceC10467wR.required(), this.e, s, interfaceC10467wR.capture(), interfaceC10467wR.format()));
        } else {
            this.h.j(trim, new C9327rm(cls, field, interfaceC10467wR.required(), this.e, s, interfaceC10467wR.capture(), interfaceC10467wR.format()));
        }
    }

    public final void T(FR fr, Class<?> cls, Field field) {
        String trim = fr.column().toUpperCase().trim();
        if (C4500Ve2.I0(trim)) {
            trim = field.getName().toUpperCase();
        }
        InterfaceC8348nm<T, String> D = D(fr.converter());
        D.e(cls);
        D.f(field);
        D.j(fr.required());
        this.h.j(trim, D);
    }

    public final void U(InterfaceC8514oR interfaceC8514oR, Class<?> cls, Field field) {
        String writeLocale;
        String column = interfaceC8514oR.column();
        String locale = interfaceC8514oR.locale();
        if (interfaceC8514oR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC8514oR.writeLocale();
        }
        ER s = s(field, interfaceC8514oR.elementType(), locale, writeLocale, interfaceC8514oR.converter());
        if (C4500Ve2.I0(column)) {
            this.h.i(field.getName(), new C9078qm(cls, field, interfaceC8514oR.required(), this.e, s, interfaceC8514oR.mapType(), interfaceC8514oR.capture(), interfaceC8514oR.format()));
        } else {
            this.h.i(column, new C9078qm(cls, field, interfaceC8514oR.required(), this.e, s, interfaceC8514oR.mapType(), interfaceC8514oR.capture(), interfaceC8514oR.format()));
        }
    }

    public final void V(InterfaceC9492sR interfaceC9492sR, Class<?> cls, Field field) {
        String writeLocale;
        String trim = interfaceC9492sR.column().toUpperCase().trim();
        String locale = interfaceC9492sR.locale();
        if (interfaceC9492sR.writeLocaleEqualsReadLocale()) {
            writeLocale = locale;
        } else {
            writeLocale = interfaceC9492sR.writeLocale();
        }
        Class<?> elementType = interfaceC9492sR.elementType();
        ER s = s(field, elementType, locale, writeLocale, interfaceC9492sR.converter());
        if (C4500Ve2.I0(trim)) {
            this.h.j(field.getName().toUpperCase(), new C9570sm(cls, field, interfaceC9492sR.required(), this.e, s, interfaceC9492sR.splitOn(), interfaceC9492sR.writeDelimiter(), interfaceC9492sR.collectionType(), elementType, interfaceC9492sR.capture(), interfaceC9492sR.format()));
        } else {
            this.h.j(trim, new C9570sm(cls, field, interfaceC9492sR.required(), this.e, s, interfaceC9492sR.splitOn(), interfaceC9492sR.writeDelimiter(), interfaceC9492sR.collectionType(), elementType, interfaceC9492sR.capture(), interfaceC9492sR.format()));
        }
    }

    @Override // o.AbstractC5470c2
    public Set<Class<? extends Annotation>> w() {
        return new HashSet(Arrays.asList(InterfaceC10710xR.class, GR.class, InterfaceC9735tR.class, InterfaceC8757pR.class, InterfaceC10467wR.class, FR.class, InterfaceC9492sR.class, InterfaceC8514oR.class));
    }

    public SG0(boolean z) {
        super(z);
    }
}
