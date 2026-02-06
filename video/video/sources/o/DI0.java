package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import o.C6504gE2;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public abstract class DI0<ResponseT, ReturnT> extends L12<ReturnT> {
    public final C6802hS1 a;
    public final Call.Factory b;
    public final InterfaceC7750lN<ResponseBody, ResponseT> c;

    /* loaded from: classes4.dex */
    public static final class a<ResponseT, ReturnT> extends DI0<ResponseT, ReturnT> {
        public final InterfaceC2493At<ResponseT, ReturnT> d;

        public a(C6802hS1 c6802hS1, Call.Factory factory, InterfaceC7750lN<ResponseBody, ResponseT> interfaceC7750lN, InterfaceC2493At<ResponseT, ReturnT> interfaceC2493At) {
            super(c6802hS1, factory, interfaceC7750lN);
            this.d = interfaceC2493At;
        }

        @Override // o.DI0
        public ReturnT c(InterfaceC11302zt<ResponseT> interfaceC11302zt, Object[] objArr) {
            return this.d.a(interfaceC11302zt);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<ResponseT> extends DI0<ResponseT, Object> {
        public final InterfaceC2493At<ResponseT, InterfaceC11302zt<ResponseT>> d;
        public final boolean e;
        public final boolean f;

        public b(C6802hS1 c6802hS1, Call.Factory factory, InterfaceC7750lN<ResponseBody, ResponseT> interfaceC7750lN, InterfaceC2493At<ResponseT, InterfaceC11302zt<ResponseT>> interfaceC2493At, boolean z, boolean z2) {
            super(c6802hS1, factory, interfaceC7750lN);
            this.d = interfaceC2493At;
            this.e = z;
            this.f = z2;
        }

        @Override // o.DI0
        public Object c(InterfaceC11302zt<ResponseT> interfaceC11302zt, Object[] objArr) {
            InterfaceC11302zt<ResponseT> a = this.d.a(interfaceC11302zt);
            HM hm = (HM) objArr[objArr.length - 1];
            try {
                if (this.f) {
                    return RX0.d(a, hm);
                }
                if (this.e) {
                    return RX0.b(a, hm);
                }
                return RX0.a(a, hm);
            } catch (LinkageError e) {
                e = e;
                throw e;
            } catch (ThreadDeath e2) {
                e = e2;
                throw e;
            } catch (VirtualMachineError e3) {
                e = e3;
                throw e;
            } catch (Throwable th) {
                return RX0.f(th, hm);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<ResponseT> extends DI0<ResponseT, Object> {
        public final InterfaceC2493At<ResponseT, InterfaceC11302zt<ResponseT>> d;

        public c(C6802hS1 c6802hS1, Call.Factory factory, InterfaceC7750lN<ResponseBody, ResponseT> interfaceC7750lN, InterfaceC2493At<ResponseT, InterfaceC11302zt<ResponseT>> interfaceC2493At) {
            super(c6802hS1, factory, interfaceC7750lN);
            this.d = interfaceC2493At;
        }

        @Override // o.DI0
        public Object c(InterfaceC11302zt<ResponseT> interfaceC11302zt, Object[] objArr) {
            InterfaceC11302zt<ResponseT> a = this.d.a(interfaceC11302zt);
            HM hm = (HM) objArr[objArr.length - 1];
            try {
                return RX0.c(a, hm);
            } catch (Exception e) {
                return RX0.f(e, hm);
            }
        }
    }

    public DI0(C6802hS1 c6802hS1, Call.Factory factory, InterfaceC7750lN<ResponseBody, ResponseT> interfaceC7750lN) {
        this.a = c6802hS1;
        this.b = factory;
        this.c = interfaceC7750lN;
    }

    public static <ResponseT, ReturnT> InterfaceC2493At<ResponseT, ReturnT> d(C8284nU1 c8284nU1, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC2493At<ResponseT, ReturnT>) c8284nU1.b(type, annotationArr);
        } catch (RuntimeException e) {
            throw C6504gE2.o(method, e, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> InterfaceC7750lN<ResponseBody, ResponseT> e(C8284nU1 c8284nU1, Method method, Type type) {
        try {
            return c8284nU1.n(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C6504gE2.o(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> DI0<ResponseT, ReturnT> f(C8284nU1 c8284nU1, Method method, C6802hS1 c6802hS1) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean m;
        boolean z3 = c6802hS1.l;
        Annotation[] annotations = method.getAnnotations();
        if (z3) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = C6504gE2.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C6504gE2.h(f) == FT1.class && (f instanceof ParameterizedType)) {
                f = C6504gE2.g(0, (ParameterizedType) f);
                m = false;
                z = true;
            } else if (C6504gE2.h(f) != InterfaceC11302zt.class) {
                m = C6504gE2.m(f);
                z = false;
            } else {
                throw C6504gE2.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", C6504gE2.g(0, (ParameterizedType) f));
            }
            genericReturnType = new C6504gE2.b(null, InterfaceC11302zt.class, f);
            annotations = Y82.a(annotations);
            z2 = m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
            z2 = false;
        }
        InterfaceC2493At d = d(c8284nU1, method, genericReturnType, annotations);
        Type b2 = d.b();
        if (b2 != Response.class) {
            if (b2 != FT1.class) {
                if (c6802hS1.d.equals("HEAD") && !Void.class.equals(b2) && !C6504gE2.m(b2)) {
                    throw C6504gE2.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
                }
                InterfaceC7750lN e = e(c8284nU1, method, b2);
                Call.Factory factory = c8284nU1.b;
                if (!z3) {
                    return new a(c6802hS1, factory, e, d);
                }
                if (z) {
                    return new c(c6802hS1, factory, e, d);
                }
                return new b(c6802hS1, factory, e, d, false, z2);
            }
            throw C6504gE2.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw C6504gE2.n(method, "'" + C6504gE2.h(b2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    @Override // o.L12
    @InterfaceC10571ws1
    public final ReturnT a(Object obj, Object[] objArr) {
        return c(new C9112qu1(this.a, obj, objArr, this.b, this.c), objArr);
    }

    @InterfaceC10571ws1
    public abstract ReturnT c(InterfaceC11302zt<ResponseT> interfaceC11302zt, Object[] objArr);
}
