package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzdrl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.C9998uW1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbk {
    public final String a;
    public String b;
    @InterfaceC11300zs1
    public zzbvl d;
    @InterfaceC11300zs1
    public Bundle e;
    public long g;
    public long h;
    @InterfaceC11300zs1
    public String c = null;
    public Bundle f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzbk(JsonReader jsonReader, @InterfaceC11300zs1 zzbvl zzbvlVar) throws IOException {
        Bundle bundle;
        char c;
        this.g = -1L;
        this.h = -1L;
        this.d = zzbvlVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals(C9998uW1.t0)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            jsonReader.skipValue();
                        } else {
                            this.h = jsonReader.nextLong();
                        }
                    } else {
                        this.g = jsonReader.nextLong();
                    }
                } else {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        this.a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && zzbvlVar != null && (bundle = zzbvlVar.h1) != null) {
            bundle.putLong(zzdrl.GET_SIGNALS_SDKCORE_START.e(), this.g);
            zzbvlVar.h1.putLong(zzdrl.GET_SIGNALS_SDKCORE_END.e(), this.h);
        }
    }
}
