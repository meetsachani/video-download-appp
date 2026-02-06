package o;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Yf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4792Yf {
    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final /* synthetic */ <T> AtomicReferenceArray<T> a(int i, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(ha0, "init");
        C6562gT0.y(0, "T");
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ha0.invoke(Integer.valueOf(i2));
        }
        return new AtomicReferenceArray<>((T[]) objArr);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray b(int i, @NotNull HA0<? super Integer, Integer> ha0) {
        C6562gT0.p(ha0, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = ha0.invoke(Integer.valueOf(i2)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public static final AtomicLongArray c(int i, @NotNull HA0<? super Integer, Long> ha0) {
        C6562gT0.p(ha0, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ha0.invoke(Integer.valueOf(i2)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int d(@NotNull AtomicIntegerArray atomicIntegerArray, int i) {
        C6562gT0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i, -1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long e(@NotNull AtomicLongArray atomicLongArray, int i) {
        C6562gT0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i, -1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int f(@NotNull AtomicIntegerArray atomicIntegerArray, int i) {
        C6562gT0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i, -1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long g(@NotNull AtomicLongArray atomicLongArray, int i) {
        C6562gT0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i, -1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int h(@NotNull AtomicIntegerArray atomicIntegerArray, int i) {
        C6562gT0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i, 1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long i(@NotNull AtomicLongArray atomicLongArray, int i) {
        C6562gT0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i, 1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int j(@NotNull AtomicIntegerArray atomicIntegerArray, int i) {
        C6562gT0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i, 1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long k(@NotNull AtomicLongArray atomicLongArray, int i) {
        C6562gT0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i, 1L);
    }
}
