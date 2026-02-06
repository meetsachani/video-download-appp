package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C2416z;
import com.facebook.internal.C2379y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o.C5459bz1;
import o.C8256nN1;
import o.PE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class UE {
    @NotNull
    public static final String g = "..";
    @NotNull
    public static final String h = ".";
    @Nullable
    public static UE j;
    @NotNull
    public final Handler a;
    @NotNull
    public final Set<Activity> b;
    @NotNull
    public final Set<c> c;
    @NotNull
    public HashSet<String> d;
    @NotNull
    public final HashMap<Integer, HashSet<String>> e;
    @NotNull
    public static final a f = new a(null);
    public static final String i = UE.class.getCanonicalName();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final synchronized UE a() {
            UE b;
            try {
                if (UE.b() == null) {
                    UE.d(new UE(null));
                }
                b = UE.b();
                if (b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th) {
                throw th;
            }
            return b;
        }

        @InterfaceC6184ey2
        @InterfaceC9511sW0
        @NotNull
        public final Bundle b(@Nullable C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
            List<C4969Zx1> i;
            C2532Be0 c2532Be02;
            View view3;
            List<b> a;
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            Bundle bundle = new Bundle();
            if (c2532Be0 != null && (i = c2532Be0.i()) != null) {
                for (C4969Zx1 c4969Zx1 : i) {
                    if (c4969Zx1.d() != null && c4969Zx1.d().length() > 0) {
                        bundle.putString(c4969Zx1.a(), c4969Zx1.d());
                    } else if (c4969Zx1.b().size() > 0) {
                        if (C6562gT0.g(c4969Zx1.c(), EK.e)) {
                            c.a aVar = c.a1;
                            List<C5459bz1> b = c4969Zx1.b();
                            String simpleName = view2.getClass().getSimpleName();
                            C6562gT0.o(simpleName, "hostView.javaClass.simpleName");
                            C2532Be0 c2532Be03 = c2532Be0;
                            a = aVar.a(c2532Be03, view2, b, 0, -1, simpleName);
                            c2532Be02 = c2532Be03;
                            view3 = view;
                        } else {
                            c2532Be02 = c2532Be0;
                            c.a aVar2 = c.a1;
                            List<C5459bz1> b2 = c4969Zx1.b();
                            String simpleName2 = view.getClass().getSimpleName();
                            C6562gT0.o(simpleName2, "rootView.javaClass.simpleName");
                            view3 = view;
                            a = aVar2.a(c2532Be02, view3, b2, 0, -1, simpleName2);
                        }
                        Iterator<b> it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b next = it.next();
                            if (next.a() != null) {
                                C9455sH2 c9455sH2 = C9455sH2.a;
                                String k = C9455sH2.k(next.a());
                                if (k.length() > 0) {
                                    bundle.putString(c4969Zx1.a(), k);
                                    break;
                                }
                            }
                        }
                        c2532Be0 = c2532Be02;
                        view = view3;
                    }
                }
            }
            return bundle;
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        @Nullable
        public final WeakReference<View> a;
        @NotNull
        public final String b;

        public b(@NotNull View view, @NotNull String str) {
            C6562gT0.p(view, C9698tH2.A);
            C6562gT0.p(str, "viewMapKey");
            this.a = new WeakReference<>(view);
            this.b = str;
        }

        @Nullable
        public final View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @NotNull
        public final String b() {
            return this.b;
        }
    }

    @InterfaceC6184ey2
    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        @NotNull
        public static final a a1 = new a(null);
        @NotNull
        public final WeakReference<View> X;
        @Nullable
        public List<C2532Be0> Y;
        @NotNull
        public final HashSet<String> Y0;
        @NotNull
        public final Handler Z;
        @NotNull
        public final String Z0;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            @NotNull
            public final List<b> a(@Nullable C2532Be0 c2532Be0, @Nullable View view, @NotNull List<C5459bz1> list, int i, int i2, @NotNull String str) {
                C2532Be0 c2532Be02;
                List<C5459bz1> list2;
                a aVar;
                List<View> b;
                int size;
                List<View> b2;
                int size2;
                C6562gT0.p(list, "path");
                C6562gT0.p(str, "mapKey");
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i >= list.size()) {
                        arrayList.add(new b(view, str2));
                        c2532Be02 = c2532Be0;
                        list2 = list;
                        aVar = this;
                    } else {
                        C5459bz1 c5459bz1 = list.get(i);
                        if (C6562gT0.g(c5459bz1.a(), "..")) {
                            ViewParent parent = view.getParent();
                            if ((parent instanceof ViewGroup) && (size = (b = b((ViewGroup) parent)).size()) > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    C2532Be0 c2532Be03 = c2532Be0;
                                    List<C5459bz1> list3 = list;
                                    arrayList.addAll(a(c2532Be03, b.get(i3), list3, i + 1, i3, str2));
                                    if (i4 >= size) {
                                        break;
                                    }
                                    i3 = i4;
                                    c2532Be0 = c2532Be03;
                                    list = list3;
                                }
                            }
                        } else {
                            c2532Be02 = c2532Be0;
                            list2 = list;
                            aVar = this;
                            if (C6562gT0.g(c5459bz1.a(), UE.h)) {
                                arrayList.add(new b(view, str2));
                                return arrayList;
                            } else if (c(view, c5459bz1, i2)) {
                                if (i == list2.size() - 1) {
                                    arrayList.add(new b(view, str2));
                                }
                            }
                        }
                    }
                    if ((view instanceof ViewGroup) && (size2 = (b2 = b((ViewGroup) view)).size()) > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            arrayList.addAll(aVar.a(c2532Be02, b2.get(i5), list2, i + 1, i5, str2));
                            if (i6 >= size2) {
                                break;
                            }
                            aVar = this;
                            i5 = i6;
                        }
                    }
                }
                return arrayList;
            }

            public final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getVisibility() == 0) {
                            C6562gT0.o(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
                if (o.C6562gT0.g(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean c(View view, C5459bz1 c5459bz1, int i) {
                String obj;
                String obj2;
                if (c5459bz1.e() != -1 && i != c5459bz1.e()) {
                    return false;
                }
                if (!C6562gT0.g(view.getClass().getCanonicalName(), c5459bz1.a())) {
                    if (new C10219vQ1(".*android\\..*").m(c5459bz1.a())) {
                        List o5 = C10763xf2.o5(c5459bz1.a(), new String[]{UE.h}, false, 0, 6, null);
                        if (!o5.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((c5459bz1.f() & C5459bz1.b.ID.g()) > 0 && c5459bz1.d() != view.getId()) {
                    return false;
                }
                if ((c5459bz1.f() & C5459bz1.b.TEXT.g()) > 0) {
                    String h = c5459bz1.h();
                    C9455sH2 c9455sH2 = C9455sH2.a;
                    String k = C9455sH2.k(view);
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    String k2 = com.facebook.internal.l0.k(com.facebook.internal.l0.R0(k), "");
                    if (!C6562gT0.g(h, k) && !C6562gT0.g(h, k2)) {
                        return false;
                    }
                }
                if ((c5459bz1.f() & C5459bz1.b.DESCRIPTION.g()) > 0) {
                    String b = c5459bz1.b();
                    if (view.getContentDescription() == null) {
                        obj2 = "";
                    } else {
                        obj2 = view.getContentDescription().toString();
                    }
                    com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                    String k3 = com.facebook.internal.l0.k(com.facebook.internal.l0.R0(obj2), "");
                    if (!C6562gT0.g(b, obj2) && !C6562gT0.g(b, k3)) {
                        return false;
                    }
                }
                if ((c5459bz1.f() & C5459bz1.b.HINT.g()) > 0) {
                    String c = c5459bz1.c();
                    C9455sH2 c9455sH22 = C9455sH2.a;
                    String i2 = C9455sH2.i(view);
                    com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                    String k4 = com.facebook.internal.l0.k(com.facebook.internal.l0.R0(i2), "");
                    if (!C6562gT0.g(c, i2) && !C6562gT0.g(c, k4)) {
                        return false;
                    }
                }
                if ((c5459bz1.f() & C5459bz1.b.TAG.g()) > 0) {
                    String g = c5459bz1.g();
                    if (view.getTag() == null) {
                        obj = "";
                    } else {
                        obj = view.getTag().toString();
                    }
                    com.facebook.internal.l0 l0Var4 = com.facebook.internal.l0.a;
                    String k5 = com.facebook.internal.l0.k(com.facebook.internal.l0.R0(obj), "");
                    if (!C6562gT0.g(g, obj) && !C6562gT0.g(g, k5)) {
                        return false;
                    }
                }
                return true;
            }

            public a() {
            }
        }

        public c(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> hashSet, @NotNull String str) {
            C6562gT0.p(handler, "handler");
            C6562gT0.p(hashSet, "listenerSet");
            C6562gT0.p(str, "activityName");
            this.X = new WeakReference<>(view);
            this.Z = handler;
            this.Y0 = hashSet;
            this.Z0 = str;
            handler.postDelayed(this, 200L);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final List<b> f(@Nullable C2532Be0 c2532Be0, @Nullable View view, @NotNull List<C5459bz1> list, int i, int i2, @NotNull String str) {
            return a1.a(c2532Be0, view, list, i, i2, str);
        }

        public final void a(b bVar, View view, C2532Be0 c2532Be0) {
            if (c2532Be0 != null) {
                try {
                    View a2 = bVar.a();
                    if (a2 != null) {
                        C9455sH2 c9455sH2 = C9455sH2.a;
                        View a3 = C9455sH2.a(a2);
                        if (a3 != null && c9455sH2.p(a2, a3)) {
                            d(bVar, view, c2532Be0);
                            return;
                        }
                        String name = a2.getClass().getName();
                        C6562gT0.o(name, "view.javaClass.name");
                        if (!C9545sf2.J2(name, "com.facebook.react", false, 2, null)) {
                            if (!(a2 instanceof AdapterView)) {
                                b(bVar, view, c2532Be0);
                            } else if (a2 instanceof ListView) {
                                c(bVar, view, c2532Be0);
                            }
                        }
                    }
                } catch (Exception e) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(UE.c(), e);
                }
            }
        }

        public final void b(b bVar, View view, C2532Be0 c2532Be0) {
            boolean z;
            View a2 = bVar.a();
            if (a2 != null) {
                String b = bVar.b();
                C9455sH2 c9455sH2 = C9455sH2.a;
                View.OnClickListener g = C9455sH2.g(a2);
                if (g instanceof PE.a) {
                    if (g != null) {
                        if (((PE.a) g).a()) {
                            z = true;
                            if (this.Y0.contains(b) && !z) {
                                PE pe = PE.a;
                                a2.setOnClickListener(PE.b(c2532Be0, view, a2));
                                this.Y0.add(b);
                                return;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    }
                }
                z = false;
                if (this.Y0.contains(b)) {
                }
            }
        }

        public final void c(b bVar, View view, C2532Be0 c2532Be0) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String b = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof PE.b) {
                    if (onItemClickListener != null) {
                        if (((PE.b) onItemClickListener).a()) {
                            z = true;
                            if (this.Y0.contains(b) && !z) {
                                PE pe = PE.a;
                                adapterView.setOnItemClickListener(PE.c(c2532Be0, view, adapterView));
                                this.Y0.add(b);
                                return;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    }
                }
                z = false;
                if (this.Y0.contains(b)) {
                }
            }
        }

        public final void d(b bVar, View view, C2532Be0 c2532Be0) {
            boolean z;
            View a2 = bVar.a();
            if (a2 != null) {
                String b = bVar.b();
                C9455sH2 c9455sH2 = C9455sH2.a;
                View.OnTouchListener h = C9455sH2.h(a2);
                if (h instanceof C8256nN1.a) {
                    if (h != null) {
                        if (((C8256nN1.a) h).a()) {
                            z = true;
                            if (this.Y0.contains(b) && !z) {
                                C8256nN1 c8256nN1 = C8256nN1.a;
                                a2.setOnTouchListener(C8256nN1.a(c2532Be0, view, a2));
                                this.Y0.add(b);
                                return;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    }
                }
                z = false;
                if (this.Y0.contains(b)) {
                }
            }
        }

        public final void e(C2532Be0 c2532Be0, View view) {
            if (c2532Be0 != null && view != null) {
                String a2 = c2532Be0.a();
                if (a2 == null || a2.length() == 0 || C6562gT0.g(c2532Be0.a(), this.Z0)) {
                    List<C5459bz1> j = c2532Be0.j();
                    if (j.size() <= 25) {
                        for (b bVar : a1.a(c2532Be0, view, j, 0, -1, this.Z0)) {
                            a(bVar, view, c2532Be0);
                        }
                    }
                }
            }
        }

        public final void g() {
            int size;
            List<C2532Be0> list = this.Y;
            if (list != null && this.X.get() != null && list.size() - 1 >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    e(list.get(i), this.X.get());
                    if (i2 <= size) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            g();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        com.facebook.M m = com.facebook.M.a;
                        String o2 = com.facebook.M.o();
                        com.facebook.internal.C c = com.facebook.internal.C.a;
                        C2379y f = com.facebook.internal.C.f(o2);
                        if (f != null && f.c()) {
                            List<C2532Be0> b = C2532Be0.j.b(f.g());
                            this.Y = b;
                            if (b != null && (view = this.X.get()) != null) {
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.addOnGlobalLayoutListener(this);
                                    viewTreeObserver.addOnScrollChangedListener(this);
                                }
                                g();
                            }
                        }
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    public /* synthetic */ UE(C9516sY c9516sY) {
        this();
    }

    public static final /* synthetic */ UE b() {
        if (SQ.e(UE.class)) {
            return null;
        }
        try {
            return j;
        } catch (Throwable th) {
            SQ.c(th, UE.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (SQ.e(UE.class)) {
            return null;
        }
        try {
            return i;
        } catch (Throwable th) {
            SQ.c(th, UE.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(UE ue) {
        if (SQ.e(UE.class)) {
            return;
        }
        try {
            j = ue;
        } catch (Throwable th) {
            SQ.c(th, UE.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized UE g() {
        synchronized (UE.class) {
            if (SQ.e(UE.class)) {
                return null;
            }
            return f.a();
        }
    }

    @InterfaceC6184ey2
    @InterfaceC9511sW0
    @NotNull
    public static final Bundle h(@Nullable C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
        if (SQ.e(UE.class)) {
            return null;
        }
        try {
            return f.b(c2532Be0, view, view2);
        } catch (Throwable th) {
            SQ.c(th, UE.class);
            return null;
        }
    }

    public static final void l(UE ue) {
        if (SQ.e(UE.class)) {
            return;
        }
        try {
            C6562gT0.p(ue, "this$0");
            ue.i();
        } catch (Throwable th) {
            SQ.c(th, UE.class);
        }
    }

    @InterfaceC6184ey2
    public final void e(@NotNull Activity activity) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                com.facebook.internal.S s = com.facebook.internal.S.a;
                if (com.facebook.internal.S.b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.add(activity);
                    this.d.clear();
                    HashSet<String> hashSet = this.e.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        this.d = hashSet;
                    }
                    k();
                    return;
                }
                throw new C2416z("Can't add activity to CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC6184ey2
    public final void f(@NotNull Activity activity) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            this.e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void i() {
        if (!SQ.e(this)) {
            try {
                for (Activity activity : this.b) {
                    if (activity != null) {
                        C5370bd c5370bd = C5370bd.a;
                        View e = C5370bd.e(activity);
                        String simpleName = activity.getClass().getSimpleName();
                        Handler handler = this.a;
                        HashSet<String> hashSet = this.d;
                        C6562gT0.o(simpleName, "activityName");
                        this.c.add(new c(e, handler, hashSet, simpleName));
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC6184ey2
    public final void j(@NotNull Activity activity) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                com.facebook.internal.S s = com.facebook.internal.S.a;
                if (com.facebook.internal.S.b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.remove(activity);
                    this.c.clear();
                    this.e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.d.clone());
                    this.d.clear();
                    return;
                }
                throw new C2416z("Can't remove activity from CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void k() {
        if (SQ.e(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                i();
            } else {
                this.a.post(new Runnable() { // from class: o.TE
                    @Override // java.lang.Runnable
                    public final void run() {
                        UE.l(UE.this);
                    }
                });
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public UE() {
        this.a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C6562gT0.o(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet<>();
        this.e = new HashMap<>();
    }
}
