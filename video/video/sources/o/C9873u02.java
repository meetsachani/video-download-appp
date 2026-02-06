package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
/* renamed from: o.u02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9873u02 extends QZ1<C9873u02> {
    public final /* synthetic */ AtomicReferenceArray Z0;

    public C9873u02(long j, @Nullable C9873u02 c9873u02, int i) {
        super(j, c9873u02, i);
        int i2;
        i2 = C9630t02.f;
        this.Z0 = new AtomicReferenceArray(i2);
    }

    public final boolean D(int i, @Nullable Object obj, @Nullable Object obj2) {
        return C3626Mf2.a(F(), i, obj, obj2);
    }

    @Nullable
    public final Object E(int i) {
        return F().get(i);
    }

    public final /* synthetic */ AtomicReferenceArray F() {
        return this.Z0;
    }

    @Nullable
    public final Object G(int i, @Nullable Object obj) {
        return F().getAndSet(i, obj);
    }

    public final void H(int i, @Nullable Object obj) {
        F().set(i, obj);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.Z + ", hashCode=" + hashCode() + ']';
    }

    @Override // o.QZ1
    public int y() {
        int i;
        i = C9630t02.f;
        return i;
    }

    @Override // o.QZ1
    public void z(int i, @Nullable Throwable th, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C7592kj2 c7592kj2;
        c7592kj2 = C9630t02.e;
        F().set(i, c7592kj2);
        A();
    }
}
