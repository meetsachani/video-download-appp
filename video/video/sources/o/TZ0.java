package o;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Spliterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public class TZ0<T> extends C6064eT0<T> {
    public final NH<T> e1;

    public TZ0(boolean z, Locale locale, NH<T> nh) {
        super(z, locale);
        this.e1 = nh;
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
    public void h() {
        Throwable f = this.e1.f();
        if (f != null && !(f instanceof RejectedExecutionException)) {
            shutdownNow();
            if (f instanceof RR) {
                RR rr = (RR) f;
                throw new RuntimeException(String.format(ResourceBundle.getBundle(UI0.k, this.c1).getString("parsing.error.full"), Long.valueOf(rr.b()), rr.a()), rr);
            }
            throw new RuntimeException(String.format(ResourceBundle.getBundle(UI0.k, this.c1).getString("parsing.error.full"), Long.valueOf(this.e1.e()), Arrays.toString(this.e1.a())), f);
        }
        super.h();
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
    public void m() {
        Thread thread = new Thread(this.e1);
        this.e1.g(this);
        super.m();
        thread.start();
    }

    public void n(long j, InterfaceC7449k81<? extends T> interfaceC7449k81, InterfaceC5332bS interfaceC5332bS, List<InterfaceC3944Pm<T>> list, String[] strArr, OR or) {
        if (this.Z0 != null) {
            this.a1.add(Long.valueOf(j));
        }
        try {
            execute(new WH1(j, interfaceC7449k81, interfaceC5332bS, list, strArr, this.X, this.Y, this.a1, or));
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
