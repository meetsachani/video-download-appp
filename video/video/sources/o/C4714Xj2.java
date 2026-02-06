package o;

import java.util.Comparator;

/* renamed from: o.Xj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4714Xj2 extends C9561sj2 implements V92 {
    private static final long serialVersionUID = 722374056718497858L;

    public C4714Xj2(V92 v92) {
        super(v92);
    }

    public static V92 h(V92 v92) {
        return new C4714Xj2(v92);
    }

    @Override // o.V92
    public synchronized Comparator comparator() {
        Comparator comparator;
        synchronized (this.Y) {
            comparator = i().comparator();
        }
        return comparator;
    }

    @Override // o.V92
    public synchronized Object first() {
        Object first;
        synchronized (this.Y) {
            first = i().first();
        }
        return first;
    }

    public V92 i() {
        return (V92) this.X;
    }

    @Override // o.V92
    public synchronized Object last() {
        Object last;
        synchronized (this.Y) {
            last = i().last();
        }
        return last;
    }

    public C4714Xj2(InterfaceC3056Gk interfaceC3056Gk, Object obj) {
        super(interfaceC3056Gk, obj);
    }
}
