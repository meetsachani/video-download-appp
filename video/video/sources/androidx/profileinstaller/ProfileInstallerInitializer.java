package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.MP0;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements MP0<b> {
    public static final int a = 5000;

    /* loaded from: classes.dex */
    public static class a {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public static /* synthetic */ void a(Context context) {
        c.j(context);
    }

    public static /* synthetic */ void b(Context context) {
        f(context);
    }

    public static /* synthetic */ void c(ProfileInstallerInitializer profileInstallerInitializer, Context context, long j) {
        profileInstallerInitializer.e(context);
    }

    public static void f(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: o.KI1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.a(context);
            }
        });
    }

    @Override // o.MP0
    /* renamed from: d */
    public b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o.II1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ProfileInstallerInitializer.c(ProfileInstallerInitializer.this, applicationContext, j);
            }
        });
        return new b();
    }

    @Override // o.MP0
    public List<Class<? extends MP0<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void e(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = a.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: o.JI1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.b(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
