package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class RolloutsState {
    @InterfaceC5670cr1
    public static RolloutsState a(@InterfaceC5670cr1 Set<RolloutAssignment> set) {
        return new AutoValue_RolloutsState(set);
    }

    @InterfaceC5670cr1
    public abstract Set<RolloutAssignment> b();
}
