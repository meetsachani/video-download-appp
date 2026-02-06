package o;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5317bO0;
import o.AbstractC6044eO0;
import o.Ew2;
import okhttp3.HttpUrl;

@InterfaceC5359ba0
/* loaded from: classes3.dex */
public final class Ew2 {
    public static final C7782lV0 a = C7782lV0.p(C6566gU0.h).s("null");

    /* loaded from: classes3.dex */
    public class a extends Wv2 {
        public final /* synthetic */ AtomicReference b;

        public a(AtomicReference atomicReference) {
            this.b = atomicReference;
        }

        @Override // o.Wv2
        public void b(Class<?> cls) {
            this.b.set(cls.getComponentType());
        }

        @Override // o.Wv2
        public void c(GenericArrayType genericArrayType) {
            this.b.set(genericArrayType.getGenericComponentType());
        }

        @Override // o.Wv2
        public void e(TypeVariable<?> typeVariable) {
            this.b.set(Ew2.p(typeVariable.getBounds()));
        }

        @Override // o.Wv2
        public void f(WildcardType wildcardType) {
            this.b.set(Ew2.p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static final b X = new a("OWNED_BY_ENCLOSING_CLASS", 0);
        public static final b Y = new c("LOCAL_CLASS_HAS_NO_OWNER", 1);
        public static final /* synthetic */ b[] Y0 = e();
        public static final b Z = g();

        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.b
            @MB
            public Class<?> h(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* renamed from: o.Ew2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0181b<T> {
        }

        /* loaded from: classes3.dex */
        public enum c extends b {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.b
            @MB
            public Class<?> h(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        /* loaded from: classes3.dex */
        public class d extends C0181b<String> {
        }

        public b(String str, int i) {
        }

        public static /* synthetic */ b[] e() {
            return new b[]{X, Y};
        }

        public static b g() {
            b[] values;
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.h(C0181b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Y0.clone();
        }

        @MB
        public abstract Class<?> h(Class<?> cls);

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        public c(Type type) {
            this.X = d.Z0.j(type);
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof GenericArrayType) {
                return C2593Bt1.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
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
            return String.valueOf(Ew2.s(this.X)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class d {
        public static final d X;
        public static final d Y;
        public static final d Y0;
        public static final d Z;
        public static final d Z0;
        public static final /* synthetic */ d[] a1;

        /* loaded from: classes3.dex */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.d
            public Type j(Type type) {
                C10664xF1.E(type);
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new c(cls.getComponentType());
                    }
                    return type;
                }
                return type;
            }

            @Override // o.Ew2.d
            /* renamed from: m */
            public GenericArrayType h(Type type) {
                return new c(type);
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.d
            public Type h(Type type) {
                if (type instanceof Class) {
                    return Ew2.h((Class) type);
                }
                return new c(type);
            }

            @Override // o.Ew2.d
            public Type j(Type type) {
                return (Type) C10664xF1.E(type);
            }
        }

        /* loaded from: classes3.dex */
        public enum c extends d {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.d
            public Type h(Type type) {
                return d.Y.h(type);
            }

            @Override // o.Ew2.d
            public String i(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }

            @Override // o.Ew2.d
            public Type j(Type type) {
                return d.Y.j(type);
            }
        }

        /* renamed from: o.Ew2$d$d  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0182d extends d {
            public C0182d(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Ew2.d
            public boolean g() {
                return false;
            }

            @Override // o.Ew2.d
            public Type h(Type type) {
                return d.Z.h(type);
            }

            @Override // o.Ew2.d
            public String i(Type type) {
                return d.Z.i(type);
            }

            @Override // o.Ew2.d
            public Type j(Type type) {
                return d.Z.j(type);
            }
        }

        /* loaded from: classes3.dex */
        public class e extends AbstractC10095uv2<Map.Entry<String, int[][]>> {
        }

        /* loaded from: classes3.dex */
        public class f extends AbstractC10095uv2<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            X = aVar;
            b bVar = new b("JAVA7", 1);
            Y = bVar;
            c cVar = new c("JAVA8", 2);
            Z = cVar;
            C0182d c0182d = new C0182d("JAVA9", 3);
            Y0 = c0182d;
            a1 = e();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().a().toString().contains("java.util.Map.java.util.Map")) {
                    Z0 = cVar;
                } else {
                    Z0 = c0182d;
                }
            } else if (new f().a() instanceof Class) {
                Z0 = bVar;
            } else {
                Z0 = aVar;
            }
        }

        public d(String str, int i) {
        }

        public static /* synthetic */ d[] e() {
            return new d[]{X, Y, Z, Y0};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) a1.clone();
        }

        public boolean g() {
            return true;
        }

        public abstract Type h(Type type);

        public String i(Type type) {
            return Ew2.s(type);
        }

        public abstract Type j(Type type);

        public final AbstractC5317bO0<Type> l(Type[] typeArr) {
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (Type type : typeArr) {
                r.g(j(type));
            }
            return r.e();
        }

        public /* synthetic */ d(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<X> {
        public static final boolean a = !e.class.getTypeParameters()[0].equals(Ew2.k(e.class, "X", new Type[0]));
    }

    /* loaded from: classes3.dex */
    public static final class f implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        @MB
        public final Type X;
        public final AbstractC5317bO0<Type> Y;
        public final Class<?> Z;

        public f(@MB Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            C10664xF1.E(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            Ew2.f(typeArr, "type parameter");
            this.X = type;
            this.Z = cls;
            this.Y = d.Z0.l(typeArr);
        }

        public boolean equals(@MB Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !C2593Bt1.a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Ew2.r(this.Y);
        }

        @Override // java.lang.reflect.ParameterizedType
        @MB
        public Type getOwnerType() {
            return this.X;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.Z;
        }

        public int hashCode() {
            int hashCode;
            Type type = this.X;
            if (type == null) {
                hashCode = 0;
            } else {
                hashCode = type.hashCode();
            }
            return (hashCode ^ this.Y.hashCode()) ^ this.Z.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.X != null) {
                d dVar = d.Z0;
                if (dVar.g()) {
                    sb.append(dVar.i(this.X));
                    sb.append('.');
                }
            }
            sb.append(this.Z.getName());
            sb.append('<');
            C7782lV0 c7782lV0 = Ew2.a;
            AbstractC5317bO0<Type> abstractC5317bO0 = this.Y;
            final d dVar2 = d.Z0;
            Objects.requireNonNull(dVar2);
            sb.append(c7782lV0.k(C5098aU0.U(abstractC5317bO0, new YA0() { // from class: o.Fw2
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return Ew2.d.this.i((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<D extends GenericDeclaration> {
        public final D a;
        public final String b;
        public final AbstractC5317bO0<Type> c;

        public g(D d, String str, Type[] typeArr) {
            Ew2.f(typeArr, "bound for type variable");
            this.a = (D) C10664xF1.E(d);
            this.b = (String) C10664xF1.E(str);
            this.c = AbstractC5317bO0.H(typeArr);
        }

        public Type[] a() {
            return Ew2.r(this.c);
        }

        public D b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(@MB Object obj) {
            if (e.a) {
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof h)) {
                    g gVar = ((h) Proxy.getInvocationHandler(obj)).a;
                    if (this.b.equals(gVar.c()) && this.a.equals(gVar.b()) && this.c.equals(gVar.c)) {
                        return true;
                    }
                }
                return false;
            }
            if (obj instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public String toString() {
            return this.b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements InvocationHandler {
        public static final AbstractC6044eO0<String, Method> b;
        public final g<?> a;

        static {
            Method[] methods;
            AbstractC6044eO0.b b2 = AbstractC6044eO0.b();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    b2.i(method.getName(), method);
                }
            }
            b = b2.c();
        }

        public h(g<?> gVar) {
            this.a = gVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @MB
        public Object invoke(Object obj, Method method, @MB Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
            throw new UnsupportedOperationException(name);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC5317bO0<Type> X;
        public final AbstractC5317bO0<Type> Y;

        public i(Type[] typeArr, Type[] typeArr2) {
            Ew2.f(typeArr, "lower bound for wildcard");
            Ew2.f(typeArr2, "upper bound for wildcard");
            d dVar = d.Z0;
            this.X = dVar.l(typeArr);
            this.Y = dVar.l(typeArr2);
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.X.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.Y.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Ew2.r(this.X);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Ew2.r(this.Y);
        }

        public int hashCode() {
            return this.X.hashCode() ^ this.Y.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            AbstractC6237fB2<Type> it = this.X.iterator();
            while (it.hasNext()) {
                sb.append(" super ");
                sb.append(d.Z0.i(it.next()));
            }
            for (Type type : Ew2.g(this.Y)) {
                sb.append(" extends ");
                sb.append(d.Z0.i(type));
            }
            return sb.toString();
        }
    }

    public static void f(Type[] typeArr, String str) {
        Class cls;
        for (Type type : typeArr) {
            if (type instanceof Class) {
                C10664xF1.y(!cls.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Iterable<Type> g(Iterable<Type> iterable) {
        return C5098aU0.p(iterable, C7985mG1.q(C7985mG1.m(Object.class)));
    }

    public static Class<?> h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    @MB
    public static Type i(Type type) {
        C10664xF1.E(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    public static Type j(Type type) {
        boolean z;
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            boolean z2 = true;
            if (lowerBounds.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return q(j(lowerBounds[0]));
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length != 1) {
                z2 = false;
            }
            C10664xF1.e(z2, "Wildcard should have only one upper bound.");
            return o(j(upperBounds[0]));
        }
        return d.Z0.h(type);
    }

    public static <D extends GenericDeclaration> TypeVariable<D> k(D d2, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(d2, str, typeArr);
    }

    public static ParameterizedType l(Class<?> cls, Type... typeArr) {
        return new f(b.Z.h(cls), cls, typeArr);
    }

    public static ParameterizedType m(@MB Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return l(cls, typeArr);
        }
        C10664xF1.E(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "Owner type for unenclosed %s", cls);
        return new f(type, cls, typeArr);
    }

    public static <D extends GenericDeclaration> TypeVariable<D> n(D d2, String str, Type[] typeArr) {
        return (TypeVariable) C7037iQ1.d(TypeVariable.class, new h(new g(d2, str, typeArr)));
    }

    @InterfaceC5299bJ2
    public static WildcardType o(Type type) {
        return new i(new Type[0], new Type[]{type});
    }

    @MB
    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type i2 = i(type);
            if (i2 != null) {
                if (i2 instanceof Class) {
                    Class cls = (Class) i2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(i2);
            }
        }
        return null;
    }

    @InterfaceC5299bJ2
    public static WildcardType q(Type type) {
        return new i(new Type[]{type}, new Type[]{Object.class});
    }

    public static Type[] r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static String s(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
