package o;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: o.xD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10654xD {
    public static final String a = "ClearKeyUtil";

    public static byte[] a(byte[] bArr) {
        if (TD2.a >= 27) {
            return bArr;
        }
        return TD2.G0(c(TD2.N(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (TD2.a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(TD2.N(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return TD2.G0(sb.toString());
        } catch (JSONException e) {
            I31.e(a, "Failed to adjust response data: " + TD2.N(bArr), e);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
