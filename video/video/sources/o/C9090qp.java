package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.AbstractC8244nK1;

/* renamed from: o.qp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9090qp extends AbstractC8244nK1 {
    public long Y0;
    public long Z;
    public final long Z0;
    public final InterfaceC7735lJ0<Long, Long> a1;
    public boolean b1;

    /* renamed from: o.qp$b */
    /* loaded from: classes4.dex */
    public static abstract class b<T extends b<T>> extends AbstractC8244nK1.a<C9090qp, T> {
        public long m;
        public long n = -1;

        /* renamed from: o  reason: collision with root package name */
        public InterfaceC7735lJ0<Long, Long> f842o = InterfaceC7735lJ0.a();
        public boolean p = true;

        public long l0() {
            return this.m;
        }

        public long m0() {
            return this.n;
        }

        public InterfaceC7735lJ0<Long, Long> n0() {
            return this.f842o;
        }

        public boolean o0() {
            return this.p;
        }

        public T p0(long j) {
            this.m = Math.max(0L, j);
            return (T) c();
        }

        public T q0(long j) {
            this.n = Math.max(-1L, j);
            return (T) c();
        }

        public T r0(InterfaceC7735lJ0<Long, Long> interfaceC7735lJ0) {
            if (interfaceC7735lJ0 == null) {
                interfaceC7735lJ0 = InterfaceC7735lJ0.a();
            }
            this.f842o = interfaceC7735lJ0;
            return (T) c();
        }

        public T s0(boolean z) {
            this.p = z;
            return (T) c();
        }
    }

    /* renamed from: o.qp$c */
    /* loaded from: classes4.dex */
    public static class c extends b<c> {
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ AbstractC9396s3 k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.qp$c, o.qp$b] */
        @Override // o.C9090qp.b
        public /* bridge */ /* synthetic */ c p0(long j) {
            return super.p0(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.qp$c, o.qp$b] */
        @Override // o.C9090qp.b
        public /* bridge */ /* synthetic */ c q0(long j) {
            return super.q0(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.qp$c, o.qp$b] */
        @Override // o.C9090qp.b
        public /* bridge */ /* synthetic */ c r0(InterfaceC7735lJ0 interfaceC7735lJ0) {
            return super.r0(interfaceC7735lJ0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.qp$c, o.qp$b] */
        @Override // o.C9090qp.b
        public /* bridge */ /* synthetic */ c s0(boolean z) {
            return super.s0(z);
        }

        @Override // o.XK0
        /* renamed from: t0 */
        public C9090qp get() throws IOException {
            return new C9090qp(this);
        }
    }

    public static c k() {
        return new c();
    }

    @Override // o.AbstractC8244nK1
    public synchronized void a(int i) throws IOException {
        if (i != -1) {
            try {
                this.Z += i;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.a(i);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), (int) Math.min(o(), 2147483647L));
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.b1) {
            super.close();
        }
    }

    public synchronized long l() {
        return this.Z;
    }

    public long m() {
        return this.Z0;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.Y0 = this.Z;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Deprecated
    public long n() {
        return this.Z0;
    }

    public long o() {
        long m = m();
        if (m == -1) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, m - l());
    }

    public final boolean p() {
        if (this.Z0 >= 0 && l() >= this.Z0) {
            return true;
        }
        return false;
    }

    public boolean q() {
        return this.b1;
    }

    public void r(long j, long j2) throws IOException {
        this.a1.accept(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (p()) {
            r(this.Z0, l());
            return -1;
        }
        return super.read();
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        ((FilterInputStream) this).in.reset();
        this.Z = this.Y0;
    }

    @Deprecated
    public synchronized void s(boolean z) {
        this.b1 = z;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(t(j));
        this.Z += skip;
        return skip;
    }

    public final long t(long j) {
        long j2 = this.Z0;
        if (j2 >= 0) {
            return Math.min(j, j2 - l());
        }
        return j;
    }

    public String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    public C9090qp(c cVar) throws IOException {
        super(cVar);
        this.b1 = true;
        this.Z = cVar.l0();
        this.Z0 = cVar.m0();
        this.b1 = cVar.o0();
        this.a1 = cVar.n0();
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (p()) {
            r(this.Z0, l());
            return -1;
        }
        return super.read(bArr, i, (int) t(i2));
    }

    @Deprecated
    public C9090qp(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public C9090qp(InputStream inputStream, c cVar) {
        super(inputStream, cVar);
        this.b1 = true;
        this.Z = cVar.l0();
        this.Z0 = cVar.m0();
        this.b1 = cVar.o0();
        this.a1 = cVar.n0();
    }

    @Deprecated
    public C9090qp(InputStream inputStream, long j) {
        this(inputStream, (c) k().q0(j));
    }
}
