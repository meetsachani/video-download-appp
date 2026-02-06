package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class Rv2<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public Rv2() {
        Type h = h();
        this.b = h;
        this.a = (Class<? super T>) C7233jF0.k(h);
        this.c = h.hashCode();
    }

    public static IllegalArgumentException a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(C6566gU0.h);
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        return new IllegalArgumentException(sb.toString());
    }

    public static <T> Rv2<T> b(Class<T> cls) {
        return new Rv2<>(cls);
    }

    public static Rv2<?> c(Type type) {
        return new Rv2<>(type);
    }

    public static Rv2<?> d(Type type) {
        return new Rv2<>(C7233jF0.a(type));
    }

    public static Rv2<?> e(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (type instanceof Class) {
            Class cls = (Class) type;
            TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
            int length = typeParameters.length;
            int length2 = typeArr.length;
            if (length2 == length) {
                if (typeArr.length == 0) {
                    return b(cls);
                }
                if (!C7233jF0.o(type)) {
                    for (int i = 0; i < length; i++) {
                        Type type2 = typeArr[i];
                        Objects.requireNonNull(type2, "Type argument must not be null");
                        Type type3 = type2;
                        Class<?> k = C7233jF0.k(type3);
                        TypeVariable<Class<T>> typeVariable = typeParameters[i];
                        for (Type type4 : typeVariable.getBounds()) {
                            if (!C7233jF0.k(type4).isAssignableFrom(k)) {
                                throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                            }
                        }
                    }
                    return new Rv2<>(C7233jF0.n(null, cls, typeArr));
                }
                throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
            }
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static boolean k(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return l(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    public static boolean l(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        ParameterizedType parameterizedType2;
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k = C7233jF0.k(type);
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type;
        } else {
            parameterizedType2 = null;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = k.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                TypeVariable<Class<?>> typeVariable = typeParameters[i];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (p(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : k.getGenericInterfaces()) {
            if (l(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return l(k.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean n() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    public static boolean o(Type type, Type type2, Map<String, Type> map) {
        if (!type2.equals(type)) {
            if (!(type instanceof TypeVariable) || !type2.equals(map.get(((TypeVariable) type).getName()))) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean p(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!o(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public static void q(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                q(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    q(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    q(actualTypeArguments[i]);
                    i++;
                }
                return;
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    q(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    q(upperBounds[i]);
                    i++;
                }
                return;
            } else if (type != null) {
                return;
            } else {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + Bu2.a("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Rv2) && C7233jF0.f(this.b, ((Rv2) obj).b)) {
            return true;
        }
        return false;
    }

    public final Class<? super T> f() {
        return this.a;
    }

    public final Type g() {
        return this.b;
    }

    public final Type h() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == Rv2.class) {
                Type b = C7233jF0.b(parameterizedType.getActualTypeArguments()[0]);
                if (n()) {
                    q(b);
                }
                return b;
            }
        } else if (genericSuperclass == Rv2.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + Bu2.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final int hashCode() {
        return this.c;
    }

    @Deprecated
    public boolean i(Class<?> cls) {
        return j(cls);
    }

    @Deprecated
    public boolean j(Type type) {
        if (type == null) {
            return false;
        }
        if (this.b.equals(type)) {
            return true;
        }
        Type type2 = this.b;
        if (type2 instanceof Class) {
            return this.a.isAssignableFrom(C7233jF0.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return l(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            if (!this.a.isAssignableFrom(C7233jF0.k(type)) || !k(type, (GenericArrayType) this.b)) {
                return false;
            }
            return true;
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean m(Rv2<?> rv2) {
        return j(rv2.g());
    }

    public final String toString() {
        return C7233jF0.u(this.b);
    }

    public Rv2(Type type) {
        Objects.requireNonNull(type);
        Type b = C7233jF0.b(type);
        this.b = b;
        this.a = (Class<? super T>) C7233jF0.k(b);
        this.c = b.hashCode();
    }
}
