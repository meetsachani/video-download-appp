package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.C6153er;
import o.InterfaceC2493At;
import o.InterfaceC7750lN;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.nU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8284nU1 {
    public final ConcurrentHashMap<Method, Object> a = new ConcurrentHashMap<>();
    public final Call.Factory b;
    public final HttpUrl c;
    public final List<InterfaceC7750lN.a> d;
    public final int e;
    public final List<InterfaceC2493At.a> f;
    public final int g;
    @InterfaceC10571ws1
    public final Executor h;
    public final boolean i;

    /* renamed from: o.nU1$a */
    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {
        public final Object[] a = new Object[0];
        public final /* synthetic */ Class b;

        public a(Class cls) {
            this.b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @InterfaceC10571ws1
        public Object invoke(Object obj, Method method, @InterfaceC10571ws1 Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.a;
            }
            C6794hQ1 c6794hQ1 = C8459oD1.b;
            if (c6794hQ1.c(method)) {
                return c6794hQ1.b(method, this.b, obj, objArr);
            }
            return C8284nU1.this.h(this.b, method).a(obj, objArr);
        }
    }

    public C8284nU1(Call.Factory factory, HttpUrl httpUrl, List<InterfaceC7750lN.a> list, int i, List<InterfaceC2493At.a> list2, int i2, @InterfaceC10571ws1 Executor executor, boolean z) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = i;
        this.f = list2;
        this.g = i2;
        this.h = executor;
        this.i = z;
    }

    public HttpUrl a() {
        return this.c;
    }

    public InterfaceC2493At<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<InterfaceC2493At.a> c() {
        return this.f;
    }

    public Call.Factory d() {
        return this.b;
    }

    @InterfaceC10571ws1
    public Executor e() {
        return this.h;
    }

    public List<InterfaceC7750lN.a> f() {
        return this.d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public L12<?> h(Class<?> cls, Method method) {
        while (true) {
            Object obj = this.a.get(method);
            if (obj instanceof L12) {
                return (L12) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            L12<?> b2 = L12.b(this, cls, method);
                            this.a.put(method, b2);
                            return b2;
                        }
                    } finally {
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.a.get(method);
                    if (obj3 != null) {
                        return (L12) obj3;
                    }
                } finally {
                }
            }
        }
    }

    public b i() {
        return new b(this);
    }

    public InterfaceC2493At<?, ?> j(@InterfaceC10571ws1 InterfaceC2493At.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f.indexOf(aVar) + 1;
        int size = this.f.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2493At<?, ?> a2 = this.f.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC7750lN<T, RequestBody> k(@InterfaceC10571ws1 InterfaceC7750lN.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC7750lN<T, RequestBody> interfaceC7750lN = (InterfaceC7750lN<T, RequestBody>) this.d.get(i).c(type, annotationArr, annotationArr2, this);
            if (interfaceC7750lN != null) {
                return interfaceC7750lN;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC7750lN<ResponseBody, T> l(@InterfaceC10571ws1 InterfaceC7750lN.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC7750lN<ResponseBody, T> interfaceC7750lN = (InterfaceC7750lN<ResponseBody, T>) this.d.get(i).d(type, annotationArr, this);
            if (interfaceC7750lN != null) {
                return interfaceC7750lN;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC7750lN<T, RequestBody> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> InterfaceC7750lN<ResponseBody, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> InterfaceC7750lN<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            InterfaceC7750lN<T, String> interfaceC7750lN = (InterfaceC7750lN<T, String>) this.d.get(i).e(type, annotationArr, this);
            if (interfaceC7750lN != null) {
                return interfaceC7750lN;
            }
        }
        return C6153er.d.a;
    }

    public final void p(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.i) {
                C6794hQ1 c6794hQ1 = C8459oD1.b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!c6794hQ1.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                        h(cls, method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: o.nU1$b */
    /* loaded from: classes4.dex */
    public static final class b {
        @InterfaceC10571ws1
        public Call.Factory a;
        @InterfaceC10571ws1
        public HttpUrl b;
        public final List<InterfaceC7750lN.a> c = new ArrayList();
        public final List<InterfaceC2493At.a> d = new ArrayList();
        @InterfaceC10571ws1
        public Executor e;
        public boolean f;

        public b() {
        }

        public b a(InterfaceC2493At.a aVar) {
            List<InterfaceC2493At.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(InterfaceC7750lN.a aVar) {
            List<InterfaceC7750lN.a> list = this.c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(HttpUrl.get(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(HttpUrl.get(url.toString()));
        }

        public b e(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public C8284nU1 f() {
            if (this.b != null) {
                Call.Factory factory = this.a;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.e;
                if (executor == null) {
                    executor = C8459oD1.a;
                }
                Executor executor2 = executor;
                C6396fr c6396fr = C8459oD1.c;
                ArrayList arrayList = new ArrayList(this.d);
                List<? extends InterfaceC2493At.a> a = c6396fr.a(executor2);
                arrayList.addAll(a);
                List<? extends InterfaceC7750lN.a> b = c6396fr.b();
                int size = b.size();
                ArrayList arrayList2 = new ArrayList(this.c.size() + 1 + size);
                arrayList2.add(new C6153er());
                arrayList2.addAll(this.c);
                arrayList2.addAll(b);
                return new C8284nU1(factory2, this.b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a.size(), executor2, this.f);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public List<InterfaceC2493At.a> g() {
            return this.d;
        }

        public b h(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.a = factory;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.e = executor;
            return this;
        }

        public b j(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return h(okHttpClient);
        }

        public List<InterfaceC7750lN.a> k() {
            return this.c;
        }

        public b l(boolean z) {
            this.f = z;
            return this;
        }

        public b(C8284nU1 c8284nU1) {
            this.a = c8284nU1.b;
            this.b = c8284nU1.c;
            int size = c8284nU1.d.size() - c8284nU1.e;
            for (int i = 1; i < size; i++) {
                this.c.add(c8284nU1.d.get(i));
            }
            int size2 = c8284nU1.f.size() - c8284nU1.g;
            for (int i2 = 0; i2 < size2; i2++) {
                this.d.add(c8284nU1.f.get(i2));
            }
            this.e = c8284nU1.h;
            this.f = c8284nU1.i;
        }
    }
}
