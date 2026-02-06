package o;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1563#3:232\n1634#3,3:233\n1563#3:236\n1634#3,3:237\n1563#3:240\n1634#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Gw2 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5350bX0.values().length];
            try {
                iArr[EnumC5350bX0.Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5350bX0.X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5350bX0.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends C7964mB0 implements HA0<Class<?>, Class<?>> {
        public static final b e1 = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final Class<?> invoke(Class<?> cls) {
            C6562gT0.p(cls, "p0");
            return cls.getComponentType();
        }
    }

    @InterfaceC4912Zi0
    public static final Type c(XW0 xw0, boolean z) {
        Class e;
        int i;
        DW0 E = xw0.E();
        if (E instanceof ZW0) {
            return new Vv2((ZW0) E);
        }
        if (E instanceof AW0) {
            AW0 aw0 = (AW0) E;
            if (z) {
                e = C6074eW0.g(aw0);
            } else {
                e = C6074eW0.e(aw0);
            }
            List<C5107aX0> Z = xw0.Z();
            if (Z.isEmpty()) {
                return e;
            }
            if (e.isArray()) {
                if (!e.getComponentType().isPrimitive()) {
                    C5107aX0 c5107aX0 = (C5107aX0) C10662xF.n5(Z);
                    if (c5107aX0 != null) {
                        EnumC5350bX0 a2 = c5107aX0.a();
                        XW0 b2 = c5107aX0.b();
                        if (a2 == null) {
                            i = -1;
                        } else {
                            i = a.a[a2.ordinal()];
                        }
                        if (i != -1 && i != 1) {
                            if (i != 2 && i != 3) {
                                throw new C3865Oq1();
                            }
                            C6562gT0.m(b2);
                            Type d = d(b2, false, 1, null);
                            if (!(d instanceof Class)) {
                                return new KC0(d);
                            }
                            return e;
                        }
                        return e;
                    }
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + xw0);
                }
                return e;
            }
            return e(e, Z);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + xw0);
    }

    public static /* synthetic */ Type d(XW0 xw0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(xw0, z);
    }

    @InterfaceC4912Zi0
    public static final Type e(Class<?> cls, List<C5107aX0> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<C5107aX0> list2 = list;
            ArrayList arrayList = new ArrayList(C8466oF.b0(list2, 10));
            for (C5107aX0 c5107aX0 : list2) {
                arrayList.add(g(c5107aX0));
            }
            return new C5698cy1(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            List<C5107aX0> list3 = list;
            ArrayList arrayList2 = new ArrayList(C8466oF.b0(list3, 10));
            for (C5107aX0 c5107aX02 : list3) {
                arrayList2.add(g(c5107aX02));
            }
            return new C5698cy1(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = e(declaringClass, list.subList(length, list.size()));
            List<C5107aX0> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C8466oF.b0(subList, 10));
            for (C5107aX0 c5107aX03 : subList) {
                arrayList3.add(g(c5107aX03));
            }
            return new C5698cy1(cls, e, arrayList3);
        }
    }

    @NotNull
    public static final Type f(@NotNull XW0 xw0) {
        Type t;
        C6562gT0.p(xw0, "<this>");
        if ((xw0 instanceof YW0) && (t = ((YW0) xw0).t()) != null) {
            return t;
        }
        return d(xw0, false, 1, null);
    }

    public static final Type g(C5107aX0 c5107aX0) {
        EnumC5350bX0 h = c5107aX0.h();
        if (h == null) {
            return C6775hL2.Z.a();
        }
        XW0 g = c5107aX0.g();
        C6562gT0.m(g);
        int i = a.a[h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C6775hL2(c(g, true), null);
                }
                throw new C3865Oq1();
            }
            return c(g, true);
        }
        return new C6775hL2(null, c(g, true));
    }

    public static final String j(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                B02 t = U02.t(type, b.e1);
                return ((Class) C6695h12.G1(t)).getName() + C9545sf2.v2(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, C6695h12.C0(t));
            }
            String name = cls.getName();
            C6562gT0.o(name, "getName(...)");
            return name;
        }
        return type.toString();
    }

    @R61
    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.4")
    public static /* synthetic */ void h(XW0 xw0) {
    }

    @InterfaceC4912Zi0
    public static /* synthetic */ void i(C5107aX0 c5107aX0) {
    }
}
