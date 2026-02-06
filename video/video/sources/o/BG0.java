package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class BG0<T> extends WeakReference<T> {
    @InterfaceC7058iW0
    public final int a;

    public BG0(T t, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        int i;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        this.a = i;
    }
}
