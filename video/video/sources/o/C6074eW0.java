package o;

import java.lang.annotation.Annotation;
import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "JvmClassMappingKt")
/* renamed from: o.eW0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6074eW0 {
    @NotNull
    public static final <T extends Annotation> AW0<? extends T> a(@NotNull T t) {
        C6562gT0.p(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        C6562gT0.o(annotationType, "annotationType(...)");
        AW0<? extends T> i = i(annotationType);
        C6562gT0.n(i, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i;
    }

    public static final <E extends Enum<E>> Class<E> b(Enum<E> r1) {
        C6562gT0.p(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        C6562gT0.o(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @NotNull
    public static final <T> Class<T> d(@NotNull T t) {
        C6562gT0.p(t, "<this>");
        Class<T> cls = (Class<T>) t.getClass();
        C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @InterfaceC8046mW0(name = "getJavaClass")
    @NotNull
    public static final <T> Class<T> e(@NotNull AW0<T> aw0) {
        C6562gT0.p(aw0, "<this>");
        Class<T> cls = (Class<T>) ((WC) aw0).r();
        C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @NotNull
    public static final <T> Class<T> g(@NotNull AW0<T> aw0) {
        C6562gT0.p(aw0, "<this>");
        Class<T> cls = (Class<T>) ((WC) aw0).r();
        if (!cls.isPrimitive()) {
            C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(com.facebook.a0.E)) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(com.facebook.a0.y)) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals(com.facebook.a0.u)) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals(com.facebook.a0.G)) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(com.facebook.a0.A)) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(InterfaceC8148mw2.b.f)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals(com.facebook.a0.w)) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    @Nullable
    public static final <T> Class<T> h(@NotNull AW0<T> aw0) {
        C6562gT0.p(aw0, "<this>");
        Class<T> cls = (Class<T>) ((WC) aw0).r();
        if (cls.isPrimitive()) {
            C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.TYPE;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @InterfaceC8046mW0(name = "getKotlinClass")
    @NotNull
    public static final <T> AW0<T> i(@NotNull Class<T> cls) {
        C6562gT0.p(cls, "<this>");
        return C6551gQ1.d(cls);
    }

    @InterfaceC8046mW0(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final <T> Class<AW0<T>> j(@NotNull AW0<T> aw0) {
        C6562gT0.p(aw0, "<this>");
        Class<AW0<T>> cls = (Class<AW0<T>>) aw0.getClass();
        C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.y(4, "T");
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @XP0
    @InterfaceC6480g82(version = "1.7")
    public static /* synthetic */ void c(Enum r0) {
    }

    public static /* synthetic */ void f(AW0 aw0) {
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @IR1(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(AW0 aw0) {
    }
}
