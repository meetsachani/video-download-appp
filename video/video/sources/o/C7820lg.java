package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.lg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7820lg {
    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int a(@NotNull AtomicInteger atomicInteger) {
        C6562gT0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long b(@NotNull AtomicLong atomicLong) {
        C6562gT0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int c(@NotNull AtomicInteger atomicInteger) {
        C6562gT0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long d(@NotNull AtomicLong atomicLong) {
        C6562gT0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int e(@NotNull AtomicInteger atomicInteger) {
        C6562gT0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long f(@NotNull AtomicLong atomicLong) {
        C6562gT0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final int g(@NotNull AtomicInteger atomicInteger) {
        C6562gT0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final long h(@NotNull AtomicLong atomicLong) {
        C6562gT0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final void i(@NotNull AtomicInteger atomicInteger, int i) {
        C6562gT0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final void j(@NotNull AtomicLong atomicLong, long j) {
        C6562gT0.p(atomicLong, "<this>");
        atomicLong.addAndGet(-j);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final void k(@NotNull AtomicInteger atomicInteger, int i) {
        C6562gT0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(i);
    }

    @InterfaceC10773xi0
    @InterfaceC6480g82(version = "2.1")
    public static final void l(@NotNull AtomicLong atomicLong, long j) {
        C6562gT0.p(atomicLong, "<this>");
        atomicLong.addAndGet(j);
    }
}
