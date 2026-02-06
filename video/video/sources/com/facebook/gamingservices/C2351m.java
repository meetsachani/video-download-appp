package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
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
import com.facebook.internal.m0;
import java.util.ArrayList;
import java.util.List;
import o.C10169vE;
import o.C10408wC0;
import o.C10894yC0;
import o.C9642t32;
import o.C9755tW1;
import o.C9998uW1;
import o.D32;
import o.EnumC10487wW1;
import o.MJ2;
import o.WT1;
import o.XT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.gamingservices.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2351m extends AbstractC2368m<C10408wC0, f> {
    public static final String j = "apprequests";
    public static final int k = C2361f.c.GameRequest.g();
    public InterfaceC2411u i;

    /* renamed from: com.facebook.gamingservices.m$a */
    /* loaded from: classes2.dex */
    public class a extends WT1 {
        public final /* synthetic */ InterfaceC2411u b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2411u appCallback, final InterfaceC2411u val$callback) {
            super(appCallback);
            this.b = val$callback;
        }

        @Override // o.WT1
        public void c(C2357b appCall, Bundle results) {
            if (results != null) {
                this.b.a(new f(results, (a) null));
            } else {
                a(appCall);
            }
        }
    }

    /* renamed from: com.facebook.gamingservices.m$b */
    /* loaded from: classes2.dex */
    public class b implements C2361f.a {
        public final /* synthetic */ WT1 a;

        public b(final WT1 val$resultProcessor) {
            this.a = val$resultProcessor;
        }

        @Override // com.facebook.internal.C2361f.a
        public boolean a(int resultCode, Intent data) {
            return D32.q(C2351m.this.q(), resultCode, data, this.a);
        }
    }

    /* renamed from: com.facebook.gamingservices.m$c */
    /* loaded from: classes2.dex */
    public class c implements XT.c {
        public c() {
        }

        @Override // o.XT.c
        public void a(Y response) {
            if (C2351m.this.i != null) {
                if (response.g() != null) {
                    C2351m.this.i.b(new C2416z(response.g().h()));
                } else {
                    C2351m.this.i.a(new f(response, (a) null));
                }
            }
        }
    }

    /* renamed from: com.facebook.gamingservices.m$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractC2368m<C10408wC0, f>.b {
        public d() {
            super(C2351m.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final C10408wC0 content, boolean isBestEffort) {
            if (C2364i.a() != null && m0.h(C2351m.this.n(), C2364i.b())) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final C10408wC0 content) {
            C10894yC0.a(content);
            C2357b m = C2351m.this.m();
            Bundle b = MJ2.b(content);
            C0376a k = C0376a.k();
            if (k != null) {
                b.putString("app_id", k.h());
            } else {
                b.putString("app_id", com.facebook.M.o());
            }
            b.putString(c0.w, C2364i.b());
            C2367l.l(m, "apprequests", b);
            return m;
        }

        public /* synthetic */ d(C2351m c2351m, a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.gamingservices.m$e */
    /* loaded from: classes2.dex */
    public class e extends AbstractC2368m<C10408wC0, f>.b {
        public e() {
            super(C2351m.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final C10408wC0 content, boolean isBestEffort) {
            boolean z;
            boolean z2;
            PackageManager packageManager = C2351m.this.n().getPackageManager();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            if (intent.resolveActivity(packageManager) != null) {
                z = true;
            } else {
                z = false;
            }
            C0376a k = C0376a.k();
            if (k != null && k.s() != null && com.facebook.M.P.equals(k.s())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final C10408wC0 content) {
            String str;
            C2357b m = C2351m.this.m();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            C0376a k = C0376a.k();
            Bundle bundle = new Bundle();
            bundle.putString(C9998uW1.o0, "GAME_REQUESTS");
            if (k != null) {
                bundle.putString("app_id", k.h());
            } else {
                bundle.putString("app_id", com.facebook.M.o());
            }
            if (content.a() != null) {
                str = content.a().name();
            } else {
                str = null;
            }
            bundle.putString(C9998uW1.g0, str);
            bundle.putString("message", content.e());
            bundle.putString("title", content.k());
            bundle.putString("data", content.c());
            bundle.putString("cta", content.b());
            content.g();
            JSONArray jSONArray = new JSONArray();
            if (content.g() != null) {
                for (String str2 : content.g()) {
                    jSONArray.put(str2);
                }
            }
            bundle.putString("to", jSONArray.toString());
            Z.E(intent, m.d().toString(), "", Z.y(), bundle);
            m.i(intent);
            return m;
        }

        public /* synthetic */ e(C2351m c2351m, a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.gamingservices.m$f */
    /* loaded from: classes2.dex */
    public static final class f {
        public String a;
        public List<String> b;

        public /* synthetic */ f(Bundle bundle, a aVar) {
            this(bundle);
        }

        public String a() {
            return this.a;
        }

        public List<String> b() {
            return this.b;
        }

        public /* synthetic */ f(Y y, a aVar) {
            this(y);
        }

        public f(Bundle results) {
            this.a = results.getString("request");
            this.b = new ArrayList();
            while (results.containsKey(String.format(C9642t32.w, Integer.valueOf(this.b.size())))) {
                List<String> list = this.b;
                list.add(results.getString(String.format(C9642t32.w, Integer.valueOf(list.size()))));
            }
        }

        public f(Y response) {
            try {
                JSONObject i = response.i();
                JSONObject optJSONObject = i.optJSONObject("data");
                i = optJSONObject != null ? optJSONObject : i;
                this.a = i.getString(C9755tW1.f875o);
                this.b = new ArrayList();
                JSONArray jSONArray = i.getJSONArray("to");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.b.add(jSONArray.getString(i2));
                }
            } catch (JSONException unused) {
                this.a = null;
                this.b = new ArrayList();
            }
        }
    }

    /* renamed from: com.facebook.gamingservices.m$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractC2368m<C10408wC0, f>.b {
        public g() {
            super(C2351m.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final C10408wC0 content, boolean isBestEffort) {
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final C10408wC0 content) {
            C10894yC0.a(content);
            C2357b m = C2351m.this.m();
            C2367l.p(m, "apprequests", MJ2.b(content));
            return m;
        }

        public /* synthetic */ g(C2351m c2351m, a aVar) {
            this();
        }
    }

    public C2351m(Activity activity) {
        super(activity, k);
    }

    public static boolean B() {
        return true;
    }

    public static void C(final Activity activity, final C10408wC0 gameRequestContent) {
        new C2351m(activity).f(gameRequestContent);
    }

    public static void D(final Fragment fragment, final C10408wC0 gameRequestContent) {
        F(new com.facebook.internal.I(fragment), gameRequestContent);
    }

    public static void E(final androidx.fragment.app.Fragment fragment, final C10408wC0 gameRequestContent) {
        F(new com.facebook.internal.I(fragment), gameRequestContent);
    }

    public static void F(final com.facebook.internal.I fragmentWrapper, final C10408wC0 gameRequestContent) {
        new C2351m(fragmentWrapper).f(gameRequestContent);
    }

    public final void G(final C10408wC0 content, final Object mode) {
        String str;
        Activity n = n();
        C0376a k2 = C0376a.k();
        if (k2 != null && !k2.C()) {
            c cVar = new c();
            String h = k2.h();
            if (content.a() != null) {
                str = content.a().name();
            } else {
                str = null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject.put(C9998uW1.f886o, h);
                jSONObject.put(C9998uW1.g0, str);
                jSONObject.put("message", content.e());
                jSONObject.put("cta", content.b());
                jSONObject.put("title", content.k());
                jSONObject.put("data", content.c());
                jSONObject.put(C9998uW1.m0, content.d());
                if (content.g() != null) {
                    for (String str2 : content.g()) {
                        jSONArray.put(str2);
                    }
                }
                jSONObject.put("to", jSONArray);
                XT.m(n, jSONObject, cVar, EnumC10487wW1.OPEN_GAME_REQUESTS_DIALOG);
                return;
            } catch (JSONException unused) {
                InterfaceC2411u interfaceC2411u = this.i;
                if (interfaceC2411u != null) {
                    interfaceC2411u.b(new C2416z("Couldn't prepare Game Request Dialog"));
                    return;
                }
                return;
            }
        }
        throw new C2416z("Attempted to open GameRequestDialog with an invalid access token");
    }

    @Override // com.facebook.internal.AbstractC2368m
    /* renamed from: H */
    public void w(final C10408wC0 content, final Object mode) {
        if (C10169vE.f()) {
            G(content, mode);
        } else {
            super.w(content, mode);
        }
    }

    @Override // com.facebook.internal.AbstractC2368m
    public C2357b m() {
        return new C2357b(q());
    }

    @Override // com.facebook.internal.AbstractC2368m
    public List<AbstractC2368m<C10408wC0, f>.b> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(this, null));
        arrayList.add(new d(this, null));
        arrayList.add(new g(this, null));
        return arrayList;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(final C2361f callbackManager, final InterfaceC2411u<f> callback) {
        a aVar;
        this.i = callback;
        if (callback == null) {
            aVar = null;
        } else {
            aVar = new a(callback, callback);
        }
        callbackManager.b(q(), new b(aVar));
    }

    public C2351m(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    public C2351m(Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    public C2351m(com.facebook.internal.I fragmentWrapper) {
        super(fragmentWrapper, k);
    }
}
