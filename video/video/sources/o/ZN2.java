package o;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C6623gk;

/* loaded from: classes4.dex */
public class ZN2 extends Reader {
    public static final String Y0;
    public static final String Z0;
    public static final String a1;
    public static final String b1;
    public static final String c1 = "UTF-32BE";
    public static final String d1 = "UTF-32LE";
    public static final String e1;
    public static final String f1 = "UTF-32";
    public static final String g1 = "CP1047";
    public static final C5914ds[] h1;
    public static final C5914ds[] i1;
    public static final Pattern j1;
    public static final Pattern k1;
    public static final String l1 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    public static final String m1 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    public static final String n1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null";
    public static final String o1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    public static final String p1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME";
    public final Reader X;
    public final String Y;
    public final String Z;

    /* loaded from: classes4.dex */
    public static class a extends AbstractC9396s3<ZN2, a> {
        public boolean l = true;
        public boolean m = true;
        public String n;

        @Override // o.XK0
        /* renamed from: j0 */
        public ZN2 get() throws IOException {
            String name;
            if (this.l) {
                name = null;
            } else {
                name = P().name();
            }
            if (this.n == null) {
                return new ZN2(S(), this.m, name);
            }
            return new ZN2(S(), this.n, this.m, name);
        }

        @Override // o.AbstractC9396s3
        /* renamed from: k0 */
        public a e0(String str) {
            boolean z;
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            this.l = z;
            return (a) super.f0(IB.f(str, Q()));
        }

        @Override // o.AbstractC9396s3
        /* renamed from: l0 */
        public a f0(Charset charset) {
            boolean z;
            if (charset == null) {
                z = true;
            } else {
                z = false;
            }
            this.l = z;
            return (a) super.f0(charset);
        }

        public a m0(String str) {
            this.n = str;
            return this;
        }

        public a n0(boolean z) {
            this.m = z;
            return this;
        }
    }

