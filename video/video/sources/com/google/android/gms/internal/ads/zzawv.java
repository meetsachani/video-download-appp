package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzawv implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler h1 = new Handler(Looper.getMainLooper());
    public final Context X;
    public Application Y;
    @InterfaceC11300zs1
    public final KeyguardManager Y0;
    @InterfaceC11300zs1
    public final PowerManager Z;
    public BroadcastReceiver Z0;
    public final zzawh a1;
    public WeakReference b1;
    @InterfaceC11300zs1
    public WeakReference c1;
    public zzawd d1;
    public byte e1 = -1;
    public int f1 = -1;
    public long g1 = -3;

    public zzawv(Context context, zzawh zzawhVar) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext;
        this.a1 = zzawhVar;
        this.Z = (PowerManager) applicationContext.getSystemService("power");
        this.Y0 = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.Y = (Application) applicationContext;
            this.d1 = new zzawd((Application) applicationContext, this);
        }
        d(null);
    }

    public final long a() {
        if (this.g1 <= -2 && b() == null) {
            this.g1 = -3L;
        }
        return this.g1;
    }

    @InterfaceC11300zs1
    public final View b() {
        WeakReference weakReference = this.c1;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void d(View view) {
        long j;
        View b = b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            i(b);
        }
        this.c1 = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.g1 = j;
    }

    public final void e(Activity activity, int i) {
        Window window;
        if (this.c1 != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b = b();
            if (b != null && peekDecorView != null && b.getRootView() == peekDecorView.getRootView()) {
                this.f1 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
        if ((r8.flags & 524288) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        long j;
        WindowManager.LayoutParams layoutParams;
        Activity activity;
        if (this.c1 != null) {
            View b = b();
            if (b == null) {
                this.g1 = -3L;
                this.e1 = (byte) -1;
                return;
            }
            int i2 = 0;
            if (b.getVisibility() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (!b.isShown()) {
                i |= 2;
            }
            PowerManager powerManager = this.Z;
            if (powerManager != null && !powerManager.isScreenOn()) {
                i |= 4;
            }
            if (!this.a1.a()) {
                KeyguardManager keyguardManager = this.Y0;
                if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                    int i3 = zzawr.b;
                    View rootView = b.getRootView();
                    if (rootView == null) {
                        rootView = b;
                    }
                    Context context = rootView.getContext();
                    while (true) {
                        layoutParams = null;
                        if (!(context instanceof ContextWrapper) || i2 >= 10) {
                            break;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                            i2++;
                        }
                    }
                    if (activity != null) {
                        Window window = activity.getWindow();
                        if (window != null) {
                            layoutParams = window.getAttributes();
                        }
                        if (layoutParams != null) {
                        }
                    }
                }
                i |= 8;
            }
            if (!b.getGlobalVisibleRect(new Rect())) {
                i |= 16;
            }
            if (!b.getLocalVisibleRect(new Rect())) {
                i |= 32;
            }
            int windowVisibility = b.getWindowVisibility();
            int i4 = this.f1;
            if (i4 != -1) {
                windowVisibility = i4;
            }
            if (windowVisibility != 0) {
                i |= 64;
            }
            if (this.e1 != i) {
                this.e1 = (byte) i;
                if (i == 0) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = (-3) - i;
                }
                this.g1 = j;
            }
        }
    }

    public final void g() {
        h1.post(new zzawt(this));
    }

    public final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.b1 = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.Z0 == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzawu zzawuVar = new zzawu(this);
            this.Z0 = zzawuVar;
            this.X.registerReceiver(zzawuVar, intentFilter);
        }
        Application application = this.Y;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.d1);
            } catch (Exception unused) {
            }
        }
    }

    public final void i(View view) {
        try {
            WeakReference weakReference = this.b1;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.b1 = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.Z0;
        if (broadcastReceiver != null) {
            try {
                this.X.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.Z0 = null;
        }
        Application application = this.Y;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.d1);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1 = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1 = -1;
        f();
        g();
        i(view);
    }
}
