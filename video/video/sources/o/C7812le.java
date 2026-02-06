package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.le  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7812le extends AbstractC8515oR0 {
    @NotNull
    public final int[] X;
    public int Y;

    public C7812le(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "array");
        this.X = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X.length) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8515oR0
    public int nextInt() {
        try {
            int[] iArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.Y--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
