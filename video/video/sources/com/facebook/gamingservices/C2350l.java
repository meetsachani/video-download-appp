package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.Y;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import java.util.List;
import o.C10169vE;
import o.C9998uW1;
import o.EnumC10487wW1;
import o.InterfaceC4907Zh;
import o.XT;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC4907Zh
/* renamed from: com.facebook.gamingservices.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2350l extends AbstractC2368m<Void, c> {
    public static final int j = C2361f.c.GamingFriendFinder.g();
    public InterfaceC2411u i;

    /* renamed from: com.facebook.gamingservices.l$a */
    /* loaded from: classes2.dex */
    public class a implements XT.c {
        public a() {
        }

        @Override // o.XT.c
        public void a(Y response) {
            if (C2350l.this.i != null) {
                if (response.g() != null) {
                    C2350l.this.i.b(new C2416z(response.g().h()));
                } else {
                    C2350l.this.i.a(new c());
                }
            }
        }
    }

    /* renamed from: com.facebook.gamingservices.l$b */
    /* loaded from: classes2.dex */
    public class b implements C2361f.a {
        public final /* synthetic */ InterfaceC2411u a;

        public b(final InterfaceC2411u val$callback) {
            this.a = val$callback;
        }

        @Override // com.facebook.internal.C2361f.a
        public boolean a(int resultCode, Intent data) {
            if (data != null && data.hasExtra("error")) {
                this.a.b(((com.facebook.C) data.getParcelableExtra("error")).q());
                return true;
            }
            this.a.a(new c());
            return true;
        }
    }

    /* renamed from: com.facebook.gamingservices.l$c */
    /* loaded from: classes2.dex */
    public static class c {
    }

    public C2350l(final Activity activity) {
        super(activity, j);
    }

    @Override // com.facebook.internal.AbstractC2368m, com.facebook.InterfaceC2413w
    /* renamed from: A */
    public void f(final Void content) {
        B();
    }

    public void B() {
        C0376a k = C0376a.k();
        if (k != null && !k.C()) {
            String h = k.h();
            if (C10169vE.f()) {
                Activity n = n();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", h);
                    jSONObject.put(C9998uW1.e0, "FRIEND_FINDER");
                    XT.m(n, jSONObject, aVar, EnumC10487wW1.OPEN_GAMING_SERVICES_DEEP_LINK);
                    return;
                } catch (JSONException unused) {
                    InterfaceC2411u interfaceC2411u = this.i;
                    if (interfaceC2411u != null) {
                        interfaceC2411u.b(new C2416z("Couldn't prepare Friend Finder Dialog"));
                        return;
                    }
                    return;
                }
            }
            x(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/friendfinder/" + h)), q());
            return;
        }
        throw new C2416z("Attempted to open GamingServices FriendFinder with an invalid access token");
    }

    @Override // com.facebook.internal.AbstractC2368m
    public C2357b m() {
        return null;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public List<AbstractC2368m<Void, c>.b> p() {
        return null;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(final C2361f callbackManager, final InterfaceC2411u<c> callback) {
        this.i = callback;
        callbackManager.b(q(), new b(callback));
    }

    public void z() {
        B();
    }

    public C2350l(final Fragment fragment) {
        super(new com.facebook.internal.I(fragment), j);
    }

    public C2350l(final androidx.fragment.app.Fragment fragment) {
        super(new com.facebook.internal.I(fragment), j);
    }
}
