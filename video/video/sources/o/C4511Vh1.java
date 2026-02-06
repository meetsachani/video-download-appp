package o;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Vh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4511Vh1<T> extends C7364jn1<T> {
    public C10490wX1<LiveData<?>, a<?>> m;

    /* renamed from: o.Vh1$a */
    /* loaded from: classes.dex */
    public static class a<V> implements InterfaceC3583Lt1<V> {
        public final LiveData<V> a;
        public final InterfaceC3583Lt1<? super V> b;
        public int c = -1;

        public a(LiveData<V> liveData, InterfaceC3583Lt1<? super V> interfaceC3583Lt1) {
            this.a = liveData;
            this.b = interfaceC3583Lt1;
        }

        public void a() {
            this.a.l(this);
        }

        @Override // o.InterfaceC3583Lt1
        public void b(V v) {
            if (this.c != this.a.g()) {
                this.c = this.a.g();
                this.b.b(v);
            }
        }

        public void c() {
            this.a.p(this);
        }
    }

    public C4511Vh1() {
        this.m = new C10490wX1<>();
    }

    @Override // androidx.lifecycle.LiveData
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void s(LiveData<S> liveData, InterfaceC3583Lt1<? super S> interfaceC3583Lt1) {
        if (liveData != null) {
            a<?> aVar = new a<>(liveData, interfaceC3583Lt1);
            a<?> j = this.m.j(liveData, aVar);
            if (j != null && j.b != interfaceC3583Lt1) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (j == null && h()) {
                aVar.a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    public <S> void t(LiveData<S> liveData) {
        a<?> k = this.m.k(liveData);
        if (k != null) {
            k.c();
        }
    }

    public C4511Vh1(T t) {
        super(t);
        this.m = new C10490wX1<>();
    }
}
