package com.google.firebase.remoteconfig;

import java.util.Set;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class ConfigUpdate {
    @InterfaceC5670cr1
    public static ConfigUpdate a(@InterfaceC5670cr1 Set<String> set) {
        return new AutoValue_ConfigUpdate(set);
    }

    @InterfaceC5670cr1
    public abstract Set<String> b();
}
