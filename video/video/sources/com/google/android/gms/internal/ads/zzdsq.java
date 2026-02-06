package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdsq {
    public final Clock a;

    public zzdsq(Clock clock) {
        this.a = clock;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        String str3;
        if (!((Boolean) zzbex.a.e()).booleanValue()) {
            return;
        }
        long a = this.a.a();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(a);
            jsonWriter.name("source").value(str);
            jsonWriter.name("event").value(str2);
            jsonWriter.name("components").beginArray();
            for (Object obj : list) {
                jsonWriter.value(obj.toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    str3 = obj2.toString();
                } else {
                    str3 = null;
                }
                jsonWriter.value(str3);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("unable to log", e);
        }
        String valueOf = String.valueOf(stringWriter.toString());
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("AD-DBG ".concat(valueOf));
    }
}
