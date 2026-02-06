package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import java.util.List;
import o.InterfaceC4907Zh;

@InterfaceC4907Zh
/* renamed from: com.facebook.gamingservices.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2353o extends AbstractC2368m<Void, b> {
    public static final int i = C2361f.c.GamingGroupIntegration.g();
    public static final String j = "error";

    /* renamed from: com.facebook.gamingservices.o$a */
    /* loaded from: classes2.dex */
    public class a implements C2361f.a {
        public final /* synthetic */ InterfaceC2411u a;

        public a(final InterfaceC2411u val$callback) {
            this.a = val$callback;
        }

        @Override // com.facebook.internal.C2361f.a
        public boolean a(int resultCode, Intent data) {
            if (data != null && data.hasExtra("error")) {
                this.a.b(((com.facebook.C) data.getParcelableExtra("error")).q());
                return true;
            }
            this.a.a(new b());
            return true;
        }
    }

    /* renamed from: com.facebook.gamingservices.o$b */
    /* loaded from: classes2.dex */
    public static class b {
    }

    public C2353o(final Activity activity) {
        super(activity, i);
    }

    public void A() {
        x(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/community/" + com.facebook.M.o())), q());
    }

    @Override // com.facebook.internal.AbstractC2368m
    public C2357b m() {
        return null;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public List<AbstractC2368m<Void, b>.b> p() {
        return null;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(final C2361f callbackManager, final InterfaceC2411u<b> callback) {
        callbackManager.b(q(), new a(callback));
    }

    public void y() {
        A();
    }

    @Override // com.facebook.internal.AbstractC2368m, com.facebook.InterfaceC2413w
    /* renamed from: z */
    public void f(final Void content) {
        A();
    }

    public C2353o(final Fragment fragment) {
        super(new com.facebook.internal.I(fragment), i);
    }

    public C2353o(final androidx.fragment.app.Fragment fragment) {
        super(new com.facebook.internal.I(fragment), i);
    }
}
