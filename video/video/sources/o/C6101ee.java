package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.ee  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6101ee extends AbstractC5187as {
    @NotNull
    public final byte[] X;
    public int Y;

    public C6101ee(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "array");
        this.X = bArr;
    }

    @Override // o.AbstractC5187as
    public byte I0() {
        try {
            byte[] bArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return bArr[i];
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
