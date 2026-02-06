package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class TA implements Iterable<Character>, GW0 {
    @NotNull
    public static final a Y0 = new a(null);
    public final char X;
    public final char Y;
    public final int Z;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final TA a(char c, char c2, int i) {
            return new TA(c, c2, i);
        }

        public a() {
        }
    }

    public TA(char c, char c2, int i) {
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                this.X = c;
                this.Y = (char) C6766hJ1.c(c, c2, i);
                this.Z = i;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TA) {
            if (!isEmpty() || !((TA) obj).isEmpty()) {
                TA ta = (TA) obj;
                if (this.X == ta.X && this.Y == ta.Y && this.Z == ta.Z) {
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
        return (((this.X * VN2.b) + this.Y) * 31) + this.Z;
    }

    public boolean isEmpty() {
        if (this.Z > 0) {
            if (C6562gT0.t(this.X, this.Y) <= 0) {
                return false;
            }
            return true;
        } else if (C6562gT0.t(this.X, this.Y) >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final char j() {
        return this.X;
    }

    public final char k() {
        return this.Y;
    }

    public final int l() {
        return this.Z;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: p */
    public RA iterator() {
        return new UA(this.X, this.Y, this.Z);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.Z > 0) {
            sb = new StringBuilder();
            sb.append(this.X);
            sb.append("..");
            sb.append(this.Y);
            sb.append(" step ");
            i = this.Z;
        } else {
            sb = new StringBuilder();
            sb.append(this.X);
            sb.append(" downTo ");
            sb.append(this.Y);
            sb.append(" step ");
            i = -this.Z;
        }
        sb.append(i);
        return sb.toString();
    }
}
