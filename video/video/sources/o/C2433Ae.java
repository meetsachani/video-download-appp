package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ae  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2433Ae extends J41 {
    @NotNull
    public final long[] X;
    public int Y;

    public C2433Ae(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "array");
        this.X = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X.length) {
            return true;
        }
        return false;
    }

    @Override // o.J41
    public long nextLong() {
        try {
            long[] jArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.Y--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
