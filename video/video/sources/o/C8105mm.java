package o;

import java.util.List;
import java.util.Locale;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: o.mm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8105mm<T> extends C6064eT0<String[]> {
    public C8105mm(boolean z, Locale locale) {
        super(z, locale);
    }

    @Override // o.C6064eT0, java.util.Spliterator
    public /* bridge */ /* synthetic */ int characteristics() {
        return super.characteristics();
    }

    @Override // o.C6064eT0, java.util.Spliterator
    public /* bridge */ /* synthetic */ long estimateSize() {
        return super.estimateSize();
    }

    @Override // o.C6064eT0
    public /* bridge */ /* synthetic */ void i() throws InterruptedException {
        super.i();
    }

    @Override // o.C6064eT0
    public /* bridge */ /* synthetic */ List j() {
        return super.j();
    }

    @Override // o.C6064eT0
    public /* bridge */ /* synthetic */ Throwable k() {
        return super.k();
    }

    @Override // o.C6064eT0
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public void n(long j, InterfaceC7449k81<T> interfaceC7449k81, T t, OR or) {
        if (this.Z0 != null) {
            this.a1.add(Long.valueOf(j));
        }
        try {
            execute(new VH1(j, interfaceC7449k81, t, this.X, this.Y, this.a1, or));
        } catch (Exception e) {
            if (this.Z0 != null) {
                this.a1.remove(Long.valueOf(j));
                this.Z0.d(true);
            }
            throw e;
        }
    }

    @Override // o.C6064eT0, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ List shutdownNow() {
        return super.shutdownNow();
    }

    @Override // o.C6064eT0, java.util.Spliterator
    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return super.tryAdvance(consumer);
    }

    @Override // o.C6064eT0, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        return super.trySplit();
    }
}
