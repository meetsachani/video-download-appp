package o;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.de  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5859de extends AbstractC3659Mo {
    @NotNull
    public final boolean[] X;
    public int Y;

    public C5859de(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "array");
        this.X = zArr;
    }

    @Override // o.AbstractC3659Mo
    public boolean c() {
        try {
            boolean[] zArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return zArr[i];
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
