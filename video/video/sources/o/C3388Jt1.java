package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.AbstractC8244nK1;
import o.C3388Jt1;

/* renamed from: o.Jt1 */
/* loaded from: classes4.dex */
public class C3388Jt1 extends AbstractC8244nK1 {
    public final List<c> Z;

    /* renamed from: o.Jt1$a */
    /* loaded from: classes4.dex */
    public static abstract class a<T extends a<T>> extends AbstractC8244nK1.a<C3388Jt1, T> {
        public List<c> m;

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ AbstractC9396s3 k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        public void m0(List<c> list) {
            this.m = list;
        }
    }

    /* renamed from: o.Jt1$b */
    /* loaded from: classes4.dex */
    public static class b extends a<b> {
        @Override // o.XK0
        /* renamed from: n0 */
        public C3388Jt1 get() throws IOException {
            return new C3388Jt1(this);
        }
    }

    public C3388Jt1(a<?> aVar) throws IOException {
        super(aVar);
        this.Z = aVar.m;
    }

    public static /* synthetic */ void k(int i, c cVar) {
        cVar.b(i);
    }

    public static /* synthetic */ void l(IOException iOException, c cVar) {
        cVar.d(iOException);
    }

    public static /* synthetic */ void m(byte[] bArr, int i, int i2, c cVar) {
        cVar.c(bArr, i, i2);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            r();
        } else {
            u(e);
        }
    }

    public void n(c cVar) {
        this.Z.add(cVar);
    }

    public void o() throws IOException {
        C7743lL0.M(this);
    }

    public final void p(EJ0<c> ej0) throws IOException {
        EJ0.k(ej0, this.Z);
    }

    public List<c> q() {
        return new ArrayList(this.Z);
    }

    public void r() throws IOException {
        p(new EJ0() { // from class: o.Gt1
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((C3388Jt1.c) obj).a();
            }
        });
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        try {
            i = super.read();
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (e != null) {
            u(e);
            throw e;
        }
        if (i == -1) {
            v();
        } else {
            s(i);
        }
        return i;
    }

    public void s(final int i) throws IOException {
        p(new EJ0() { // from class: o.Et1
            @Override // o.EJ0
            public final void accept(Object obj) {
                C3388Jt1.k(i, (C3388Jt1.c) obj);
            }
        });
    }

    public void t(final byte[] bArr, final int i, final int i2) throws IOException {
        p(new EJ0() { // from class: o.Ht1
            @Override // o.EJ0
            public final void accept(Object obj) {
                C3388Jt1.m(bArr, i, i2, (C3388Jt1.c) obj);
            }
        });
    }

    public void u(final IOException iOException) throws IOException {
        p(new EJ0() { // from class: o.It1
            @Override // o.EJ0
            public final void accept(Object obj) {
                C3388Jt1.l(iOException, (C3388Jt1.c) obj);
            }
        });
    }

    public void v() throws IOException {
        p(new EJ0() { // from class: o.Ft1
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((C3388Jt1.c) obj).e();
            }
        });
    }

    public final void x(byte[] bArr, int i, int i2, IOException iOException) throws IOException {
        if (iOException == null) {
            if (i2 == -1) {
                v();
                return;
            } else if (i2 > 0) {
                t(bArr, i, i2);
                return;
            } else {
                return;
            }
        }
        u(iOException);
        throw iOException;
    }

    public void y(c cVar) {
        this.Z.remove(cVar);
    }

    public void z() {
        this.Z.clear();
    }

    public C3388Jt1(InputStream inputStream) {
        this(inputStream, new ArrayList());
    }

    public C3388Jt1(InputStream inputStream, List<c> list) {
        super(inputStream);
        this.Z = list;
    }

    public C3388Jt1(InputStream inputStream, c... cVarArr) {
        this(inputStream, Arrays.asList(cVarArr));
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i;
        try {
            i = super.read(bArr);
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        x(bArr, 0, i, e);
        return i;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            i3 = super.read(bArr, i, i2);
            e = null;
        } catch (IOException e) {
            e = e;
            i3 = 0;
        }
        x(bArr, i, i3, e);
        return i3;
    }

    /* renamed from: o.Jt1$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        public void a() throws IOException {
        }

        public void e() throws IOException {
        }

        public void b(int i) throws IOException {
        }

        public void d(IOException iOException) throws IOException {
            throw iOException;
        }

        public void c(byte[] bArr, int i, int i2) throws IOException {
        }
    }
}
