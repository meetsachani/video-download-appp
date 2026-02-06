package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import o.InterfaceC7278jQ1;

/* renamed from: o.uL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9954uL {
    public final Map<Type, InterfaceC10218vQ0<?>> a;
    public final boolean b;
    public final List<InterfaceC7278jQ1> c;

    public C9954uL(Map<Type, InterfaceC10218vQ0<?>> map, boolean z, List<InterfaceC7278jQ1> list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static <T> InterfaceC5678ct1<T> A(Class<? super T> cls, InterfaceC7278jQ1.e eVar) {
        final String p;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            InterfaceC7278jQ1.e eVar2 = InterfaceC7278jQ1.e.ALLOW;
            if (eVar != eVar2 && (!C7521kQ1.a(declaredConstructor, null) || (eVar == InterfaceC7278jQ1.e.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                return new InterfaceC5678ct1() { // from class: o.iL
                    @Override // o.InterfaceC5678ct1
                    public final Object a() {
                        return C9954uL.n(str);
                    }
                };
            } else if (eVar == eVar2 && (p = C8268nQ1.p(declaredConstructor)) != null) {
                return new InterfaceC5678ct1() { // from class: o.jL
                    @Override // o.InterfaceC5678ct1
                    public final Object a() {
                        return C9954uL.k(p);
                    }
                };
            } else {
                return new InterfaceC5678ct1() { // from class: o.lL
                    @Override // o.InterfaceC5678ct1
                    public final Object a() {
                        return C9954uL.s(declaredConstructor);
                    }
                };
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> InterfaceC5678ct1<T> B(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (InterfaceC5678ct1<T>) z(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (InterfaceC5678ct1<T>) C(type, cls);
        }
        return null;
    }

    public static InterfaceC5678ct1<? extends Map<? extends Object, Object>> C(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(I01.class) && y(type)) {
            return new InterfaceC5678ct1() { // from class: o.dL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new InterfaceC5678ct1() { // from class: o.eL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new InterfaceC5678ct1() { // from class: o.fL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new InterfaceC5678ct1() { // from class: o.gL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new InterfaceC5678ct1() { // from class: o.hL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.h();
                }
            };
        }
        return null;
    }

    public static <T> InterfaceC5678ct1<T> D(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new InterfaceC5678ct1() { // from class: o.bL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new InterfaceC5678ct1() { // from class: o.cL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.f(type);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new GV0(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return RB2.a.d(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new GV0("Invalid EnumMap type: " + type.toString());
        }
        throw new GV0("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new GV0(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new GV0("Invalid EnumSet type: " + type.toString());
        }
        throw new GV0("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new GV0(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new GV0(str);
    }

    public static /* synthetic */ Map p() {
        return new I01();
    }

    public static /* synthetic */ Object q(String str) {
        throw new GV0(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw C8268nQ1.e(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C8268nQ1.c(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C8268nQ1.c(constructor) + "' with no args", e3.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new GV0(str);
    }

    public static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + Bu2.a("r8-abstract-class");
        } else {
            return null;
        }
    }

    public static boolean y(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 0 && C7233jF0.k(actualTypeArguments[0]) == String.class) {
            return true;
        }
        return false;
    }

    public static InterfaceC5678ct1<? extends Collection<? extends Object>> z(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new InterfaceC5678ct1() { // from class: o.pL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new InterfaceC5678ct1() { // from class: o.qL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new InterfaceC5678ct1() { // from class: o.rL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new InterfaceC5678ct1() { // from class: o.sL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.t();
                }
            };
        }
        return null;
    }

    public final <T> InterfaceC5678ct1<T> E(final Class<? super T> cls) {
        if (this.b) {
            return new InterfaceC5678ct1() { // from class: o.tL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new InterfaceC5678ct1() { // from class: o.aL
            @Override // o.InterfaceC5678ct1
            public final Object a() {
                return C9954uL.o(str);
            }
        };
    }

    public String toString() {
        return this.a.toString();
    }

    public <T> InterfaceC5678ct1<T> w(Rv2<T> rv2) {
        return x(rv2, true);
    }

    public <T> InterfaceC5678ct1<T> x(Rv2<T> rv2, boolean z) {
        final Type g = rv2.g();
        Class<? super T> f = rv2.f();
        final InterfaceC10218vQ0<?> interfaceC10218vQ0 = this.a.get(g);
        if (interfaceC10218vQ0 != null) {
            return new InterfaceC5678ct1() { // from class: o.ZK
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    Object a;
                    a = InterfaceC10218vQ0.this.a(g);
                    return a;
                }
            };
        }
        final InterfaceC10218vQ0<?> interfaceC10218vQ02 = this.a.get(f);
        if (interfaceC10218vQ02 != null) {
            return new InterfaceC5678ct1() { // from class: o.kL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    Object a;
                    a = InterfaceC10218vQ0.this.a(g);
                    return a;
                }
            };
        }
        InterfaceC5678ct1<T> D = D(g, f);
        if (D != null) {
            return D;
        }
        InterfaceC7278jQ1.e b = C7521kQ1.b(this.c, f);
        InterfaceC5678ct1<T> A = A(f, b);
        if (A != null) {
            return A;
        }
        InterfaceC5678ct1<T> B = B(g, f);
        if (B != null) {
            return B;
        }
        final String v = v(f);
        if (v != null) {
            return new InterfaceC5678ct1() { // from class: o.mL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.q(v);
                }
            };
        }
        if (!z) {
            final String str = "Unable to create instance of " + f + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new InterfaceC5678ct1() { // from class: o.nL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.d(str);
                }
            };
        } else if (b != InterfaceC7278jQ1.e.ALLOW) {
            final String str2 = "Unable to create instance of " + f + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
            return new InterfaceC5678ct1() { // from class: o.oL
                @Override // o.InterfaceC5678ct1
                public final Object a() {
                    return C9954uL.u(str2);
                }
            };
        } else {
            return E(f);
        }
    }
}
