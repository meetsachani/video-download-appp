package o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import o.C8541oZ;
import o.InterfaceC10186vI0;

@Deprecated
/* renamed from: o.oZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8541oZ extends AbstractC5887dl implements InterfaceC10186vI0 {
    public static final long A = 2048;
    public static final int u = 8000;
    public static final int v = 8000;
    public static final String w = "DefaultHttpDataSource";
    public static final int x = 20;
    public static final int y = 307;
    public static final int z = 308;
    public final boolean f;
    public final int g;
    public final int h;
    @InterfaceC11300zs1
    public final String i;
    @InterfaceC11300zs1
    public final InterfaceC10186vI0.g j;
    public final InterfaceC10186vI0.g k;
    public final boolean l;
    @InterfaceC11300zs1
    public IF1<String> m;
    @InterfaceC11300zs1
    public OU n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public HttpURLConnection f828o;
    @InterfaceC11300zs1
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;

    /* renamed from: o.oZ$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC10186vI0.c {
        @InterfaceC11300zs1
        public InterfaceC4261Sr2 b;
        @InterfaceC11300zs1
        public IF1<String> c;
        @InterfaceC11300zs1
        public String d;
        public boolean g;
        public boolean h;
        public final InterfaceC10186vI0.g a = new InterfaceC10186vI0.g();
        public int e = 8000;
        public int f = 8000;

        @Override // o.InterfaceC10186vI0.c, o.FU.a
        /* renamed from: c */
        public C8541oZ a() {
            C8541oZ c8541oZ = new C8541oZ(this.d, this.e, this.f, this.g, this.a, this.c, this.h);
            InterfaceC4261Sr2 interfaceC4261Sr2 = this.b;
            if (interfaceC4261Sr2 != null) {
                c8541oZ.s(interfaceC4261Sr2);
            }
            return c8541oZ;
        }

        @InterfaceC6181ey
        public b d(boolean z) {
            this.g = z;
            return this;
        }

        @InterfaceC6181ey
        public b e(int i) {
            this.e = i;
            return this;
        }

        @InterfaceC6181ey
        public b f(@InterfaceC11300zs1 IF1<String> if1) {
            this.c = if1;
            return this;
        }

        @Override // o.InterfaceC10186vI0.c
        @InterfaceC6181ey
        /* renamed from: g */
        public final b b(Map<String, String> map) {
            this.a.b(map);
            return this;
        }

        @InterfaceC6181ey
        public b h(boolean z) {
            this.h = z;
            return this;
        }

        @InterfaceC6181ey
        public b i(int i) {
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public b j(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
            this.b = interfaceC4261Sr2;
            return this;
        }

        @InterfaceC6181ey
        public b k(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }
    }

    /* renamed from: o.oZ$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC9862ty0<String, List<String>> {
        public final Map<String, List<String>> X;

        public c(Map<String, List<String>> map) {
            this.X = map;
        }

        public static /* synthetic */ boolean W5(String str) {
            if (str != null) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ boolean X5(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Map<String, List<String>> L5() {
            return this.X;
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public boolean containsKey(@InterfaceC11300zs1 Object obj) {
            if (obj != null && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public boolean containsValue(@InterfaceC11300zs1 Object obj) {
            return super.P5(obj);
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C10856y22.i(super.entrySet(), new IF1() { // from class: o.qZ
                @Override // o.IF1
                public final boolean apply(Object obj) {
                    return C8541oZ.c.X5((Map.Entry) obj);
                }
            });
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (obj != null && super.Q5(obj)) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public int hashCode() {
            return super.R5();
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty() || (super.size() == 1 && super.containsKey(null))) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public Set<String> keySet() {
            return C10856y22.i(super.keySet(), new IF1() { // from class: o.pZ
                @Override // o.IF1
                public final boolean apply(Object obj) {
                    return C8541oZ.c.W5((String) obj);
                }
            });
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // o.AbstractC9862ty0, java.util.Map
        @InterfaceC11300zs1
        public List<String> get(@InterfaceC11300zs1 Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    public static boolean E(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void H(@InterfaceC11300zs1 HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = TD2.a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C9542sf.g(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void C() {
        HttpURLConnection httpURLConnection = this.f828o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                I31.e(w, "Unexpected error while disconnecting", e);
            }
            this.f828o = null;
        }
    }

    public final URL D(URL url, @InterfaceC11300zs1 String str, OU ou) throws InterfaceC10186vI0.d {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new InterfaceC10186vI0.d("Unsupported protocol redirect: " + protocol, ou, 2001, 1);
                } else if (!this.f && !protocol.equals(url.getProtocol())) {
                    throw new InterfaceC10186vI0.d("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + C9811tl1.d, ou, 2001, 1);
                } else {
                    return url2;
                }
            } catch (MalformedURLException e) {
                throw new InterfaceC10186vI0.d(e, ou, 2001, 1);
            }
        }
        throw new InterfaceC10186vI0.d("Null location redirect", ou, 2001, 1);
    }

    @Override // o.InterfaceC10186vI0
    public int E0() {
        int i;
        if (this.f828o != null && (i = this.r) > 0) {
            return i;
        }
        return -1;
    }

    public final HttpURLConnection F(URL url, int i, @InterfaceC11300zs1 byte[] bArr, long j, long j2, boolean z2, boolean z3, Map<String, String> map) throws IOException {
        String str;
        boolean z4;
        HttpURLConnection I = I(url);
        I.setConnectTimeout(this.g);
        I.setReadTimeout(this.h);
        HashMap hashMap = new HashMap();
        InterfaceC10186vI0.g gVar = this.j;
        if (gVar != null) {
            hashMap.putAll(gVar.c());
        }
        hashMap.putAll(this.k.c());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            I.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = HI0.a(j, j2);
        if (a2 != null) {
            I.setRequestProperty("Range", a2);
        }
        String str2 = this.i;
        if (str2 != null) {
            I.setRequestProperty("User-Agent", str2);
        }
        if (z2) {
            str = "gzip";
        } else {
            str = XH0.S;
        }
        I.setRequestProperty("Accept-Encoding", str);
        I.setInstanceFollowRedirects(z3);
        if (bArr != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        I.setDoOutput(z4);
        I.setRequestMethod(OU.c(i));
        if (bArr != null) {
            I.setFixedLengthStreamingMode(bArr.length);
            I.connect();
            OutputStream outputStream = I.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return I;
        }
        I.connect();
        return I;
    }

    public final HttpURLConnection G(OU ou) throws IOException {
        HttpURLConnection F;
        URL url = new URL(ou.a.toString());
        int i = ou.c;
        byte[] bArr = ou.d;
        long j = ou.g;
        long j2 = ou.h;
        int i2 = 1;
        boolean d = ou.d(1);
        if (!this.f && !this.l) {
            return F(url, i, bArr, j, j2, d, true, ou.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                F = F(url, i, bArr, j, j2, d, false, ou.e);
                int responseCode = F.getResponseCode();
                String headerField = F.getHeaderField("Location");
                if ((i != i2 && i != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    F.disconnect();
                    if (!this.l || responseCode != 302) {
                        bArr = null;
                        i = 1;
                    }
                    url = D(url, headerField, ou);
                } else {
                    F.disconnect();
                    url = D(url, headerField, ou);
                }
                i3 = i4;
                i2 = 1;
            } else {
                throw new InterfaceC10186vI0.d(new NoRouteToHostException("Too many redirects: " + i4), ou, 2001, 1);
            }
        }
        return F;
    }

    @InterfaceC5056aJ2
    public HttpURLConnection I(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final int J(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s;
        if (j != -1) {
            long j2 = j - this.t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) TD2.o(this.p)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.t += read;
        y(read);
        return read;
    }

    @Deprecated
    public void K(@InterfaceC11300zs1 IF1<String> if1) {
        this.m = if1;
    }

    public final void L(long j, OU ou) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int read = ((InputStream) TD2.o(this.p)).read(bArr, 0, (int) Math.min(j, 4096));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        y(read);
                    } else {
                        throw new InterfaceC10186vI0.d(ou, 2008, 1);
                    }
                } else {
                    throw new InterfaceC10186vI0.d(new InterruptedIOException(), ou, 2000, 1);
                }
            }
        }
    }

    @Override // o.FU
    public long a(OU ou) throws InterfaceC10186vI0.d {
        byte[] bArr;
        LU lu;
        this.n = ou;
        long j = 0;
        this.t = 0L;
        this.s = 0L;
        A(ou);
        try {
            HttpURLConnection G = G(ou);
            this.f828o = G;
            this.r = G.getResponseCode();
            String responseMessage = G.getResponseMessage();
            int i = this.r;
            long j2 = -1;
            if (i >= 200 && i <= 299) {
                String contentType = G.getContentType();
                IF1<String> if1 = this.m;
                if (if1 != null && !if1.apply(contentType)) {
                    C();
                    throw new InterfaceC10186vI0.e(contentType, ou);
                }
                if (this.r == 200) {
                    long j3 = ou.g;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                boolean E = E(G);
                if (!E) {
                    long j4 = ou.h;
                    if (j4 != -1) {
                        this.s = j4;
                    } else {
                        long b2 = HI0.b(G.getHeaderField("Content-Length"), G.getHeaderField(AI0.f0));
                        if (b2 != -1) {
                            j2 = b2 - j;
                        }
                        this.s = j2;
                    }
                } else {
                    this.s = ou.h;
                }
                try {
                    this.p = G.getInputStream();
                    if (E) {
                        this.p = new GZIPInputStream(this.p);
                    }
                    this.q = true;
                    B(ou);
                    try {
                        L(j, ou);
                        return this.s;
                    } catch (IOException e) {
                        C();
                        if (e instanceof InterfaceC10186vI0.d) {
                            throw ((InterfaceC10186vI0.d) e);
                        }
                        throw new InterfaceC10186vI0.d(e, ou, 2000, 1);
                    }
                } catch (IOException e2) {
                    C();
                    throw new InterfaceC10186vI0.d(e2, ou, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = G.getHeaderFields();
            if (this.r == 416) {
                if (ou.g == HI0.c(G.getHeaderField(AI0.f0))) {
                    this.q = true;
                    B(ou);
                    long j5 = ou.h;
                    if (j5 == -1) {
                        return 0L;
                    }
                    return j5;
                }
            }
            InputStream errorStream = G.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = TD2.S1(errorStream);
                } else {
                    bArr = TD2.f;
                }
            } catch (IOException unused) {
                bArr = TD2.f;
            }
            byte[] bArr2 = bArr;
            C();
            if (this.r == 416) {
                lu = new LU(2008);
            } else {
                lu = null;
            }
            throw new InterfaceC10186vI0.f(this.r, responseMessage, lu, headerFields, ou, bArr2);
        } catch (IOException e3) {
            C();
            throw InterfaceC10186vI0.d.c(e3, ou, 1);
        }
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f828o;
        if (httpURLConnection == null) {
            return AbstractC6044eO0.u();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    @Override // o.FU
    public void close() throws InterfaceC10186vI0.d {
        try {
            InputStream inputStream = this.p;
            if (inputStream != null) {
                long j = this.s;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.t;
                }
                H(this.f828o, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new InterfaceC10186vI0.d(e, (OU) TD2.o(this.n), 2000, 3);
                }
            }
        } finally {
            this.p = null;
            C();
            if (this.q) {
                this.q = false;
                z();
            }
        }
    }

    @Override // o.InterfaceC10186vI0
    public void f(String str, String str2) {
        C9542sf.g(str);
        C9542sf.g(str2);
        this.k.e(str, str2);
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f828o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws InterfaceC10186vI0.d {
        try {
            return J(bArr, i, i2);
        } catch (IOException e) {
            throw InterfaceC10186vI0.d.c(e, (OU) TD2.o(this.n), 2);
        }
    }

    @Override // o.InterfaceC10186vI0
    public void u() {
        this.k.a();
    }

    @Override // o.InterfaceC10186vI0
    public void w(String str) {
        C9542sf.g(str);
        this.k.d(str);
    }

    @Deprecated
    public C8541oZ() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public C8541oZ(@InterfaceC11300zs1 String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public C8541oZ(@InterfaceC11300zs1 String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public C8541oZ(@InterfaceC11300zs1 String str, int i, int i2, boolean z2, @InterfaceC11300zs1 InterfaceC10186vI0.g gVar) {
        this(str, i, i2, z2, gVar, null, false);
    }

    public C8541oZ(@InterfaceC11300zs1 String str, int i, int i2, boolean z2, @InterfaceC11300zs1 InterfaceC10186vI0.g gVar, @InterfaceC11300zs1 IF1<String> if1, boolean z3) {
        super(true);
        this.i = str;
        this.g = i;
        this.h = i2;
        this.f = z2;
        this.j = gVar;
        this.m = if1;
        this.k = new InterfaceC10186vI0.g();
        this.l = z3;
    }
}
