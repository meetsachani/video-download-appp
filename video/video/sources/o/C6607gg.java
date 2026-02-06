package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.gg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6607gg {
    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final int a(@NotNull AtomicInteger atomicInteger, int i, int i2) {
        C6562gT0.p(atomicInteger, "<this>");
        do {
            int i3 = atomicInteger.get();
            if (i != i3) {
                return i3;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final int b(@NotNull AtomicIntegerArray atomicIntegerArray, int i, int i2, int i3) {
        C6562gT0.p(atomicIntegerArray, "<this>");
        do {
            int i4 = atomicIntegerArray.get(i);
            if (i2 != i4) {
                return i4;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i2, i3));
        return i2;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final long c(@NotNull AtomicLong atomicLong, long j, long j2) {
        C6562gT0.p(atomicLong, "<this>");
        do {
            long j3 = atomicLong.get();
            if (j != j3) {
                return j3;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        return j;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final long d(@NotNull AtomicLongArray atomicLongArray, int i, long j, long j2) {
        C6562gT0.p(atomicLongArray, "<this>");
        do {
            long j3 = atomicLongArray.get(i);
            if (j != j3) {
                return j3;
            }
        } while (!atomicLongArray.compareAndSet(i, j, j2));
        return j;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final <T> T e(@NotNull AtomicReference<T> atomicReference, T t, T t2) {
        C6562gT0.p(atomicReference, "<this>");
        do {
            T t3 = atomicReference.get();
            if (t != t3) {
                return t3;
            }
        } while (!C6515gH1.a(atomicReference, t, t2));
        return t;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final <T> T f(@NotNull AtomicReferenceArray<T> atomicReferenceArray, int i, T t, T t2) {
        C6562gT0.p(atomicReferenceArray, "<this>");
        do {
            T t3 = atomicReferenceArray.get(i);
            if (t != t3) {
                return t3;
            }
        } while (!C3626Mf2.a(atomicReferenceArray, i, t, t2));
        return t;
    }

    @HK1
    @InterfaceC6480g82(version = "2.1")
    public static final boolean g(@NotNull AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        C6562gT0.p(atomicBoolean, "<this>");
        do {
            boolean z3 = atomicBoolean.get();
            if (z != z3) {
                return z3;
            }
        } while (!atomicBoolean.compareAndSet(z, z2));
        return z;
    }
}
