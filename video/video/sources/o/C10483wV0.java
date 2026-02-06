package o;

import java.io.UnsupportedEncodingException;
import o.DT1;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: o.wV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10483wV0 extends QV0<JSONArray> {
    public C10483wV0(String str, DT1.b<JSONArray> bVar, DT1.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // o.QV0, o.AbstractC5091aS1
    public DT1<JSONArray> P(C3470Kp1 c3470Kp1) {
        try {
            return DT1.c(new JSONArray(new String(c3470Kp1.b, C11161zI0.g(c3470Kp1.c, QV0.q1))), C11161zI0.e(c3470Kp1));
        } catch (UnsupportedEncodingException e) {
            return DT1.a(new C3306Iy1(e));
        } catch (JSONException e2) {
            return DT1.a(new C3306Iy1(e2));
        }
    }

    public C10483wV0(int i, String str, JSONArray jSONArray, DT1.b<JSONArray> bVar, DT1.a aVar) {
        super(i, str, jSONArray != null ? jSONArray.toString() : null, bVar, aVar);
    }
}
