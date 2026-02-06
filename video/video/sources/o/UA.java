package o;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class UA extends RA {
    public final int X;
    public final int Y;
    public int Y0;
    public boolean Z;

    public UA(char c, char c2, int i) {
        this.X = i;
        this.Y = c2;
        boolean z = false;
        if (i <= 0 ? C6562gT0.t(c, c2) >= 0 : C6562gT0.t(c, c2) <= 0) {
            z = true;
        }
        this.Z = z;
        this.Y0 = z ? c : c2;
    }

    @Override // o.RA
    public char c() {
        int i = this.Y0;
        if (i == this.Y) {
            if (this.Z) {
                this.Z = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.Y0 = this.X + i;
        }
        return (char) i;
    }

    public final int d() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Z;
    }
}
