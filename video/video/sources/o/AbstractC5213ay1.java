package o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import o.AbstractC4253Sp2;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.ay1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5213ay1<T> {

    /* renamed from: o.ay1$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC5213ay1<Iterable<T>> {
        public a() {
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T t : iterable) {
                    AbstractC5213ay1.this.a(c6061eS1, t);
                }
            }
        }
    }

    /* renamed from: o.ay1$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC5213ay1<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    AbstractC5213ay1.this.a(c6061eS1, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: o.ay1$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends AbstractC5213ay1<T> {
        public final Method a;
        public final int b;
        public final InterfaceC7750lN<T, RequestBody> c;

        public c(Method method, int i, InterfaceC7750lN<T, RequestBody> interfaceC7750lN) {
            this.a = method;
            this.b = i;
            this.c = interfaceC7750lN;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) {
            if (t != null) {
                try {
                    c6061eS1.l(this.c.a(t));
                    return;
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw C6504gE2.q(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw C6504gE2.p(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$d */
    /* loaded from: classes4.dex */
    public static final class d<T> extends AbstractC5213ay1<T> {
        public final String a;
        public final InterfaceC7750lN<T, String> b;
        public final boolean c;

        public d(String str, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC7750lN;
            this.c = z;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            c6061eS1.a(this.a, a, this.c);
        }
    }

    /* renamed from: o.ay1$e */
    /* loaded from: classes4.dex */
    public static final class e<T> extends AbstractC5213ay1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final InterfaceC7750lN<T, String> c;
        public final boolean d;

        public e(Method method, int i, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            this.a = method;
            this.b = i;
            this.c = interfaceC7750lN;
            this.d = z;
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a = this.c.a(value);
                            if (a != null) {
                                c6061eS1.a(key, a, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw C6504gE2.p(method, i, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i2 = this.b;
                            throw C6504gE2.p(method2, i2, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C6504gE2.p(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6504gE2.p(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$f */
    /* loaded from: classes4.dex */
    public static final class f<T> extends AbstractC5213ay1<T> {
        public final String a;
        public final InterfaceC7750lN<T, String> b;
        public final boolean c;

        public f(String str, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC7750lN;
            this.c = z;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            c6061eS1.b(this.a, a, this.c);
        }
    }

    /* renamed from: o.ay1$g */
    /* loaded from: classes4.dex */
    public static final class g<T> extends AbstractC5213ay1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final InterfaceC7750lN<T, String> c;
        public final boolean d;

        public g(Method method, int i, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            this.a = method;
            this.b = i;
            this.c = interfaceC7750lN;
            this.d = z;
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            c6061eS1.b(key, this.c.a(value), this.d);
                        } else {
                            Method method = this.a;
                            int i = this.b;
                            throw C6504gE2.p(method, i, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C6504gE2.p(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6504gE2.p(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC5213ay1<Headers> {
        public final Method a;
        public final int b;

        public h(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Headers headers) {
            if (headers != null) {
                c6061eS1.c(headers);
                return;
            }
            throw C6504gE2.p(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$i */
    /* loaded from: classes4.dex */
    public static final class i<T> extends AbstractC5213ay1<T> {
        public final Method a;
        public final int b;
        public final Headers c;
        public final InterfaceC7750lN<T, RequestBody> d;

        public i(Method method, int i, Headers headers, InterfaceC7750lN<T, RequestBody> interfaceC7750lN) {
            this.a = method;
            this.b = i;
            this.c = headers;
            this.d = interfaceC7750lN;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) {
            if (t == null) {
                return;
            }
            try {
                c6061eS1.d(this.c, this.d.a(t));
            } catch (IOException e) {
                Method method = this.a;
                int i = this.b;
                throw C6504gE2.p(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: o.ay1$j */
    /* loaded from: classes4.dex */
    public static final class j<T> extends AbstractC5213ay1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final InterfaceC7750lN<T, RequestBody> c;
        public final String d;

        public j(Method method, int i, InterfaceC7750lN<T, RequestBody> interfaceC7750lN, String str) {
            this.a = method;
            this.b = i;
            this.c = interfaceC7750lN;
            this.d = str;
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            c6061eS1.d(Headers.of(AI0.a0, "form-data; name=\"" + key + AbstractC4253Sp2.b.x1, "Content-Transfer-Encoding", this.d), this.c.a(value));
                        } else {
                            Method method = this.a;
                            int i = this.b;
                            throw C6504gE2.p(method, i, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C6504gE2.p(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6504gE2.p(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$k */
    /* loaded from: classes4.dex */
    public static final class k<T> extends AbstractC5213ay1<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final InterfaceC7750lN<T, String> d;
        public final boolean e;

        public k(Method method, int i, String str, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = interfaceC7750lN;
            this.e = z;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException {
            if (t != null) {
                c6061eS1.f(this.c, this.d.a(t), this.e);
                return;
            }
            Method method = this.a;
            int i = this.b;
            throw C6504gE2.p(method, i, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$l */
    /* loaded from: classes4.dex */
    public static final class l<T> extends AbstractC5213ay1<T> {
        public final String a;
        public final InterfaceC7750lN<T, String> b;
        public final boolean c;

        public l(String str, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC7750lN;
            this.c = z;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            c6061eS1.g(this.a, a, this.c);
        }
    }

    /* renamed from: o.ay1$m */
    /* loaded from: classes4.dex */
    public static final class m<T> extends AbstractC5213ay1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final InterfaceC7750lN<T, String> c;
        public final boolean d;

        public m(Method method, int i, InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            this.a = method;
            this.b = i;
            this.c = interfaceC7750lN;
            this.d = z;
        }

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a = this.c.a(value);
                            if (a != null) {
                                c6061eS1.g(key, a, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw C6504gE2.p(method, i, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i2 = this.b;
                            throw C6504gE2.p(method2, i2, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C6504gE2.p(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6504gE2.p(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: o.ay1$n */
    /* loaded from: classes4.dex */
    public static final class n<T> extends AbstractC5213ay1<T> {
        public final InterfaceC7750lN<T, String> a;
        public final boolean b;

        public n(InterfaceC7750lN<T, String> interfaceC7750lN, boolean z) {
            this.a = interfaceC7750lN;
            this.b = z;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException {
            if (t == null) {
                return;
            }
            c6061eS1.g(this.a.a(t), null, this.b);
        }
    }

    /* renamed from: o.ay1$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC5213ay1<MultipartBody.Part> {
        public static final o a = new o();

        @Override // o.AbstractC5213ay1
        /* renamed from: d */
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 MultipartBody.Part part) {
            if (part != null) {
                c6061eS1.e(part);
            }
        }
    }

    /* renamed from: o.ay1$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC5213ay1<Object> {
        public final Method a;
        public final int b;

        public p(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 Object obj) {
            if (obj != null) {
                c6061eS1.m(obj);
                return;
            }
            throw C6504gE2.p(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: o.ay1$q */
    /* loaded from: classes4.dex */
    public static final class q<T> extends AbstractC5213ay1<T> {
        public final Class<T> a;

        public q(Class<T> cls) {
            this.a = cls;
        }

        @Override // o.AbstractC5213ay1
        public void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) {
            c6061eS1.h(this.a, t);
        }
    }

    public abstract void a(C6061eS1 c6061eS1, @InterfaceC10571ws1 T t) throws IOException;

    public final AbstractC5213ay1<Object> b() {
        return new b();
    }

    public final AbstractC5213ay1<Iterable<T>> c() {
        return new a();
    }
}
