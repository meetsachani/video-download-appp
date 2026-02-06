package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import o.C9998uW1;

/* loaded from: classes2.dex */
public final class zzbsg extends zzbsp {
    public final Map c;
    public final Context d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public zzbsg(zzcfb zzcfbVar, Map map) {
        super(zzcfbVar, "createCalendarEvent");
        this.c = map;
        this.d = zzcfbVar.i();
        this.e = l("description");
        this.h = l("summary");
        this.f = k("start_ticks");
        this.g = k("end_ticks");
        this.i = l(FirebaseAnalytics.Param.s);
    }

    public final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra(C9998uW1.Q, j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.d;
        if (context == null) {
            c("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.v();
        if (!new zzbcd(context).b()) {
            c("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.v();
        AlertDialog.Builder l = com.google.android.gms.ads.internal.util.zzs.l(context);
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f != null) {
            str = f.getString(R.string.s5);
        } else {
            str = "Create calendar event";
        }
        l.setTitle(str);
        if (f != null) {
            str2 = f.getString(R.string.s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        l.setMessage(str2);
        if (f != null) {
            str3 = f.getString(R.string.s3);
        } else {
            str3 = "Accept";
        }
        l.setPositiveButton(str3, new zzbse(this));
        if (f != null) {
            str4 = f.getString(R.string.s4);
        } else {
            str4 = "Decline";
        }
        l.setNegativeButton(str4, new zzbsf(this));
        l.create().show();
    }

    public final long k(String str) {
        String str2 = (String) this.c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String l(String str) {
        Map map = this.c;
        if (TextUtils.isEmpty((CharSequence) map.get(str))) {
            return "";
        }
        return (String) map.get(str);
    }
}
