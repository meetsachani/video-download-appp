package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.qx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9132qx2 implements Iterable<C7162ix2>, GW0 {
    @NotNull
    public static final a Y0 = new a(null);
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: o.qx2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C9132qx2 a(int i, int i2, int i3) {
            return new C9132qx2(i, i2, i3, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C9132qx2(int i, int i2, int i3, C9516sY c9516sY) {
        this(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C9132qx2) {
            if (!isEmpty() || !((C9132qx2) obj).isEmpty()) {
                C9132qx2 c9132qx2 = (C9132qx2) obj;
                if (this.X == c9132qx2.X && this.Y == c9132qx2.Y && this.Z == c9132qx2.Z) {
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
        int compare;
        int compare2;
        if (this.Z > 0) {
            compare2 = Integer.compare(this.X ^ Integer.MIN_VALUE, this.Y ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
            return true;
        }
        compare = Integer.compare(this.X ^ Integer.MIN_VALUE, this.Y ^ Integer.MIN_VALUE);
        if (compare >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<C7162ix2> iterator() {
        return new C9374rx2(this.X, this.Y, this.Z, null);
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

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.Z > 0) {
            sb = new StringBuilder();
            sb.append((Object) C7162ix2.j0(this.X));
            sb.append("..");
            sb.append((Object) C7162ix2.j0(this.Y));
            sb.append(" step ");
            i = this.Z;
        } else {
            sb = new StringBuilder();
            sb.append((Object) C7162ix2.j0(this.X));
            sb.append(" downTo ");
            sb.append((Object) C7162ix2.j0(this.Y));
            sb.append(" step ");
            i = -this.Z;
        }
        sb.append(i);
        return sb.toString();
    }

    public C9132qx2(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 != Integer.MIN_VALUE) {
            this.X = i;
            this.Y = Mx2.d(i, i2, i3);
            this.Z = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
}
