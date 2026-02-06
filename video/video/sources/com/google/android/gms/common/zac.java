package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zac extends zaq {
    public final Context a;
    public final /* synthetic */ GoogleApiAvailability b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        super(r1);
        Looper myLooper;
        this.b = googleApiAvailability;
        if (Looper.myLooper() == null) {
            myLooper = Looper.getMainLooper();
        } else {
            myLooper = Looper.myLooper();
        }
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int j = this.b.j(this.a);
        if (this.b.o(j)) {
            this.b.C(this.a, j);
        }
    }
}
