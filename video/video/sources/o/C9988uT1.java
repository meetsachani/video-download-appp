package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.uT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9988uT1 {

    /* renamed from: o.uT1$a */
    /* loaded from: classes3.dex */
    public class a implements WZ0<List<String>> {
        public final List<String> a = C10608x11.q();

        @Override // o.WZ0
        public boolean a(String str) {
            this.a.add(str);
            return true;
        }

        @Override // o.WZ0
        /* renamed from: b */
        public List<String> getResult() {
            return this.a;
        }
    }

    /* renamed from: o.uT1$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7625ks {
        public final URL a;

        public /* synthetic */ b(URL url, a aVar) {
            this(url);
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return this.a.openStream();
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Resources.asByteSource(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public b(URL url) {
            this.a = (URL) C10664xF1.E(url);
        }
    }

    public static AbstractC7625ks a(URL url) {
        return new b(url, null);
    }

    public static AbstractC7459kB b(URL url, Charset charset) {
        return a(url).a(charset);
    }

    public static void c(URL url, OutputStream outputStream) throws IOException {
        a(url).f(outputStream);
    }

    @InterfaceC6181ey
    public static URL d(Class<?> cls, String str) {
        boolean z;
        URL resource = cls.getResource(str);
        if (resource != null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.y(z, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }

    @InterfaceC6181ey
    public static URL e(String str) {
        boolean z;
        URL resource = ((ClassLoader) C3743Nk1.a(Thread.currentThread().getContextClassLoader(), C9988uT1.class.getClassLoader())).getResource(str);
        if (resource != null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "resource %s not found.", str);
        return resource;
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    public static <T> T f(URL url, Charset charset, WZ0<T> wz0) throws IOException {
        return (T) b(url, charset).p(wz0);
    }

    public static List<String> g(URL url, Charset charset) throws IOException {
        return (List) f(url, charset, new a());
    }

    public static byte[] h(URL url) throws IOException {
        return a(url).o();
    }

    public static String i(URL url, Charset charset) throws IOException {
        return b(url, charset).n();
    }
}
