package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.C9565sk2;
import o.InterfaceC5557cN2;
import o.InterfaceC8744pN2;
import o.InterfaceC9479sN2;
import o.InterfaceC9808tk2;
import o.ZM2;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String b1 = AbstractC6949i41.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
    }

    public static String a(C8501oN2 workSpec, String name, Integer systemId, String tags) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.a, workSpec.c, systemId, workSpec.b.name(), name, tags);
    }

    public static String c(InterfaceC5557cN2 workNameDao, InterfaceC9479sN2 workTagDao, InterfaceC9808tk2 systemIdInfoDao, List<C8501oN2> workSpecs) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (C8501oN2 c8501oN2 : workSpecs) {
            C9565sk2 a = systemIdInfoDao.a(c8501oN2.a);
            if (a != null) {
                num = Integer.valueOf(a.b);
            } else {
                num = null;
            }
            sb.append(a(c8501oN2, TextUtils.join(",", workNameDao.a(c8501oN2.a)), num, TextUtils.join(",", workTagDao.b(c8501oN2.a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase M = ZM2.H(getApplicationContext()).M();
        InterfaceC8744pN2 L = M.L();
        InterfaceC5557cN2 J = M.J();
        InterfaceC9479sN2 M2 = M.M();
        InterfaceC9808tk2 I = M.I();
        List<C8501oN2> d = L.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<C8501oN2> x = L.x();
        List<C8501oN2> o2 = L.o(200);
        if (d != null && !d.isEmpty()) {
            AbstractC6949i41 c = AbstractC6949i41.c();
            String str = b1;
            c.d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC6949i41.c().d(str, c(J, M2, I, d), new Throwable[0]);
        }
        if (x != null && !x.isEmpty()) {
            AbstractC6949i41 c2 = AbstractC6949i41.c();
            String str2 = b1;
            c2.d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC6949i41.c().d(str2, c(J, M2, I, x), new Throwable[0]);
        }
        if (o2 != null && !o2.isEmpty()) {
            AbstractC6949i41 c3 = AbstractC6949i41.c();
            String str3 = b1;
            c3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC6949i41.c().d(str3, c(J, M2, I, o2), new Throwable[0]);
        }
        return ListenableWorker.a.e();
    }
}
