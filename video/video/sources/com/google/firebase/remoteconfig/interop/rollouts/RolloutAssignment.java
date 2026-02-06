package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC6615gi
@Encodable
/* loaded from: classes3.dex */
public abstract class RolloutAssignment {
    public static final String a = "rolloutId";
    public static final String b = "variantId";
    public static final String c = "parameterKey";
    public static final String d = "parameterValue";
    public static final String e = "templateVersion";
    public static final DataEncoder f = new JsonDataEncoderBuilder().k(AutoRolloutAssignmentEncoder.b).j();

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract RolloutAssignment a();

        @InterfaceC5670cr1
        public abstract Builder b(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder c(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder d(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder e(long j);

        @InterfaceC5670cr1
        public abstract Builder f(@InterfaceC5670cr1 String str);
    }

    @InterfaceC5670cr1
    public static Builder a() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    @InterfaceC5670cr1
    public static RolloutAssignment b(@InterfaceC5670cr1 String str) throws JSONException {
        return c(new JSONObject(str));
    }

    @InterfaceC5670cr1
    public static RolloutAssignment c(@InterfaceC5670cr1 JSONObject jSONObject) throws JSONException {
        return a().d(jSONObject.getString("rolloutId")).f(jSONObject.getString("variantId")).b(jSONObject.getString(c)).c(jSONObject.getString(d)).e(jSONObject.getLong("templateVersion")).a();
    }

    @InterfaceC5670cr1
    public abstract String d();

    @InterfaceC5670cr1
    public abstract String e();

    @InterfaceC5670cr1
    public abstract String f();

    public abstract long g();

    @InterfaceC5670cr1
    public abstract String h();
}
