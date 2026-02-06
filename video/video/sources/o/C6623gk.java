package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import o.AbstractC8244nK1;

/* renamed from: o.gk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6623gk extends AbstractC8244nK1 {
    public static final Comparator<C5914ds> e1 = Comparator.comparing(new Function() { // from class: o.fk
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Integer.valueOf(((C5914ds) obj).e());
        }
    }).reversed();
    public C5914ds Y0;
    public final List<C5914ds> Z;
    public int Z0;
    public int[] a1;
    public final boolean b1;
    public boolean c1;
    public int d1;

    /* renamed from: o.gk$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC8244nK1.a<C6623gk, b> {

        /* renamed from: o  reason: collision with root package name */
        public static final C5914ds[] f753o = {C5914ds.Z};
        public C5914ds[] m = f753o;
        public boolean n;

        public static C5914ds p0() {
            return f753o[0];
        }

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.gk$b, o.s3] */
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ b k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        @Override // o.XK0
        /* renamed from: o0 */
        public C6623gk get() throws IOException {
            return new C6623gk(this);
        }

        public b q0(C5914ds... c5914dsArr) {
            C5914ds[] c5914dsArr2;
            if (c5914dsArr != null) {
                c5914dsArr2 = (C5914ds[]) c5914dsArr.clone();
            } else {
                c5914dsArr2 = f753o;
            }
            this.m = c5914dsArr2;
            return this;
        }

        public b r0(boolean z) {
            this.n = z;
            return this;
        }
    }

    public static b l() {
        return new b();
    }

    public final C5914ds m() {
        return this.Z.stream().filter(new Predicate() { // from class: o.ek
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean r;
                r = C6623gk.this.r((C5914ds) obj);
                return r;
            }
        }).findFirst().orElse(null);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        boolean z;
        this.d1 = this.Z0;
        if (this.a1 == null) {
            z = true;
        } else {
            z = false;
        }
        this.c1 = z;
        ((FilterInputStream) this).in.mark(i);
    }

    public C5914ds n() throws IOException {
        if (this.a1 == null) {
            this.Y0 = s();
        }
        return this.Y0;
    }

    public String o() throws IOException {
        n();
        C5914ds c5914ds = this.Y0;
        if (c5914ds == null) {
            return null;
        }
        return c5914ds.c();
    }

    public boolean p() throws IOException {
        if (n() != null) {
            return true;
        }
        return false;
    }

    public boolean q(C5914ds c5914ds) throws IOException {
        if (this.Z.contains(c5914ds)) {
            return Objects.equals(n(), c5914ds);
        }
        throw new IllegalArgumentException("Stream not configured to detect " + c5914ds);
    }

    public final boolean r(C5914ds c5914ds) {
        return c5914ds.f(this.a1);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        f();
        int t = t();
        return t >= 0 ? t : ((FilterInputStream) this).in.read();
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.Z0 = this.d1;
            if (this.c1) {
                this.a1 = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C5914ds s() throws IOException {
        int e = this.Z.get(0).e();
        int[] iArr = new int[e];
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            int read = ((FilterInputStream) this).in.read();
            iArr[i2] = read;
            a(read);
            i++;
            if (iArr[i2] < 0) {
                break;
            }
        }
        this.a1 = Arrays.copyOf(iArr, i);
        C5914ds m = m();
        if (m != null && !this.b1) {
            if (m.e() < this.a1.length) {
                this.Z0 = m.e();
                return m;
            }
            this.a1 = new int[0];
        }
        return m;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        int i = 0;
        while (true) {
            j2 = i;
            if (j <= j2 || t() < 0) {
                break;
            }
            i++;
        }
        return ((FilterInputStream) this).in.skip(j - j2) + j2;
    }

    public final int t() throws IOException {
        n();
        int i = this.Z0;
        int[] iArr = this.a1;
        if (i < iArr.length) {
            this.Z0 = i + 1;
            return iArr[i];
        }
        return -1;
    }

    public C6623gk(b bVar) throws IOException {
        super(bVar);
        if (C7743lL0.u0(bVar.m) != 0) {
            this.b1 = bVar.n;
            List<C5914ds> asList = Arrays.asList(bVar.m);
            asList.sort(e1);
            this.Z = asList;
            return;
        }
        throw new IllegalArgumentException("No ByteOrderMark specified.");
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i4 = 0;
        while (i2 > 0 && i3 >= 0) {
            i3 = t();
            if (i3 >= 0) {
                bArr[i] = (byte) (i3 & 255);
                i2--;
                i4++;
                i++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        a(read);
        if (read < 0) {
            if (i4 > 0) {
                return i4;
            }
            return -1;
        }
        return i4 + read;
    }

    @Deprecated
    public C6623gk(InputStream inputStream) {
        this(inputStream, false, b.f753o);
    }

    @Deprecated
    public C6623gk(InputStream inputStream, boolean z) {
        this(inputStream, z, b.f753o);
    }

    @Deprecated
    public C6623gk(InputStream inputStream, boolean z, C5914ds... c5914dsArr) {
        super(inputStream);
        if (C7743lL0.u0(c5914dsArr) != 0) {
            this.b1 = z;
            List<C5914ds> asList = Arrays.asList(c5914dsArr);
            asList.sort(e1);
            this.Z = asList;
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    @Deprecated
    public C6623gk(InputStream inputStream, C5914ds... c5914dsArr) {
        this(inputStream, false, c5914dsArr);
    }
}
