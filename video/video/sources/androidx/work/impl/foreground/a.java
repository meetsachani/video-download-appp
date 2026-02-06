package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.C8880px0;
import o.InterfaceC3748Nl2;
import o.InterfaceC5625cg0;
import o.MM2;
import o.NM2;
import o.ZM2;

/* loaded from: classes.dex */
public class a implements MM2, InterfaceC5625cg0 {
    public static final String f1 = AbstractC6949i41.f("SystemFgDispatcher");
    public static final String g1 = "KEY_NOTIFICATION";
    public static final String h1 = "KEY_NOTIFICATION_ID";
    public static final String i1 = "KEY_FOREGROUND_SERVICE_TYPE";
    public static final String j1 = "KEY_WORKSPEC_ID";
    public static final String k1 = "ACTION_START_FOREGROUND";
    public static final String l1 = "ACTION_NOTIFY";
    public static final String m1 = "ACTION_CANCEL_WORK";
    public static final String n1 = "ACTION_STOP_FOREGROUND";
    public Context X;
    public ZM2 Y;
    public final Object Y0;
    public final InterfaceC3748Nl2 Z;
    public String Z0;
    public final Map<String, C8880px0> a1;
    public final Map<String, C8501oN2> b1;
    public final Set<C8501oN2> c1;
    public final NM2 d1;
    public b e1;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0057a implements Runnable {
        public final /* synthetic */ WorkDatabase X;
        public final /* synthetic */ String Y;

        public RunnableC0057a(final WorkDatabase val$database, final String val$workSpecId) {
            this.X = val$database;
            this.Y = val$workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8501oN2 j = this.X.L().j(this.Y);
            if (j != null && j.b()) {
                synchronized (a.this.Y0) {
                    a.this.b1.put(this.Y, j);
                    a.this.c1.add(j);
                    a aVar = a.this;
                    aVar.d1.d(aVar.c1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int notificationId, Notification notification);

        void d(int notificationId, int notificationType, Notification notification);

        void e(int notificationId);

        void stop();
    }

    public a(Context context) {
        this.X = context;
        this.Y0 = new Object();
        ZM2 H = ZM2.H(context);
        this.Y = H;
        InterfaceC3748Nl2 O = H.O();
        this.Z = O;
        this.Z0 = null;
        this.a1 = new LinkedHashMap();
        this.c1 = new HashSet();
        this.b1 = new HashMap();
        this.d1 = new NM2(this.X, O, this);
        this.Y.J().c(this);
    }

    public static Intent a(Context context, String workSpecId) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(m1);
        intent.setData(Uri.parse(String.format("workspec://%s", workSpecId)));
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent c(Context context, String workSpecId, C8880px0 info) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(l1);
        intent.putExtra(h1, info.c());
        intent.putExtra(i1, info.a());
        intent.putExtra(g1, info.b());
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent d(Context context, String workSpecId, C8880px0 info) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(k1);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra(h1, info.c());
        intent.putExtra(i1, info.a());
        intent.putExtra(g1, info.b());
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(n1);
        return intent;
    }

    @Override // o.MM2
    public void b(List<String> workSpecIds) {
        if (!workSpecIds.isEmpty()) {
            for (String str : workSpecIds) {
                AbstractC6949i41.c().a(f1, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.Y.W(str);
            }
        }
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        boolean z;
        Map.Entry<String, C8880px0> entry;
        synchronized (this.Y0) {
            try {
                C8501oN2 remove = this.b1.remove(workSpecId);
                if (remove != null) {
                    z = this.c1.remove(remove);
                } else {
                    z = false;
                }
                if (z) {
                    this.d1.d(this.c1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C8880px0 remove2 = this.a1.remove(workSpecId);
        if (workSpecId.equals(this.Z0) && this.a1.size() > 0) {
            Iterator<Map.Entry<String, C8880px0>> it = this.a1.entrySet().iterator();
            Map.Entry<String, C8880px0> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.Z0 = entry.getKey();
            if (this.e1 != null) {
                C8880px0 value = entry.getValue();
                this.e1.d(value.c(), value.a(), value.b());
                this.e1.e(value.c());
            }
        }
        b bVar = this.e1;
        if (remove2 != null && bVar != null) {
            AbstractC6949i41.c().a(f1, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), workSpecId, Integer.valueOf(remove2.a())), new Throwable[0]);
            bVar.e(remove2.c());
        }
    }

    @Override // o.MM2
    public void f(List<String> workSpecIds) {
    }

    public ZM2 h() {
        return this.Y;
    }

    public final void i(Intent intent) {
        AbstractC6949i41.c().d(f1, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.Y.h(UUID.fromString(stringExtra));
        }
    }

    public final void j(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(h1, 0);
        int intExtra2 = intent.getIntExtra(i1, 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra(g1);
        AbstractC6949i41.c().a(f1, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.e1 != null) {
            this.a1.put(stringExtra, new C8880px0(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.Z0)) {
                this.Z0 = stringExtra;
                this.e1.d(intExtra, intExtra2, notification);
                return;
            }
            this.e1.a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, C8880px0> entry : this.a1.entrySet()) {
                    i |= entry.getValue().a();
                }
                C8880px0 c8880px0 = this.a1.get(this.Z0);
                if (c8880px0 != null) {
                    this.e1.d(c8880px0.c(), i, c8880px0.b());
                }
            }
        }
    }

    public final void k(Intent intent) {
        AbstractC6949i41.c().d(f1, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.Z.o(new RunnableC0057a(this.Y.M(), stringExtra));
    }

    public void l(Intent intent) {
        AbstractC6949i41.c().d(f1, "Stopping foreground service", new Throwable[0]);
        b bVar = this.e1;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void m() {
        this.e1 = null;
        synchronized (this.Y0) {
            this.d1.e();
        }
        this.Y.J().j(this);
    }

    public void n(Intent intent) {
        String action = intent.getAction();
        if (k1.equals(action)) {
            k(intent);
            j(intent);
        } else if (l1.equals(action)) {
            j(intent);
        } else if (m1.equals(action)) {
            i(intent);
        } else if (n1.equals(action)) {
            l(intent);
        }
    }

    public void o(b callback) {
        if (this.e1 != null) {
            AbstractC6949i41.c().b(f1, "A callback already exists.", new Throwable[0]);
        } else {
            this.e1 = callback;
        }
    }

    public a(Context context, ZM2 workManagerImpl, NM2 tracker) {
        this.X = context;
        this.Y0 = new Object();
        this.Y = workManagerImpl;
        this.Z = workManagerImpl.O();
        this.Z0 = null;
        this.a1 = new LinkedHashMap();
        this.c1 = new HashSet();
        this.b1 = new HashMap();
        this.d1 = tracker;
        this.Y.J().c(this);
    }
}
