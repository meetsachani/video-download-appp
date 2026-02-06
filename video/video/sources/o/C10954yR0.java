package o;

import java.util.NoSuchElementException;

/* renamed from: o.yR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10954yR0 extends AbstractC8515oR0 {
    public final int X;
    public final int Y;
    public int Y0;
    public boolean Z;

    public C10954yR0(int i, int i2, int i3) {
        this.X = i3;
        this.Y = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.Z = z;
        this.Y0 = z ? i : i2;
    }

    public final int b() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Z;
    }

    @Override // o.AbstractC8515oR0
    public int nextInt() {
        int i = this.Y0;
        if (i == this.Y) {
            if (this.Z) {
                this.Z = false;
                return i;
            }
            throw new NoSuchElementException();
        }
        this.Y0 = this.X + i;
        return i;
    }
}
