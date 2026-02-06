package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
final class zae implements View.OnClickListener {
    public final /* synthetic */ Context X;
    public final /* synthetic */ Intent Y;

    public zae(Context context, Intent intent) {
        this.X = context;
        this.Y = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.X.startActivity(this.Y);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
