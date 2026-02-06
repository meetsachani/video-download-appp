package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@InterfaceC5601ca0
/* renamed from: o.sy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class Abstractlocks.LockC9619sy0 implements Lock {
    public abstract Lock a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        return a().tryLock(j, timeUnit);
    }
}
