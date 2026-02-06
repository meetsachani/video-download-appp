package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C2363h;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {
    public boolean X = true;
    @Nullable
    public BroadcastReceiver Y;
    @NotNull
    public static final a Z = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final String Y0 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
    @InterfaceC7058iW0
    @NotNull
    public static final String Z0 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
    @InterfaceC7058iW0
    @NotNull
    public static final String a1 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
    @InterfaceC7058iW0
    @NotNull
    public static final String b1 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
    @InterfaceC7058iW0
    @NotNull
    public static final String c1 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
    @InterfaceC7058iW0
    @NotNull
    public static final String d1 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
    @InterfaceC7058iW0
    @NotNull
    public static final String e1 = C6562gT0.C(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Bundle r0 = com.facebook.internal.l0.r0(parse.getQuery());
            r0.putAll(com.facebook.internal.l0.r0(parse.getFragment()));
            return r0;
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.facebook.login.L.valuesCustom().length];
            iArr[com.facebook.login.L.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, C9998uW1.R);
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.d1);
            String str = CustomTabMainActivity.b1;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    public final void a(int i, Intent intent) {
        Bundle bundle;
        BroadcastReceiver broadcastReceiver = this.Y;
        if (broadcastReceiver != null) {
            C6200f21.b(this).f(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(b1);
            if (stringExtra != null) {
                bundle = Z.b(stringExtra);
            } else {
                bundle = new Bundle();
            }
            com.facebook.internal.Z z = com.facebook.internal.Z.a;
            Intent intent2 = getIntent();
            C6562gT0.o(intent2, C9998uW1.R);
            Intent n = com.facebook.internal.Z.n(intent2, bundle, null);
            if (n != null) {
                intent = n;
            }
            setResult(i, intent);
        } else {
            com.facebook.internal.Z z2 = com.facebook.internal.Z.a;
            Intent intent3 = getIntent();
            C6562gT0.o(intent3, C9998uW1.R);
            setResult(i, com.facebook.internal.Z.n(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        C2363h c2363h;
        super.onCreate(bundle);
        String str = CustomTabActivity.Y0;
        if (C6562gT0.g(str, getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle != null || (stringExtra = getIntent().getStringExtra(Y0)) == null) {
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra(Z0);
            String stringExtra2 = getIntent().getStringExtra(a1);
            if (b.a[com.facebook.login.L.Y.a(getIntent().getStringExtra(c1)).ordinal()] == 1) {
                c2363h = new com.facebook.internal.P(stringExtra, bundleExtra);
            } else {
                c2363h = new C2363h(stringExtra, bundleExtra);
            }
            boolean c2 = c2363h.c(this, stringExtra2);
            this.X = false;
            if (!c2) {
                setResult(0, getIntent().putExtra(e1, true));
                finish();
                return;
            }
            c cVar = new c();
            this.Y = cVar;
            C6200f21.b(this).c(cVar, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        C6562gT0.p(intent, C9998uW1.R);
        super.onNewIntent(intent);
        if (C6562gT0.g(d1, intent.getAction())) {
            C6200f21.b(this).d(new Intent(CustomTabActivity.Z0));
            a(-1, intent);
        } else if (C6562gT0.g(CustomTabActivity.Y0, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.X) {
            a(0, null);
        }
        this.X = true;
    }
}
