package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.eE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6003eE implements InterfaceC6246fE<Float> {
    public final float X;
    public final float Y;

    public C6003eE(float f, float f2) {
        this.X = f;
        this.Y = f2;
    }

    public boolean a(float f) {
        if (f >= this.X && f <= this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: b */
    public Float h() {
        return Float.valueOf(this.Y);
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: c */
    public Float d() {
        return Float.valueOf(this.X);
    }

    @Override // o.InterfaceC6246fE, o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C6003eE) {
            if (!isEmpty() || !((C6003eE) obj).isEmpty()) {
                C6003eE c6003eE = (C6003eE) obj;
                if (this.X == c6003eE.X && this.Y == c6003eE.Y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6246fE
    public /* bridge */ /* synthetic */ boolean f(Float f, Float f2) {
        return g(f.floatValue(), f2.floatValue());
    }

    public boolean g(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.X) * 31) + Float.hashCode(this.Y);
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
