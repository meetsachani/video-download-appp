package o;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC7278jQ1;

/* renamed from: o.qQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8998qQ1 implements InterfaceC8631ov2 {
    public final C9954uL X;
    public final InterfaceC10308vo0 Y;
    public final C9994uV0 Y0;
    public final C4308Tf0 Z;
    public final List<InterfaceC7278jQ1> Z0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.qQ1$a */
    /* loaded from: classes3.dex */
    public class a<T> extends AbstractC8387nv2<T> {
        public a() {
        }

        @Override // o.AbstractC8387nv2
        public T e(OV0 ov0) throws IOException {
            ov0.Z();
            return null;
        }

        @Override // o.AbstractC8387nv2
        public void i(C5589cW0 c5589cW0, T t) throws IOException {
            c5589cW0.u();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* renamed from: o.qQ1$b */
    /* loaded from: classes3.dex */
    public class b extends d {
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Method e;
        public final /* synthetic */ AbstractC8387nv2 f;
        public final /* synthetic */ AbstractC8387nv2 g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Field field, boolean z, Method method, AbstractC8387nv2 abstractC8387nv2, AbstractC8387nv2 abstractC8387nv22, boolean z2, boolean z3) {
            super(str, field);
            this.d = z;
            this.e = method;
            this.f = abstractC8387nv2;
            this.g = abstractC8387nv22;
            this.h = z2;
            this.i = z3;
        }

        @Override // o.C8998qQ1.d
        public void a(OV0 ov0, int i, Object[] objArr) throws IOException, KV0 {
            Object e = this.g.e(ov0);
            if (e == null && this.h) {
                throw new KV0("null is not allowed as value for record component '" + this.c + "' of primitive type; at path " + ov0.Y());
            }
            objArr[i] = e;
        }

        @Override // o.C8998qQ1.d
        public void b(OV0 ov0, Object obj) throws IOException, IllegalAccessException {
            Object e = this.g.e(ov0);
            if (e == null && this.h) {
                return;
            }
            if (this.d) {
                C8998qQ1.c(obj, this.b);
            } else if (this.i) {
                String g = C8268nQ1.g(this.b, false);
                throw new GV0("Cannot set value of 'static final' " + g);
            }
            this.b.set(obj, e);
        }

        @Override // o.C8998qQ1.d
        public void c(C5589cW0 c5589cW0, Object obj) throws IOException, IllegalAccessException {
            Object obj2;
            if (this.d) {
                Method method = this.e;
                if (method == null) {
                    C8998qQ1.c(obj, this.b);
                } else {
                    C8998qQ1.c(obj, method);
                }
            }
            Method method2 = this.e;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    String g = C8268nQ1.g(this.e, false);
                    throw new GV0("Accessor " + g + " threw exception", e.getCause());
                }
            } else {
                obj2 = this.b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            c5589cW0.s(this.a);
            this.f.i(c5589cW0, obj2);
        }
    }

    /* renamed from: o.qQ1$c */
    /* loaded from: classes3.dex */
    public static abstract class c<T, A> extends AbstractC8387nv2<T> {
        public final f a;

        public c(f fVar) {
            this.a = fVar;
        }

        @Override // o.AbstractC8387nv2
        public T e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            A j = j();
            Map<String, d> map = this.a.a;
            try {
                ov0.f();
                while (ov0.r()) {
                    d dVar = map.get(ov0.A());
                    if (dVar == null) {
                        ov0.Z();
                    } else {
                        l(j, ov0, dVar);
                    }
                }
                ov0.l();
                return k(j);
            } catch (IllegalAccessException e) {
                throw C8268nQ1.e(e);
            } catch (IllegalStateException e2) {
                throw new WV0(e2);
            }
        }

        @Override // o.AbstractC8387nv2
        public void i(C5589cW0 c5589cW0, T t) throws IOException {
            if (t == null) {
                c5589cW0.u();
                return;
            }
            c5589cW0.i();
            try {
                for (d dVar : this.a.b) {
                    dVar.c(c5589cW0, t);
                }
                c5589cW0.l();
            } catch (IllegalAccessException e) {
                throw C8268nQ1.e(e);
            }
        }

        public abstract A j();

        public abstract T k(A a);

        public abstract void l(A a, OV0 ov0, d dVar) throws IllegalAccessException, IOException;
    }

    /* renamed from: o.qQ1$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        public final String a;
        public final Field b;
        public final String c;

        public d(String str, Field field) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
        }

        public abstract void a(OV0 ov0, int i, Object[] objArr) throws IOException, KV0;

        public abstract void b(OV0 ov0, Object obj) throws IOException, IllegalAccessException;

        public abstract void c(C5589cW0 c5589cW0, Object obj) throws IOException, IllegalAccessException;
    }

    /* renamed from: o.qQ1$f */
    /* loaded from: classes3.dex */
    public static class f {
        public static final f c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        public final Map<String, d> a;
        public final List<d> b;

        public f(Map<String, d> map, List<d> list) {
            this.a = map;
            this.b = list;
        }
    }

    /* renamed from: o.qQ1$g */
    /* loaded from: classes3.dex */
    public static final class g<T> extends c<T, Object[]> {
        public static final Map<Class<?>, Object> e = o();
        public final Constructor<T> b;
        public final Object[] c;
        public final Map<String, Integer> d;

        public g(Class<T> cls, f fVar, boolean z) {
            super(fVar);
            this.d = new HashMap();
            Constructor<T> i = C8268nQ1.i(cls);
            this.b = i;
            if (z) {
                C8998qQ1.c(null, i);
            } else {
                C8268nQ1.o(i);
            }
            String[] k = C8268nQ1.k(cls);
            for (int i2 = 0; i2 < k.length; i2++) {
                this.d.put(k[i2], Integer.valueOf(i2));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.c[i3] = e.get(parameterTypes[i3]);
            }
        }

        public static Map<Class<?>, Object> o() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        @Override // o.C8998qQ1.c
        /* renamed from: m */
        public Object[] j() {
            return (Object[]) this.c.clone();
        }

        @Override // o.C8998qQ1.c
        /* renamed from: n */
        public T k(Object[] objArr) {
            try {
                return this.b.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                throw C8268nQ1.e(e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + C8268nQ1.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + C8268nQ1.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + C8268nQ1.c(this.b) + "' with args " + Arrays.toString(objArr), e5.getCause());
            }
        }

        @Override // o.C8998qQ1.c
        /* renamed from: p */
        public void l(Object[] objArr, OV0 ov0, d dVar) throws IOException {
            Integer num = this.d.get(dVar.c);
            if (num != null) {
                dVar.a(ov0, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C8268nQ1.c(this.b) + "' for field with name '" + dVar.c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public C8998qQ1(C9954uL c9954uL, InterfaceC10308vo0 interfaceC10308vo0, C4308Tf0 c4308Tf0, C9994uV0 c9994uV0, List<InterfaceC7278jQ1> list) {
        this.X = c9954uL;
        this.Y = interfaceC10308vo0;
        this.Z = c4308Tf0;
        this.Y0 = c9994uV0;
        this.Z0 = list;
    }

    public static <M extends AccessibleObject & Member> void c(Object obj, M m) {
        if (Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (C7521kQ1.a(m, obj)) {
            return;
        }
        String g2 = C8268nQ1.g(m, true);
        throw new GV0(g2 + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public static IllegalArgumentException e(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C8268nQ1.f(field) + " and " + C8268nQ1.f(field2) + "\nSee " + Bu2.a("duplicate-fields"));
    }

    @Override // o.InterfaceC8631ov2
    public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
        boolean z;
        Class<? super T> f2 = rv2.f();
        if (!Object.class.isAssignableFrom(f2)) {
            return null;
        }
        if (C8268nQ1.l(f2)) {
            return new a();
        }
        InterfaceC7278jQ1.e b2 = C7521kQ1.b(this.Z0, f2);
        if (b2 != InterfaceC7278jQ1.e.BLOCK_ALL) {
            if (b2 == InterfaceC7278jQ1.e.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            if (C8268nQ1.m(f2)) {
                return new g(f2, f(c5523cF0, rv2, f2, z, true), z);
            }
            return new e(this.X.x(rv2, true), f(c5523cF0, rv2, f2, z, false));
        }
        throw new GV0("ReflectionAccessFilter does not permit using reflection for " + f2 + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final d d(C5523cF0 c5523cF0, Field field, Method method, String str, Rv2<?> rv2, boolean z, boolean z2) {
        boolean z3;
        AbstractC8387nv2<?> abstractC8387nv2;
        AbstractC8387nv2<?> abstractC8387nv22;
        AbstractC8387nv2<?> c8874pv2;
        boolean a2 = C8962qH1.a(rv2.f());
        int modifiers = field.getModifiers();
        boolean z4 = false;
        boolean z5 = true;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z3 = false;
            z4 = true;
        } else {
            z3 = false;
        }
        InterfaceC9751tV0 interfaceC9751tV0 = (InterfaceC9751tV0) field.getAnnotation(InterfaceC9751tV0.class);
        if (interfaceC9751tV0 != null) {
            abstractC8387nv2 = this.Y0.d(this.X, c5523cF0, rv2, interfaceC9751tV0, false);
        } else {
            abstractC8387nv2 = null;
        }
        if (abstractC8387nv2 == null) {
            z5 = z3;
        }
        if (abstractC8387nv2 == null) {
            abstractC8387nv2 = c5523cF0.u(rv2);
        }
        AbstractC8387nv2<?> abstractC8387nv23 = abstractC8387nv2;
        if (z) {
            if (z5) {
                c8874pv2 = abstractC8387nv23;
            } else {
                c8874pv2 = new C8874pv2<>(c5523cF0, abstractC8387nv23, rv2.g());
            }
            abstractC8387nv22 = c8874pv2;
        } else {
            abstractC8387nv22 = abstractC8387nv23;
        }
        return new b(str, field, z2, method, abstractC8387nv22, abstractC8387nv23, a2, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f f(C5523cF0 c5523cF0, Rv2<?> rv2, Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        Rv2<?> rv22;
        boolean z4;
        String str;
        int i;
        int i2;
        d dVar;
        C8998qQ1 c8998qQ1 = this;
        if (cls.isInterface()) {
            return f.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Rv2<?> rv23 = rv2;
        boolean z5 = z;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (cls2 != cls && declaredFields.length > 0) {
                InterfaceC7278jQ1.e b2 = C7521kQ1.b(c8998qQ1.Z0, cls2);
                if (b2 != InterfaceC7278jQ1.e.BLOCK_ALL) {
                    if (b2 == InterfaceC7278jQ1.e.BLOCK_INACCESSIBLE) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    throw new GV0("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z8 = z5;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3;
                Field field = declaredFields[i4];
                boolean h = c8998qQ1.h(field, z6);
                boolean h2 = c8998qQ1.h(field, z7);
                if (!h && !h2) {
                    i2 = length;
                    i = i4;
                    rv22 = rv23;
                    z4 = z7;
                } else {
                    Method method = null;
                    if (z2) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            z3 = z7;
                            if (!z8 && method == null) {
                                C8268nQ1.o(field);
                            }
                            Type p = C7233jF0.p(rv23.g(), cls2, field.getGenericType());
                            List<String> g2 = c8998qQ1.g(field);
                            rv22 = rv23;
                            z4 = false;
                            str = g2.get(0);
                            i = i4;
                            i2 = length;
                            d d2 = c8998qQ1.d(c5523cF0, field, method, str, Rv2.c(p), h, z8);
                            if (z3) {
                                for (String str2 : g2) {
                                    d dVar2 = (d) linkedHashMap.put(str2, d2);
                                    if (dVar2 != null) {
                                        throw e(cls, str2, dVar2.b, field);
                                    }
                                }
                            }
                            if (h && (dVar = (d) linkedHashMap2.put(str, d2)) != null) {
                                throw e(cls, str, dVar.b, field);
                            }
                        } else {
                            method = C8268nQ1.h(cls2, field);
                            if (!z8) {
                                C8268nQ1.o(method);
                            }
                            if (method.getAnnotation(A12.class) != null && field.getAnnotation(A12.class) == null) {
                                throw new GV0("@SerializedName on " + C8268nQ1.g(method, z7) + " is not supported");
                            }
                        }
                    }
                    z3 = h2;
                    if (!z8) {
                        C8268nQ1.o(field);
                    }
                    Type p2 = C7233jF0.p(rv23.g(), cls2, field.getGenericType());
                    List<String> g22 = c8998qQ1.g(field);
                    rv22 = rv23;
                    z4 = false;
                    str = g22.get(0);
                    i = i4;
                    i2 = length;
                    d d22 = c8998qQ1.d(c5523cF0, field, method, str, Rv2.c(p2), h, z8);
                    if (z3) {
                    }
                    if (h) {
                        throw e(cls, str, dVar.b, field);
                    }
                    continue;
                }
                i3 = i + 1;
                c8998qQ1 = this;
                z7 = z4;
                rv23 = rv22;
                length = i2;
                z6 = true;
            }
            rv23 = Rv2.c(C7233jF0.p(rv23.g(), cls2, cls2.getGenericSuperclass()));
            cls2 = rv23.f();
            c8998qQ1 = this;
            z5 = z8;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final List<String> g(Field field) {
        String str;
        List<String> list;
        A12 a12 = (A12) field.getAnnotation(A12.class);
        if (a12 == null) {
            str = this.Y.g(field);
            list = this.Y.e(field);
        } else {
            String value = a12.value();
            List<String> asList = Arrays.asList(a12.alternate());
            str = value;
            list = asList;
        }
        if (list.isEmpty()) {
            return Collections.singletonList(str);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(str);
        arrayList.addAll(list);
        return arrayList;
    }

    public final boolean h(Field field, boolean z) {
        return !this.Z.f(field, z);
    }

    /* renamed from: o.qQ1$e */
    /* loaded from: classes3.dex */
    public static final class e<T> extends c<T, T> {
        public final InterfaceC5678ct1<T> b;

        public e(InterfaceC5678ct1<T> interfaceC5678ct1, f fVar) {
            super(fVar);
            this.b = interfaceC5678ct1;
        }

        @Override // o.C8998qQ1.c
        public T j() {
            return this.b.a();
        }

        @Override // o.C8998qQ1.c
        public void l(T t, OV0 ov0, d dVar) throws IllegalAccessException, IOException {
            dVar.b(ov0, t);
        }

        @Override // o.C8998qQ1.c
        public T k(T t) {
            return t;
        }
    }
}
