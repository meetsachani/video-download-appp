package o;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes4.dex */
public class HQ {

    /* loaded from: classes4.dex */
    public static class b implements j {
        public final e a;
        public final e b;
        public final e c;

        public b(e eVar, e eVar2, e eVar3) {
            this.a = eVar;
            this.b = eVar2;
            this.c = eVar3;
        }

        @Override // o.HQ.j
        public e a() {
            return this.a;
        }

        @Override // o.HQ.j
        public e b() {
            return this.b;
        }

        @Override // o.HQ.j
        public e c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        @Override // o.HQ.j
        public void reset() {
            this.a.reset();
            this.b.reset();
            this.c.reset();
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.c.get()), Long.valueOf(this.b.get()), Long.valueOf(this.a.get()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements e {
        public BigInteger a;

        public c() {
            this.a = BigInteger.ZERO;
        }

        @Override // o.HQ.e
        public void a() {
            this.a = this.a.add(BigInteger.ONE);
        }

        @Override // o.HQ.e
        public void add(long j) {
            this.a = this.a.add(BigInteger.valueOf(j));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return Objects.equals(this.a, ((e) obj).t());
        }

        @Override // o.HQ.e
        public long get() {
            long longValueExact;
            longValueExact = this.a.longValueExact();
            return longValueExact;
        }

        public int hashCode() {
            return Objects.hash(this.a);
        }

        @Override // o.HQ.e
        public void reset() {
            this.a = BigInteger.ZERO;
        }

        @Override // o.HQ.e
        public Long s() {
            long longValueExact;
            longValueExact = this.a.longValueExact();
            return Long.valueOf(longValueExact);
        }

        @Override // o.HQ.e
        public BigInteger t() {
            return this.a;
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends b {
        public d() {
            super(HQ.a(), HQ.a(), HQ.a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements e {
        public long a;

        public f() {
        }

        @Override // o.HQ.e
        public void a() {
            this.a++;
        }

        @Override // o.HQ.e
        public void add(long j) {
            this.a += j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.a == ((e) obj).get()) {
                return true;
            }
            return false;
        }

        @Override // o.HQ.e
        public long get() {
            return this.a;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.a));
        }

        @Override // o.HQ.e
        public void reset() {
            this.a = 0L;
        }

        @Override // o.HQ.e
        public Long s() {
            return Long.valueOf(this.a);
        }

        @Override // o.HQ.e
        public BigInteger t() {
            return BigInteger.valueOf(this.a);
        }

        public String toString() {
            return Long.toString(this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends b {
        public g() {
            super(HQ.c(), HQ.c(), HQ.c());
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends b {
        public static final i d = new i();

        public i() {
            super(HQ.e(), HQ.e(), HQ.e());
        }
    }

    public static e a() {
        return new c();
    }

    public static j b() {
        return new d();
    }

    public static e c() {
        return new f();
    }

    public static j d() {
        return new g();
    }

    public static e e() {
        return h.a;
    }

    public static j f() {
        return i.d;
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a();

        void add(long j);

        long get();

        Long s();

        BigInteger t();

        default void reset() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements e {
        public static final h a = new h();

        @Override // o.HQ.e
        public long get() {
            return 0L;
        }

        @Override // o.HQ.e
        public Long s() {
            return 0L;
        }

        @Override // o.HQ.e
        public BigInteger t() {
            return BigInteger.ZERO;
        }

        public String toString() {
            return "0";
        }

        @Override // o.HQ.e
        public void a() {
        }

        @Override // o.HQ.e
        public void add(long j) {
        }
    }

    /* loaded from: classes4.dex */
    public interface j {
        e a();

        e b();

        e c();

        default void reset() {
        }
    }
}
