package o;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class V41 extends J41 {
    public final long X;
    public final long Y;
    public long Y0;
    public boolean Z;

    public V41(long j, long j2, long j3) {
        this.X = j3;
        this.Y = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.Z = z;
        this.Y0 = z ? j : j2;
    }

    public final long b() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Z;
    }

    @Override // o.J41
    public long nextLong() {
        long j = this.Y0;
        if (j == this.Y) {
            if (this.Z) {
                this.Z = false;
                return j;
            }
            throw new NoSuchElementException();
        }
        this.Y0 = this.X + j;
        return j;
    }
}
