package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1573#2:206\n1604#2,4:207\n1267#2,4:211\n1252#2,4:217\n465#3:215\n415#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* renamed from: o.iD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6983iD implements AW0<Object>, WC {
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public static final HashMap<String, String> Y0;
    @NotNull
    public static final Map<Class<? extends InterfaceC5022aB0<?>>, Integer> Z;
    @NotNull
    public static final HashMap<String, String> Z0;
    @NotNull
    public static final HashMap<String, String> a1;
    @NotNull
    public static final Map<String, String> b1;
    @NotNull
    public final Class<?> X;

    @InterfaceC8303na2({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: o.iD$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final String a(@NotNull Class<?> cls) {
            String str;
            C6562gT0.p(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C6983iD.a1.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C6983iD.a1.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }

        @Nullable
        public final String b(@NotNull Class<?> cls) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            C6562gT0.p(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                if (cls.getEnclosingMethod() != null) {
                    C6562gT0.m(simpleName);
                    String M5 = C10763xf2.M5(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                    if (M5 != null) {
                        return M5;
                    }
                }
                if (cls.getEnclosingConstructor() != null) {
                    C6562gT0.m(simpleName);
                    return C10763xf2.M5(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                C6562gT0.m(simpleName);
                return C10763xf2.L5(simpleName, '$', null, 2, null);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C6983iD.b1.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
                return str2;
            } else {
                String str3 = (String) C6983iD.b1.get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }

        public final boolean c(@Nullable Object obj, @NotNull Class<?> cls) {
            C6562gT0.p(cls, "jClass");
            Map map = C6983iD.Z;
            C6562gT0.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return C11313zv2.B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C6074eW0.g(C6074eW0.i(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List O = C8222nF.O(FA0.class, HA0.class, VA0.class, XA0.class, ZA0.class, InterfaceC5265bB0.class, InterfaceC5507cB0.class, InterfaceC5750dB0.class, InterfaceC5992eB0.class, InterfaceC6235fB0.class, GA0.class, IA0.class, JA0.class, KA0.class, LA0.class, MA0.class, NA0.class, OA0.class, PA0.class, QA0.class, SA0.class, TA0.class, UA0.class);
        ArrayList arrayList = new ArrayList(C8466oF.b0(O, 10));
        int i = 0;
        for (Object obj : O) {
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            arrayList.add(C6670gv2.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Z = C8926q81.B0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(InterfaceC8148mw2.b.f, "kotlin.Boolean");
        hashMap.put(com.facebook.a0.G, "kotlin.Char");
        hashMap.put(com.facebook.a0.u, "kotlin.Byte");
        hashMap.put(com.facebook.a0.w, "kotlin.Short");
        hashMap.put(com.facebook.a0.y, "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(com.facebook.a0.A, "kotlin.Long");
        hashMap.put(com.facebook.a0.E, "kotlin.Double");
        Y0 = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        Z0 = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C6562gT0.o(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C6562gT0.m(str);
            sb.append(C10763xf2.P5(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C4180Rx1 a2 = C6670gv2.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.e(), a2.f());
        }
        for (Map.Entry<Class<? extends InterfaceC5022aB0<?>>, Integer> entry : Z.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        a1 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C8683p81.j(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            C6562gT0.m(str2);
            linkedHashMap.put(key, C10763xf2.P5(str2, '.', null, 2, null));
        }
        b1 = linkedHashMap;
    }

    public C6983iD(@NotNull Class<?> cls) {
        C6562gT0.p(cls, "jClass");
        this.X = cls;
    }

    @Override // o.AW0
    public boolean A() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @InterfaceC6480g82(version = "1.1")
    public boolean F(@Nullable Object obj) {
        return Y.c(obj, r());
    }

    @Override // o.AW0
    @Nullable
    public String I() {
        return Y.a(r());
    }

    @Override // o.AW0
    public boolean O() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean U() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @Nullable
    public String V() {
        return Y.b(r());
    }

    @Override // o.AW0
    @NotNull
    public List<XW0> X() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @Nullable
    public EnumC5592cX0 c() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean d() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C6983iD) && C6562gT0.g(C6074eW0.g(this), C6074eW0.g((AW0) obj))) {
            return true;
        }
        return false;
    }

    @Override // o.AW0, o.EW0
    @NotNull
    public Collection<InterfaceC11215zW0<?>> f() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean g() {
        y();
        throw new SX0();
    }

    @Override // o.InterfaceC10972yW0
    @NotNull
    public List<Annotation> getAnnotations() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @NotNull
    public List<ZW0> getTypeParameters() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @NotNull
    public Collection<AW0<?>> h() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public int hashCode() {
        return C6074eW0.g(this).hashCode();
    }

    @Override // o.AW0
    public boolean isOpen() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean k0() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @NotNull
    public Collection<FW0<Object>> l() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @NotNull
    public List<AW0<? extends Object>> o() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    public boolean p() {
        y();
        throw new SX0();
    }

    @Override // o.AW0
    @Nullable
    public Object q() {
        y();
        throw new SX0();
    }

    @Override // o.WC
    @NotNull
    public Class<?> r() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return r() + C6551gQ1.b;
    }

    @Override // o.AW0
    public boolean w() {
        y();
        throw new SX0();
    }

    public final Void y() {
        throw new VX0();
    }

    @InterfaceC6480g82(version = "1.3")
    public static /* synthetic */ void B() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void C() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void D() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void G() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void J() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void P() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void Q() {
    }

    @InterfaceC6480g82(version = "1.4")
    public static /* synthetic */ void R() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void S() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void T() {
    }

    @InterfaceC6480g82(version = "1.1")
    public static /* synthetic */ void a0() {
    }

    @InterfaceC6480g82(version = "1.5")
    public static /* synthetic */ void c0() {
    }
}
