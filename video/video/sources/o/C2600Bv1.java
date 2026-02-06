package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Bv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2600Bv1 implements InterfaceC2796Dv1<Double> {
    public final double X;
    public final double Y;

    public C2600Bv1(double d, double d2) {
        this.X = d;
        this.Y = d2;
    }

    private final boolean f(double d, double d2) {
        if (d <= d2) {
            return true;
        }
        return false;
    }

    public boolean a(double d) {
        if (d >= this.X && d < this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: b */
    public Double i() {
        return Double.valueOf(this.Y);
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: c */
    public Double d() {
        return Double.valueOf(this.X);
    }

    @Override // o.InterfaceC2796Dv1
    public /* bridge */ /* synthetic */ boolean e(Double d) {
        return a(d.doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C2600Bv1) {
            if (!isEmpty() || !((C2600Bv1) obj).isEmpty()) {
                C2600Bv1 c2600Bv1 = (C2600Bv1) obj;
                if (this.X == c2600Bv1.X && this.Y == c2600Bv1.Y) {
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
        return (Double.hashCode(this.X) * 31) + Double.hashCode(this.Y);
    }

    @Override // o.InterfaceC2796Dv1
    public boolean isEmpty() {
        if (this.X >= this.Y) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return this.X + "..<" + this.Y;
    }
}
