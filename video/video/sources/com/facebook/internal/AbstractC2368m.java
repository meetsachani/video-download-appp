package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.C2416z;
import com.facebook.InterfaceC2407p;
import com.facebook.InterfaceC2411u;
import com.facebook.InterfaceC2413w;
import com.facebook.internal.V;
import java.util.Iterator;
import java.util.List;
import o.AbstractC5244b6;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5486c6;
import o.InterfaceC7058iW0;
import o.O5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2368m<CONTENT, RESULT> implements InterfaceC2413w<CONTENT, RESULT> {
    @NotNull
    public static final String g = "FacebookDialog";
    @Nullable
    public final Activity a;
    @Nullable
    public final I b;
    @Nullable
    public List<? extends AbstractC2368m<CONTENT, RESULT>.b> c;
    public int d;
    @Nullable
    public InterfaceC2407p e;
    @NotNull
    public static final a f = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Object h = new Object();

    /* renamed from: com.facebook.internal.m$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.internal.m$b */
    /* loaded from: classes2.dex */
    public abstract class b {
        @NotNull
        public Object a;
        public final /* synthetic */ AbstractC2368m<CONTENT, RESULT> b;

        public b(AbstractC2368m abstractC2368m) {
            C6562gT0.p(abstractC2368m, "this$0");
            this.b = abstractC2368m;
            this.a = AbstractC2368m.h;
        }

        public abstract boolean a(CONTENT content, boolean z);

        @Nullable
        public abstract C2357b b(CONTENT content);

        @NotNull
        public Object c() {
            return this.a;
        }

        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.a = obj;
        }
    }

    /* renamed from: com.facebook.internal.m$c */
    /* loaded from: classes2.dex */
    public static final class c extends O5<CONTENT, InterfaceC2407p.a> {
        public final /* synthetic */ AbstractC2368m<CONTENT, RESULT> a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ InterfaceC2407p c;

        public c(AbstractC2368m<CONTENT, RESULT> abstractC2368m, Object obj, InterfaceC2407p interfaceC2407p) {
            this.a = abstractC2368m;
            this.b = obj;
            this.c = interfaceC2407p;
        }

        @Override // o.O5
        @NotNull
        public Intent a(@NotNull Context context, CONTENT content) {
            Intent f;
            C6562gT0.p(context, "context");
            C2357b l = this.a.l(content, this.b);
            if (l == null) {
                f = null;
            } else {
                f = l.f();
            }
            if (f != null) {
                l.g();
                return f;
            }
            throw new C2416z("Content " + content + " is not supported");
        }

        @Override // o.O5
        @NotNull
        /* renamed from: d */
        public InterfaceC2407p.a c(int i, @Nullable Intent intent) {
            InterfaceC2407p interfaceC2407p = this.c;
            if (interfaceC2407p != null) {
                interfaceC2407p.onActivityResult(this.a.q(), i, intent);
            }
            return new InterfaceC2407p.a(this.a.q(), i, intent);
        }
    }

    public AbstractC2368m(@NotNull Activity activity, int i) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        this.a = activity;
        this.b = null;
        this.d = i;
        this.e = null;
    }

    @Override // com.facebook.InterfaceC2413w
    @NotNull
    public O5<CONTENT, InterfaceC2407p.a> b(@Nullable InterfaceC2407p interfaceC2407p) {
        return k(interfaceC2407p, h);
    }

    @Override // com.facebook.InterfaceC2413w
    public void c(@NotNull InterfaceC2407p interfaceC2407p, @NotNull InterfaceC2411u<RESULT> interfaceC2411u, int i) {
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        r(interfaceC2407p);
        v(i);
        d(interfaceC2407p, interfaceC2411u);
    }

    @Override // com.facebook.InterfaceC2413w
    public void d(@NotNull InterfaceC2407p interfaceC2407p, @NotNull InterfaceC2411u<RESULT> interfaceC2411u) {
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        if (interfaceC2407p instanceof C2361f) {
            r(interfaceC2407p);
            s((C2361f) interfaceC2407p, interfaceC2411u);
            return;
        }
        throw new C2416z("Unexpected CallbackManager, please use the provided Factory.");
    }

    @Override // com.facebook.InterfaceC2413w
    public void f(CONTENT content) {
        w(content, h);
    }

    @Override // com.facebook.InterfaceC2413w
    public boolean g(CONTENT content) {
        return j(content, h);
    }

    public final List<AbstractC2368m<CONTENT, RESULT>.b> i() {
        if (this.c == null) {
            this.c = p();
        }
        List list = (List<? extends AbstractC2368m<CONTENT, RESULT>.b>) this.c;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    public boolean j(CONTENT content, @NotNull Object obj) {
        boolean z;
        C6562gT0.p(obj, "mode");
        if (obj == h) {
            z = true;
        } else {
            z = false;
        }
        for (AbstractC2368m<CONTENT, RESULT>.b bVar : i()) {
            if (!z) {
                l0 l0Var = l0.a;
                if (!l0.e(bVar.c(), obj)) {
                    continue;
                }
            }
            if (bVar.a(content, false)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final O5<CONTENT, InterfaceC2407p.a> k(@Nullable InterfaceC2407p interfaceC2407p, @NotNull Object obj) {
        C6562gT0.p(obj, "mode");
        return new c(this, obj, interfaceC2407p);
    }

    public final C2357b l(CONTENT content, Object obj) {
        boolean z;
        C2357b c2357b;
        if (obj == h) {
            z = true;
        } else {
            z = false;
        }
        Iterator<AbstractC2368m<CONTENT, RESULT>.b> it = i().iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC2368m<CONTENT, RESULT>.b next = it.next();
                if (!z) {
                    l0 l0Var = l0.a;
                    if (!l0.e(next.c(), obj)) {
                        continue;
                    }
                }
                if (next.a(content, true)) {
                    try {
                        c2357b = next.b(content);
                        break;
                    } catch (C2416z e) {
                        C2357b m = m();
                        C2367l c2367l = C2367l.a;
                        C2367l.o(m, e);
                        c2357b = m;
                    }
                }
            } else {
                c2357b = null;
                break;
            }
        }
        if (c2357b == null) {
            C2357b m2 = m();
            C2367l c2367l2 = C2367l.a;
            C2367l.k(m2);
            return m2;
        }
        return c2357b;
    }

    @NotNull
    public abstract C2357b m();

    @Nullable
    public final Activity n() {
        Activity activity = this.a;
        if (activity == null) {
            I i = this.b;
            if (i == null) {
                return null;
            }
            return i.a();
        }
        return activity;
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @Nullable
    public final InterfaceC2407p o() {
        return this.e;
    }

    @NotNull
    public abstract List<AbstractC2368m<CONTENT, RESULT>.b> p();

    public final int q() {
        return this.d;
    }

    public final void r(InterfaceC2407p interfaceC2407p) {
        InterfaceC2407p interfaceC2407p2 = this.e;
        if (interfaceC2407p2 == null) {
            this.e = interfaceC2407p;
        } else if (interfaceC2407p2 != interfaceC2407p) {
            Log.w(g, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public abstract void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<RESULT> interfaceC2411u);

    public final void t(@Nullable InterfaceC2407p interfaceC2407p) {
        this.e = interfaceC2407p;
    }

    public final void u(@Nullable InterfaceC2407p interfaceC2407p) {
        this.e = interfaceC2407p;
    }

    public final void v(int i) {
        com.facebook.M m = com.facebook.M.a;
        if (!com.facebook.M.L(i)) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException(("Request code " + i + " cannot be within the range reserved by the Facebook SDK.").toString());
    }

    public void w(CONTENT content, @NotNull Object obj) {
        C6562gT0.p(obj, "mode");
        C2357b l = l(content, obj);
        if (l != null) {
            if (n() instanceof InterfaceC5486c6) {
                Activity n = n();
                if (n != null) {
                    C2367l c2367l = C2367l.a;
                    AbstractC5244b6 x = ((InterfaceC5486c6) n).x();
                    C6562gT0.o(x, "registryOwner.activityResultRegistry");
                    C2367l.j(l, x, this.e);
                    l.g();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            I i = this.b;
            if (i != null) {
                C2367l c2367l2 = C2367l.a;
                C2367l.i(l, i);
                return;
            }
            Activity activity = this.a;
            if (activity != null) {
                C2367l c2367l3 = C2367l.a;
                C2367l.h(l, activity);
                return;
            }
            return;
        }
        Log.e(g, "No code path should ever result in a null appCall");
        com.facebook.M m = com.facebook.M.a;
        if (!com.facebook.M.K()) {
            return;
        }
        throw new IllegalStateException("No code path should ever result in a null appCall");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(@NotNull Intent intent, int i) {
        String str;
        C6562gT0.p(intent, C9998uW1.R);
        Activity n = n();
        if (n instanceof InterfaceC5486c6) {
            C2367l c2367l = C2367l.a;
            AbstractC5244b6 x = ((InterfaceC5486c6) n).x();
            C6562gT0.o(x, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            C2367l.r(x, this.e, intent, i);
        } else if (n != null) {
            n.startActivityForResult(intent, i);
        } else {
            I i2 = this.b;
            if (i2 != null) {
                i2.d(intent, i);
            } else {
                str = "Failed to find Activity or Fragment to startActivityForResult ";
                if (str == null) {
                    V.a aVar = V.e;
                    com.facebook.b0 b0Var = com.facebook.b0.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    C6562gT0.o(name, "this.javaClass.name");
                    aVar.b(b0Var, 6, name, str);
                    return;
                }
                return;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public AbstractC2368m(@NotNull I i, int i2) {
        C6562gT0.p(i, "fragmentWrapper");
        this.b = i;
        this.a = null;
        this.d = i2;
        if (i.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }

    public AbstractC2368m(int i) {
        this.d = i;
        this.a = null;
        this.b = null;
    }
}
