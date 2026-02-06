package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11102#3:114\n11437#3,3:115\n12671#3,3:132\n1971#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
/* renamed from: o.Lf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3527Lf0 {
    public static final int a = n(Throwable.class, -1);
    @NotNull
    public static final AbstractC6059eS b;

    /* renamed from: o.Lf0$a */
    /* loaded from: classes4.dex */
    public static final class a implements HA0 {
        public static final a X = new a();

        @Override // o.HA0
        /* renamed from: c */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static {
        AbstractC6059eS abstractC6059eS;
        try {
            if (C11036yn0.a()) {
                abstractC6059eS = KJ2.a;
            } else {
                abstractC6059eS = C9436sD.a;
            }
        } catch (Throwable unused) {
            abstractC6059eS = KJ2.a;
        }
        b = abstractC6059eS;
    }

    public static final <E extends Throwable> HA0<Throwable, Throwable> g(Class<E> cls) {
        Object obj;
        HA0<Throwable, Throwable> ha0;
        C4180Rx1 a2;
        a aVar = a.X;
        if (a == n(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (length2 != 2) {
                            a2 = C6670gv2.a(null, -1);
                        } else if (C6562gT0.g(parameterTypes[0], String.class) && C6562gT0.g(parameterTypes[1], Throwable.class)) {
                            a2 = C6670gv2.a(o(new HA0() { // from class: o.Hf0
                                @Override // o.HA0
                                public final Object invoke(Object obj2) {
                                    Throwable h;
                                    h = C3527Lf0.h(constructor, (Throwable) obj2);
                                    return h;
                                }
                            }), 3);
                        } else {
                            a2 = C6670gv2.a(null, -1);
                        }
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        if (C6562gT0.g(cls2, String.class)) {
                            a2 = C6670gv2.a(o(new HA0() { // from class: o.If0
                                @Override // o.HA0
                                public final Object invoke(Object obj2) {
                                    Throwable i2;
                                    i2 = C3527Lf0.i(constructor, (Throwable) obj2);
                                    return i2;
                                }
                            }), 2);
                        } else if (C6562gT0.g(cls2, Throwable.class)) {
                            a2 = C6670gv2.a(o(new HA0() { // from class: o.Jf0
                                @Override // o.HA0
                                public final Object invoke(Object obj2) {
                                    Throwable j;
                                    j = C3527Lf0.j(constructor, (Throwable) obj2);
                                    return j;
                                }
                            }), 1);
                        } else {
                            a2 = C6670gv2.a(null, -1);
                        }
                    }
                } else {
                    a2 = C6670gv2.a(o(new HA0() { // from class: o.Kf0
                        @Override // o.HA0
                        public final Object invoke(Object obj2) {
                            Throwable k;
                            k = C3527Lf0.k(constructor, (Throwable) obj2);
                            return k;
                        }
                    }), 0);
                }
                arrayList.add(a2);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((C4180Rx1) obj).f()).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((C4180Rx1) next).f()).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            C4180Rx1 c4180Rx1 = (C4180Rx1) obj;
            if (c4180Rx1 != null && (ha0 = (HA0) c4180Rx1.e()) != null) {
                return ha0;
            }
        }
        return aVar;
    }

    public static final Throwable h(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(th.getMessage(), th);
        C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable i(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(th.getMessage());
        C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static final Throwable j(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(th);
        C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable k(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(null);
        C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static final int l(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int m(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return l(cls, i);
    }

    public static final int n(Class<?> cls, int i) {
        Integer b2;
        C6074eW0.i(cls);
        try {
            PT1.a aVar = PT1.Y;
            b2 = PT1.b(Integer.valueOf(m(cls, 0, 1, null)));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (PT1.i(b2)) {
            b2 = valueOf;
        }
        return ((Number) b2).intValue();
    }

    public static final HA0<Throwable, Throwable> o(final HA0<? super Throwable, ? extends Throwable> ha0) {
        return new HA0() { // from class: o.Gf0
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Throwable p;
                p = C3527Lf0.p(HA0.this, (Throwable) obj);
                return p;
            }
        };
    }

    public static final Throwable p(HA0 ha0, Throwable th) {
        Object b2;
        Throwable th2 = null;
        try {
            PT1.a aVar = PT1.Y;
            Throwable th3 = (Throwable) ha0.invoke(th);
            if (!C6562gT0.g(th.getMessage(), th3.getMessage()) && !C6562gT0.g(th3.getMessage(), th.toString())) {
                th3 = null;
            }
            b2 = PT1.b(th3);
        } catch (Throwable th4) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th4));
        }
        if (!PT1.i(b2)) {
            th2 = b2;
        }
        return th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E q(@NotNull E e) {
        Object b2;
        if (e instanceof RP) {
            try {
                PT1.a aVar = PT1.Y;
                b2 = PT1.b(((RP) e).a());
            } catch (Throwable th) {
                PT1.a aVar2 = PT1.Y;
                b2 = PT1.b(RT1.a(th));
            }
            if (PT1.i(b2)) {
                b2 = null;
            }
            return (E) b2;
        }
        return (E) b.a(e.getClass()).invoke(e);
    }
}
