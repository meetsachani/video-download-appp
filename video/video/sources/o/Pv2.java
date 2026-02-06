package o;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AbstractC11205zT0;
import o.AbstractC5317bO0;
import o.AbstractC9481sO0;
import o.Ew2;
import o.Nv2;

@InterfaceC5359ba0
/* loaded from: classes3.dex */
public abstract class Pv2<T> extends AbstractC10095uv2<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final Type X;
    @MB
    public transient Nv2 Y;
    @MB
    public transient Nv2 Z;

    /* loaded from: classes3.dex */
    public class a extends AbstractC11205zT0.b<T> {
        public a(Method method) {
            super(method);
        }

        @Override // o.AbstractC11205zT0.b, o.AbstractC11205zT0
        public Type[] d() {
            return Pv2.this.r().l(super.d());
        }

        @Override // o.AbstractC11205zT0.b, o.AbstractC11205zT0
        public Type[] e() {
            return Pv2.this.u().l(super.e());
        }

        @Override // o.AbstractC11205zT0.b, o.AbstractC11205zT0
        public Type f() {
            return Pv2.this.r().j(super.f());
        }

        @Override // o.AbstractC11205zT0
        public Pv2<T> g() {
            return Pv2.this;
        }

        @Override // o.AbstractC11205zT0
        public String toString() {
            String valueOf = String.valueOf(g());
            String abstractC11205zT0 = super.toString();
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(abstractC11205zT0).length());
            sb.append(valueOf);
            sb.append(UE.h);
            sb.append(abstractC11205zT0);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC11205zT0.a<T> {
        public b(Constructor constructor) {
            super(constructor);
        }

        @Override // o.AbstractC11205zT0.a, o.AbstractC11205zT0
        public Type[] d() {
            return Pv2.this.r().l(super.d());
        }

        @Override // o.AbstractC11205zT0.a, o.AbstractC11205zT0
        public Type[] e() {
            return Pv2.this.u().l(super.e());
        }

        @Override // o.AbstractC11205zT0.a, o.AbstractC11205zT0
        public Type f() {
            return Pv2.this.r().j(super.f());
        }

        @Override // o.AbstractC11205zT0
        public Pv2<T> g() {
            return Pv2.this;
        }

        @Override // o.AbstractC11205zT0
        public String toString() {
            String valueOf = String.valueOf(g());
            String n = C7782lV0.p(C6566gU0.h).n(e());
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + String.valueOf(n).length());
            sb.append(valueOf);
            sb.append(C9811tl1.c);
            sb.append(n);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends Wv2 {
        public c() {
        }

        @Override // o.Wv2
        public void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // o.Wv2
        public void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // o.Wv2
        public void e(TypeVariable<?> typeVariable) {
            String valueOf = String.valueOf(Pv2.this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append(valueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.Wv2
        public void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    /* loaded from: classes3.dex */
    public class d extends Wv2 {
        public final /* synthetic */ AbstractC9481sO0.a b;

        public d(Pv2 pv2, AbstractC9481sO0.a aVar) {
            this.b = aVar;
        }

        @Override // o.Wv2
        public void b(Class<?> cls) {
            this.b.g(cls);
        }

        @Override // o.Wv2
        public void c(GenericArrayType genericArrayType) {
            this.b.g(Ew2.h(Pv2.T(genericArrayType.getGenericComponentType()).w()));
        }

        @Override // o.Wv2
        public void d(ParameterizedType parameterizedType) {
            this.b.g((Class) parameterizedType.getRawType());
        }

        @Override // o.Wv2
        public void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // o.Wv2
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        public final Type[] a;
        public final boolean b;

        public e(Type[] typeArr, boolean z) {
            this.a = typeArr;
            this.b = z;
        }

        public boolean a(Type type) {
            for (Type type2 : this.a) {
                boolean I = Pv2.T(type2).I(type);
                boolean z = this.b;
                if (I == z) {
                    return z;
                }
            }
            return !this.b;
        }

        public boolean b(Type type) {
            Pv2<?> T = Pv2.T(type);
            for (Type type2 : this.a) {
                boolean I = T.I(type2);
                boolean z = this.b;
                if (I == z) {
                    return z;
                }
            }
            return !this.b;
        }
    }

    /* loaded from: classes3.dex */
    public final class f extends Pv2<T>.k {
        private static final long serialVersionUID = 0;
        @MB
        public transient AbstractC9481sO0<Pv2<? super T>> Z;

        public f() {
            super();
        }

        private Object readResolve() {
            return Pv2.this.D().b6();
        }

        @Override // o.Pv2.k, o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<Pv2<? super T>> M5() {
            AbstractC9481sO0<Pv2<? super T>> abstractC9481sO0 = this.Z;
            if (abstractC9481sO0 == null) {
                AbstractC9481sO0<Pv2<? super T>> j0 = AbstractC10343vw0.J(i.a.a().d(Pv2.this)).F(j.X).j0();
                this.Z = j0;
                return j0;
            }
            return abstractC9481sO0;
        }

        @Override // o.Pv2.k
        public Pv2<T>.k c6() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // o.Pv2.k
        public Set<Class<? super T>> d6() {
            return AbstractC9481sO0.G(i.b.a().c(Pv2.this.x()));
        }

        public /* synthetic */ f(Pv2 pv2, a aVar) {
            this();
        }

        @Override // o.Pv2.k
        public Pv2<T>.k b6() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h<T> extends Pv2<T> {
        private static final long serialVersionUID = 0;

        public h(Type type) {
            super(type, null);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class i<K> {
        public static final i<Pv2<?>> a = new a();
        public static final i<Class<?>> b = new b();

        /* loaded from: classes3.dex */
        public class a extends i<Pv2<?>> {
            public a() {
                super(null);
            }

            @Override // o.Pv2.i
            /* renamed from: i */
            public Iterable<? extends Pv2<?>> e(Pv2<?> pv2) {
                return pv2.s();
            }

            @Override // o.Pv2.i
            /* renamed from: j */
            public Class<?> f(Pv2<?> pv2) {
                return pv2.w();
            }

            @Override // o.Pv2.i
            @MB
            /* renamed from: k */
            public Pv2<?> g(Pv2<?> pv2) {
                return pv2.t();
            }
        }

        /* loaded from: classes3.dex */
        public class c extends e<K> {
            public c(i iVar, i iVar2) {
                super(iVar2);
            }

            @Override // o.Pv2.i
            public AbstractC5317bO0<K> c(Iterable<? extends K> iterable) {
                AbstractC5317bO0.a r = AbstractC5317bO0.r();
                for (K k : iterable) {
                    if (!f(k).isInterface()) {
                        r.g(k);
                    }
                }
                return super.c(r.e());
            }

            @Override // o.Pv2.i.e, o.Pv2.i
            public Iterable<? extends K> e(K k) {
                return AbstractC9481sO0.M();
            }
        }

        /* loaded from: classes3.dex */
        public class d extends AbstractC10587ww1<K> {
            public final /* synthetic */ Map Y0;
            public final /* synthetic */ Comparator Z;

            public d(Comparator comparator, Map map) {
                this.Z = comparator;
                this.Y0 = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.AbstractC10587ww1, java.util.Comparator
            public int compare(K k, K k2) {
                Comparator comparator = this.Z;
                Object obj = this.Y0.get(k);
                Objects.requireNonNull(obj);
                Object obj2 = this.Y0.get(k2);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* loaded from: classes3.dex */
        public static class e<K> extends i<K> {
            public final i<K> c;

            public e(i<K> iVar) {
                super(null);
                this.c = iVar;
            }

            @Override // o.Pv2.i
            public Iterable<? extends K> e(K k) {
                return this.c.e(k);
            }

            @Override // o.Pv2.i
            public Class<?> f(K k) {
                return this.c.f(k);
            }

            @Override // o.Pv2.i
            @MB
            public K g(K k) {
                return this.c.g(k);
            }
        }

        public i() {
        }

        public static <K, V> AbstractC5317bO0<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (AbstractC5317bO0<K>) new d(comparator, map).l(map.keySet());
        }

        public final i<K> a() {
            return new c(this, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public final int b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = f(k).isInterface();
            int i = isInterface;
            for (K k2 : e(k)) {
                i = Math.max(i, b(k2, map));
            }
            K g = g(k);
            int i2 = i;
            if (g != null) {
                i2 = Math.max(i, b(g, map));
            }
            int i3 = i2 + 1;
            map.put(k, Integer.valueOf(i3));
            return i3;
        }

        public AbstractC5317bO0<K> c(Iterable<? extends K> iterable) {
            HashMap Y = C7935m81.Y();
            for (K k : iterable) {
                b(k, Y);
            }
            return h(Y, AbstractC10587ww1.z().E());
        }

        public final AbstractC5317bO0<K> d(K k) {
            return c(AbstractC5317bO0.M(k));
        }

        public abstract Iterable<? extends K> e(K k);

        public abstract Class<?> f(K k);

        @MB
        public abstract K g(K k);

        public /* synthetic */ i(a aVar) {
            this();
        }

        /* loaded from: classes3.dex */
        public class b extends i<Class<?>> {
            public b() {
                super(null);
            }

            @Override // o.Pv2.i
            /* renamed from: i */
            public Iterable<? extends Class<?>> e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // o.Pv2.i
            @MB
            /* renamed from: k */
            public Class<?> g(Class<?> cls) {
                return cls.getSuperclass();
            }

            @Override // o.Pv2.i
            /* renamed from: j */
            public Class<?> f(Class<?> cls) {
                return cls;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class j implements IF1<Pv2<?>> {
        public static final j X = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
        public static final j Y = new b("INTERFACE_ONLY", 1);
        public static final /* synthetic */ j[] Z = e();

        /* loaded from: classes3.dex */
        public enum a extends j {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IF1
            /* renamed from: g */
            public boolean apply(Pv2<?> pv2) {
                if (!(pv2.X instanceof TypeVariable) && !(pv2.X instanceof WildcardType)) {
                    return true;
                }
                return false;
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends j {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IF1
            /* renamed from: g */
            public boolean apply(Pv2<?> pv2) {
                return pv2.w().isInterface();
            }
        }

        public j(String str, int i) {
        }

        public static /* synthetic */ j[] e() {
            return new j[]{X, Y};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) Z.clone();
        }

        public /* synthetic */ j(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* loaded from: classes3.dex */
    public class k extends AbstractC2804Dy0<Pv2<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        @MB
        public transient AbstractC9481sO0<Pv2<? super T>> X;

        public k() {
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<Pv2<? super T>> M5() {
            AbstractC9481sO0<Pv2<? super T>> abstractC9481sO0 = this.X;
            if (abstractC9481sO0 == null) {
                AbstractC9481sO0<Pv2<? super T>> j0 = AbstractC10343vw0.J(i.a.d(Pv2.this)).F(j.X).j0();
                this.X = j0;
                return j0;
            }
            return abstractC9481sO0;
        }

        public Pv2<T>.k b6() {
            return new f(Pv2.this, null);
        }

        public Pv2<T>.k c6() {
            return new g(this);
        }

        public Set<Class<? super T>> d6() {
            return AbstractC9481sO0.G(i.b.c(Pv2.this.x()));
        }
    }

    public /* synthetic */ Pv2(Type type, a aVar) {
        this(type);
    }

    public static Type R(Type type) {
        return Ew2.d.Y.h(type);
    }

    public static <T> Pv2<T> S(Class<T> cls) {
        return new h(cls);
    }

    public static Pv2<?> T(Type type) {
        return new h(type);
    }

    @InterfaceC5299bJ2
    public static <T> Pv2<? extends T> Z(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (Pv2<? extends T>) T(Ew2.j(Z(cls.getComponentType()).X));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            type = Z(cls.getEnclosingClass()).X;
        } else {
            type = null;
        }
        if (typeParameters.length <= 0 && (type == null || type == cls.getEnclosingClass())) {
            return S(cls);
        }
        return (Pv2<? extends T>) T(Ew2.m(type, cls, typeParameters));
    }

    public static e f(Type[] typeArr) {
        return new e(typeArr, true);
    }

    public static Type i(TypeVariable<?> typeVariable, Type type) {
        if (type instanceof WildcardType) {
            return j(typeVariable, (WildcardType) type);
        }
        return l(type);
    }

    public static WildcardType j(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] upperBounds;
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!f(bounds).a(type)) {
                arrayList.add(l(type));
            }
        }
        return new Ew2.i(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    public static ParameterizedType k(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            actualTypeArguments[i2] = i(typeParameters[i2], actualTypeArguments[i2]);
        }
        return Ew2.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    public static Type l(Type type) {
        if (type instanceof ParameterizedType) {
            return k((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return Ew2.j(l(((GenericArrayType) type).getGenericComponentType()));
        }
        return type;
    }

    public static e n(Type[] typeArr) {
        return new e(typeArr, false);
    }

    public final Pv2<? super T> A(Class<? super T> cls) {
        C10664xF1.y(Y(cls), "%s is not a super class of %s", cls, this);
        Type type = this.X;
        if (type instanceof TypeVariable) {
            return B(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return B(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return p(cls);
        }
        return (Pv2<? super T>) V(Z(cls).X);
    }

    public final Pv2<? super T> B(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            Pv2<?> T = T(type);
            if (T.I(cls)) {
                return (Pv2<? super T>) T.A(cls);
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 23 + valueOf2.length());
        sb.append(valueOf);
        sb.append(" isn't a super type of ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Type C() {
        return this.X;
    }

    public final Pv2<T>.k D() {
        return new k();
    }

    public final boolean E(Type type, TypeVariable<?> typeVariable) {
        if (this.X.equals(type)) {
            return true;
        }
        if (type instanceof WildcardType) {
            WildcardType j2 = j(typeVariable, (WildcardType) type);
            if (n(j2.getUpperBounds()).b(this.X) && n(j2.getLowerBounds()).a(this.X)) {
                return true;
            }
            return false;
        }
        return l(this.X).equals(l(type));
    }

    public final boolean F() {
        if (q() != null) {
            return true;
        }
        return false;
    }

    public final boolean G(Type type) {
        Iterator<Pv2<? super T>> it = D().iterator();
        while (it.hasNext()) {
            Type v = it.next().v();
            if (v != null && T(v).I(type)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        Type type = this.X;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }

    public final boolean I(Type type) {
        C10664xF1.E(type);
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getLowerBounds()).b(this.X);
        }
        Type type2 = this.X;
        if (type2 instanceof WildcardType) {
            return f(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            if (!type2.equals(type) && !f(((TypeVariable) this.X).getBounds()).a(type)) {
                return false;
            }
            return true;
        } else if (type2 instanceof GenericArrayType) {
            return T(type).O((GenericArrayType) this.X);
        } else {
            if (type instanceof Class) {
                return Y((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return L((ParameterizedType) type);
            }
            if (!(type instanceof GenericArrayType)) {
                return false;
            }
            return K((GenericArrayType) type);
        }
    }

    public final boolean J(Pv2<?> pv2) {
        return I(pv2.C());
    }

    public final boolean K(GenericArrayType genericArrayType) {
        Type type = this.X;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return false;
            }
            return S(cls.getComponentType()).I(genericArrayType.getGenericComponentType());
        } else if (!(type instanceof GenericArrayType)) {
            return false;
        } else {
            return T(((GenericArrayType) type).getGenericComponentType()).I(genericArrayType.getGenericComponentType());
        }
    }

    public final boolean L(ParameterizedType parameterizedType) {
        Class<? super Object> w = T(parameterizedType).w();
        if (!Y(w)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = w.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < typeParameters.length; i2++) {
            if (!T(r().j(typeParameters[i2])).E(actualTypeArguments[i2], typeParameters[i2])) {
                return false;
            }
        }
        if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null && !G(parameterizedType.getOwnerType())) {
            return false;
        }
        return true;
    }

    public final boolean M(Type type) {
        return T(type).I(C());
    }

    public final boolean N(Pv2<?> pv2) {
        return pv2.I(C());
    }

    public final boolean O(GenericArrayType genericArrayType) {
        Type type = this.X;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return T(genericArrayType.getGenericComponentType()).I(cls.getComponentType());
        } else if (type instanceof GenericArrayType) {
            return T(genericArrayType.getGenericComponentType()).I(((GenericArrayType) this.X).getGenericComponentType());
        } else {
            return false;
        }
    }

    public final boolean P() {
        return C9211rH1.c().contains(this.X);
    }

    @InterfaceC4238Sm
    public final AbstractC11205zT0<T, Object> Q(Method method) {
        C10664xF1.y(Y(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    @InterfaceC6181ey
    public final Pv2<T> U() {
        new c().a(this.X);
        return this;
    }

    public final Pv2<?> V(Type type) {
        Pv2<?> T = T(r().j(type));
        T.Z = this.Z;
        T.Y = this.Y;
        return T;
    }

    public final Pv2<?> W(Type type) {
        C10664xF1.E(type);
        return T(u().j(type));
    }

    public final Type X(Class<?> cls) {
        if ((this.X instanceof Class) && (cls.getTypeParameters().length == 0 || w().getTypeParameters().length != 0)) {
            return cls;
        }
        Pv2 Z = Z(cls);
        return new Nv2().n(Z.A(w()).X, this.X).j(Z.X);
    }

    public final boolean Y(Class<?> cls) {
        AbstractC6237fB2<Class<? super T>> it = x().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final Pv2<T> a0() {
        if (P()) {
            return S(C9211rH1.e((Class) this.X));
        }
        return this;
    }

    public final <X> Pv2<T> b0(Ev2<X> ev2, Class<X> cls) {
        return c0(ev2, S(cls));
    }

    public final <X> Pv2<T> c0(Ev2<X> ev2, Pv2<X> pv2) {
        return new h(new Nv2().o(AbstractC6044eO0.v(new Nv2.d(ev2.X), pv2.X)).j(this.X));
    }

    public final Pv2<T> d0() {
        if (H()) {
            return S(C9211rH1.f((Class) this.X));
        }
        return this;
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof Pv2) {
            return this.X.equals(((Pv2) obj).X);
        }
        return false;
    }

    @MB
    public final Pv2<? super T> g(Type type) {
        Pv2<? super T> pv2 = (Pv2<? super T>) T(type);
        if (pv2.w().isInterface()) {
            return null;
        }
        return pv2;
    }

    public final AbstractC5317bO0<Pv2<? super T>> h(Type[] typeArr) {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (Type type : typeArr) {
            Pv2<?> T = T(type);
            if (T.w().isInterface()) {
                r.g(T);
            }
        }
        return r.e();
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @InterfaceC4238Sm
    public final AbstractC11205zT0<T, T> m(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == w()) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.y(z, "%s not declared by %s", constructor, w());
        return new b(constructor);
    }

    public final Pv2<? extends T> o(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            Pv2<?> q = q();
            Objects.requireNonNull(q);
            return (Pv2<? extends T>) T(R(q.y(componentType).X));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb.append(valueOf);
        sb.append(" does not appear to be a subtype of ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Pv2<? super T> p(Class<? super T> cls) {
        Pv2<?> q = q();
        if (q != null) {
            Class componentType = cls.getComponentType();
            Objects.requireNonNull(componentType);
            return (Pv2<? super T>) T(R(q.A(componentType).X));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 23 + valueOf2.length());
        sb.append(valueOf);
        sb.append(" isn't a super type of ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @MB
    public final Pv2<?> q() {
        Type i2 = Ew2.i(this.X);
        if (i2 == null) {
            return null;
        }
        return T(i2);
    }

    public final Nv2 r() {
        Nv2 nv2 = this.Z;
        if (nv2 == null) {
            Nv2 d2 = Nv2.d(this.X);
            this.Z = d2;
            return d2;
        }
        return nv2;
    }

    public final AbstractC5317bO0<Pv2<? super T>> s() {
        Type type = this.X;
        if (type instanceof TypeVariable) {
            return h(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds());
        }
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (Type type2 : w().getGenericInterfaces()) {
            r.g(V(type2));
        }
        return r.e();
    }

    @MB
    public final Pv2<? super T> t() {
        Type type = this.X;
        if (type instanceof TypeVariable) {
            return g(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = w().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (Pv2<? super T>) V(genericSuperclass);
    }

    public String toString() {
        return Ew2.s(this.X);
    }

    public final Nv2 u() {
        Nv2 nv2 = this.Y;
        if (nv2 == null) {
            Nv2 f2 = Nv2.f(this.X);
            this.Y = f2;
            return f2;
        }
        return nv2;
    }

    @MB
    public final Type v() {
        Type type = this.X;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    public final Class<? super T> w() {
        return x().iterator().next();
    }

    public Object writeReplace() {
        return T(new Nv2().j(this.X));
    }

    public final AbstractC9481sO0<Class<? super T>> x() {
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        new d(this, r).a(this.X);
        return r.e();
    }

    public final Pv2<? extends T> y(Class<?> cls) {
        C10664xF1.u(!(this.X instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.X;
        if (type instanceof WildcardType) {
            return z(cls, ((WildcardType) type).getLowerBounds());
        }
        if (F()) {
            return o(cls);
        }
        C10664xF1.y(w().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        Pv2<? extends T> pv2 = (Pv2<? extends T>) T(X(cls));
        C10664xF1.y(pv2.J(this), "%s does not appear to be a subtype of %s", pv2, this);
        return pv2;
    }

    public final Pv2<? extends T> z(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (Pv2<? extends T>) T(typeArr[0]).y(cls);
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
        sb.append(valueOf);
        sb.append(" isn't a subclass of ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public Pv2() {
        Type a2 = a();
        this.X = a2;
        C10664xF1.x0(!(a2 instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a2);
    }

    public Pv2(Class<?> cls) {
        Type a2 = super.a();
        if (a2 instanceof Class) {
            this.X = a2;
        } else {
            this.X = Nv2.d(cls).j(a2);
        }
    }

    public Pv2(Type type) {
        this.X = (Type) C10664xF1.E(type);
    }

    /* loaded from: classes3.dex */
    public final class g extends Pv2<T>.k {
        private static final long serialVersionUID = 0;
        @MB
        public transient AbstractC9481sO0<Pv2<? super T>> Y0;
        public final transient Pv2<T>.k Z;

        public g(Pv2<T>.k kVar) {
            super();
            this.Z = kVar;
        }

        private Object readResolve() {
            return Pv2.this.D().c6();
        }

        @Override // o.Pv2.k, o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<Pv2<? super T>> M5() {
            AbstractC9481sO0<Pv2<? super T>> abstractC9481sO0 = this.Y0;
            if (abstractC9481sO0 == null) {
                AbstractC9481sO0<Pv2<? super T>> j0 = AbstractC10343vw0.J(this.Z).F(j.Y).j0();
                this.Y0 = j0;
                return j0;
            }
            return abstractC9481sO0;
        }

        @Override // o.Pv2.k
        public Pv2<T>.k b6() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // o.Pv2.k
        public Set<Class<? super T>> d6() {
            return AbstractC10343vw0.J(i.b.c(Pv2.this.x())).F(new IF1() { // from class: o.Qv2
                @Override // o.IF1
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).j0();
        }

        @Override // o.Pv2.k
        public Pv2<T>.k c6() {
            return this;
        }
    }
}
