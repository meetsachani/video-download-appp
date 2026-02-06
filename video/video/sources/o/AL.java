package o;

import java.util.Queue;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class AL<T> extends AbstractC6437g1<T> {
    public final Queue<T> Z;

    public AL(Queue<T> queue) {
        this.Z = (Queue) C10664xF1.E(queue);
    }

    @Override // o.AbstractC6437g1
    @MB
    public T b() {
        if (this.Z.isEmpty()) {
            return c();
        }
        return this.Z.remove();
    }
}
