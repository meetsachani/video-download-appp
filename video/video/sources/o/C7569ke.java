package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.ke  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7569ke extends AbstractC8385nv0 {
    @NotNull
    public final float[] X;
    public int Y;

    public C7569ke(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "array");
        this.X = fArr;
    }

    @Override // o.AbstractC8385nv0
    public float c() {
        try {
            float[] fArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return fArr[i];
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
