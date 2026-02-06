package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC4253Sp2;
import o.AbstractC5213ay1;
import o.C9700tI0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* renamed from: o.hS1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6802hS1 {
    public final Class<?> a;
    public final Method b;
    public final HttpUrl c;
    public final String d;
    @InterfaceC10571ws1
    public final String e;
    @InterfaceC10571ws1
    public final Headers f;
    @InterfaceC10571ws1
    public final MediaType g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final AbstractC5213ay1<?>[] k;
    public final boolean l;

    /* renamed from: o.hS1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public final C8284nU1 a;
        public final Class<?> b;
        public final Method c;
        public final Annotation[] d;
        public final Annotation[][] e;
        public final Type[] f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        @InterfaceC10571ws1

        /* renamed from: o  reason: collision with root package name */
        public String f760o;
        public boolean p;
        public boolean q;
        public boolean r;
        @InterfaceC10571ws1
        public String s;
        @InterfaceC10571ws1
        public Headers t;
        @InterfaceC10571ws1
        public MediaType u;
        @InterfaceC10571ws1
        public Set<String> v;
        @InterfaceC10571ws1
        public AbstractC5213ay1<?>[] w;
        public boolean x;
        public static final Pattern z = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final String y = "[a-zA-Z][a-zA-Z0-9_-]*";
        public static final Pattern A = Pattern.compile(y);

        public a(C8284nU1 c8284nU1, Class<?> cls, Method method) {
            this.a = c8284nU1;
            this.b = cls;
            this.c = method;
            this.d = method.getAnnotations();
            this.f = method.getGenericParameterTypes();
            this.e = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = z.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public C6802hS1 b() {
            boolean z2;
            for (Annotation annotation : this.d) {
                e(annotation);
            }
            if (this.f760o != null) {
                if (!this.p) {
                    if (!this.r) {
                        if (this.q) {
                            throw C6504gE2.n(this.c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw C6504gE2.n(this.c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.e.length;
                this.w = new AbstractC5213ay1[length];
                int i = length - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC5213ay1<?>[] abstractC5213ay1Arr = this.w;
                    Type type = this.f[i2];
                    Annotation[] annotationArr = this.e[i2];
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    abstractC5213ay1Arr[i2] = f(i2, type, annotationArr, z2);
                }
                if (this.s == null && !this.n) {
                    throw C6504gE2.n(this.c, "Missing either @%s URL or @Url parameter.", this.f760o);
                }
                boolean z3 = this.q;
                if (!z3 && !this.r && !this.p && this.i) {
                    throw C6504gE2.n(this.c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !this.g) {
                    throw C6504gE2.n(this.c, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.r && !this.h) {
                    throw C6504gE2.n(this.c, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new C6802hS1(this);
            }
            throw C6504gE2.n(this.c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }

        public final Headers c(String[] strArr, boolean z2) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf != -1 && indexOf != 0 && indexOf != str.length() - 1) {
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            this.u = MediaType.get(trim);
                        } catch (IllegalArgumentException e) {
                            throw C6504gE2.o(this.c, e, "Malformed content type: %s", trim);
                        }
                    } else if (z2) {
                        builder.addUnsafeNonAscii(substring, trim);
                    } else {
                        builder.add(substring, trim);
                    }
                } else {
                    throw C6504gE2.n(this.c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
            }
            return builder.build();
        }

        public final void d(String str, String str2, boolean z2) {
            String str3 = this.f760o;
            if (str3 == null) {
                this.f760o = str;
                this.p = z2;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (z.matcher(substring).find()) {
                        throw C6504gE2.n(this.c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.s = str2;
                this.v = h(str2);
                return;
            }
            throw C6504gE2.n(this.c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof VT) {
                d("DELETE", ((VT) annotation).value(), false);
            } else if (annotation instanceof InterfaceC9676tC0) {
                d("GET", ((InterfaceC9676tC0) annotation).value(), false);
            } else if (annotation instanceof JF0) {
                d("HEAD", ((JF0) annotation).value(), false);
            } else if (annotation instanceof InterfaceC8151mx1) {
                d(C9700tI0.a.X, ((InterfaceC8151mx1) annotation).value(), true);
            } else if (annotation instanceof InterfaceC10834xx1) {
                d(Q32.j, ((InterfaceC10834xx1) annotation).value(), true);
            } else if (annotation instanceof InterfaceC2508Ax1) {
                d("PUT", ((InterfaceC2508Ax1) annotation).value(), true);
            } else if (annotation instanceof InterfaceC4555Vs1) {
                d("OPTIONS", ((InterfaceC4555Vs1) annotation).value(), false);
            } else if (annotation instanceof LF0) {
                LF0 lf0 = (LF0) annotation;
                d(lf0.method(), lf0.path(), lf0.hasBody());
            } else if (annotation instanceof InterfaceC6259fH0) {
                InterfaceC6259fH0 interfaceC6259fH0 = (InterfaceC6259fH0) annotation;
                String[] value = interfaceC6259fH0.value();
                if (value.length != 0) {
                    this.t = c(value, interfaceC6259fH0.allowUnsafeNonAsciiValues());
                    return;
                }
                throw C6504gE2.n(this.c, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof InterfaceC10790xm1) {
                if (!this.q) {
                    this.r = true;
                    return;
                }
                throw C6504gE2.n(this.c, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof InterfaceC10347vx0) {
                if (!this.r) {
                    this.q = true;
                    return;
                }
                throw C6504gE2.n(this.c, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        @InterfaceC10571ws1
        public final AbstractC5213ay1<?> f(int i, Type type, @InterfaceC10571ws1 Annotation[] annotationArr, boolean z2) {
            AbstractC5213ay1<?> abstractC5213ay1;
            if (annotationArr != null) {
                abstractC5213ay1 = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC5213ay1<?> g = g(i, type, annotationArr, annotation);
                    if (g != null) {
                        if (abstractC5213ay1 == null) {
                            abstractC5213ay1 = g;
                        } else {
                            throw C6504gE2.p(this.c, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                abstractC5213ay1 = null;
            }
            if (abstractC5213ay1 == null) {
                if (z2) {
                    try {
                        if (C6504gE2.h(type) == HM.class) {
                            this.x = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw C6504gE2.p(this.c, i, "No Retrofit annotation found.", new Object[0]);
            }
            return abstractC5213ay1;
        }

        @InterfaceC10571ws1
        public final AbstractC5213ay1<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof SC2) {
                j(i, type);
                if (!this.n) {
                    if (!this.j) {
                        if (!this.k) {
                            if (!this.l) {
                                if (!this.m) {
                                    if (this.s == null) {
                                        this.n = true;
                                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw C6504gE2.p(this.c, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new AbstractC5213ay1.p(this.c, i);
                                    }
                                    throw C6504gE2.p(this.c, i, "@Url cannot be used with @%s URL", this.f760o);
                                }
                                throw C6504gE2.p(this.c, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw C6504gE2.p(this.c, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw C6504gE2.p(this.c, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "Multiple @Url method annotations found.", new Object[0]);
            } else if (annotation instanceof InterfaceC5217az1) {
                j(i, type);
                if (!this.k) {
                    if (!this.l) {
                        if (!this.m) {
                            if (!this.n) {
                                if (this.s != null) {
                                    this.j = true;
                                    InterfaceC5217az1 interfaceC5217az1 = (InterfaceC5217az1) annotation;
                                    String value = interfaceC5217az1.value();
                                    i(i, value);
                                    return new AbstractC5213ay1.k(this.c, i, value, this.a.o(type, annotationArr), interfaceC5217az1.encoded());
                                }
                                throw C6504gE2.p(this.c, i, "@Path can only be used with relative url on @%s", this.f760o);
                            }
                            throw C6504gE2.p(this.c, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw C6504gE2.p(this.c, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof InterfaceC8492oL1) {
                j(i, type);
                InterfaceC8492oL1 interfaceC8492oL1 = (InterfaceC8492oL1) annotation;
                String value2 = interfaceC8492oL1.value();
                boolean encoded = interfaceC8492oL1.encoded();
                Class<?> h = C6504gE2.h(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC5213ay1.l(value2, this.a.o(C6504gE2.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    throw C6504gE2.p(this.c, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (h.isArray()) {
                    return new AbstractC5213ay1.l(value2, this.a.o(a(h.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new AbstractC5213ay1.l(value2, this.a.o(type, annotationArr), encoded);
                }
            } else if (annotation instanceof InterfaceC9227rL1) {
                j(i, type);
                boolean encoded2 = ((InterfaceC9227rL1) annotation).encoded();
                Class<?> h2 = C6504gE2.h(type);
                this.l = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC5213ay1.n(this.a.o(C6504gE2.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    throw C6504gE2.p(this.c, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (h2.isArray()) {
                    return new AbstractC5213ay1.n(this.a.o(a(h2.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new AbstractC5213ay1.n(this.a.o(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof InterfaceC8978qL1) {
                j(i, type);
                Class<?> h3 = C6504gE2.h(type);
                this.m = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = C6504gE2.i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = C6504gE2.g(0, parameterizedType);
                        if (String.class == g) {
                            return new AbstractC5213ay1.m(this.c, i, this.a.o(C6504gE2.g(1, parameterizedType), annotationArr), ((InterfaceC8978qL1) annotation).encoded());
                        }
                        throw C6504gE2.p(this.c, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof LG0) {
                j(i, type);
                LG0 lg0 = (LG0) annotation;
                String value3 = lg0.value();
                Class<?> h4 = C6504gE2.h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC5213ay1.f(value3, this.a.o(C6504gE2.g(0, (ParameterizedType) type), annotationArr), lg0.allowUnsafeNonAsciiValues()).c();
                    }
                    throw C6504gE2.p(this.c, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (h4.isArray()) {
                    return new AbstractC5213ay1.f(value3, this.a.o(a(h4.getComponentType()), annotationArr), lg0.allowUnsafeNonAsciiValues()).b();
                } else {
                    return new AbstractC5213ay1.f(value3, this.a.o(type, annotationArr), lg0.allowUnsafeNonAsciiValues());
                }
            } else if (annotation instanceof XG0) {
                if (type == Headers.class) {
                    return new AbstractC5213ay1.h(this.c, i);
                }
                j(i, type);
                Class<?> h5 = C6504gE2.h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = C6504gE2.i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = C6504gE2.g(0, parameterizedType2);
                        if (String.class == g2) {
                            return new AbstractC5213ay1.g(this.c, i, this.a.o(C6504gE2.g(1, parameterizedType2), annotationArr), ((XG0) annotation).allowUnsafeNonAsciiValues());
                        }
                        throw C6504gE2.p(this.c, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
            } else if (annotation instanceof InterfaceC3949Pn0) {
                j(i, type);
                if (this.q) {
                    InterfaceC3949Pn0 interfaceC3949Pn0 = (InterfaceC3949Pn0) annotation;
                    String value4 = interfaceC3949Pn0.value();
                    boolean encoded3 = interfaceC3949Pn0.encoded();
                    this.g = true;
                    Class<?> h6 = C6504gE2.h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC5213ay1.d(value4, this.a.o(C6504gE2.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        throw C6504gE2.p(this.c, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h6.isArray()) {
                        return new AbstractC5213ay1.d(value4, this.a.o(a(h6.getComponentType()), annotationArr), encoded3).b();
                    } else {
                        return new AbstractC5213ay1.d(value4, this.a.o(type, annotationArr), encoded3);
                    }
                }
                throw C6504gE2.p(this.c, i, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC5899do0) {
                j(i, type);
                if (this.q) {
                    Class<?> h7 = C6504gE2.h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = C6504gE2.i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = C6504gE2.g(0, parameterizedType3);
                            if (String.class == g3) {
                                InterfaceC7750lN o2 = this.a.o(C6504gE2.g(1, parameterizedType3), annotationArr);
                                this.g = true;
                                return new AbstractC5213ay1.e(this.c, i, o2, ((InterfaceC5899do0) annotation).encoded());
                            }
                            throw C6504gE2.p(this.c, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw C6504gE2.p(this.c, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC4183Ry1) {
                j(i, type);
                if (this.r) {
                    InterfaceC4183Ry1 interfaceC4183Ry1 = (InterfaceC4183Ry1) annotation;
                    this.h = true;
                    String value5 = interfaceC4183Ry1.value();
                    Class<?> h8 = C6504gE2.h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                if (MultipartBody.Part.class.isAssignableFrom(C6504gE2.h(C6504gE2.g(0, (ParameterizedType) type)))) {
                                    return AbstractC5213ay1.o.a.c();
                                }
                                throw C6504gE2.p(this.c, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw C6504gE2.p(this.c, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(h8.getComponentType())) {
                                return AbstractC5213ay1.o.a.b();
                            }
                            throw C6504gE2.p(this.c, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(h8)) {
                            return AbstractC5213ay1.o.a;
                        } else {
                            throw C6504gE2.p(this.c, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    Headers of = Headers.of(AI0.a0, "form-data; name=\"" + value5 + AbstractC4253Sp2.b.x1, "Content-Transfer-Encoding", interfaceC4183Ry1.encoding());
                    if (Iterable.class.isAssignableFrom(h8)) {
                        if (type instanceof ParameterizedType) {
                            Type g4 = C6504gE2.g(0, (ParameterizedType) type);
                            if (!MultipartBody.Part.class.isAssignableFrom(C6504gE2.h(g4))) {
                                return new AbstractC5213ay1.i(this.c, i, of, this.a.m(g4, annotationArr, this.d)).c();
                            }
                            throw C6504gE2.p(this.c, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw C6504gE2.p(this.c, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h8.isArray()) {
                        Class<?> a = a(h8.getComponentType());
                        if (!MultipartBody.Part.class.isAssignableFrom(a)) {
                            return new AbstractC5213ay1.i(this.c, i, of, this.a.m(a, annotationArr, this.d)).b();
                        }
                        throw C6504gE2.p(this.c, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!MultipartBody.Part.class.isAssignableFrom(h8)) {
                        return new AbstractC5213ay1.i(this.c, i, of, this.a.m(type, annotationArr, this.d));
                    } else {
                        throw C6504gE2.p(this.c, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw C6504gE2.p(this.c, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC4283Sy1) {
                j(i, type);
                if (this.r) {
                    this.h = true;
                    Class<?> h9 = C6504gE2.h(type);
                    if (Map.class.isAssignableFrom(h9)) {
                        Type i5 = C6504gE2.i(type, h9, Map.class);
                        if (i5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                            Type g5 = C6504gE2.g(0, parameterizedType4);
                            if (String.class == g5) {
                                Type g6 = C6504gE2.g(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(C6504gE2.h(g6))) {
                                    return new AbstractC5213ay1.j(this.c, i, this.a.m(g6, annotationArr, this.d), ((InterfaceC4283Sy1) annotation).encoding());
                                }
                                throw C6504gE2.p(this.c, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw C6504gE2.p(this.c, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw C6504gE2.p(this.c, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C6504gE2.p(this.c, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC2473Ao) {
                j(i, type);
                if (!this.q && !this.r) {
                    if (!this.i) {
                        try {
                            InterfaceC7750lN m = this.a.m(type, annotationArr, this.d);
                            this.i = true;
                            return new AbstractC5213ay1.c(this.c, i, m);
                        } catch (RuntimeException e) {
                            throw C6504gE2.q(this.c, e, i, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw C6504gE2.p(this.c, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw C6504gE2.p(this.c, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC4036Qk2) {
                j(i, type);
                Class<?> a2 = a(C6504gE2.h(type));
                for (int i6 = i - 1; i6 >= 0; i6--) {
                    AbstractC5213ay1<?> abstractC5213ay1 = this.w[i6];
                    if ((abstractC5213ay1 instanceof AbstractC5213ay1.q) && ((AbstractC5213ay1.q) abstractC5213ay1).a.equals(a2)) {
                        throw C6504gE2.p(this.c, i, "@Tag type " + a2.getName() + " is duplicate of " + C8459oD1.b.a(this.c, i6) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC5213ay1.q(a2);
            } else {
                return null;
            }
        }

        public final void i(int i, String str) {
            if (A.matcher(str).matches()) {
                if (this.v.contains(str)) {
                    return;
                }
                throw C6504gE2.p(this.c, i, "URL \"%s\" does not contain \"{%s}\".", this.s, str);
            }
            throw C6504gE2.p(this.c, i, "@Path parameter name must match %s. Found: %s", z.pattern(), str);
        }

        public final void j(int i, Type type) {
            if (!C6504gE2.j(type)) {
                return;
            }
            throw C6504gE2.p(this.c, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public C6802hS1(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.a.c;
        this.d = aVar.f760o;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.u;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.r;
        this.k = aVar.w;
        this.l = aVar.x;
    }

    public static C6802hS1 b(C8284nU1 c8284nU1, Class<?> cls, Method method) {
        return new a(c8284nU1, cls, method).b();
    }

    public Request a(@InterfaceC10571ws1 Object obj, Object[] objArr) throws IOException {
        AbstractC5213ay1<?>[] abstractC5213ay1Arr = this.k;
        int length = objArr.length;
        if (length == abstractC5213ay1Arr.length) {
            C6061eS1 c6061eS1 = new C6061eS1(this.d, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
            if (this.l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                abstractC5213ay1Arr[i].a(c6061eS1, objArr[i]);
            }
            return c6061eS1.k().tag(C10719xT0.class, new C10719xT0(this.a, obj, this.b, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC5213ay1Arr.length + C9811tl1.d);
    }
}
