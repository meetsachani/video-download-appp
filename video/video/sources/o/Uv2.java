package o;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public class Uv2 {
    public static final WildcardType a = e0().c(Object.class).build();

    /* loaded from: classes4.dex */
    public static final class b implements GenericArrayType {
        public final Type X;

        public boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof GenericArrayType) || !Uv2.k(this, (GenericArrayType) obj)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.X;
        }

        public int hashCode() {
            return this.X.hashCode() | 1072;
        }

        public String toString() {
            return Uv2.Y(this);
        }

        public b(Type type) {
            this.X = type;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ParameterizedType {
        public final Class<?> X;
        public final Type Y;
        public final Type[] Z;

        public boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof ParameterizedType) || !Uv2.l(this, (ParameterizedType) obj)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.Z.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.Y;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.X;
        }

        public int hashCode() {
            return ((((this.X.hashCode() | 1136) << 4) | Objects.hashCode(this.Y)) << 8) | Arrays.hashCode(this.Z);
        }

        public String toString() {
            return Uv2.Y(this);
        }

        public c(Class<?> cls, Type type, Type[] typeArr) {
            this.X = cls;
            this.Y = type;
            this.Z = (Type[]) Arrays.copyOf(typeArr, typeArr.length, Type[].class);
        }
    }

    /* loaded from: classes4.dex */
    public static class d implements InterfaceC4943Zq<WildcardType> {
        public Type[] X;
        public Type[] Y;

        @Override // o.InterfaceC4943Zq
        /* renamed from: a */
        public WildcardType build() {
            return new e(this.X, this.Y);
        }

        public d b(Type... typeArr) {
            this.Y = typeArr;
            return this;
        }

        public d c(Type... typeArr) {
            this.X = typeArr;
            return this;
        }

        public d() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements WildcardType {
        public final Type[] X;
        public final Type[] Y;

        public boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof WildcardType) || !Uv2.n(this, (WildcardType) obj)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.Y.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.X.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.X) | 18688) << 8) | Arrays.hashCode(this.Y);
        }

        public String toString() {
            return Uv2.Y(this);
        }

        public e(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = C4206Se.w;
            this.X = (Type[]) C11304zt1.t(typeArr, typeArr3);
            this.Y = (Type[]) C11304zt1.t(typeArr2, typeArr3);
        }
    }

    public static Map<TypeVariable<?>, Type> A(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        HashMap hashMap;
        if (!G(cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = C8457oD.W(cls);
        }
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        if (cls2.equals(cls)) {
            return hashMap;
        }
        return E(u(cls, cls2), cls2, hashMap);
    }

    public static Map<TypeVariable<?>, Type> B(ParameterizedType parameterizedType) {
        return C(parameterizedType, y(parameterizedType), null);
    }

    public static Map<TypeVariable<?>, Type> C(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> hashMap;
        Class<?> y = y(parameterizedType);
        if (!G(y, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            hashMap = C(parameterizedType2, y(parameterizedType2), map);
        } else if (map == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = y.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            hashMap.put(typeParameters[i], hashMap.getOrDefault(type, type));
        }
        if (cls.equals(y)) {
            return hashMap;
        }
        return E(u(y, cls), cls, hashMap);
    }

    public static Map<TypeVariable<?>, Type> D(Type type, Class<?> cls) {
        return E(type, cls, null);
    }

    public static Map<TypeVariable<?>, Type> E(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return A((Class) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return C((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return E(genericComponentType, cls, map);
        }
        int i = 0;
        if (type instanceof WildcardType) {
            Type[] x = x((WildcardType) type);
            int length = x.length;
            while (i < length) {
                Type type2 = x[i];
                if (G(type2, cls)) {
                    return E(type2, cls, map);
                }
                i++;
            }
            return null;
        } else if (type instanceof TypeVariable) {
            Type[] v = v((TypeVariable) type);
            int length2 = v.length;
            while (i < length2) {
                Type type3 = v[i];
                if (G(type3, cls)) {
                    return E(type3, cls, map);
                }
                i++;
            }
            return null;
        } else {
            throw new IllegalStateException("found an unhandled type: " + type);
        }
    }

    public static boolean F(Type type) {
        if (!(type instanceof GenericArrayType)) {
            if (!(type instanceof Class) || !((Class) type).isArray()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean G(Type type, Class<?> cls) {
        if (type == null) {
            if (cls == null || !cls.isPrimitive()) {
                return true;
            }
            return false;
        } else if (cls == null) {
            return false;
        } else {
            if (cls.equals(type)) {
                return true;
            }
            if (type instanceof Class) {
                return C8457oD.P((Class) type, cls);
            }
            if (type instanceof ParameterizedType) {
                return G(y((ParameterizedType) type), cls);
            }
            if (type instanceof TypeVariable) {
                for (Type type2 : ((TypeVariable) type).getBounds()) {
                    if (G(type2, cls)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (cls.equals(Object.class) || (cls.isArray() && G(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType()))) {
                    return true;
                }
                return false;
            } else if (type instanceof WildcardType) {
                return false;
            } else {
                throw new IllegalStateException("found an unhandled type: " + type);
            }
        }
    }

    public static boolean H(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray() && K(cls.getComponentType(), genericComponentType, map)) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return K(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        } else {
            if (type instanceof WildcardType) {
                for (Type type2 : x((WildcardType) type)) {
                    if (J(type2, genericArrayType)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof TypeVariable) {
                for (Type type3 : v((TypeVariable) type)) {
                    if (J(type3, genericArrayType)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof ParameterizedType) {
                return false;
            } else {
                throw new IllegalStateException("found an unhandled type: " + type);
            }
        }
    }

    public static boolean I(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null || (type instanceof GenericArrayType)) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> y = y(parameterizedType);
        Map<TypeVariable<?>, Type> E = E(type, y, null);
        if (E == null) {
            return false;
        }
        if (E.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> C = C(parameterizedType, y, map);
        for (TypeVariable<?> typeVariable : C.keySet()) {
            Type c0 = c0(typeVariable, C);
            Type c02 = c0(typeVariable, E);
            if (c0 != null || !(c02 instanceof Class)) {
                if (c02 != null && c0 != null && !c0.equals(c02) && (!(c0 instanceof WildcardType) || !K(c02, c0, map))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean J(Type type, Type type2) {
        return K(type, type2, null);
    }

    public static boolean K(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 != null && !(type2 instanceof Class)) {
            if (type2 instanceof ParameterizedType) {
                return I(type, (ParameterizedType) type2, map);
            }
            if (type2 instanceof GenericArrayType) {
                return H(type, (GenericArrayType) type2, map);
            }
            if (type2 instanceof WildcardType) {
                return M(type, (WildcardType) type2, map);
            }
            if (type2 instanceof TypeVariable) {
                return L(type, (TypeVariable) type2, map);
            }
            throw new IllegalStateException("found an unhandled type: " + type2);
        }
        return G(type, (Class) type2);
    }

    public static boolean L(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : v((TypeVariable) type)) {
                if (L(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    public static boolean M(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] x = x(wildcardType);
        Type[] w = w(wildcardType);
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] x2 = x(wildcardType2);
            Type[] w2 = w(wildcardType2);
            for (Type type2 : x) {
                Type V = V(type2, map);
                for (Type type3 : x2) {
                    if (!K(type3, V, map)) {
                        return false;
                    }
                }
            }
            for (Type type4 : w) {
                Type V2 = V(type4, map);
                for (Type type5 : w2) {
                    if (!K(V2, type5, map)) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (Type type6 : x) {
            if (!K(type, V(type6, map), map)) {
                return false;
            }
        }
        for (Type type7 : w) {
            if (!K(V(type7, map), type, map)) {
                return false;
            }
        }
        return true;
    }

    public static boolean N(Object obj, Type type) {
        if (type == null) {
            return false;
        }
        if (obj == null) {
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                return false;
            }
            return true;
        }
        return K(obj.getClass(), type, null);
    }

    public static <T> void O(Class<T> cls, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            O(cls, (ParameterizedType) ownerType, map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = y(parameterizedType).getTypeParameters();
        List asList = Arrays.asList(cls.getTypeParameters());
        for (int i = 0; i < actualTypeArguments.length; i++) {
            TypeVariable<Class<?>> typeVariable = typeParameters[i];
            Type type = actualTypeArguments[i];
            if (asList.contains(type) && map.containsKey(typeVariable)) {
                map.put((TypeVariable) type, map.get(typeVariable));
            }
        }
    }

    public static Type[] P(Type[] typeArr) {
        C11147zE2.V(typeArr, "bounds", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Type type2 = typeArr[i];
                    if (type == type2 || !K(type2, type, null)) {
                        i++;
                    }
                } else {
                    hashSet.add(type);
                    break;
                }
            }
        }
        return (Type[]) hashSet.toArray(C4206Se.w);
    }

    public static final ParameterizedType Q(Class<?> cls, Map<TypeVariable<?>, Type> map) {
        C11147zE2.V(cls, "rawClass", new Object[0]);
        C11147zE2.V(map, "typeVariableMap", new Object[0]);
        return T(null, cls, p(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType R(Class<?> cls, Type... typeArr) {
        return T(null, cls, typeArr);
    }

    public static final ParameterizedType S(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        C11147zE2.V(cls, "rawClass", new Object[0]);
        C11147zE2.V(map, "typeVariableMap", new Object[0]);
        return T(type, cls, p(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType T(Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        boolean z2 = false;
        C11147zE2.V(cls, "rawClass", new Object[0]);
        if (cls.getEnclosingClass() == null) {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            C11147zE2.B(z, "no owner allowed for top-level %s", cls);
            type = null;
        } else if (type == null) {
            type = cls.getEnclosingClass();
        } else {
            C11147zE2.B(G(type, cls.getEnclosingClass()), "%s is invalid owner type for parameterized %s", type, cls);
        }
        C11147zE2.H(typeArr, "null type argument at index %s", new Object[0]);
        if (cls.getTypeParameters().length == typeArr.length) {
            z2 = true;
        }
        C11147zE2.B(z2, "invalid number of type parameters specified: expected %d, got %d", Integer.valueOf(cls.getTypeParameters().length), Integer.valueOf(typeArr.length));
        return new c(cls, type, typeArr);
    }

    public static String U(ParameterizedType parameterizedType) {
        StringBuilder sb = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb.append(((Class) ownerType).getName());
            } else {
                sb.append(ownerType.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        int[] q = q(parameterizedType);
        if (q.length > 0) {
            f(sb, q, parameterizedType.getActualTypeArguments());
        } else {
            sb.append('<');
            e(sb, C6566gU0.h, parameterizedType.getActualTypeArguments()).append('>');
        }
        return sb.toString();
    }

    public static Type V(Type type, Map<TypeVariable<?>, Type> map) {
        if ((type instanceof TypeVariable) && map != null) {
            Type type2 = map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalArgumentException("missing assignment type for type variable " + type);
        }
        return type;
    }

    public static String W(TypeVariable<?> typeVariable) {
        C11147zE2.V(typeVariable, "typeVariable", new Object[0]);
        StringBuilder sb = new StringBuilder();
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class<?> cls = (Class) genericDeclaration;
            while (cls.getEnclosingClass() != null) {
                sb.insert(0, cls.getSimpleName()).insert(0, '.');
                cls = cls.getEnclosingClass();
            }
            sb.insert(0, cls.getName());
        } else if (genericDeclaration instanceof Type) {
            sb.append(Y((Type) genericDeclaration));
        } else {
            sb.append(genericDeclaration);
        }
        sb.append(':');
        sb.append(Z(typeVariable));
        return sb.toString();
    }

    public static <T> String X(T t) {
        if (t instanceof Type) {
            return Y((Type) t);
        }
        return t.toString();
    }

    public static String Y(Type type) {
        C11147zE2.U(type);
        if (type instanceof Class) {
            return g((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return U((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return f0((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return Z((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return s((GenericArrayType) type);
        }
        throw new IllegalArgumentException(C11304zt1.A(type));
    }

    public static String Z(TypeVariable<?> typeVariable) {
        StringBuilder sb = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb.append(" extends ");
            e(sb, " & ", typeVariable.getBounds());
        }
        return sb.toString();
    }

    public static /* synthetic */ Type a(Type type) {
        return type;
    }

    public static boolean a0(Map<TypeVariable<?>, Type> map) {
        C11147zE2.V(map, "typeVariableMap", new Object[0]);
        for (Map.Entry<TypeVariable<?>, Type> entry : map.entrySet()) {
            Type value = entry.getValue();
            for (Type type : v(entry.getKey())) {
                if (!K(value, V(type, map), map)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Type[] b0(Map<TypeVariable<?>, Type> map, Type[] typeArr) {
        int i = 0;
        while (i < typeArr.length) {
            Type d0 = d0(map, typeArr[i]);
            if (d0 == null) {
                typeArr = (Type[]) C4206Se.Q2(typeArr, i);
                i--;
            } else {
                typeArr[i] = d0;
            }
            i++;
        }
        return typeArr;
    }

    public static Type c0(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                break;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    public static Type d0(Map<TypeVariable<?>, Type> map, Type type) {
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        if (h(type)) {
            if (type instanceof TypeVariable) {
                return d0(map, map.get(type));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getOwnerType() != null) {
                    HashMap hashMap = new HashMap(map);
                    hashMap.putAll(B(parameterizedType));
                    map = hashMap;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Type d0 = d0(map, actualTypeArguments[i]);
                    if (d0 != null) {
                        actualTypeArguments[i] = d0;
                    }
                }
                return T(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return e0().c(b0(map, wildcardType.getUpperBounds())).b(b0(map, wildcardType.getLowerBounds())).build();
            }
        }
        return type;
    }

    public static <T> StringBuilder e(StringBuilder sb, String str, T... tArr) {
        C11147zE2.Q(C11147zE2.G(tArr));
        if (tArr.length > 0) {
            sb.append(X(tArr[0]));
            for (int i = 1; i < tArr.length; i++) {
                sb.append(str);
                sb.append(X(tArr[i]));
            }
        }
        return sb;
    }

    public static d e0() {
        return new d();
    }

    public static void f(StringBuilder sb, int[] iArr, Type[] typeArr) {
        for (int i = 0; i < iArr.length; i++) {
            sb.append('<');
            e(sb, C6566gU0.h, typeArr[i].toString()).append('>');
        }
        Type[] typeArr2 = (Type[]) C4206Se.b3(typeArr, iArr);
        if (typeArr2.length > 0) {
            sb.append('<');
            e(sb, C6566gU0.h, typeArr2).append('>');
        }
    }

    public static String f0(WildcardType wildcardType) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length <= 1 && (lowerBounds.length != 1 || lowerBounds[0] == null)) {
            if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
                sb.append(" extends ");
                e(sb, " & ", upperBounds);
            }
        } else {
            sb.append(" super ");
            e(sb, " & ", lowerBounds);
        }
        return sb.toString();
    }

    public static String g(Class<?> cls) {
        if (cls.isArray()) {
            return Y(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(g(cls.getEnclosingClass()));
            sb.append('.');
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb.append('<');
            e(sb, C6566gU0.h, cls.getTypeParameters());
            sb.append('>');
        }
        return sb.toString();
    }

    public static <T> Xv2<T> g0(Class<T> cls) {
        return h0(cls);
    }

    public static boolean h(Type type) {
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof Class) {
            if (((Class) type).getTypeParameters().length > 0) {
                return true;
            }
            return false;
        } else if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (h(w(wildcardType)[0]) || h(x(wildcardType)[0])) {
                return true;
            }
            return false;
        } else if (!(type instanceof GenericArrayType)) {
            return false;
        } else {
            return h(((GenericArrayType) type).getGenericComponentType());
        }
    }

    public static <T> Xv2<T> h0(final Type type) {
        return new Xv2() { // from class: o.Tv2
            @Override // o.Xv2
            public final Type getType() {
                return Uv2.a(type);
            }
        };
    }

    public static boolean i(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return C4206Se.b0(typeVariable.getBounds(), parameterizedType);
    }

    public static Map<TypeVariable<?>, Type> j(Class<?> cls, ParameterizedType parameterizedType) {
        C11147zE2.V(cls, "cls", new Object[0]);
        C11147zE2.V(parameterizedType, "superParameterizedType", new Object[0]);
        Class<?> y = y(parameterizedType);
        if (!G(cls, y)) {
            return null;
        }
        if (cls.equals(y)) {
            return C(parameterizedType, y, null);
        }
        Type u = u(cls, y);
        if (u instanceof Class) {
            return j((Class) u, parameterizedType);
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) u;
        Map<TypeVariable<?>, Type> j = j(y(parameterizedType2), parameterizedType);
        O(cls, parameterizedType2, j);
        return j;
    }

    public static boolean k(GenericArrayType genericArrayType, Type type) {
        if ((type instanceof GenericArrayType) && m(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    public static boolean l(ParameterizedType parameterizedType, Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            if (m(parameterizedType.getRawType(), parameterizedType2.getRawType()) && m(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
                return o(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        }
        return false;
    }

    public static boolean m(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return l((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return k((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return n((WildcardType) type, type2);
        }
        return false;
    }

    public static boolean n(WildcardType wildcardType, Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            if (o(w(wildcardType), w(wildcardType2)) && o(x(wildcardType), x(wildcardType2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i = 0; i < typeArr.length; i++) {
            if (!m(typeArr[i], typeArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static Type[] p(Map<TypeVariable<?>, Type> map, TypeVariable<?>[] typeVariableArr) {
        Type[] typeArr = new Type[typeVariableArr.length];
        int length = typeVariableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            TypeVariable<?> typeVariable = typeVariableArr[i];
            C11147zE2.B(map.containsKey(typeVariable), "missing argument mapping for %s", Y(typeVariable));
            typeArr[i2] = map.get(typeVariable);
            i++;
            i2++;
        }
        return typeArr;
    }

    public static int[] q(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArr = new int[0];
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if ((type instanceof TypeVariable) && i((TypeVariable) type, parameterizedType)) {
                iArr = C4206Se.j(iArr, i);
            }
        }
        return iArr;
    }

    public static GenericArrayType r(Type type) {
        return new b((Type) C11147zE2.V(type, "componentType", new Object[0]));
    }

    public static String s(GenericArrayType genericArrayType) {
        return String.format("%s[]", Y(genericArrayType.getGenericComponentType()));
    }

    public static Type t(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return null;
            }
            return cls.getComponentType();
        } else if (!(type instanceof GenericArrayType)) {
            return null;
        } else {
            return ((GenericArrayType) type).getGenericComponentType();
        }
    }

    public static Type u(Class<?> cls, Class<?> cls2) {
        Type[] genericInterfaces;
        Class<?> cls3;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    cls3 = y((ParameterizedType) type2);
                } else if (type2 instanceof Class) {
                    cls3 = (Class) type2;
                } else {
                    throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                }
                if (G(cls3, cls2) && J(type, cls3)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] v(TypeVariable<?> typeVariable) {
        C11147zE2.V(typeVariable, "typeVariable", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : P(bounds);
    }

    public static Type[] w(WildcardType wildcardType) {
        C11147zE2.V(wildcardType, "wildcardType", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] x(WildcardType wildcardType) {
        C11147zE2.V(wildcardType, "wildcardType", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : P(upperBounds);
    }

    public static Class<?> y(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
    }

    public static Class<?> z(Type type, Type type2) {
        Map<TypeVariable<?>, Type> D;
        Type type3;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return y((ParameterizedType) type);
        }
        if (type instanceof TypeVariable) {
            if (type2 == null) {
                return null;
            }
            GenericDeclaration genericDeclaration = ((TypeVariable) type).getGenericDeclaration();
            if (!(genericDeclaration instanceof Class) || (D = D(type2, (Class) genericDeclaration)) == null || (type3 = D.get(type)) == null) {
                return null;
            }
            return z(type3, type2);
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(z(((GenericArrayType) type).getGenericComponentType(), type2), 0).getClass();
        } else {
            if (type instanceof WildcardType) {
                return null;
            }
            throw new IllegalArgumentException("unknown type: " + type);
        }
    }
}
