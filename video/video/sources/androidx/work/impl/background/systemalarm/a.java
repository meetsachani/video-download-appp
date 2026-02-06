package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC6949i41;
import o.C7933m8;
import o.C8501oN2;
import o.InterfaceC5625cg0;

/* loaded from: classes.dex */
public class a implements InterfaceC5625cg0 {
    public static final String Y0 = AbstractC6949i41.f("CommandHandler");
    public static final String Z0 = "ACTION_SCHEDULE_WORK";
    public static final String a1 = "ACTION_DELAY_MET";
    public static final String b1 = "ACTION_STOP_WORK";
    public static final String c1 = "ACTION_CONSTRAINTS_CHANGED";
    public static final String d1 = "ACTION_RESCHEDULE";
    public static final String e1 = "ACTION_EXECUTION_COMPLETED";
    public static final String f1 = "KEY_WORKSPEC_ID";
    public static final String g1 = "KEY_NEEDS_RESCHEDULE";
    public static final long h1 = 600000;
    public final Context X;
    public final Map<String, InterfaceC5625cg0> Y = new HashMap();
    public final Object Z = new Object();

    public a(Context context) {
        this.X = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(c1);
        return intent;
    }

    public static Intent b(Context context, String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(a1);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent c(Context context, String workSpecId, boolean needsReschedule) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(e1);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra(g1, needsReschedule);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(d1);
        return intent;
    }

    public static Intent f(Context context, String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(Z0);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent g(Context context, String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(b1);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static boolean n(Bundle bundle, String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        synchronized (this.Z) {
            try {
                InterfaceC5625cg0 remove = this.Y.remove(workSpecId);
                if (remove != null) {
                    remove.e(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Intent intent, int startId, d dispatcher) {
        AbstractC6949i41.c().a(Y0, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.X, startId, dispatcher).a();
    }

    public final void i(Intent intent, int startId, d dispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.Z) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                AbstractC6949i41 c = AbstractC6949i41.c();
                String str = Y0;
                c.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (!this.Y.containsKey(string)) {
                    c cVar = new c(this.X, startId, string, dispatcher);
                    this.Y.put(string, cVar);
                    cVar.d();
                } else {
                    AbstractC6949i41.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Intent intent, int startId) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean(g1);
        AbstractC6949i41.c().a(Y0, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        e(string, z);
    }

    public final void k(Intent intent, int startId, d dispatcher) {
        AbstractC6949i41.c().a(Y0, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        dispatcher.g().R();
    }

    public final void l(Intent intent, int startId, d dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC6949i41 c = AbstractC6949i41.c();
        String str = Y0;
        c.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase M = dispatcher.g().M();
        M.c();
        try {
            C8501oN2 j = M.L().j(string);
            if (j == null) {
                AbstractC6949i41 c2 = AbstractC6949i41.c();
                c2.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (j.b.e()) {
                AbstractC6949i41 c3 = AbstractC6949i41.c();
                c3.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a = j.a();
                if (!j.b()) {
                    AbstractC6949i41.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    C7933m8.c(this.X, dispatcher.g(), string, a);
                } else {
                    AbstractC6949i41.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    C7933m8.c(this.X, dispatcher.g(), string, a);
                    dispatcher.k(new d.b(dispatcher, a(this.X), startId));
                }
                M.A();
            }
        } finally {
            M.i();
        }
    }

    public final void m(Intent intent, d dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC6949i41.c().a(Y0, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dispatcher.g().X(string);
        C7933m8.a(this.X, dispatcher.g(), string);
        dispatcher.e(string, false);
    }

    public boolean o() {
        boolean z;
        synchronized (this.Z) {
            z = !this.Y.isEmpty();
        }
        return z;
    }

    public void p(Intent intent, int startId, d dispatcher) {
        String action = intent.getAction();
        if (c1.equals(action)) {
            h(intent, startId, dispatcher);
        } else if (d1.equals(action)) {
            k(intent, startId, dispatcher);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC6949i41.c().b(Y0, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if (Z0.equals(action)) {
            l(intent, startId, dispatcher);
        } else if (a1.equals(action)) {
            i(intent, startId, dispatcher);
        } else if (b1.equals(action)) {
            m(intent, dispatcher);
        } else if (e1.equals(action)) {
            j(intent, startId);
        } else {
            AbstractC6949i41.c().h(Y0, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
