package com.google.firebase.components;

import java.lang.annotation.Annotation;
import o.C4500Ve2;

/* loaded from: classes3.dex */
public final class Qualified<T> {
    public final Class<? extends Annotation> a;
    public final Class<T> b;

    /* loaded from: classes3.dex */
    public @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> Qualified<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    public static <T> Qualified<T> b(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.b.equals(qualified.b)) {
            return false;
        }
        return this.a.equals(qualified.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == Unqualified.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + C4500Ve2.b + this.b.getName();
    }
}
