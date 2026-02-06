package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.AbstractC8244nK1;

/* renamed from: o.Vh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4509Vh extends AbstractC8244nK1 {

    /* renamed from: o.Vh$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC8244nK1.a<C4509Vh, b> {
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.Vh$b, o.s3] */
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ b k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        @Override // o.XK0
        /* renamed from: l0 */
        public C4509Vh get() throws IOException {
            return new C4509Vh(this);
        }
    }

    public static b k() {
        return new b();
    }

    @Override // o.AbstractC8244nK1
    public void a(int i) throws IOException {
        if (i == -1) {
            close();
        }
        super.a(i);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        ((FilterInputStream) this).in = C6501gE.X;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public C4509Vh(b bVar) throws IOException {
        super(bVar);
    }

    @Deprecated
    public C4509Vh(InputStream inputStream) {
        super(C6501gE.a(inputStream));
    }
}
