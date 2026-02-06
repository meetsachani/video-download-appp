package o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import o.OU;
import o.R11;

@Deprecated
/* renamed from: o.Qy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4086Qy1<T> implements R11.e {
    public final long a;
    public final OU b;
    public final int c;
    public final C4004Qc2 d;
    public final a<? extends T> e;
    @InterfaceC11300zs1
    public volatile T f;

    /* renamed from: o.Qy1$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C4086Qy1(FU fu, Uri uri, int i, a<? extends T> aVar) {
        this(fu, new OU.b().j(uri).c(1).a(), i, aVar);
    }

    public static <T> T g(FU fu, a<? extends T> aVar, Uri uri, int i) throws IOException {
        C4086Qy1 c4086Qy1 = new C4086Qy1(fu, uri, i, aVar);
        c4086Qy1.a();
        return (T) C9542sf.g(c4086Qy1.e());
    }

    public static <T> T h(FU fu, a<? extends T> aVar, OU ou, int i) throws IOException {
        C4086Qy1 c4086Qy1 = new C4086Qy1(fu, ou, i, aVar);
        c4086Qy1.a();
        return (T) C9542sf.g(c4086Qy1.e());
    }

    @Override // o.R11.e
    public final void a() throws IOException {
        this.d.A();
        MU mu = new MU(this.d, this.b);
        try {
            mu.f();
            this.f = this.e.a((Uri) C9542sf.g(this.d.getUri()), mu);
        } finally {
            TD2.t(mu);
        }
    }

    public long b() {
        return this.d.m();
    }

    public Map<String, List<String>> d() {
        return this.d.z();
    }

    @InterfaceC11300zs1
    public final T e() {
        return this.f;
    }

    public Uri f() {
        return this.d.y();
    }

    public C4086Qy1(FU fu, OU ou, int i, a<? extends T> aVar) {
        this.d = new C4004Qc2(fu);
        this.b = ou;
        this.c = i;
        this.e = aVar;
        this.a = N11.a();
    }

    @Override // o.R11.e
    public final void c() {
    }
}
