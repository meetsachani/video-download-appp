package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.fe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6344fe extends RA {
    @NotNull
    public final char[] X;
    public int Y;

    public C6344fe(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "array");
        this.X = cArr;
    }

    @Override // o.RA
    public char c() {
        try {
            char[] cArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return cArr[i];
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
