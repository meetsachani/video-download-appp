package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class QS1<T> {
    @NotNull
    private volatile AtomicReferenceArray<T> array;

    public QS1(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    @Nullable
    public final T b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, @Nullable T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C5075aO1.u(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
