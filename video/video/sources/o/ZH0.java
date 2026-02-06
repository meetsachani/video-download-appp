package o;

import android.net.Uri;
import java.io.IOException;
import o.InterfaceC9309rh1;
import o.M11;

@Deprecated
/* loaded from: classes2.dex */
public interface ZH0 {

    /* loaded from: classes2.dex */
    public interface a {
        ZH0 a(NH0 nh0, M11 m11, YH0 yh0);
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean b(Uri uri, M11.d dVar, boolean z);

        void j();
    }

    /* loaded from: classes2.dex */
    public static final class c extends IOException {
        public final Uri X;

        public c(Uri uri) {
            this.X = uri;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends IOException {
        public final Uri X;

        public d(Uri uri) {
            this.X = uri;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void K(UH0 uh0);
    }

    void a(Uri uri) throws IOException;

    void b(b bVar);

    long c();

    @InterfaceC11300zs1
    VH0 d();

    void e(Uri uri);

    boolean f(Uri uri);

    void g(b bVar);

    void h(Uri uri, InterfaceC9309rh1.a aVar, e eVar);

    boolean i();

    boolean j(Uri uri, long j);

    void k() throws IOException;

    @InterfaceC11300zs1
    UH0 l(Uri uri, boolean z);

    void stop();
}
