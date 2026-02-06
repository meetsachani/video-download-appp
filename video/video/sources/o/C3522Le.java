package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Le  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3522Le extends AbstractC10621x42 {
    @NotNull
    public final short[] X;
    public int Y;

    public C3522Le(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "array");
        this.X = sArr;
    }

    @Override // o.AbstractC10621x42
    public short c() {
        try {
            short[] sArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.Y--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X.length) {
            return true;
        }
        return false;
    }
}
