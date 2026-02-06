package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.mR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8029mR1 {
    public static AbstractC8029mR1 a(List<AbstractC8029mR1> continuations) {
        return continuations.get(0).b(continuations);
    }

    public abstract AbstractC8029mR1 b(List<AbstractC8029mR1> continuations);

    public abstract InterfaceFutureC8411o11<Void> c();

    public abstract AbstractC8029mR1 d(List<C11069yv1> work);

    public final AbstractC8029mR1 e(C11069yv1 work) {
        return d(Collections.singletonList(work));
    }
}
