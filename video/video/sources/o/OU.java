package o;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class OU {
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f573o = 8;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public final Uri a;
    public final long b;
    public final int c;
    @InterfaceC11300zs1
    public final byte[] d;
    public final Map<String, String> e;
    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    @InterfaceC11300zs1
    public final String i;
    public final int j;
    @InterfaceC11300zs1
    public final Object k;

    /* loaded from: classes2.dex */
    public static final class b {
        @InterfaceC11300zs1
        public Uri a;
        public long b;
        public int c;
        @InterfaceC11300zs1
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        @InterfaceC11300zs1
        public String h;
        public int i;
        @InterfaceC11300zs1
        public Object j;

        public OU a() {
            C9542sf.l(this.a, "The uri must be set.");
            return new OU(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        @InterfaceC6181ey
        public b b(@InterfaceC11300zs1 Object obj) {
            this.j = obj;
            return this;
        }

        @InterfaceC6181ey
        public b c(int i) {
            this.i = i;
            return this;
        }

        @InterfaceC6181ey
        public b d(@InterfaceC11300zs1 byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b e(int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public b f(Map<String, String> map) {
            this.e = map;
            return this;
        }

        @InterfaceC6181ey
        public b g(@InterfaceC11300zs1 String str) {
            this.h = str;
            return this;
        }

        @InterfaceC6181ey
        public b h(long j) {
            this.g = j;
            return this;
        }

        @InterfaceC6181ey
        public b i(long j) {
            this.f = j;
            return this;
        }

        @InterfaceC6181ey
        public b j(Uri uri) {
            this.a = uri;
            return this;
        }

        @InterfaceC6181ey
        public b k(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        @InterfaceC6181ey
        public b l(long j) {
            this.b = j;
            return this;
        }

        public b() {
            this.c = 1;
            this.e = Collections.EMPTY_MAP;
            this.g = -1L;
        }

        public b(OU ou) {
            this.a = ou.a;
            this.b = ou.b;
            this.c = ou.c;
            this.d = ou.d;
            this.e = ou.e;
            this.f = ou.g;
            this.g = ou.h;
            this.h = ou.i;
            this.i = ou.j;
            this.j = ou.k;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    static {
        C6361fi0.a("goog.exo.datasource");
    }

    public static String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return Q32.j;
        }
        return "GET";
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.c);
    }

    public boolean d(int i) {
        if ((this.j & i) == i) {
            return true;
        }
        return false;
    }

    public OU e(long j) {
        long j2 = this.h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return f(j, j3);
    }

    public OU f(long j, long j2) {
        if (j == 0 && this.h == j2) {
            return this;
        }
        return new OU(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public OU g(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.e);
        hashMap.putAll(map);
        return new OU(this.a, this.b, this.c, this.d, hashMap, this.g, this.h, this.i, this.j, this.k);
    }

    public OU h(Map<String, String> map) {
        return new OU(this.a, this.b, this.c, this.d, map, this.g, this.h, this.i, this.j, this.k);
    }

    public OU i(Uri uri) {
        return new OU(uri, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }

    public String toString() {
        return "DataSpec[" + b() + C4500Ve2.b + this.a + C6566gU0.h + this.g + C6566gU0.h + this.h + C6566gU0.h + this.i + C6566gU0.h + this.j + C6566gU0.g;
    }

    public OU(Uri uri) {
        this(uri, 0L, -1L);
    }

    public OU(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }

    @Deprecated
    public OU(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @Deprecated
    public OU(Uri uri, long j, long j2, @InterfaceC11300zs1 String str) {
        this(uri, j, j, j2, str, 0);
    }

    @Deprecated
    public OU(Uri uri, long j, long j2, @InterfaceC11300zs1 String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    @Deprecated
    public OU(Uri uri, long j, long j2, @InterfaceC11300zs1 String str, int i, Map<String, String> map) {
        this(uri, 1, null, j, j, j2, str, i, map);
    }

    @Deprecated
    public OU(Uri uri, long j, long j2, long j3, @InterfaceC11300zs1 String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    @Deprecated
    public OU(Uri uri, @InterfaceC11300zs1 byte[] bArr, long j, long j2, long j3, @InterfaceC11300zs1 String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    @Deprecated
    public OU(Uri uri, int i, @InterfaceC11300zs1 byte[] bArr, long j, long j2, long j3, @InterfaceC11300zs1 String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, Collections.EMPTY_MAP);
    }

    @Deprecated
    public OU(Uri uri, int i, @InterfaceC11300zs1 byte[] bArr, long j, long j2, long j3, @InterfaceC11300zs1 String str, int i2, Map<String, String> map) {
        this(uri, j - j2, i, bArr, map, j2, j3, str, i2, null);
    }

    public OU(Uri uri, long j, int i, @InterfaceC11300zs1 byte[] bArr, Map<String, String> map, long j2, long j3, @InterfaceC11300zs1 String str, int i2, @InterfaceC11300zs1 Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = false;
        C9542sf.a(j4 >= 0);
        C9542sf.a(j2 >= 0);
        C9542sf.a((j3 > 0 || j3 == -1) ? true : z);
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }
}
