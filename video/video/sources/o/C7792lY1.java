package o;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* renamed from: o.lY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7792lY1 {
    public static final String a = "androidx.work.impl.background.gcm.GcmScheduler";
    public static final String b = AbstractC6949i41.f("Schedulers");

    public static InterfaceC6579gY1 a(Context context, ZM2 workManager) {
        C2558Bk2 c2558Bk2 = new C2558Bk2(context, workManager);
        C3107Gx1.c(context, SystemJobService.class, true);
        AbstractC6949i41.c().a(b, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return c2558Bk2;
    }

    public static void b(androidx.work.a configuration, WorkDatabase workDatabase, List<InterfaceC6579gY1> schedulers) {
        if (schedulers != null && schedulers.size() != 0) {
            InterfaceC8744pN2 L = workDatabase.L();
            workDatabase.c();
            try {
                List<C8501oN2> s = L.s(configuration.h());
                List<C8501oN2> o2 = L.o(200);
                if (s != null && s.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C8501oN2 c8501oN2 : s) {
                        L.q(c8501oN2.a, currentTimeMillis);
                    }
                }
                workDatabase.A();
                workDatabase.i();
                if (s != null && s.size() > 0) {
                    C8501oN2[] c8501oN2Arr = (C8501oN2[]) s.toArray(new C8501oN2[s.size()]);
                    for (InterfaceC6579gY1 interfaceC6579gY1 : schedulers) {
                        if (interfaceC6579gY1.d()) {
                            interfaceC6579gY1.a(c8501oN2Arr);
                        }
                    }
                }
                if (o2 != null && o2.size() > 0) {
                    C8501oN2[] c8501oN2Arr2 = (C8501oN2[]) o2.toArray(new C8501oN2[o2.size()]);
                    for (InterfaceC6579gY1 interfaceC6579gY12 : schedulers) {
                        if (!interfaceC6579gY12.d()) {
                            interfaceC6579gY12.a(c8501oN2Arr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }

    public static InterfaceC6579gY1 c(Context context) {
        try {
            InterfaceC6579gY1 interfaceC6579gY1 = (InterfaceC6579gY1) Class.forName(a).getConstructor(Context.class).newInstance(context);
            AbstractC6949i41.c().a(b, String.format("Created %s", a), new Throwable[0]);
            return interfaceC6579gY1;
        } catch (Throwable th) {
            AbstractC6949i41.c().a(b, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
