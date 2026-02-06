package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbsm extends zzbsp {
    public final Map c;
    public final Context d;

    public zzbsm(zzcfb zzcfbVar, Map map) {
        super(zzcfbVar, "storePicture");
        this.c = map;
        this.d = zzcfbVar.i();
    }

    public final void i() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.d;
        if (context == null) {
            c("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.v();
        if (!new zzbcd(context).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.c.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            c("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.zzv.v();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources f = com.google.android.gms.ads.internal.zzv.t().f();
                com.google.android.gms.ads.internal.zzv.v();
                AlertDialog.Builder l = com.google.android.gms.ads.internal.util.zzs.l(context);
                if (f != null) {
                    str = f.getString(R.string.s1);
                } else {
                    str = "Save image";
                }
                l.setTitle(str);
                if (f != null) {
                    str2 = f.getString(R.string.s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                l.setMessage(str2);
                if (f != null) {
                    str3 = f.getString(R.string.s3);
                } else {
                    str3 = "Accept";
                }
                l.setPositiveButton(str3, new zzbsk(this, str5, lastPathSegment));
                if (f != null) {
                    str4 = f.getString(R.string.s4);
                } else {
                    str4 = "Decline";
                }
                l.setNegativeButton(str4, new zzbsl(this));
                l.create().show();
                return;
            }
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            c("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
