package o;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4988a22 {
    void a();

    void b(int i);

    int c(a aVar);

    void d();

    void e();

    T12 f(InterfaceC6420fx interfaceC6420fx, AbstractC6179ex1 abstractC6179ex1, AbstractC6179ex1 abstractC6179ex12, AbstractC6179ex1 abstractC6179ex13);

    default Set<Integer> g() {
        return Collections.EMPTY_SET;
    }

    int h(a aVar);

    default int i(HJ hj, a aVar) {
        return -1;
    }

    default Pair<Long, Long> j() {
        return null;
    }

    void k(HJ hj);

    void l(InterfaceC8763pS1 interfaceC8763pS1);

    /* renamed from: o.a22$a */
    /* loaded from: classes.dex */
    public interface a {
        default void a(int i) {
        }

        default void b(int i) {
        }

        default void c(int i) {
        }

        default void e(int i) {
        }

        default void d(int i, long j) {
        }

        default void f(long j, int i, Map<CaptureResult.Key, Object> map) {
        }
    }
}
