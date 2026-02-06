package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class FieldDescriptor {
    public final String a;
    public final Map<Class<?>, Object> b;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public final String a;
        public Map<Class<?>, Object> b = null;

        public Builder(String str) {
            this.a = str;
        }

        @InterfaceC5670cr1
        public FieldDescriptor a() {
            Map unmodifiableMap;
            String str = this.a;
            if (this.b == null) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.b));
            }
            return new FieldDescriptor(str, unmodifiableMap);
        }

        @InterfaceC5670cr1
        public <T extends Annotation> Builder b(@InterfaceC5670cr1 T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    @InterfaceC5670cr1
    public static Builder a(@InterfaceC5670cr1 String str) {
        return new Builder(str);
    }

    @InterfaceC5670cr1
    public static FieldDescriptor d(@InterfaceC5670cr1 String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @InterfaceC11300zs1
    public <T extends Annotation> T c(@InterfaceC5670cr1 Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        if (this.a.equals(fieldDescriptor.a) && this.b.equals(fieldDescriptor.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @InterfaceC5670cr1
    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    public FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }
}
