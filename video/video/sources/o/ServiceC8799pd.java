package o;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* renamed from: o.pd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceC8799pd extends Service {

    /* renamed from: o.pd$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a() {
            return 512;
        }
    }

    public static ServiceInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, ServiceC8799pd.class), a.a() | 128);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
