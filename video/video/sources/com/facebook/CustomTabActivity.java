package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class CustomTabActivity extends Activity {
    public static final int Z = 2;
    @Nullable
    public BroadcastReceiver X;
    @NotNull
    public static final a Y = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final String Y0 = C6562gT0.C(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");
    @InterfaceC7058iW0
    @NotNull
    public static final String Z0 = C6562gT0.C(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, C9998uW1.R);
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(Y0);
            intent2.putExtra(CustomTabMainActivity.b1, getIntent().getDataString());
            C6200f21.b(this).d(intent2);
            b bVar = new b();
            C6200f21.b(this).c(bVar, new IntentFilter(Z0));
            this.X = bVar;
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(Y0);
        intent.putExtra(CustomTabMainActivity.b1, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.X;
        if (broadcastReceiver != null) {
            C6200f21.b(this).f(broadcastReceiver);
        }
        super.onDestroy();
    }
}
