package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class U41 implements Iterable<Long>, GW0 {
    @NotNull
    public static final a Y0 = new a(null);
    public final long X;
    public final long Y;
    public final long Z;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final U41 a(long j, long j2, long j3) {
            return new U41(j, j2, j3);
        }

        public a() {
        }
    }

    public U41(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.X = j;
                this.Y = C6766hJ1.d(j, j2, j3);
                this.Z = j3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof U41) {
            if (!isEmpty() || !((U41) obj).isEmpty()) {
                U41 u41 = (U41) obj;
                if (this.X == u41.X && this.Y == u41.Y && this.Z == u41.Z) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.X;
        long j3 = this.Y;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.Z;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.Z > 0L ? 1 : (this.Z == 0L ? 0 : -1));
        long j = this.X;
        long j2 = this.Y;
        if (i > 0) {
            if (j <= j2) {
                return false;
            }
            return true;
        } else if (j >= j2) {
            return false;
        } else {
            return true;
        }
    }

    public final long j() {
        return this.X;
    }

    public final long k() {
        return this.Y;
    }

    public final long l() {
        return this.Z;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: p */
    public J41 iterator() {
        return new V41(this.X, this.Y, this.Z);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.Z > 0) {
            sb = new StringBuilder();
            sb.append(this.X);
            sb.append("..");
            sb.append(this.Y);
            sb.append(" step ");
            j = this.Z;
        } else {
            sb = new StringBuilder();
            sb.append(this.X);
            sb.append(" downTo ");
            sb.append(this.Y);
            sb.append(" step ");
            j = -this.Z;
        }
        sb.append(j);
        return sb.toString();
    }
}
