package o;

import java.lang.Throwable;

/* renamed from: o.Bw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2603Bw1<R, E extends Throwable> {
    void onResult(R r);

    default void onError(E e) {
    }
}
