package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_RolloutsState extends RolloutsState {
    public final Set<RolloutAssignment> a;

    public AutoValue_RolloutsState(Set<RolloutAssignment> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    @InterfaceC5670cr1
    public Set<RolloutAssignment> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.a.equals(((RolloutsState) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
