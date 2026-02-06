package o;

import java.util.SortedSet;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public class VH1<T> implements Runnable {
    public final long X;
    public final InterfaceC7449k81<T> Y;
    public final BlockingQueue<C10344vw1<String[]>> Y0;
    public final T Z;
    public final BlockingQueue<C10344vw1<NR>> Z0;
    public final SortedSet<Long> a1;
    public final OR b1;

    public VH1(long j, InterfaceC7449k81<T> interfaceC7449k81, T t, BlockingQueue<C10344vw1<String[]>> blockingQueue, BlockingQueue<C10344vw1<NR>> blockingQueue2, SortedSet<Long> sortedSet, OR or) {
        this.X = j;
        this.Y = interfaceC7449k81;
        this.Z = t;
        this.Y0 = blockingQueue;
        this.Z0 = blockingQueue2;
        this.a1 = sortedSet;
        this.b1 = or;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C3297Iv1.f(this.Y0, new C10344vw1(this.X, this.Y.h(this.Z)));
        } catch (CR e) {
            e = e;
            this.a1.remove(Long.valueOf(this.X));
            C3297Iv1.e(e, this.X, this.b1, this.Z0);
        } catch (PR e2) {
            e = e2;
            this.a1.remove(Long.valueOf(this.X));
            C3297Iv1.e(e, this.X, this.b1, this.Z0);
        } catch (YR e3) {
            this.a1.remove(Long.valueOf(this.X));
            throw e3;
        } catch (Exception e4) {
            this.a1.remove(Long.valueOf(this.X));
            throw new RuntimeException(e4);
        }
    }
}
