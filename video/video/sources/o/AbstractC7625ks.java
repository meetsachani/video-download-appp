package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.ks  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7625ks {

    /* renamed from: o.ks$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC7459kB {
        public final Charset a;

        public a(Charset charset) {
            this.a = (Charset) C10664xF1.E(charset);
        }

        @Override // o.AbstractC7459kB
        public AbstractC7625ks a(Charset charset) {
            if (charset.equals(this.a)) {
                return AbstractC7625ks.this;
            }
            return super.a(charset);
        }

        @Override // o.AbstractC7459kB
        public Reader m() throws IOException {
            return new InputStreamReader(AbstractC7625ks.this.m(), this.a);
        }

        @Override // o.AbstractC7459kB
        public String n() throws IOException {
            return new String(AbstractC7625ks.this.o(), this.a);
        }

        public String toString() {
            String obj = AbstractC7625ks.this.toString();
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSource(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.ks$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC7625ks {
        public final byte[] a;
        public final int b;
        public final int c;

        public b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // o.AbstractC7625ks
        public long f(OutputStream outputStream) throws IOException {
            outputStream.write(this.a, this.b, this.c);
            return this.c;
        }

        @Override // o.AbstractC7625ks
        public AbstractC8471oG0 j(InterfaceC9449sG0 interfaceC9449sG0) throws IOException {
            return interfaceC9449sG0.k(this.a, this.b, this.c);
        }

        @Override // o.AbstractC7625ks
        public boolean k() {
            if (this.c == 0) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7625ks
        public InputStream l() throws IOException {
            return m();
        }

        @Override // o.AbstractC7625ks
        public InputStream m() {
            return new ByteArrayInputStream(this.a, this.b, this.c);
        }

        @Override // o.AbstractC7625ks
        @InterfaceC9377ry1
        public <T> T n(InterfaceC7140is<T> interfaceC7140is) throws IOException {
            interfaceC7140is.a(this.a, this.b, this.c);
            return interfaceC7140is.getResult();
        }

        @Override // o.AbstractC7625ks
        public byte[] o() {
            byte[] bArr = this.a;
            int i = this.b;
            return Arrays.copyOfRange(bArr, i, this.c + i);
        }

        @Override // o.AbstractC7625ks
        public long p() {
            return this.c;
        }

        @Override // o.AbstractC7625ks
        public AbstractC4468Uv1<Long> q() {
            return AbstractC4468Uv1.f(Long.valueOf(this.c));
        }

        @Override // o.AbstractC7625ks
        public AbstractC7625ks r(long j, long j2) {
            boolean z;
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.p(z, "offset (%s) may not be negative", j);
            if (j2 >= 0) {
                z2 = true;
            }
            C10664xF1.p(z2, "length (%s) may not be negative", j2);
            long min = Math.min(j, this.c);
            return new b(this.a, this.b + ((int) min), (int) Math.min(j2, this.c - min));
        }

        public String toString() {
            String k = C8077mf.k(AbstractC6372fl.a().m(this.a, this.b, this.c), 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 17);
            sb.append("ByteSource.wrap(");
            sb.append(k);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public b(byte[] bArr, int i, int i2) {
            this.a = bArr;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: o.ks$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7625ks {
        public final Iterable<? extends AbstractC7625ks> a;

        public c(Iterable<? extends AbstractC7625ks> iterable) {
            this.a = (Iterable) C10664xF1.E(iterable);
        }

        @Override // o.AbstractC7625ks
        public boolean k() throws IOException {
            for (AbstractC7625ks abstractC7625ks : this.a) {
                if (!abstractC7625ks.k()) {
                    return false;
                }
            }
            return true;
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return new C4333Tl1(this.a.iterator());
        }

        @Override // o.AbstractC7625ks
        public long p() throws IOException {
            long j = 0;
            for (AbstractC7625ks abstractC7625ks : this.a) {
                j += abstractC7625ks.p();
                if (j < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        @Override // o.AbstractC7625ks
        public AbstractC4468Uv1<Long> q() {
            Iterable<? extends AbstractC7625ks> iterable = this.a;
            if (!(iterable instanceof Collection)) {
                return AbstractC4468Uv1.a();
            }
            long j = 0;
            for (AbstractC7625ks abstractC7625ks : iterable) {
                AbstractC4468Uv1<Long> q = abstractC7625ks.q();
                if (!q.e()) {
                    return AbstractC4468Uv1.a();
                }
                j += q.d().longValue();
                if (j < 0) {
                    return AbstractC4468Uv1.f(Long.MAX_VALUE);
                }
            }
            return AbstractC4468Uv1.f(Long.valueOf(j));
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("ByteSource.concat(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.ks$d */
    /* loaded from: classes3.dex */
    public static final class d extends b {
        public static final d d = new d();

        public d() {
            super(new byte[0]);
        }

        @Override // o.AbstractC7625ks
        public AbstractC7459kB a(Charset charset) {
            C10664xF1.E(charset);
            return AbstractC7459kB.h();
        }

        @Override // o.AbstractC7625ks.b, o.AbstractC7625ks
        public byte[] o() {
            return this.a;
        }

        @Override // o.AbstractC7625ks.b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* renamed from: o.ks$e */
    /* loaded from: classes3.dex */
    public final class e extends AbstractC7625ks {
        public final long a;
        public final long b;

        public e(long j, long j2) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.p(z, "offset (%s) may not be negative", j);
            C10664xF1.p(j2 >= 0, "length (%s) may not be negative", j2);
            this.a = j;
            this.b = j2;
        }

        @Override // o.AbstractC7625ks
        public boolean k() throws IOException {
            if (this.b != 0 && !super.k()) {
                return false;
            }
            return true;
        }

        @Override // o.AbstractC7625ks
        public InputStream l() throws IOException {
            return t(AbstractC7625ks.this.l());
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return t(AbstractC7625ks.this.m());
        }

        @Override // o.AbstractC7625ks
        public AbstractC4468Uv1<Long> q() {
            AbstractC4468Uv1<Long> q = AbstractC7625ks.this.q();
            if (q.e()) {
                long longValue = q.d().longValue();
                return AbstractC4468Uv1.f(Long.valueOf(Math.min(this.b, longValue - Math.min(this.a, longValue))));
            }
            return AbstractC4468Uv1.a();
        }

        @Override // o.AbstractC7625ks
        public AbstractC7625ks r(long j, long j2) {
            boolean z;
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.p(z, "offset (%s) may not be negative", j);
            if (j2 >= 0) {
                z2 = true;
            }
            C10664xF1.p(z2, "length (%s) may not be negative", j2);
            long j3 = this.b - j;
            if (j3 <= 0) {
                return AbstractC7625ks.i();
            }
            return AbstractC7625ks.this.r(this.a + j, Math.min(j2, j3));
        }

        public final InputStream t(InputStream inputStream) throws IOException {
            long j = this.a;
            if (j > 0) {
                try {
                    if (C8129ms.t(inputStream, j) < this.a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return C8129ms.f(inputStream, this.b);
        }

        public String toString() {
            String obj = AbstractC7625ks.this.toString();
            long j = this.a;
            long j2 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 50);
            sb.append(obj);
            sb.append(".slice(");
            sb.append(j);
            sb.append(C6566gU0.h);
            sb.append(j2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    public static AbstractC7625ks b(Iterable<? extends AbstractC7625ks> iterable) {
        return new c(iterable);
    }

    public static AbstractC7625ks c(Iterator<? extends AbstractC7625ks> it) {
        return b(AbstractC5317bO0.G(it));
    }

    public static AbstractC7625ks d(AbstractC7625ks... abstractC7625ksArr) {
        return b(AbstractC5317bO0.H(abstractC7625ksArr));
    }

    public static AbstractC7625ks i() {
        return d.d;
    }

    public static AbstractC7625ks s(byte[] bArr) {
        return new b(bArr);
    }

    public AbstractC7459kB a(Charset charset) {
        return new a(charset);
    }

    public boolean e(AbstractC7625ks abstractC7625ks) throws IOException {
        int n;
        C10664xF1.E(abstractC7625ks);
        byte[] d2 = C8129ms.d();
        byte[] d3 = C8129ms.d();
        C8218nE a2 = C8218nE.a();
        try {
            InputStream inputStream = (InputStream) a2.d(m());
            InputStream inputStream2 = (InputStream) a2.d(abstractC7625ks.m());
            do {
                n = C8129ms.n(inputStream, d2, 0, d2.length);
                if (n == C8129ms.n(inputStream2, d3, 0, d3.length) && Arrays.equals(d2, d3)) {
                }
                return false;
            } while (n == d2.length);
            a2.close();
            return true;
        } catch (Throwable th) {
            try {
                throw a2.f(th);
            } finally {
                a2.close();
            }
        }
    }

    @InterfaceC6181ey
    public long f(OutputStream outputStream) throws IOException {
        C10664xF1.E(outputStream);
        try {
            return C8129ms.b((InputStream) C8218nE.a().d(m()), outputStream);
        } finally {
        }
    }

    @InterfaceC6181ey
    public long g(AbstractC7382js abstractC7382js) throws IOException {
        C10664xF1.E(abstractC7382js);
        C8218nE a2 = C8218nE.a();
        try {
            return C8129ms.b((InputStream) a2.d(m()), (OutputStream) a2.d(abstractC7382js.c()));
        } finally {
        }
    }

    public final long h(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long t = C8129ms.t(inputStream, 2147483647L);
            if (t > 0) {
                j += t;
            } else {
                return j;
            }
        }
    }

    public AbstractC8471oG0 j(InterfaceC9449sG0 interfaceC9449sG0) throws IOException {
        CG0 g = interfaceC9449sG0.g();
        f(UB0.a(g));
        return g.o();
    }

    public boolean k() throws IOException {
        AbstractC4468Uv1<Long> q = q();
        boolean z = false;
        if (q.e()) {
            if (q.d().longValue() != 0) {
                return false;
            }
            return true;
        }
        try {
            if (((InputStream) C8218nE.a().d(m())).read() == -1) {
                z = true;
            }
            return z;
        } finally {
        }
    }

    public InputStream l() throws IOException {
        InputStream m = m();
        if (m instanceof BufferedInputStream) {
            return (BufferedInputStream) m;
        }
        return new BufferedInputStream(m);
    }

    public abstract InputStream m() throws IOException;

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public <T> T n(InterfaceC7140is<T> interfaceC7140is) throws IOException {
        C10664xF1.E(interfaceC7140is);
        try {
            return (T) C8129ms.o((InputStream) C8218nE.a().d(m()), interfaceC7140is);
        } finally {
        }
    }

    public byte[] o() throws IOException {
        byte[] u;
        C8218nE a2 = C8218nE.a();
        try {
            InputStream inputStream = (InputStream) a2.d(m());
            AbstractC4468Uv1<Long> q = q();
            if (q.e()) {
                u = C8129ms.v(inputStream, q.d().longValue());
            } else {
                u = C8129ms.u(inputStream);
            }
            return u;
        } catch (Throwable th) {
            try {
                throw a2.f(th);
            } finally {
                a2.close();
            }
        }
    }

    public long p() throws IOException {
        AbstractC4468Uv1<Long> q = q();
        if (q.e()) {
            return q.d().longValue();
        }
        C8218nE a2 = C8218nE.a();
        try {
            return h((InputStream) a2.d(m()));
        } catch (IOException unused) {
            a2.close();
            try {
                return C8129ms.e((InputStream) C8218nE.a().d(m()));
            } finally {
            }
        } finally {
        }
    }

    @InterfaceC4238Sm
    public AbstractC4468Uv1<Long> q() {
        return AbstractC4468Uv1.a();
    }

    public AbstractC7625ks r(long j, long j2) {
        return new e(j, j2);
    }
}
