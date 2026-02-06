package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import o.InterfaceC6615gi;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC6615gi
@Encodable
/* loaded from: classes3.dex */
public abstract class RolloutAssignment {
    public static final int a = 256;
    public static final DataEncoder b = new JsonDataEncoderBuilder().k(AutoRolloutAssignmentEncoder.b).j();

    public static RolloutAssignment a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString(com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.c), jSONObject.getString(com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.d), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static RolloutAssignment b(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_RolloutAssignment(str, str2, i(str3), str4, j);
    }

    public static String i(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public CrashlyticsReport.Session.Event.RolloutAssignment h() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.a().d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
