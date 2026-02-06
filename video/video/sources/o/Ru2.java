package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Ru2 {
    public static final String c = "TWAConnectionPool";
    public final Context a;
    public final Map<Uri, ServiceConnectionC5300bK> b = new HashMap();

    /* loaded from: classes.dex */
    public static class a extends AsyncTask<Void, Void, Exception> {
        public final Context a;
        public final Intent b;
        public final ServiceConnectionC5300bK c;

        public a(Context context, Intent intent, ServiceConnectionC5300bK serviceConnectionC5300bK) {
            this.a = context.getApplicationContext();
            this.b = intent;
            this.c = serviceConnectionC5300bK;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.a.bindService(this.b, this.c, androidx.fragment.app.j.I)) {
                    return null;
                }
                this.a.unbindService(this.c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                Log.w(Ru2.c, "SecurityException while binding.", e);
                return e;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.c.b(exc);
            }
        }
    }

    public Ru2(Context context) {
        this.a = context.getApplicationContext();
    }

    public static Ru2 c(Context context) {
        return new Ru2(context);
    }

    public InterfaceFutureC8411o11<Pu2> b(final Uri uri, Set<C4544Vp2> set, Executor executor) {
        ServiceConnectionC5300bK serviceConnectionC5300bK = this.b.get(uri);
        if (serviceConnectionC5300bK != null) {
            return serviceConnectionC5300bK.c();
        }
        Intent d = d(this.a, uri, set, true);
        if (d == null) {
            return C6494gC0.a(new IllegalArgumentException("No service exists for scope"));
        }
        ServiceConnectionC5300bK serviceConnectionC5300bK2 = new ServiceConnectionC5300bK(new Runnable() { // from class: o.Qu2
            @Override // java.lang.Runnable
            public final void run() {
                Ru2.this.b.remove(uri);
            }
        });
        this.b.put(uri, serviceConnectionC5300bK2);
        new a(this.a, d, serviceConnectionC5300bK2).executeOnExecutor(executor, new Void[0]);
        return serviceConnectionC5300bK2.c();
    }

    public final Intent d(Context context, Uri uri, Set<C4544Vp2> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        String str = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str2 = resolveInfo.activityInfo.packageName;
            Iterator<C4544Vp2> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().c(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                Log.w(c, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(Ou2.Y0);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            if (z) {
                Log.w(c, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z) {
            Log.i(c, "Found " + resolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }

    public boolean e(Uri uri, Set<C4544Vp2> set) {
        if (this.b.get(uri) != null || d(this.a, uri, set, false) != null) {
            return true;
        }
        return false;
    }

    public void f() {
        for (ServiceConnectionC5300bK serviceConnectionC5300bK : this.b.values()) {
            this.a.unbindService(serviceConnectionC5300bK);
        }
        this.b.clear();
    }
}
