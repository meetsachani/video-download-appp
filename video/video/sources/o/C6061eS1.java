package o;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: o.eS1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6061eS1 {
    public static final String m = " \"<>^`{}|\\?#";
    public final String a;
    public final HttpUrl b;
    @InterfaceC10571ws1
    public String c;
    @InterfaceC10571ws1
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    @InterfaceC10571ws1
    public MediaType g;
    public final boolean h;
    @InterfaceC10571ws1
    public MultipartBody.Builder i;
    @InterfaceC10571ws1
    public FormBody.Builder j;
    @InterfaceC10571ws1
    public RequestBody k;
    public static final char[] l = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F'};
    public static final Pattern n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: o.eS1$a */
    /* loaded from: classes4.dex */
    public static class a extends RequestBody {
        public final RequestBody a;
        public final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC2579Bq interfaceC2579Bq) throws IOException {
            this.a.writeTo(interfaceC2579Bq);
        }
    }

    public C6061eS1(String str, HttpUrl httpUrl, @InterfaceC10571ws1 String str2, @InterfaceC10571ws1 Headers headers, @InterfaceC10571ws1 MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.newBuilder();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public static String i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && m.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                C5422bq c5422bq = new C5422bq();
                c5422bq.Z1(str, 0, i);
                j(c5422bq, str, i, length, z);
                return c5422bq.Y4();
            }
        }
        return str;
    }

    public static void j(C5422bq c5422bq, String str, int i, int i2, boolean z) {
        C5422bq c5422bq2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && m.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    c5422bq.R0(codePointAt);
                } else {
                    if (c5422bq2 == null) {
                        c5422bq2 = new C5422bq();
                    }
                    c5422bq2.R0(codePointAt);
                    long size = c5422bq2.size();
                    for (long j = 0; j < size; j++) {
                        byte x = c5422bq2.x(j);
                        c5422bq.writeByte(37);
                        char[] cArr = l;
                        c5422bq.writeByte(cArr[((x & 255) >> 4) & 15]);
                        c5422bq.writeByte(cArr[x & C8077mf.q]);
                    }
                    c5422bq2.h();
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.j.addEncoded(str, str2);
        } else {
            this.j.add(str, str2);
        }
    }

    public void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else if (z) {
            this.f.addUnsafeNonAscii(str, str2);
        } else {
            this.f.add(str, str2);
        }
    }

    public void c(Headers headers) {
        this.f.addAll(headers);
    }

    public void d(Headers headers, RequestBody requestBody) {
        this.i.addPart(headers, requestBody);
    }

    public void e(MultipartBody.Part part) {
        this.i.addPart(part);
    }

    public void f(String str, String str2, boolean z) {
        if (this.c != null) {
            String i = i(str2, z);
            String str3 = this.c;
            String replace = str3.replace("{" + str + "}", i);
            if (!n.matcher(replace).matches()) {
                this.c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    public void g(String str, @InterfaceC10571ws1 String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.b.newBuilder(str3);
            this.d = newBuilder;
            if (newBuilder != null) {
                this.c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        if (z) {
            this.d.addEncodedQueryParameter(str, str2);
        } else {
            this.d.addQueryParameter(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @InterfaceC10571ws1 T t) {
        this.e.tag(cls, t);
    }

    public Request.Builder k() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.b.resolve(this.c);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        a aVar = this.k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f.add("Content-Type", mediaType.toString());
            }
        }
        return this.e.url(resolve).headers(this.f.build()).method(this.a, aVar);
    }

    public void l(RequestBody requestBody) {
        this.k = requestBody;
    }

    public void m(Object obj) {
        this.c = obj.toString();
    }
}
