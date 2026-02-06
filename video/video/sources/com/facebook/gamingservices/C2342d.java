package com.facebook.gamingservices;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.Y;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2364i;
import com.facebook.internal.C2367l;
import com.facebook.internal.Z;
import com.facebook.internal.c0;
import java.util.Collection;
import java.util.List;
import o.C10169vE;
import o.C6562gT0;
import o.C7458kA2;
import o.C8222nF;
import o.C9472sM;
import o.C9516sY;
import o.C9998uW1;
import o.D32;
import o.EnumC10487wW1;
import o.WT1;
import o.XT;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.gamingservices.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2342d extends AbstractC2368m<C9472sM, C0081d> {
    @NotNull
    public static final b j = new b(null);
    public static final int k = C2361f.c.GamingContextChoose.g();
    @NotNull
    public static final String l = "context_choose";
    @Nullable
    public InterfaceC2411u<C0081d> i;

    /* renamed from: com.facebook.gamingservices.d$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractC2368m<C9472sM, C0081d>.b {
        public final /* synthetic */ C2342d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2342d c2342d) {
            super(c2342d);
            C6562gT0.p(c2342d, "this$0");
            this.c = c2342d;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull C9472sM c9472sM, boolean z) {
            C6562gT0.p(c9472sM, "content");
            C2364i c2364i = C2364i.a;
            if (C2364i.a() != null) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@NotNull C9472sM c9472sM) {
            String h;
            C6562gT0.p(c9472sM, "content");
            C2357b m = this.c.m();
            C0376a i = C0376a.g1.i();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = new Bundle();
            if (i == null) {
                h = null;
            } else {
                h = i.h();
            }
            if (h == null) {
                com.facebook.M m2 = com.facebook.M.a;
                h = com.facebook.M.o();
            }
            bundle.putString("app_id", h);
            if (c9472sM.c() != null) {
                bundle3.putString("min_size", c9472sM.c().toString());
            }
            if (c9472sM.b() != null) {
                bundle3.putString("max_size", c9472sM.b().toString());
            }
            if (c9472sM.a() != null) {
                bundle3.putString("filters", new JSONArray((Collection) c9472sM.a()).toString());
            }
            bundle2.putString("filters", bundle3.toString());
            bundle.putString("payload", bundle2.toString());
            C2364i c2364i = C2364i.a;
            bundle.putString(c0.w, C2364i.b());
            C2367l c2367l = C2367l.a;
            C2367l.l(m, C2342d.l, bundle);
            return m;
        }
    }

    /* renamed from: com.facebook.gamingservices.d$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: com.facebook.gamingservices.d$c */
    /* loaded from: classes2.dex */
    public final class c extends AbstractC2368m<C9472sM, C0081d>.b {
        public final /* synthetic */ C2342d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2342d c2342d) {
            super(c2342d);
            C6562gT0.p(c2342d, "this$0");
            this.c = c2342d;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull C9472sM c9472sM, boolean z) {
            PackageManager packageManager;
            ComponentName resolveActivity;
            boolean z2;
            boolean z3;
            C6562gT0.p(c9472sM, "content");
            Activity n = this.c.n();
            String str = null;
            if (n == null) {
                packageManager = null;
            } else {
                packageManager = n.getPackageManager();
            }
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            if (packageManager == null) {
                resolveActivity = null;
            } else {
                resolveActivity = intent.resolveActivity(packageManager);
            }
            if (resolveActivity != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0376a i = C0376a.g1.i();
            if (i != null) {
                str = i.s();
            }
            if (str != null && C6562gT0.g(com.facebook.M.P, i.s())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 || !z3) {
                return false;
            }
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@NotNull C9472sM c9472sM) {
            C6562gT0.p(c9472sM, "content");
            C2357b m = this.c.m();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            C0376a i = C0376a.g1.i();
            Bundle bundle = new Bundle();
            bundle.putString(C9998uW1.o0, "CONTEXT_CHOOSE");
            if (i != null) {
                bundle.putString("game_id", i.h());
            } else {
                com.facebook.M m2 = com.facebook.M.a;
                bundle.putString("game_id", com.facebook.M.o());
            }
            if (c9472sM.c() != null) {
                bundle.putString("min_thread_size", c9472sM.c().toString());
            }
            if (c9472sM.b() != null) {
                bundle.putString("max_thread_size", c9472sM.b().toString());
            }
            if (c9472sM.a() != null) {
                bundle.putString("filters", new JSONArray((Collection) c9472sM.a()).toString());
            }
            Z z = Z.a;
            Z.E(intent, m.d().toString(), "", Z.y(), bundle);
            m.i(intent);
            return m;
        }
    }

    /* renamed from: com.facebook.gamingservices.d$e */
    /* loaded from: classes2.dex */
    public static final class e extends WT1 {
        public final /* synthetic */ InterfaceC2411u<C0081d> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2411u<C0081d> interfaceC2411u) {
            super(interfaceC2411u);
            this.b = interfaceC2411u;
        }

        @Override // o.WT1
        public void c(@NotNull C2357b c2357b, @Nullable Bundle bundle) {
            C6562gT0.p(c2357b, "appCall");
            if (bundle != null) {
                if (bundle.getString("error_message") != null) {
                    this.b.b(new C2416z(bundle.getString("error_message")));
                    return;
                }
                String string = bundle.getString("id");
                if (string != null) {
                    C2352n.b.b(new C2352n(string));
                    this.b.a(new C0081d(bundle));
                }
                this.b.b(new C2416z(bundle.getString("Invalid response received from server.")));
                return;
            }
            a(c2357b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342d(@NotNull Activity activity) {
        super(activity, k);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    public static final boolean C(C2342d c2342d, e eVar, int i, Intent intent) {
        C6562gT0.p(c2342d, "this$0");
        C6562gT0.p(eVar, "$resultProcessor");
        D32 d32 = D32.a;
        return D32.q(c2342d.q(), i, intent, eVar);
    }

    public static final void E(C2342d c2342d, Y y) {
        C7458kA2 c7458kA2;
        C6562gT0.p(c2342d, "this$0");
        InterfaceC2411u<C0081d> interfaceC2411u = c2342d.i;
        if (interfaceC2411u != null) {
            com.facebook.C g = y.g();
            if (g == null) {
                c7458kA2 = null;
            } else {
                interfaceC2411u.b(new C2416z(g.h()));
                c7458kA2 = C7458kA2.a;
            }
            if (c7458kA2 == null) {
                C6562gT0.o(y, "response");
                interfaceC2411u.a(new C0081d(y));
            }
        }
    }

    @Override // com.facebook.internal.AbstractC2368m, com.facebook.InterfaceC2413w
    /* renamed from: B */
    public boolean g(@NotNull C9472sM c9472sM) {
        C6562gT0.p(c9472sM, "content");
        if (C10169vE.f() || new c(this).a(c9472sM, true) || new a(this).a(c9472sM, true)) {
            return true;
        }
        return false;
    }

    public final void D(C9472sM c9472sM) {
        C0376a i = C0376a.g1.i();
        if (i != null && !i.C()) {
            XT.c cVar = new XT.c() { // from class: com.facebook.gamingservices.c
                @Override // o.XT.c
                public final void a(Y y) {
                    C2342d.E(C2342d.this, y);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("filters", c9472sM.a());
                jSONObject.put(C9998uW1.V, c9472sM.c());
                List<String> a2 = c9472sM.a();
                if (a2 != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : a2) {
                        jSONArray.put(str);
                    }
                    jSONObject.put("filters", jSONArray);
                }
                XT.m(n(), jSONObject, cVar, EnumC10487wW1.CONTEXT_CHOOSE);
                return;
            } catch (JSONException unused) {
                InterfaceC2411u<C0081d> interfaceC2411u = this.i;
                if (interfaceC2411u != null) {
                    interfaceC2411u.b(new C2416z("Couldn't prepare Context Choose Dialog"));
                    return;
                }
                return;
            }
        }
        throw new C2416z("Attempted to open ContextChooseContent with an invalid access token");
    }

    @Override // com.facebook.internal.AbstractC2368m
    /* renamed from: F */
    public void w(@NotNull C9472sM c9472sM, @NotNull Object obj) {
        C6562gT0.p(c9472sM, "content");
        C6562gT0.p(obj, "mode");
        if (C10169vE.f()) {
            D(c9472sM);
        } else {
            super.w(c9472sM, obj);
        }
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public C2357b m() {
        return new C2357b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public List<AbstractC2368m<C9472sM, C0081d>.b> p() {
        return C8222nF.O(new c(this), new a(this));
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<C0081d> interfaceC2411u) {
        C6562gT0.p(c2361f, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        this.i = interfaceC2411u;
        final e eVar = new e(interfaceC2411u);
        c2361f.b(q(), new C2361f.a() { // from class: com.facebook.gamingservices.b
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i, Intent intent) {
                boolean C;
                C = C2342d.C(C2342d.this, eVar, i, intent);
                return C;
            }
        });
    }

    /* renamed from: com.facebook.gamingservices.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0081d {
        @Nullable
        public String a;

        public C0081d(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "results");
            this.a = bundle.getString("id");
        }

        @Nullable
        public final String a() {
            return this.a;
        }

        public final void b(@Nullable String str) {
            this.a = str;
        }

        public C0081d(@NotNull Y y) {
            JSONObject optJSONObject;
            C6562gT0.p(y, "response");
            try {
                JSONObject i = y.i();
                if (i == null || (optJSONObject = i.optJSONObject("data")) == null) {
                    return;
                }
                b(optJSONObject.getString("id"));
            } catch (JSONException unused) {
                this.a = null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2342d(@NotNull Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2342d(@NotNull android.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    public C2342d(com.facebook.internal.I i) {
        super(i, k);
    }
}
