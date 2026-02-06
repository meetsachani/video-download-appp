package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.xx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10835xx2 implements Iterable<C9860tx2>, GW0 {
    @NotNull
    public static final a Y0 = new a(null);
    public final long X;
    public final long Y;
    public final long Z;

    /* renamed from: o.xx2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C10835xx2 a(long j, long j2, long j3) {
            return new C10835xx2(j, j2, j3, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C10835xx2(long j, long j2, long j3, C9516sY c9516sY) {
        this(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C10835xx2) {
            if (!isEmpty() || !((C10835xx2) obj).isEmpty()) {
                C10835xx2 c10835xx2 = (C10835xx2) obj;
                if (this.X == c10835xx2.X && this.Y == c10835xx2.Y && this.Z == c10835xx2.Z) {
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
        long j = this.X;
        long j2 = this.Y;
        long j3 = this.Z;
        return (((((int) C9860tx2.n(j ^ C9860tx2.n(j >>> 32))) * 31) + ((int) C9860tx2.n(j2 ^ C9860tx2.n(j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        int i = (this.Z > 0L ? 1 : (this.Z == 0L ? 0 : -1));
        long j = this.X;
        long j2 = this.Y;
        if (i > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
            return true;
        }
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (compare >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<C9860tx2> iterator() {
        return new C11078yx2(this.X, this.Y, this.Z, null);
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

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.Z > 0) {
            sb = new StringBuilder();
            sb.append((Object) C9860tx2.j0(this.X));
            sb.append("..");
            sb.append((Object) C9860tx2.j0(this.Y));
            sb.append(" step ");
            j = this.Z;
        } else {
            sb = new StringBuilder();
            sb.append((Object) C9860tx2.j0(this.X));
            sb.append(" downTo ");
            sb.append((Object) C9860tx2.j0(this.Y));
            sb.append(" step ");
            j = -this.Z;
        }
        sb.append(j);
        return sb.toString();
    }

    public C10835xx2(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 != Long.MIN_VALUE) {
            this.X = j;
            this.Y = Mx2.c(j, j2, j3);
            this.Z = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
}
