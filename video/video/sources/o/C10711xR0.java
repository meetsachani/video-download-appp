package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.xR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10711xR0 implements Iterable<Integer>, GW0 {
    @NotNull
    public static final a Y0 = new a(null);
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: o.xR0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C10711xR0 a(int i, int i2, int i3) {
            return new C10711xR0(i, i2, i3);
        }

        public a() {
        }
    }

    public C10711xR0(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.X = i;
                this.Y = C6766hJ1.c(i, i2, i3);
                this.Z = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C10711xR0) {
            if (!isEmpty() || !((C10711xR0) obj).isEmpty()) {
                C10711xR0 c10711xR0 = (C10711xR0) obj;
                if (this.X == c10711xR0.X && this.Y == c10711xR0.Y && this.Z == c10711xR0.Z) {
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
        return (((this.X * 31) + this.Y) * 31) + this.Z;
    }

    public boolean isEmpty() {
        if (this.Z > 0) {
            if (this.X <= this.Y) {
                return false;
            }
            return true;
        } else if (this.X >= this.Y) {
            return false;
        } else {
            return true;
        }
    }

    public final int j() {
        return this.X;
    }

    public final int k() {
        return this.Y;
    }

    public final int l() {
        return this.Z;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: p */
    public AbstractC8515oR0 iterator() {
        return new C10954yR0(this.X, this.Y, this.Z);
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
