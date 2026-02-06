package o;

import java.io.UnsupportedEncodingException;
import o.DT1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JV0 extends QV0<JSONObject> {
    public JV0(String str, DT1.b<JSONObject> bVar, DT1.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // o.QV0, o.AbstractC5091aS1
    public DT1<JSONObject> P(C3470Kp1 c3470Kp1) {
        try {
            return DT1.c(new JSONObject(new String(c3470Kp1.b, C11161zI0.g(c3470Kp1.c, QV0.q1))), C11161zI0.e(c3470Kp1));
        } catch (UnsupportedEncodingException e) {
            return DT1.a(new C3306Iy1(e));
        } catch (JSONException e2) {
            return DT1.a(new C3306Iy1(e2));
        }
    }

    @Deprecated
    public JV0(String str, JSONObject jSONObject, DT1.b<JSONObject> bVar, DT1.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public JV0(int i, String str, JSONObject jSONObject, DT1.b<JSONObject> bVar, DT1.a aVar) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
