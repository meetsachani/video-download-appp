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
import com.facebook.internal.C2367l;
import com.facebook.internal.Z;
import java.util.List;
import o.C10169vE;
import o.C10447wM;
import o.C6562gT0;
import o.C7458kA2;
import o.C8222nF;
import o.C9516sY;
import o.C9998uW1;
import o.D32;
import o.EnumC10487wW1;
import o.WT1;
import o.XT;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.gamingservices.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2345g extends AbstractC2368m<C10447wM, c> {
    @NotNull
    public static final a j = new a(null);
    public static final int k = C2361f.c.GamingContextCreate.g();
    @Nullable
    public InterfaceC2411u<c> i;

    /* renamed from: com.facebook.gamingservices.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.gamingservices.g$b */
    /* loaded from: classes2.dex */
    public final class b extends AbstractC2368m<C10447wM, c>.b {
        public final /* synthetic */ C2345g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2345g c2345g) {
            super(c2345g);
            C6562gT0.p(c2345g, "this$0");
            this.c = c2345g;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull C10447wM c10447wM, boolean z) {
            PackageManager packageManager;
            ComponentName resolveActivity;
            boolean z2;
            boolean z3;
            C6562gT0.p(c10447wM, "content");
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
        public C2357b b(@NotNull C10447wM c10447wM) {
            C6562gT0.p(c10447wM, "content");
            C2357b m = this.c.m();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            C0376a i = C0376a.g1.i();
            Bundle bundle = new Bundle();
            bundle.putString(C9998uW1.o0, "CONTEXT_CREATE");
            if (i != null) {
                bundle.putString("game_id", i.h());
            } else {
                com.facebook.M m2 = com.facebook.M.a;
                bundle.putString("game_id", com.facebook.M.o());
            }
            if (c10447wM.a() != null) {
                bundle.putString("player_id", c10447wM.a());
            }
            Z z = Z.a;
            Z.E(intent, m.d().toString(), "", Z.y(), bundle);
            m.i(intent);
            return m;
        }
    }

    /* renamed from: com.facebook.gamingservices.g$d */
    /* loaded from: classes2.dex */
    public final class d extends AbstractC2368m<C10447wM, c>.b {
        public final /* synthetic */ C2345g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2345g c2345g) {
            super(c2345g);
            C6562gT0.p(c2345g, "this$0");
            this.c = c2345g;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull C10447wM c10447wM, boolean z) {
            C6562gT0.p(c10447wM, "content");
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@NotNull C10447wM c10447wM) {
            C6562gT0.p(c10447wM, "content");
            C2357b m = this.c.m();
            Bundle bundle = new Bundle();
            bundle.putString("player_id", c10447wM.a());
            C0376a i = C0376a.g1.i();
            if (i != null) {
                bundle.putString("dialog_access_token", i.x());
            }
            C2367l c2367l = C2367l.a;
            C2367l.p(m, "context", bundle);
            return m;
        }
    }

    /* renamed from: com.facebook.gamingservices.g$e */
    /* loaded from: classes2.dex */
    public static final class e extends WT1 {
        public final /* synthetic */ InterfaceC2411u<c> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2411u<c> interfaceC2411u) {
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
                String string2 = bundle.getString(C9998uW1.Y);
                if (string != null) {
                    C2352n.b.b(new C2352n(string));
                    this.b.a(new c(string));
                } else if (string2 != null) {
                    C2352n.b.b(new C2352n(string2));
                    this.b.a(new c(string2));
                }
                this.b.b(new C2416z(bundle.getString("Invalid response received from server.")));
                return;
            }
            a(c2357b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2345g(@NotNull Activity activity) {
        super(activity, k);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    public static final boolean C(C2345g c2345g, WT1 wt1, int i, Intent intent) {
        C6562gT0.p(c2345g, "this$0");
        C6562gT0.p(wt1, "$resultProcessor");
        D32 d32 = D32.a;
        return D32.q(c2345g.q(), i, intent, wt1);
    }

    public static final void E(C2345g c2345g, Y y) {
        C7458kA2 c7458kA2;
        C6562gT0.p(c2345g, "this$0");
        InterfaceC2411u<c> interfaceC2411u = c2345g.i;
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
                interfaceC2411u.a(new c(y));
            }
        }
    }

    @Override // com.facebook.internal.AbstractC2368m, com.facebook.InterfaceC2413w
    /* renamed from: B */
    public boolean g(@NotNull C10447wM c10447wM) {
        C6562gT0.p(c10447wM, "content");
        if (C10169vE.f() || new b(this).a(c10447wM, true) || new d(this).a(c10447wM, true)) {
            return true;
        }
        return false;
    }

    public final void D(C10447wM c10447wM) {
        C0376a i = C0376a.g1.i();
        if (i != null && !i.C()) {
            XT.c cVar = new XT.c() { // from class: com.facebook.gamingservices.f
                @Override // o.XT.c
                public final void a(Y y) {
                    C2345g.E(C2345g.this, y);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                if (c10447wM.a() != null) {
                    jSONObject.put("id", c10447wM.a());
                }
                XT.m(n(), jSONObject, cVar, EnumC10487wW1.CONTEXT_CREATE);
                return;
            } catch (JSONException unused) {
                InterfaceC2411u<c> interfaceC2411u = this.i;
                if (interfaceC2411u != null) {
                    interfaceC2411u.b(new C2416z("Couldn't prepare Context Create Dialog"));
                    return;
                }
                return;
            }
        }
        throw new C2416z("Attempted to open ContextCreateContent with an invalid access token");
    }

    @Override // com.facebook.internal.AbstractC2368m
    /* renamed from: F */
    public void w(@NotNull C10447wM c10447wM, @NotNull Object obj) {
        C6562gT0.p(c10447wM, "content");
        C6562gT0.p(obj, "mode");
        if (C10169vE.f()) {
            D(c10447wM);
        } else {
            super.w(c10447wM, obj);
        }
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public C2357b m() {
        return new C2357b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public List<AbstractC2368m<C10447wM, c>.b> p() {
        return C8222nF.O(new b(this), new d(this));
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<c> interfaceC2411u) {
        C6562gT0.p(c2361f, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        this.i = interfaceC2411u;
        final e eVar = new e(interfaceC2411u);
        c2361f.b(q(), new C2361f.a() { // from class: com.facebook.gamingservices.e
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i, Intent intent) {
                boolean C;
                C = C2345g.C(C2345g.this, eVar, i, intent);
                return C;
            }
        });
    }

    /* renamed from: com.facebook.gamingservices.g$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @Nullable
        public String a;

        public c(@NotNull String str) {
            C6562gT0.p(str, "contextID");
            this.a = str;
        }

        @Nullable
        public final String a() {
            return this.a;
        }

        public final void b(@Nullable String str) {
            this.a = str;
        }

        public c(@NotNull Y y) {
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
    public C2345g(@NotNull Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2345g(@NotNull android.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    public C2345g(com.facebook.internal.I i) {
        super(i, k);
    }
}
