package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public T a;
    @InterfaceC11300zs1
    public Bundle b;
    public LinkedList<zah> c;
    public final OnDelegateCreatedListener<T> d = new zaa(this);

    @KeepForSdk
    public static void o(@InterfaceC5670cr1 FrameLayout frameLayout) {
        GoogleApiAvailability x = GoogleApiAvailability.x();
        Context context = frameLayout.getContext();
        int j = x.j(context);
        String d = com.google.android.gms.common.internal.zac.d(context, j);
        String c = com.google.android.gms.common.internal.zac.c(context, j);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d);
        linearLayout.addView(textView);
        Intent e = x.e(context, j, null);
        if (e != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, e));
        }
    }

    @KeepForSdk
    public abstract void a(@InterfaceC5670cr1 OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @InterfaceC5670cr1
    @KeepForSdk
    public T b() {
        return this.a;
    }

    @KeepForSdk
    public void c(@InterfaceC5670cr1 FrameLayout frameLayout) {
        o(frameLayout);
    }

    @KeepForSdk
    public void d(@InterfaceC11300zs1 Bundle bundle) {
        u(bundle, new zac(this, bundle));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public View e(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void f() {
        T t = this.a;
        if (t != null) {
            t.onDestroy();
        } else {
            t(1);
        }
    }

    @KeepForSdk
    public void g() {
        T t = this.a;
        if (t != null) {
            t.a();
        } else {
            t(2);
        }
    }

    @KeepForSdk
    public void h(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Bundle bundle, @InterfaceC11300zs1 Bundle bundle2) {
        u(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void i() {
        T t = this.a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void j() {
        T t = this.a;
        if (t != null) {
            t.onPause();
        } else {
            t(5);
        }
    }

    @KeepForSdk
    public void k() {
        u(null, new zag(this));
    }

    @KeepForSdk
    public void l(@InterfaceC5670cr1 Bundle bundle) {
        T t = this.a;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void m() {
        u(null, new zaf(this));
    }

    @KeepForSdk
    public void n() {
        T t = this.a;
        if (t != null) {
            t.onStop();
        } else {
            t(4);
        }
    }

    public final void t(int i) {
        while (!this.c.isEmpty() && this.c.getLast().d() >= i) {
            this.c.removeLast();
        }
    }

    public final void u(@InterfaceC11300zs1 Bundle bundle, zah zahVar) {
        T t = this.a;
        if (t != null) {
            zahVar.a(t);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(zahVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }
}
