package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.AbstractC6553gR;
import o.C3946Pm1;
import o.C6562gT0;
import o.C6724h9;
import o.C9516sY;
import o.CH2;
import o.EH2;
import o.FH2;
import o.GH2;
import o.HH2;
import o.InterfaceC9511sW0;
import o.OP0;

/* loaded from: classes.dex */
public class u {
    public final GH2 a;
    public final b b;
    public final AbstractC6553gR c;

    /* loaded from: classes.dex */
    public interface b {
        public static final a a = a.a;

        /* loaded from: classes.dex */
        public static final class a {
            public static final /* synthetic */ a a = new a();

            @InterfaceC9511sW0
            public final b a(EH2<?>... eh2Arr) {
                C6562gT0.p(eh2Arr, "initializers");
                return new OP0((EH2[]) Arrays.copyOf(eh2Arr, eh2Arr.length));
            }
        }

        @InterfaceC9511sW0
        static b c(EH2<?>... eh2Arr) {
            return a.a(eh2Arr);
        }

        default <T extends CH2> T a(Class<T> cls, AbstractC6553gR abstractC6553gR) {
            C6562gT0.p(cls, "modelClass");
            C6562gT0.p(abstractC6553gR, "extras");
            return (T) b(cls);
        }

        default <T extends CH2> T b(Class<T> cls) {
            C6562gT0.p(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public static c c;
        public static final a b = new a(null);
        public static final AbstractC6553gR.b<String> d = a.C0033a.a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.u$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0033a implements AbstractC6553gR.b<String> {
                public static final C0033a a = new C0033a();
            }

            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            public static /* synthetic */ void b() {
            }

            public final c a() {
                if (c.c == null) {
                    c.c = new c();
                }
                c cVar = c.c;
                C6562gT0.m(cVar);
                return cVar;
            }

            public a() {
            }
        }

        public static final c f() {
            return b.a();
        }

        @Override // androidx.lifecycle.u.b
        public <T extends CH2> T b(Class<T> cls) {
            C6562gT0.p(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                C6562gT0.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void d(CH2 ch2) {
            C6562gT0.p(ch2, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(GH2 gh2, b bVar) {
        this(gh2, bVar, null, 4, null);
        C6562gT0.p(gh2, "store");
        C6562gT0.p(bVar, "factory");
    }

    public <T extends CH2> T a(Class<T> cls) {
        C6562gT0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends CH2> T b(String str, Class<T> cls) {
        T t;
        d dVar;
        C6562gT0.p(str, "key");
        C6562gT0.p(cls, "modelClass");
        T t2 = (T) this.a.b(str);
        if (cls.isInstance(t2)) {
            b bVar = this.b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                C6562gT0.m(t2);
                dVar.d(t2);
            }
            C6562gT0.n(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        C3946Pm1 c3946Pm1 = new C3946Pm1(this.c);
        c3946Pm1.c(c.d, str);
        try {
            t = (T) this.b.a(cls, c3946Pm1);
        } catch (AbstractMethodError unused) {
            t = (T) this.b.b(cls);
        }
        this.a.d(str, t);
        return t;
    }

    /* loaded from: classes.dex */
    public static class a extends c {
        public static final String g = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        public static a h;
        public final Application e;
        public static final C0031a f = new C0031a(null);
        public static final AbstractC6553gR.b<Application> i = C0031a.C0032a.a;

        /* renamed from: androidx.lifecycle.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0031a {

            /* renamed from: androidx.lifecycle.u$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0032a implements AbstractC6553gR.b<Application> {
                public static final C0032a a = new C0032a();
            }

            public /* synthetic */ C0031a(C9516sY c9516sY) {
                this();
            }

            public final b a(HH2 hh2) {
                C6562gT0.p(hh2, "owner");
                if (hh2 instanceof e) {
                    return ((e) hh2).T();
                }
                return c.b.a();
            }

            @InterfaceC9511sW0
            public final a b(Application application) {
                C6562gT0.p(application, "application");
                if (a.h == null) {
                    a.h = new a(application);
                }
                a aVar = a.h;
                C6562gT0.m(aVar);
                return aVar;
            }

            public C0031a() {
            }
        }

        public a(Application application, int i2) {
            this.e = application;
        }

        @InterfaceC9511sW0
        public static final a j(Application application) {
            return f.b(application);
        }

        @Override // androidx.lifecycle.u.b
        public <T extends CH2> T a(Class<T> cls, AbstractC6553gR abstractC6553gR) {
            C6562gT0.p(cls, "modelClass");
            C6562gT0.p(abstractC6553gR, "extras");
            if (this.e != null) {
                return (T) b(cls);
            }
            Application application = (Application) abstractC6553gR.a(i);
            if (application != null) {
                return (T) i(cls, application);
            }
            if (!C6724h9.class.isAssignableFrom(cls)) {
                return (T) super.b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.u.c, androidx.lifecycle.u.b
        public <T extends CH2> T b(Class<T> cls) {
            C6562gT0.p(cls, "modelClass");
            Application application = this.e;
            if (application != null) {
                return (T) i(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final <T extends CH2> T i(Class<T> cls, Application application) {
            if (C6724h9.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    C6562gT0.o(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.b(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C6562gT0.p(application, "application");
        }
    }

    public u(GH2 gh2, b bVar, AbstractC6553gR abstractC6553gR) {
        C6562gT0.p(gh2, "store");
        C6562gT0.p(bVar, "factory");
        C6562gT0.p(abstractC6553gR, "defaultCreationExtras");
        this.a = gh2;
        this.b = bVar;
        this.c = abstractC6553gR;
    }

    public /* synthetic */ u(GH2 gh2, b bVar, AbstractC6553gR abstractC6553gR, int i, C9516sY c9516sY) {
        this(gh2, bVar, (i & 4) != 0 ? AbstractC6553gR.a.b : abstractC6553gR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(HH2 hh2) {
        this(hh2.A(), a.f.a(hh2), FH2.a(hh2));
        C6562gT0.p(hh2, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(HH2 hh2, b bVar) {
        this(hh2.A(), bVar, FH2.a(hh2));
        C6562gT0.p(hh2, "owner");
        C6562gT0.p(bVar, "factory");
    }
}
