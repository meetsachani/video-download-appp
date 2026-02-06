package o;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes4.dex */
public final class KJ2 extends AbstractC6059eS {
    @NotNull
    public static final KJ2 a = new KJ2();
    @NotNull
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    @NotNull
    public static final WeakHashMap<Class<? extends Throwable>, HA0<Throwable, Throwable>> c = new WeakHashMap<>();

    @Override // o.AbstractC6059eS
    @NotNull
    public HA0<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        int i;
        HA0<Throwable, Throwable> g;
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            HA0<Throwable, Throwable> ha0 = c.get(cls);
            if (ha0 != null) {
                return ha0;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, HA0<Throwable, Throwable>> weakHashMap = c;
                HA0<Throwable, Throwable> ha02 = weakHashMap.get(cls);
                if (ha02 == null) {
                    g = C3527Lf0.g(cls);
                    weakHashMap.put(cls, g);
                    while (i2 < i) {
                        readLock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return g;
                }
                return ha02;
            } finally {
                while (i2 < i) {
                    readLock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
