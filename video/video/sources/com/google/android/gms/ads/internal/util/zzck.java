package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcan;

/* loaded from: classes2.dex */
public final class zzck {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public zzck(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    public static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            return decorView.getViewTreeObserver();
        }
        return null;
    }

    public final void a() {
        this.e = false;
        h();
    }

    public final void b() {
        this.e = true;
        if (this.d) {
            g();
        }
    }

    public final void c() {
        this.d = true;
        if (this.e) {
            g();
        }
    }

    public final void d() {
        this.d = false;
        h();
    }

    public final void e(Activity activity) {
        this.b = activity;
    }

    public final void g() {
        if (!this.c) {
            Activity activity = this.b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
                ViewTreeObserver f = f(activity);
                if (f != null) {
                    f.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            View view = this.a;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f;
            com.google.android.gms.ads.internal.zzv.D();
            zzcan.a(view, onGlobalLayoutListener2);
            this.c = true;
        }
    }

    public final void h() {
        Activity activity = this.b;
        if (activity != null && this.c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver f = f(activity);
            if (f != null) {
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.c = false;
        }
    }
}
