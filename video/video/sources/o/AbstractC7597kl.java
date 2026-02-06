package o;

import java.util.Queue;
import o.InterfaceC11146zE1;

/* renamed from: o.kl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7597kl<T extends InterfaceC11146zE1> {
    public static final int b = 20;
    public final Queue<T> a = SD2.g(20);

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        if (poll == null) {
            return a();
        }
        return poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
