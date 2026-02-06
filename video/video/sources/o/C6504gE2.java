package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;

/* renamed from: o.gE2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6504gE2 {
    public static final Type[] a = new Type[0];
    public static boolean b = true;

    /* renamed from: o.gE2$a */
    /* loaded from: classes4.dex */
    public static final class a implements GenericArrayType {
        public final Type X;

        public a(Type type) {
            this.X = type;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && C6504gE2.d(this, (GenericArrayType) obj)) {
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
            return C6504gE2.u(this.X) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: o.gE2$b */
    /* loaded from: classes4.dex */
    public static final class b implements ParameterizedType {
        @InterfaceC10571ws1
        public final Type X;
        public final Type Y;
        public final Type[] Z;

        public b(@InterfaceC10571ws1 Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C6504gE2.b(type3);
            }
            this.X = type;
            this.Y = type2;
            this.Z = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && C6504gE2.d(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.Z.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @InterfaceC10571ws1
        public Type getOwnerType() {
            return this.X;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.Y;
        }

        public int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.Z) ^ this.Y.hashCode();
            Type type = this.X;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public String toString() {
            Type[] typeArr = this.Z;
            if (typeArr.length == 0) {
                return C6504gE2.u(this.Y);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C6504gE2.u(this.Y));
            sb.append("<");
            sb.append(C6504gE2.u(this.Z[0]));
            for (int i = 1; i < this.Z.length; i++) {
                sb.append(C6566gU0.h);
                sb.append(C6504gE2.u(this.Z[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: o.gE2$c */
    /* loaded from: classes4.dex */
    public static final class c implements WildcardType {
        public final Type X;
        @InterfaceC10571ws1
        public final Type Y;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        typeArr2[0].getClass();
                        C6504gE2.b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.Y = typeArr2[0];
                            this.X = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    typeArr[0].getClass();
                    C6504gE2.b(typeArr[0]);
                    this.Y = null;
                    this.X = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && C6504gE2.d(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.Y;
            return type != null ? new Type[]{type} : C6504gE2.a;
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
                return "? super " + C6504gE2.u(this.Y);
            } else if (this.X == Object.class) {
                return "?";
            } else {
                return "? extends " + C6504gE2.u(this.X);
            }
        }
    }

    public static ResponseBody a(ResponseBody responseBody) throws IOException {
        C5422bq c5422bq = new C5422bq();
        responseBody.source().k5(c5422bq);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), c5422bq);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @InterfaceC10571ws1
    public static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean d(Type type, Type type2) {
        boolean z;
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z && equals && equals2) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getLowerBounds()[0];
        }
        return type;
    }

    public static Type g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static Class<?> h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return r(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(@InterfaceC10571ws1 Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static int k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Type type) {
        if (!b || type != C7458kA2.class) {
            return false;
        }
        return true;
    }

    public static RuntimeException n(Method method, String str, Object... objArr) {
        return o(method, null, str, objArr);
    }

    public static RuntimeException o(Method method, @InterfaceC10571ws1 Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + UE.h + method.getName(), th);
    }

    public static RuntimeException p(Method method, int i, String str, Object... objArr) {
        String a2 = C8459oD1.b.a(method, i);
        return n(method, str + " (" + a2 + C9811tl1.d, objArr);
    }

    public static RuntimeException q(Method method, Throwable th, int i, String str, Object... objArr) {
        String a2 = C8459oD1.b.a(method, i);
        return o(method, th, str + " (" + a2 + C9811tl1.d, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type r(Type type, Class<?> cls, Type type2) {
        Type type3;
        boolean z;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type s = s(type, cls, typeVariable);
            if (s == typeVariable) {
                return s;
            }
            type3 = s;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type r = r(type, cls, componentType);
                if (componentType == r) {
                    return cls2;
                }
                return new a(r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type r2 = r(type, cls, genericComponentType);
            if (genericComponentType == r2) {
                return genericArrayType;
            }
            return new a(r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type r3 = r(type, cls, ownerType);
            if (r3 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type r4 = r(type, cls, actualTypeArguments[i]);
                if (r4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = r4;
                }
            }
            if (z) {
                return new b(r3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        WildcardType wildcardType = type3;
        if (z2) {
            WildcardType wildcardType2 = (WildcardType) type3;
            Type[] lowerBounds = wildcardType2.getLowerBounds();
            Type[] upperBounds = wildcardType2.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type r5 = r(type, cls, lowerBounds[0]);
                wildcardType = wildcardType2;
                if (r5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{r5});
                }
            } else {
                wildcardType = wildcardType2;
                if (upperBounds.length == 1) {
                    Type r6 = r(type, cls, upperBounds[0]);
                    wildcardType = wildcardType2;
                    if (r6 != upperBounds[0]) {
                        return new c(new Type[]{r6}, a);
                    }
                }
            }
        }
        return wildcardType;
    }

    public static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c2 = c(typeVariable);
        if (c2 != null) {
            Type e = e(type, cls, c2);
            if (e instanceof ParameterizedType) {
                return ((ParameterizedType) e).getActualTypeArguments()[k(c2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static void t(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
