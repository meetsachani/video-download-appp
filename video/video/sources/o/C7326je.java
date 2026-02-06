package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.je  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7326je extends AbstractC6466g50 {
    @NotNull
    public final double[] X;
    public int Y;

    public C7326je(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "array");
        this.X = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X.length) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC6466g50
    public double nextDouble() {
        try {
            double[] dArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.Y--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
