package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import o.C6562gT0;
import o.C9998uW1;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b0 {
    @NotNull
    public static final b0 a = new b0();
    @NotNull
    public static final ConcurrentHashMap<String, JSONObject> b = new ConcurrentHashMap<>();

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject a(@NotNull String str) {
        C6562gT0.p(str, C9998uW1.m);
        return b.get(str);
    }

    @InterfaceC9511sW0
    public static final void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        C6562gT0.p(str, "key");
        C6562gT0.p(jSONObject, "value");
        b.put(str, jSONObject);
    }
}
