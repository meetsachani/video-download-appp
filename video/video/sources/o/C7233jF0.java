package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;
import okhttp3.HttpUrl;

/* renamed from: o.jF0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7233jF0 {
    public static final Type[] a = new Type[0];
    public static final /* synthetic */ boolean b = false;

    /* renamed from: o.jF0$a */
    /* loaded from: classes3.dex */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        public a(Type type) {
            Objects.requireNonNull(type);
            this.X = C7233jF0.b(type);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && C7233jF0.f(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.X;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            return C7233jF0.u(this.X) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: o.jF0$b */
    /* loaded from: classes3.dex */
    public static final class b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;
        public final Type Y;
        public final Type[] Z;

        public b(Type type, Class<?> cls, Type... typeArr) {
            Type b;
            Objects.requireNonNull(cls);
            if (type == null && C7233jF0.o(cls)) {
                throw new IllegalArgumentException("Must specify owner type for " + cls);
            }
            if (type == null) {
                b = null;
            } else {
                b = C7233jF0.b(type);
            }
            this.X = b;
            this.Y = C7233jF0.b(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.Z = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.Z[i]);
                C7233jF0.c(this.Z[i]);
                Type[] typeArr3 = this.Z;
                typeArr3[i] = C7233jF0.b(typeArr3[i]);
            }
        }

        public static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && C7233jF0.f(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.Z.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.X;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.Y;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.Z) ^ this.Y.hashCode()) ^ a(this.X);
        }

        public String toString() {
            int length = this.Z.length;
            if (length == 0) {
                return C7233jF0.u(this.Y);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C7233jF0.u(this.Y));
            sb.append("<");
            sb.append(C7233jF0.u(this.Z[0]));
            for (int i = 1; i < length; i++) {
                sb.append(C6566gU0.h);
                sb.append(C7233jF0.u(this.Z[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: o.jF0$c */
    /* loaded from: classes3.dex */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;
        public final Type Y;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Objects.requireNonNull(typeArr2[0]);
                        C7233jF0.c(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.Y = C7233jF0.b(typeArr2[0]);
                            this.X = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
                    }
                    Objects.requireNonNull(typeArr[0]);
                    C7233jF0.c(typeArr[0]);
                    this.Y = null;
                    this.X = C7233jF0.b(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException("Exactly one upper bound must be specified");
            }
            throw new IllegalArgumentException("At most one lower bound is supported");
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && C7233jF0.f(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.Y;
            return type != null ? new Type[]{type} : C7233jF0.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.X};
        }

        public int hashCode() {
            int i;
            Type type = this.Y;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.X.hashCode() + 31);
        }

        public String toString() {
            if (this.Y != null) {
                return "? super " + C7233jF0.u(this.Y);
            } else if (this.X == Object.class) {
                return "?";
            } else {
                return "? extends " + C7233jF0.u(this.X);
            }
        }
    }

    public C7233jF0() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new a(b(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }

    public static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l = l(type, cls, Collection.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type l = l(type, cls, Map.class);
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return p(type, cls, i(type, cls, cls2));
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Class<?> cls, Type... typeArr) {
        return new b(type, cls, typeArr);
    }

    public static boolean o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    public static Type q(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type q;
        Type n;
        TypeVariable typeVariable = null;
        ?? r12 = type2;
        while (true) {
            if (r12 instanceof TypeVariable) {
                TypeVariable typeVariable2 = r12;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    if (type3 == cls2) {
                        return r12;
                    }
                    return type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                r12 = r(type, cls, typeVariable2);
                r12 = r12;
                if (r12 == typeVariable2) {
                    break;
                }
            } else {
                if (r12 instanceof Class) {
                    Class cls3 = r12;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type q2 = q(type, cls, componentType, map);
                        if (e(componentType, q2)) {
                            r12 = cls3;
                        } else {
                            n = a(q2);
                            r12 = n;
                        }
                    }
                }
                if (r12 instanceof GenericArrayType) {
                    r12 = (GenericArrayType) r12;
                    Type genericComponentType = r12.getGenericComponentType();
                    Type q3 = q(type, cls, genericComponentType, map);
                    if (!e(genericComponentType, q3)) {
                        n = a(q3);
                        r12 = n;
                    }
                } else {
                    if (r12 instanceof ParameterizedType) {
                        r12 = (ParameterizedType) r12;
                        Type ownerType = r12.getOwnerType();
                        Type q4 = q(type, cls, ownerType, map);
                        boolean e = e(q4, ownerType);
                        Type[] actualTypeArguments = r12.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        Type[] typeArr = actualTypeArguments;
                        boolean z = false;
                        for (int i = 0; i < length; i++) {
                            Type q5 = q(type, cls, typeArr[i], map);
                            if (!e(q5, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = q5;
                            }
                        }
                        if (!e || z) {
                            n = n(q4, (Class) r12.getRawType(), typeArr);
                            r12 = n;
                        }
                    } else if (r12 instanceof WildcardType) {
                        r12 = (WildcardType) r12;
                        Type[] lowerBounds = r12.getLowerBounds();
                        Type[] upperBounds = r12.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type q6 = q(type, cls, lowerBounds[0], map);
                            if (q6 != lowerBounds[0]) {
                                r12 = t(q6);
                            }
                        } else if (upperBounds.length == 1 && (q = q(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            r12 = s(q);
                        }
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, r12);
        }
        return r12;
    }

    public static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = d(typeVariable);
        if (d != null) {
            Type i = i(type, cls, d);
            if (i instanceof ParameterizedType) {
                return ((ParameterizedType) i).getActualTypeArguments()[m(d.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static WildcardType s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, a);
    }

    public static WildcardType t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
