package o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: o.wN2 */
/* loaded from: classes.dex */
public abstract class AbstractC10454wN2 {
    public static final String a = AbstractC6949i41.f("WorkerFactory");

    /* renamed from: o.wN2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC10454wN2 {
        @Override // o.AbstractC10454wN2
        public ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static AbstractC10454wN2 c() {
        return new a();
    }

    public abstract ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters);

    public final ListenableWorker b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a2 = a(appContext, workerClassName, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC6949i41 c = AbstractC6949i41.c();
                String str = a;
                c.b(str, "Invalid class: " + workerClassName, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (Throwable th2) {
                    AbstractC6949i41 c2 = AbstractC6949i41.c();
                    String str2 = a;
                    c2.b(str2, "Could not instantiate " + workerClassName, th2);
                }
            }
        }
        if (a2 != null && a2.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
        }
        return a2;
    }
}
