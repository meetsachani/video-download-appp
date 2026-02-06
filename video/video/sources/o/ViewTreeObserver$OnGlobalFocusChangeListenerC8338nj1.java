package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.nj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final int a1 = 100;
    @NotNull
    public final Set<String> X;
    @NotNull
    public final Handler Y;
    @NotNull
    public final AtomicBoolean Y0;
    @NotNull
    public final WeakReference<Activity> Z;
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final Map<Integer, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1> b1 = new HashMap();

    /* renamed from: o.nj1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final String c(String str, String str2) {
            if (C6562gT0.g("r2", str)) {
                return new C10219vQ1("[^\\d.]").o(str2, "");
            }
            return str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            if (r7.equals("r5") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            if (r7.equals("r4") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
            r8 = new o.C10219vQ1("[^a-z]+").o(r8, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(Map<String, String> map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (C9545sf2.J2(str2, "m", false, 2, null) || C9545sf2.J2(str2, "b", false, 2, null) || C9545sf2.J2(str2, com.facebook.appevents.Q.p, false, 2, null)) {
                            str2 = "m";
                            break;
                        } else {
                            str2 = "f";
                            break;
                        }
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && C10763xf2.n3(str2, "-", false, 2, null)) {
                        Object[] array = new C10219vQ1("-").r(str2, 0).toArray(new String[0]);
                        if (array != null) {
                            str2 = ((String[]) array)[0];
                            break;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    break;
            }
            map.put(str, str2);
        }

        @InterfaceC6184ey2
        @InterfaceC9511sW0
        public final void e(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            int hashCode = activity.hashCode();
            Map b = ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b.get(valueOf);
            if (obj == null) {
                obj = new ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1(activity, null);
                b.put(valueOf, obj);
            }
            ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.c((ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1) obj);
        }

        @InterfaceC6184ey2
        @InterfaceC9511sW0
        public final void f(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 = (ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1) ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.b().remove(Integer.valueOf(activity.hashCode()));
            if (viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 == null) {
                return;
            }
            ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.d(viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1);
        }

        public a() {
        }
    }

    public /* synthetic */ ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1(Activity activity, C9516sY c9516sY) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            return null;
        }
        try {
            return b1;
        } catch (Throwable th) {
            SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1) {
        if (SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            return;
        }
        try {
            viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.i();
        } catch (Throwable th) {
            SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
        }
    }

    public static final /* synthetic */ void d(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1) {
        if (SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            return;
        }
        try {
            viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.k();
        } catch (Throwable th) {
            SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
        }
    }

    public static final void f(View view, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1 viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1) {
        if (!SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            try {
                C6562gT0.p(view, "$view");
                C6562gT0.p(viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1, "this$0");
                if (!(view instanceof EditText)) {
                    return;
                }
                viewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.g(view);
            } catch (Throwable th) {
                SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
            }
        }
    }

    @InterfaceC6184ey2
    @InterfaceC9511sW0
    public static final void j(@NotNull Activity activity) {
        if (SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            return;
        }
        try {
            Z0.e(activity);
        } catch (Throwable th) {
            SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
        }
    }

    @InterfaceC6184ey2
    @InterfaceC9511sW0
    public static final void l(@NotNull Activity activity) {
        if (SQ.e(ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class)) {
            return;
        }
        try {
            Z0.f(activity);
        } catch (Throwable th) {
            SQ.c(th, ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.class);
        }
    }

    public final void e(final View view) {
        if (SQ.e(this)) {
            return;
        }
        try {
            h(new Runnable() { // from class: o.mj1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.f(view, this);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void g(View view) {
        if (!SQ.e(this)) {
            try {
                String obj = ((EditText) view).getText().toString();
                if (obj != null) {
                    String obj2 = C10763xf2.b6(obj).toString();
                    if (obj2 != null) {
                        String lowerCase = obj2.toLowerCase();
                        C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (lowerCase.length() != 0 && !this.X.contains(lowerCase) && lowerCase.length() <= 100) {
                            this.X.add(lowerCase);
                            HashMap hashMap = new HashMap();
                            C6621gj1 c6621gj1 = C6621gj1.a;
                            List<String> b = C6621gj1.b(view);
                            List<String> list = null;
                            for (C7591kj1 c7591kj1 : C7591kj1.d.c()) {
                                a aVar = Z0;
                                String c = aVar.c(c7591kj1.d(), lowerCase);
                                if (c7591kj1.f().length() > 0) {
                                    C6621gj1 c6621gj12 = C6621gj1.a;
                                    if (!C6621gj1.f(c, c7591kj1.f())) {
                                    }
                                }
                                C6621gj1 c6621gj13 = C6621gj1.a;
                                if (C6621gj1.e(b, c7591kj1.c())) {
                                    aVar.d(hashMap, c7591kj1.d(), c);
                                } else {
                                    if (list == null) {
                                        list = C6621gj1.a(view);
                                    }
                                    if (C6621gj1.e(list, c7591kj1.c())) {
                                        aVar.d(hashMap, c7591kj1.d(), c);
                                    }
                                }
                            }
                            com.facebook.appevents.K.b.h(hashMap);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void h(Runnable runnable) {
        if (SQ.e(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.Y.post(runnable);
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void i() {
        if (!SQ.e(this)) {
            try {
                if (!this.Y0.getAndSet(true)) {
                    C5370bd c5370bd = C5370bd.a;
                    View e = C5370bd.e(this.Z.get());
                    if (e != null) {
                        ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void k() {
        if (!SQ.e(this)) {
            try {
                if (this.Y0.getAndSet(false)) {
                    C5370bd c5370bd = C5370bd.a;
                    View e = C5370bd.e(this.Z.get());
                    if (e != null) {
                        ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                        if (!viewTreeObserver.isAlive()) {
                            return;
                        }
                        viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (!SQ.e(this)) {
            if (view != null) {
                try {
                    e(view);
                } catch (Throwable th) {
                    SQ.c(th, this);
                    return;
                }
            }
            if (view2 != null) {
                e(view2);
            }
        }
    }

    public ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1(Activity activity) {
        this.X = new LinkedHashSet();
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new WeakReference<>(activity);
        this.Y0 = new AtomicBoolean(false);
    }
}
