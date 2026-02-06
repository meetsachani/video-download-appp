package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.InterfaceC7750lN;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.er  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6153er extends InterfaceC7750lN.a {

    /* renamed from: o.er$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC7750lN<ResponseBody, ResponseBody> {
        public static final a a = new a();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public ResponseBody a(ResponseBody responseBody) throws IOException {
            try {
                return C6504gE2.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: o.er$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC7750lN<Object, String> {
        public static final d a = new d();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: o.er$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC7750lN<ResponseBody, C7458kA2> {
        public static final e a = new e();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public C7458kA2 a(ResponseBody responseBody) {
            responseBody.close();
            return C7458kA2.a;
        }
    }

    /* renamed from: o.er$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC7750lN<ResponseBody, Void> {
        public static final f a = new f();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // o.InterfaceC7750lN.a
    @InterfaceC10571ws1
    public InterfaceC7750lN<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C8284nU1 c8284nU1) {
        if (RequestBody.class.isAssignableFrom(C6504gE2.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override // o.InterfaceC7750lN.a
    @InterfaceC10571ws1
    public InterfaceC7750lN<ResponseBody, ?> d(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
        if (type == ResponseBody.class) {
            if (C6504gE2.l(annotationArr, InterfaceC4593Wd2.class)) {
                return c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (C6504gE2.m(type)) {
                return e.a;
            }
            return null;
        }
    }

    /* renamed from: o.er$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC7750lN<RequestBody, RequestBody> {
        public static final b a = new b();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: o.er$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC7750lN<ResponseBody, ResponseBody> {
        public static final c a = new c();

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }
}
