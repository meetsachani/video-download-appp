package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.QZ1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
/* loaded from: classes4.dex */
public abstract class QZ1<S extends QZ1<S>> extends AbstractC9946uJ<S> implements InterfaceC8857pr1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y0 = AtomicIntegerFieldUpdater.newUpdater(QZ1.class, "cleanedAndPointers$volatile");
    @InterfaceC7058iW0
    public final long Z;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public QZ1(long j, @Nullable S s, int i) {
        super(s);
        this.Z = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final void A() {
        if (Y0.incrementAndGet(this) == y()) {
            q();
        }
    }

    public final /* synthetic */ void B(int i) {
        this.cleanedAndPointers$volatile = i;
    }

    public final boolean C() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Y0;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == y() && !n()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // o.AbstractC9946uJ
    public boolean m() {
        if (Y0.get(this) == y() && !n()) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if (Y0.addAndGet(this, InterfaceMenuC9553sh2.c) == y() && !n()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int w() {
        return this.cleanedAndPointers$volatile;
    }

    public abstract int y();

    public abstract void z(int i, @Nullable Throwable th, @NotNull InterfaceC5809dQ interfaceC5809dQ);
}
