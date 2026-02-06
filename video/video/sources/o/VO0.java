package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.C2375u;
import java.util.concurrent.atomic.AtomicBoolean;
import o.HT1;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class VO0 {
    @NotNull
    public static final String b = "com.google.android.play.billingclient.version";
    @NotNull
    public static final VO0 a = new VO0();
    @NotNull
    public static final AtomicBoolean c = new AtomicBoolean(false);

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(VO0.class)) {
            return;
        }
        try {
            c.set(true);
            b();
        } catch (Throwable th) {
            SQ.c(th, VO0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (!SQ.e(VO0.class)) {
            try {
                if (c.get()) {
                    if (a.c()) {
                        C2375u c2375u = C2375u.a;
                        if (C2375u.g(C2375u.b.IapLoggingLib2)) {
                            PO0 po0 = PO0.a;
                            com.facebook.M m = com.facebook.M.a;
                            PO0.d(com.facebook.M.n());
                            return;
                        }
                    }
                    KO0 ko0 = KO0.a;
                    KO0.g();
                }
            } catch (Throwable th) {
                SQ.c(th, VO0.class);
            }
        }
    }

    public final boolean c() {
        if (SQ.e(this)) {
            return false;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            ApplicationInfo applicationInfo = n.getPackageManager().getApplicationInfo(n.getPackageName(), 128);
            C6562gT0.o(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString(b);
            if (string == null) {
                return false;
            }
            if (Integer.parseInt((String) C10763xf2.o5(string, new String[]{UE.h}, false, 3, 2, null).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
