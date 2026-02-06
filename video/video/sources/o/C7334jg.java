package o;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.jg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7334jg {
    public static <V> AtomicReference<V> a() {
        return new AtomicReference<>();
    }

    public static <V> AtomicReference<V> b(@InterfaceC7165iy1 V v) {
        return new AtomicReference<>(v);
    }

    public static <E> AtomicReferenceArray<E> c(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public static <E> AtomicReferenceArray<E> d(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
