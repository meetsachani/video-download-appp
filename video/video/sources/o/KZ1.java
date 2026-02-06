package o;

@Deprecated
/* loaded from: classes2.dex */
public interface KZ1 {

    /* loaded from: classes2.dex */
    public static final class a {
        public final MZ1 a;
        public final MZ1 b;

        public a(MZ1 mz1) {
            this(mz1, mz1);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(C6566gU0.f);
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = C6566gU0.h + this.b;
            }
            sb.append(str);
            sb.append(C6566gU0.g);
            return sb.toString();
        }

        public a(MZ1 mz1, MZ1 mz12) {
            this.a = (MZ1) C9542sf.g(mz1);
            this.b = (MZ1) C9542sf.g(mz12);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements KZ1 {
        public final long d;
        public final a e;

        public b(long j) {
            this(j, 0L);
        }

        @Override // o.KZ1
        public a e(long j) {
            return this.e;
        }

        @Override // o.KZ1
        public boolean h() {
            return false;
        }

        @Override // o.KZ1
        public long i() {
            return this.d;
        }

        public b(long j, long j2) {
            this.d = j;
            this.e = new a(j2 == 0 ? MZ1.c : new MZ1(0L, j2));
        }
    }

    a e(long j);

    boolean h();

    long i();
}
