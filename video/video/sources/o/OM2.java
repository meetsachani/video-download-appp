package o;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class OM2 {
    public static OM2 a(List<OM2> continuations) {
        return continuations.get(0).b(continuations);
    }

    public abstract OM2 b(List<OM2> continuations);

    public abstract InterfaceC3395Jv1 c();

    public abstract InterfaceFutureC8411o11<List<TM2>> d();

    public abstract LiveData<List<TM2>> e();

    public abstract OM2 f(List<C11069yv1> work);

    public final OM2 g(C11069yv1 work) {
        return f(Collections.singletonList(work));
    }
}
