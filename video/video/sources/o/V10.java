package o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class V10 extends AbstractC10454wN2 {
    public static final String c = AbstractC6949i41.f("DelegatingWkrFctry");
    public final List<AbstractC10454wN2> b = new CopyOnWriteArrayList();

    @Override // o.AbstractC10454wN2
    public final ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        for (AbstractC10454wN2 abstractC10454wN2 : this.b) {
            try {
                ListenableWorker a = abstractC10454wN2.a(appContext, workerClassName, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                AbstractC6949i41.c().b(c, String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }

    public final void d(AbstractC10454wN2 workerFactory) {
        this.b.add(workerFactory);
    }

    public List<AbstractC10454wN2> e() {
        return this.b;
    }
}
