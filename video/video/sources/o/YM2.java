package o;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class YM2 {
    public static void A(Context context, androidx.work.a configuration) {
        ZM2.A(context, configuration);
    }

    @Deprecated
    public static YM2 o() {
        ZM2 G = ZM2.G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static YM2 p(Context context) {
        return ZM2.H(context);
    }

    public abstract InterfaceC3395Jv1 B();

    public abstract OM2 a(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work);

    public final OM2 b(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, C11069yv1 work) {
        return a(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    public abstract OM2 c(List<C11069yv1> work);

    public final OM2 d(C11069yv1 work) {
        return c(Collections.singletonList(work));
    }

    public abstract InterfaceC3395Jv1 e();

    public abstract InterfaceC3395Jv1 f(String tag);

    public abstract InterfaceC3395Jv1 g(String uniqueWorkName);

    public abstract InterfaceC3395Jv1 h(UUID id);

    public abstract PendingIntent i(UUID id);

    public abstract InterfaceC3395Jv1 j(List<? extends AbstractC7753lN2> requests);

    public final InterfaceC3395Jv1 k(AbstractC7753lN2 workRequest) {
        return j(Collections.singletonList(workRequest));
    }

    public abstract InterfaceC3395Jv1 l(String uniqueWorkName, EnumC3335Jg0 existingPeriodicWorkPolicy, DC1 periodicWork);

    public abstract InterfaceC3395Jv1 m(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work);

    public InterfaceC3395Jv1 n(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, C11069yv1 work) {
        return m(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    public abstract InterfaceFutureC8411o11<Long> q();

    public abstract LiveData<Long> r();

    public abstract InterfaceFutureC8411o11<TM2> s(UUID id);

    public abstract LiveData<TM2> t(UUID id);

    public abstract InterfaceFutureC8411o11<List<TM2>> u(C7026iN2 workQuery);

    public abstract InterfaceFutureC8411o11<List<TM2>> v(String tag);

    public abstract LiveData<List<TM2>> w(String tag);

    public abstract InterfaceFutureC8411o11<List<TM2>> x(String uniqueWorkName);

    public abstract LiveData<List<TM2>> y(String uniqueWorkName);

    public abstract LiveData<List<TM2>> z(C7026iN2 workQuery);
}
