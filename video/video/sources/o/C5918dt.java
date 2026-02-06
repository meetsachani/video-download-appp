package o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o.EU;
import o.InterfaceC4844Ys;

@Deprecated
/* renamed from: o.dt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5918dt implements EU {
    public static final long k = 5242880;
    public static final int l = 20480;
    public static final long m = 2097152;
    public static final String n = "CacheDataSink";
    public final InterfaceC4844Ys a;
    public final long b;
    public final int c;
    @InterfaceC11300zs1
    public OU d;
    public long e;
    @InterfaceC11300zs1
    public File f;
    @InterfaceC11300zs1
    public OutputStream g;
    public long h;
    public long i;
    public C10724xU1 j;

    /* renamed from: o.dt$a */
    /* loaded from: classes2.dex */
    public static final class a extends InterfaceC4844Ys.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: o.dt$b */
    /* loaded from: classes2.dex */
    public static final class b implements EU.a {
        public InterfaceC4844Ys a;
        public long b = C5918dt.k;
        public int c = C5918dt.l;

        @Override // o.EU.a
        public EU a() {
            return new C5918dt((InterfaceC4844Ys) C9542sf.g(this.a), this.b, this.c);
        }

        @InterfaceC6181ey
        public b b(int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public b c(InterfaceC4844Ys interfaceC4844Ys) {
            this.a = interfaceC4844Ys;
            return this;
        }

        @InterfaceC6181ey
        public b d(long j) {
            this.b = j;
            return this;
        }
    }

    public C5918dt(InterfaceC4844Ys interfaceC4844Ys, long j) {
        this(interfaceC4844Ys, j, l);
    }

    @Override // o.EU
    public void a(OU ou) throws a {
        long j;
        C9542sf.g(ou.i);
        if (ou.h == -1 && ou.d(2)) {
            this.d = null;
            return;
        }
        this.d = ou;
        if (ou.d(4)) {
            j = this.b;
        } else {
            j = Long.MAX_VALUE;
        }
        this.e = j;
        this.i = 0L;
        try {
            c(ou);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public final void b() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            TD2.t(this.g);
            this.g = null;
            this.f = null;
            this.a.o((File) TD2.o(this.f), this.h);
        } catch (Throwable th) {
            TD2.t(this.g);
            this.g = null;
            this.f = null;
            ((File) TD2.o(this.f)).delete();
            throw th;
        }
    }

    public final void c(OU ou) throws IOException {
        long j = ou.h;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.i, this.e);
        }
        this.f = this.a.b((String) TD2.o(ou.i), ou.g + this.i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            C10724xU1 c10724xU1 = this.j;
            if (c10724xU1 == null) {
                this.j = new C10724xU1(fileOutputStream, this.c);
            } else {
                c10724xU1.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // o.EU
    public void close() throws a {
        if (this.d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // o.EU
    public void write(byte[] bArr, int i, int i2) throws a {
        OU ou = this.d;
        if (ou != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.h == this.e) {
                        b();
                        c(ou);
                    }
                    int min = (int) Math.min(i2 - i3, this.e - this.h);
                    ((OutputStream) TD2.o(this.g)).write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.h += j;
                    this.i += j;
                } catch (IOException e) {
                    throw new a(e);
                }
            }
        }
    }

    public C5918dt(InterfaceC4844Ys interfaceC4844Ys, long j, int i) {
        C9542sf.j(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            I31.n(n, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.a = (InterfaceC4844Ys) C9542sf.g(interfaceC4844Ys);
        this.b = i2 == 0 ? Long.MAX_VALUE : j;
        this.c = i;
    }
}
