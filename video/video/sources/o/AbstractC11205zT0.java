package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import o.AbstractC5317bO0;

@InterfaceC5359ba0
@InterfaceC4238Sm
/* renamed from: o.zT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11205zT0<T, R> implements AnnotatedElement, Member {
    public final AccessibleObject X;
    public final Member Y;

    /* renamed from: o.zT0$a */
    /* loaded from: classes3.dex */
    public static class a<T> extends AbstractC11205zT0<T, T> {
        public final Constructor<?> Z;

        public a(Constructor<?> constructor) {
            super(constructor);
            this.Z = constructor;
        }

        public final boolean E() {
            Class<?> declaringClass = this.Z.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            if (declaringClass.getEnclosingClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC11205zT0
        public Type[] d() {
            return this.Z.getGenericExceptionTypes();
        }

        @Override // o.AbstractC11205zT0
        public Type[] e() {
            Type[] genericParameterTypes = this.Z.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && E()) {
                Class<?>[] parameterTypes = this.Z.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
                return genericParameterTypes;
            }
            return genericParameterTypes;
        }

        @Override // o.AbstractC11205zT0
        public Type f() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            if (typeParameters.length > 0) {
                return Ew2.l(declaringClass, typeParameters);
            }
            return declaringClass;
        }

        @Override // o.AbstractC11205zT0
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.Z.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // o.AbstractC11205zT0
        public final Annotation[][] h() {
            return this.Z.getParameterAnnotations();
        }

        @Override // o.AbstractC11205zT0
        public final Object l(@MB Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            try {
                return this.Z.newInstance(objArr);
            } catch (InstantiationException e) {
                String valueOf = String.valueOf(this.Z);
                StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                sb.append(valueOf);
                sb.append(" failed.");
                throw new RuntimeException(sb.toString(), e);
            }
        }

        @Override // o.AbstractC11205zT0
        public final boolean q() {
            return false;
        }

        @Override // o.AbstractC11205zT0
        public final boolean y() {
            return this.Z.isVarArgs();
        }
    }

    /* renamed from: o.zT0$b */
    /* loaded from: classes3.dex */
    public static class b<T> extends AbstractC11205zT0<T, Object> {
        public final Method Z;

        public b(Method method) {
            super(method);
            this.Z = method;
        }

        @Override // o.AbstractC11205zT0
        public Type[] d() {
            return this.Z.getGenericExceptionTypes();
        }

        @Override // o.AbstractC11205zT0
        public Type[] e() {
            return this.Z.getGenericParameterTypes();
        }

        @Override // o.AbstractC11205zT0
        public Type f() {
            return this.Z.getGenericReturnType();
        }

        @Override // o.AbstractC11205zT0
        public final TypeVariable<?>[] getTypeParameters() {
            return this.Z.getTypeParameters();
        }

        @Override // o.AbstractC11205zT0
        public final Annotation[][] h() {
            return this.Z.getParameterAnnotations();
        }

        @Override // o.AbstractC11205zT0
        @MB
        public final Object l(@MB Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            return this.Z.invoke(obj, objArr);
        }

        @Override // o.AbstractC11205zT0
        public final boolean q() {
            if (!o() && !s() && !v() && !Modifier.isFinal(getDeclaringClass().getModifiers())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC11205zT0
        public final boolean y() {
            return this.Z.isVarArgs();
        }
    }

    public <M extends AccessibleObject & Member> AbstractC11205zT0(M m) {
        C10664xF1.E(m);
        this.X = m;
        this.Y = m;
    }

    public static <T> AbstractC11205zT0<T, T> a(Constructor<T> constructor) {
        return new a(constructor);
    }

    public static AbstractC11205zT0<?, Object> b(Method method) {
        return new b(method);
    }

    public final <R1 extends R> AbstractC11205zT0<T, R1> A(Class<R1> cls) {
        return B(Pv2.S(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> AbstractC11205zT0<T, R1> B(Pv2<R1> pv2) {
        if (pv2.N(j())) {
            return this;
        }
        String valueOf = String.valueOf(j());
        String valueOf2 = String.valueOf(pv2);
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + valueOf2.length());
        sb.append("Invokable is known to return ");
        sb.append(valueOf);
        sb.append(", not ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void C(boolean z) {
        this.X.setAccessible(z);
    }

    public final boolean D() {
        try {
            this.X.setAccessible(true);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final AbstractC5317bO0<Pv2<? extends Throwable>> c() {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (Type type : d()) {
            r.g(Pv2.T(type));
        }
        return r.e();
    }

    public abstract Type[] d();

    public abstract Type[] e();

    public boolean equals(@MB Object obj) {
        if (obj instanceof AbstractC11205zT0) {
            AbstractC11205zT0 abstractC11205zT0 = (AbstractC11205zT0) obj;
            if (g().equals(abstractC11205zT0.g()) && this.Y.equals(abstractC11205zT0.Y)) {
                return true;
            }
        }
        return false;
    }

    public abstract Type f();

    public Pv2<T> g() {
        return Pv2.S(getDeclaringClass());
    }

    @Override // java.lang.reflect.AnnotatedElement
    @MB
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.X.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.X.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.X.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.Y.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.Y.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.Y.getName();
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public abstract Annotation[][] h();

    public int hashCode() {
        return this.Y.hashCode();
    }

    public final AbstractC5317bO0<C4862Yx1> i() {
        Type[] e = e();
        Annotation[][] h = h();
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (int i = 0; i < e.length; i++) {
            r.g(new C4862Yx1(this, i, Pv2.T(e[i]), h[i]));
        }
        return r.e();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.X.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.Y.isSynthetic();
    }

    public final Pv2<? extends R> j() {
        return (Pv2<? extends R>) Pv2.T(f());
    }

    @InterfaceC6181ey
    @MB
    public final R k(@MB T t, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return (R) l(t, (Object[]) C10664xF1.E(objArr));
    }

    @MB
    public abstract Object l(@MB Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException;

    public final boolean m() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean n() {
        return this.X.isAccessible();
    }

    public final boolean o() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean p() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean q();

    public final boolean r() {
        if (!s() && !u() && !t()) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean t() {
        return Modifier.isProtected(getModifiers());
    }

    public String toString() {
        return this.Y.toString();
    }

    public final boolean u() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean v() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean w() {
        return Modifier.isSynchronized(getModifiers());
    }

    public final boolean x() {
        return Modifier.isTransient(getModifiers());
    }

    public abstract boolean y();

    public final boolean z() {
        return Modifier.isVolatile(getModifiers());
    }
}
