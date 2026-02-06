package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: o.Ae1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2435Ae1 extends BroadcastReceiver {
    public static final String a = "MediaButtonReceiver";

    /* renamed from: o.Ae1$a */
    /* loaded from: classes.dex */
    public static class a extends MediaBrowserCompat.c {
        public final Context c;
        public final Intent d;
        public final BroadcastReceiver.PendingResult e;
        public MediaBrowserCompat f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            new MediaControllerCompat(this.c, this.f.h()).d((KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            e();
        }

        public final void e() {
            this.f.b();
            this.e.finish();
        }

        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }
    }

    public static PendingIntent a(Context context, long j) {
        ComponentName c = c(context);
        if (c == null) {
            Log.w(a, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        return b(context, c, j);
    }

    public static PendingIntent b(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            Log.w(a, "The component name of media button receiver should be provided.");
            return null;
        }
        int t = PlaybackStateCompat.t(j);
        if (t == 0) {
            Log.w(a, "Cannot build a media button pending intent with the given action: " + j);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i = 0;
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, t));
        int i2 = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        if (i2 >= 31) {
            i = 33554432;
        }
        return PendingIntent.getBroadcast(context, t, intent, i);
    }

    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() > 1) {
            Log.w(a, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        } else {
            return null;
        }
    }

    public static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.e().d(keyEvent);
            return keyEvent;
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName d = d(context, "android.intent.action.MEDIA_BUTTON");
            if (d != null) {
                intent.setComponent(d);
                C10201vM.B(context, intent);
                return;
            }
            ComponentName d2 = d(context, AbstractServiceC11001ye1.f1);
            if (d2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, aVar, null);
                aVar.f(mediaBrowserCompat);
                mediaBrowserCompat.a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        Log.d(a, "Ignore unsupported intent: " + intent);
    }
}
