package o;

/* renamed from: o.Ce  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2629Ce {
    public static final <K, V> C2531Be<K, V> a() {
        return new C2531Be<>();
    }

    public static final <K, V> C2531Be<K, V> b(C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        C2531Be<K, V> c2531Be = new C2531Be<>(c4180Rx1Arr.length);
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : c4180Rx1Arr) {
            c2531Be.put(c4180Rx1.e(), c4180Rx1.f());
        }
        return c2531Be;
    }
}
