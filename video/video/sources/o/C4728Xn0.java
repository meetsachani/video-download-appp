package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: o.Xn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4728Xn0 {
    public final Field a;

    public C4728Xn0(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.a.getAnnotation(cls);
    }

    public Collection<Annotation> b() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public Class<?> c() {
        return this.a.getType();
    }

    public Type d() {
        return this.a.getGenericType();
    }

    public Class<?> e() {
        return this.a.getDeclaringClass();
    }

    public String f() {
        return this.a.getName();
    }

    public boolean g(int i) {
        if ((i & this.a.getModifiers()) != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }
}
