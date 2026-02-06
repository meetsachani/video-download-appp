package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@InterfaceC8046mW0(name = "LocksKt")
@InterfaceC8303na2({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public final class G31 {
    @XP0
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, FA0<? extends T> fa0) {
        C6562gT0.p(reentrantReadWriteLock, "<this>");
        C6562gT0.p(fa0, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            readLock.unlock();
            UP0.c(1);
        }
    }

    @XP0
    public static final <T> T b(Lock lock, FA0<? extends T> fa0) {
        C6562gT0.p(lock, "<this>");
        C6562gT0.p(fa0, "action");
        lock.lock();
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            lock.unlock();
            UP0.c(1);
        }
    }

    @XP0
    public static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, FA0<? extends T> fa0) {
        int i;
        C6562gT0.p(reentrantReadWriteLock, "<this>");
        C6562gT0.p(fa0, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            UP0.c(1);
        }
    }
}
