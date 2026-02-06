package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RolloutsStateFactory {
    public ConfigGetParameterHandler a;

    public RolloutsStateFactory(ConfigGetParameterHandler configGetParameterHandler) {
        this.a = configGetParameterHandler;
    }

    @InterfaceC5670cr1
    public static RolloutsStateFactory a(@InterfaceC5670cr1 ConfigGetParameterHandler configGetParameterHandler) {
        return new RolloutsStateFactory(configGetParameterHandler);
    }

    @InterfaceC5670cr1
    public RolloutsState b(@InterfaceC5670cr1 ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray j = configContainer.j();
        long k = configContainer.k();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject jSONObject = j.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.n);
                if (jSONArray.length() > 1) {
                    Log.w(FirebaseRemoteConfig.z, String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(this.a.o(optString)).e(k).a());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return RolloutsState.a(hashSet);
    }
}
