package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC6044eO0;
import o.Ew2;

@InterfaceC5359ba0
/* loaded from: classes3.dex */
public final class Nv2 {
    public final c a;

    /* loaded from: classes3.dex */
    public class a extends Wv2 {
        public final /* synthetic */ Map b;
        public final /* synthetic */ Type c;

        public a(Map map, Type type) {
            this.b = map;
            this.c = type;
        }

        @Override // o.Wv2
        public void b(Class<?> cls) {
            if (this.c instanceof WildcardType) {
                return;
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25 + valueOf2.length());
            sb.append("No type mapping from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.Wv2
        public void c(GenericArrayType genericArrayType) {
            boolean z;
            Type type = this.c;
            if (type instanceof WildcardType) {
                return;
            }
            Type i = Ew2.i(type);
            if (i != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "%s is not an array type.", this.c);
            Nv2.g(this.b, genericArrayType.getGenericComponentType(), i);
        }

        @Override // o.Wv2
        public void d(ParameterizedType parameterizedType) {
            boolean z;
            Type type = this.c;
            if (!(type instanceof WildcardType)) {
                ParameterizedType parameterizedType2 = (ParameterizedType) Nv2.e(ParameterizedType.class, type);
                if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                    Nv2.g(this.b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                }
                C10664xF1.y(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.c);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                if (actualTypeArguments.length == actualTypeArguments2.length) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.y(z, "%s not compatible with %s", parameterizedType, parameterizedType2);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Nv2.g(this.b, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }
        }

        @Override // o.Wv2
        public void e(TypeVariable<?> typeVariable) {
            this.b.put(new d(typeVariable), this.c);
        }

        @Override // o.Wv2
        public void f(WildcardType wildcardType) {
            boolean z;
            Type type = this.c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.y(z, "Incompatible type: %s vs. %s", wildcardType, this.c);
                for (int i = 0; i < upperBounds.length; i++) {
                    Nv2.g(this.b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    Nv2.g(this.b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Wv2 {
        public final Map<d, Type> b = C7935m81.Y();

        public static AbstractC6044eO0<d, Type> g(Type type) {
            C10664xF1.E(type);
            b bVar = new b();
            bVar.a(type);
            return AbstractC6044eO0.g(bVar.b);
        }

        @Override // o.Wv2
        public void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // o.Wv2
        public void d(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            for (int i = 0; i < typeParameters.length; i++) {
                h(new d(typeParameters[i]), actualTypeArguments[i]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // o.Wv2
        public void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // o.Wv2
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }

        public final void h(d dVar, Type type) {
            if (!this.b.containsKey(dVar)) {
                Type type2 = type;
                while (type2 != null) {
                    if (dVar.a(type2)) {
                        while (type != null) {
                            type = this.b.remove(d.c(type));
                        }
                        return;
                    }
                    type2 = this.b.get(d.c(type2));
                }
                this.b.put(dVar, type);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public final TypeVariable<?> a;

        public d(TypeVariable<?> typeVariable) {
            this.a = (TypeVariable) C10664xF1.E(typeVariable);
        }

        @MB
        public static d c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        public boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public final boolean b(TypeVariable<?> typeVariable) {
            if (this.a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.a.getName().equals(typeVariable.getName())) {
                return true;
            }
            return false;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(this.a.getGenericDeclaration(), this.a.getName());
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        public static final e b = new e();
        public final AtomicInteger a;

        /* loaded from: classes3.dex */
        public class a extends e {
            public final /* synthetic */ TypeVariable c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.c = typeVariable;
            }

            @Override // o.Nv2.e
            public TypeVariable<?> b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        public final Type a(Type type) {
            C10664xF1.E(type);
            if (type instanceof Class) {
                return type;
            }
            if (type instanceof TypeVariable) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Ew2.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable<?>[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = d(typeParameters[i]).a(actualTypeArguments[i]);
                }
                return Ew2.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return b(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        public TypeVariable<?> b(Type[] typeArr) {
            int incrementAndGet = this.a.incrementAndGet();
            String n = C7782lV0.o('&').n(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 33);
            sb.append("capture#");
            sb.append(incrementAndGet);
            sb.append("-of ? extends ");
            sb.append(n);
            return Ew2.k(e.class, sb.toString(), typeArr);
        }

        @MB
        public final Type c(@MB Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        public final e d(TypeVariable<?> typeVariable) {
            return new a(this, this.a, typeVariable);
        }

        public final e e() {
            return new e(this.a);
        }

        public e() {
            this(new AtomicInteger());
        }

        public e(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }
    }

    public /* synthetic */ Nv2(c cVar, a aVar) {
        this(cVar);
    }

    public static Nv2 d(Type type) {
        return new Nv2().o(b.g(type));
    }

    public static <T> T e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + simpleName.length());
            sb.append(valueOf);
            sb.append(" is not a ");
            sb.append(simpleName);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Nv2 f(Type type) {
        return new Nv2().o(b.g(e.b.a(type)));
    }

    public static void g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).a(type);
    }

    public final Type h(GenericArrayType genericArrayType) {
        return Ew2.j(j(genericArrayType.getGenericComponentType()));
    }

    public final ParameterizedType i(ParameterizedType parameterizedType) {
        Type j;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            j = null;
        } else {
            j = j(ownerType);
        }
        return Ew2.m(j, (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    public Type j(Type type) {
        C10664xF1.E(type);
        if (type instanceof TypeVariable) {
            return this.a.a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return h((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            return m((WildcardType) type);
        }
        return type;
    }

    public final Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = j(typeArr[i]);
        }
        return typeArr2;
    }

    public Type[] l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = j(typeArr[i]);
        }
        return typeArr;
    }

    public final WildcardType m(WildcardType wildcardType) {
        return new Ew2.i(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public Nv2 n(Type type, Type type2) {
        HashMap Y = C7935m81.Y();
        g(Y, (Type) C10664xF1.E(type), (Type) C10664xF1.E(type2));
        return o(Y);
    }

    public Nv2 o(Map<d, ? extends Type> map) {
        return new Nv2(this.a.c(map));
    }

    /* loaded from: classes3.dex */
    public static class c {
        public final AbstractC6044eO0<d, Type> a;

        /* loaded from: classes3.dex */
        public class a extends c {
            public final /* synthetic */ TypeVariable b;
            public final /* synthetic */ c c;

            public a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.b = typeVariable;
                this.c = cVar2;
            }

            @Override // o.Nv2.c
            public Type b(TypeVariable<?> typeVariable, c cVar) {
                if (typeVariable.getGenericDeclaration().equals(this.b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.c.b(typeVariable, cVar);
            }
        }

        public c() {
            this.a = AbstractC6044eO0.u();
        }

        public final Type a(TypeVariable<?> typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
        public Type b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.a.get(new d(typeVariable));
            if (type == null) {
                Type[] bounds = typeVariable.getBounds();
                if (bounds.length != 0) {
                    Type[] k = new Nv2(cVar, null).k(bounds);
                    if (!Ew2.e.a || !Arrays.equals(bounds, k)) {
                        return Ew2.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), k);
                    }
                }
                return typeVariable;
            }
            return new Nv2(cVar, null).j(type);
        }

        public final c c(Map<d, ? extends Type> map) {
            AbstractC6044eO0.b b = AbstractC6044eO0.b();
            b.l(this.a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                C10664xF1.u(!key.a(value), "Type variable %s bound to itself", key);
                b.i(key, value);
            }
            return new c(b.d());
        }

        public c(AbstractC6044eO0<d, Type> abstractC6044eO0) {
            this.a = abstractC6044eO0;
        }
    }

    public Nv2() {
        this.a = new c();
    }

    public Nv2(c cVar) {
        this.a = cVar;
    }
}
