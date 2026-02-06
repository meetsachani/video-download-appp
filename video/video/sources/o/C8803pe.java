package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.pe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8803pe<T> implements Iterator<T>, GW0 {
    @NotNull
    public final T[] X;
    public int Y;

    public C8803pe(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        this.X = tArr;
    }

    @NotNull
    public final T[] b() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.Y--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
