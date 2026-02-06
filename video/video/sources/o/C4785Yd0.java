package o;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.Yd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4785Yd0 {
    @InterfaceC11149zF0
    public static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> a = new WeakHashMap();

    /* renamed from: o.Yd0$a */
    /* loaded from: classes3.dex */
    public static final class a<T extends Enum<T>> extends AbstractC7264jN<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Class<T> Z;

        public a(Class<T> cls) {
            this.Z = (Class) C10664xF1.E(cls);
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof a) {
                return this.Z.equals(((a) obj).Z);
            }
            return false;
        }

        public int hashCode() {
            return this.Z.hashCode();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(T t) {
            return t.name();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public T h(String str) {
            return (T) Enum.valueOf(this.Z, str);
        }

        public String toString() {
            String name = this.Z.getName();
            StringBuilder sb = new StringBuilder(name.length() + 29);
            sb.append("Enums.stringConverter(");
            sb.append(name);
            sb.append(".class)");
            return sb.toString();
        }
    }

    @InterfaceC11149zF0
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map2 = a;
        synchronized (map2) {
            try {
                map = map2.get(cls);
                if (map == null) {
                    map = d(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    @InterfaceC11149zF0
    public static Field b(Enum<?> r1) {
        try {
            return r1.getDeclaringClass().getDeclaredField(r1.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <T extends Enum<T>> AbstractC4468Uv1<T> c(Class<T> cls, String str) {
        C10664xF1.E(cls);
        C10664xF1.E(str);
        return C7226jD1.e(cls, str);
    }

    @InterfaceC11149zF0
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> cls) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            hashMap.put(r2.name(), new WeakReference(r2));
        }
        a.put(cls, hashMap);
        return hashMap;
    }

    public static <T extends Enum<T>> AbstractC7264jN<String, T> e(Class<T> cls) {
        return new a(cls);
    }
}
