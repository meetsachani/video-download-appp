package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

@InterfaceC6827ha0
/* renamed from: o.Ig2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3239Ig2 {
    public static final Y11<Class<?>, AbstractC5317bO0<Method>> c = C5434bt.D().M().b(new a());
    public static final Y11<Class<?>, AbstractC9481sO0<Class<?>>> d = C5434bt.D().M().b(new b());
    public final ConcurrentMap<Class<?>, CopyOnWriteArraySet<C2945Fg2>> a = C7935m81.V();
    @GJ2
    public final C2630Ce0 b;

    /* renamed from: o.Ig2$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8133mt<Class<?>, AbstractC5317bO0<Method>> {
        @Override // o.AbstractC8133mt
        /* renamed from: g */
        public AbstractC5317bO0<Method> d(Class<?> cls) throws Exception {
            return C3239Ig2.e(cls);
        }
    }

    /* renamed from: o.Ig2$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC8133mt<Class<?>, AbstractC9481sO0<Class<?>>> {
        @Override // o.AbstractC8133mt
        /* renamed from: g */
        public AbstractC9481sO0<Class<?>> d(Class<?> cls) {
            return AbstractC9481sO0.G(Pv2.S(cls).D().d6());
        }
    }

    /* renamed from: o.Ig2$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public final String a;
        public final List<Class<?>> b;

        public c(Method method) {
            this.a = method.getName();
            this.b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(this.a, this.b);
        }
    }

    public C3239Ig2(C2630Ce0 c2630Ce0) {
        this.b = (C2630Ce0) C10664xF1.E(c2630Ce0);
    }

    @InterfaceC5299bJ2
    public static AbstractC9481sO0<Class<?>> c(Class<?> cls) {
        try {
            return d.C0(cls);
        } catch (Gy2 e) {
            throw C7855lo2.q(e.getCause());
        }
    }

    public static AbstractC5317bO0<Method> d(Class<?> cls) {
        try {
            return c.C0(cls);
        } catch (Gy2 e) {
            C7855lo2.w(e.getCause());
            throw e;
        }
    }

    public static AbstractC5317bO0<Method> e(Class<?> cls) {
        Method[] declaredMethods;
        boolean z;
        Set<Class> d6 = Pv2.S(cls).D().d6();
        HashMap Y = C7935m81.Y();
        for (Class cls2 : d6) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (method.isAnnotationPresent(InterfaceC2542Bg2.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10664xF1.w(z, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    C10664xF1.z(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), C9211rH1.f(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!Y.containsKey(cVar)) {
                        Y.put(cVar, method);
                    }
                }
            }
        }
        return AbstractC5317bO0.F(Y.values());
    }

    public final InterfaceC10058um1<Class<?>, C2945Fg2> b(Object obj) {
        C9935uG0 I = C9935uG0.I();
        AbstractC6237fB2<Method> it = d(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            I.put(next.getParameterTypes()[0], C2945Fg2.c(this.b, obj, next));
        }
        return I;
    }

    public Iterator<C2945Fg2> f(Object obj) {
        AbstractC9481sO0<Class<?>> c2 = c(obj.getClass());
        ArrayList u = C10608x11.u(c2.size());
        AbstractC6237fB2<Class<?>> it = c2.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<C2945Fg2> copyOnWriteArraySet = this.a.get(it.next());
            if (copyOnWriteArraySet != null) {
                u.add(copyOnWriteArraySet.iterator());
            }
        }
        return C7052iU0.i(u.iterator());
    }

    @InterfaceC5299bJ2
    public Set<C2945Fg2> g(Class<?> cls) {
        return (Set) C3743Nk1.a(this.a.get(cls), AbstractC9481sO0.M());
    }

    public void h(Object obj) {
        for (Map.Entry<Class<?>, Collection<C2945Fg2>> entry : b(obj).l().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<C2945Fg2> value = entry.getValue();
            CopyOnWriteArraySet<C2945Fg2> copyOnWriteArraySet = this.a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<C2945Fg2> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) C3743Nk1.a(this.a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Object obj) {
        for (Map.Entry<Class<?>, Collection<C2945Fg2>> entry : b(obj).l().entrySet()) {
            Collection<C2945Fg2> value = entry.getValue();
            CopyOnWriteArraySet<C2945Fg2> copyOnWriteArraySet = this.a.get(entry.getKey());
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 65);
                sb.append("missing event subscriber for an annotated method. Is ");
                sb.append(valueOf);
                sb.append(" registered?");
                throw new IllegalArgumentException(sb.toString());
            }
            while (r0.hasNext()) {
            }
        }
    }
}
