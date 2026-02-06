package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.dE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5761dE implements InterfaceC6246fE<Double> {
    public final double X;
    public final double Y;

    public C5761dE(double d, double d2) {
        this.X = d;
        this.Y = d2;
    }

    public boolean a(double d) {
        if (d >= this.X && d <= this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: b */
    public Double h() {
        return Double.valueOf(this.Y);
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: c */
    public Double d() {
        return Double.valueOf(this.X);
    }

    @Override // o.InterfaceC6246fE, o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C5761dE) {
            if (!isEmpty() || !((C5761dE) obj).isEmpty()) {
                C5761dE c5761dE = (C5761dE) obj;
                if (this.X == c5761dE.X && this.Y == c5761dE.Y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6246fE
    public /* bridge */ /* synthetic */ boolean f(Double d, Double d2) {
        return g(d.doubleValue(), d2.doubleValue());
    }

    public boolean g(double d, double d2) {
        if (d <= d2) {
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

    @Override // o.InterfaceC6246fE, o.InterfaceC6987iE
    public boolean isEmpty() {
        if (this.X > this.Y) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return this.X + ".." + this.Y;
    }
}
