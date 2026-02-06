package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public class WH1<T> implements Runnable {
    public final long X;
    public final InterfaceC7449k81<? extends T> Y;
    public final List<InterfaceC3944Pm<T>> Y0;
    public final InterfaceC5332bS Z;
    public final String[] Z0;
    public final BlockingQueue<C10344vw1<T>> a1;
    public final BlockingQueue<C10344vw1<NR>> b1;
    public final SortedSet<Long> c1;
    public final OR d1;

    public WH1(long j, InterfaceC7449k81<? extends T> interfaceC7449k81, InterfaceC5332bS interfaceC5332bS, List<InterfaceC3944Pm<T>> list, String[] strArr, BlockingQueue<C10344vw1<T>> blockingQueue, BlockingQueue<C10344vw1<NR>> blockingQueue2, SortedSet<Long> sortedSet, OR or) {
        this.X = j;
        this.Y = interfaceC7449k81;
        this.Z = interfaceC5332bS;
        this.Y0 = (List) C11304zt1.t(new ArrayList(list), Collections.EMPTY_LIST);
        this.Z0 = (String[]) C4206Se.R(strArr);
        this.a1 = blockingQueue;
        this.b1 = blockingQueue2;
        this.c1 = sortedSet;
        this.d1 = or;
    }

    public final T a() throws C8270nR, C8027mR, PR, CR {
        return this.Y.g(this.Z0);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            InterfaceC5332bS interfaceC5332bS = this.Z;
            if (interfaceC5332bS != null && !interfaceC5332bS.a(this.Z0)) {
                this.c1.remove(Long.valueOf(this.X));
                return;
            }
            T a = a();
            ListIterator<InterfaceC3944Pm<T>> listIterator = this.Y0.listIterator();
            boolean z = true;
            while (z && listIterator.hasNext()) {
                z = listIterator.next().a(a);
            }
            if (z) {
                C3297Iv1.f(this.a1, new C10344vw1(this.X, a));
            } else {
                this.c1.remove(Long.valueOf(this.X));
            }
        } catch (NR e) {
            this.c1.remove(Long.valueOf(this.X));
            e.c(this.Z0);
            C3297Iv1.e(e, this.X, this.d1, this.b1);
        } catch (Exception e2) {
            this.c1.remove(Long.valueOf(this.X));
            throw new RuntimeException(e2);
        }
    }
}
