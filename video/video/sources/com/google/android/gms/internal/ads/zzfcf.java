package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.facebook.S;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C3771Nr1;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfcf {
    public final List a;
    public final zzfbx b;
    public final List c;
    @InterfaceC11300zs1
    public final Bundle d;

    public zzfcf(JsonReader jsonReader, @InterfaceC11300zs1 Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.d = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && bundle != null) {
            bundle.putLong(zzdrl.SERVER_RESPONSE_PARSE_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfbx zzfbxVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        list = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            list.add(new zzfbu(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfbxVar = new zzfbx(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r2)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdrl.NORMALIZATION_AD_RESPONSE_START.e(), zzfbxVar.s);
                            bundle.putLong(zzdrl.NORMALIZATION_AD_RESPONSE_END.e(), zzfbxVar.t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals(C3771Nr1.A.y)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if (S.R.equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfce(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.c = arrayList;
        this.a = list;
        this.b = zzfbxVar == null ? new zzfbx(new JsonReader(new StringReader("{}"))) : zzfbxVar;
    }

    public static zzfcf a(Reader reader, @InterfaceC11300zs1 Bundle bundle) throws zzfby {
        try {
            try {
                return new zzfcf(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new zzfby("unable to parse ServerResponse", e);
            }
        } finally {
            IOUtils.b(reader);
        }
    }
}
