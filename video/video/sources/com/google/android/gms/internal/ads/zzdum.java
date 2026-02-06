package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdum {
    public final Context a;
    public final ApplicationInfo b;
    public String e = "";
    public final int c = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w9)).intValue();
    public final int d = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x9)).intValue();

    public zzdum(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.a;
            String str2 = this.b.packageName;
            zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
            jSONObject.put("name", Wrappers.a(context).d(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.b.packageName);
        com.google.android.gms.ads.internal.zzv.v();
        Drawable drawable = null;
        try {
            str = com.google.android.gms.ads.internal.util.zzs.W(this.a);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.e.isEmpty()) {
            try {
                drawable = Wrappers.a(this.a).e(this.b.packageName).b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                int i = this.c;
                int i2 = this.d;
                drawable.setBounds(0, 0, i, i2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = encodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", this.c);
            jSONObject.put("iconHeightPx", this.d);
        }
        return jSONObject;
    }
}
