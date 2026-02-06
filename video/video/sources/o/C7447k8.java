package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* renamed from: o.k8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7447k8 implements InterfaceC8257nN2 {
    public static final String f = "AlarmManagerScheduler";
    public static final String g = "attemptNumber";
    public static final String h = "backendName";
    public static final String i = "priority";
    public static final String j = "extras";
    public final Context a;
    public final InterfaceC4207Se0 b;
    public AlarmManager c;
    public final AbstractC6822hY1 d;
    public final ND e;

    public C7447k8(Context context, InterfaceC4207Se0 interfaceC4207Se0, ND nd, AbstractC6822hY1 abstractC6822hY1) {
        this(context, interfaceC4207Se0, (AlarmManager) context.getSystemService(C3771Nr1.K0), nd, abstractC6822hY1);
    }

    @Override // o.InterfaceC8257nN2
    public void a(Nt2 nt2, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", nt2.b());
        builder.appendQueryParameter("priority", String.valueOf(DH1.a(nt2.d())));
        if (nt2.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(nt2.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z && c(intent)) {
            C7676l41.c(f, "Upload for context %s is already scheduled. Returning...", nt2);
            return;
        }
        long x0 = this.b.x0(nt2);
        long h2 = this.d.h(nt2.d(), x0, i2);
        C7676l41.e(f, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", nt2, Long.valueOf(h2), Long.valueOf(x0), Integer.valueOf(i2));
        this.c.set(3, this.e.a() + h2, PendingIntent.getBroadcast(this.a, 0, intent, 67108864));
    }

    @Override // o.InterfaceC8257nN2
    public void b(Nt2 nt2, int i2) {
        a(nt2, i2, false);
    }

    @InterfaceC5056aJ2
    public boolean c(Intent intent) {
        if (PendingIntent.getBroadcast(this.a, 0, intent, 603979776) == null) {
            return false;
        }
        return true;
    }

    @InterfaceC5056aJ2
    public C7447k8(Context context, InterfaceC4207Se0 interfaceC4207Se0, AlarmManager alarmManager, ND nd, AbstractC6822hY1 abstractC6822hY1) {
        this.a = context;
        this.b = interfaceC4207Se0;
        this.c = alarmManager;
        this.e = nd;
        this.d = abstractC6822hY1;
    }
}
