package o;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: o.nR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8272nR1 {
    public static AbstractC8272nR1 o(Context context) {
        AbstractC8272nR1 K = ZM2.H(context).K();
        if (K != null) {
            return K;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public abstract AbstractC8029mR1 a(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work);

    public final AbstractC8029mR1 b(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, C11069yv1 work) {
        return a(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    public abstract AbstractC8029mR1 c(List<C11069yv1> work);

    public final AbstractC8029mR1 d(C11069yv1 work) {
        return c(Collections.singletonList(work));
    }

    public abstract InterfaceFutureC8411o11<Void> e();

    public abstract InterfaceFutureC8411o11<Void> f(String tag);

    public abstract InterfaceFutureC8411o11<Void> g(String uniqueWorkName);

    public abstract InterfaceFutureC8411o11<Void> h(UUID id);

    public abstract InterfaceFutureC8411o11<Void> i(List<AbstractC7753lN2> requests);

    public abstract InterfaceFutureC8411o11<Void> j(OM2 continuation);

    public abstract InterfaceFutureC8411o11<Void> k(AbstractC7753lN2 request);

    public abstract InterfaceFutureC8411o11<Void> l(String uniqueWorkName, EnumC3335Jg0 existingPeriodicWorkPolicy, DC1 periodicWork);

    public abstract InterfaceFutureC8411o11<Void> m(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work);

    public final InterfaceFutureC8411o11<Void> n(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, C11069yv1 work) {
        return m(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    public abstract InterfaceFutureC8411o11<List<TM2>> p(C7026iN2 workQuery);

    public abstract InterfaceFutureC8411o11<Void> q(UUID id, androidx.work.b data);
}
