package o;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@InterfaceC5601ca0
/* renamed from: o.Wx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class Abstractlocks.ConditionC4667Wx0 implements Condition {
    public abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws InterruptedException {
        return a().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return a().await(j, timeUnit);
    }
}
