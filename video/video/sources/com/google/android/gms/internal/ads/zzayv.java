package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzayv implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long k1 = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z1)).longValue();
    public final Context X;
    public Application Y;
    public final PowerManager Y0;
    public final WindowManager Z;
    public final KeyguardManager Z0;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public BroadcastReceiver a1;
    public WeakReference b1;
    public final WeakReference c1;
    public zzazh d1;
    public final com.google.android.gms.ads.internal.util.zzbx e1 = new com.google.android.gms.ads.internal.util.zzbx(k1);
    public boolean f1 = false;
    public int g1 = -1;
    public final HashSet h1 = new HashSet();
    public final DisplayMetrics i1;
    public final Rect j1;

    public zzayv(Context context, View view) {
        View view2;
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.Z = windowManager;
        this.Y0 = (PowerManager) applicationContext.getSystemService("power");
        this.Z0 = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.Y = (Application) applicationContext;
            this.d1 = new zzazh((Application) applicationContext, this);
        }
        this.i1 = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.j1 = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.c1;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.c1 = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void d(zzayu zzayuVar) {
        this.h1.add(zzayuVar);
        j(3);
    }

    public final void e(zzayu zzayuVar) {
        this.h1.remove(zzayuVar);
    }

    public final void f() {
        this.e1.a(k1);
    }

    public final void g(long j) {
        this.e1.a(j);
    }

    public final int h(int i) {
        return (int) (i / this.i1.density);
    }

    public final void i(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.c1;
        if (weakReference != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) weakReference.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.g1 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
        if (r9 == 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        WeakReference weakReference;
        boolean z;
        boolean z2;
        View view;
        List list;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (!this.h1.isEmpty() && (weakReference = this.c1) != null) {
            View view2 = (View) weakReference.get();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view2 != null) {
                z = view2.getGlobalVisibleRect(rect2);
                z2 = view2.getLocalVisibleRect(rect3);
                view2.getHitRect(rect4);
                try {
                    view2.getLocationOnScreen(iArr);
                    view2.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Failure getting view location.", e);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o5)).booleanValue()) {
                    rect.left = iArr2[0];
                    rect.top = iArr2[1];
                } else {
                    rect.left = iArr[0];
                    rect.top = iArr[1];
                }
                rect.right = rect.left + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
                view = view2;
            } else {
                z = false;
                z2 = false;
                view = null;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C1)).booleanValue() && view != null) {
                try {
                    list = new ArrayList();
                    ViewParent parent = view.getParent();
                    while (parent instanceof View) {
                        View view3 = (View) parent;
                        Rect rect5 = new Rect();
                        if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                            list.add(a(rect5));
                        }
                        parent = parent.getParent();
                    }
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzv.t().x(e2, "PositionWatcher.getParentScrollViewRects");
                    list = Collections.EMPTY_LIST;
                }
            } else {
                list = Collections.EMPTY_LIST;
            }
            List list2 = list;
            if (view != null) {
                i2 = view.getWindowVisibility();
            } else {
                i2 = 8;
            }
            int i12 = this.g1;
            if (i12 != -1) {
                i2 = i12;
            }
            com.google.android.gms.ads.internal.zzv.v();
            long d0 = com.google.android.gms.ads.internal.util.zzs.d0(view);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ra)).booleanValue()) {
                if (view2 != null) {
                    PowerManager powerManager = this.Y0;
                    KeyguardManager keyguardManager = this.Z0;
                    com.google.android.gms.ads.internal.zzv.v();
                    if (com.google.android.gms.ads.internal.util.zzs.t(view, powerManager, keyguardManager)) {
                        if (z) {
                            if (z2) {
                                if (d0 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ua)).intValue()) {
                                }
                                z = true;
                                z2 = true;
                            }
                            z = true;
                            i3 = 0;
                            z2 = false;
                        }
                        i3 = 0;
                        z = false;
                    }
                }
                i3 = 0;
            } else {
                if (view2 != null) {
                    PowerManager powerManager2 = this.Y0;
                    KeyguardManager keyguardManager2 = this.Z0;
                    com.google.android.gms.ads.internal.zzv.v();
                    if (com.google.android.gms.ads.internal.util.zzs.t(view, powerManager2, keyguardManager2)) {
                        if (z) {
                            if (z2) {
                            }
                            z = true;
                            i3 = 0;
                            z2 = false;
                        }
                        i3 = 0;
                        z = false;
                    }
                }
                i3 = 0;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Wa)).booleanValue()) {
                PowerManager powerManager3 = this.Y0;
                KeyguardManager keyguardManager3 = this.Z0;
                com.google.android.gms.ads.internal.zzv.v();
                if (true != com.google.android.gms.ads.internal.util.zzs.t(view, powerManager3, keyguardManager3)) {
                    i6 = 0;
                } else {
                    i6 = 64;
                }
                if (true != z) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                if (true != z2) {
                    i8 = 0;
                } else {
                    i8 = 16;
                }
                if (i2 == 0) {
                    i9 = 128;
                } else {
                    i9 = 0;
                }
                if (d0 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ua)).intValue()) {
                    i10 = 32;
                } else {
                    i10 = 0;
                }
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.k(view, i10 | i9 | i6 | i7 | i8 | i3, null);
                i4 = 1;
            } else {
                i4 = 1;
            }
            if (i != i4 || this.e1.b() || i3 != this.f1) {
                if (i3 == 0 && !this.f1) {
                    z3 = true;
                    if (i == 1) {
                        return;
                    }
                } else {
                    z3 = true;
                }
                long b = com.google.android.gms.ads.internal.zzv.d().b();
                boolean isScreenOn = this.Y0.isScreenOn();
                if (view != null && view.isAttachedToWindow()) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                if (view != null) {
                    i5 = view.getWindowVisibility();
                } else {
                    i5 = 8;
                }
                boolean z5 = i3;
                zzayt zzaytVar = new zzayt(b, isScreenOn, z4, i5, a(this.j1), a(rect), a(rect2), z, a(rect3), z2, d0, a(rect4), this.i1.density, z5, list2);
                Iterator it = this.h1.iterator();
                while (it.hasNext()) {
                    ((zzayu) it.next()).E0(zzaytVar);
                }
                this.f1 = z5;
            }
        }
    }

    public final void k() {
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayr
            @Override // java.lang.Runnable
            public final void run() {
                zzayv.this.j(3);
            }
        });
    }

    public final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.b1 = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.a1 == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.a1 = new zzays(this);
            com.google.android.gms.ads.internal.zzv.B().c(this.X, this.a1, intentFilter);
        }
        Application application = this.Y;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.d1);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void m(View view) {
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
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.a1 != null) {
            try {
                com.google.android.gms.ads.internal.zzv.B().d(this.X, this.a1);
            } catch (IllegalStateException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzv.t().x(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.a1 = null;
        }
        Application application = this.Y;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.d1);
            } catch (Exception e5) {
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g1 = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g1 = -1;
        j(3);
        k();
        m(view);
    }
}
