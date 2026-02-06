package o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import o.EnumC10796xo;

@InterfaceC7311ja0
@InterfaceC4238Sm
/* renamed from: o.wo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10553wo<T> implements IF1<T>, Serializable {
    public final EnumC10796xo.c X;
    public final int Y;
    public final c Y0;
    public final TB0<? super T> Z;

    /* renamed from: o.wo$b */
    /* loaded from: classes3.dex */
    public static class b<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] X;
        public final int Y;
        public final c Y0;
        public final TB0<? super T> Z;

        public b(C10553wo<T> c10553wo) {
            this.X = EnumC10796xo.c.i(c10553wo.X.a);
            this.Y = c10553wo.Y;
            this.Z = c10553wo.Z;
            this.Y0 = c10553wo.Y0;
        }

        public Object readResolve() {
            return new C10553wo(new EnumC10796xo.c(this.X), this.Y, this.Z, this.Y0);
        }
    }

    /* renamed from: o.wo$c */
    /* loaded from: classes3.dex */
    public interface c extends Serializable {
        <T> boolean C5(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, EnumC10796xo.c cVar);

        <T> boolean S0(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, EnumC10796xo.c cVar);

        int ordinal();
    }

    public static <T> C10553wo<T> h(TB0<? super T> tb0, int i) {
        return j(tb0, i);
    }

    public static <T> C10553wo<T> i(TB0<? super T> tb0, int i, double d) {
        return k(tb0, i, d);
    }

    public static <T> C10553wo<T> j(TB0<? super T> tb0, long j) {
        return k(tb0, j, 0.03d);
    }

    public static <T> C10553wo<T> k(TB0<? super T> tb0, long j, double d) {
        return l(tb0, j, d, EnumC10796xo.Y);
    }

    @InterfaceC5299bJ2
    public static <T> C10553wo<T> l(TB0<? super T> tb0, long j, double d, c cVar) {
        boolean z;
        boolean z2;
        C10664xF1.E(tb0);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z3 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Expected insertions (%s) must be >= 0", j);
        if (d > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.u(z2, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        if (d < 1.0d) {
            z3 = true;
        }
        C10664xF1.u(z3, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        C10664xF1.E(cVar);
        if (i == 0) {
            j = 1;
        }
        long p = p(j, d);
        try {
            return new C10553wo<>(new EnumC10796xo.c(p), q(j, p), tb0, cVar);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Could not create BloomFilter of ");
            sb.append(p);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    @InterfaceC5299bJ2
    public static long p(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @InterfaceC5299bJ2
    public static int q(long j, long j2) {
        return Math.max(1, (int) Math.round((j2 / j) * Math.log(2.0d)));
    }

    public static <T> C10553wo<T> t(InputStream inputStream, TB0<? super T> tb0) throws IOException {
        int i;
        int i2;
        DataInputStream dataInputStream;
        byte readByte;
        C10664xF1.F(inputStream, "InputStream");
        C10664xF1.F(tb0, "Funnel");
        int i3 = -1;
        try {
            dataInputStream = new DataInputStream(inputStream);
            readByte = dataInputStream.readByte();
            try {
                i2 = WB2.p(dataInputStream.readByte());
            } catch (RuntimeException e) {
                e = e;
                i2 = -1;
                i3 = readByte;
                i = -1;
            }
        } catch (RuntimeException e2) {
            e = e2;
            i = -1;
            i2 = -1;
        }
        try {
            i3 = dataInputStream.readInt();
            EnumC10796xo enumC10796xo = EnumC10796xo.values()[readByte];
            EnumC10796xo.c cVar = new EnumC10796xo.c(R41.d(i3, 64L));
            for (int i4 = 0; i4 < i3; i4++) {
                cVar.g(i4, dataInputStream.readLong());
            }
            return new C10553wo<>(cVar, i2, tb0, enumC10796xo);
        } catch (RuntimeException e3) {
            e = e3;
            int i5 = i3;
            i3 = readByte;
            i = i5;
            StringBuilder sb = new StringBuilder(134);
            sb.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
            sb.append(i3);
            sb.append(" numHashFunctions: ");
            sb.append(i2);
            sb.append(" dataLength: ");
            sb.append(i);
            throw new IOException(sb.toString(), e);
        }
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // o.IF1
    @Deprecated
    public boolean apply(@InterfaceC8885py1 T t) {
        return o(t);
    }

    public long e() {
        double b2 = this.X.b();
        return C7193j50.q(((-Math.log1p(-(this.X.a() / b2))) * b2) / this.Y, RoundingMode.HALF_UP);
    }

    @Override // o.IF1
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10553wo) {
            C10553wo c10553wo = (C10553wo) obj;
            if (this.Y == c10553wo.Y && this.Z.equals(c10553wo.Z) && this.X.equals(c10553wo.X) && this.Y0.equals(c10553wo.Y0)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC5299bJ2
    public long f() {
        return this.X.b();
    }

    public C10553wo<T> g() {
        return new C10553wo<>(this.X.c(), this.Y, this.Z, this.Y0);
    }

    public int hashCode() {
        return C2593Bt1.b(Integer.valueOf(this.Y), this.Z, this.Y0, this.X);
    }

    public double m() {
        return Math.pow(this.X.a() / f(), this.Y);
    }

    public boolean n(C10553wo<T> c10553wo) {
        C10664xF1.E(c10553wo);
        if (this != c10553wo && this.Y == c10553wo.Y && f() == c10553wo.f() && this.Y0.equals(c10553wo.Y0) && this.Z.equals(c10553wo.Z)) {
            return true;
        }
        return false;
    }

    public boolean o(@InterfaceC8885py1 T t) {
        return this.Y0.S0(t, this.Z, this.Y, this.X);
    }

    @InterfaceC6181ey
    public boolean r(@InterfaceC8885py1 T t) {
        return this.Y0.C5(t, this.Z, this.Y, this.X);
    }

    public void s(C10553wo<T> c10553wo) {
        boolean z;
        boolean z2;
        boolean z3;
        C10664xF1.E(c10553wo);
        if (this != c10553wo) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Cannot combine a BloomFilter with itself.");
        int i = this.Y;
        int i2 = c10553wo.Y;
        if (i == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.m(z2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        if (f() == c10553wo.f()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.s(z3, "BloomFilters must have the same size underlying bit arrays (%s != %s)", f(), c10553wo.f());
        C10664xF1.y(this.Y0.equals(c10553wo.Y0), "BloomFilters must have equal strategies (%s != %s)", this.Y0, c10553wo.Y0);
        C10664xF1.y(this.Z.equals(c10553wo.Z), "BloomFilters must have equal funnels (%s != %s)", this.Z, c10553wo.Z);
        this.X.f(c10553wo.X);
    }

    public void u(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(C6715h62.a(this.Y0.ordinal()));
        dataOutputStream.writeByte(WB2.a(this.Y));
        dataOutputStream.writeInt(this.X.a.length());
        for (int i = 0; i < this.X.a.length(); i++) {
            dataOutputStream.writeLong(this.X.a.get(i));
        }
    }

    public C10553wo(EnumC10796xo.c cVar, int i, TB0<? super T> tb0, c cVar2) {
        C10664xF1.k(i > 0, "numHashFunctions (%s) must be > 0", i);
        C10664xF1.k(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.X = (EnumC10796xo.c) C10664xF1.E(cVar);
        this.Y = i;
        this.Z = (TB0) C10664xF1.E(tb0);
        this.Y0 = (c) C10664xF1.E(cVar2);
    }
}
