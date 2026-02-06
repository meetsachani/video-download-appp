package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collection;
import java.util.Map;
import o.ActivityC4864Yy0;
import o.C10175vF1;
import o.C2531Be;
import o.C3322Jd;
import o.C5770dG0;
import o.C7391ju0;
import o.C7558kb0;
import o.CZ0;
import o.ComponentCallbacks2C7772lS1;
import o.InterfaceC4382Tz0;
import o.InterfaceC8276nS1;
import o.M40;
import o.SD2;

/* loaded from: classes.dex */
public class b implements Handler.Callback {
    public static final String a1 = "com.bumptech.glide.manager";
    public static final InterfaceC0066b b1 = new a();
    public volatile ComponentCallbacks2C7772lS1 X;
    public final InterfaceC0066b Y;
    public final InterfaceC4382Tz0 Y0;
    public final C2531Be<View, Fragment> Z = new C2531Be<>();
    public final com.bumptech.glide.manager.a Z0;

    /* loaded from: classes.dex */
    public class a implements InterfaceC0066b {
        @Override // com.bumptech.glide.manager.b.InterfaceC0066b
        public ComponentCallbacks2C7772lS1 a(com.bumptech.glide.a aVar, CZ0 cz0, InterfaceC8276nS1 interfaceC8276nS1, Context context) {
            return new ComponentCallbacks2C7772lS1(aVar, cz0, interfaceC8276nS1, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0066b {
        ComponentCallbacks2C7772lS1 a(com.bumptech.glide.a aVar, CZ0 cz0, InterfaceC8276nS1 interfaceC8276nS1, Context context);
    }

    public b(InterfaceC0066b interfaceC0066b) {
        interfaceC0066b = interfaceC0066b == null ? b1 : interfaceC0066b;
        this.Y = interfaceC0066b;
        this.Z0 = new com.bumptech.glide.manager.a(interfaceC0066b);
        this.Y0 = b();
    }

    public static void a(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public static InterfaceC4382Tz0 b() {
        if (C5770dG0.g && C5770dG0.f) {
            return new C7391ju0();
        }
        return new M40();
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void d(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (fragment != null && fragment.n0() != null) {
                    map.put(fragment.n0(), fragment);
                    d(fragment.u().J0(), map);
                }
            }
        }
    }

    public static boolean m(Context context) {
        Activity c = c(context);
        if (c != null && c.isFinishing()) {
            return false;
        }
        return true;
    }

    public final Fragment e(View view, ActivityC4864Yy0 activityC4864Yy0) {
        this.Z.clear();
        d(activityC4864Yy0.W0().J0(), this.Z);
        View findViewById = activityC4864Yy0.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.Z.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.Z.clear();
        return fragment;
    }

    @Deprecated
    public ComponentCallbacks2C7772lS1 f(Activity activity) {
        return h(activity.getApplicationContext());
    }

    @Deprecated
    public ComponentCallbacks2C7772lS1 g(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return h(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public ComponentCallbacks2C7772lS1 h(Context context) {
        if (context != null) {
            if (SD2.v() && !(context instanceof Application)) {
                if (context instanceof ActivityC4864Yy0) {
                    return k((ActivityC4864Yy0) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return h(contextWrapper.getBaseContext());
                    }
                }
            }
            return l(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    public ComponentCallbacks2C7772lS1 i(View view) {
        if (SD2.u()) {
            return h(view.getContext().getApplicationContext());
        }
        C10175vF1.e(view);
        C10175vF1.f(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = c(view.getContext());
        if (c == null) {
            return h(view.getContext().getApplicationContext());
        }
        if (c instanceof ActivityC4864Yy0) {
            ActivityC4864Yy0 activityC4864Yy0 = (ActivityC4864Yy0) c;
            Fragment e = e(view, activityC4864Yy0);
            if (e != null) {
                return j(e);
            }
            return k(activityC4864Yy0);
        }
        return h(view.getContext().getApplicationContext());
    }

    public ComponentCallbacks2C7772lS1 j(Fragment fragment) {
        C10175vF1.f(fragment.v(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (SD2.u()) {
            return h(fragment.v().getApplicationContext());
        }
        if (fragment.o() != null) {
            this.Y0.a(fragment.o());
        }
        FragmentManager u = fragment.u();
        Context v = fragment.v();
        return this.Z0.b(v, com.bumptech.glide.a.e(v.getApplicationContext()), fragment.b(), u, fragment.F0());
    }

    public ComponentCallbacks2C7772lS1 k(ActivityC4864Yy0 activityC4864Yy0) {
        if (SD2.u()) {
            return h(activityC4864Yy0.getApplicationContext());
        }
        a(activityC4864Yy0);
        this.Y0.a(activityC4864Yy0);
        boolean m = m(activityC4864Yy0);
        return this.Z0.b(activityC4864Yy0, com.bumptech.glide.a.e(activityC4864Yy0.getApplicationContext()), activityC4864Yy0.b(), activityC4864Yy0.W0(), m);
    }

    public final ComponentCallbacks2C7772lS1 l(Context context) {
        if (this.X == null) {
            synchronized (this) {
                try {
                    if (this.X == null) {
                        this.X = this.Y.a(com.bumptech.glide.a.e(context.getApplicationContext()), new C3322Jd(), new C7558kb0(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.X;
    }
}