    static {
        String name = StandardCharsets.UTF_8.name();
        Y0 = name;
        Z0 = StandardCharsets.US_ASCII.name();
        String name2 = StandardCharsets.UTF_16BE.name();
        a1 = name2;
        String name3 = StandardCharsets.UTF_16LE.name();
        b1 = name3;
        e1 = StandardCharsets.UTF_16.name();
        h1 = new C5914ds[]{C5914ds.Z, C5914ds.Y0, C5914ds.Z0, C5914ds.a1, C5914ds.b1};
        i1 = new C5914ds[]{new C5914ds(name, 60, 63, 120, 109), new C5914ds(name2, 0, 60, 0, 63), new C5914ds(name3, 60, 0, 63, 0), new C5914ds(c1, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new C5914ds(d1, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new C5914ds(g1, 76, 111, 167, DE.g)};
        j1 = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
        k1 = Pattern.compile("^<\\?xml\\s+(?:version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:'1.[0-9]+'))\\s+)??encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:'[A-Za-z0-9][A-Za-z0-9._+:-]*'))", 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZN2(File file) throws IOException {
        this(r2);
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
    }

    public static /* synthetic */ void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(' ');
    }

    public static a d() {
        return new a();
    }

    public static String j(String str) {
        int indexOf;
        String str2;
        if (str != null && (indexOf = str.indexOf(";")) > -1) {
            Matcher matcher = j1.matcher(str.substring(indexOf + 1));
            if (matcher.find()) {
                str2 = matcher.group(1);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return str2.toUpperCase(Locale.ROOT);
            }
        }
        return null;
    }

    public static String k(String str) {
        if (str != null) {
            int indexOf = str.indexOf(";");
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            return str.trim();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw new java.io.IOException("Unexpected end of XML stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        throw new java.io.IOException("XML prolog or ROOT element not found on first " + r7 + " bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n(InputStream inputStream, String str) throws IOException {
        if (str != null) {
            byte[] k = C7743lL0.k();
            inputStream.mark(8192);
            int read = inputStream.read(k, 0, 8192);
            String str2 = "";
            int i = 8192;
            int i2 = 0;
            int i3 = -1;
            while (read != -1 && i3 == -1 && i2 < 8192) {
                i2 += read;
                i -= read;
                read = inputStream.read(k, i2, i);
                str2 = new String(k, 0, i2, str);
                i3 = str2.indexOf(62);
            }
            if (i2 > 0) {
                inputStream.reset();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, i3 + 1)));
                final StringBuilder sb = new StringBuilder();
                EJ0.i(bufferedReader.lines(), new EJ0() { // from class: o.YN2
                    @Override // o.EJ0
                    public final void accept(Object obj) {
                        ZN2.a(sb, (String) obj);
                    }
                });
                Matcher matcher = k1.matcher(sb);
                if (matcher.find()) {
                    String upperCase = matcher.group(1).toUpperCase(Locale.ROOT);
                    return upperCase.substring(1, upperCase.length() - 1);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static boolean o(String str) {
        if (str != null) {
            if (!str.equals("application/xml") && !str.equals("application/xml-dtd") && !str.equals("application/xml-external-parsed-entity")) {
                if (str.startsWith("application/") && str.endsWith("+xml")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean p(String str) {
        if (str != null) {
            if (!str.equals("text/xml") && !str.equals("text/xml-external-parsed-entity")) {
                if (str.startsWith("text/") && str.endsWith("+xml")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    public String f(String str, String str2, String str3, boolean z, String str4) throws IOException {
        if (z && str3 != null) {
            return str3;
        }
        String k = k(str4);
        String j = j(str4);
        boolean o2 = o(k);
        boolean p = p(k);
        if (!o2 && !p) {
            throw new C5076aO2(MessageFormat.format(p1, k, j, str, str2, str3), k, j, str, str2, str3);
        }
        if (j == null) {
            if (o2) {
                return h(str, str2, str3);
            }
            String str5 = this.Z;
            if (str5 == null) {
                return Z0;
            }
            return str5;
        }
        if (!j.equals(a1) && !j.equals(b1)) {
            String str6 = e1;
            if (j.equals(str6)) {
                if (str != null && str.startsWith(str6)) {
                    return str;
                }
                throw new C5076aO2(MessageFormat.format(o1, k, j, str, str2, str3), k, j, str, str2, str3);
            } else if (!j.equals(c1) && !j.equals(d1)) {
                if (j.equals(f1)) {
                    if (str != null && str.startsWith(f1)) {
                        return str;
                    }
                    throw new C5076aO2(MessageFormat.format(o1, k, j, str, str2, str3), k, j, str, str2, str3);
                }
            } else if (str != null) {
                throw new C5076aO2(MessageFormat.format(n1, k, j, str, str2, str3), k, j, str, str2, str3);
            }
        } else if (str != null) {
            throw new C5076aO2(MessageFormat.format(n1, k, j, str, str2, str3), k, j, str, str2, str3);
        }
        return j;
    }

    public String h(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                if (str3.equals(e1) && (str2.equals(a1) || str2.equals(b1))) {
                    return str2;
                }
                return str3;
            }
            String str4 = this.Z;
            if (str4 == null) {
                return Y0;
            }
            return str4;
        }
        String str5 = Y0;
        if (str.equals(str5)) {
            if (str2 != null && !str2.equals(str5)) {
                throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(str5)) {
                throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
            }
        } else if (!str.equals(a1) && !str.equals(b1)) {
            if (!str.equals(c1) && !str.equals(d1)) {
                throw new C5076aO2(MessageFormat.format(m1, str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(f1) && !str3.equals(str)) {
                throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
            }
        } else if (str2 != null && !str2.equals(str)) {
            throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
        } else {
            if (str3 != null && !str3.equals(e1) && !str3.equals(str)) {
                throw new C5076aO2(MessageFormat.format(l1, str, str2, str3), str, str2, str3);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i(String str, C5076aO2 c5076aO2) throws IOException {
        ZN2 zn2;
        String d;
        if (str != null && str.startsWith("text/html")) {
            String substring = str.substring(9);
            try {
                zn2 = this;
                try {
                    return zn2.f(c5076aO2.a(), c5076aO2.e(), c5076aO2.d(), true, "text/xml" + substring);
                } catch (C5076aO2 e) {
                    e = e;
                    c5076aO2 = e;
                    d = c5076aO2.d();
                    if (d == null) {
                    }
                    if (d != null) {
                    }
                }
            } catch (C5076aO2 e2) {
                e = e2;
                zn2 = this;
            }
        } else {
            zn2 = this;
        }
        d = c5076aO2.d();
        if (d == null) {
            d = c5076aO2.b();
        }
        if (d != null) {
            String str2 = zn2.Z;
            if (str2 == null) {
                return Y0;
            }
            return str2;
        }
        return d;
    }

    public String l() {
        return this.Z;
    }

    public String m() {
        return this.Y;
    }

    public final String q(C6623gk c6623gk, C6623gk c6623gk2, boolean z) throws IOException {
        String o2 = c6623gk.o();
        String o3 = c6623gk2.o();
        try {
            return h(o2, o3, n(c6623gk2, o3));
        } catch (C5076aO2 e) {
            if (z) {
                return i(null, e);
            }
            throw e;
        }
    }

    public final String r(C6623gk c6623gk, C6623gk c6623gk2, boolean z, String str) throws IOException {
        String o2 = c6623gk.o();
        String o3 = c6623gk2.o();
        try {
            return f(o2, o3, n(c6623gk2, o3), z, str);
        } catch (C5076aO2 e) {
            if (z) {
                return i(str, e);
            }
            throw e;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.X.read(cArr, i, i2);
    }

    @Deprecated
    public ZN2(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    @Deprecated
    public ZN2(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, (String) null);
    }

    @Deprecated
    public ZN2(InputStream inputStream, boolean z, String str) throws IOException {
        this.Z = str;
        Objects.requireNonNull(inputStream, "inputStream");
        C6623gk c6623gk = new C6623gk(new BufferedInputStream(inputStream, 8192), false, h1);
        C6623gk c6623gk2 = new C6623gk(c6623gk, true, i1);
        String q = q(c6623gk, c6623gk2, z);
        this.Y = q;
        this.X = new InputStreamReader(c6623gk2, q);
    }

    @Deprecated
    public ZN2(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    @Deprecated
    public ZN2(InputStream inputStream, String str, boolean z) throws IOException {
        this(inputStream, str, z, null);
    }

    @Deprecated
    public ZN2(InputStream inputStream, String str, boolean z, String str2) throws IOException {
        this.Z = str2;
        Objects.requireNonNull(inputStream, "inputStream");
        C6623gk c6623gk = new C6623gk(new BufferedInputStream(inputStream, 8192), false, h1);
        C6623gk c6623gk2 = new C6623gk(c6623gk, true, i1);
        String r = r(c6623gk, c6623gk2, z, str);
        this.Y = r;
        this.X = new InputStreamReader(c6623gk2, r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZN2(Path path) throws IOException {
        this(r2);
        InputStream newInputStream;
        Objects.requireNonNull(path, "file");
        newInputStream = Files.newInputStream(N30.a(path), new OpenOption[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZN2(URL url) throws IOException {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, "url");
    }

    public ZN2(URLConnection uRLConnection, String str) throws IOException {
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.Z = str;
        String contentType = uRLConnection.getContentType();
        C6623gk c6623gk = ((C6623gk.b) C6623gk.l().z(new BufferedInputStream(uRLConnection.getInputStream(), 8192))).r0(false).q0(h1).get();
        C6623gk c6623gk2 = ((C6623gk.b) C6623gk.l().z(new BufferedInputStream(c6623gk, 8192))).r0(true).q0(i1).get();
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.Y = q(c6623gk, c6623gk2, true);
        } else {
            this.Y = r(c6623gk, c6623gk2, true, contentType);
        }
        this.X = new InputStreamReader(c6623gk2, this.Y);
    }
}
