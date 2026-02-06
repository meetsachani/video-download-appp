package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Cv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2698Cv1 implements InterfaceC2796Dv1<Float> {
    public final float X;
    public final float Y;

    public C2698Cv1(float f, float f2) {
        this.X = f;
        this.Y = f2;
    }

    private final boolean f(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean a(float f) {
        if (f >= this.X && f < this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: b */
    public Float i() {
        return Float.valueOf(this.Y);
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: c */
    public Float d() {
        return Float.valueOf(this.X);
    }

    @Override // o.InterfaceC2796Dv1
    public /* bridge */ /* synthetic */ boolean e(Float f) {
        return a(f.floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C2698Cv1) {
            if (!isEmpty() || !((C2698Cv1) obj).isEmpty()) {
                C2698Cv1 c2698Cv1 = (C2698Cv1) obj;
                if (this.X == c2698Cv1.X && this.Y == c2698Cv1.Y) {
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
        return (Float.hashCode(this.X) * 31) + Float.hashCode(this.Y);
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
