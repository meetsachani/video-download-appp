package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import o.D6;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final String a = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final String b = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final String c = "androidx.profileinstaller.action.SKIP_FILE";
    public static final String d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final String e = "EXTRA_SKIP_FILE_OPERATION";
    public static final String f = "WRITE_SKIP_FILE";
    public static final String g = "DELETE_SKIP_FILE";
    public static final String h = "EXTRA_BENCHMARK_OPERATION";
    public static final String i = "DROP_SHADER_CACHE";

    /* loaded from: classes.dex */
    public class a implements c.d {
        public a() {
        }

        @Override // androidx.profileinstaller.c.d
        public void a(int i, Object obj) {
            c.h.a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i, Object obj) {
            c.h.b(i, obj);
        }
    }

    public static void a(c.d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if (a.equals(action)) {
                c.l(context, new D6(), new a(), true);
            } else if (c.equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString(e);
                    if (f.equals(string)) {
                        c.m(context, new D6(), new a());
                    } else if (g.equals(string)) {
                        c.d(context, new D6(), new a());
                    }
                }
            } else if (b.equals(action)) {
                a(new a());
            } else if (d.equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString(h);
                a aVar = new a();
                if (i.equals(string2)) {
                    androidx.profileinstaller.a.b(context, aVar);
                } else {
                    aVar.a(16, null);
                }
            }
        }
    }
}
